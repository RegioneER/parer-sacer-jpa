package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the LOG_V_LIS_INI_SCHED_JOB_STRUT database table.
 *
 */
@Entity
@Table(name = "LOG_V_LIS_INI_SCHED_JOB_STRUT_HIST")
@NamedQuery(name = "LogVLisIniSchedJobStrutHist.findAll", query = "SELECT l FROM LogVLisIniSchedJobStrutHist l")
public class LogVLisIniSchedJobStrutHist implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date dtRegLogJobFineSuc;
    private Date dtRegLogJobIni;
    private Date dtRegLogJobIniSuc;
    private BigDecimal idLogJob;
    private BigDecimal idStrut;
    private String nmJob;

    public LogVLisIniSchedJobStrutHist() {/* Hibernate */
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_LOG_JOB_FINE_SUC")
    public Date getDtRegLogJobFineSuc() {
        return this.dtRegLogJobFineSuc;
    }

    public void setDtRegLogJobFineSuc(Date dtRegLogJobFineSuc) {
        this.dtRegLogJobFineSuc = dtRegLogJobFineSuc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_LOG_JOB_INI")
    public Date getDtRegLogJobIni() {
        return this.dtRegLogJobIni;
    }

    public void setDtRegLogJobIni(Date dtRegLogJobIni) {
        this.dtRegLogJobIni = dtRegLogJobIni;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_LOG_JOB_INI_SUC")
    public Date getDtRegLogJobIniSuc() {
        return this.dtRegLogJobIniSuc;
    }

    public void setDtRegLogJobIniSuc(Date dtRegLogJobIniSuc) {
        this.dtRegLogJobIniSuc = dtRegLogJobIniSuc;
    }

    @Id
    @Column(name = "ID_LOG_JOB")
    public BigDecimal getIdLogJob() {
        return this.idLogJob;
    }

    public void setIdLogJob(BigDecimal idLogJob) {
        this.idLogJob = idLogJob;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NM_JOB")
    public String getNmJob() {
        return this.nmJob;
    }

    public void setNmJob(String nmJob) {
        this.nmJob = nmJob;
    }

}
