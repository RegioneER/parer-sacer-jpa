package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.VrsXmlSesUpdUnitaDocErr.TiXmlVrsXmlSesUpdUnitaDocErr;

/**
 * The persistent class for the VRS_XML_SES_UPD_UNITA_DOC_ERR database table.
 * 
 */
@Entity
@Table(name = "VRS_XML_SES_UPD_UNITA_DOC_ERR")
@NamedQuery(name = "VrsXmlSesUpdUnitaDocErr.findAll", query = "SELECT v FROM VrsXmlSesUpdUnitaDocErr v")
public class VrsXmlSesUpdUnitaDocErr implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idXmlSesUpdUnitaDocErr;
    private String blXml;
    private String cdVersioneXml;
    private VrsSesUpdUnitaDocErr vrsSesUpdUnitaDocErr;
    private TiXmlVrsXmlSesUpdUnitaDocErr tiXml;

    public VrsXmlSesUpdUnitaDocErr() {
    }

    @Id
    @SequenceGenerator(name = "VRS_XML_SES_UPD_UNITA_DOC_ERR_IDXMLSESUPDUNITADOCERR_GENERATOR", sequenceName = "SVRS_XML_SES_UPD_UNITA_DOC_ERR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_XML_SES_UPD_UNITA_DOC_ERR_IDXMLSESUPDUNITADOCERR_GENERATOR")
    @Column(name = "ID_XML_SES_UPD_UNITA_DOC_ERR")
    public long getIdXmlSesUpdUnitaDocErr() {
        return this.idXmlSesUpdUnitaDocErr;
    }

    public void setIdXmlSesUpdUnitaDocErr(long idXmlSesUpdUnitaDocErr) {
        this.idXmlSesUpdUnitaDocErr = idXmlSesUpdUnitaDocErr;
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

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SES_UPD_UD_ERR")
    public VrsSesUpdUnitaDocErr getVrsSesUpdUnitaDocErr() {
        return this.vrsSesUpdUnitaDocErr;
    }

    public void setVrsSesUpdUnitaDocErr(VrsSesUpdUnitaDocErr vrsSesUpdUnitaDocErr) {
        this.vrsSesUpdUnitaDocErr = vrsSesUpdUnitaDocErr;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_XML")
    public TiXmlVrsXmlSesUpdUnitaDocErr getTiXml() {
        return this.tiXml;
    }

    public void setTiXml(TiXmlVrsXmlSesUpdUnitaDocErr tiXml) {
        this.tiXml = tiXml;
    }

}