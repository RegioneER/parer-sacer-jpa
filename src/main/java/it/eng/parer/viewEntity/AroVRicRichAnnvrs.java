package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_RIC_RICH_ANNVRS database table.
 *
 */
@Entity
@Table(name = "ARO_V_RIC_RICH_ANNVRS")
@NamedQuery(name = "AroVRicRichAnnvrs.findAll", query = "SELECT a FROM AroVRicRichAnnvrs a")
public class AroVRicRichAnnvrs implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal aaFascicolo;
    private BigDecimal aaKeyUnitaDoc;
    private String cdKeyFascicolo;
    private String cdKeyUnitaDoc;
    private String cdRegistroKeyUnitaDoc;
    private String cdRichAnnulVers;
    private String dsRichAnnulVers;
    private Date dtCreazioneRichAnnulVers;
    private String flAnnulPing;
    private String flImmediata;
    private String flNonAnnul;
    private BigDecimal idAmbiente;
    private BigDecimal idEnte;
    private BigDecimal idItemRichAnnulVers;
    private BigDecimal idRichAnnulVers;
    private BigDecimal idStrut;
    private BigDecimal idUserIam;
    private BigDecimal niItem;
    private BigDecimal niItemNonAnnul;
    private BigDecimal niItemPing;
    private String nmAmbiente;
    private String nmEnte;
    private String nmStrut;
    private String ntRichAnnulVers;
    private String tiCreazioneRichAnnulVers;
    private String tiRichAnnulVers;
    private String tiStatoRichAnnulVersCor;

    public AroVRicRichAnnvrs() {
    }

    public AroVRicRichAnnvrs(String cdRichAnnulVers, String dsRichAnnulVers, Date dtCreazioneRichAnnulVers,
            String flAnnulPing, String flImmediata, String flNonAnnul, BigDecimal idAmbiente, BigDecimal idEnte,
            BigDecimal idRichAnnulVers, BigDecimal idStrut, BigDecimal idUserIam, BigDecimal niItem,
            BigDecimal niItemNonAnnul, BigDecimal niItemPing, String nmAmbiente, String nmEnte, String nmStrut,
            String ntRichAnnulVers, String tiCreazioneRichAnnulVers, String tiStatoRichAnnulVersCor) {
        this.cdRichAnnulVers = cdRichAnnulVers;
        this.dsRichAnnulVers = dsRichAnnulVers;
        this.dtCreazioneRichAnnulVers = dtCreazioneRichAnnulVers;
        this.flAnnulPing = flAnnulPing;
        this.flImmediata = flImmediata;
        this.flNonAnnul = flNonAnnul;
        this.idAmbiente = idAmbiente;
        this.idEnte = idEnte;
        this.idRichAnnulVers = idRichAnnulVers;
        this.idStrut = idStrut;
        this.idUserIam = idUserIam;
        this.niItem = niItem;
        this.niItemNonAnnul = niItemNonAnnul;
        this.niItemPing = niItemPing;
        this.nmAmbiente = nmAmbiente;
        this.nmEnte = nmEnte;
        this.nmStrut = nmStrut;
        this.ntRichAnnulVers = ntRichAnnulVers;
        this.tiCreazioneRichAnnulVers = tiCreazioneRichAnnulVers;
        this.tiStatoRichAnnulVersCor = tiStatoRichAnnulVersCor;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Column(name = "CD_KEY_FASCICOLO")
    public String getCdKeyFascicolo() {
        return this.cdKeyFascicolo;
    }

    public void setCdKeyFascicolo(String cdKeyFascicolo) {
        this.cdKeyFascicolo = cdKeyFascicolo;
    }

    @Column(name = "CD_KEY_UNITA_DOC")
    public String getCdKeyUnitaDoc() {
        return this.cdKeyUnitaDoc;
    }

    public void setCdKeyUnitaDoc(String cdKeyUnitaDoc) {
        this.cdKeyUnitaDoc = cdKeyUnitaDoc;
    }

    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC")
    public String getCdRegistroKeyUnitaDoc() {
        return this.cdRegistroKeyUnitaDoc;
    }

    public void setCdRegistroKeyUnitaDoc(String cdRegistroKeyUnitaDoc) {
        this.cdRegistroKeyUnitaDoc = cdRegistroKeyUnitaDoc;
    }

    @Column(name = "CD_RICH_ANNUL_VERS")
    public String getCdRichAnnulVers() {
        return this.cdRichAnnulVers;
    }

    public void setCdRichAnnulVers(String cdRichAnnulVers) {
        this.cdRichAnnulVers = cdRichAnnulVers;
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

    @Column(name = "FL_ANNUL_PING")
    public String getFlAnnulPing() {
        return this.flAnnulPing;
    }

    public void setFlAnnulPing(String flAnnulPing) {
        this.flAnnulPing = flAnnulPing;
    }

    @Column(name = "FL_IMMEDIATA")
    public String getFlImmediata() {
        return this.flImmediata;
    }

    public void setFlImmediata(String flImmediata) {
        this.flImmediata = flImmediata;
    }

    @Column(name = "FL_NON_ANNUL")
    public String getFlNonAnnul() {
        return this.flNonAnnul;
    }

    public void setFlNonAnnul(String flNonAnnul) {
        this.flNonAnnul = flNonAnnul;
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

    @Column(name = "ID_ITEM_RICH_ANNUL_VERS")
    public BigDecimal getIdItemRichAnnulVers() {
        return this.idItemRichAnnulVers;
    }

    public void setIdItemRichAnnulVers(BigDecimal idItemRichAnnulVers) {
        this.idItemRichAnnulVers = idItemRichAnnulVers;
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

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
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

    @Column(name = "TI_RICH_ANNUL_VERS")
    public String getTiRichAnnulVers() {
        return this.tiRichAnnulVers;
    }

    public void setTiRichAnnulVers(String tiRichAnnulVers) {
        this.tiRichAnnulVers = tiRichAnnulVers;
    }

    @Column(name = "TI_STATO_RICH_ANNUL_VERS_COR")
    public String getTiStatoRichAnnulVersCor() {
        return this.tiStatoRichAnnulVersCor;
    }

    public void setTiStatoRichAnnulVersCor(String tiStatoRichAnnulVersCor) {
        this.tiStatoRichAnnulVersCor = tiStatoRichAnnulVersCor;
    }

}
