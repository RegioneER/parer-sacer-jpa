package it.eng.parer.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import it.eng.parer.jboss.timer.common.JobTable;
import it.eng.parer.jboss.timer.common.entity.JobDefinition;

/**
 * The persistent class for the DEC_JOB database table.
 */
/* DEC_JOB */
@Entity
@Table(name = "DEC_JOB")
public class DecJob extends JobDefinition implements JobTable {

    private static final long serialVersionUID = 1L;

    private Long idJob;

    private String nmJob;
    private String dsJob;
    private String tiSchedJob;

    private String tiScopoJob;
    private String nmAmbito;
    private BigDecimal niOrdExec;

    public DecJob() {/* Hibernate */
    }

    @Id
    // sequenceName = "SDEC_JOB", allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_JOB_IDJOB_GENERATOR")
    @Column(name = "ID_JOB")
    @Override
    @GenericGenerator(name = "SDEC_JOB_ID_JOB_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_JOB"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_JOB_ID_JOB_GENERATOR")
    public Long getIdJob() {
        return idJob;
    }

    @Override
    public void setIdJob(Long idJob) {
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
