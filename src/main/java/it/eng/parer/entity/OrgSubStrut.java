package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the ORG_SUB_STRUT database table.
 *
 */
@Entity
@Table(name = "ORG_SUB_STRUT")
@NamedQuery(name = "OrgSubStrut.findAll", query = "SELECT o FROM OrgSubStrut o")
public class OrgSubStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idSubStrut;
    private String dsSubStrut;
    private String nmSubStrut;
    private List<OrgCampoValSubStrut> orgCampoValSubStruts;
    private List<OrgPartitionSubStrut> orgPartitionSubStruts;
    private OrgStrut orgStrut;
    private List<AroUnitaDoc> aroUnitaDocs;

    public OrgSubStrut() {
    }

    @Id
    @SequenceGenerator(name = "ORG_SUB_STRUT_IDSUBSTRUT_GENERATOR", sequenceName = "SORG_SUB_STRUT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_SUB_STRUT_IDSUBSTRUT_GENERATOR")
    @Column(name = "ID_SUB_STRUT")
    public long getIdSubStrut() {
        return this.idSubStrut;
    }

    public void setIdSubStrut(long idSubStrut) {
        this.idSubStrut = idSubStrut;
    }

    @Column(name = "DS_SUB_STRUT")
    public String getDsSubStrut() {
        return this.dsSubStrut;
    }

    public void setDsSubStrut(String dsSubStrut) {
        this.dsSubStrut = dsSubStrut;
    }

    @Column(name = "NM_SUB_STRUT")
    public String getNmSubStrut() {
        return this.nmSubStrut;
    }

    public void setNmSubStrut(String nmSubStrut) {
        this.nmSubStrut = nmSubStrut;
    }

    // bi-directional many-to-one association to OrgCampoValSubStrut
    @OneToMany(mappedBy = "orgSubStrut")
    @XmlIDREF
    public List<OrgCampoValSubStrut> getOrgCampoValSubStruts() {
        return this.orgCampoValSubStruts;
    }

    public void setOrgCampoValSubStruts(List<OrgCampoValSubStrut> orgCampoValSubStruts) {
        this.orgCampoValSubStruts = orgCampoValSubStruts;
    }

    // bi-directional many-to-one association to OrgPartitionSubStrut
    @OneToMany(mappedBy = "orgSubStrut", cascade = CascadeType.REMOVE)
    @XmlTransient
    public List<OrgPartitionSubStrut> getOrgPartitionSubStruts() {
        return this.orgPartitionSubStruts;
    }

    public void setOrgPartitionSubStruts(List<OrgPartitionSubStrut> orgPartitionSubStruts) {
        this.orgPartitionSubStruts = orgPartitionSubStruts;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "orgSubStruts")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @OneToMany(mappedBy = "orgSubStrut")
    @XmlTransient
    public List<AroUnitaDoc> getAroUnitaDocs() {
        return this.aroUnitaDocs;
    }

    public void setAroUnitaDocs(List<AroUnitaDoc> aroUnitaDocs) {
        this.aroUnitaDocs = aroUnitaDocs;
    }
}