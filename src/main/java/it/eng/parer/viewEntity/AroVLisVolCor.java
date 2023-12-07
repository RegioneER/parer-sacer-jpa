package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ARO_V_LIS_VOL_COR database table.
 *
 */
@Entity
@Table(name = "ARO_V_LIS_VOL_COR")
@NamedQuery(name = "AroVLisVolCor.findAll", query = "SELECT a FROM AroVLisVolCor a")
public class AroVLisVolCor implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date dtCreazione;
    private AroVLisVolCorId aroVLisVolCorId;
    private String nmVolumeConserv;
    private String tiStatoVolumeConserv;

    @EmbeddedId
    public AroVLisVolCorId getAroVLisVolCorId() {
        return aroVLisVolCorId;
    }

    public void setAroVLisVolCorId(AroVLisVolCorId aroVLisVolCorId) {
        this.aroVLisVolCorId = aroVLisVolCorId;
    }

    public AroVLisVolCor() {/* Hibernate */
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

}
