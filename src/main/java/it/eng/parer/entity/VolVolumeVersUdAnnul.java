package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the VOL_VOLUME_VERS_UD_ANNUL database table.
 *
 */
@Entity
@Table(name = "VOL_VOLUME_VERS_UD_ANNUL")
@NamedQuery(name = "VolVolumeVersUdAnnul.findAll", query = "SELECT v FROM VolVolumeVersUdAnnul v")
public class VolVolumeVersUdAnnul implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idVolumeVersUdAnnul;
    private String dsUrnUnitaDocAnnul;
    private AroUnitaDoc aroUnitaDoc;
    private VolVolumeConserv volVolumeConserv;

    public VolVolumeVersUdAnnul() {
    }

    @Id
    @SequenceGenerator(name = "VOL_VOLUME_VERS_UD_ANNUL_IDVOLUMEVERSUDANNUL_GENERATOR", sequenceName = "SVOL_VOLUME_VERS_UD_ANNUL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOL_VOLUME_VERS_UD_ANNUL_IDVOLUMEVERSUDANNUL_GENERATOR")
    @Column(name = "ID_VOLUME_VERS_UD_ANNUL")
    public long getIdVolumeVersUdAnnul() {
        return this.idVolumeVersUdAnnul;
    }

    public void setIdVolumeVersUdAnnul(long idVolumeVersUdAnnul) {
        this.idVolumeVersUdAnnul = idVolumeVersUdAnnul;
    }

    @Column(name = "DS_URN_UNITA_DOC_ANNUL")
    public String getDsUrnUnitaDocAnnul() {
        return this.dsUrnUnitaDocAnnul;
    }

    public void setDsUrnUnitaDocAnnul(String dsUrnUnitaDocAnnul) {
        this.dsUrnUnitaDocAnnul = dsUrnUnitaDocAnnul;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }

    // bi-directional many-to-one association to VolVolumeConserv
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VOLUME_CONSERV")
    public VolVolumeConserv getVolVolumeConserv() {
        return this.volVolumeConserv;
    }

    public void setVolVolumeConserv(VolVolumeConserv volVolumeConserv) {
        this.volVolumeConserv = volVolumeConserv;
    }

}
