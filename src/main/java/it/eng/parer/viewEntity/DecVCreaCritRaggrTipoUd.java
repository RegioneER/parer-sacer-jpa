package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_V_CREA_CRIT_RAGGR_TIPO_UD database table.
 *
 */
@Entity
@Table(name = "DEC_V_CREA_CRIT_RAGGR_TIPO_UD")
@NamedQuery(name = "DecVCreaCritRaggrTipoUd.findAll", query = "SELECT d FROM DecVCreaCritRaggrTipoUd d")
public class DecVCreaCritRaggrTipoUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsCriterioRaggr;
    private String flCriterioRaggrFisc;
    private String flFiltroRangeRegistroKey;
    private String flFiltroRegistroKey;
    private String flFiltroSistemaMigraz;
    private String flFiltroTiEsitoVerifFirme;
    private String flFiltroTipoDoc;
    private String flFiltroTipoUnitaDoc;
    private BigDecimal idStrut;
    private BigDecimal idTipoUnitaDoc;
    private BigDecimal niMaxComp;
    private BigDecimal niTempoScadChius;
    private BigDecimal niTempoScadChiusFirme;
    private String nmCriterioRaggr;
    private String tiTempoScadChius;
    private String tiTempoScadChiusFirme;
    private String tiValidElenco;
    private String tiModValidElenco;

    public DecVCreaCritRaggrTipoUd() {
    }

    @Column(name = "DS_CRITERIO_RAGGR")
    public String getDsCriterioRaggr() {
        return this.dsCriterioRaggr;
    }

    public void setDsCriterioRaggr(String dsCriterioRaggr) {
        this.dsCriterioRaggr = dsCriterioRaggr;
    }

    @Column(name = "FL_CRITERIO_RAGGR_FISC")
    public String getFlCriterioRaggrFisc() {
        return this.flCriterioRaggrFisc;
    }

    public void setFlCriterioRaggrFisc(String flCriterioRaggrFisc) {
        this.flCriterioRaggrFisc = flCriterioRaggrFisc;
    }

    @Column(name = "FL_FILTRO_RANGE_REGISTRO_KEY")
    public String getFlFiltroRangeRegistroKey() {
        return this.flFiltroRangeRegistroKey;
    }

    public void setFlFiltroRangeRegistroKey(String flFiltroRangeRegistroKey) {
        this.flFiltroRangeRegistroKey = flFiltroRangeRegistroKey;
    }

    @Column(name = "FL_FILTRO_REGISTRO_KEY")
    public String getFlFiltroRegistroKey() {
        return this.flFiltroRegistroKey;
    }

    public void setFlFiltroRegistroKey(String flFiltroRegistroKey) {
        this.flFiltroRegistroKey = flFiltroRegistroKey;
    }

    @Column(name = "FL_FILTRO_SISTEMA_MIGRAZ")
    public String getFlFiltroSistemaMigraz() {
        return this.flFiltroSistemaMigraz;
    }

    public void setFlFiltroSistemaMigraz(String flFiltroSistemaMigraz) {
        this.flFiltroSistemaMigraz = flFiltroSistemaMigraz;
    }

    @Column(name = "FL_FILTRO_TI_ESITO_VERIF_FIRME")
    public String getFlFiltroTiEsitoVerifFirme() {
        return this.flFiltroTiEsitoVerifFirme;
    }

    public void setFlFiltroTiEsitoVerifFirme(String flFiltroTiEsitoVerifFirme) {
        this.flFiltroTiEsitoVerifFirme = flFiltroTiEsitoVerifFirme;
    }

    @Column(name = "FL_FILTRO_TIPO_DOC")
    public String getFlFiltroTipoDoc() {
        return this.flFiltroTipoDoc;
    }

    public void setFlFiltroTipoDoc(String flFiltroTipoDoc) {
        this.flFiltroTipoDoc = flFiltroTipoDoc;
    }

    @Column(name = "FL_FILTRO_TIPO_UNITA_DOC")
    public String getFlFiltroTipoUnitaDoc() {
        return this.flFiltroTipoUnitaDoc;
    }

    public void setFlFiltroTipoUnitaDoc(String flFiltroTipoUnitaDoc) {
        this.flFiltroTipoUnitaDoc = flFiltroTipoUnitaDoc;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Id
    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return this.idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }

    @Column(name = "NI_MAX_COMP")
    public BigDecimal getNiMaxComp() {
        return this.niMaxComp;
    }

    public void setNiMaxComp(BigDecimal niMaxComp) {
        this.niMaxComp = niMaxComp;
    }

    @Column(name = "NI_TEMPO_SCAD_CHIUS")
    public BigDecimal getNiTempoScadChius() {
        return this.niTempoScadChius;
    }

    public void setNiTempoScadChius(BigDecimal niTempoScadChius) {
        this.niTempoScadChius = niTempoScadChius;
    }

    @Column(name = "NI_TEMPO_SCAD_CHIUS_FIRME")
    public BigDecimal getNiTempoScadChiusFirme() {
        return this.niTempoScadChiusFirme;
    }

    public void setNiTempoScadChiusFirme(BigDecimal niTempoScadChiusFirme) {
        this.niTempoScadChiusFirme = niTempoScadChiusFirme;
    }

    @Column(name = "NM_CRITERIO_RAGGR")
    public String getNmCriterioRaggr() {
        return this.nmCriterioRaggr;
    }

    public void setNmCriterioRaggr(String nmCriterioRaggr) {
        this.nmCriterioRaggr = nmCriterioRaggr;
    }

    @Column(name = "TI_TEMPO_SCAD_CHIUS")
    public String getTiTempoScadChius() {
        return this.tiTempoScadChius;
    }

    public void setTiTempoScadChius(String tiTempoScadChius) {
        this.tiTempoScadChius = tiTempoScadChius;
    }

    @Column(name = "TI_TEMPO_SCAD_CHIUS_FIRME")
    public String getTiTempoScadChiusFirme() {
        return this.tiTempoScadChiusFirme;
    }

    public void setTiTempoScadChiusFirme(String tiTempoScadChiusFirme) {
        this.tiTempoScadChiusFirme = tiTempoScadChiusFirme;
    }

    @Column(name = "TI_VALID_ELENCO")
    public String getTiValidElenco() {
        return this.tiValidElenco;
    }

    public void setTiValidElenco(String tiValidElenco) {
        this.tiValidElenco = tiValidElenco;
    }

    @Column(name = "TI_MOD_VALID_ELENCO")
    public String getTiModValidElenco() {
        return this.tiModValidElenco;
    }

    public void setTiModValidElenco(String tiModValidElenco) {
        this.tiModValidElenco = tiModValidElenco;
    }

}
