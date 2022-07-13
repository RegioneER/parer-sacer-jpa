package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_UPD_LINK_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_UPD_LINK_UNITA_DOC")
@NamedQuery(name = "AroUpdLinkUnitaDoc.findAll", query = "SELECT a FROM AroUpdLinkUnitaDoc a")
public class AroUpdLinkUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUpdLinkUnitaDoc;
    private BigDecimal aaKeyUnitaDocLink;
    private String cdKeyUnitaDocLink;
    private String cdRegistroKeyUnitaDocLink;
    private String dsLinkUnitaDoc;
    private AroUnitaDoc aroUnitaDocLink;
    private AroUpdUnitaDoc aroUpdUnitaDoc;

    public AroUpdLinkUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UPD_LINK_UNITA_DOC_IDUPDLINKUNITADOC_GENERATOR", sequenceName = "SARO_UPD_LINK_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UPD_LINK_UNITA_DOC_IDUPDLINKUNITADOC_GENERATOR")
    @Column(name = "ID_UPD_LINK_UNITA_DOC")
    public long getIdUpdLinkUnitaDoc() {
        return this.idUpdLinkUnitaDoc;
    }

    public void setIdUpdLinkUnitaDoc(long idUpdLinkUnitaDoc) {
        this.idUpdLinkUnitaDoc = idUpdLinkUnitaDoc;
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

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC_LINK")
    public AroUnitaDoc getAroUnitaDocLink() {
        return this.aroUnitaDocLink;
    }

    public void setAroUnitaDocLink(AroUnitaDoc aroUnitaDocLink) {
        this.aroUnitaDocLink = aroUnitaDocLink;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }

}