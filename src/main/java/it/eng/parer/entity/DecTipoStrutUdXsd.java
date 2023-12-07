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
 * The persistent class for the DEC_TIPO_STRUT_UD_XSD database table.
 */
@Entity
@Table(name = "DEC_TIPO_STRUT_UD_XSD")
@NamedQuery(name = "DecTipoStrutUdXsd.findAll", query = "SELECT d FROM DecTipoStrutUdXsd d")
public class DecTipoStrutUdXsd implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idTipoStrutUdXsd;

    private DecXsdDatiSpec decXsdDatiSpec;

    private DecTipoStrutUnitaDoc decTipoStrutUnitaDoc;

    public DecTipoStrutUdXsd() {/* Hibernate */
    }

    @Id
    // "DEC_TIPO_STRUT_UD_XSD_IDTIPOSTRUTUDXSD_GENERATOR",
    // sequenceName = "SDEC_TIPO_STRUT_UD_XSD")
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_TIPO_STRUT_UD_XSD_IDTIPOSTRUTUDXSD_GENERATOR")
    @Column(name = "ID_TIPO_STRUT_UD_XSD")
    @XmlID
    @GenericGenerator(name = "SDEC_TIPO_STRUT_UD_XSD_ID_TIPO_STRUT_UD_XSD_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_TIPO_STRUT_UD_XSD"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_TIPO_STRUT_UD_XSD_ID_TIPO_STRUT_UD_XSD_GENERATOR")
    public Long getIdTipoStrutUdXsd() {
        return this.idTipoStrutUdXsd;
    }

    public void setIdTipoStrutUdXsd(Long idTipoStrutUdXsd) {
        this.idTipoStrutUdXsd = idTipoStrutUdXsd;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_XSD_DATI_SPEC")
    public // @XmlInverseReference(mappedBy = "decTipoStrutUdXsds")
    DecXsdDatiSpec getDecXsdDatiSpec() {
        return this.decXsdDatiSpec;
    }

    public void setDecXsdDatiSpec(DecXsdDatiSpec decXsdDatiSpec) {
        this.decXsdDatiSpec = decXsdDatiSpec;
    }

    // bi-directional many-to-one association to DecTipoStrutUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_STRUT_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decTipoStrutUdXsds")
    public DecTipoStrutUnitaDoc getDecTipoStrutUnitaDoc() {
        return this.decTipoStrutUnitaDoc;
    }

    public void setDecTipoStrutUnitaDoc(DecTipoStrutUnitaDoc decTipoStrutUnitaDoc) {
        this.decTipoStrutUnitaDoc = decTipoStrutUnitaDoc;
    }
}
