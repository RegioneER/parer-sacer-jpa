package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the FIR_CERTIF_FIRMATARIO database table.
 */
@Entity
@Cacheable(true)
@Table(name = "FIR_CERTIF_FIRMATARIO")
public class FirCertifFirmatario implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idCertifFirmatario;

    private Date dtFinValCertifFirmatario;

    private Date dtIniValCertifFirmatario;

    private BigDecimal niSerialCertifFirmatario;

    private FirCertifCa firCertifCa;

    private FirFilePerFirma firFilePerFirma;

    public FirCertifFirmatario() {/* Hibernate */
    }

    @Id
    // "FIR_CERTIF_FIRMATARIO_IDCERTIFFIRMATARIO_GENERATOR",
    // sequenceName = "SFIR_CERTIF_FIRMATARIO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "FIR_CERTIF_FIRMATARIO_IDCERTIFFIRMATARIO_GENERATOR")
    @Column(name = "ID_CERTIF_FIRMATARIO")
    @GenericGenerator(name = "SFIR_CERTIF_FIRMATARIO_ID_CERTIF_FIRMATARIO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFIR_CERTIF_FIRMATARIO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFIR_CERTIF_FIRMATARIO_ID_CERTIF_FIRMATARIO_GENERATOR")
    public Long getIdCertifFirmatario() {
        return this.idCertifFirmatario;
    }

    public void setIdCertifFirmatario(Long idCertifFirmatario) {
        this.idCertifFirmatario = idCertifFirmatario;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIN_VAL_CERTIF_FIRMATARIO")
    public Date getDtFinValCertifFirmatario() {
        return this.dtFinValCertifFirmatario;
    }

    public void setDtFinValCertifFirmatario(Date dtFinValCertifFirmatario) {
        this.dtFinValCertifFirmatario = dtFinValCertifFirmatario;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL_CERTIF_FIRMATARIO")
    public Date getDtIniValCertifFirmatario() {
        return this.dtIniValCertifFirmatario;
    }

    public void setDtIniValCertifFirmatario(Date dtIniValCertifFirmatario) {
        this.dtIniValCertifFirmatario = dtIniValCertifFirmatario;
    }

    @Column(name = "NI_SERIAL_CERTIF_FIRMATARIO")
    public BigDecimal getNiSerialCertifFirmatario() {
        return this.niSerialCertifFirmatario;
    }

    public void setNiSerialCertifFirmatario(BigDecimal niSerialCertifFirmatario) {
        this.niSerialCertifFirmatario = niSerialCertifFirmatario;
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
    @OneToOne(mappedBy = "firCertifFirmatario", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH }, fetch = FetchType.LAZY)
    public FirFilePerFirma getFirFilePerFirma() {
        return this.firFilePerFirma;
    }

    public void setFirFilePerFirma(FirFilePerFirma firFilePerFirma) {
        this.firFilePerFirma = firFilePerFirma;
    }

}
