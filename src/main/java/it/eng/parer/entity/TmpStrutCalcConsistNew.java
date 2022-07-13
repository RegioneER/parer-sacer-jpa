package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the TMP_STRUT_CALC_CONSIST_NEW database table.
 * 
 */
@Entity
@Table(name = "TMP_STRUT_CALC_CONSIST_NEW")
@NamedQuery(name = "TmpStrutCalcConsistNew.findAll", query = "SELECT t FROM TmpStrutCalcConsistNew t")
public class TmpStrutCalcConsistNew implements Serializable {

    public enum TiStatoElab {
        DA_ELABORARE, ELABORAZIONE_KO, ELABORAZIONE_OK
    }

    private static final long serialVersionUID = 1L;
    private long idTmpStrutCalcConsist;
    private String tiStatoElab;
    private OrgStrut orgStrut;
    private Date dtRifConta;
    private Date dtExecJob;
    private BigDecimal aaKeyUnitaDoc;
    private OrgSubStrut orgSubStrut;

    public TmpStrutCalcConsistNew() {
    }

    @Id
    @SequenceGenerator(name = "TMP_STRUT_CALC_CONSIST_NEW_IDTMPSTRUTCALCCONSIST_GENERATOR", sequenceName = "STMP_STRUT_CALC_CONSIST_NEW", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TMP_STRUT_CALC_CONSIST_NEW_IDTMPSTRUTCALCCONSIST_GENERATOR")
    @Column(name = "ID_TMP_STRUT_CALC_CONSIST")
    public long getIdTmpStrutCalcConsist() {
        return this.idTmpStrutCalcConsist;
    }

    public void setIdTmpStrutCalcConsist(long idTmpStrutCalcConsist) {
        this.idTmpStrutCalcConsist = idTmpStrutCalcConsist;
    }

    @Column(name = "TI_STATO_ELAB")
    public String getTiStatoElab() {
        return this.tiStatoElab;
    }

    public void setTiStatoElab(String tiStatoElab) {
        this.tiStatoElab = tiStatoElab;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return this.dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_EXEC_JOB")
    public Date getDtExecJob() {
        return this.dtExecJob;
    }

    public void setDtExecJob(Date dtExecJob) {
        this.dtExecJob = dtExecJob;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SUB_STRUT")
    public OrgSubStrut getOrgSubStrut() {
        return this.orgSubStrut;
    }

    public void setOrgSubStrut(OrgSubStrut orgSubStrut) {
        this.orgSubStrut = orgSubStrut;
    }

}