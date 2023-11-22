package it.eng.parer.grantedEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the ORG_AMBITO_TERRIT database table.
 */
@Entity
@Table(schema = "SACER_IAM", name = "ORG_AMBITO_TERRIT")
public class OrgAmbitoTerrit implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idAmbitoTerrit;

    private String cdAmbitoTerrit;

    private String tiAmbitoTerrit;

    private OrgAmbitoTerrit orgAmbitoTerrit;

    private List<OrgAmbitoTerrit> orgAmbitoTerrits = new ArrayList<>();

    public OrgAmbitoTerrit() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_AMBITO_TERRIT")
    public Long getIdAmbitoTerrit() {
        return this.idAmbitoTerrit;
    }

    public void setIdAmbitoTerrit(Long idAmbitoTerrit) {
        this.idAmbitoTerrit = idAmbitoTerrit;
    }

    @Column(name = "CD_AMBITO_TERRIT")
    public String getCdAmbitoTerrit() {
        return this.cdAmbitoTerrit;
    }

    public void setCdAmbitoTerrit(String cdAmbitoTerrit) {
        this.cdAmbitoTerrit = cdAmbitoTerrit;
    }

    @Column(name = "TI_AMBITO_TERRIT")
    public String getTiAmbitoTerrit() {
        return this.tiAmbitoTerrit;
    }

    public void setTiAmbitoTerrit(String tiAmbitoTerrit) {
        this.tiAmbitoTerrit = tiAmbitoTerrit;
    }

    // bi-directional many-to-one association to OrgAmbitoTerrit
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AMBITO_TERRIT_PADRE")
    public OrgAmbitoTerrit getOrgAmbitoTerrit() {
        return this.orgAmbitoTerrit;
    }

    public void setOrgAmbitoTerrit(OrgAmbitoTerrit orgAmbitoTerrit) {
        this.orgAmbitoTerrit = orgAmbitoTerrit;
    }

    // bi-directional many-to-one association to OrgAmbitoTerrit
    @OneToMany(mappedBy = "orgAmbitoTerrit")
    @XmlTransient
    public List<OrgAmbitoTerrit> getOrgAmbitoTerrits() {
        return this.orgAmbitoTerrits;
    }

    public void setOrgAmbitoTerrits(List<OrgAmbitoTerrit> orgAmbitoTerrits) {
        this.orgAmbitoTerrits = orgAmbitoTerrits;
    }
}
