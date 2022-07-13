package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the MON_V_LIS_FASC_DA_ELAB database table.
 *
 */
@Entity
@Table(name = "MON_V_LIS_FASC_DA_ELAB")
@NamedQuery(name = "MonVLisFascDaElab.findAll", query = "SELECT m FROM MonVLisFascDaElab m")
public class MonVLisFascDaElab implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal aaFascicolo;
    private String cdKeyFascicolo;
    private String cdKeyOrd;
    private String flSesFascicoloKo;
    private BigDecimal idAmbiente;
    private BigDecimal idEnte;
    private BigDecimal idFascicolo;
    private BigDecimal idStrut;
    private BigDecimal idTipoFascicolo;
    private BigDecimal idUserIam;
    private String nmAmbiente;
    private String nmEnte;
    private String nmStrut;
    private String nmTipoFascicolo;
    private String tiStatoConservazione;
    private String tiStatoFascElencoVers;
    private Timestamp tsVersFascicolo;

    public MonVLisFascDaElab() {
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "CD_KEY_FASCICOLO")
    public String getCdKeyFascicolo() {
        return this.cdKeyFascicolo;
    }

    public void setCdKeyFascicolo(String cdKeyFascicolo) {
        this.cdKeyFascicolo = cdKeyFascicolo;
    }

    @Column(name = "CD_KEY_ORD")
    public String getCdKeyOrd() {
        return this.cdKeyOrd;
    }

    public void setCdKeyOrd(String cdKeyOrd) {
        this.cdKeyOrd = cdKeyOrd;
    }

    @Column(name = "FL_SES_FASCICOLO_KO")
    public String getFlSesFascicoloKo() {
        return this.flSesFascicoloKo;
    }

    public void setFlSesFascicoloKo(String flSesFascicoloKo) {
        this.flSesFascicoloKo = flSesFascicoloKo;
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
    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return this.idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_TIPO_FASCICOLO")
    public BigDecimal getIdTipoFascicolo() {
        return this.idTipoFascicolo;
    }

    public void setIdTipoFascicolo(BigDecimal idTipoFascicolo) {
        this.idTipoFascicolo = idTipoFascicolo;
    }

    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
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

    @Column(name = "NM_TIPO_FASCICOLO")
    public String getNmTipoFascicolo() {
        return this.nmTipoFascicolo;
    }

    public void setNmTipoFascicolo(String nmTipoFascicolo) {
        this.nmTipoFascicolo = nmTipoFascicolo;
    }

    @Column(name = "TI_STATO_CONSERVAZIONE")
    public String getTiStatoConservazione() {
        return this.tiStatoConservazione;
    }

    public void setTiStatoConservazione(String tiStatoConservazione) {
        this.tiStatoConservazione = tiStatoConservazione;
    }

    @Column(name = "TI_STATO_FASC_ELENCO_VERS")
    public String getTiStatoFascElencoVers() {
        return this.tiStatoFascElencoVers;
    }

    public void setTiStatoFascElencoVers(String tiStatoFascElencoVers) {
        this.tiStatoFascElencoVers = tiStatoFascElencoVers;
    }

    @Column(name = "TS_VERS_FASCICOLO")
    public Timestamp getTsVersFascicolo() {
        return this.tsVersFascicolo;
    }

    public void setTsVersFascicolo(Timestamp tsVersFascicolo) {
        this.tsVersFascicolo = tsVersFascicolo;
    }

}
