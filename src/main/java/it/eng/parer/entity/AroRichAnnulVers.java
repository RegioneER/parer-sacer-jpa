package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the ARO_RICH_ANNUL_VERS database table.
 *
 */
@Entity
@Table(name = "ARO_RICH_ANNUL_VERS")
@NamedQuery(name = "AroRichAnnulVers.findAll", query = "SELECT a FROM AroRichAnnulVers a")
public class AroRichAnnulVers implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idRichAnnulVers;
    private String cdRichAnnulVers;
    private String dsRichAnnulVers;
    private Date dtCreazioneRichAnnulVers;
    private String flForzaAnnul;
    private String flImmediata;
    private String flRichPing;
    private BigDecimal idStatoRichAnnulVersCor;
    private String ntRichAnnulVers;
    private String tiCreazioneRichAnnulVers;
    private String tiRichAnnulVers;
    private List<AroFileRichAnnulVers> aroFileRichAnnulVers;
    private List<AroItemRichAnnulVers> aroItemRichAnnulVers;
    private OrgStrut orgStrut;
    private List<AroStatoRichAnnulVers> aroStatoRichAnnulVers;
    private List<AroXmlRichAnnulVers> aroXmlRichAnnulVers;

    public AroRichAnnulVers() {
    }

    @Id
    @SequenceGenerator(name = "ARO_RICH_ANNUL_VERS_IDRICHANNULVERS_GENERATOR", sequenceName = "SARO_RICH_ANNUL_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_RICH_ANNUL_VERS_IDRICHANNULVERS_GENERATOR")
    @Column(name = "ID_RICH_ANNUL_VERS")
    public long getIdRichAnnulVers() {
        return this.idRichAnnulVers;
    }

    public void setIdRichAnnulVers(long idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }

    @Column(name = "CD_RICH_ANNUL_VERS")
    public String getCdRichAnnulVers() {
        return this.cdRichAnnulVers;
    }

    public void setCdRichAnnulVers(String cdRichAnnulVers) {
        this.cdRichAnnulVers = cdRichAnnulVers;
    }

    @Column(name = "DS_RICH_ANNUL_VERS")
    public String getDsRichAnnulVers() {
        return this.dsRichAnnulVers;
    }

    public void setDsRichAnnulVers(String dsRichAnnulVers) {
        this.dsRichAnnulVers = dsRichAnnulVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE_RICH_ANNUL_VERS")
    public Date getDtCreazioneRichAnnulVers() {
        return this.dtCreazioneRichAnnulVers;
    }

    public void setDtCreazioneRichAnnulVers(Date dtCreazioneRichAnnulVers) {
        this.dtCreazioneRichAnnulVers = dtCreazioneRichAnnulVers;
    }

    @Column(name = "FL_FORZA_ANNUL")
    public String getFlForzaAnnul() {
        return this.flForzaAnnul;
    }

    public void setFlForzaAnnul(String flForzaAnnul) {
        this.flForzaAnnul = flForzaAnnul;
    }

    @Column(name = "FL_IMMEDIATA")
    public String getFlImmediata() {
        return this.flImmediata;
    }

    public void setFlImmediata(String flImmediata) {
        this.flImmediata = flImmediata;
    }

    @Column(name = "FL_RICH_PING")
    public String getFlRichPing() {
        return this.flRichPing;
    }

    public void setFlRichPing(String flRichPing) {
        this.flRichPing = flRichPing;
    }

    @Column(name = "ID_STATO_RICH_ANNUL_VERS_COR")
    public BigDecimal getIdStatoRichAnnulVersCor() {
        return this.idStatoRichAnnulVersCor;
    }

    public void setIdStatoRichAnnulVersCor(BigDecimal idStatoRichAnnulVersCor) {
        this.idStatoRichAnnulVersCor = idStatoRichAnnulVersCor;
    }

    @Column(name = "NT_RICH_ANNUL_VERS")
    public String getNtRichAnnulVers() {
        return this.ntRichAnnulVers;
    }

    public void setNtRichAnnulVers(String ntRichAnnulVers) {
        this.ntRichAnnulVers = ntRichAnnulVers;
    }

    @Column(name = "TI_CREAZIONE_RICH_ANNUL_VERS")
    public String getTiCreazioneRichAnnulVers() {
        return this.tiCreazioneRichAnnulVers;
    }

    public void setTiCreazioneRichAnnulVers(String tiCreazioneRichAnnulVers) {
        this.tiCreazioneRichAnnulVers = tiCreazioneRichAnnulVers;
    }

    @Column(name = "TI_RICH_ANNUL_VERS")
    public String getTiRichAnnulVers() {
        return this.tiRichAnnulVers;
    }

    public void setTiRichAnnulVers(String tiRichAnnulVers) {
        this.tiRichAnnulVers = tiRichAnnulVers;
    }

    // bi-directional many-to-one association to AroFileRichAnnulVers
    @OneToMany(mappedBy = "aroRichAnnulVers", cascade = CascadeType.PERSIST)
    public List<AroFileRichAnnulVers> getAroFileRichAnnulVers() {
        return this.aroFileRichAnnulVers;
    }

    public void setAroFileRichAnnulVers(List<AroFileRichAnnulVers> aroFileRichAnnulVers) {
        this.aroFileRichAnnulVers = aroFileRichAnnulVers;
    }

    public AroFileRichAnnulVers addAroFileRichAnnulVer(AroFileRichAnnulVers aroFileRichAnnulVers) {
        getAroFileRichAnnulVers().add(aroFileRichAnnulVers);
        aroFileRichAnnulVers.setAroRichAnnulVers(this);

        return aroFileRichAnnulVers;
    }

    public AroFileRichAnnulVers removeAroFileRichAnnulVer(AroFileRichAnnulVers aroFileRichAnnulVers) {
        getAroFileRichAnnulVers().remove(aroFileRichAnnulVers);
        aroFileRichAnnulVers.setAroRichAnnulVers(null);

        return aroFileRichAnnulVers;
    }

    // bi-directional many-to-one association to AroItemRichAnnulVers
    @OneToMany(mappedBy = "aroRichAnnulVers", cascade = CascadeType.PERSIST)
    public List<AroItemRichAnnulVers> getAroItemRichAnnulVers() {
        return this.aroItemRichAnnulVers;
    }

    public void setAroItemRichAnnulVers(List<AroItemRichAnnulVers> aroItemRichAnnulVers) {
        this.aroItemRichAnnulVers = aroItemRichAnnulVers;
    }

    public AroItemRichAnnulVers addAroItemRichAnnulVers(AroItemRichAnnulVers aroItemRichAnnulVers) {
        getAroItemRichAnnulVers().add(aroItemRichAnnulVers);
        aroItemRichAnnulVers.setAroRichAnnulVers(this);

        return aroItemRichAnnulVers;
    }

    public AroItemRichAnnulVers removeAroItemRichAnnulVer(AroItemRichAnnulVers aroItemRichAnnulVers) {
        getAroItemRichAnnulVers().remove(aroItemRichAnnulVers);
        aroItemRichAnnulVers.setAroRichAnnulVers(null);

        return aroItemRichAnnulVers;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to AroStatoRichAnnulVers
    @OneToMany(mappedBy = "aroRichAnnulVers", cascade = CascadeType.PERSIST)
    public List<AroStatoRichAnnulVers> getAroStatoRichAnnulVers() {
        return this.aroStatoRichAnnulVers;
    }

    public void setAroStatoRichAnnulVers(List<AroStatoRichAnnulVers> aroStatoRichAnnulVers) {
        this.aroStatoRichAnnulVers = aroStatoRichAnnulVers;
    }

    public AroStatoRichAnnulVers addAroStatoRichAnnulVers(AroStatoRichAnnulVers aroStatoRichAnnulVer) {
        getAroStatoRichAnnulVers().add(aroStatoRichAnnulVer);
        aroStatoRichAnnulVer.setAroRichAnnulVers(this);

        return aroStatoRichAnnulVer;
    }

    public AroStatoRichAnnulVers removeAroStatoRichAnnulVers(AroStatoRichAnnulVers aroStatoRichAnnulVer) {
        getAroStatoRichAnnulVers().remove(aroStatoRichAnnulVer);
        aroStatoRichAnnulVer.setAroRichAnnulVers(null);

        return aroStatoRichAnnulVer;
    }

    // bi-directional many-to-one association to AroXmlRichAnnulVer
    @OneToMany(mappedBy = "aroRichAnnulVers", cascade = CascadeType.PERSIST)
    public List<AroXmlRichAnnulVers> getAroXmlRichAnnulVers() {
        return this.aroXmlRichAnnulVers;
    }

    public void setAroXmlRichAnnulVers(List<AroXmlRichAnnulVers> aroXmlRichAnnulVers) {
        this.aroXmlRichAnnulVers = aroXmlRichAnnulVers;
    }

    public AroXmlRichAnnulVers addAroXmlRichAnnulVers(AroXmlRichAnnulVers aroXmlRichAnnulVers) {
        getAroXmlRichAnnulVers().add(aroXmlRichAnnulVers);
        aroXmlRichAnnulVers.setAroRichAnnulVers(this);
        return aroXmlRichAnnulVers;
    }

    public AroXmlRichAnnulVers removeAroXmlRichAnnulVers(AroXmlRichAnnulVers aroXmlRichAnnulVers) {
        getAroXmlRichAnnulVers().remove(aroXmlRichAnnulVers);
        aroXmlRichAnnulVers.setAroRichAnnulVers(null);

        return aroXmlRichAnnulVers;
    }

}
