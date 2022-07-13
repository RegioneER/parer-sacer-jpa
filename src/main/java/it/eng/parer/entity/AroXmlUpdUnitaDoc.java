package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.AroXmlUpdUnitaDoc.TiXmlUpdUnitaDoc;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_XML_UPD_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_XML_UPD_UNITA_DOC")
@NamedQuery(name = "AroXmlUpdUnitaDoc.findAll", query = "SELECT a FROM AroXmlUpdUnitaDoc a")
public class AroXmlUpdUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idXmlUpdUnitaDoc;
    private String blXml;
    private String cdEncodingHashXml;
    private String cdVersioneXml;
    private String dsAlgoHashXml;
    private String dsHashXml;
    private String dsUrnXml;
    private String dsUrnNormalizXml;
    private Date dtIniSes;
    private OrgStrut orgStrut;
    private AroUpdUnitaDoc aroUpdUnitaDoc;
    private TiXmlUpdUnitaDoc tiXmlUpdUnitaDoc;

    public AroXmlUpdUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_XML_UPD_UNITA_DOC_IDXMLUPDUNITADOC_GENERATOR", sequenceName = "SARO_XML_UPD_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_XML_UPD_UNITA_DOC_IDXMLUPDUNITADOC_GENERATOR")
    @Column(name = "ID_XML_UPD_UNITA_DOC")
    public long getIdXmlUpdUnitaDoc() {
        return this.idXmlUpdUnitaDoc;
    }

    public void setIdXmlUpdUnitaDoc(long idXmlUpdUnitaDoc) {
        this.idXmlUpdUnitaDoc = idXmlUpdUnitaDoc;
    }

    @Lob
    @Column(name = "BL_XML")
    public String getBlXml() {
        return this.blXml;
    }

    public void setBlXml(String blXml) {
        this.blXml = blXml;
    }

    @Column(name = "CD_ENCODING_HASH_XML")
    public String getCdEncodingHashXml() {
        return this.cdEncodingHashXml;
    }

    public void setCdEncodingHashXml(String cdEncodingHashXml) {
        this.cdEncodingHashXml = cdEncodingHashXml;
    }

    @Column(name = "CD_VERSIONE_XML")
    public String getCdVersioneXml() {
        return this.cdVersioneXml;
    }

    public void setCdVersioneXml(String cdVersioneXml) {
        this.cdVersioneXml = cdVersioneXml;
    }

    @Column(name = "DS_ALGO_HASH_XML")
    public String getDsAlgoHashXml() {
        return this.dsAlgoHashXml;
    }

    public void setDsAlgoHashXml(String dsAlgoHashXml) {
        this.dsAlgoHashXml = dsAlgoHashXml;
    }

    @Column(name = "DS_HASH_XML")
    public String getDsHashXml() {
        return this.dsHashXml;
    }

    public void setDsHashXml(String dsHashXml) {
        this.dsHashXml = dsHashXml;
    }

    @Column(name = "DS_URN_XML")
    public String getDsUrnXml() {
        return this.dsUrnXml;
    }

    public void setDsUrnXml(String dsUrnXml) {
        this.dsUrnXml = dsUrnXml;
    }

    @Column(name = "DS_URN_NORMALIZ_XML")
    public String getDsUrnNormalizXml() {
        return this.dsUrnNormalizXml;
    }

    public void setDsUrnNormalizXml(String dsUrnNormalizXml) {
        this.dsUrnNormalizXml = dsUrnNormalizXml;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_INI_SES")
    public Date getDtIniSes() {
        return this.dtIniSes;
    }

    public void setDtIniSes(Date dtIniSes) {
        this.dtIniSes = dtIniSes;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to AroUpdUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_XML_UPD_UNITA_DOC")
    public TiXmlUpdUnitaDoc getTiXmlUpdUnitaDoc() {
        return this.tiXmlUpdUnitaDoc;
    }

    public void setTiXmlUpdUnitaDoc(TiXmlUpdUnitaDoc tiXmlUpdUnitaDoc) {
        this.tiXmlUpdUnitaDoc = tiXmlUpdUnitaDoc;
    }

}