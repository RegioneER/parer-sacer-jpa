package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_LINK_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_LINK_UNITA_DOC")
public class AroLinkUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idLinkUnitaDoc;
    private BigDecimal aaKeyUnitaDocLink;
    private String cdKeyUnitaDocLink;
    private String cdRegistroKeyUnitaDocLink;
    private String dsLinkUnitaDoc;
    private BigDecimal idStrut;
    private AroUnitaDoc aroUnitaDocLink;
    private AroUnitaDoc aroUnitaDoc;

    public AroLinkUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_LINK_UNITA_DOC_IDLINKUNITADOC_GENERATOR", sequenceName = "SARO_LINK_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_LINK_UNITA_DOC_IDLINKUNITADOC_GENERATOR")
    @Column(name = "ID_LINK_UNITA_DOC")
    public long getIdLinkUnitaDoc() {
        return this.idLinkUnitaDoc;
    }

    public void setIdLinkUnitaDoc(long idLinkUnitaDoc) {
        this.idLinkUnitaDoc = idLinkUnitaDoc;
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

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC_LINK")
    public AroUnitaDoc getAroUnitaDocLink() {
        return this.aroUnitaDocLink;
    }

    public void setAroUnitaDocLink(AroUnitaDoc aroUnitaDocLink) {
        this.aroUnitaDocLink = aroUnitaDocLink;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }

}