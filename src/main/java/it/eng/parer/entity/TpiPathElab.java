package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the TPI_PATH_ELAB database table.
 * 
 */
@Entity
@Table(name = "TPI_PATH_ELAB")
public class TpiPathElab implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idPathElab;
    private String dlPathElab;
    private Date dtVersElab;
    private BigDecimal niFileDaElab;
    private BigDecimal niFileElab;
    private TpiSchedJob tpiSchedJob;

    public TpiPathElab() {
    }

    @Id
    @SequenceGenerator(name = "TPI_PATH_ELAB_IDPATHELAB_GENERATOR", sequenceName = "STPI_PATH_ELAB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPI_PATH_ELAB_IDPATHELAB_GENERATOR")
    @Column(name = "ID_PATH_ELAB")
    public long getIdPathElab() {
        return this.idPathElab;
    }

    public void setIdPathElab(long idPathElab) {
        this.idPathElab = idPathElab;
    }

    @Column(name = "DL_PATH_ELAB")
    public String getDlPathElab() {
        return this.dlPathElab;
    }

    public void setDlPathElab(String dlPathElab) {
        this.dlPathElab = dlPathElab;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_VERS_ELAB")
    public Date getDtVersElab() {
        return this.dtVersElab;
    }

    public void setDtVersElab(Date dtVersElab) {
        this.dtVersElab = dtVersElab;
    }

    @Column(name = "NI_FILE_DA_ELAB")
    public BigDecimal getNiFileDaElab() {
        return this.niFileDaElab;
    }

    public void setNiFileDaElab(BigDecimal niFileDaElab) {
        this.niFileDaElab = niFileDaElab;
    }

    @Column(name = "NI_FILE_ELAB")
    public BigDecimal getNiFileElab() {
        return this.niFileElab;
    }

    public void setNiFileElab(BigDecimal niFileElab) {
        this.niFileElab = niFileElab;
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