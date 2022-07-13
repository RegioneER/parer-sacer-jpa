package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

/**
 * The persistent class for the ELV_V_CREA_LIS_FASC_ELENCO database table.
 * 
 */
@Entity
@Table(name = "ELV_V_CREA_LIS_FASC_ELENCO")
@NamedQuery(name = "ElvVCreaLisFascElenco.findAll", query = "SELECT e FROM ElvVCreaLisFascElenco e")
public class ElvVCreaLisFascElenco implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal aaFascicolo;
    private String cdEncodingHashFascicolo;
    private String cdKeyFascicolo;
    private String dsAlgoHashFascicolo;
    private String dsHashFascicolo;
    private String dsOggettoFascicolo;
    private String dsUrnFascicolo;
    private String dsUrnSipFascicolo;
    private String dsUrnRappVers;
    private Date dtApeFascicolo;
    private Date dtChiuFascicolo;
    private BigDecimal idElencoVersFasc;
    private BigDecimal idFascicolo;
    private BigDecimal niUnitaDoc;
    private String nmTipoFascicolo;
    private Timestamp tsIniSes;

    public ElvVCreaLisFascElenco() {
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "CD_ENCODING_HASH_FASCICOLO")
    public String getCdEncodingHashFascicolo() {
        return this.cdEncodingHashFascicolo;
    }

    public void setCdEncodingHashFascicolo(String cdEncodingHashFascicolo) {
        this.cdEncodingHashFascicolo = cdEncodingHashFascicolo;
    }

    @Column(name = "CD_KEY_FASCICOLO")
    public String getCdKeyFascicolo() {
        return this.cdKeyFascicolo;
    }

    public void setCdKeyFascicolo(String cdKeyFascicolo) {
        this.cdKeyFascicolo = cdKeyFascicolo;
    }

    @Column(name = "DS_ALGO_HASH_FASCICOLO")
    public String getDsAlgoHashFascicolo() {
        return this.dsAlgoHashFascicolo;
    }

    public void setDsAlgoHashFascicolo(String dsAlgoHashFascicolo) {
        this.dsAlgoHashFascicolo = dsAlgoHashFascicolo;
    }

    @Column(name = "DS_HASH_FASCICOLO")
    public String getDsHashFascicolo() {
        return this.dsHashFascicolo;
    }

    public void setDsHashFascicolo(String dsHashFascicolo) {
        this.dsHashFascicolo = dsHashFascicolo;
    }

    @Column(name = "DS_OGGETTO_FASCICOLO")
    public String getDsOggettoFascicolo() {
        return this.dsOggettoFascicolo;
    }

    public void setDsOggettoFascicolo(String dsOggettoFascicolo) {
        this.dsOggettoFascicolo = dsOggettoFascicolo;
    }

    @Column(name = "DS_URN_FASCICOLO")
    public String getDsUrnFascicolo() {
        return this.dsUrnFascicolo;
    }

    public void setDsUrnFascicolo(String dsUrnFascicolo) {
        this.dsUrnFascicolo = dsUrnFascicolo;
    }

    @Column(name = "DS_URN_SIP_FASCICOLO")
    public String getDsUrnSipFascicolo() {
        return this.dsUrnSipFascicolo;
    }

    public void setDsUrnSipFascicolo(String dsUrnSipFascicolo) {
        this.dsUrnSipFascicolo = dsUrnSipFascicolo;
    }

    @Column(name = "DS_URN_RAPP_VERS")
    public String getDsUrnRappVers() {
        return this.dsUrnRappVers;
    }

    public void setDsUrnRappVers(String dsUrnRappVers) {
        this.dsUrnRappVers = dsUrnRappVers;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_APE_FASCICOLO")
    public Date getDtApeFascicolo() {
        return this.dtApeFascicolo;
    }

    public void setDtApeFascicolo(Date dtApeFascicolo) {
        this.dtApeFascicolo = dtApeFascicolo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_CHIU_FASCICOLO")
    public Date getDtChiuFascicolo() {
        return this.dtChiuFascicolo;
    }

    public void setDtChiuFascicolo(Date dtChiuFascicolo) {
        this.dtChiuFascicolo = dtChiuFascicolo;
    }

    @Id
    @Column(name = "ID_ELENCO_VERS_FASC")
    public BigDecimal getIdElencoVersFasc() {
        return this.idElencoVersFasc;
    }

    public void setIdElencoVersFasc(BigDecimal idElencoVersFasc) {
        this.idElencoVersFasc = idElencoVersFasc;
    }

    @Id
    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return this.idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
    }

    @Column(name = "NI_UNITA_DOC")
    public BigDecimal getNiUnitaDoc() {
        return this.niUnitaDoc;
    }

    public void setNiUnitaDoc(BigDecimal niUnitaDoc) {
        this.niUnitaDoc = niUnitaDoc;
    }

    @Column(name = "NM_TIPO_FASCICOLO")
    public String getNmTipoFascicolo() {
        return this.nmTipoFascicolo;
    }

    public void setNmTipoFascicolo(String nmTipoFascicolo) {
        this.nmTipoFascicolo = nmTipoFascicolo;
    }

    @Column(name = "TS_INI_SES")
    public Timestamp getTsIniSes() {
        return this.tsIniSes;
    }

    public void setTsIniSes(Timestamp tsIniSes) {
        this.tsIniSes = tsIniSes;
    }

}