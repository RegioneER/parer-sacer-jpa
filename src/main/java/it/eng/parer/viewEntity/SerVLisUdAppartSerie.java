package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the SER_V_LIS_UD_APPART_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_V_LIS_UD_APPART_SERIE")
@NamedQuery(name = "SerVLisUdAppartSerie.findAll", query = "SELECT s FROM SerVLisUdAppartSerie s")
public class SerVLisUdAppartSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cdKeyUnitaDoc;
    private String cdUdSerie;
    private String dsKeyOrdUdSerie;
    private Date dtUdSerie;
    private String flPresenteAltraSerie;
    private String flPresenteContenuto1;
    private String flPresenteContenuto2;
    private String flUnitaDocAnnul;
    private BigDecimal idContenutoVerSerie;
    private BigDecimal idUdAppartVerSerie;
    private BigDecimal idUnitaDoc;
    private BigDecimal idVolVerSerie;
    private String infoUdSerie;
    private BigDecimal pgUdSerie;
    private String tiStatoConservazione;

    public SerVLisUdAppartSerie() {
    }

    @Column(name = "CD_KEY_UNITA_DOC")
    public String getCdKeyUnitaDoc() {
        return this.cdKeyUnitaDoc;
    }

    public void setCdKeyUnitaDoc(String cdKeyUnitaDoc) {
        this.cdKeyUnitaDoc = cdKeyUnitaDoc;
    }

    @Column(name = "CD_UD_SERIE")
    public String getCdUdSerie() {
        return this.cdUdSerie;
    }

    public void setCdUdSerie(String cdUdSerie) {
        this.cdUdSerie = cdUdSerie;
    }

    @Column(name = "DS_KEY_ORD_UD_SERIE")
    public String getDsKeyOrdUdSerie() {
        return this.dsKeyOrdUdSerie;
    }

    public void setDsKeyOrdUdSerie(String dsKeyOrdUdSerie) {
        this.dsKeyOrdUdSerie = dsKeyOrdUdSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_UD_SERIE")
    public Date getDtUdSerie() {
        return this.dtUdSerie;
    }

    public void setDtUdSerie(Date dtUdSerie) {
        this.dtUdSerie = dtUdSerie;
    }

    @Column(name = "FL_PRESENTE_ALTRA_SERIE")
    public String getFlPresenteAltraSerie() {
        return this.flPresenteAltraSerie;
    }

    public void setFlPresenteAltraSerie(String flPresenteAltraSerie) {
        this.flPresenteAltraSerie = flPresenteAltraSerie;
    }

    @Column(name = "FL_PRESENTE_CONTENUTO_1")
    public String getFlPresenteContenuto1() {
        return this.flPresenteContenuto1;
    }

    public void setFlPresenteContenuto1(String flPresenteContenuto1) {
        this.flPresenteContenuto1 = flPresenteContenuto1;
    }

    @Column(name = "FL_PRESENTE_CONTENUTO_2")
    public String getFlPresenteContenuto2() {
        return this.flPresenteContenuto2;
    }

    public void setFlPresenteContenuto2(String flPresenteContenuto2) {
        this.flPresenteContenuto2 = flPresenteContenuto2;
    }

    @Column(name = "FL_UNITA_DOC_ANNUL")
    public String getFlUnitaDocAnnul() {
        return this.flUnitaDocAnnul;
    }

    public void setFlUnitaDocAnnul(String flUnitaDocAnnul) {
        this.flUnitaDocAnnul = flUnitaDocAnnul;
    }

    @Column(name = "ID_CONTENUTO_VER_SERIE")
    public BigDecimal getIdContenutoVerSerie() {
        return this.idContenutoVerSerie;
    }

    public void setIdContenutoVerSerie(BigDecimal idContenutoVerSerie) {
        this.idContenutoVerSerie = idContenutoVerSerie;
    }

    @Id
    @Column(name = "ID_UD_APPART_VER_SERIE")
    public BigDecimal getIdUdAppartVerSerie() {
        return this.idUdAppartVerSerie;
    }

    public void setIdUdAppartVerSerie(BigDecimal idUdAppartVerSerie) {
        this.idUdAppartVerSerie = idUdAppartVerSerie;
    }

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Column(name = "ID_VOL_VER_SERIE")
    public BigDecimal getIdVolVerSerie() {
        return this.idVolVerSerie;
    }

    public void setIdVolVerSerie(BigDecimal idVolVerSerie) {
        this.idVolVerSerie = idVolVerSerie;
    }

    @Column(name = "INFO_UD_SERIE")
    public String getInfoUdSerie() {
        return this.infoUdSerie;
    }

    public void setInfoUdSerie(String infoUdSerie) {
        this.infoUdSerie = infoUdSerie;
    }

    @Column(name = "PG_UD_SERIE")
    public BigDecimal getPgUdSerie() {
        return this.pgUdSerie;
    }

    public void setPgUdSerie(BigDecimal pgUdSerie) {
        this.pgUdSerie = pgUdSerie;
    }

    @Column(name = "TI_STATO_CONSERVAZIONE")
    public String getTiStatoConservazione() {
        return this.tiStatoConservazione;
    }

    public void setTiStatoConservazione(String tiStatoConservazione) {
        this.tiStatoConservazione = tiStatoConservazione;
    }

}