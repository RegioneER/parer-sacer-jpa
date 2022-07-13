package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the DEC_V_RIC_CRITERIO_RAGGR database table.
 *
 */
@Entity
@Table(name = "DEC_V_RIC_CRITERIO_RAGGR")
@NamedQuery(name = "DecVRicCriterioRaggr.findAll", query = "SELECT d FROM DecVRicCriterioRaggr d")
public class DecVRicCriterioRaggr implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal aaKeyUnitaDoc;
    private BigDecimal aaKeyUnitaDocA;
    private BigDecimal aaKeyUnitaDocDa;
    private String cdRegistroRangeUnitaDoc;
    private String cdRegistroUnitaDoc;
    private String dsScadChius;
    private Date dtIstituz;
    private Date dtSoppres;
    private String flCriterioRaggrFisc;
    private String flCriterioRaggrStandard;
    private BigDecimal idAmbiente;
    private BigDecimal idCriterioRaggr;
    private BigDecimal idEnte;
    private BigDecimal idRegistroRangeUnitaDoc;
    private BigDecimal idRegistroUnitaDoc;
    private BigDecimal idStrut;
    private BigDecimal idTipoDoc;
    private BigDecimal idTipoUnitaDoc;
    private BigDecimal niMaxComp;
    private String nmAmbiente;
    private String nmCriterioRaggr;
    private String nmEnte;
    private String nmStrut;
    private String nmTipoDoc;
    private String nmTipoUnitaDoc;
    private String tiGestElencoCriterio;
    private String tiValidElenco;
    private String tiModValidElenco;

    public DecVRicCriterioRaggr() {
    }

    public DecVRicCriterioRaggr(BigDecimal idAmbiente, String nmAmbiente, BigDecimal idEnte, String nmEnte,
            BigDecimal idStrut, String nmStrut, BigDecimal idCriterioRaggr, String nmCriterioRaggr,
            String nmTipoUnitaDoc, String cdRegistroUnitaDoc, String cdRegistroRangeUnitaDoc, String nmTipoDoc,
            String flCriterioRaggrStandard, String flCriterioRaggrFisc, String tiValidElenco, String tiModValidElenco,
            String tiGestElencoCriterio, BigDecimal aaKeyUnitaDoc, BigDecimal aaKeyUnitaDocDa,
            BigDecimal aaKeyUnitaDocA, BigDecimal niMaxComp, String dsScadChius, Date dtIstituz, Date dtSoppres) {
        this.idAmbiente = idAmbiente;
        this.nmAmbiente = nmAmbiente;
        this.idEnte = idEnte;
        this.nmEnte = nmEnte;
        this.idStrut = idStrut;
        this.nmStrut = nmStrut;
        this.idCriterioRaggr = idCriterioRaggr;
        this.nmCriterioRaggr = nmCriterioRaggr;
        this.nmTipoUnitaDoc = nmTipoUnitaDoc;
        this.cdRegistroUnitaDoc = cdRegistroUnitaDoc;
        this.cdRegistroRangeUnitaDoc = cdRegistroRangeUnitaDoc;
        this.nmTipoDoc = nmTipoDoc;
        this.flCriterioRaggrStandard = flCriterioRaggrStandard;
        this.flCriterioRaggrFisc = flCriterioRaggrFisc;
        this.tiValidElenco = tiValidElenco;
        this.tiModValidElenco = tiModValidElenco;
        this.tiGestElencoCriterio = tiGestElencoCriterio;
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
        this.aaKeyUnitaDocDa = aaKeyUnitaDocDa;
        this.aaKeyUnitaDocA = aaKeyUnitaDocA;
        this.niMaxComp = niMaxComp;
        this.dsScadChius = dsScadChius;
        this.dtIstituz = dtIstituz;
        this.dtSoppres = dtSoppres;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Column(name = "AA_KEY_UNITA_DOC_A")
    public BigDecimal getAaKeyUnitaDocA() {
        return this.aaKeyUnitaDocA;
    }

    public void setAaKeyUnitaDocA(BigDecimal aaKeyUnitaDocA) {
        this.aaKeyUnitaDocA = aaKeyUnitaDocA;
    }

    @Column(name = "AA_KEY_UNITA_DOC_DA")
    public BigDecimal getAaKeyUnitaDocDa() {
        return this.aaKeyUnitaDocDa;
    }

    public void setAaKeyUnitaDocDa(BigDecimal aaKeyUnitaDocDa) {
        this.aaKeyUnitaDocDa = aaKeyUnitaDocDa;
    }

    @Column(name = "CD_REGISTRO_RANGE_UNITA_DOC")
    public String getCdRegistroRangeUnitaDoc() {
        return this.cdRegistroRangeUnitaDoc;
    }

    public void setCdRegistroRangeUnitaDoc(String cdRegistroRangeUnitaDoc) {
        this.cdRegistroRangeUnitaDoc = cdRegistroRangeUnitaDoc;
    }

    @Column(name = "CD_REGISTRO_UNITA_DOC")
    public String getCdRegistroUnitaDoc() {
        return this.cdRegistroUnitaDoc;
    }

    public void setCdRegistroUnitaDoc(String cdRegistroUnitaDoc) {
        this.cdRegistroUnitaDoc = cdRegistroUnitaDoc;
    }

    @Column(name = "DS_SCAD_CHIUS")
    public String getDsScadChius() {
        return this.dsScadChius;
    }

    public void setDsScadChius(String dsScadChius) {
        this.dsScadChius = dsScadChius;
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

    @Column(name = "FL_CRITERIO_RAGGR_FISC")
    public String getFlCriterioRaggrFisc() {
        return this.flCriterioRaggrFisc;
    }

    public void setFlCriterioRaggrFisc(String flCriterioRaggrFisc) {
        this.flCriterioRaggrFisc = flCriterioRaggrFisc;
    }

    @Column(name = "FL_CRITERIO_RAGGR_STANDARD")
    public String getFlCriterioRaggrStandard() {
        return flCriterioRaggrStandard;
    }

    public void setFlCriterioRaggrStandard(String flCriterioRaggrStandard) {
        this.flCriterioRaggrStandard = flCriterioRaggrStandard;
    }

    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Id
    @Column(name = "ID_CRITERIO_RAGGR")
    public BigDecimal getIdCriterioRaggr() {
        return this.idCriterioRaggr;
    }

    public void setIdCriterioRaggr(BigDecimal idCriterioRaggr) {
        this.idCriterioRaggr = idCriterioRaggr;
    }

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Id
    @Column(name = "ID_REGISTRO_RANGE_UNITA_DOC")
    public BigDecimal getIdRegistroRangeUnitaDoc() {
        return this.idRegistroRangeUnitaDoc;
    }

    public void setIdRegistroRangeUnitaDoc(BigDecimal idRegistroRangeUnitaDoc) {
        this.idRegistroRangeUnitaDoc = idRegistroRangeUnitaDoc;
    }

    @Id
    @Column(name = "ID_REGISTRO_UNITA_DOC")
    public BigDecimal getIdRegistroUnitaDoc() {
        return this.idRegistroUnitaDoc;
    }

    public void setIdRegistroUnitaDoc(BigDecimal idRegistroUnitaDoc) {
        this.idRegistroUnitaDoc = idRegistroUnitaDoc;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Id
    @Column(name = "ID_TIPO_DOC")
    public BigDecimal getIdTipoDoc() {
        return this.idTipoDoc;
    }

    public void setIdTipoDoc(BigDecimal idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
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
        return niMaxComp;
    }

    public void setNiMaxComp(BigDecimal niMaxComp) {
        this.niMaxComp = niMaxComp;
    }

    @Column(name = "NM_AMBIENTE")
    public String getNmAmbiente() {
        return this.nmAmbiente;
    }

    public void setNmAmbiente(String nmAmbiente) {
        this.nmAmbiente = nmAmbiente;
    }

    @Column(name = "NM_CRITERIO_RAGGR")
    public String getNmCriterioRaggr() {
        return this.nmCriterioRaggr;
    }

    public void setNmCriterioRaggr(String nmCriterioRaggr) {
        this.nmCriterioRaggr = nmCriterioRaggr;
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

    @Column(name = "NM_TIPO_DOC")
    public String getNmTipoDoc() {
        return this.nmTipoDoc;
    }

    public void setNmTipoDoc(String nmTipoDoc) {
        this.nmTipoDoc = nmTipoDoc;
    }

    @Column(name = "NM_TIPO_UNITA_DOC")
    public String getNmTipoUnitaDoc() {
        return this.nmTipoUnitaDoc;
    }

    public void setNmTipoUnitaDoc(String nmTipoUnitaDoc) {
        this.nmTipoUnitaDoc = nmTipoUnitaDoc;
    }

    @Column(name = "TI_GEST_ELENCO_CRITERIO")
    public String getTiGestElencoCriterio() {
        return this.tiGestElencoCriterio;
    }

    public void setTiGestElencoCriterio(String tiGestElencoCriterio) {
        this.tiGestElencoCriterio = tiGestElencoCriterio;
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
