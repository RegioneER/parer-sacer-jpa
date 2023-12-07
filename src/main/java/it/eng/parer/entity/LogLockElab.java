package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the LOG_LOCK_ELAB database table.
 */
@Entity
@Table(name = "LOG_LOCK_ELAB")
public class LogLockElab implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idLockElab;

    private String flElabAttiva;

    private String nmElab;

    private String tiLockElab;

    private OrgStrut orgStrut;

    public LogLockElab() {/* Hibernate */
    }

    @Id
    // "LOG_LOCK_ELAB_IDLOCKELAB_GENERATOR",
    // sequenceName = "SLOG_LOCK_ELAB", allocationSize =
    // 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_LOCK_ELAB_IDLOCKELAB_GENERATOR")
    @Column(name = "ID_LOCK_ELAB")
    @GenericGenerator(name = "SLOG_LOCK_ELAB_ID_LOCK_ELAB_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SLOG_LOCK_ELAB"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SLOG_LOCK_ELAB_ID_LOCK_ELAB_GENERATOR")
    public Long getIdLockElab() {
        return this.idLockElab;
    }

    public void setIdLockElab(Long idLockElab) {
        this.idLockElab = idLockElab;
    }

    @Column(name = "FL_ELAB_ATTIVA", columnDefinition = "char(1)")
    public String getFlElabAttiva() {
        return this.flElabAttiva;
    }

    public void setFlElabAttiva(String flElabAttiva) {
        this.flElabAttiva = flElabAttiva;
    }

    @Column(name = "NM_ELAB")
    public String getNmElab() {
        return this.nmElab;
    }

    public void setNmElab(String nmElab) {
        this.nmElab = nmElab;
    }

    @Column(name = "TI_LOCK_ELAB")
    public String getTiLockElab() {
        return this.tiLockElab;
    }

    public void setTiLockElab(String tiLockElab) {
        this.tiLockElab = tiLockElab;
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

}
