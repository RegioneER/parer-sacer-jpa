package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_VERS_INI_LINK_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_VERS_INI_LINK_UNITA_DOC")
@NamedQuery(name = "AroVersIniLinkUnitaDoc.findAll", query = "SELECT a FROM AroVersIniLinkUnitaDoc a")
public class AroVersIniLinkUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idVersIniLinkUnitaDoc;
    private BigDecimal aaKeyUnitaDocLink;
    private String cdKeyUnitaDocLink;
    private String cdRegistroKeyUnitaDocLink;
    private String dsLinkUnitaDoc;
    private AroUnitaDoc aroVersUnitaDocLink;
    private AroVersIniUnitaDoc aroVersIniUnitaDoc;

    public AroVersIniLinkUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_VERS_INI_LINK_UNITA_DOC_IDVERSINILINKUNITADOC_GENERATOR", sequenceName = "SARO_VERS_INI_LINK_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_VERS_INI_LINK_UNITA_DOC_IDVERSINILINKUNITADOC_GENERATOR")
    @Column(name = "ID_VERS_INI_LINK_UNITA_DOC")
    public long getIdVersIniLinkUnitaDoc() {
        return this.idVersIniLinkUnitaDoc;
    }

    public void setIdVersIniLinkUnitaDoc(long idVersIniLinkUnitaDoc) {
        this.idVersIniLinkUnitaDoc = idVersIniLinkUnitaDoc;
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

    // bi-directional many-to-one association to AroVersIniUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC_LINK")
    public AroUnitaDoc getAroVersUnitaDocLink() {
        return this.aroVersUnitaDocLink;
    }

    public void setAroVersUnitaDocLink(AroUnitaDoc aroVersUnitaDocLink) {
        this.aroVersUnitaDocLink = aroVersUnitaDocLink;
    }

    // bi-directional many-to-one association to AroVersIniUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERS_INI_UNITA_DOC")
    public AroVersIniUnitaDoc getAroVersIniUnitaDoc() {
        return this.aroVersIniUnitaDoc;
    }

    public void setAroVersIniUnitaDoc(AroVersIniUnitaDoc aroVersIniUnitaDoc) {
        this.aroVersIniUnitaDoc = aroVersIniUnitaDoc;
    }

}