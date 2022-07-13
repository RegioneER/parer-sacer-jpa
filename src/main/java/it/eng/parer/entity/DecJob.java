package it.eng.parer.entity;

import it.eng.parer.jboss.timer.common.JobTable;
import it.eng.parer.jboss.timer.common.entity.JobDefinition;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * The persistent class for the DEC_JOB database table.
 *
 */
/* DEC_JOB */
@Entity
@Table(name = "DEC_JOB")
public class DecJob extends JobDefinition implements JobTable {

    private static final long serialVersionUID = 1L;
    private long idJob;
    private String nmJob;
    private String dsJob;
    private String tiSchedJob;
    private String tiScopoJob;
    private String nmAmbito;
    private BigDecimal niOrdExec;

    public DecJob() {
    }

    @Id
    @SequenceGenerator(name = "DEC_JOB_IDJOB_GENERATOR", sequenceName = "SDEC_JOB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_JOB_IDJOB_GENERATOR")
    @Column(name = "ID_JOB")
    @Override
    public long getIdJob() {
        return idJob;
    }

    @Override
    public void setIdJob(long idJob) {
        this.idJob = idJob;
    }

    @Column(name = "NM_JOB")
    @Override
    public String getNmJob() {
        return nmJob;
    }

    @Override
    public void setNmJob(String nmJob) {
        this.nmJob = nmJob;
    }

    @Column(name = "DS_JOB")
    @Override
    public String getDsJob() {
        return dsJob;
    }

    @Override
    public void setDsJob(String dsJob) {
        this.dsJob = dsJob;
    }

    @Column(name = "TI_SCHED_JOB")
    @Override
    public String getTiSchedJob() {
        return tiSchedJob;
    }

    @Override
    public void setTiSchedJob(String tiSchedJob) {
        this.tiSchedJob = tiSchedJob;
    }

    @Column(name = "TI_SCOPO_JOB")
    @Override
    public String getTiScopoJob() {
        return tiScopoJob;
    }

    @Override
    public void setTiScopoJob(String tiScopoJob) {
        this.tiScopoJob = tiScopoJob;
    }

    @Column(name = "NM_AMBITO")
    @Override
    public String getNmAmbito() {
        return nmAmbito;
    }

    @Override
    public void setNmAmbito(String nmAmbito) {
        this.nmAmbito = nmAmbito;
    }

    @Column(name = "NI_ORD_EXEC")
    @Override
    public BigDecimal getNiOrdExec() {
        return niOrdExec;
    }

    @Override
    public void setNiOrdExec(BigDecimal niOrdExec) {
        this.niOrdExec = niOrdExec;
    }

}
