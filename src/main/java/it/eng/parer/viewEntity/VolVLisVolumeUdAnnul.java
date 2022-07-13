package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the VOL_V_LIS_VOLUME_UD_ANNUL database table.
 *
 */
@Entity
@Table(name = "VOL_V_LIS_VOLUME_UD_ANNUL")
@NamedQuery(name = "VolVLisVolumeUdAnnul.findAll", query = "SELECT v FROM VolVLisVolumeUdAnnul v")
public class VolVLisVolumeUdAnnul implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idRichAnnulVers;
    private BigDecimal idVolumeConserv;
    private String ntVolumeChiuso;

    public VolVLisVolumeUdAnnul() {
    }

    @Id
    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return this.idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }

    @Id
    @Column(name = "ID_VOLUME_CONSERV")
    public BigDecimal getIdVolumeConserv() {
        return this.idVolumeConserv;
    }

    public void setIdVolumeConserv(BigDecimal idVolumeConserv) {
        this.idVolumeConserv = idVolumeConserv;
    }

    @Column(name = "NT_VOLUME_CHIUSO")
    public String getNtVolumeChiuso() {
        return this.ntVolumeChiuso;
    }

    public void setNtVolumeChiuso(String ntVolumeChiuso) {
        this.ntVolumeChiuso = ntVolumeChiuso;
    }

}
