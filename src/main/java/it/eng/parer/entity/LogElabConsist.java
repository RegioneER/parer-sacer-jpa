package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the LOG_ELAB_CONSIST database table.
 * 
 */
@Entity
@Table(name = "LOG_ELAB_CONSIST")
@NamedQuery(name = "LogElabConsist.findAll", query = "SELECT l FROM LogElabConsist l")
public class LogElabConsist implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idElabConsist;
    private Date dtElabConsist;
    private Date dtRifContaA;
    private Date dtRifContaDa;

    public LogElabConsist() {
    }

    @Id
    @SequenceGenerator(name = "LOG_ELAB_CONSIST_IDELABCONSIST_GENERATOR", sequenceName = "SLOG_ELAB_CONSIST", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_ELAB_CONSIST_IDELABCONSIST_GENERATOR")
    @Column(name = "ID_ELAB_CONSIST")
    public Long getIdElabConsist() {
        return this.idElabConsist;
    }

    public void setIdElabConsist(Long idElabConsist) {
        this.idElabConsist = idElabConsist;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ELAB_CONSIST")
    public Date getDtElabConsist() {
        return this.dtElabConsist;
    }

    public void setDtElabConsist(Date dtElabConsist) {
        this.dtElabConsist = dtElabConsist;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_RIF_CONTA_A")
    public Date getDtRifContaA() {
        return this.dtRifContaA;
    }

    public void setDtRifContaA(Date dtRifContaA) {
        this.dtRifContaA = dtRifContaA;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_RIF_CONTA_DA")
    public Date getDtRifContaDa() {
        return this.dtRifContaDa;
    }

    public void setDtRifContaDa(Date dtRifContaDa) {
        this.dtRifContaDa = dtRifContaDa;
    }

}
