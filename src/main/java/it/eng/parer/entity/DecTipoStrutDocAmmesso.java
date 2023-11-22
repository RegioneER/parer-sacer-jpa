package it.eng.parer.entity;

import java.io.Serializable;

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
import javax.xml.bind.annotation.XmlID;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the DEC_TIPO_STRUT_DOC_AMMESSO database table.
 */
@Entity
@Table(name = "DEC_TIPO_STRUT_DOC_AMMESSO")
@NamedQuery(name = "DecTipoStrutDocAmmesso.findAll", query = "SELECT d FROM DecTipoStrutDocAmmesso d")
public class DecTipoStrutDocAmmesso implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idTipoStrutDocAmmesso;

    private DecTipoDoc decTipoDoc;

    private DecTipoStrutDoc decTipoStrutDoc;

    public DecTipoStrutDocAmmesso() {/* Hibernate */
    }

    @Id
    // "DEC_TIPO_STRUT_DOC_AMMESSO_IDTIPOSTRUTDOCAMMESSO_GENERATOR",
    // sequenceName =
    // "SDEC_TIPO_STRUT_DOC_AMMESSO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_TIPO_STRUT_DOC_AMMESSO_IDTIPOSTRUTDOCAMMESSO_GENERATOR")
    @Column(name = "ID_TIPO_STRUT_DOC_AMMESSO")
    @XmlID
    @GenericGenerator(name = "SDEC_TIPO_STRUT_DOC_AMMESSO_ID_TIPO_STRUT_DOC_AMMESSO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_TIPO_STRUT_DOC_AMMESSO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_TIPO_STRUT_DOC_AMMESSO_ID_TIPO_STRUT_DOC_AMMESSO_GENERATOR")
    public Long getIdTipoStrutDocAmmesso() {
        return this.idTipoStrutDocAmmesso;
    }

    public void setIdTipoStrutDocAmmesso(Long idTipoStrutDocAmmesso) {
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
