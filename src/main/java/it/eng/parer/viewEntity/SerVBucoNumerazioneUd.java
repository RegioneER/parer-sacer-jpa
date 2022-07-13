package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the SER_V_BUCO_NUMERAZIONE_UD database table.
 * 
 */
@Entity
@Table(name = "SER_V_BUCO_NUMERAZIONE_UD")
@NamedQuery(name = "SerVBucoNumerazioneUd.findAll", query = "SELECT s FROM SerVBucoNumerazioneUd s")
public class SerVBucoNumerazioneUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idContenutoVerSerie;
    private BigDecimal pgUdSerFinBuco;
    private BigDecimal pgUdSerIniBuco;

    public SerVBucoNumerazioneUd() {
    }

    @Id
    @Column(name = "ID_CONTENUTO_VER_SERIE")
    public BigDecimal getIdContenutoVerSerie() {
        return this.idContenutoVerSerie;
    }

    public void setIdContenutoVerSerie(BigDecimal idContenutoVerSerie) {
        this.idContenutoVerSerie = idContenutoVerSerie;
    }

    @Column(name = "PG_UD_SER_FIN_BUCO")
    public BigDecimal getPgUdSerFinBuco() {
        return this.pgUdSerFinBuco;
    }

    public void setPgUdSerFinBuco(BigDecimal pgUdSerFinBuco) {
        this.pgUdSerFinBuco = pgUdSerFinBuco;
    }

    @Id
    @Column(name = "PG_UD_SER_INI_BUCO")
    public BigDecimal getPgUdSerIniBuco() {
        return this.pgUdSerIniBuco;
    }

    public void setPgUdSerIniBuco(BigDecimal pgUdSerIniBuco) {
        this.pgUdSerIniBuco = pgUdSerIniBuco;
    }

}