package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the TPI_SCHED_JOB database table.
 * 
 */
@Entity
@Table(name = "TPI_SCHED_JOB")
public class TpiSchedJob implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idSchedJob;
    private String dlErrJob;
    private String dsDurataJob;
    private Date dtSchedJob;
    private String flFineSched;
    private String flJobOk;
    private String flMigraz;
    private BigDecimal niOrdSchedJob;
    private String nmJob;
    private String tiTpiSchedJob;
    private List<TpiErrArk> tpiErrArks;
    private TpiDtSched tpiDtSched;
    private List<TpiPathElab> tpiPathElabs;

    public TpiSchedJob() {
    }

    @Id
    @SequenceGenerator(name = "TPI_SCHED_JOB_IDSCHEDJOB_GENERATOR", sequenceName = "STPI_SCHED_JOB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPI_SCHED_JOB_IDSCHEDJOB_GENERATOR")
    @Column(name = "ID_SCHED_JOB")
    public long getIdSchedJob() {
        return this.idSchedJob;
    }

    public void setIdSchedJob(long idSchedJob) {
        this.idSchedJob = idSchedJob;
    }

    @Column(name = "DL_ERR_JOB")
    public String getDlErrJob() {
        return this.dlErrJob;
    }

    public void setDlErrJob(String dlErrJob) {
        this.dlErrJob = dlErrJob;
    }

    @Column(name = "DS_DURATA_JOB")
    public String getDsDurataJob() {
        return this.dsDurataJob;
    }

    public void setDsDurataJob(String dsDurataJob) {
        this.dsDurataJob = dsDurataJob;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SCHED_JOB")
    public Date getDtSchedJob() {
        return this.dtSchedJob;
    }

    public void setDtSchedJob(Date dtSchedJob) {
        this.dtSchedJob = dtSchedJob;
    }

    @Column(name = "FL_FINE_SCHED")
    public String getFlFineSched() {
        return this.flFineSched;
    }

    public void setFlFineSched(String flFineSched) {
        this.flFineSched = flFineSched;
    }

    @Column(name = "FL_JOB_OK")
    public String getFlJobOk() {
        return this.flJobOk;
    }

    public void setFlJobOk(String flJobOk) {
        this.flJobOk = flJobOk;
    }

    @Column(name = "FL_MIGRAZ")
    public String getFlMigraz() {
        return this.flMigraz;
    }

    public void setFlMigraz(String flMigraz) {
        this.flMigraz = flMigraz;
    }

    @Column(name = "NI_ORD_SCHED_JOB")
    public BigDecimal getNiOrdSchedJob() {
        return this.niOrdSchedJob;
    }

    public void setNiOrdSchedJob(BigDecimal niOrdSchedJob) {
        this.niOrdSchedJob = niOrdSchedJob;
    }

    @Column(name = "NM_JOB")
    public String getNmJob() {
        return this.nmJob;
    }

    public void setNmJob(String nmJob) {
        this.nmJob = nmJob;
    }

    @Column(name = "TI_TPI_SCHED_JOB")
    public String getTiTpiSchedJob() {
        return this.tiTpiSchedJob;
    }

    public void setTiTpiSchedJob(String tiTpiSchedJob) {
        this.tiTpiSchedJob = tiTpiSchedJob;
    }

    // bi-directional many-to-one association to TpiErrArk
    @OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "tpiSchedJob")
    public List<TpiErrArk> getTpiErrArks() {
        return this.tpiErrArks;
    }

    public void setTpiErrArks(List<TpiErrArk> tpiErrArks) {
        this.tpiErrArks = tpiErrArks;
    }

    // bi-directional many-to-one association to TpiDtSched
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DT_SCHED")
    public TpiDtSched getTpiDtSched() {
        return this.tpiDtSched;
    }

    public void setTpiDtSched(TpiDtSched tpiDtSched) {
        this.tpiDtSched = tpiDtSched;
    }

    // bi-directional many-to-one association to TpiPathElab
    @OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "tpiSchedJob")
    public List<TpiPathElab> getTpiPathElabs() {
        return this.tpiPathElabs;
    }

    public void setTpiPathElabs(List<TpiPathElab> tpiPathElabs) {
        this.tpiPathElabs = tpiPathElabs;
    }

}