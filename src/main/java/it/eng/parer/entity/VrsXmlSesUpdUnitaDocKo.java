package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.VrsXmlSesUpdUnitaDocKo.TiXmlVrsXmlSesUpdUnitaDocKo;
import java.util.Date;

/**
 * The persistent class for the VRS_XML_SES_UPD_UNITA_DOC_KO database table.
 * 
 */
@Entity
@Table(name = "VRS_XML_SES_UPD_UNITA_DOC_KO")
@NamedQuery(name = "VrsXmlSesUpdUnitaDocKo.findAll", query = "SELECT v FROM VrsXmlSesUpdUnitaDocKo v")
public class VrsXmlSesUpdUnitaDocKo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idXmlSesUpdUnitaDocKo;
    private String blXml;
    private String cdVersioneXml;
    private Date dtRegXml;
    private VrsSesUpdUnitaDocKo vrsSesUpdUnitaDocKo;
    private OrgStrut orgStrut;
    private TiXmlVrsXmlSesUpdUnitaDocKo tiXml;

    public VrsXmlSesUpdUnitaDocKo() {
    }

    @Id
    @SequenceGenerator(name = "VRS_XML_SES_UPD_UNITA_DOC_KO_IDXMLSESUPDUNITADOCKO_GENERATOR", sequenceName = "SVRS_XML_SES_UPD_UNITA_DOC_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_XML_SES_UPD_UNITA_DOC_KO_IDXMLSESUPDUNITADOCKO_GENERATOR")
    @Column(name = "ID_XML_SES_UPD_UNITA_DOC_KO")
    public long getIdXmlSesUpdUnitaDocKo() {
        return this.idXmlSesUpdUnitaDocKo;
    }

    public void setIdXmlSesUpdUnitaDocKo(long idXmlSesUpdUnitaDocKo) {
        this.idXmlSesUpdUnitaDocKo = idXmlSesUpdUnitaDocKo;
    }

    @Lob
    @Column(name = "BL_XML")
    public String getBlXml() {
        return this.blXml;
    }

    public void setBlXml(String blXml) {
        this.blXml = blXml;
    }

    @Column(name = "CD_VERSIONE_XML")
    public String getCdVersioneXml() {
        return this.cdVersioneXml;
    }

    public void setCdVersioneXml(String cdVersioneXml) {
        this.cdVersioneXml = cdVersioneXml;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_REG_XML")
    public Date getDtRegXml() {
        return this.dtRegXml;
    }

    public void setDtRegXml(Date dtRegXml) {
        this.dtRegXml = dtRegXml;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SES_UPD_UD_KO")
    public VrsSesUpdUnitaDocKo getVrsSesUpdUnitaDocKo() {
        return this.vrsSesUpdUnitaDocKo;
    }

    public void setVrsSesUpdUnitaDocKo(VrsSesUpdUnitaDocKo vrsSesUpdUnitaDocKo) {
        this.vrsSesUpdUnitaDocKo = vrsSesUpdUnitaDocKo;
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

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_XML")
    public TiXmlVrsXmlSesUpdUnitaDocKo getTiXml() {
        return this.tiXml;
    }

    public void setTiXml(TiXmlVrsXmlSesUpdUnitaDocKo tiXml) {
        this.tiXml = tiXml;
    }

}