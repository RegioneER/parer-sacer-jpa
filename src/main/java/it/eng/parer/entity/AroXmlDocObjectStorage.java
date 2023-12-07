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
@Table(name = "ARO_XML_DOC_OBJECT_STORAGE")
public class AroXmlDocObjectStorage extends AroXmlObjectStorage {

    private static final long serialVersionUID = 1L;

    public AroXmlDocObjectStorage() {
        super();
    }

    private Long idDoc;
    private AroDoc aroDoc;

    @Id
    @Column(name = "ID_DOC")
    public Long getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(Long idDoc) {
        this.idDoc = idDoc;
    }

    @MapsId
    @OneToOne(mappedBy = "aroXmlDocObjectStorage")
    @JoinColumn(name = "ID_DOC")
    public AroDoc getAroDoc() {
        return aroDoc;
    }

    public void setAroDoc(AroDoc aroDoc) {
        this.aroDoc = aroDoc;
    }
}
