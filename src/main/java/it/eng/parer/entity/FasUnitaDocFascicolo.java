package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the FAS_UNITA_DOC_FASCICOLO database table.
 */
@Entity
@Table(name = "FAS_UNITA_DOC_FASCICOLO")
@NamedQuery(name = "FasUnitaDocFascicolo.findAll", query = "SELECT f FROM FasUnitaDocFascicolo f")
public class FasUnitaDocFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUnitaDocFascicolo;

    private AroUnitaDoc aroUnitaDoc;

    private FasFascicolo fasFascicolo;
    private Date dtDataInserimentoFas;

    public FasUnitaDocFascicolo() {/* Hibernate */
    }

    @Id
    // "FAS_UNITA_DOC_FASCICOLO_IDUNITADOCFASCICOLO_GENERATOR",
    // sequenceName =
    // "SFAS_UNITA_DOC_FASCICOLO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "FAS_UNITA_DOC_FASCICOLO_IDUNITADOCFASCICOLO_GENERATOR")
    @Column(name = "ID_UNITA_DOC_FASCICOLO")
    @GenericGenerator(name = "SFAS_UNITA_DOC_FASCICOLO_ID_UNITA_DOC_FASCICOLO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_UNITA_DOC_FASCICOLO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_UNITA_DOC_FASCICOLO_ID_UNITA_DOC_FASCICOLO_GENERATOR")
    public Long getIdUnitaDocFascicolo() {
        return this.idUnitaDocFascicolo;
    }

    public void setIdUnitaDocFascicolo(Long idUnitaDocFascicolo) {
        this.idUnitaDocFascicolo = idUnitaDocFascicolo;
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

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
    }

}
