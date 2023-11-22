package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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
    private SerVJobVerSerieBloccatoId serVJobVerSerieBloccatoId;

    public SerVJobVerSerieBloccato() {/* Hibernate */
    }

    @EmbeddedId
    public SerVJobVerSerieBloccatoId getSerVJobVerSerieBloccatoId() {
        return serVJobVerSerieBloccatoId;
    }

    public void setSerVJobVerSerieBloccatoId(SerVJobVerSerieBloccatoId serVJobVerSerieBloccatoId) {
        this.serVJobVerSerieBloccatoId = serVJobVerSerieBloccatoId;
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
