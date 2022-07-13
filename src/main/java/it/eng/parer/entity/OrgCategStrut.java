package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the ORG_CATEG_STRUT database table.
 *
 */
@Entity
@Table(name = "ORG_CATEG_STRUT")
public class OrgCategStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idCategStrut;
    private String cdCategStrut;
    private String dsCategStrut;
    private List<OrgStrut> orgStruts;

    public OrgCategStrut() {
    }

    @Id
    @SequenceGenerator(name = "ORG_CATEG_STRUT_IDCATEGSTRUT_GENERATOR", sequenceName = "SORG_CATEG_STRUT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_CATEG_STRUT_IDCATEGSTRUT_GENERATOR")
    @Column(name = "ID_CATEG_STRUT")
    public long getIdCategStrut() {
        return this.idCategStrut;
    }

    public void setIdCategStrut(long idCategStrut) {
        this.idCategStrut = idCategStrut;
    }

    @Column(name = "CD_CATEG_STRUT")
    public String getCdCategStrut() {
        return this.cdCategStrut;
    }

    public void setCdCategStrut(String cdCategStrut) {
        this.cdCategStrut = cdCategStrut;
    }

    @Column(name = "DS_CATEG_STRUT")
    public String getDsCategStrut() {
        return this.dsCategStrut;
    }

    public void setDsCategStrut(String dsCategStrut) {
        this.dsCategStrut = dsCategStrut;
    }

    // bi-directional many-to-one association to OrgStrut
    @OneToMany(mappedBy = "orgCategStrut")
    @XmlTransient
    public List<OrgStrut> getOrgStruts() {
        return this.orgStruts;
    }

    public void setOrgStruts(List<OrgStrut> orgStruts) {
        this.orgStruts = orgStruts;
    }

}
