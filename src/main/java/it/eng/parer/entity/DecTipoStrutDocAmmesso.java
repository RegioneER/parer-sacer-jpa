package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_TIPO_STRUT_DOC_AMMESSO database table.
 * 
 */
@Entity
@Table(name = "DEC_TIPO_STRUT_DOC_AMMESSO")
@NamedQuery(name = "DecTipoStrutDocAmmesso.findAll", query = "SELECT d FROM DecTipoStrutDocAmmesso d")
public class DecTipoStrutDocAmmesso implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idTipoStrutDocAmmesso;
    private DecTipoDoc decTipoDoc;
    private DecTipoStrutDoc decTipoStrutDoc;

    public DecTipoStrutDocAmmesso() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_STRUT_DOC_AMMESSO_IDTIPOSTRUTDOCAMMESSO_GENERATOR", sequenceName = "SDEC_TIPO_STRUT_DOC_AMMESSO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_STRUT_DOC_AMMESSO_IDTIPOSTRUTDOCAMMESSO_GENERATOR")
    @Column(name = "ID_TIPO_STRUT_DOC_AMMESSO")
    @XmlID
    public long getIdTipoStrutDocAmmesso() {
        return this.idTipoStrutDocAmmesso;
    }

    public void setIdTipoStrutDocAmmesso(long idTipoStrutDocAmmesso) {
        this.idTipoStrutDocAmmesso = idTipoStrutDocAmmesso;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC")
    @XmlInverseReference(mappedBy = "decTipoStrutDocAmmessos")
    public DecTipoDoc getDecTipoDoc() {
        return this.decTipoDoc;
    }

    public void setDecTipoDoc(DecTipoDoc decTipoDoc) {
        this.decTipoDoc = decTipoDoc;
    }

    // bi-directional many-to-one association to DecTipoStrutDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_STRUT_DOC")
    @XmlInverseReference(mappedBy = "decTipoStrutDocAmmessos")
    public DecTipoStrutDoc getDecTipoStrutDoc() {
        return this.decTipoStrutDoc;
    }

    public void setDecTipoStrutDoc(DecTipoStrutDoc decTipoStrutDoc) {
        this.decTipoStrutDoc = decTipoStrutDoc;
    }

}