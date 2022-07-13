package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ELV_ELENCO_VERS_UD_ANNUL database table.
 *
 */
@Entity
@Table(name = "ELV_ELENCO_VERS_UD_ANNUL")
@NamedQuery(name = "ElvElencoVersUdAnnul.findAll", query = "SELECT e FROM ElvElencoVersUdAnnul e")
public class ElvElencoVersUdAnnul implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idElencoVersUdAnnul;
    private String dsUrnUnitaDocAnnul;
    private AroUnitaDoc aroUnitaDoc;
    private ElvElencoVer elvElencoVer;

    public ElvElencoVersUdAnnul() {
    }

    @Id
    @SequenceGenerator(name = "ELV_ELENCO_VERS_UD_ANNUL_IDELENCOVERSUDANNUL_GENERATOR", sequenceName = "SELV_ELENCO_VERS_UD_ANNUL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_ELENCO_VERS_UD_ANNUL_IDELENCOVERSUDANNUL_GENERATOR")
    @Column(name = "ID_ELENCO_VERS_UD_ANNUL")
    public long getIdElencoVersUdAnnul() {
        return this.idElencoVersUdAnnul;
    }

    public void setIdElencoVersUdAnnul(long idElencoVersUdAnnul) {
        this.idElencoVersUdAnnul = idElencoVersUdAnnul;
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

    // bi-directional many-to-one association to ElvElencoVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS")
    public ElvElencoVer getElvElencoVer() {
        return this.elvElencoVer;
    }

    public void setElvElencoVer(ElvElencoVer elvElencoVer) {
        this.elvElencoVer = elvElencoVer;
    }

}
