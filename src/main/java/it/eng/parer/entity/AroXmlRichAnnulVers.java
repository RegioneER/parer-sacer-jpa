package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_XML_RICH_ANNUL_VERS database table.
 */
@Entity
@Table(name = "ARO_XML_RICH_ANNUL_VERS")
@NamedQuery(name = "AroXmlRichAnnulVers.findAll", query = "SELECT a FROM AroXmlRichAnnulVers a")
public class AroXmlRichAnnulVers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idXmlRichAnnulVers;

    private String blXmlRichAnnulVers;

    private String tiXmlRichAnnulVers;

    private String cdVersioneXml;

    private AroRichAnnulVers aroRichAnnulVers;

    public AroXmlRichAnnulVers() {/* Hibernate */
    }

    @Id
    // "ARO_XML_RICH_ANNUL_VERS_IDXMLRICHANNULVERS_GENERATOR",
    // sequenceName =
    // "SARO_XML_RICH_ANNUL_VERS",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ARO_XML_RICH_ANNUL_VERS_IDXMLRICHANNULVERS_GENERATOR")
    @Column(name = "ID_XML_RICH_ANNUL_VERS")
    @GenericGenerator(name = "SARO_XML_RICH_ANNUL_VERS_ID_XML_RICH_ANNUL_VERS_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_XML_RICH_ANNUL_VERS"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_XML_RICH_ANNUL_VERS_ID_XML_RICH_ANNUL_VERS_GENERATOR")
    public Long getIdXmlRichAnnulVers() {
        return this.idXmlRichAnnulVers;
    }

    public void setIdXmlRichAnnulVers(Long idXmlRichAnnulVers) {
        this.idXmlRichAnnulVers = idXmlRichAnnulVers;
    }

    @Lob
    @Column(name = "BL_XML_RICH_ANNUL_VERS")
    public String getBlXmlRichAnnulVers() {
        return this.blXmlRichAnnulVers;
    }

    public void setBlXmlRichAnnulVers(String blXmlRichAnnulVers) {
        this.blXmlRichAnnulVers = blXmlRichAnnulVers;
    }

    @Column(name = "TI_XML_RICH_ANNUL_VERS")
    public String getTiXmlRichAnnulVers() {
        return this.tiXmlRichAnnulVers;
    }

    public void setTiXmlRichAnnulVers(String tiXmlRichAnnulVers) {
        this.tiXmlRichAnnulVers = tiXmlRichAnnulVers;
    }

    @Column(name = "CD_VERSIONE_XML")
    public String getCdVersioneXml() {
        return this.cdVersioneXml;
    }

    public void setCdVersioneXml(String cdVersioneXml) {
        this.cdVersioneXml = cdVersioneXml;
    }

    // bi-directional many-to-one association to AroRichAnnulVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RICH_ANNUL_VERS")
    public AroRichAnnulVers getAroRichAnnulVers() {
        return this.aroRichAnnulVers;
    }

    public void setAroRichAnnulVers(AroRichAnnulVers aroRichAnnulVers) {
        this.aroRichAnnulVers = aroRichAnnulVers;
    }
}
