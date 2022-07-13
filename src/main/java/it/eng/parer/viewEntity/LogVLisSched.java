package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the LOG_V_LIS_SCHED database table.
 * 
 */
@Entity
@Table(name = "LOG_V_LIS_SCHED")
public class LogVLisSched implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idLogJob;
    private String nmJob;
    private Date dtRegLogJobIni;
    private Date dtRegLogJobFine;
    private BigDecimal durataGg;
    private BigDecimal durataOre;
    private BigDecimal durataMin;
    private BigDecimal durataSec;
    private String dlMsgErr;

    public LogVLisSched() {
    }

    public LogVLisSched(Date dtRegLogJobIni, Date dtRegLogJobFine, BigDecimal durataGg, BigDecimal durataOre,
            BigDecimal durataMin, BigDecimal durataSec, String dlMsgErr) {
        this.dtRegLogJobIni = dtRegLogJobIni;
        this.dtRegLogJobFine = dtRegLogJobFine;
        this.durataGg = durataGg;
        this.durataOre = durataOre;
        this.durataMin = durataMin;
        this.durataSec = durataSec;
        this.dlMsgErr = dlMsgErr;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_LOG_JOB_INI")
    public Date getDtRegLogJobIni() {
        return dtRegLogJobIni;
    }

    public void setDtRegLogJobIni(Date dtRegLogJobIni) {
        this.dtRegLogJobIni = dtRegLogJobIni;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_LOG_JOB_FINE")
    public Date getDtRegLogJobFine() {
        return dtRegLogJobFine;
    }

    public void setDtRegLogJobFine(Date dtRegLogJobFine) {
        this.dtRegLogJobFine = dtRegLogJobFine;
    }

    @Column(name = "DURATA_GG")
    public BigDecimal getDurataGg() {
        return durataGg;
    }

    public void setDurataGg(BigDecimal durataGg) {
        this.durataGg = durataGg;
    }

    @Column(name = "DURATA_ORE")
    public BigDecimal getDurataOre() {
        return durataOre;
    }

    public void setDurataOre(BigDecimal durataOre) {
        this.durataOre = durataOre;
    }

    @Column(name = "DURATA_MIN")
    public BigDecimal getDurataMin() {
        return durataMin;
    }

    public void setDurataMin(BigDecimal durataMin) {
        this.durataMin = durataMin;
    }

    @Column(name = "DURATA_SEC")
    public BigDecimal getDurataSec() {
        return durataSec;
    }

    public void setDurataSec(BigDecimal durataSec) {
        this.durataSec = durataSec;
    }

    @Column(name = "DL_MSG_ERR")
    public String getDlMsgErr() {
        return dlMsgErr;
    }

    public void setDlMsgErr(String dlMsgErr) {
        this.dlMsgErr = dlMsgErr;
    }
}