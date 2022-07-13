package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Classe di appoggio per gestire il risultato di preparazione query per la creazione di una serie
 *
 */
@Entity
public class ResultVCalcoloSerieUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private Date dtCreazione;
    private String keyUdSerie;
    private Date dtUdSerie;
    private String infoUdSerie;
    private String dsKeyOrdUdSerie;
    private BigDecimal pgUdSerie;

    public ResultVCalcoloSerieUd() {
    }

    public ResultVCalcoloSerieUd(long idUnitaDoc, Date dtCreazione, String keyUdSerie, Date dtUdSerie,
            String infoUdSerie, String dsKeyOrdUdSerie, BigDecimal pgUdSerie) {
        this.idUnitaDoc = new BigDecimal(idUnitaDoc);
        this.dtCreazione = dtCreazione;
        this.keyUdSerie = keyUdSerie;
        this.dtUdSerie = dtUdSerie;
        this.infoUdSerie = infoUdSerie;
        this.dsKeyOrdUdSerie = dsKeyOrdUdSerie;
        this.pgUdSerie = pgUdSerie;
    }

    @Id
    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "KEY_UD_SERIE")
    public String getKeyUdSerie() {
        return keyUdSerie;
    }

    public void setKeyUdSerie(String keyUdSerie) {
        this.keyUdSerie = keyUdSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_UD_SERIE")
    public Date getDtUdSerie() {
        return dtUdSerie;
    }

    public void setDtUdSerie(Date dtUdSerie) {
        this.dtUdSerie = dtUdSerie;
    }

    @Column(name = "INFO_UD_SERIE")
    public String getInfoUdSerie() {
        return infoUdSerie;
    }

    public void setInfoUdSerie(String infoUdSerie) {
        this.infoUdSerie = infoUdSerie;
    }

    @Column(name = "DS_KEY_ORD_UD_SERIE")
    public String getDsKeyOrdUdSerie() {
        return dsKeyOrdUdSerie;
    }

    public void setDsKeyOrdUdSerie(String dsKeyOrdUdSerie) {
        this.dsKeyOrdUdSerie = dsKeyOrdUdSerie;
    }

    @Column(name = "PG_UD_SERIE")
    public BigDecimal getPgUdSerie() {
        return this.pgUdSerie;
    }

    public void setPgUdSerie(BigDecimal pgUdSerie) {
        this.pgUdSerie = pgUdSerie;
    }

}
