package it.eng.parer.entity;

import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the REC_UNITA_DOC_RECUP database table.
 *
 */
@Entity
@Table(name = "REC_UNITA_DOC_RECUP")
@NamedQuery(name = "RecUnitaDocRecup.findAll", query = "SELECT r FROM RecUnitaDocRecup r")
public class RecUnitaDocRecup {

    private static final long serialVersionUID = 1L;
    private long idUnitaDocRecup;
    private List<RecSessioneRecup> recSessioneRecups;
    private AroUnitaDoc aroUnitaDoc;

    public RecUnitaDocRecup() {
    }

    @Id
    @SequenceGenerator(name = "REC_UNITA_DOC_RECUP_IDUNITADOCRECUP_GENERATOR", sequenceName = "SREC_UNITA_DOC_RECUP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REC_UNITA_DOC_RECUP_IDUNITADOCRECUP_GENERATOR")
    @Column(name = "ID_UNITA_DOC_RECUP")
    public long getIdUnitaDocRecup() {
        return this.idUnitaDocRecup;
    }

    public void setIdUnitaDocRecup(long idUnitaDocRecup) {
        this.idUnitaDocRecup = idUnitaDocRecup;
    }

    // bi-directional many-to-one association to RecSessioneRecup
    @OneToMany(mappedBy = "recUnitaDocRecup")
    public List<RecSessioneRecup> getRecSessioneRecups() {
        return this.recSessioneRecups;
    }

    public void setRecSessioneRecups(List<RecSessioneRecup> recSessioneRecups) {
        this.recSessioneRecups = recSessioneRecups;
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
}