package it.eng.parer.entity;

import it.eng.parer.grantedEntity.SIOrgEnteSiam;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the ORG_STRUT database table.
 *
 */
@Entity
@XmlRootElement
@Cacheable(true)
@Table(name = "ORG_STRUT")
public class OrgStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idStrut;
    private String cdIpa;
    private String dlNoteStrut;
    private String dsStrut;
    private String cdStrutNormaliz;
    private Date dtIniVal;
    private Date dtFineVal;
    private Date dtIniValStrut;
    private Date dtFineValStrut;
    private String flTemplate;
    private BigDecimal idEnteConvenz;
    private String nmStrut;
    private List<AroRichAnnulVers> aroRichAnnulVers;
    private List<AroUnitaDoc> aroUnitaDocs;
    private List<DecAttribDatiSpec> decAttribDatiSpecs;
    private List<DecCriterioRaggr> decCriterioRaggrs;
    private List<DecFormatoFileDoc> decFormatoFileDocs;
    private List<DecRegistroUnitaDoc> decRegistroUnitaDocs;
    private List<DecTipoDoc> decTipoDocs;
    private List<DecTipoRapprComp> decTipoRapprComps;
    private List<DecTipoSerie> decTipoSeries;
    private List<DecTipoStrutDoc> decTipoStrutDocs;
    private List<DecTipoUnitaDoc> decTipoUnitaDocs;
    private List<DecTitol> decTitols;
    private List<DecXsdDatiSpec> decXsdDatiSpecs;
    private List<ElvElencoVer> elvElencoVers;
    private List<ElvLogElencoVer> elvLogElencoVers;
    private List<LogJob> logJobs;
    private List<LogLockElab> logLockElabs;
    private List<LogOper> logOpers;
    private List<OrgOperTitol> orgOperTitols;
    private List<OrgPartitionStrut> orgPartitionStruts;
    private OrgCategStrut orgCategStrut;
    private OrgEnte orgEnte;
    private List<DecTipoFascicolo> decTipoFascicolos;
    private List<OrgSubStrut> orgSubStruts;
    private List<OrgUsoSistemaMigraz> orgUsoSistemaMigrazs;
    private List<SerSerie> serSeries;
    private List<VolVolumeConserv> volVolumeConservs;
    private List<VrsDocNonVer> vrsDocNonVers;
    private List<VrsSessioneVers> vrsSessioneVers;
    private List<VrsUnitaDocNonVer> vrsUnitaDocNonVers;
    private List<DecUsoModelloTipoSerie> decUsoModelloTipoSeries;
    private List<AplValoreParamApplic> aplValoreParamApplics;
    private String flCessato;
    private String flArchivioRestituito;

    public OrgStrut() {
    }

    @Id
    @SequenceGenerator(name = "ORG_STRUT_IDSTRUT_GENERATOR", sequenceName = "SORG_STRUT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_STRUT_IDSTRUT_GENERATOR")
    @Column(name = "ID_STRUT")
    public long getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(long idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "CD_IPA")
    public String getCdIpa() {
        return cdIpa;
    }

    public void setCdIpa(String cdIpa) {
        this.cdIpa = cdIpa;
    }

    @Column(name = "DL_NOTE_STRUT")
    public String getDlNoteStrut() {
        return this.dlNoteStrut;
    }

    public void setDlNoteStrut(String dlNoteStrut) {
        this.dlNoteStrut = dlNoteStrut;
    }

    @Column(name = "DS_STRUT")
    public String getDsStrut() {
        return this.dsStrut;
    }

    public void setDsStrut(String dsStrut) {
        this.dsStrut = dsStrut;
    }

    @Column(name = "CD_STRUT_NORMALIZ")
    public String getCdStrutNormaliz() {
        return this.cdStrutNormaliz;
    }

    public void setCdStrutNormaliz(String cdStrutNormaliz) {
        this.cdStrutNormaliz = cdStrutNormaliz;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL")
    public Date getDtIniVal() {
        return dtIniVal;
    }

    public void setDtIniVal(Date dtIniVal) {
        this.dtIniVal = dtIniVal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FINE_VAL")
    public Date getDtFineVal() {
        return dtFineVal;
    }

    public void setDtFineVal(Date dtFineVal) {
        this.dtFineVal = dtFineVal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL_STRUT")
    public Date getDtIniValStrut() {
        return dtIniValStrut;
    }

    public void setDtIniValStrut(Date dtIniValStrut) {
        this.dtIniValStrut = dtIniValStrut;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FINE_VAL_STRUT")
    public Date getDtFineValStrut() {
        return dtFineValStrut;
    }

    public void setDtFineValStrut(Date dtFineValStrut) {
        this.dtFineValStrut = dtFineValStrut;
    }

    @Column(name = "FL_TEMPLATE")
    public String getFlTemplate() {
        return this.flTemplate;
    }

    public void setFlTemplate(String flTemplate) {
        this.flTemplate = flTemplate;
    }

    @Column(name = "ID_ENTE_CONVENZ")
    public BigDecimal getIdEnteConvenz() {
        return idEnteConvenz;
    }

    public void setIdEnteConvenz(BigDecimal idEnteConvenz) {
        this.idEnteConvenz = idEnteConvenz;
    }

    @Column(name = "NM_STRUT")
    public String getNmStrut() {
        return this.nmStrut;
    }

    public void setNmStrut(String nmStrut) {
        this.nmStrut = nmStrut;
    }

    @Column(name = "FL_CESSATO")
    public String getFlCessato() {
        return this.flCessato;
    }

    public void setFlCessato(String flCessato) {
        this.flCessato = flCessato;
    }

    @Column(name = "FL_ARCHIVIO_RESTITUITO")
    public String getFlArchivioRestituito() {
        return this.flArchivioRestituito;
    }

    public void setFlArchivioRestituito(String flArchivioRestituito) {
        this.flArchivioRestituito = flArchivioRestituito;
    }

    // bi-directional many-to-one association to AroRichAnnulVer
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<AroRichAnnulVers> getAroRichAnnulVers() {
        return this.aroRichAnnulVers;
    }

    public void setAroRichAnnulVers(List<AroRichAnnulVers> aroRichAnnulVers) {
        this.aroRichAnnulVers = aroRichAnnulVers;
    }

    public AroRichAnnulVers addAroRichAnnulVer(AroRichAnnulVers aroRichAnnulVers) {
        getAroRichAnnulVers().add(aroRichAnnulVers);
        aroRichAnnulVers.setOrgStrut(this);

        return aroRichAnnulVers;
    }

    public AroRichAnnulVers removeAroRichAnnulVer(AroRichAnnulVers aroRichAnnulVers) {
        getAroRichAnnulVers().remove(aroRichAnnulVers);
        aroRichAnnulVers.setOrgStrut(null);

        return aroRichAnnulVers;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @OneToMany(mappedBy = "orgStrut", fetch = FetchType.LAZY)
    @XmlTransient
    public List<AroUnitaDoc> getAroUnitaDocs() {
        return this.aroUnitaDocs;
    }

    public void setAroUnitaDocs(List<AroUnitaDoc> aroUnitaDocs) {
        this.aroUnitaDocs = aroUnitaDocs;
    }

    // bi-directional many-to-one association to DecAttribDatiSpec
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    public List<DecAttribDatiSpec> getDecAttribDatiSpecs() {
        return this.decAttribDatiSpecs;
    }

    public void setDecAttribDatiSpecs(List<DecAttribDatiSpec> decAttribDatiSpecs) {
        this.decAttribDatiSpecs = decAttribDatiSpecs;
    }

    // bi-directional many-to-one association to DecCriterioRaggr
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    public List<DecCriterioRaggr> getDecCriterioRaggrs() {
        return this.decCriterioRaggrs;
    }

    public void setDecCriterioRaggrs(List<DecCriterioRaggr> decCriterioRaggrs) {
        this.decCriterioRaggrs = decCriterioRaggrs;
    }

    // bi-directional many-to-one association to DecFormatoFileDoc
    @OneToMany(mappedBy = "orgStrut", cascade = { CascadeType.PERSIST, CascadeType.DETACH })
    public List<DecFormatoFileDoc> getDecFormatoFileDocs() {
        return this.decFormatoFileDocs;
    }

    public void setDecFormatoFileDocs(List<DecFormatoFileDoc> decFormatoFileDocs) {
        this.decFormatoFileDocs = decFormatoFileDocs;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @OneToMany(mappedBy = "orgStrut", cascade = { CascadeType.PERSIST, CascadeType.DETACH })
    public List<DecRegistroUnitaDoc> getDecRegistroUnitaDocs() {
        return this.decRegistroUnitaDocs;
    }

    public void setDecRegistroUnitaDocs(List<DecRegistroUnitaDoc> decRegistroUnitaDocs) {
        this.decRegistroUnitaDocs = decRegistroUnitaDocs;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    public List<DecTipoDoc> getDecTipoDocs() {
        return this.decTipoDocs;
    }

    public void setDecTipoDocs(List<DecTipoDoc> decTipoDocs) {
        this.decTipoDocs = decTipoDocs;
    }

    // bi-directional many-to-one association to DecTipoRapprComp
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    public List<DecTipoRapprComp> getDecTipoRapprComps() {
        return this.decTipoRapprComps;
    }

    public void setDecTipoRapprComps(List<DecTipoRapprComp> decTipoRapprComps) {
        this.decTipoRapprComps = decTipoRapprComps;
    }

    // bi-directional many-to-one association to DecTipoSerie
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<DecTipoSerie> getDecTipoSeries() {
        return this.decTipoSeries;
    }

    public void setDecTipoSeries(List<DecTipoSerie> decTipoSeries) {
        this.decTipoSeries = decTipoSeries;
    }

    // bi-directional many-to-one association to DecTipoStrutDoc
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    public List<DecTipoStrutDoc> getDecTipoStrutDocs() {
        return this.decTipoStrutDocs;
    }

    public void setDecTipoStrutDocs(List<DecTipoStrutDoc> decTipoStrutDocs) {
        this.decTipoStrutDocs = decTipoStrutDocs;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    public List<DecTipoUnitaDoc> getDecTipoUnitaDocs() {
        return this.decTipoUnitaDocs;
    }

    public void setDecTipoUnitaDocs(List<DecTipoUnitaDoc> decTipoUnitaDocs) {
        this.decTipoUnitaDocs = decTipoUnitaDocs;
    }

    // bi-directional many-to-one association to DecTitol
    @OneToMany(mappedBy = "orgStrut", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlTransient
    public List<DecTitol> getDecTitols() {
        return this.decTitols;
    }

    public void setDecTitols(List<DecTitol> decTitols) {
        this.decTitols = decTitols;
    }

    // bi-directional many-to-one association to DecXsdDatiSpec
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    public List<DecXsdDatiSpec> getDecXsdDatiSpecs() {
        return this.decXsdDatiSpecs;
    }

    public void setDecXsdDatiSpecs(List<DecXsdDatiSpec> decXsdDatiSpecs) {
        this.decXsdDatiSpecs = decXsdDatiSpecs;
    }

    // bi-directional many-to-one association to ElvElencoVer
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<ElvElencoVer> getElvElencoVers() {
        return this.elvElencoVers;
    }

    public void setElvElencoVers(List<ElvElencoVer> elvElencoVers) {
        this.elvElencoVers = elvElencoVers;
    }

    // bi-directional many-to-one association to ElvLogElencoVer
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<ElvLogElencoVer> getElvLogElencoVers() {
        return this.elvLogElencoVers;
    }

    public void setElvLogElencoVers(List<ElvLogElencoVer> elvLogElencoVers) {
        this.elvLogElencoVers = elvLogElencoVers;
    }

    // bi-directional many-to-one association to LogJob
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<LogJob> getLogJobs() {
        return this.logJobs;
    }

    public void setLogJobs(List<LogJob> logJobs) {
        this.logJobs = logJobs;
    }

    // bi-directional many-to-one association to LogLockElab
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<LogLockElab> getLogLockElabs() {
        return this.logLockElabs;
    }

    public void setLogLockElabs(List<LogLockElab> logLockElabs) {
        this.logLockElabs = logLockElabs;
    }

    // bi-directional many-to-one association to LogOper
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<LogOper> getLogOpers() {
        return this.logOpers;
    }

    public void setLogOpers(List<LogOper> logOpers) {
        this.logOpers = logOpers;
    }

    // bi-directional many-to-one association to OrgOperTitol
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<OrgOperTitol> getOrgOperTitols() {
        return this.orgOperTitols;
    }

    public void setOrgOperTitols(List<OrgOperTitol> orgOperTitols) {
        this.orgOperTitols = orgOperTitols;
    }

    // bi-directional many-to-one association to OrgPartitionStrut
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.REMOVE)
    @XmlTransient
    public List<OrgPartitionStrut> getOrgPartitionStruts() {
        return this.orgPartitionStruts;
    }

    public void setOrgPartitionStruts(List<OrgPartitionStrut> orgPartitionStruts) {
        this.orgPartitionStruts = orgPartitionStruts;
    }

    // bi-directional many-to-one association to OrgCategStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CATEG_STRUT")
    public OrgCategStrut getOrgCategStrut() {
        return this.orgCategStrut;
    }

    public void setOrgCategStrut(OrgCategStrut orgCategStrut) {
        this.orgCategStrut = orgCategStrut;
    }

    // bi-directional many-to-one association to OrgEnte
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ENTE")
    @XmlTransient
    public OrgEnte getOrgEnte() {
        return this.orgEnte;
    }

    public void setOrgEnte(OrgEnte orgEnte) {
        this.orgEnte = orgEnte;
    }

    // bi-directional many-to-one association to DecTipoFascicolo
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    public List<DecTipoFascicolo> getDecTipoFascicolos() {
        return this.decTipoFascicolos;
    }

    public void setDecTipoFascicolos(List<DecTipoFascicolo> decTipoFascicolos) {
        this.decTipoFascicolos = decTipoFascicolos;
    }

    // bi-directional many-to-one association to OrgSubStrut
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    public List<OrgSubStrut> getOrgSubStruts() {
        return this.orgSubStruts;
    }

    public void setOrgSubStruts(List<OrgSubStrut> orgSubStruts) {
        this.orgSubStruts = orgSubStruts;
    }

    // bi-directional many-to-one association to OrgUsoSistemaMigraz
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<OrgUsoSistemaMigraz> getOrgUsoSistemaMigrazs() {
        return this.orgUsoSistemaMigrazs;
    }

    public void setOrgUsoSistemaMigrazs(List<OrgUsoSistemaMigraz> orgUsoSistemaMigrazs) {
        this.orgUsoSistemaMigrazs = orgUsoSistemaMigrazs;
    }

    // bi-directional many-to-one association to SerSerie
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<SerSerie> getSerSeries() {
        return this.serSeries;
    }

    public void setSerSeries(List<SerSerie> serSeries) {
        this.serSeries = serSeries;
    }

    // bi-directional many-to-one association to VolVolumeConserv
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<VolVolumeConserv> getVolVolumeConservs() {
        return this.volVolumeConservs;
    }

    public void setVolVolumeConservs(List<VolVolumeConserv> volVolumeConservs) {
        this.volVolumeConservs = volVolumeConservs;
    }

    // bi-directional many-to-one association to VrsDocNonVer
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<VrsDocNonVer> getVrsDocNonVers() {
        return this.vrsDocNonVers;
    }

    public void setVrsDocNonVers(List<VrsDocNonVer> vrsDocNonVers) {
        this.vrsDocNonVers = vrsDocNonVers;
    }

    // bi-directional many-to-one association to VrsSessioneVers
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<VrsSessioneVers> getVrsSessioneVers() {
        return this.vrsSessioneVers;
    }

    public void setVrsSessioneVers(List<VrsSessioneVers> vrsSessioneVers) {
        this.vrsSessioneVers = vrsSessioneVers;
    }

    // bi-directional many-to-one association to VrsUnitaDocNonVer
    @OneToMany(mappedBy = "orgStrut")
    @XmlTransient
    public List<VrsUnitaDocNonVer> getVrsUnitaDocNonVers() {
        return this.vrsUnitaDocNonVers;
    }

    public void setVrsUnitaDocNonVers(List<VrsUnitaDocNonVer> vrsUnitaDocNonVers) {
        this.vrsUnitaDocNonVers = vrsUnitaDocNonVers;
    }

    // bi-directional many-to-one association to DecUsoModelloTipoSerie
    @OneToMany(mappedBy = "orgStrut", cascade = CascadeType.PERSIST)
    // @XmlTransient
    public List<DecUsoModelloTipoSerie> getDecUsoModelloTipoSeries() {
        return this.decUsoModelloTipoSeries;
    }

    public void setDecUsoModelloTipoSeries(List<DecUsoModelloTipoSerie> decUsoModelloTipoSeries) {
        this.decUsoModelloTipoSeries = decUsoModelloTipoSeries;
    }

    public DecUsoModelloTipoSerie addDecUsoModelloTipoSery(DecUsoModelloTipoSerie decUsoModelloTipoSery) {
        getDecUsoModelloTipoSeries().add(decUsoModelloTipoSery);
        decUsoModelloTipoSery.setOrgStrut(this);

        return decUsoModelloTipoSery;
    }

    public DecUsoModelloTipoSerie removeDecUsoModelloTipoSery(DecUsoModelloTipoSerie decUsoModelloTipoSery) {
        getDecUsoModelloTipoSeries().remove(decUsoModelloTipoSery);
        decUsoModelloTipoSery.setOrgStrut(null);

        return decUsoModelloTipoSery;
    }

    // bi-directional many-to-one association to AplValoreParamApplic
    @OneToMany(mappedBy = "orgStrut")
    public List<AplValoreParamApplic> getAplValoreParamApplics() {
        return this.aplValoreParamApplics;
    }

    public void setAplValoreParamApplics(List<AplValoreParamApplic> aplValoreParamApplics) {
        this.aplValoreParamApplics = aplValoreParamApplics;
    }

    public AplValoreParamApplic addAplValoreParamApplic(AplValoreParamApplic aplValoreParamApplic) {
        getAplValoreParamApplics().add(aplValoreParamApplic);
        aplValoreParamApplic.setOrgStrut(this);

        return aplValoreParamApplic;
    }

    public AplValoreParamApplic removeAplValoreParamApplic(AplValoreParamApplic aplValoreParamApplic) {
        getAplValoreParamApplics().remove(aplValoreParamApplic);
        aplValoreParamApplic.setOrgStrut(null);

        return aplValoreParamApplic;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + (int) (this.idStrut ^ (this.idStrut >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OrgStrut other = (OrgStrut) obj;
        if (this.idStrut != other.idStrut) {
            return false;
        }
        return true;
    }

    @PrePersist
    void preInsert() {
        if (this.flCessato == null) {
            this.flCessato = "0";
        }
        if (this.flArchivioRestituito == null) {
            this.flArchivioRestituito = "0";
        }
    }
}
