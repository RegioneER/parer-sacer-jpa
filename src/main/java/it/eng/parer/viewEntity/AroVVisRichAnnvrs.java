package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_VIS_RICH_ANNVRS database table.
 *
 */
@Entity
@Table(name = "ARO_V_VIS_RICH_ANNVRS")
@NamedQuery(name = "AroVVisRichAnnvrs.findAll", query = "SELECT a FROM AroVVisRichAnnvrs a")
public class AroVVisRichAnnvrs implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdRichAnnulVers;
    private String dsNotaRichAnnulVers;
    private String dsRichAnnulVers;
    private Date dtCreazioneRichAnnulVers;
    private Date dtRegStatoRichAnnulVers;
    private String flForzaAnnul;
    private String flImmediata;
    private String flRichPing;
    private BigDecimal idAmbiente;
    private BigDecimal idEnte;
    private BigDecimal idRichAnnulVers;
    private BigDecimal idStrut;
    private BigDecimal niItem;
    private BigDecimal niItemNonAnnul;
    private BigDecimal niItemPing;
    private String nmAmbiente;
    private String nmEnte;
    private String nmStrut;
    private String nmUseridStato;
    private String ntRichAnnulVers;
    private String tiCreazioneRichAnnulVers;
    private String tiStatoRichAnnulVers;
    private String tiRichAnnulVers;

    public AroVVisRichAnnvrs() {
    }

    @Column(name = "CD_RICH_ANNUL_VERS")
    public String getCdRichAnnulVers() {
        return this.cdRichAnnulVers;
    }

    public void setCdRichAnnulVers(String cdRichAnnulVers) {
        this.cdRichAnnulVers = cdRichAnnulVers;
    }

    @Column(name = "DS_NOTA_RICH_ANNUL_VERS")
    public String getDsNotaRichAnnulVers() {
        return this.dsNotaRichAnnulVers;
    }

    public void setDsNotaRichAnnulVers(String dsNotaRichAnnulVers) {
        this.dsNotaRichAnnulVers = dsNotaRichAnnulVers;
    }

    @Column(name = "DS_RICH_ANNUL_VERS")
    public String getDsRichAnnulVers() {
        return this.dsRichAnnulVers;
    }

    public void setDsRichAnnulVers(String dsRichAnnulVers) {
        this.dsRichAnnulVers = dsRichAnnulVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE_RICH_ANNUL_VERS")
    public Date getDtCreazioneRichAnnulVers() {
        return this.dtCreazioneRichAnnulVers;
    }

    public void setDtCreazioneRichAnnulVers(Date dtCreazioneRichAnnulVers) {
        this.dtCreazioneRichAnnulVers = dtCreazioneRichAnnulVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_STATO_RICH_ANNUL_VERS")
    public Date getDtRegStatoRichAnnulVers() {
        return this.dtRegStatoRichAnnulVers;
    }

    public void setDtRegStatoRichAnnulVers(Date dtRegStatoRichAnnulVers) {
        this.dtRegStatoRichAnnulVers = dtRegStatoRichAnnulVers;
    }

    @Column(name = "FL_FORZA_ANNUL")
    public String getFlForzaAnnul() {
        return this.flForzaAnnul;
    }

    public void setFlForzaAnnul(String flForzaAnnul) {
        this.flForzaAnnul = flForzaAnnul;
    }

    @Column(name = "FL_IMMEDIATA")
    public String getFlImmediata() {
        return this.flImmediata;
    }

    public void setFlImmediata(String flImmediata) {
        this.flImmediata = flImmediata;
    }

    @Column(name = "FL_RICH_PING")
    public String getFlRichPing() {
        return this.flRichPing;
    }

    public void setFlRichPing(String flRichPing) {
        this.flRichPing = flRichPing;
    }

    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Id
    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return this.idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_ITEM")
    public BigDecimal getNiItem() {
        return this.niItem;
    }

    public void setNiItem(BigDecimal niItem) {
        this.niItem = niItem;
    }

    @Column(name = "NI_ITEM_NON_ANNUL")
    public BigDecimal getNiItemNonAnnul() {
        return this.niItemNonAnnul;
    }

    public void setNiItemNonAnnul(BigDecimal niItemNonAnnul) {
        this.niItemNonAnnul = niItemNonAnnul;
    }

    @Column(name = "NI_ITEM_PING")
    public BigDecimal getNiItemPing() {
        return this.niItemPing;
    }

    public void setNiItemPing(BigDecimal niItemPing) {
        this.niItemPing = niItemPing;
    }

    @Column(name = "NM_AMBIENTE")
    public String getNmAmbiente() {
        return this.nmAmbiente;
    }

    public void setNmAmbiente(String nmAmbiente) {
        this.nmAmbiente = nmAmbiente;
    }

    @Column(name = "NM_ENTE")
    public String getNmEnte() {
        return this.nmEnte;
    }

    public void setNmEnte(String nmEnte) {
        this.nmEnte = nmEnte;
    }

    @Column(name = "NM_STRUT")
    public String getNmStrut() {
        return this.nmStrut;
    }

    public void setNmStrut(String nmStrut) {
        this.nmStrut = nmStrut;
    }

    @Column(name = "NM_USERID_STATO")
    public String getNmUseridStato() {
        return this.nmUseridStato;
    }

    public void setNmUseridStato(String nmUseridStato) {
        this.nmUseridStato = nmUseridStato;
    }

    @Column(name = "NT_RICH_ANNUL_VERS")
    public String getNtRichAnnulVers() {
        return this.ntRichAnnulVers;
    }

    public void setNtRichAnnulVers(String ntRichAnnulVers) {
        this.ntRichAnnulVers = ntRichAnnulVers;
    }

    @Column(name = "TI_CREAZIONE_RICH_ANNUL_VERS")
    public String getTiCreazioneRichAnnulVers() {
        return this.tiCreazioneRichAnnulVers;
    }

    public void setTiCreazioneRichAnnulVers(String tiCreazioneRichAnnulVers) {
        this.tiCreazioneRichAnnulVers = tiCreazioneRichAnnulVers;
    }

    @Column(name = "TI_STATO_RICH_ANNUL_VERS")
    public String getTiStatoRichAnnulVers() {
        return this.tiStatoRichAnnulVers;
    }

    public void setTiStatoRichAnnulVers(String tiStatoRichAnnulVers) {
        this.tiStatoRichAnnulVers = tiStatoRichAnnulVers;
    }

    @Column(name = "TI_RICH_ANNUL_VERS")
    public String getTiRichAnnulVers() {
        return this.tiRichAnnulVers;
    }

    public void setTiRichAnnulVers(String tiRichAnnulVers) {
        this.tiRichAnnulVers = tiRichAnnulVers;
    }

}
