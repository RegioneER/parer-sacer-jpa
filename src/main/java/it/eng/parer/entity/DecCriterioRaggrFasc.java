package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the DEC_CRITERIO_RAGGR_FASC database table.
 *
 */
@Entity
@Table(name = "DEC_CRITERIO_RAGGR_FASC")
@NamedQuery(name = "DecCriterioRaggrFasc.findAll", query = "SELECT d FROM DecCriterioRaggrFasc d")
public class DecCriterioRaggrFasc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idCriterioRaggrFasc;
    private BigDecimal aaFascicolo;
    private BigDecimal aaFascicoloA;
    private BigDecimal aaFascicoloDa;
    private String dsCriterioRaggr;
    private String dsOggettoFascicolo;
    private Date dtApeFascicoloA;
    private Date dtApeFascicoloDa;
    private Date dtChiuFascicoloA;
    private Date dtChiuFascicoloDa;
    private Date dtIstituz;
    private Date dtSoppres;
    private Date dtVersA;
    private Date dtVersDa;
    private String flCriterioRaggrStandard;
    private String flFiltroSistemaMigraz;
    private String flFiltroTipoFascicolo;
    private String flFiltroVoceTitol;
    private BigDecimal niMaxFasc;
    private BigDecimal niTempoScadChius;
    private String nmCriterioRaggr;
    private String ntCriterioRaggr;
    private String tiConservazione;
    private String tiScadChius;
    private String tiTempoScadChius;
    private OrgStrut orgStrut;
    private List<DecSelCriterioRaggrFasc> decSelCriterioRaggrFascicoli;
    private List<ElvElencoVersFasc> elvElencoVersFasc;

    public DecCriterioRaggrFasc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_CRITERIO_RAGGR_FASC_IDCRITERIORAGGRFASC_GENERATOR", sequenceName = "SDEC_CRITERIO_RAGGR_FASC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_CRITERIO_RAGGR_FASC_IDCRITERIORAGGRFASC_GENERATOR")
    @Column(name = "ID_CRITERIO_RAGGR_FASC")
    public long getIdCriterioRaggrFasc() {
        return this.idCriterioRaggrFasc;
    }

    public void setIdCriterioRaggrFasc(long idCriterioRaggrFasc) {
        this.idCriterioRaggrFasc = idCriterioRaggrFasc;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "AA_FASCICOLO_A")
    public BigDecimal getAaFascicoloA() {
        return this.aaFascicoloA;
    }

    public void setAaFascicoloA(BigDecimal aaFascicoloA) {
        this.aaFascicoloA = aaFascicoloA;
    }

    @Column(name = "AA_FASCICOLO_DA")
    public BigDecimal getAaFascicoloDa() {
        return this.aaFascicoloDa;
    }

    public void setAaFascicoloDa(BigDecimal aaFascicoloDa) {
        this.aaFascicoloDa = aaFascicoloDa;
    }

    @Column(name = "DS_CRITERIO_RAGGR")
    public String getDsCriterioRaggr() {
        return this.dsCriterioRaggr;
    }

    public void setDsCriterioRaggr(String dsCriterioRaggr) {
        this.dsCriterioRaggr = dsCriterioRaggr;
    }

    @Column(name = "DS_OGGETTO_FASCICOLO")
    public String getDsOggettoFascicolo() {
        return this.dsOggettoFascicolo;
    }

    public void setDsOggettoFascicolo(String dsOggettoFascicolo) {
        this.dsOggettoFascicolo = dsOggettoFascicolo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_APE_FASCICOLO_A")
    public Date getDtApeFascicoloA() {
        return this.dtApeFascicoloA;
    }

    public void setDtApeFascicoloA(Date dtApeFascicoloA) {
        this.dtApeFascicoloA = dtApeFascicoloA;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_APE_FASCICOLO_DA")
    public Date getDtApeFascicoloDa() {
        return this.dtApeFascicoloDa;
    }

    public void setDtApeFascicoloDa(Date dtApeFascicoloDa) {
        this.dtApeFascicoloDa = dtApeFascicoloDa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CHIU_FASCICOLO_A")
    public Date getDtChiuFascicoloA() {
        return this.dtChiuFascicoloA;
    }

    public void setDtChiuFascicoloA(Date dtChiuFascicoloA) {
        this.dtChiuFascicoloA = dtChiuFascicoloA;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CHIU_FASCICOLO_DA")
    public Date getDtChiuFascicoloDa() {
        return this.dtChiuFascicoloDa;
    }

    public void setDtChiuFascicoloDa(Date dtChiuFascicoloDa) {
        this.dtChiuFascicoloDa = dtChiuFascicoloDa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ISTITUZ")
    public Date getDtIstituz() {
        return this.dtIstituz;
    }

    public void setDtIstituz(Date dtIstituz) {
        this.dtIstituz = dtIstituz;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SOPPRES")
    public Date getDtSoppres() {
        return this.dtSoppres;
    }

    public void setDtSoppres(Date dtSoppres) {
        this.dtSoppres = dtSoppres;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS_A")
    public Date getDtVersA() {
        return this.dtVersA;
    }

    public void setDtVersA(Date dtVersA) {
        this.dtVersA = dtVersA;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS_DA")
    public Date getDtVersDa() {
        return this.dtVersDa;
    }

    public void setDtVersDa(Date dtVersDa) {
        this.dtVersDa = dtVersDa;
    }

    @Column(name = "FL_CRITERIO_RAGGR_STANDARD")
    public String getFlCriterioRaggrStandard() {
        return this.flCriterioRaggrStandard;
    }

    public void setFlCriterioRaggrStandard(String flCriterioRaggrStandard) {
        this.flCriterioRaggrStandard = flCriterioRaggrStandard;
    }

    @Column(name = "FL_FILTRO_SISTEMA_MIGRAZ")
    public String getFlFiltroSistemaMigraz() {
        return this.flFiltroSistemaMigraz;
    }

    public void setFlFiltroSistemaMigraz(String flFiltroSistemaMigraz) {
        this.flFiltroSistemaMigraz = flFiltroSistemaMigraz;
    }

    @Column(name = "FL_FILTRO_TIPO_FASCICOLO")
    public String getFlFiltroTipoFascicolo() {
        return this.flFiltroTipoFascicolo;
    }

    public void setFlFiltroTipoFascicolo(String flFiltroTipoFascicolo) {
        this.flFiltroTipoFascicolo = flFiltroTipoFascicolo;
    }

    @Column(name = "FL_FILTRO_VOCE_TITOL")
    public String getFlFiltroVoceTitol() {
        return this.flFiltroVoceTitol;
    }

    public void setFlFiltroVoceTitol(String flFiltroVoceTitol) {
        this.flFiltroVoceTitol = flFiltroVoceTitol;
    }

    @Column(name = "NI_MAX_FASC")
    public BigDecimal getNiMaxFasc() {
        return this.niMaxFasc;
    }

    public void setNiMaxFasc(BigDecimal niMaxFasc) {
        this.niMaxFasc = niMaxFasc;
    }

    @Column(name = "NI_TEMPO_SCAD_CHIUS")
    public BigDecimal getNiTempoScadChius() {
        return this.niTempoScadChius;
    }

    public void setNiTempoScadChius(BigDecimal niTempoScadChius) {
        this.niTempoScadChius = niTempoScadChius;
    }

    @Column(name = "NM_CRITERIO_RAGGR")
    public String getNmCriterioRaggr() {
        return this.nmCriterioRaggr;
    }

    public void setNmCriterioRaggr(String nmCriterioRaggr) {
        this.nmCriterioRaggr = nmCriterioRaggr;
    }

    @Column(name = "NT_CRITERIO_RAGGR")
    public String getNtCriterioRaggr() {
        return this.ntCriterioRaggr;
    }

    public void setNtCriterioRaggr(String ntCriterioRaggr) {
        this.ntCriterioRaggr = ntCriterioRaggr;
    }

    @Column(name = "TI_CONSERVAZIONE")
    public String getTiConservazione() {
        return this.tiConservazione;
    }

    public void setTiConservazione(String tiConservazione) {
        this.tiConservazione = tiConservazione;
    }

    @Column(name = "TI_SCAD_CHIUS")
    public String getTiScadChius() {
        return this.tiScadChius;
    }

    public void setTiScadChius(String tiScadChius) {
        this.tiScadChius = tiScadChius;
    }

    @Column(name = "TI_TEMPO_SCAD_CHIUS")
    public String getTiTempoScadChius() {
        return this.tiTempoScadChius;
    }

    public void setTiTempoScadChius(String tiTempoScadChius) {
        this.tiTempoScadChius = tiTempoScadChius;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlTransient
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional one-to-many association to DecSelCriterioRaggrFasc
    @OneToMany(mappedBy = "decCriterioRaggrFasc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlTransient
    public List<DecSelCriterioRaggrFasc> getDecSelCriterioRaggrFascicoli() {
        return this.decSelCriterioRaggrFascicoli;
    }

    public void setDecSelCriterioRaggrFascicoli(List<DecSelCriterioRaggrFasc> decSelCriterioRaggrFascicoli) {
        this.decSelCriterioRaggrFascicoli = decSelCriterioRaggrFascicoli;
    }

    // bi-directional many-to-one association to ElvElencoVersFasc
    @OneToMany(mappedBy = "decCriterioRaggrFasc")
    @XmlTransient
    public List<ElvElencoVersFasc> getElvElencoVersFasc() {
        return this.elvElencoVersFasc;
    }

    public void setElvElencoVersFasc(List<ElvElencoVersFasc> elvElencoVersFasc) {
        this.elvElencoVersFasc = elvElencoVersFasc;
    }
}