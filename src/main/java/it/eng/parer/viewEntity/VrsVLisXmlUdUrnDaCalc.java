package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the VRS_V_LIS_XML_UD_URN_DA_CALC database table.
 *
 */
@Entity
@Table(name = "VRS_V_LIS_XML_UD_URN_DA_CALC")
@NamedQuery(name = "VolVLisXmlUdUrnDaCalc.findAll", query = "SELECT v FROM VrsVLisXmlUdUrnDaCalc v")
public class VrsVLisXmlUdUrnDaCalc implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private BigDecimal idXmlDatiSessioneVers;
    private String tiXmlDati;
    private String nmStrut;
    private String nmEnte;
    private String dsUrnXmlVers;
    private String cdStrutNormaliz;
    private String cdRegistroNormaliz;
    private String cdRegistroKeyUnitaDoc;
    private String cdKeyUnitaDocNormaliz;
    private String cdKeyUnitaDoc;
    private String cdEnteNormaliz;
    private BigDecimal aaKeyUnitaDoc;

    public VrsVLisXmlUdUrnDaCalc() {
    }

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Id
    @Column(name = "ID_XML_DATI_SESSIONE_VERS")
    public BigDecimal getIdXmlDatiSessioneVers() {
        return idXmlDatiSessioneVers;
    }

    public void setIdXmlDatiSessioneVers(BigDecimal idXmlDatiSessioneVers) {
        this.idXmlDatiSessioneVers = idXmlDatiSessioneVers;
    }

    @Column(name = "TI_XML_DATI")
    public String getTiXmlDati() {
        return tiXmlDati;
    }

    public void setTiXmlDati(String tiXmlDati) {
        this.tiXmlDati = tiXmlDati;
    }

    @Column(name = "NM_STRUT")
    public String getNmStrut() {
        return nmStrut;
    }

    public void setNmStrut(String nmStrut) {
        this.nmStrut = nmStrut;
    }

    @Column(name = "NM_ENTE")
    public String getNmEnte() {
        return nmEnte;
    }

    public void setNmEnte(String nmEnte) {
        this.nmEnte = nmEnte;
    }

    @Column(name = "DS_URN_XML_VERS")
    public String getDsUrnXmlVers() {
        return dsUrnXmlVers;
    }

    public void setDsUrnXmlVers(String dsUrnXmlVers) {
        this.dsUrnXmlVers = dsUrnXmlVers;
    }

    @Column(name = "CD_STRUT_NORMALIZ")
    public String getCdStrutNormaliz() {
        return cdStrutNormaliz;
    }

    public void setCdStrutNormaliz(String cdStrutNormaliz) {
        this.cdStrutNormaliz = cdStrutNormaliz;
    }

    @Column(name = "CD_REGISTRO_NORMALIZ")
    public String getCdRegistroNormaliz() {
        return cdRegistroNormaliz;
    }

    public void setCdRegistroNormaliz(String cdRegistroNormaliz) {
        this.cdRegistroNormaliz = cdRegistroNormaliz;
    }

    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC")
    public String getCdRegistroKeyUnitaDoc() {
        return cdRegistroKeyUnitaDoc;
    }

    public void setCdRegistroKeyUnitaDoc(String cdRegistroKeyUnitaDoc) {
        this.cdRegistroKeyUnitaDoc = cdRegistroKeyUnitaDoc;
    }

    @Column(name = "CD_KEY_UNITA_DOC_NORMALIZ")
    public String getCdKeyUnitaDocNormaliz() {
        return cdKeyUnitaDocNormaliz;
    }

    public void setCdKeyUnitaDocNormaliz(String cdKeyUnitaDocNormaliz) {
        this.cdKeyUnitaDocNormaliz = cdKeyUnitaDocNormaliz;
    }

    @Column(name = "CD_KEY_UNITA_DOC")
    public String getCdKeyUnitaDoc() {
        return cdKeyUnitaDoc;
    }

    public void setCdKeyUnitaDoc(String cdKeyUnitaDoc) {
        this.cdKeyUnitaDoc = cdKeyUnitaDoc;
    }

    @Column(name = "CD_ENTE_NORMALIZ")
    public String getCdEnteNormaliz() {
        return cdEnteNormaliz;
    }

    public void setCdEnteNormaliz(String cdEnteNormaliz) {
        this.cdEnteNormaliz = cdEnteNormaliz;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

}
