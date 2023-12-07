package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the VOL_V_LIS_VOLUME_UD_ANNUL database table.
 */
@Entity
@Table(name = "VOL_V_LIS_VOLUME_UD_ANNUL")
@NamedQuery(name = "VolVLisVolumeUdAnnul.findAll", query = "SELECT v FROM VolVLisVolumeUdAnnul v")
public class VolVLisVolumeUdAnnul implements Serializable {

    private static final long serialVersionUID = 1L;

    private String ntVolumeChiuso;

    public VolVLisVolumeUdAnnul() {/* Hibernate */
    }

    @Column(name = "NT_VOLUME_CHIUSO")
    public String getNtVolumeChiuso() {
        return this.ntVolumeChiuso;
    }

    public void setNtVolumeChiuso(String ntVolumeChiuso) {
        this.ntVolumeChiuso = ntVolumeChiuso;
    }

    private VolVLisVolumeUdAnnulId volVLisVolumeUdAnnulId;

    @EmbeddedId()
    public VolVLisVolumeUdAnnulId getVolVLisVolumeUdAnnulId() {
        return volVLisVolumeUdAnnulId;
    }

    public void setVolVLisVolumeUdAnnulId(VolVLisVolumeUdAnnulId volVLisVolumeUdAnnulId) {
        this.volVLisVolumeUdAnnulId = volVLisVolumeUdAnnulId;
    }
}
