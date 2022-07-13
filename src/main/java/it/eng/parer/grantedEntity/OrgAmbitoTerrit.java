package it.eng.parer.grantedEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the ORG_AMBITO_TERRIT database table.
 * 
 */
@Entity
@Table(name = "SACER_IAM.ORG_AMBITO_TERRIT")
public class OrgAmbitoTerrit implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idAmbitoTerrit;
    private String cdAmbitoTerrit;
    private String tiAmbitoTerrit;
    private OrgAmbitoTerrit orgAmbitoTerrit;
    private List<OrgAmbitoTerrit> orgAmbitoTerrits;

    public OrgAmbitoTerrit() {
    }

    @Id
    @SequenceGenerator(name = "ORG_AMBITO_TERRIT_IDAMBITOTERRIT_GENERATOR", sequenceName = "SORG_AMBITO_TERRIT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_AMBITO_TERRIT_IDAMBITOTERRIT_GENERATOR")
    @Column(name = "ID_AMBITO_TERRIT")
    public long getIdAmbitoTerrit() {
        return this.idAmbitoTerrit;
    }

    public void setIdAmbitoTerrit(long idAmbitoTerrit) {
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