package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_BUCO_NUMERAZIONE_UD database table.
 * 
 */
@Entity
@Table(name = "SER_V_BUCO_NUMERAZIONE_UD")
@NamedQuery(name = "SerVBucoNumerazioneUd.findAll", query = "SELECT s FROM SerVBucoNumerazioneUd s")
public class SerVBucoNumerazioneUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal pgUdSerFinBuco;
    private SerVBucoNumerazioneUdId serVBucoNumerazioneUdId;

    public SerVBucoNumerazioneUd() {/* Hibernate */
    }

    @EmbeddedId
    public SerVBucoNumerazioneUdId getSerVBucoNumerazioneUdId() {
        return serVBucoNumerazioneUdId;
    }

    public void setSerVBucoNumerazioneUdId(SerVBucoNumerazioneUdId serVBucoNumerazioneUdId) {
        this.serVBucoNumerazioneUdId = serVBucoNumerazioneUdId;
    }

    @Column(name = "PG_UD_SER_FIN_BUCO")
    public BigDecimal getPgUdSerFinBuco() {
        return this.pgUdSerFinBuco;
    }

    public void setPgUdSerFinBuco(BigDecimal pgUdSerFinBuco) {
        this.pgUdSerFinBuco = pgUdSerFinBuco;
    }

}
