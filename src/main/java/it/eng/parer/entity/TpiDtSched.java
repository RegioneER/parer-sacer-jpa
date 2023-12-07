package it.eng.parer.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the TPI_DT_SCHED database table.
 */
@Entity
@Table(name = "TPI_DT_SCHED")
public class TpiDtSched implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idDtSched;

    private Date dtSched;

    private String flMigrazInCorso;

    private String flPresenzaSecondario;

    private String tiStatoDtSched;

    private List<TpiSchedJob> tpiSchedJobs = new ArrayList<>();

    public TpiDtSched() {/* Hibernate */
    }

    @Id
    // "TPI_DT_SCHED_IDDTSCHED_GENERATOR", sequenceName =
    // "STPI_DT_SCHED", allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TPI_DT_SCHED_IDDTSCHED_GENERATOR")
    @Column(name = "ID_DT_SCHED")
    @GenericGenerator(name = "STPI_DT_SCHED_ID_DT_SCHED_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "STPI_DT_SCHED"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "STPI_DT_SCHED_ID_DT_SCHED_GENERATOR")
    public Long getIdDtSched() {
        return this.idDtSched;
    }

    public void setIdDtSched(Long idDtSched) {
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

    @Column(name = "FL_MIGRAZ_IN_CORSO", columnDefinition = "char(1)")
    public String getFlMigrazInCorso() {
        return this.flMigrazInCorso;
    }

    public void setFlMigrazInCorso(String flMigrazInCorso) {
        this.flMigrazInCorso = flMigrazInCorso;
    }

    @Column(name = "FL_PRESENZA_SECONDARIO", columnDefinition = "char(1)")
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
