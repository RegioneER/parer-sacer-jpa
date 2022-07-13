package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the ARO_COMP_DOC database table.
 *
 */
@Entity
@Table(name = "ARO_COMP_DOC")
@NamedQuery(name = "AroCompDoc.findAll", query = "SELECT a FROM AroCompDoc a")
public class AroCompDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idCompDoc;
    private String cdEncodingHashFileCalc;
    private String cdEncodingHashFileVers;
    private String dlUrnCompVers;
    private String dsAlgoHashFileCalc;
    private String dsAlgoHashFileVers;
    private String dsEsitoVerifFirmeDtVers;
    private String dsFormatoRapprCalc;
    private String dsFormatoRapprEstesoCalc;
    private String dsHashFileCalc;
    private String dsHashFileContr;
    private String dsHashFileVers;
    private String dsIdCompVers;
    private String dsMsgEsitoContrFormato;
    private String dsMsgEsitoVerifFirme;
    private String dsNomeCompVers;
    private String dsNomeFileArk;
    private String dsRifTempVers;
    private String dsUrnCompCalc;
    private String flCompFirmato;
    private String flNoCalcFmtVerifFirme;
    private String flNoCalcHashFile;
    private String flRifTempDataFirmaVers;
    private BigDecimal idStrut;
    private BigDecimal niOrdCompDoc;
    private BigDecimal niSizeFileCalc;
    private String tiEsitoContrFormatoFile;
    private String tiEsitoContrHashVers;
    private String tiEsitoVerifFirme;
    private String tiEsitoVerifFirmeDtVers;
    private String tiSupportoComp;
    private Date tmRifTempVers;
    private List<AroBustaCrittog> aroBustaCrittogs;
    private AroCompDoc aroCompDoc;
    private List<AroCompDoc> aroCompDocs;
    private AroStrutDoc aroStrutDoc;
    private AroUnitaDoc aroUnitaDoc;
    private DecFormatoFileDoc decFormatoFileDoc;
    private DecFormatoFileStandard decFormatoFileStandard;
    private DecTipoCompDoc decTipoCompDoc;
    private DecTipoRapprComp decTipoRapprComp;
    private List<AroContenutoComp> aroContenutoComps;
    private List<AroFileComp> aroFileComps;
    private List<AroFirmaComp> aroFirmaComps;
    private List<AroMarcaComp> aroMarcaComps;
    private List<AroUsoXsdDatiSpec> aroUsoXsdDatiSpecs;
    private List<VolAppartCompVolume> volAppartCompVolumes;
    private List<RecSessioneRecup> recSessioneRecups;
    private List<AroCompIndiceAipDaElab> aroCompIndiceAipDaElabs;
    private List<AroCompVerIndiceAipUd> aroCompVerIndiceAipUds;
    private List<FirReport> firReport;
    private List<AroVersIniComp> aroVersIniComps;
    private List<AroUpdCompUnitaDoc> aroUpdCompUnitaDocs;
    private List<AroCompUrnCalc> aroAroCompUrnCalcs;
    private DecServizioVerificaCompDoc decServizioVerificaCompDoc;

    public AroCompDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_COMP_DOC_IDCOMPDOC_GENERATOR", sequenceName = "SARO_COMP_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_COMP_DOC_IDCOMPDOC_GENERATOR")
    @Column(name = "ID_COMP_DOC")
    public long getIdCompDoc() {
        return this.idCompDoc;
    }

    public void setIdCompDoc(long idCompDoc) {
        this.idCompDoc = idCompDoc;
    }

    @Column(name = "CD_ENCODING_HASH_FILE_CALC")
    public String getCdEncodingHashFileCalc() {
        return this.cdEncodingHashFileCalc;
    }

    public void setCdEncodingHashFileCalc(String cdEncodingHashFileCalc) {
        this.cdEncodingHashFileCalc = cdEncodingHashFileCalc;
    }

    @Column(name = "CD_ENCODING_HASH_FILE_VERS")
    public String getCdEncodingHashFileVers() {
        return this.cdEncodingHashFileVers;
    }

    public void setCdEncodingHashFileVers(String cdEncodingHashFileVers) {
        this.cdEncodingHashFileVers = cdEncodingHashFileVers;
    }

    @Column(name = "DL_URN_COMP_VERS")
    public String getDlUrnCompVers() {
        return this.dlUrnCompVers;
    }

    public void setDlUrnCompVers(String dlUrnCompVers) {
        this.dlUrnCompVers = dlUrnCompVers;
    }

    @Column(name = "DS_ALGO_HASH_FILE_CALC")
    public String getDsAlgoHashFileCalc() {
        return this.dsAlgoHashFileCalc;
    }

    public void setDsAlgoHashFileCalc(String dsAlgoHashFileCalc) {
        this.dsAlgoHashFileCalc = dsAlgoHashFileCalc;
    }

    @Column(name = "DS_ALGO_HASH_FILE_VERS")
    public String getDsAlgoHashFileVers() {
        return this.dsAlgoHashFileVers;
    }

    public void setDsAlgoHashFileVers(String dsAlgoHashFileVers) {
        this.dsAlgoHashFileVers = dsAlgoHashFileVers;
    }

    @Column(name = "DS_ESITO_VERIF_FIRME_DT_VERS")
    public String getDsEsitoVerifFirmeDtVers() {
        return this.dsEsitoVerifFirmeDtVers;
    }

    public void setDsEsitoVerifFirmeDtVers(String dsEsitoVerifFirmeDtVers) {
        this.dsEsitoVerifFirmeDtVers = dsEsitoVerifFirmeDtVers;
    }

    @Column(name = "DS_FORMATO_RAPPR_CALC")
    public String getDsFormatoRapprCalc() {
        return this.dsFormatoRapprCalc;
    }

    public void setDsFormatoRapprCalc(String dsFormatoRapprCalc) {
        this.dsFormatoRapprCalc = dsFormatoRapprCalc;
    }

    @Column(name = "DS_FORMATO_RAPPR_ESTESO_CALC")
    public String getDsFormatoRapprEstesoCalc() {
        return this.dsFormatoRapprEstesoCalc;
    }

    public void setDsFormatoRapprEstesoCalc(String dsFormatoRapprEstesoCalc) {
        this.dsFormatoRapprEstesoCalc = dsFormatoRapprEstesoCalc;
    }

    @Column(name = "DS_HASH_FILE_CALC")
    public String getDsHashFileCalc() {
        return this.dsHashFileCalc;
    }

    public void setDsHashFileCalc(String dsHashFileCalc) {
        this.dsHashFileCalc = dsHashFileCalc;
    }

    @Column(name = "DS_HASH_FILE_CONTR")
    public String getDsHashFileContr() {
        return this.dsHashFileContr;
    }

    public void setDsHashFileContr(String dsHashFileContr) {
        this.dsHashFileContr = dsHashFileContr;
    }

    @Column(name = "DS_HASH_FILE_VERS")
    public String getDsHashFileVers() {
        return this.dsHashFileVers;
    }

    public void setDsHashFileVers(String dsHashFileVers) {
        this.dsHashFileVers = dsHashFileVers;
    }

    @Column(name = "DS_ID_COMP_VERS")
    public String getDsIdCompVers() {
        return this.dsIdCompVers;
    }

    public void setDsIdCompVers(String dsIdCompVers) {
        this.dsIdCompVers = dsIdCompVers;
    }

    @Column(name = "DS_MSG_ESITO_CONTR_FORMATO")
    public String getDsMsgEsitoContrFormato() {
        return this.dsMsgEsitoContrFormato;
    }

    public void setDsMsgEsitoContrFormato(String dsMsgEsitoContrFormato) {
        this.dsMsgEsitoContrFormato = dsMsgEsitoContrFormato;
    }

    @Column(name = "DS_MSG_ESITO_VERIF_FIRME")
    public String getDsMsgEsitoVerifFirme() {
        return this.dsMsgEsitoVerifFirme;
    }

    public void setDsMsgEsitoVerifFirme(String dsMsgEsitoVerifFirme) {
        this.dsMsgEsitoVerifFirme = dsMsgEsitoVerifFirme;
    }

    @Column(name = "DS_NOME_COMP_VERS")
    public String getDsNomeCompVers() {
        return this.dsNomeCompVers;
    }

    public void setDsNomeCompVers(String dsNomeCompVers) {
        this.dsNomeCompVers = dsNomeCompVers;
    }

    @Column(name = "DS_NOME_FILE_ARK")
    public String getDsNomeFileArk() {
        return dsNomeFileArk;
    }

    public void setDsNomeFileArk(String dsNomeFileArk) {
        this.dsNomeFileArk = dsNomeFileArk;
    }

    @Column(name = "DS_RIF_TEMP_VERS")
    public String getDsRifTempVers() {
        return this.dsRifTempVers;
    }

    public void setDsRifTempVers(String dsRifTempVers) {
        this.dsRifTempVers = dsRifTempVers;
    }

    @Column(name = "DS_URN_COMP_CALC")
    public String getDsUrnCompCalc() {
        return this.dsUrnCompCalc;
    }

    public void setDsUrnCompCalc(String dsUrnCompCalc) {
        this.dsUrnCompCalc = dsUrnCompCalc;
    }

    @Column(name = "FL_COMP_FIRMATO")
    public String getFlCompFirmato() {
        return this.flCompFirmato;
    }

    public void setFlCompFirmato(String flCompFirmato) {
        this.flCompFirmato = flCompFirmato;
    }

    @Column(name = "FL_NO_CALC_FMT_VERIF_FIRME")
    public String getFlNoCalcFmtVerifFirme() {
        return this.flNoCalcFmtVerifFirme;
    }

    public void setFlNoCalcFmtVerifFirme(String flNoCalcFmtVerifFirme) {
        this.flNoCalcFmtVerifFirme = flNoCalcFmtVerifFirme;
    }

    @Column(name = "FL_NO_CALC_HASH_FILE")
    public String getFlNoCalcHashFile() {
        return this.flNoCalcHashFile;
    }

    public void setFlNoCalcHashFile(String flNoCalcHashFile) {
        this.flNoCalcHashFile = flNoCalcHashFile;
    }

    @Column(name = "FL_RIF_TEMP_DATA_FIRMA_VERS")
    public String getFlRifTempDataFirmaVers() {
        return this.flRifTempDataFirmaVers;
    }

    public void setFlRifTempDataFirmaVers(String flRifTempDataFirmaVers) {
        this.flRifTempDataFirmaVers = flRifTempDataFirmaVers;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_ORD_COMP_DOC")
    public BigDecimal getNiOrdCompDoc() {
        return this.niOrdCompDoc;
    }

    public void setNiOrdCompDoc(BigDecimal niOrdCompDoc) {
        this.niOrdCompDoc = niOrdCompDoc;
    }

    @Column(name = "NI_SIZE_FILE_CALC")
    public BigDecimal getNiSizeFileCalc() {
        return this.niSizeFileCalc;
    }

    public void setNiSizeFileCalc(BigDecimal niSizeFileCalc) {
        this.niSizeFileCalc = niSizeFileCalc;
    }

    @Column(name = "TI_ESITO_CONTR_FORMATO_FILE")
    public String getTiEsitoContrFormatoFile() {
        return this.tiEsitoContrFormatoFile;
    }

    public void setTiEsitoContrFormatoFile(String tiEsitoContrFormatoFile) {
        this.tiEsitoContrFormatoFile = tiEsitoContrFormatoFile;
    }

    @Column(name = "TI_ESITO_CONTR_HASH_VERS")
    public String getTiEsitoContrHashVers() {
        return this.tiEsitoContrHashVers;
    }

    public void setTiEsitoContrHashVers(String tiEsitoContrHashVers) {
        this.tiEsitoContrHashVers = tiEsitoContrHashVers;
    }

    @Column(name = "TI_ESITO_VERIF_FIRME")
    public String getTiEsitoVerifFirme() {
        return this.tiEsitoVerifFirme;
    }

    public void setTiEsitoVerifFirme(String tiEsitoVerifFirme) {
        this.tiEsitoVerifFirme = tiEsitoVerifFirme;
    }

    @Column(name = "TI_ESITO_VERIF_FIRME_DT_VERS")
    public String getTiEsitoVerifFirmeDtVers() {
        return this.tiEsitoVerifFirmeDtVers;
    }

    public void setTiEsitoVerifFirmeDtVers(String tiEsitoVerifFirmeDtVers) {
        this.tiEsitoVerifFirmeDtVers = tiEsitoVerifFirmeDtVers;
    }

    @Column(name = "TI_SUPPORTO_COMP")
    public String getTiSupportoComp() {
        return this.tiSupportoComp;
    }

    public void setTiSupportoComp(String tiSupportoComp) {
        this.tiSupportoComp = tiSupportoComp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TM_RIF_TEMP_VERS")
    public Date getTmRifTempVers() {
        return this.tmRifTempVers;
    }

    public void setTmRifTempVers(Date tmRifTempVers) {
        this.tmRifTempVers = tmRifTempVers;
    }

    // bi-directional many-to-one association to AroBustaCrittog
    @OneToMany(mappedBy = "aroCompDoc", cascade = { CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroBustaCrittog> getAroBustaCrittogs() {
        return this.aroBustaCrittogs;
    }

    public void setAroBustaCrittogs(List<AroBustaCrittog> aroBustaCrittogs) {
        this.aroBustaCrittogs = aroBustaCrittogs;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_DOC_PADRE")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

    // bi-directional many-to-one association to AroCompDoc
    @OneToMany(mappedBy = "aroCompDoc")
    public List<AroCompDoc> getAroCompDocs() {
        return this.aroCompDocs;
    }

    public void setAroCompDocs(List<AroCompDoc> aroCompDocs) {
        this.aroCompDocs = aroCompDocs;
    }

    // bi-directional many-to-one association to AroStrutDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT_DOC")
    public AroStrutDoc getAroStrutDoc() {
        return this.aroStrutDoc;
    }

    public void setAroStrutDoc(AroStrutDoc aroStrutDoc) {
        this.aroStrutDoc = aroStrutDoc;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC_RIF")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }

    // bi-directional many-to-one association to DecFormatoFileDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_FILE_VERS")
    public DecFormatoFileDoc getDecFormatoFileDoc() {
        return this.decFormatoFileDoc;
    }

    public void setDecFormatoFileDoc(DecFormatoFileDoc decFormatoFileDoc) {
        this.decFormatoFileDoc = decFormatoFileDoc;
    }

    // bi-directional many-to-one association to DecFormatoFileStandard
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_FILE_CALC")
    public DecFormatoFileStandard getDecFormatoFileStandard() {
        return this.decFormatoFileStandard;
    }

    public void setDecFormatoFileStandard(DecFormatoFileStandard decFormatoFileStandard) {
        this.decFormatoFileStandard = decFormatoFileStandard;
    }

    // bi-directional many-to-one association to DecTipoCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_COMP_DOC")
    public DecTipoCompDoc getDecTipoCompDoc() {
        return this.decTipoCompDoc;
    }

    public void setDecTipoCompDoc(DecTipoCompDoc decTipoCompDoc) {
        this.decTipoCompDoc = decTipoCompDoc;
    }

    // bi-directional many-to-one association to DecTipoRapprComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_RAPPR_COMP")
    public DecTipoRapprComp getDecTipoRapprComp() {
        return this.decTipoRapprComp;
    }

    public void setDecTipoRapprComp(DecTipoRapprComp decTipoRapprComp) {
        this.decTipoRapprComp = decTipoRapprComp;
    }

    // bi-directional many-to-one association to DecTipoRapprComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SERVIZIO_VERIFICA_COMP_DOC")
    public DecServizioVerificaCompDoc getDecServizioVerificaCompDoc() {
        return this.decServizioVerificaCompDoc;
    }

    public void setDecServizioVerificaCompDoc(DecServizioVerificaCompDoc decServizioVerificaCompDoc) {
        this.decServizioVerificaCompDoc = decServizioVerificaCompDoc;
    }

    // bi-directional many-to-one association to AroContenutoComp
    @OneToMany(mappedBy = "aroCompDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroContenutoComp> getAroContenutoComps() {
        return this.aroContenutoComps;
    }

    public void setAroContenutoComps(List<AroContenutoComp> aroContenutoComps) {
        this.aroContenutoComps = aroContenutoComps;
    }

    // bi-directional many-to-one association to AroFileComp
    @OneToMany(mappedBy = "aroCompDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroFileComp> getAroFileComps() {
        return this.aroFileComps;
    }

    public void setAroFileComps(List<AroFileComp> aroFileComps) {
        this.aroFileComps = aroFileComps;
    }

    // bi-directional many-to-one association to AroFirmaComp
    @OneToMany(mappedBy = "aroCompDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroFirmaComp> getAroFirmaComps() {
        return this.aroFirmaComps;
    }

    public void setAroFirmaComps(List<AroFirmaComp> aroFirmaComps) {
        this.aroFirmaComps = aroFirmaComps;
    }

    // bi-directional many-to-one association to AroMarcaComp
    @OneToMany(mappedBy = "aroCompDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroMarcaComp> getAroMarcaComps() {
        return this.aroMarcaComps;
    }

    public void setAroMarcaComps(List<AroMarcaComp> aroMarcaComps) {
        this.aroMarcaComps = aroMarcaComps;
    }

    // bi-directional many-to-one association to AroUsoXsdDatiSpec
    @OneToMany(mappedBy = "aroCompDoc")
    public List<AroUsoXsdDatiSpec> getAroUsoXsdDatiSpecs() {
        return this.aroUsoXsdDatiSpecs;
    }

    public void setAroUsoXsdDatiSpecs(List<AroUsoXsdDatiSpec> aroUsoXsdDatiSpecs) {
        this.aroUsoXsdDatiSpecs = aroUsoXsdDatiSpecs;
    }

    // bi-directional many-to-one association to VolAppartCompVolume
    @OneToMany(mappedBy = "aroCompDoc")
    public List<VolAppartCompVolume> getVolAppartCompVolumes() {
        return this.volAppartCompVolumes;
    }

    public void setVolAppartCompVolumes(List<VolAppartCompVolume> volAppartCompVolumes) {
        this.volAppartCompVolumes = volAppartCompVolumes;
    }

    // bi-directional many-to-one association to RecSessioneRecup
    @OneToMany(mappedBy = "aroCompDoc")
    public List<RecSessioneRecup> getRecSessioneRecups() {
        return this.recSessioneRecups;
    }

    public void setRecSessioneRecups(List<RecSessioneRecup> recSessioneRecups) {
        this.recSessioneRecups = recSessioneRecups;
    }

    // bi-directional many-to-one association to AroCompIndiceAipDaElab
    @OneToMany(mappedBy = "aroCompDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroCompIndiceAipDaElab> getAroCompIndiceAipDaElabs() {
        return this.aroCompIndiceAipDaElabs;
    }

    public void setAroCompIndiceAipDaElabs(List<AroCompIndiceAipDaElab> aroCompIndiceAipDaElabs) {
        this.aroCompIndiceAipDaElabs = aroCompIndiceAipDaElabs;
    }

    // bi-directional many-to-one association to AroCompVerIndiceAipUd
    @OneToMany(mappedBy = "aroCompDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroCompVerIndiceAipUd> getAroCompVerIndiceAipUds() {
        return this.aroCompVerIndiceAipUds;
    }

    public void setAroCompVerIndiceAipUds(List<AroCompVerIndiceAipUd> aroCompVerIndiceAipUds) {
        this.aroCompVerIndiceAipUds = aroCompVerIndiceAipUds;
    }

    // bi-directional many-to-one association to FirReport
    @OneToMany(mappedBy = "aroCompDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<FirReport> getFirReport() {
        return firReport;
    }

    public void setFirReport(List<FirReport> firReport) {
        this.firReport = firReport;
    }

    // bi-directional many-to-one association to AroVersIniComp
    @OneToMany(mappedBy = "aroCompDoc")
    public List<AroVersIniComp> getAroVersIniComps() {
        return this.aroVersIniComps;
    }

    public void setAroVersIniComps(List<AroVersIniComp> aroVersIniComps) {
        this.aroVersIniComps = aroVersIniComps;
    }

    // bi-directional many-to-one association to AroVersIniComp
    @OneToMany(mappedBy = "aroCompDoc")
    public List<AroUpdCompUnitaDoc> getAroUpdCompUnitaDocs() {
        return this.aroUpdCompUnitaDocs;
    }

    public void setAroUpdCompUnitaDocs(List<AroUpdCompUnitaDoc> aroUpdCompUnitaDocs) {
        this.aroUpdCompUnitaDocs = aroUpdCompUnitaDocs;
    }

    // bi-directional many-to-one association to AroCompUrnCalc
    @OneToMany(mappedBy = "aroCompDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroCompUrnCalc> getAroAroCompUrnCalcs() {
        return this.aroAroCompUrnCalcs;
    }

    public void setAroAroCompUrnCalcs(List<AroCompUrnCalc> aroAroCompUrnCalcs) {
        this.aroAroCompUrnCalcs = aroAroCompUrnCalcs;
    }
}
