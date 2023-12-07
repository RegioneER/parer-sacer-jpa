package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ARO_V_LIS_VOL_NO_VAL_DOC database table.
 */
@Entity
@Table(name = "ARO_V_LIS_VOL_NO_VAL_DOC")
public class AroVLisVolNoValDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private String dsVolumeConserv;

    private Date dtCreazione;

    private String nmVolumeConserv;

    private String tiStatoVolumeConserv;

    public AroVLisVolNoValDoc() {/* Hibernate */
    }

    @Column(name = "DS_VOLUME_CONSERV")
    public String getDsVolumeConserv() {
        return this.dsVolumeConserv;
    }

    public void setDsVolumeConserv(String dsVolumeConserv) {
        this.dsVolumeConserv = dsVolumeConserv;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "NM_VOLUME_CONSERV")
    public String getNmVolumeConserv() {
        return this.nmVolumeConserv;
    }

    public void setNmVolumeConserv(String nmVolumeConserv) {
        this.nmVolumeConserv = nmVolumeConserv;
    }

    @Column(name = "TI_STATO_VOLUME_CONSERV")
    public String getTiStatoVolumeConserv() {
        return this.tiStatoVolumeConserv;
    }

    public void setTiStatoVolumeConserv(String tiStatoVolumeConserv) {
        this.tiStatoVolumeConserv = tiStatoVolumeConserv;
    }

    private AroVLisVolNoValDocId aroVLisVolNoValDocId;

    @EmbeddedId()
    public AroVLisVolNoValDocId getAroVLisVolNoValDocId() {
        return aroVLisVolNoValDocId;
    }

    public void setAroVLisVolNoValDocId(AroVLisVolNoValDocId aroVLisVolNoValDocId) {
        this.aroVLisVolNoValDocId = aroVLisVolNoValDocId;
    }
}
