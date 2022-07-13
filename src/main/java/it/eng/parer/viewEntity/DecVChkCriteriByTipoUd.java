package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_V_CHK_CRITERI_BY_TIPO_UD database table.
 *
 */
@Entity
@Table(name = "DEC_V_CHK_CRITERI_BY_TIPO_UD")
@NamedQuery(name = "DecVChkCriteriByTipoUd.findAll", query = "SELECT d FROM DecVChkCriteriByTipoUd d")
public class DecVChkCriteriByTipoUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsCriterioNonCoerente;
    private String flCriterioCoerente;
    private String flCriterioRaggrFisc;
    private String flCriterioRaggrStandard;
    private BigDecimal idCriterioRaggr;
    private BigDecimal idTipoUnitaDoc;
    private String nmCriterioRaggr;
    private String nmTipoUnitaDoc;

    public DecVChkCriteriByTipoUd() {
    }

    @Column(name = "DS_CRITERIO_NON_COERENTE")
    public String getDsCriterioNonCoerente() {
        return this.dsCriterioNonCoerente;
    }

    public void setDsCriterioNonCoerente(String dsCriterioNonCoerente) {
        this.dsCriterioNonCoerente = dsCriterioNonCoerente;
    }

    @Column(name = "FL_CRITERIO_COERENTE")
    public String getFlCriterioCoerente() {
        return this.flCriterioCoerente;
    }

    public void setFlCriterioCoerente(String flCriterioCoerente) {
        this.flCriterioCoerente = flCriterioCoerente;
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
        return this.flCriterioRaggrStandard;
    }

    public void setFlCriterioRaggrStandard(String flCriterioRaggrStandard) {
        this.flCriterioRaggrStandard = flCriterioRaggrStandard;
    }

    @Id
    @Column(name = "ID_CRITERIO_RAGGR")
    public BigDecimal getIdCriterioRaggr() {
        return this.idCriterioRaggr;
    }

    public void setIdCriterioRaggr(BigDecimal idCriterioRaggr) {
        this.idCriterioRaggr = idCriterioRaggr;
    }

    @Id
    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return this.idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }

    @Column(name = "NM_CRITERIO_RAGGR")
    public String getNmCriterioRaggr() {
        return this.nmCriterioRaggr;
    }

    public void setNmCriterioRaggr(String nmCriterioRaggr) {
        this.nmCriterioRaggr = nmCriterioRaggr;
    }

    @Column(name = "NM_TIPO_UNITA_DOC")
    public String getNmTipoUnitaDoc() {
        return this.nmTipoUnitaDoc;
    }

    public void setNmTipoUnitaDoc(String nmTipoUnitaDoc) {
        this.nmTipoUnitaDoc = nmTipoUnitaDoc;
    }

}
