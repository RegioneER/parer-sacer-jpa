package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ARO_XML_RICH_ANNUL_VERS database table.
 *
 */
@Entity
@Table(name = "ARO_XML_RICH_ANNUL_VERS")
@NamedQuery(name = "AroXmlRichAnnulVers.findAll", query = "SELECT a FROM AroXmlRichAnnulVers a")
public class AroXmlRichAnnulVers implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idXmlRichAnnulVers;
    private String blXmlRichAnnulVers;
    private String tiXmlRichAnnulVers;
    private String cdVersioneXml;
    private AroRichAnnulVers aroRichAnnulVers;

    public AroXmlRichAnnulVers() {
    }

    @Id
    @SequenceGenerator(name = "ARO_XML_RICH_ANNUL_VERS_IDXMLRICHANNULVERS_GENERATOR", sequenceName = "SARO_XML_RICH_ANNUL_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_XML_RICH_ANNUL_VERS_IDXMLRICHANNULVERS_GENERATOR")
    @Column(name = "ID_XML_RICH_ANNUL_VERS")
    public long getIdXmlRichAnnulVers() {
        return this.idXmlRichAnnulVers;
    }

    public void setIdXmlRichAnnulVers(long idXmlRichAnnulVers) {
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
