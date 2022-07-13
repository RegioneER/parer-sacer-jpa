package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the SER_V_JOB_VER_SERIE_BLOCCATO database table.
 * 
 */
@Entity
@Table(name = "SER_V_JOB_VER_SERIE_BLOCCATO")
@NamedQuery(name = "SerVJobVerSerieBloccato.findAll", query = "SELECT s FROM SerVJobVerSerieBloccato s")
public class SerVJobVerSerieBloccato implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dlMsgJobBloccato;
    private String flJobBloccato;
    private BigDecimal idVerSerie;
    private String nmJob;

    public SerVJobVerSerieBloccato() {
    }

    @Column(name = "DL_MSG_JOB_BLOCCATO")
    public String getDlMsgJobBloccato() {
        return this.dlMsgJobBloccato;
    }

    public void setDlMsgJobBloccato(String dlMsgJobBloccato) {
        this.dlMsgJobBloccato = dlMsgJobBloccato;
    }

    @Column(name = "FL_JOB_BLOCCATO")
    public String getFlJobBloccato() {
        return this.flJobBloccato;
    }

    public void setFlJobBloccato(String flJobBloccato) {
        this.flJobBloccato = flJobBloccato;
    }

    @Id
    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

    @Id
    @Column(name = "NM_JOB")
    public String getNmJob() {
        return this.nmJob;
    }

    public void setNmJob(String nmJob) {
        this.nmJob = nmJob;
    }

}