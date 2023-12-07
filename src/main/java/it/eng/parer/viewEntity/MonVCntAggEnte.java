package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_AGG_ENTE database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_AGG_ENTE")
@NamedQuery(name = "MonVCntAggEnte.findAll", query = "SELECT m FROM MonVCntAggEnte m")
public class MonVCntAggEnte implements Serializable {
    private static final long serialVersionUID = 1L;

    private BigDecimal niAgg;
    private MonVCntAggEnteId monVCntAggEnteId;

    @EmbeddedId
    public MonVCntAggEnteId getMonVCntAggEnteId() {
        return monVCntAggEnteId;
    }

    public void setMonVCntAggEnteId(MonVCntAggEnteId monVCntAggEnteId) {
        this.monVCntAggEnteId = monVCntAggEnteId;
    }

    public MonVCntAggEnte() {/* Hibernate */
    }

    @Column(name = "NI_AGG")
    public BigDecimal getNiAgg() {
        return this.niAgg;
    }

    public void setNiAgg(BigDecimal niAgg) {
        this.niAgg = niAgg;
    }
}
