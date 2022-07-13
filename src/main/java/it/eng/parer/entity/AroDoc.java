package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the ARO_DOC database table.
 *
 */
@Entity
@Table(name = "ARO_DOC")
public class AroDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idDoc;
    private String cdKeyDocVers;
    private String dlDoc;
    private String dsAutoreDoc;
    private String dsMsgEsitoVerifFirme;
    private Date dtAnnul;
    private Date dtCreazione;
    private String flDocFirmato;
    private String flDocFisc;
    private String flForzaAccettazione;
    private String flForzaConservazione;
    private BigDecimal idStrut;
    private String nmSistemaMigraz;
    private String ntAnnul;
    private String ntDoc;
    private BigDecimal pgDoc;
    private BigDecimal niOrdDoc;
    private BigDecimal niResetStato;
    private String tiAnnul;
    private String tiConservazione;
    private String tiCreazione;
    private String tiDoc;
    private String tiEsitoVerifFirme;
    private String tiStatoDoc;
    private String tiStatoDocElencoVers;
    private Date tsStatoElencoVers;
    private Date tsLastResetStato;
    private AroUnitaDoc aroUnitaDoc;
    private DecTipoDoc decTipoDoc;
    private long idDecTipoDoc;
    private List<AroStrutDoc> aroStrutDocs;
    private List<AroUsoXsdDatiSpec> aroUsoXsdDatiSpecs;
    private List<AroWarnUnitaDoc> aroWarnUnitaDocs;
    private List<RecSessioneRecup> recSessioneRecups;
    private List<VolAppartDocVolume> volAppartDocVolumes;
    private List<VrsSessioneVers> vrsSessioneVers;
    private ElvElencoVer elvElencoVer;
    private List<ElvDocAggDaElabElenco> elvDocAggDaElabElencos;
    private List<AroVersIniDoc> aroVersIniDocs;
    private List<AroUpdDocUnitaDoc> aroUpdDocUnitaDocs;

    public AroDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_DOC_IDDOC_GENERATOR", sequenceName = "SARO_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_DOC_IDDOC_GENERATOR")
    @Column(name = "ID_DOC")
    public long getIdDoc() {
        return this.idDoc;
    }

    public void setIdDoc(long idDoc) {
        this.idDoc = idDoc;
    }

    @Column(name = "CD_KEY_DOC_VERS")
    public String getCdKeyDocVers() {
        return this.cdKeyDocVers;
    }

    public void setCdKeyDocVers(String cdKeyDocVers) {
        this.cdKeyDocVers = cdKeyDocVers;
    }

    @Column(name = "DL_DOC")
    public String getDlDoc() {
        return this.dlDoc;
    }

    public void setDlDoc(String dlDoc) {
        this.dlDoc = dlDoc;
    }

    @Column(name = "DS_AUTORE_DOC")
    public String getDsAutoreDoc() {
        return this.dsAutoreDoc;
    }

    public void setDsAutoreDoc(String dsAutoreDoc) {
        this.dsAutoreDoc = dsAutoreDoc;
    }

    @Column(name = "DS_MSG_ESITO_VERIF_FIRME")
    public String getDsMsgEsitoVerifFirme() {
        return this.dsMsgEsitoVerifFirme;
    }

    public void setDsMsgEsitoVerifFirme(String dsMsgEsitoVerifFirme) {
        this.dsMsgEsitoVerifFirme = dsMsgEsitoVerifFirme;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ANNUL")
    public Date getDtAnnul() {
        return this.dtAnnul;
    }

    public void setDtAnnul(Date dtAnnul) {
        this.dtAnnul = dtAnnul;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "FL_DOC_FIRMATO")
    public String getFlDocFirmato() {
        return this.flDocFirmato;
    }

    public void setFlDocFirmato(String flDocFirmato) {
        this.flDocFirmato = flDocFirmato;
    }

    @Column(name = "FL_DOC_FISC")
    public String getFlDocFisc() {
        return this.flDocFisc;
    }

    public void setFlDocFisc(String flDocFisc) {
        this.flDocFisc = flDocFisc;
    }

    @Column(name = "FL_FORZA_ACCETTAZIONE")
    public String getFlForzaAccettazione() {
        return this.flForzaAccettazione;
    }

    public void setFlForzaAccettazione(String flForzaAccettazione) {
        this.flForzaAccettazione = flForzaAccettazione;
    }

    @Column(name = "FL_FORZA_CONSERVAZIONE")
    public String getFlForzaConservazione() {
        return this.flForzaConservazione;
    }

    public void setFlForzaConservazione(String flForzaConservazione) {
        this.flForzaConservazione = flForzaConservazione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NM_SISTEMA_MIGRAZ")
    public String getNmSistemaMigraz() {
        return this.nmSistemaMigraz;
    }

    public void setNmSistemaMigraz(String nmSistemaMigraz) {
        this.nmSistemaMigraz = nmSistemaMigraz;
    }

    @Column(name = "NT_ANNUL")
    public String getNtAnnul() {
        return this.ntAnnul;
    }

    public void setNtAnnul(String ntAnnul) {
        this.ntAnnul = ntAnnul;
    }

    @Column(name = "NT_DOC")
    public String getNtDoc() {
        return this.ntDoc;
    }

    public void setNtDoc(String ntDoc) {
        this.ntDoc = ntDoc;
    }

    @Column(name = "PG_DOC")
    public BigDecimal getPgDoc() {
        return this.pgDoc;
    }

    public void setPgDoc(BigDecimal pgDoc) {
        this.pgDoc = pgDoc;
    }

    @Column(name = "NI_ORD_DOC")
    public BigDecimal getNiOrdDoc() {
        return this.niOrdDoc;
    }

    public void setNiOrdDoc(BigDecimal niOrdDoc) {
        this.niOrdDoc = niOrdDoc;
    }

    @Column(name = "NI_RESET_STATO")
    public BigDecimal getNiResetStato() {
        return this.niResetStato;
    }

    public void setNiResetStato(BigDecimal niResetStato) {
        this.niResetStato = niResetStato;
    }

    @Column(name = "TI_ANNUL")
    public String getTiAnnul() {
        return this.tiAnnul;
    }

    public void setTiAnnul(String tiAnnul) {
        this.tiAnnul = tiAnnul;
    }

    @Column(name = "TI_CONSERVAZIONE")
    public String getTiConservazione() {
        return this.tiConservazione;
    }

    public void setTiConservazione(String tiConservazione) {
        this.tiConservazione = tiConservazione;
    }

    @Column(name = "TI_CREAZIONE")
    public String getTiCreazione() {
        return this.tiCreazione;
    }

    public void setTiCreazione(String tiCreazione) {
        this.tiCreazione = tiCreazione;
    }

    @Column(name = "TI_DOC")
    public String getTiDoc() {
        return this.tiDoc;
    }

    public void setTiDoc(String tiDoc) {
        this.tiDoc = tiDoc;
    }

    @Column(name = "TI_ESITO_VERIF_FIRME")
    public String getTiEsitoVerifFirme() {
        return this.tiEsitoVerifFirme;
    }

    public void setTiEsitoVerifFirme(String tiEsitoVerifFirme) {
        this.tiEsitoVerifFirme = tiEsitoVerifFirme;
    }

    @Column(name = "TI_STATO_DOC")
    public String getTiStatoDoc() {
        return this.tiStatoDoc;
    }

    public void setTiStatoDoc(String tiStatoDoc) {
        this.tiStatoDoc = tiStatoDoc;
    }

    @Column(name = "TI_STATO_DOC_ELENCO_VERS")
    public String getTiStatoDocElencoVers() {
        return this.tiStatoDocElencoVers;
    }

    public void setTiStatoDocElencoVers(String tiStatoDocElencoVers) {
        this.tiStatoDocElencoVers = tiStatoDocElencoVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_STATO_ELENCO_VERS")
    public Date getTsStatoElencoVers() {
        return this.tsStatoElencoVers;
    }

    public void setTsStatoElencoVers(Date tsStatoElencoVers) {
        this.tsStatoElencoVers = tsStatoElencoVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_LAST_RESET_STATO")
    public Date getTsLastResetStato() {
        return this.tsLastResetStato;
    }

    public void setTsLastResetStato(Date tsLastResetStato) {
        this.tsLastResetStato = tsLastResetStato;
    }

    @Column(name = "ID_TIPO_DOC", insertable = false, updatable = false)
    public long getIdDecTipoDoc() {
        return idDecTipoDoc;
    }

    public void setIdDecTipoDoc(long idDecTipoDoc) {
        this.idDecTipoDoc = idDecTipoDoc;
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

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC")
    public DecTipoDoc getDecTipoDoc() {
        return this.decTipoDoc;
    }

    public void setDecTipoDoc(DecTipoDoc decTipoDoc) {
        this.decTipoDoc = decTipoDoc;
    }

    // bi-directional many-to-one association to AroStrutDoc
    @OneToMany(mappedBy = "aroDoc")
    public List<AroStrutDoc> getAroStrutDocs() {
        return this.aroStrutDocs;
    }

    public void setAroStrutDocs(List<AroStrutDoc> aroStrutDocs) {
        this.aroStrutDocs = aroStrutDocs;
    }

    // bi-directional many-to-one association to AroUsoXsdDatiSpec
    @OneToMany(mappedBy = "aroDoc")
    public List<AroUsoXsdDatiSpec> getAroUsoXsdDatiSpecs() {
        return this.aroUsoXsdDatiSpecs;
    }

    public void setAroUsoXsdDatiSpecs(List<AroUsoXsdDatiSpec> aroUsoXsdDatiSpecs) {
        this.aroUsoXsdDatiSpecs = aroUsoXsdDatiSpecs;
    }

    // bi-directional many-to-one association to AroWarnUnitaDoc
    @OneToMany(mappedBy = "aroDoc")
    public List<AroWarnUnitaDoc> getAroWarnUnitaDocs() {
        return this.aroWarnUnitaDocs;
    }

    public void setAroWarnUnitaDocs(List<AroWarnUnitaDoc> aroWarnUnitaDocs) {
        this.aroWarnUnitaDocs = aroWarnUnitaDocs;
    }

    // bi-directional many-to-one association to VolAppartDocVolume
    @OneToMany(mappedBy = "aroDoc")
    public List<VolAppartDocVolume> getVolAppartDocVolumes() {
        return this.volAppartDocVolumes;
    }

    public void setVolAppartDocVolumes(List<VolAppartDocVolume> volAppartDocVolumes) {
        this.volAppartDocVolumes = volAppartDocVolumes;
    }

    // bi-directional many-to-one association to VrsSessioneVers
    @OneToMany(mappedBy = "aroDoc")
    public List<VrsSessioneVers> getVrsSessioneVers() {
        return this.vrsSessioneVers;
    }

    public void setVrsSessioneVers(List<VrsSessioneVers> vrsSessioneVers) {
        this.vrsSessioneVers = vrsSessioneVers;
    }

    // bi-directional many-to-one association to RecSessioneRecup
    @OneToMany(mappedBy = "aroDoc")
    public List<RecSessioneRecup> getRecSessioneRecups() {
        return this.recSessioneRecups;
    }

    public void setRecSessioneRecups(List<RecSessioneRecup> recSessioneRecups) {
        this.recSessioneRecups = recSessioneRecups;
    }

    // bi-directional many-to-one association to ElvElencoVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS")
    public ElvElencoVer getElvElencoVer() {
        return this.elvElencoVer;
    }

    public void setElvElencoVer(ElvElencoVer elvElencoVer) {
        this.elvElencoVer = elvElencoVer;
    }

    // bi-directional many-to-one association to ElvDocAggDaElabElenco
    @OneToMany(mappedBy = "aroDoc")
    public List<ElvDocAggDaElabElenco> getElvDocAggDaElabElencos() {
        return this.elvDocAggDaElabElencos;
    }

    public void setElvDocAggDaElabElencos(List<ElvDocAggDaElabElenco> elvDocAggDaElabElencos) {
        this.elvDocAggDaElabElencos = elvDocAggDaElabElencos;
    }

    // bi-directional many-to-one association to AroVersIniDoc
    @OneToMany(mappedBy = "aroDoc")
    public List<AroVersIniDoc> getAroVersIniDocs() {
        return this.aroVersIniDocs;
    }

    public void setAroVersIniDocs(List<AroVersIniDoc> aroVersIniDocs) {
        this.aroVersIniDocs = aroVersIniDocs;
    }

    // bi-directional many-to-one association to AroVersIniDoc
    @OneToMany(mappedBy = "aroDoc")
    public List<AroUpdDocUnitaDoc> getAroUpdDocUnitaDocs() {
        return this.aroUpdDocUnitaDocs;
    }

    public void setAroUpdDocUnitaDocs(List<AroUpdDocUnitaDoc> aroUpdDocUnitaDocs) {
        this.aroUpdDocUnitaDocs = aroUpdDocUnitaDocs;
    }

}
