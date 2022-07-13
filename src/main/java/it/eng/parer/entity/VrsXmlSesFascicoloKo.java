package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the VRS_XML_SES_FASCICOLO_KO database table.
 *
 */
@Entity
@Table(name = "VRS_XML_SES_FASCICOLO_KO")
@NamedQuery(name = "VrsXmlSesFascicoloKo.findAll", query = "SELECT v FROM VrsXmlSesFascicoloKo v")
public class VrsXmlSesFascicoloKo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idXmlSesFascicoloKo;
    private String blXml;
    // private String cdEncodingHashXml;
    private String cdVersioneXml;
    // private String dsAlgoHashXml;
    // private String dsHashXml;
    // private String dsUrnXml;
    private Date dtRegXmlSesKo;
    private BigDecimal idStrut;
    private String tiXml;
    private VrsSesFascicoloKo vrsSesFascicoloKo;

    public VrsXmlSesFascicoloKo() {
    }

    @Id
    @SequenceGenerator(name = "VRS_XML_SES_FASCICOLO_KO_IDXMLSESFASCICOLOKO_GENERATOR", sequenceName = "SVRS_XML_SES_FASCICOLO_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_XML_SES_FASCICOLO_KO_IDXMLSESFASCICOLOKO_GENERATOR")
    @Column(name = "ID_XML_SES_FASCICOLO_KO")
    public long getIdXmlSesFascicoloKo() {
        return this.idXmlSesFascicoloKo;
    }

    public void setIdXmlSesFascicoloKo(long idXmlSesFascicoloKo) {
        this.idXmlSesFascicoloKo = idXmlSesFascicoloKo;
    }

    @Lob
    @Column(name = "BL_XML")
    public String getBlXml() {
        return this.blXml;
    }

    public void setBlXml(String blXml) {
        this.blXml = blXml;
    }

    /*
     * @Column(name = "CD_ENCODING_HASH_XML") public String getCdEncodingHashXml() { return this.cdEncodingHashXml; }
     * 
     * public void setCdEncodingHashXml(String cdEncodingHashXml) { this.cdEncodingHashXml = cdEncodingHashXml; }
     */
    @Column(name = "CD_VERSIONE_XML")
    public String getCdVersioneXml() {
        return this.cdVersioneXml;
    }

    public void setCdVersioneXml(String cdVersioneXml) {
        this.cdVersioneXml = cdVersioneXml;
    }

    /*
     * @Column(name = "DS_ALGO_HASH_XML") public String getDsAlgoHashXml() { return this.dsAlgoHashXml; }
     * 
     * public void setDsAlgoHashXml(String dsAlgoHashXml) { this.dsAlgoHashXml = dsAlgoHashXml; }
     * 
     * @Column(name = "DS_HASH_XML") public String getDsHashXml() { return this.dsHashXml; }
     * 
     * public void setDsHashXml(String dsHashXml) { this.dsHashXml = dsHashXml; }
     * 
     * @Column(name = "DS_URN_XML") public String getDsUrnXml() { return this.dsUrnXml; }
     * 
     * public void setDsUrnXml(String dsUrnXml) { this.dsUrnXml = dsUrnXml; }
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "DT_REG_XML_SES_KO")
    public Date getDtRegXmlSesKo() {
        return this.dtRegXmlSesKo;
    }

    public void setDtRegXmlSesKo(Date dtRegXmlSesKo) {
        this.dtRegXmlSesKo = dtRegXmlSesKo;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "TI_XML")
    public String getTiXml() {
        return this.tiXml;
    }

    public void setTiXml(String tiXml) {
        this.tiXml = tiXml;
    }

    // bi-directional many-to-one association to VrsSesFascicoloKo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SES_FASCICOLO_KO")
    public VrsSesFascicoloKo getVrsSesFascicoloKo() {
        return this.vrsSesFascicoloKo;
    }

    public void setVrsSesFascicoloKo(VrsSesFascicoloKo vrsSesFascicoloKo) {
        this.vrsSesFascicoloKo = vrsSesFascicoloKo;
    }

}
