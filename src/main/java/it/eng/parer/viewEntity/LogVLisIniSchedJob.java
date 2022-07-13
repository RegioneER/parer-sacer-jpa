package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the LOG_V_LIS_INI_SCHED_JOB database table.
 *
 */
@Entity
@Table(name = "LOG_V_LIS_INI_SCHED_JOB")
@NamedQuery(name = "LogVLisIniSchedJob.findAll", query = "SELECT l FROM LogVLisIniSchedJob l")
public class LogVLisIniSchedJob implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date dtRegLogJobFineSuc;
    private Date dtRegLogJobIni;
    private Date dtRegLogJobIniSuc;
    private BigDecimal idLogJob;
    private String nmJob;

    public LogVLisIniSchedJob() {
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

    @Column(name = "NM_JOB")
    public String getNmJob() {
        return this.nmJob;
    }

    public void setNmJob(String nmJob) {
        this.nmJob = nmJob;
    }

}
