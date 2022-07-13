package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_USO_CERTIF_CA_CONTR_COMP database table.
 * 
 */
@Entity
@Table(name = "ARO_USO_CERTIF_CA_CONTR_COMP")
public class AroUsoCertifCaContrComp implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUsoCertifCaContrComp;
    private BigDecimal pgCertifCa;
    private AroContrFirmaComp aroContrFirmaComp;
    private FirCertifCa firCertifCa;
    private FirCrl firCrl;
    private FirOcsp firOcsp;

    public AroUsoCertifCaContrComp() {
    }

    @Id
    @SequenceGenerator(name = "ARO_USO_CERTIF_CA_CONTR_COMP_IDUSOCERTIFCACONTRCOMP_GENERATOR", sequenceName = "SARO_USO_CERTIF_CA_CONTR_COMP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_USO_CERTIF_CA_CONTR_COMP_IDUSOCERTIFCACONTRCOMP_GENERATOR")
    @Column(name = "ID_USO_CERTIF_CA_CONTR_COMP")
    public long getIdUsoCertifCaContrComp() {
        return this.idUsoCertifCaContrComp;
    }

    public void setIdUsoCertifCaContrComp(long idUsoCertifCaContrComp) {
        this.idUsoCertifCaContrComp = idUsoCertifCaContrComp;
    }

    @Column(name = "PG_CERTIF_CA")
    public BigDecimal getPgCertifCa() {
        return this.pgCertifCa;
    }

    public void setPgCertifCa(BigDecimal pgCertifCa) {
        this.pgCertifCa = pgCertifCa;
    }

    // bi-directional many-to-one association to AroContrFirmaComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTR_FIRMA_COMP")
    public AroContrFirmaComp getAroContrFirmaComp() {
        return this.aroContrFirmaComp;
    }

    public void setAroContrFirmaComp(AroContrFirmaComp aroContrFirmaComp) {
        this.aroContrFirmaComp = aroContrFirmaComp;
    }

    // uni-directional many-to-one association to FirCertifCa
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CERTIF_CA")
    public FirCertifCa getFirCertifCa() {
        return this.firCertifCa;
    }

    public void setFirCertifCa(FirCertifCa firCertifCa) {
        this.firCertifCa = firCertifCa;
    }

    // uni-directional many-to-one association to FirCrl
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CRL_USATA")
    public FirCrl getFirCrl() {
        return this.firCrl;
    }

    public void setFirCrl(FirCrl firCrl) {
        this.firCrl = firCrl;
    }

    // uni-directional many-to-one association to FirCrl
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_OCSP_USATA")
    public FirOcsp getFirOcsp() {
        return this.firOcsp;
    }

    public void setFirOcsp(FirOcsp firOcsp) {
        this.firOcsp = firOcsp;
    }
}