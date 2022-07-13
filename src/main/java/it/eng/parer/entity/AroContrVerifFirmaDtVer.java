package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_CONTR_VERIF_FIRMA_DT_VERS database table.
 *
 */
@Entity
@Table(name = "ARO_CONTR_VERIF_FIRMA_DT_VERS")
@NamedQuery(name = "AroContrVerifFirmaDtVer.findAll", query = "SELECT a FROM AroContrVerifFirmaDtVer a")
public class AroContrVerifFirmaDtVer implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idContrVerifFirmaDtVers;
    private String dsMsgContrVerif;
    private FirCrl firCrl;
    private FirOcsp firOcsp;
    private String tiContr;
    private String tiEsitoContrVerif;
    private AroVerifFirmaDtVer aroVerifFirmaDtVer;

    public AroContrVerifFirmaDtVer() {
    }

    @Id
    @SequenceGenerator(name = "ARO_CONTR_VERIF_FIRMA_DT_VERS_IDCONTRVERIFFIRMADTVERS_GENERATOR", sequenceName = "SARO_CONTR_VERIF_FIRMA_DT_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_CONTR_VERIF_FIRMA_DT_VERS_IDCONTRVERIFFIRMADTVERS_GENERATOR")
    @Column(name = "ID_CONTR_VERIF_FIRMA_DT_VERS")
    public long getIdContrVerifFirmaDtVers() {
        return this.idContrVerifFirmaDtVers;
    }

    public void setIdContrVerifFirmaDtVers(long idContrVerifFirmaDtVers) {
        this.idContrVerifFirmaDtVers = idContrVerifFirmaDtVers;
    }

    @Column(name = "DS_MSG_CONTR_VERIF")
    public String getDsMsgContrVerif() {
        return this.dsMsgContrVerif;
    }

    public void setDsMsgContrVerif(String dsMsgContrVerif) {
        this.dsMsgContrVerif = dsMsgContrVerif;
    }

    // uni-directional many-to-one association to FirCrl
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
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

    @Column(name = "TI_CONTR")
    public String getTiContr() {
        return this.tiContr;
    }

    public void setTiContr(String tiContr) {
        this.tiContr = tiContr;
    }

    @Column(name = "TI_ESITO_CONTR_VERIF")
    public String getTiEsitoContrVerif() {
        return this.tiEsitoContrVerif;
    }

    public void setTiEsitoContrVerif(String tiEsitoContrVerif) {
        this.tiEsitoContrVerif = tiEsitoContrVerif;
    }

    // bi-directional many-to-one association to AroVerifFirmaDtVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERIF_FIRMA_DT_VERS")
    public AroVerifFirmaDtVer getAroVerifFirmaDtVer() {
        return this.aroVerifFirmaDtVer;
    }

    public void setAroVerifFirmaDtVer(AroVerifFirmaDtVer aroVerifFirmaDtVer) {
        this.aroVerifFirmaDtVer = aroVerifFirmaDtVer;
    }

}
