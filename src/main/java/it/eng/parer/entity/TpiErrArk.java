package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the TPI_ERR_ARK database table.
 * 
 */
@Entity
@Table(name = "TPI_ERR_ARK")
public class TpiErrArk implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idErrArk;
    private String cdErrArk;
    private String dlErrArk;
    private BigDecimal niErrArk;
    private String tiErrArk;
    private TpiSchedJob tpiSchedJob;

    public TpiErrArk() {
    }

    @Id
    @SequenceGenerator(name = "TPI_ERR_ARK_IDERRARK_GENERATOR", sequenceName = "STPI_ERR_ARK", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPI_ERR_ARK_IDERRARK_GENERATOR")
    @Column(name = "ID_ERR_ARK")
    public long getIdErrArk() {
        return this.idErrArk;
    }

    public void setIdErrArk(long idErrArk) {
        this.idErrArk = idErrArk;
    }

    @Column(name = "CD_ERR_ARK")
    public String getCdErrArk() {
        return this.cdErrArk;
    }

    public void setCdErrArk(String cdErrArk) {
        this.cdErrArk = cdErrArk;
    }

    @Column(name = "DL_ERR_ARK")
    public String getDlErrArk() {
        return this.dlErrArk;
    }

    public void setDlErrArk(String dlErrArk) {
        this.dlErrArk = dlErrArk;
    }

    @Column(name = "NI_ERR_ARK")
    public BigDecimal getNiErrArk() {
        return this.niErrArk;
    }

    public void setNiErrArk(BigDecimal niErrArk) {
        this.niErrArk = niErrArk;
    }

    @Column(name = "TI_ERR_ARK")
    public String getTiErrArk() {
        return this.tiErrArk;
    }

    public void setTiErrArk(String tiErrArk) {
        this.tiErrArk = tiErrArk;
    }

    // bi-directional many-to-one association to TpiSchedJob
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SCHED_JOB")
    public TpiSchedJob getTpiSchedJob() {
        return this.tpiSchedJob;
    }

    public void setTpiSchedJob(TpiSchedJob tpiSchedJob) {
        this.tpiSchedJob = tpiSchedJob;
    }

}