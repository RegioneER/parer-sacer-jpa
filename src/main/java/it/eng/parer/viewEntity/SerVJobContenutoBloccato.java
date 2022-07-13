package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the SER_V_JOB_CONTENUTO_BLOCCATO database table.
 * 
 */
@Entity
@Table(name = "SER_V_JOB_CONTENUTO_BLOCCATO")
@NamedQuery(name = "SerVJobContenutoBloccato.findAll", query = "SELECT s FROM SerVJobContenutoBloccato s")
public class SerVJobContenutoBloccato implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dlMsgJobBloccato;
    private String flJobBloccato;
    private BigDecimal idContenutoVerSerie;
    private String nmJob;

    public SerVJobContenutoBloccato() {
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
    @Column(name = "ID_CONTENUTO_VER_SERIE")
    public BigDecimal getIdContenutoVerSerie() {
        return this.idContenutoVerSerie;
    }

    public void setIdContenutoVerSerie(BigDecimal idContenutoVerSerie) {
        this.idContenutoVerSerie = idContenutoVerSerie;
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