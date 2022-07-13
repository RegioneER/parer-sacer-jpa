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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the LOG_LOCK_ELAB database table.
 * 
 */
@Entity
@Table(name = "LOG_LOCK_ELAB")
public class LogLockElab implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idLockElab;
    private String flElabAttiva;
    private String nmElab;
    private String tiLockElab;
    private OrgStrut orgStrut;

    public LogLockElab() {
    }

    @Id
    @SequenceGenerator(name = "LOG_LOCK_ELAB_IDLOCKELAB_GENERATOR", sequenceName = "SLOG_LOCK_ELAB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_LOCK_ELAB_IDLOCKELAB_GENERATOR")
    @Column(name = "ID_LOCK_ELAB")
    public long getIdLockElab() {
        return this.idLockElab;
    }

    public void setIdLockElab(long idLockElab) {
        this.idLockElab = idLockElab;
    }

    @Column(name = "FL_ELAB_ATTIVA")
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