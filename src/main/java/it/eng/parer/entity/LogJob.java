package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the LOG_JOB database table.
 *
 */
@Entity
@Table(name = "LOG_JOB")
public class LogJob implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idLogJob;
    private String dlMsgErr;
    private Date dtRegLogJob;
    private BigDecimal idRecord;
    private String nmJob;
    private String nmEntityRecord;
    private String tiRegLogJob;
    private String cdIndServer;
    private OrgStrut orgStrut;
    private List<LogOper> logOpers;
    private List<ElvLogElencoVer> elvLogElencoVers;

    public LogJob() {
    }

    @Id
    @SequenceGenerator(name = "LOG_JOB_IDLOGJOB_GENERATOR", sequenceName = "SLOG_JOB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_JOB_IDLOGJOB_GENERATOR")
    @Column(name = "ID_LOG_JOB")
    public long getIdLogJob() {
        return this.idLogJob;
    }

    public void setIdLogJob(long idLogJob) {
        this.idLogJob = idLogJob;
    }

    @Column(name = "DL_MSG_ERR")
    public String getDlMsgErr() {
        return this.dlMsgErr;
    }

    public void setDlMsgErr(String dlMsgErr) {
        this.dlMsgErr = dlMsgErr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_LOG_JOB")
    public Date getDtRegLogJob() {
        return this.dtRegLogJob;
    }

    public void setDtRegLogJob(Date dtRegLogJob) {
        this.dtRegLogJob = dtRegLogJob;
    }

    @Column(name = "ID_RECORD")
    public BigDecimal getIdRecord() {
        return this.idRecord;
    }

    public void setIdRecord(BigDecimal idRecord) {
        this.idRecord = idRecord;
    }

    @Column(name = "NM_JOB")
    public String getNmJob() {
        return this.nmJob;
    }

    public void setNmJob(String nmJob) {
        this.nmJob = nmJob;
    }

    @Column(name = "NM_ENTITY_RECORD")
    public String getNmEntityRecord() {
        return this.nmEntityRecord;
    }

    public void setNmEntityRecord(String nmEntityRecord) {
        this.nmEntityRecord = nmEntityRecord;
    }

    @Column(name = "TI_REG_LOG_JOB")
    public String getTiRegLogJob() {
        return this.tiRegLogJob;
    }

    public void setTiRegLogJob(String tiRegLogJob) {
        this.tiRegLogJob = tiRegLogJob;
    }

    @Column(name = "CD_IND_SERVER")
    public String getCdIndServer() {
        return cdIndServer;
    }

    public void setCdIndServer(String cdIndServer) {
        this.cdIndServer = cdIndServer;
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

    // bi-directional many-to-one association to LogOper
    @OneToMany(mappedBy = "logJob")
    public List<LogOper> getLogOpers() {
        return this.logOpers;
    }

    public void setLogOpers(List<LogOper> logOpers) {
        this.logOpers = logOpers;
    }

    // bi-directional many-to-one association to ElvLogElencoVer
    @OneToMany(mappedBy = "logJob")
    public List<ElvLogElencoVer> getElvLogElencoVers() {
        return this.elvLogElencoVers;
    }

    public void setElvLogElencoVers(List<ElvLogElencoVer> elvLogElencoVers) {
        this.elvLogElencoVers = elvLogElencoVers;
    }
}
