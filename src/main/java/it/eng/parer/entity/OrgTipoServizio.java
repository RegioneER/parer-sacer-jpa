package it.eng.parer.entity;

import it.eng.parer.grantedEntity.OrgServizioErog;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the ORG_TIPO_SERVIZIO database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.ORG_TIPO_SERVIZIO")
@NamedQuery(name = "OrgTipoServizio.findAll", query = "SELECT o FROM OrgTipoServizio o")
public class OrgTipoServizio implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idTipoServizio;
    private String cdTipoServizio;
    private String dsTipoServizio;
    private String ggFatturazione;
    private String tiClasseTipoServizio;
    private String tipoFatturazione;
    private List<OrgServizioErog> orgServizioErogs;
    // private List<OrgTariffa> orgTariffas;

    public OrgTipoServizio() {
    }

    @Id
    @SequenceGenerator(name = "ORG_TIPO_SERVIZIO_IDTIPOSERVIZIO_GENERATOR", sequenceName = "SACER_IAM.SORG_TIPO_SERVIZIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_TIPO_SERVIZIO_IDTIPOSERVIZIO_GENERATOR")
    @Column(name = "ID_TIPO_SERVIZIO")
    @XmlID
    public long getIdTipoServizio() {
        return this.idTipoServizio;
    }

    public void setIdTipoServizio(long idTipoServizio) {
        this.idTipoServizio = idTipoServizio;
    }

    @Column(name = "CD_TIPO_SERVIZIO")
    public String getCdTipoServizio() {
        return this.cdTipoServizio;
    }

    public void setCdTipoServizio(String cdTipoServizio) {
        this.cdTipoServizio = cdTipoServizio;
    }

    @XmlTransient
    @Column(name = "DS_TIPO_SERVIZIO")
    public String getDsTipoServizio() {
        return this.dsTipoServizio;
    }

    public void setDsTipoServizio(String dsTipoServizio) {
        this.dsTipoServizio = dsTipoServizio;
    }

    @XmlTransient
    @Column(name = "GG_FATTURAZIONE")
    public String getGgFatturazione() {
        return this.ggFatturazione;
    }

    public void setGgFatturazione(String ggFatturazione) {
        this.ggFatturazione = ggFatturazione;
    }

    @XmlTransient
    @Column(name = "TI_CLASSE_TIPO_SERVIZIO")
    public String getTiClasseTipoServizio() {
        return this.tiClasseTipoServizio;
    }

    public void setTiClasseTipoServizio(String tiClasseTipoServizio) {
        this.tiClasseTipoServizio = tiClasseTipoServizio;
    }

    @XmlTransient
    @Column(name = "TIPO_FATTURAZIONE")
    public String getTipoFatturazione() {
        return this.tipoFatturazione;
    }

    public void setTipoFatturazione(String tipoFatturazione) {
        this.tipoFatturazione = tipoFatturazione;
    }

    // bi-directional many-to-one association to OrgServizioErog
    @XmlTransient
    @OneToMany(mappedBy = "orgTipoServizio")
    public List<OrgServizioErog> getOrgServizioErogs() {
        return this.orgServizioErogs;
    }

    public void setOrgServizioErogs(List<OrgServizioErog> orgServizioErogs) {
        this.orgServizioErogs = orgServizioErogs;
    }

    public OrgServizioErog addOrgServizioErog(OrgServizioErog orgServizioErog) {
        getOrgServizioErogs().add(orgServizioErog);
        orgServizioErog.setOrgTipoServizio(this);

        return orgServizioErog;
    }

    public OrgServizioErog removeOrgServizioErog(OrgServizioErog orgServizioErog) {
        getOrgServizioErogs().remove(orgServizioErog);
        orgServizioErog.setOrgTipoServizio(null);

        return orgServizioErog;
    }
    //
    // //bi-directional many-to-one association to OrgTariffa
    // @OneToMany(mappedBy = "orgTipoServizio")
    // public List<OrgTariffa> getOrgTariffas() {
    // return this.orgTariffas;
    // }
    //
    // public void setOrgTariffas(List<OrgTariffa> orgTariffas) {
    // this.orgTariffas = orgTariffas;
    // }
    //
    // public OrgTariffa addOrgTariffa(OrgTariffa orgTariffa) {
    // getOrgTariffas().add(orgTariffa);
    // orgTariffa.setOrgTipoServizio(this);
    //
    // return orgTariffa;
    // }
    //
    // public OrgTariffa removeOrgTariffa(OrgTariffa orgTariffa) {
    // getOrgTariffas().remove(orgTariffa);
    // orgTariffa.setOrgTipoServizio(null);
    //
    // return orgTariffa;
    // }

}
