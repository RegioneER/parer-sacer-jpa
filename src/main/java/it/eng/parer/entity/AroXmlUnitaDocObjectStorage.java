package it.eng.parer.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import it.eng.parer.entity.inheritance.oop.AroXmlObjectStorage;

@Entity
@Table(name = "ARO_XML_UNITA_DOC_OBJECT_STORAGE")
public class AroXmlUnitaDocObjectStorage extends AroXmlObjectStorage {

    private static final long serialVersionUID = 1L;

    public AroXmlUnitaDocObjectStorage() {
        super();
    }

    private Long idUnitaDoc;
    private AroUnitaDoc aroUnitaDoc;

    @Id
    @Column(name = "ID_UNITA_DOC")
    public Long getIdUnitaDoc() {
        return idUnitaDoc;
    }

    public void setIdUnitaDoc(Long idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @MapsId
    @OneToOne(mappedBy = "aroXmlUnitaDocObjectStorage")
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }
}
