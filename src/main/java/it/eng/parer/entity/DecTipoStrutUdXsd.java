package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_TIPO_STRUT_UD_XSD database table.
 *
 */
@Entity
@Table(name = "DEC_TIPO_STRUT_UD_XSD")
@NamedQuery(name = "DecTipoStrutUdXsd.findAll", query = "SELECT d FROM DecTipoStrutUdXsd d")
public class DecTipoStrutUdXsd implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idTipoStrutUdXsd;
    private DecXsdDatiSpec decXsdDatiSpec;
    private DecTipoStrutUnitaDoc decTipoStrutUnitaDoc;

    public DecTipoStrutUdXsd() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_STRUT_UD_XSD_IDTIPOSTRUTUDXSD_GENERATOR", sequenceName = "SDEC_TIPO_STRUT_UD_XSD")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_STRUT_UD_XSD_IDTIPOSTRUTUDXSD_GENERATOR")
    @Column(name = "ID_TIPO_STRUT_UD_XSD")
    @XmlID
    public long getIdTipoStrutUdXsd() {
        return this.idTipoStrutUdXsd;
    }

    public void setIdTipoStrutUdXsd(long idTipoStrutUdXsd) {
        this.idTipoStrutUdXsd = idTipoStrutUdXsd;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_XSD_DATI_SPEC")
    // @XmlInverseReference(mappedBy = "decTipoStrutUdXsds")
    public DecXsdDatiSpec getDecXsdDatiSpec() {
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
