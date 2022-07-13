package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the VOL_CONTR_VERIF_FIRMA_VOLUME database table.
 * 
 */
@Entity
@Table(name = "VOL_CONTR_VERIF_FIRMA_VOLUME")
public class VolContrVerifFirmaVolume implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idContrVerifFirmaVolume;
    private String dsMsgContrVerif;
    private String tiContr;
    private String tiEsitoContrVerif;
    private FirCrl firCrl;
    private VolVerifFirmaVolume volVerifFirmaVolume;

    public VolContrVerifFirmaVolume() {
    }

    @Id
    @SequenceGenerator(name = "VOL_CONTR_VERIF_FIRMA_VOLUME_IDCONTRVERIFFIRMAVOLUME_GENERATOR", sequenceName = "SVOL_CONTR_VERIF_FIRMA_VOLUME", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOL_CONTR_VERIF_FIRMA_VOLUME_IDCONTRVERIFFIRMAVOLUME_GENERATOR")
    @Column(name = "ID_CONTR_VERIF_FIRMA_VOLUME")
    public long getIdContrVerifFirmaVolume() {
        return this.idContrVerifFirmaVolume;
    }

    public void setIdContrVerifFirmaVolume(long idContrVerifFirmaVolume) {
        this.idContrVerifFirmaVolume = idContrVerifFirmaVolume;
    }

    @Column(name = "DS_MSG_CONTR_VERIF")
    public String getDsMsgContrVerif() {
        return this.dsMsgContrVerif;
    }

    public void setDsMsgContrVerif(String dsMsgContrVerif) {
        this.dsMsgContrVerif = dsMsgContrVerif;
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

    // bi-directional many-to-one association to VolVerifFirmaVolume
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_VERIF_FIRMA_VOLUME")
    public VolVerifFirmaVolume getVolVerifFirmaVolume() {
        return this.volVerifFirmaVolume;
    }

    public void setVolVerifFirmaVolume(VolVerifFirmaVolume volVerifFirmaVolume) {
        this.volVerifFirmaVolume = volVerifFirmaVolume;
    }

}