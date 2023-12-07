package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
    private SerVJobContenutoBloccatoId serVJobContenutoBloccatoId;

    @EmbeddedId
    public SerVJobContenutoBloccatoId getSerVJobContenutoBloccatoId() {
        return serVJobContenutoBloccatoId;
    }

    public void setSerVJobContenutoBloccatoId(SerVJobContenutoBloccatoId serVJobContenutoBloccatoId) {
        this.serVJobContenutoBloccatoId = serVJobContenutoBloccatoId;
    }

    public SerVJobContenutoBloccato() {/* Hibernate */
    }

    @Column(name = "DL_MSG_JOB_BLOCCATO")
    public String getDlMsgJobBloccato() {
        return this.dlMsgJobBloccato;
    }

    public void setDlMsgJobBloccato(String dlMsgJobBloccato) {
        this.dlMsgJobBloccato = dlMsgJobBloccato;
    }

    @Column(name = "FL_JOB_BLOCCATO", columnDefinition = "char(1)")
    public String getFlJobBloccato() {
        return this.flJobBloccato;
    }

    public void setFlJobBloccato(String flJobBloccato) {
        this.flJobBloccato = flJobBloccato;
    }

}
