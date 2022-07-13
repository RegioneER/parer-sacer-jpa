package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_VIS_COMP_VOL database table.
 *
 */
@Entity
@Table(name = "ARO_V_VIS_COMP_VOL")
@NamedQuery(name = "AroVVisCompVol.findAll", query = "SELECT a FROM AroVVisCompVol a")
public class AroVVisCompVol implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsEsitoVerifFirmeChius;
    private Date dtChiusVolume;
    private BigDecimal idCompDoc;
    private BigDecimal idVolumeConserv;
    private String nmVolumeConserv;
    private String tiEsitoVerifFirmeChius;
    private String tiStatoVolumeConserv;

    public AroVVisCompVol() {
    }

    @Column(name = "DS_ESITO_VERIF_FIRME_CHIUS")
    public String getDsEsitoVerifFirmeChius() {
        return this.dsEsitoVerifFirmeChius;
    }

    public void setDsEsitoVerifFirmeChius(String dsEsitoVerifFirmeChius) {
        this.dsEsitoVerifFirmeChius = dsEsitoVerifFirmeChius;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CHIUS_VOLUME")
    public Date getDtChiusVolume() {
        return this.dtChiusVolume;
    }

    public void setDtChiusVolume(Date dtChiusVolume) {
        this.dtChiusVolume = dtChiusVolume;
    }

    @Id
    @Column(name = "ID_COMP_DOC")
    public BigDecimal getIdCompDoc() {
        return this.idCompDoc;
    }

    public void setIdCompDoc(BigDecimal idCompDoc) {
        this.idCompDoc = idCompDoc;
    }

    @Column(name = "ID_VOLUME_CONSERV")
    public BigDecimal getIdVolumeConserv() {
        return this.idVolumeConserv;
    }

    public void setIdVolumeConserv(BigDecimal idVolumeConserv) {
        this.idVolumeConserv = idVolumeConserv;
    }

    @Column(name = "NM_VOLUME_CONSERV")
    public String getNmVolumeConserv() {
        return this.nmVolumeConserv;
    }

    public void setNmVolumeConserv(String nmVolumeConserv) {
        this.nmVolumeConserv = nmVolumeConserv;
    }

    @Column(name = "TI_ESITO_VERIF_FIRME_CHIUS")
    public String getTiEsitoVerifFirmeChius() {
        return this.tiEsitoVerifFirmeChius;
    }

    public void setTiEsitoVerifFirmeChius(String tiEsitoVerifFirmeChius) {
        this.tiEsitoVerifFirmeChius = tiEsitoVerifFirmeChius;
    }

    @Column(name = "TI_STATO_VOLUME_CONSERV")
    public String getTiStatoVolumeConserv() {
        return this.tiStatoVolumeConserv;
    }

    public void setTiStatoVolumeConserv(String tiStatoVolumeConserv) {
        this.tiStatoVolumeConserv = tiStatoVolumeConserv;
    }

}
