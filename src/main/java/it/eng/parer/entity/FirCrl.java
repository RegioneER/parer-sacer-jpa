package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import it.eng.parer.entity.converter.NeverendingDateConverter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.TimeZone;

/**
 * The persistent class for the FIR_CRL database table.
 * 
 */
@Entity
@Cacheable(true)
@Table(name = "FIR_CRL")
public class FirCrl implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idCrl;
    private Date dtIniCrl;
    private Date dtScadCrl;
    private BigDecimal niSerialCrl;
    private FirCertifCa firCertifCa;
    private FirFilePerFirma firFilePerFirma;

    public FirCrl() {
    }

    @Id
    @SequenceGenerator(name = "FIR_CRL_IDCRL_GENERATOR", sequenceName = "SFIR_CRL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FIR_CRL_IDCRL_GENERATOR")
    @Column(name = "ID_CRL")
    public long getIdCrl() {
        return this.idCrl;
    }

    public void setIdCrl(long idCrl) {
        this.idCrl = idCrl;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_CRL")
    public Date getDtIniCrl() {
        return this.dtIniCrl;
    }

    public void setDtIniCrl(Date dtIniCrl) {
        this.dtIniCrl = dtIniCrl;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SCAD_CRL")
    public Date getDtScadCrl() {
        return this.dtScadCrl;
    }

    public void setDtScadCrl(Date dtScadCrl) {
        this.dtScadCrl = dtScadCrl;
    }

    @Column(name = "NI_SERIAL_CRL")
    public BigDecimal getNiSerialCrl() {
        return this.niSerialCrl;
    }

    public void setNiSerialCrl(BigDecimal niSerialCrl) {
        this.niSerialCrl = niSerialCrl;
    }

    // bi-directional many-to-one association to FirCertifCa
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CERTIF_CA")
    public FirCertifCa getFirCertifCa() {
        return this.firCertifCa;
    }

    public void setFirCertifCa(FirCertifCa firCertifCa) {
        this.firCertifCa = firCertifCa;
    }

    // bi-directional one-to-one association to FirFilePerFirma
    @OneToOne(mappedBy = "firCrl", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH }, fetch = FetchType.LAZY)
    public FirFilePerFirma getFirFilePerFirma() {
        return this.firFilePerFirma;
    }

    public void setFirFilePerFirma(FirFilePerFirma firFilePerFirma) {
        this.firFilePerFirma = firFilePerFirma;
    }

    /**
     * Secondo specifica RFC5280 https://tools.ietf.org/html/rfc5280#section-5.1.2.5 le date sarebbero normalemente
     * espresse in UTC/GMT Il sistema però persistente con il TZ locale (ossia GMT+01), esiste un caso "particolare" di
     * timestamp : 9999/31/12 23:59:59 UTC che per un hard limit di ORACLE DB non può essere persisto (la sua
     * conversione in GMT+01 lo trasforma in 10000/01/01 00:59:59 GMT+01) che non può essere persistito e/o letto
     */
    @PrePersist
    void preInsert() {
        this.dtScadCrl = NeverendingDateConverter.verifyOverZoneId(this.dtScadCrl,
                TimeZone.getTimeZone("UTC").toZoneId());
    }

    @PreUpdate
    void preUpdate() {
        this.dtScadCrl = NeverendingDateConverter.verifyOverZoneId(this.dtScadCrl,
                TimeZone.getTimeZone("UTC").toZoneId());
    }

}