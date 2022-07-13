package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_FORMATO_FILE_AMMESSO database table.
 * 
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_FORMATO_FILE_AMMESSO")
public class DecFormatoFileAmmesso implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFormatoFileAmmesso;
    private DecFormatoFileDoc decFormatoFileDoc;
    private DecTipoCompDoc decTipoCompDoc;

    public DecFormatoFileAmmesso() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FORMATO_FILE_AMMESSO_IDFORMATOFILEAMMESSO_GENERATOR", sequenceName = "SDEC_FORMATO_FILE_AMMESSO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FORMATO_FILE_AMMESSO_IDFORMATOFILEAMMESSO_GENERATOR")
    @Column(name = "ID_FORMATO_FILE_AMMESSO")
    @XmlID
    public long getIdFormatoFileAmmesso() {
        return this.idFormatoFileAmmesso;
    }

    public void setIdFormatoFileAmmesso(long idFormatoFileAmmesso) {
        this.idFormatoFileAmmesso = idFormatoFileAmmesso;
    }

    // bi-directional many-to-one association to DecFormatoFileDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_FILE_DOC")
    @XmlInverseReference(mappedBy = "decFormatoFileAmmessos")
    public DecFormatoFileDoc getDecFormatoFileDoc() {
        return this.decFormatoFileDoc;
    }

    public void setDecFormatoFileDoc(DecFormatoFileDoc decFormatoFileDoc) {
        this.decFormatoFileDoc = decFormatoFileDoc;
    }

    // bi-directional many-to-one association to DecTipoCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_COMP_DOC")
    @XmlInverseReference(mappedBy = "decFormatoFileAmmessos")
    public DecTipoCompDoc getDecTipoCompDoc() {
        return this.decTipoCompDoc;
    }

    public void setDecTipoCompDoc(DecTipoCompDoc decTipoCompDoc) {
        this.decTipoCompDoc = decTipoCompDoc;
    }

}