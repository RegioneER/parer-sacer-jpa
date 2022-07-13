package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.*;
import it.eng.parer.entity.converter.NeverendingDateConverter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/**
 * The persistent class for the FIR_CERTIF_CA database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "FIR_CERTIF_CA")
public class FirCertifCa implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idCertifCa;
    private List<FirUrlDistribCrl> firUrlDistribCrls;
    private List<FirUrlDistribOcsp> firUrlDistribOcsps;
    private Date dtFinValCertifCa;
    private Date dtIniValCertifCa;
    private BigDecimal niSerialCertifCa;
    private List<FirCertifFirmatario> firCertifFirmatarios;
    private List<FirCrl> firCrls;
    private List<FirCertifOcsp> firCertifOcsps;
    private FirFilePerFirma firFilePerFirma;
    private String dsSubjectKeyId;
    private String dlDnIssuerCertifCa;
    private String dlDnSubjectCertifCa;

    public FirCertifCa() {
    }

    @Id
    @SequenceGenerator(name = "FIR_CERTIF_CA_IDCERTIFCA_GENERATOR", sequenceName = "SFIR_CERTIF_CA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FIR_CERTIF_CA_IDCERTIFCA_GENERATOR")
    @Column(name = "ID_CERTIF_CA")
    public long getIdCertifCa() {
        return this.idCertifCa;
    }

    public void setIdCertifCa(long idCertifCa) {
        this.idCertifCa = idCertifCa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIN_VAL_CERTIF_CA")
    public Date getDtFinValCertifCa() {
        return this.dtFinValCertifCa;
    }

    public void setDtFinValCertifCa(Date dtFinValCertifCa) {
        this.dtFinValCertifCa = dtFinValCertifCa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL_CERTIF_CA")
    public Date getDtIniValCertifCa() {
        return this.dtIniValCertifCa;
    }

    public void setDtIniValCertifCa(Date dtIniValCertifCa) {
        this.dtIniValCertifCa = dtIniValCertifCa;
    }

    @Column(name = "NI_SERIAL_CERTIF_CA")
    public BigDecimal getNiSerialCertifCa() {
        return this.niSerialCertifCa;
    }

    public void setNiSerialCertifCa(BigDecimal niSerialCertifCa) {
        this.niSerialCertifCa = niSerialCertifCa;
    }

    @Column(name = "DS_SUBJECT_KEY_ID")
    public String getDsSubjectKeyId() {
        return dsSubjectKeyId;
    }

    public void setDsSubjectKeyId(String dsSubjectKeyId) {
        this.dsSubjectKeyId = dsSubjectKeyId;
    }

    @Column(name = "DL_DN_ISSUER_CERTIF_CA")
    public String getDlDnIssuerCertifCa() {
        return dlDnIssuerCertifCa;
    }

    public void setDlDnIssuerCertifCa(String dlDnIssuerCertifCa) {
        this.dlDnIssuerCertifCa = dlDnIssuerCertifCa;
    }

    @Column(name = "DL_DN_SUBJECT_CERTIF_CA")
    public String getDlDnSubjectCertifCa() {
        return dlDnSubjectCertifCa;
    }

    public void setDlDnSubjectCertifCa(String dlDnSubjectCertifCa) {
        this.dlDnSubjectCertifCa = dlDnSubjectCertifCa;
    }

    // bi-directional many-to-one association to FirCertifFirmatario
    @OneToMany(mappedBy = "firCertifCa", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<FirCertifFirmatario> getFirCertifFirmatarios() {
        return this.firCertifFirmatarios;
    }

    public void setFirCertifFirmatarios(List<FirCertifFirmatario> firCertifFirmatarios) {
        this.firCertifFirmatarios = firCertifFirmatarios;
    }

    // bi-directional many-to-one association to FirCrl
    @OneToMany(mappedBy = "firCertifCa", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<FirCrl> getFirCrls() {
        return this.firCrls;
    }

    public void setFirCrls(List<FirCrl> firCrls) {
        this.firCrls = firCrls;
    }

    // bi-directional many-to-one association to FirCrl
    @OneToMany(mappedBy = "firCertifCa", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<FirCertifOcsp> getFirCertifOcsps() {
        return this.firCertifOcsps;
    }

    public void setFirCertifOcsps(List<FirCertifOcsp> firCertifOcsps) {
        this.firCertifOcsps = firCertifOcsps;
    }

    // bi-directional one-to-one association to FirFilePerFirma
    @OneToOne(mappedBy = "firCertifCa", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH }, fetch = FetchType.LAZY)
    public FirFilePerFirma getFirFilePerFirma() {
        return this.firFilePerFirma;
    }

    public void setFirFilePerFirma(FirFilePerFirma firFilePerFirma) {
        this.firFilePerFirma = firFilePerFirma;
    }

    // bi-directional many-to-one association to FirUrlDistribCrl
    @OneToMany(mappedBy = "firCertifCa", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<FirUrlDistribCrl> getFirUrlDistribCrls() {
        return this.firUrlDistribCrls;
    }

    public void setFirUrlDistribCrls(List<FirUrlDistribCrl> firUrlDistribCrls) {
        this.firUrlDistribCrls = firUrlDistribCrls;
    }

    // bi-directional many-to-one association to FirUrlDistribCrl
    @OneToMany(mappedBy = "firCertifCa", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<FirUrlDistribOcsp> getFirUrlDistribOcsps() {
        return this.firUrlDistribOcsps;
    }

    public void setFirUrlDistribOcsps(List<FirUrlDistribOcsp> firUrlDistribOcsps) {
        this.firUrlDistribOcsps = firUrlDistribOcsps;
    }

    /**
     * Secondo specifica RFC5280 https://tools.ietf.org/html/rfc5280#section-5.1.2.5 le date sarebbero normalemente
     * espresse in UTC/GMT Il sistema però persistente con il TZ locale (ossia GMT+01), esiste un caso "particolare" di
     * timestamp : 9999/31/12 23:59:59 UTC che per un hard limit di ORACLE DB non può essere persisto (la sua
     * conversione in GMT+01 lo trasforma in 10000/01/01 00:59:59 GMT+01) che non può essere persistito e/o letto
     */
    @PrePersist
    void preInsert() {
        this.dtFinValCertifCa = NeverendingDateConverter.verifyOverZoneId(this.dtFinValCertifCa,
                TimeZone.getTimeZone("UTC").toZoneId());
    }

    @PreUpdate
    void preUpdate() {
        this.dtFinValCertifCa = NeverendingDateConverter.verifyOverZoneId(this.dtFinValCertifCa,
                TimeZone.getTimeZone("UTC").toZoneId());

    }
}
