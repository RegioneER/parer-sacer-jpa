package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the TPI_DT_SCHED database table.
 * 
 */
@Entity
@Table(name = "TPI_DT_SCHED")
public class TpiDtSched implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idDtSched;
    private Date dtSched;
    private String flMigrazInCorso;
    private String flPresenzaSecondario;
    private String tiStatoDtSched;
    private List<TpiSchedJob> tpiSchedJobs;

    public TpiDtSched() {
    }

    @Id
    @SequenceGenerator(name = "TPI_DT_SCHED_IDDTSCHED_GENERATOR", sequenceName = "STPI_DT_SCHED", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPI_DT_SCHED_IDDTSCHED_GENERATOR")
    @Column(name = "ID_DT_SCHED")
    public long getIdDtSched() {
        return this.idDtSched;
    }

    public void setIdDtSched(long idDtSched) {
        this.idDtSched = idDtSched;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_SCHED")
    public Date getDtSched() {
        return this.dtSched;
    }

    public void setDtSched(Date dtSched) {
        this.dtSched = dtSched;
    }

    @Column(name = "FL_MIGRAZ_IN_CORSO")
    public String getFlMigrazInCorso() {
        return this.flMigrazInCorso;
    }

    public void setFlMigrazInCorso(String flMigrazInCorso) {
        this.flMigrazInCorso = flMigrazInCorso;
    }

    @Column(name = "FL_PRESENZA_SECONDARIO")
    public String getFlPresenzaSecondario() {
        return this.flPresenzaSecondario;
    }

    public void setFlPresenzaSecondario(String flPresenzaSecondario) {
        this.flPresenzaSecondario = flPresenzaSecondario;
    }

    @Column(name = "TI_STATO_DT_SCHED")
    public String getTiStatoDtSched() {
        return this.tiStatoDtSched;
    }

    public void setTiStatoDtSched(String tiStatoDtSched) {
        this.tiStatoDtSched = tiStatoDtSched;
    }

    // bi-directional many-to-one association to TpiSchedJob
    @OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "tpiDtSched")
    public List<TpiSchedJob> getTpiSchedJobs() {
        return this.tpiSchedJobs;
    }

    public void setTpiSchedJobs(List<TpiSchedJob> tpiSchedJobs) {
        this.tpiSchedJobs = tpiSchedJobs;
    }

}