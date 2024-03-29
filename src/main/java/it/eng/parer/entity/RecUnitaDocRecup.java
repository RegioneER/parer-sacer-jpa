package it.eng.parer.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the REC_UNITA_DOC_RECUP database table.
 */
@Entity
@Table(name = "REC_UNITA_DOC_RECUP")
@NamedQuery(name = "RecUnitaDocRecup.findAll", query = "SELECT r FROM RecUnitaDocRecup r")
public class RecUnitaDocRecup {

    private static final long serialVersionUID = 1L;

    private Long idUnitaDocRecup;

    private List<RecSessioneRecup> recSessioneRecups = new ArrayList<>();

    private AroUnitaDoc aroUnitaDoc;

    public RecUnitaDocRecup() {/* Hibernate */
    }

    @Id
    // "REC_UNITA_DOC_RECUP_IDUNITADOCRECUP_GENERATOR",
    // sequenceName = "SREC_UNITA_DOC_RECUP",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REC_UNITA_DOC_RECUP_IDUNITADOCRECUP_GENERATOR")
    @Column(name = "ID_UNITA_DOC_RECUP")
    @GenericGenerator(name = "SREC_UNITA_DOC_RECUP_ID_UNITA_DOC_RECUP_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SREC_UNITA_DOC_RECUP"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SREC_UNITA_DOC_RECUP_ID_UNITA_DOC_RECUP_GENERATOR")
    public Long getIdUnitaDocRecup() {
        return this.idUnitaDocRecup;
    }

    public void setIdUnitaDocRecup(Long idUnitaDocRecup) {
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
