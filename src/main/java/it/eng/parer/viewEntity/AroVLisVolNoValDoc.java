package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_LIS_VOL_NO_VAL_DOC database table.
 *
 */
@Entity
@Table(name = "ARO_V_LIS_VOL_NO_VAL_DOC")
public class AroVLisVolNoValDoc implements Serializable {

    private BigDecimal idDoc;
    private BigDecimal idVolumeConserv;
    private static final long serialVersionUID = 1L;
    private String dsVolumeConserv;
    private Date dtCreazione;
    private String nmVolumeConserv;
    private String tiStatoVolumeConserv;

    public AroVLisVolNoValDoc() {
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

    @Id
    @Column(name = "ID_DOC")
    public BigDecimal getIdDoc() {
        return this.idDoc;
    }

    public void setIdDoc(BigDecimal idDoc) {
        this.idDoc = idDoc;
    }

    @Id
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

    @Column(name = "TI_STATO_VOLUME_CONSERV")
    public String getTiStatoVolumeConserv() {
        return this.tiStatoVolumeConserv;
    }

    public void setTiStatoVolumeConserv(String tiStatoVolumeConserv) {
        this.tiStatoVolumeConserv = tiStatoVolumeConserv;
    }
}