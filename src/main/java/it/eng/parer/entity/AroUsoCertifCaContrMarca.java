package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_USO_CERTIF_CA_CONTR_MARCA database table.
 * 
 */
@Entity
@Table(name = "ARO_USO_CERTIF_CA_CONTR_MARCA")
public class AroUsoCertifCaContrMarca implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUsoCertifCaContrMarca;
    private BigDecimal pgCertifCa;
    private AroContrMarcaComp aroContrMarcaComp;
    private FirCertifCa firCertifCa;
    private FirCrl firCrl;
    private FirOcsp firOcsp;

    public AroUsoCertifCaContrMarca() {
    }

    @Id
    @SequenceGenerator(name = "ARO_USO_CERTIF_CA_CONTR_MARCA_IDUSOCERTIFCACONTRMARCA_GENERATOR", sequenceName = "SARO_USO_CERTIF_CA_CONTR_MARCA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_USO_CERTIF_CA_CONTR_MARCA_IDUSOCERTIFCACONTRMARCA_GENERATOR")
    @Column(name = "ID_USO_CERTIF_CA_CONTR_MARCA")
    public long getIdUsoCertifCaContrMarca() {
        return this.idUsoCertifCaContrMarca;
    }

    public void setIdUsoCertifCaContrMarca(long idUsoCertifCaContrMarca) {
        this.idUsoCertifCaContrMarca = idUsoCertifCaContrMarca;
    }

    @Column(name = "PG_CERTIF_CA")
    public BigDecimal getPgCertifCa() {
        return this.pgCertifCa;
    }

    public void setPgCertifCa(BigDecimal pgCertifCa) {
        this.pgCertifCa = pgCertifCa;
    }

    // bi-directional many-to-one association to AroContrMarcaComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTR_MARCA_COMP")
    public AroContrMarcaComp getAroContrMarcaComp() {
        return this.aroContrMarcaComp;
    }

    public void setAroContrMarcaComp(AroContrMarcaComp aroContrMarcaComp) {
        this.aroContrMarcaComp = aroContrMarcaComp;
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