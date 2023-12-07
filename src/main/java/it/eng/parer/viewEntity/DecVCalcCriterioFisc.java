package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_V_CALC_CRITERIO_FISC database table.
 *
 */
@Entity
@Table(name = "DEC_V_CALC_CRITERIO_FISC")
@NamedQuery(name = "DecVCalcCriterioFisc.findAll", query = "SELECT d FROM DecVCalcCriterioFisc d")
public class DecVCalcCriterioFisc implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsMessaggio;
    private BigDecimal idCriterioRaggr;
    private String nmCriterioRaggr;

    public DecVCalcCriterioFisc() {/* Hibernate */
    }

    @Column(name = "DS_MESSAGGIO")
    public String getDsMessaggio() {
        return this.dsMessaggio;
    }

    public void setDsMessaggio(String dsMessaggio) {
        this.dsMessaggio = dsMessaggio;
    }

    @Id
    @Column(name = "ID_CRITERIO_RAGGR")
    public BigDecimal getIdCriterioRaggr() {
        return this.idCriterioRaggr;
    }

    public void setIdCriterioRaggr(BigDecimal idCriterioRaggr) {
        this.idCriterioRaggr = idCriterioRaggr;
    }

    @Column(name = "NM_CRITERIO_RAGGR")
    public String getNmCriterioRaggr() {
        return this.nmCriterioRaggr;
    }

    public void setNmCriterioRaggr(String nmCriterioRaggr) {
        this.nmCriterioRaggr = nmCriterioRaggr;
    }

}
