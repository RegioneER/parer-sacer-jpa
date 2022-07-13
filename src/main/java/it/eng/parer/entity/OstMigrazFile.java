package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the OST_MIGRAZ_FILE database table.
 *
 */
@Entity
@Table(name = "OST_MIGRAZ_FILE")
@NamedQuery(name = "OstMigrazFile.findAll", query = "SELECT o FROM OstMigrazFile o")
public class OstMigrazFile implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idMigrazFile;
    private String cdKeyFile;
    private BigDecimal idOggetto;
    private BigDecimal idStrut;
    private BigDecimal mmFile;
    private BigDecimal niMigrazErr;
    private String nmBucket;
    private String nmTabellaIdOggetto;
    private String nmTenant;
    private String tiStatoCor;
    private Date tsMigrato;
    private Date tsRegStatoCor;
    private Date tsVerificato;
    private OstMigrazSubPart ostMigrazSubPart;
    private List<OstMigrazFileErr> ostMigrazFileErrs;

    public OstMigrazFile() {
    }

    @Id
    @SequenceGenerator(name = "OST_MIGRAZ_FILE_IDMIGRAZFILE_GENERATOR", sequenceName = "SOST_MIGRAZ_FILE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OST_MIGRAZ_FILE_IDMIGRAZFILE_GENERATOR")
    @Column(name = "ID_MIGRAZ_FILE")
    public long getIdMigrazFile() {
        return this.idMigrazFile;
    }

    public void setIdMigrazFile(long idMigrazFile) {
        this.idMigrazFile = idMigrazFile;
    }

    @Column(name = "CD_KEY_FILE")
    public String getCdKeyFile() {
        return this.cdKeyFile;
    }

    public void setCdKeyFile(String cdKeyFile) {
        this.cdKeyFile = cdKeyFile;
    }

    @Column(name = "ID_OGGETTO")
    public BigDecimal getIdOggetto() {
        return this.idOggetto;
    }

    public void setIdOggetto(BigDecimal idOggetto) {
        this.idOggetto = idOggetto;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "MM_FILE")
    public BigDecimal getMmFile() {
        return this.mmFile;
    }

    public void setMmFile(BigDecimal mmFile) {
        this.mmFile = mmFile;
    }

    @Column(name = "NI_MIGRAZ_ERR")
    public BigDecimal getNiMigrazErr() {
        return this.niMigrazErr;
    }

    public void setNiMigrazErr(BigDecimal niMigrazErr) {
        this.niMigrazErr = niMigrazErr;
    }

    @Column(name = "NM_BUCKET")
    public String getNmBucket() {
        return this.nmBucket;
    }

    public void setNmBucket(String nmBucket) {
        this.nmBucket = nmBucket;
    }

    @Column(name = "NM_TABELLA_ID_OGGETTO")
    public String getNmTabellaIdOggetto() {
        return this.nmTabellaIdOggetto;
    }

    public void setNmTabellaIdOggetto(String nmTabellaIdOggetto) {
        this.nmTabellaIdOggetto = nmTabellaIdOggetto;
    }

    @Column(name = "NM_TENANT")
    public String getNmTenant() {
        return this.nmTenant;
    }

    public void setNmTenant(String nmTenant) {
        this.nmTenant = nmTenant;
    }

    @Column(name = "TI_STATO_COR")
    public String getTiStatoCor() {
        return this.tiStatoCor;
    }

    public void setTiStatoCor(String tiStatoCor) {
        this.tiStatoCor = tiStatoCor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_MIGRATO")
    public Date getTsMigrato() {
        return this.tsMigrato;
    }

    public void setTsMigrato(Date tsMigrato) {
        this.tsMigrato = tsMigrato;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_REG_STATO_COR")
    public Date getTsRegStatoCor() {
        return this.tsRegStatoCor;
    }

    public void setTsRegStatoCor(Date tsRegStatoCor) {
        this.tsRegStatoCor = tsRegStatoCor;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_VERIFICATO")
    public Date getTsVerificato() {
        return this.tsVerificato;
    }

    public void setTsVerificato(Date tsVerificato) {
        this.tsVerificato = tsVerificato;
    }

    // bi-directional many-to-one association to OstMigrazSubPart
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MIGRAZ_SUB_PART")
    public OstMigrazSubPart getOstMigrazSubPart() {
        return this.ostMigrazSubPart;
    }

    public void setOstMigrazSubPart(OstMigrazSubPart ostMigrazSubPart) {
        this.ostMigrazSubPart = ostMigrazSubPart;
    }

    // bi-directional many-to-one association to OstMigrazFileErr
    @OneToMany(mappedBy = "ostMigrazFile")
    public List<OstMigrazFileErr> getOstMigrazFileErrs() {
        return this.ostMigrazFileErrs;
    }

    public void setOstMigrazFileErrs(List<OstMigrazFileErr> ostMigrazFileErrs) {
        this.ostMigrazFileErrs = ostMigrazFileErrs;
    }

    public OstMigrazFileErr addOstMigrazFileErr(OstMigrazFileErr ostMigrazFileErr) {
        getOstMigrazFileErrs().add(ostMigrazFileErr);
        ostMigrazFileErr.setOstMigrazFile(this);

        return ostMigrazFileErr;
    }

    public OstMigrazFileErr removeOstMigrazFileErr(OstMigrazFileErr ostMigrazFileErr) {
        getOstMigrazFileErrs().remove(ostMigrazFileErr);
        ostMigrazFileErr.setOstMigrazFile(null);

        return ostMigrazFileErr;
    }

}
