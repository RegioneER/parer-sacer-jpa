package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the VOL_APPART_UNITA_DOC_VOLUME database table.
 * 
 */
@Entity
@Table(name = "VOL_APPART_UNITA_DOC_VOLUME")
public class VolAppartUnitaDocVolume implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idAppartUnitaDocVolume;
    private Date dtCreazione;
    private BigDecimal idStrut;
    private List<VolAppartDocVolume> volAppartDocVolumes;
    private AroUnitaDoc aroUnitaDoc;
    private VolVolumeConserv volVolumeConserv;

    public VolAppartUnitaDocVolume() {
    }

    @Id
    @SequenceGenerator(name = "VOL_APPART_UNITA_DOC_VOLUME_IDAPPARTUNITADOCVOLUME_GENERATOR", sequenceName = "SVOL_APPART_UNITA_DOC_VOLUME", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOL_APPART_UNITA_DOC_VOLUME_IDAPPARTUNITADOCVOLUME_GENERATOR")
    @Column(name = "ID_APPART_UNITA_DOC_VOLUME")
    public long getIdAppartUnitaDocVolume() {
        return this.idAppartUnitaDocVolume;
    }

    public void setIdAppartUnitaDocVolume(long idAppartUnitaDocVolume) {
        this.idAppartUnitaDocVolume = idAppartUnitaDocVolume;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to VolAppartDocVolume
    @OneToMany(mappedBy = "volAppartUnitaDocVolume", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH })
    public List<VolAppartDocVolume> getVolAppartDocVolumes() {
        return this.volAppartDocVolumes;
    }

    public void setVolAppartDocVolumes(List<VolAppartDocVolume> volAppartDocVolumes) {
        this.volAppartDocVolumes = volAppartDocVolumes;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }

    // bi-directional many-to-one association to VolVolumeConserv
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_VOLUME_CONSERV")
    public VolVolumeConserv getVolVolumeConserv() {
        return this.volVolumeConserv;
    }

    public void setVolVolumeConserv(VolVolumeConserv volVolumeConserv) {
        this.volVolumeConserv = volVolumeConserv;
    }
}