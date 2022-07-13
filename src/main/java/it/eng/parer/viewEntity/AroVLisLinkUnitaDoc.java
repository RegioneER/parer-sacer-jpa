package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_LIS_LINK_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_V_LIS_LINK_UNITA_DOC")
public class AroVLisLinkUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal aaKeyUnitaDocLink;
    private String cdKeyUnitaDocLink;
    private String cdRegistroKeyUnitaDocLink;
    private String dsLinkUnitaDoc;
    private Date dtRegUnitaDoc;
    private String flRisolto;
    private BigDecimal idLinkUnitaDoc;
    private BigDecimal idUnitaDoc;
    private BigDecimal idUnitaDocColleg;

    public AroVLisLinkUnitaDoc() {
    }

    @Column(name = "AA_KEY_UNITA_DOC_LINK")
    public BigDecimal getAaKeyUnitaDocLink() {
        return this.aaKeyUnitaDocLink;
    }

    public void setAaKeyUnitaDocLink(BigDecimal aaKeyUnitaDocLink) {
        this.aaKeyUnitaDocLink = aaKeyUnitaDocLink;
    }

    @Column(name = "CD_KEY_UNITA_DOC_LINK")
    public String getCdKeyUnitaDocLink() {
        return this.cdKeyUnitaDocLink;
    }

    public void setCdKeyUnitaDocLink(String cdKeyUnitaDocLink) {
        this.cdKeyUnitaDocLink = cdKeyUnitaDocLink;
    }

    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC_LINK")
    public String getCdRegistroKeyUnitaDocLink() {
        return this.cdRegistroKeyUnitaDocLink;
    }

    public void setCdRegistroKeyUnitaDocLink(String cdRegistroKeyUnitaDocLink) {
        this.cdRegistroKeyUnitaDocLink = cdRegistroKeyUnitaDocLink;
    }

    @Column(name = "DS_LINK_UNITA_DOC")
    public String getDsLinkUnitaDoc() {
        return this.dsLinkUnitaDoc;
    }

    public void setDsLinkUnitaDoc(String dsLinkUnitaDoc) {
        this.dsLinkUnitaDoc = dsLinkUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_UNITA_DOC")
    public Date getDtRegUnitaDoc() {
        return this.dtRegUnitaDoc;
    }

    public void setDtRegUnitaDoc(Date dtRegUnitaDoc) {
        this.dtRegUnitaDoc = dtRegUnitaDoc;
    }

    @Column(name = "FL_RISOLTO")
    public String getFlRisolto() {
        return this.flRisolto;
    }

    public void setFlRisolto(String flRisolto) {
        this.flRisolto = flRisolto;
    }

    @Id
    @Column(name = "ID_LINK_UNITA_DOC")
    public BigDecimal getIdLinkUnitaDoc() {
        return this.idLinkUnitaDoc;
    }

    public void setIdLinkUnitaDoc(BigDecimal idLinkUnitaDoc) {
        this.idLinkUnitaDoc = idLinkUnitaDoc;
    }

    @Id
    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Column(name = "ID_UNITA_DOC_COLLEG")
    public BigDecimal getIdUnitaDocColleg() {
        return this.idUnitaDocColleg;
    }

    public void setIdUnitaDocColleg(BigDecimal idUnitaDocColleg) {
        this.idUnitaDocColleg = idUnitaDocColleg;
    }

}