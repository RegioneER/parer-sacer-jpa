package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the ARO_CONTR_FIRMA_COMP database table.
 * 
 */
@Entity
@Table(name = "ARO_CONTR_FIRMA_COMP")
public class AroContrFirmaComp implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idContrFirmaComp;
    private String dsMsgEsitoContrFirma;
    private String tiContr;
    private String tiEsitoContrFirma;
    private AroFirmaComp aroFirmaComp;
    private FirCrl firCrl;
    private FirOcsp firOcsp;
    private List<AroUsoCertifCaContrComp> aroUsoCertifCaContrComps;

    public AroContrFirmaComp() {
    }

    @Id
    @SequenceGenerator(name = "ARO_CONTR_FIRMA_COMP_IDCONTRFIRMACOMP_GENERATOR", sequenceName = "SARO_CONTR_FIRMA_COMP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_CONTR_FIRMA_COMP_IDCONTRFIRMACOMP_GENERATOR")
    @Column(name = "ID_CONTR_FIRMA_COMP")
    public long getIdContrFirmaComp() {
        return this.idContrFirmaComp;
    }

    public void setIdContrFirmaComp(long idContrFirmaComp) {
        this.idContrFirmaComp = idContrFirmaComp;
    }

    @Column(name = "DS_MSG_ESITO_CONTR_FIRMA")
    public String getDsMsgEsitoContrFirma() {
        return this.dsMsgEsitoContrFirma;
    }

    public void setDsMsgEsitoContrFirma(String dsMsgEsitoContrFirma) {
        this.dsMsgEsitoContrFirma = dsMsgEsitoContrFirma;
    }

    @Column(name = "TI_CONTR")
    public String getTiContr() {
        return this.tiContr;
    }

    public void setTiContr(String tiContr) {
        this.tiContr = tiContr;
    }

    @Column(name = "TI_ESITO_CONTR_FIRMA")
    public String getTiEsitoContrFirma() {
        return this.tiEsitoContrFirma;
    }

    public void setTiEsitoContrFirma(String tiEsitoContrFirma) {
        this.tiEsitoContrFirma = tiEsitoContrFirma;
    }

    // bi-directional many-to-one association to AroFirmaComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FIRMA_COMP")
    public AroFirmaComp getAroFirmaComp() {
        return this.aroFirmaComp;
    }

    public void setAroFirmaComp(AroFirmaComp aroFirmaComp) {
        this.aroFirmaComp = aroFirmaComp;
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

    // bi-directional many-to-one association to AroUsoCertifCaContrComp
    @OneToMany(mappedBy = "aroContrFirmaComp", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
    public List<AroUsoCertifCaContrComp> getAroUsoCertifCaContrComps() {
        return this.aroUsoCertifCaContrComps;
    }

    public void setAroUsoCertifCaContrComps(List<AroUsoCertifCaContrComp> aroUsoCertifCaContrComps) {
        this.aroUsoCertifCaContrComps = aroUsoCertifCaContrComps;
    }

}