package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the LOG_V_JOB_ALL database table.
 * 
 */
@Entity
@Table(name = "LOG_V_JOB_ALL")
public class LogVJobAll implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idLogJob;
    private String nmJob;
    private String dlMsgErr;
    private Date dtRegLogJob;
    private BigDecimal idRecord;
    private String nmEntityRecord;
    private String tiRegLogJob;
    private String cdIndServer;
    private BigDecimal idStrut;

    public LogVJobAll() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_LOG_JOB")
    public BigDecimal getIdLogJob() {
        return this.idLogJob;
    }

    public void setIdLogJob(BigDecimal idLogJob) {
        this.idLogJob = idLogJob;
    }

    @Column(name = "NM_JOB")
    public String getNmJob() {
        return nmJob;
    }

    public void setNmJob(String nmJob) {
        this.nmJob = nmJob;
    }

    @Column(name = "DL_MSG_ERR")
    public String getDlMsgErr() {
        return dlMsgErr;
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

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }
}
