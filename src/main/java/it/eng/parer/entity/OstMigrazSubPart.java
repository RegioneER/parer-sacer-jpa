package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the OST_MIGRAZ_SUB_PART database table.
 *
 */
@Entity
@Table(name = "OST_MIGRAZ_SUB_PART")
@NamedQuery(name = "OstMigrazSubPart.findAll", query = "SELECT o FROM OstMigrazSubPart o")
public class OstMigrazSubPart implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idMigrazSubPart;
    private BigDecimal idStatoMigrazSubPartCor;
    private BigDecimal mmMax;
    private BigDecimal niByteSize;
    private BigDecimal niFileDaMigrare;
    private BigDecimal niFileErroreNormaliz;
    private BigDecimal niFileMigrati;
    private BigDecimal niFileMigrazInCorso;
    private BigDecimal niFileMigrazInErrore;
    private String nmColonnaBlobFile;
    private String nmColonnaIdFile;
    private String nmTabellaFile;
    private String nmTablespace;
    private BigDecimal niIstanzaJobPrepara;
    private BigDecimal niIstanzaJobProducer;
    private BigDecimal niFileSubPart;
    private List<OstMigrazFile> ostMigrazFiles;
    private List<OstMigrazStrutMese> ostMigrazStrutMeses;
    private OrgSubPartition orgSubPartition;
    private List<OstStatoMigrazSubPart> ostStatoMigrazSubParts;

    public OstMigrazSubPart() {
    }

    @Id
    @SequenceGenerator(name = "OST_MIGRAZ_SUB_PART_IDMIGRAZSUBPART_GENERATOR", sequenceName = "SOST_MIGRAZ_SUB_PART", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OST_MIGRAZ_SUB_PART_IDMIGRAZSUBPART_GENERATOR")
    @Column(name = "ID_MIGRAZ_SUB_PART")
    public long getIdMigrazSubPart() {
        return this.idMigrazSubPart;
    }

    public void setIdMigrazSubPart(long idMigrazSubPart) {
        this.idMigrazSubPart = idMigrazSubPart;
    }

    @Column(name = "ID_STATO_MIGRAZ_SUB_PART_COR")
    public BigDecimal getIdStatoMigrazSubPartCor() {
        return this.idStatoMigrazSubPartCor;
    }

    public void setIdStatoMigrazSubPartCor(BigDecimal idStatoMigrazSubPartCor) {
        this.idStatoMigrazSubPartCor = idStatoMigrazSubPartCor;
    }

    @Column(name = "MM_MAX")
    public BigDecimal getMmMax() {
        return this.mmMax;
    }

    public void setMmMax(BigDecimal mmMax) {
        this.mmMax = mmMax;
    }

    @Column(name = "NI_BYTE_SIZE")
    public BigDecimal getNiByteSize() {
        return this.niByteSize;
    }

    public void setNiByteSize(BigDecimal niByteSize) {
        this.niByteSize = niByteSize;
    }

    @Column(name = "NI_FILE_DA_MIGRARE")
    public BigDecimal getNiFileDaMigrare() {
        return this.niFileDaMigrare;
    }

    public void setNiFileDaMigrare(BigDecimal niFileDaMigrare) {
        this.niFileDaMigrare = niFileDaMigrare;
    }

    @Column(name = "NI_FILE_ERRORE_NORMALIZ")
    public BigDecimal getNiFileErroreNormaliz() {
        return this.niFileErroreNormaliz;
    }

    public void setNiFileErroreNormaliz(BigDecimal niFileErroreNormaliz) {
        this.niFileErroreNormaliz = niFileErroreNormaliz;
    }

    @Column(name = "NI_FILE_MIGRATI")
    public BigDecimal getNiFileMigrati() {
        return this.niFileMigrati;
    }

    public void setNiFileMigrati(BigDecimal niFileMigrati) {
        this.niFileMigrati = niFileMigrati;
    }

    @Column(name = "NI_FILE_MIGRAZ_IN_CORSO")
    public BigDecimal getNiFileMigrazInCorso() {
        return this.niFileMigrazInCorso;
    }

    public void setNiFileMigrazInCorso(BigDecimal niFileMigrazInCorso) {
        this.niFileMigrazInCorso = niFileMigrazInCorso;
    }

    @Column(name = "NI_FILE_MIGRAZ_IN_ERRORE")
    public BigDecimal getNiFileMigrazInErrore() {
        return this.niFileMigrazInErrore;
    }

    public void setNiFileMigrazInErrore(BigDecimal niFileMigrazInErrore) {
        this.niFileMigrazInErrore = niFileMigrazInErrore;
    }

    @Column(name = "NM_COLONNA_BLOB_FILE")
    public String getNmColonnaBlobFile() {
        return this.nmColonnaBlobFile;
    }

    public void setNmColonnaBlobFile(String nmColonnaBlobFile) {
        this.nmColonnaBlobFile = nmColonnaBlobFile;
    }

    @Column(name = "NM_COLONNA_ID_FILE")
    public String getNmColonnaIdFile() {
        return this.nmColonnaIdFile;
    }

    public void setNmColonnaIdFile(String nmColonnaIdFile) {
        this.nmColonnaIdFile = nmColonnaIdFile;
    }

    @Column(name = "NM_TABELLA_FILE")
    public String getNmTabellaFile() {
        return this.nmTabellaFile;
    }

    public void setNmTabellaFile(String nmTabellaFile) {
        this.nmTabellaFile = nmTabellaFile;
    }

    @Column(name = "NM_TABLESPACE")
    public String getNmTablespace() {
        return this.nmTablespace;
    }

    public void setNmTablespace(String nmTablespace) {
        this.nmTablespace = nmTablespace;
    }

    @Column(name = "NI_ISTANZA_JOB_PREPARA")
    public BigDecimal getNiIstanzaJobPrepara() {
        return this.niIstanzaJobPrepara;
    }

    public void setNiIstanzaJobPrepara(BigDecimal niIstanzaJobPrepara) {
        this.niIstanzaJobPrepara = niIstanzaJobPrepara;
    }

    @Column(name = "NI_ISTANZA_JOB_PRODUCER")
    public BigDecimal getNiIstanzaJobProducer() {
        return this.niIstanzaJobProducer;
    }

    public void setNiIstanzaJobProducer(BigDecimal niIstanzaJobProducer) {
        this.niIstanzaJobProducer = niIstanzaJobProducer;
    }

    @Column(name = "NI_FILE_SUB_PART")
    public BigDecimal getNiFileSubPart() {
        return this.niFileSubPart;
    }

    public void setNiFileSubPart(BigDecimal niFileSubPart) {
        this.niFileSubPart = niFileSubPart;
    }

    // bi-directional many-to-one association to OstMigrazFile
    @OneToMany(mappedBy = "ostMigrazSubPart")
    public List<OstMigrazFile> getOstMigrazFiles() {
        return this.ostMigrazFiles;
    }

    public void setOstMigrazFiles(List<OstMigrazFile> ostMigrazFiles) {
        this.ostMigrazFiles = ostMigrazFiles;
    }

    public OstMigrazFile addOstMigrazFile(OstMigrazFile ostMigrazFile) {
        getOstMigrazFiles().add(ostMigrazFile);
        ostMigrazFile.setOstMigrazSubPart(this);

        return ostMigrazFile;
    }

    public OstMigrazFile removeOstMigrazFile(OstMigrazFile ostMigrazFile) {
        getOstMigrazFiles().remove(ostMigrazFile);
        ostMigrazFile.setOstMigrazSubPart(null);

        return ostMigrazFile;
    }

    // bi-directional many-to-one association to OstMigrazStrutMese
    @OneToMany(mappedBy = "ostMigrazSubPart")
    public List<OstMigrazStrutMese> getOstMigrazStrutMeses() {
        return this.ostMigrazStrutMeses;
    }

    public void setOstMigrazStrutMeses(List<OstMigrazStrutMese> ostMigrazStrutMeses) {
        this.ostMigrazStrutMeses = ostMigrazStrutMeses;
    }

    public OstMigrazStrutMese addOstMigrazStrutMes(OstMigrazStrutMese ostMigrazStrutMes) {
        getOstMigrazStrutMeses().add(ostMigrazStrutMes);
        ostMigrazStrutMes.setOstMigrazSubPart(this);

        return ostMigrazStrutMes;
    }

    public OstMigrazStrutMese removeOstMigrazStrutMes(OstMigrazStrutMese ostMigrazStrutMes) {
        getOstMigrazStrutMeses().remove(ostMigrazStrutMes);
        ostMigrazStrutMes.setOstMigrazSubPart(null);

        return ostMigrazStrutMes;
    }

    // bi-directional many-to-one association to OrgSubPartition
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SUB_PARTITION")
    public OrgSubPartition getOrgSubPartition() {
        return this.orgSubPartition;
    }

    public void setOrgSubPartition(OrgSubPartition orgSubPartition) {
        this.orgSubPartition = orgSubPartition;
    }

    // bi-directional many-to-one association to OstStatoMigrazSubPart
    @OneToMany(mappedBy = "ostMigrazSubPart")
    public List<OstStatoMigrazSubPart> getOstStatoMigrazSubParts() {
        return this.ostStatoMigrazSubParts;
    }

    public void setOstStatoMigrazSubParts(List<OstStatoMigrazSubPart> ostStatoMigrazSubParts) {
        this.ostStatoMigrazSubParts = ostStatoMigrazSubParts;
    }

    public OstStatoMigrazSubPart addOstStatoMigrazSubPart(OstStatoMigrazSubPart ostStatoMigrazSubPart) {
        getOstStatoMigrazSubParts().add(ostStatoMigrazSubPart);
        ostStatoMigrazSubPart.setOstMigrazSubPart(this);

        return ostStatoMigrazSubPart;
    }

    public OstStatoMigrazSubPart removeOstStatoMigrazSubPart(OstStatoMigrazSubPart ostStatoMigrazSubPart) {
        getOstStatoMigrazSubParts().remove(ostStatoMigrazSubPart);
        ostStatoMigrazSubPart.setOstMigrazSubPart(null);

        return ostStatoMigrazSubPart;
    }

}
