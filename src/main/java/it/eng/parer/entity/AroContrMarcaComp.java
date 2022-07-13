package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the ARO_CONTR_MARCA_COMP database table.
 * 
 */
@Entity
@Table(name = "ARO_CONTR_MARCA_COMP")
public class AroContrMarcaComp implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idContrMarcaComp;
    private String dsMsgEsitoContrMarca;
    private String tiContr;
    private String tiEsitoContrMarca;
    private AroMarcaComp aroMarcaComp;
    private FirCrl firCrl;
    private FirOcsp firOcsp;
    private List<AroUsoCertifCaContrMarca> aroUsoCertifCaContrMarcas;

    public AroContrMarcaComp() {
    }

    @Id
    @SequenceGenerator(name = "ARO_CONTR_MARCA_COMP_IDCONTRMARCACOMP_GENERATOR", sequenceName = "SARO_CONTR_MARCA_COMP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_CONTR_MARCA_COMP_IDCONTRMARCACOMP_GENERATOR")
    @Column(name = "ID_CONTR_MARCA_COMP")
    public long getIdContrMarcaComp() {
        return this.idContrMarcaComp;
    }

    public void setIdContrMarcaComp(long idContrMarcaComp) {
        this.idContrMarcaComp = idContrMarcaComp;
    }

    @Column(name = "DS_MSG_ESITO_CONTR_MARCA")
    public String getDsMsgEsitoContrMarca() {
        return this.dsMsgEsitoContrMarca;
    }

    public void setDsMsgEsitoContrMarca(String dsMsgEsitoContrMarca) {
        this.dsMsgEsitoContrMarca = dsMsgEsitoContrMarca;
    }

    @Column(name = "TI_CONTR")
    public String getTiContr() {
        return this.tiContr;
    }

    public void setTiContr(String tiContr) {
        this.tiContr = tiContr;
    }

    @Column(name = "TI_ESITO_CONTR_MARCA")
    public String getTiEsitoContrMarca() {
        return this.tiEsitoContrMarca;
    }

    public void setTiEsitoContrMarca(String tiEsitoContrMarca) {
        this.tiEsitoContrMarca = tiEsitoContrMarca;
    }

    // bi-directional many-to-one association to AroMarcaComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MARCA_COMP")
    public AroMarcaComp getAroMarcaComp() {
        return this.aroMarcaComp;
    }

    public void setAroMarcaComp(AroMarcaComp aroMarcaComp) {
        this.aroMarcaComp = aroMarcaComp;
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

    // bi-directional many-to-one association to AroUsoCertifCaContrMarca
    @OneToMany(mappedBy = "aroContrMarcaComp", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroUsoCertifCaContrMarca> getAroUsoCertifCaContrMarcas() {
        return this.aroUsoCertifCaContrMarcas;
    }

    public void setAroUsoCertifCaContrMarcas(List<AroUsoCertifCaContrMarca> aroUsoCertifCaContrMarcas) {
        this.aroUsoCertifCaContrMarcas = aroUsoCertifCaContrMarcas;
    }

}