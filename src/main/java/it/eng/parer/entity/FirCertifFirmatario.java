package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the FIR_CERTIF_FIRMATARIO database table.
 * 
 */
@Entity
@Cacheable(true)
@Table(name = "FIR_CERTIF_FIRMATARIO")
public class FirCertifFirmatario implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idCertifFirmatario;
    private Date dtFinValCertifFirmatario;
    private Date dtIniValCertifFirmatario;
    private BigDecimal niSerialCertifFirmatario;
    private FirCertifCa firCertifCa;
    private FirFilePerFirma firFilePerFirma;

    public FirCertifFirmatario() {
    }

    @Id
    @SequenceGenerator(name = "FIR_CERTIF_FIRMATARIO_IDCERTIFFIRMATARIO_GENERATOR", sequenceName = "SFIR_CERTIF_FIRMATARIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FIR_CERTIF_FIRMATARIO_IDCERTIFFIRMATARIO_GENERATOR")
    @Column(name = "ID_CERTIF_FIRMATARIO")
    public long getIdCertifFirmatario() {
        return this.idCertifFirmatario;
    }

    public void setIdCertifFirmatario(long idCertifFirmatario) {
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