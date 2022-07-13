package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the FAS_UNITA_DOC_FASCICOLO database table.
 * 
 */
@Entity
@Table(name = "FAS_UNITA_DOC_FASCICOLO")
@NamedQuery(name = "FasUnitaDocFascicolo.findAll", query = "SELECT f FROM FasUnitaDocFascicolo f")
public class FasUnitaDocFascicolo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUnitaDocFascicolo;
    private AroUnitaDoc aroUnitaDoc;
    private FasFascicolo fasFascicolo;

    public FasUnitaDocFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_UNITA_DOC_FASCICOLO_IDUNITADOCFASCICOLO_GENERATOR", sequenceName = "SFAS_UNITA_DOC_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_UNITA_DOC_FASCICOLO_IDUNITADOCFASCICOLO_GENERATOR")
    @Column(name = "ID_UNITA_DOC_FASCICOLO")
    public long getIdUnitaDocFascicolo() {
        return this.idUnitaDocFascicolo;
    }

    public void setIdUnitaDocFascicolo(long idUnitaDocFascicolo) {
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