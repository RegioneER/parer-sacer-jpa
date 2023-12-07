package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_AGG_STRUT_B30 database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_AGG_STRUT_B30")
@NamedQuery(name = "MonVCntAggStrutB30.findAll", query = "SELECT m FROM MonVCntAggStrutB30 m")
public class MonVCntAggStrutB30 implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal niAgg;
    private MonVCntAggStrutB30Id monVCntAggStrutB30Id;

    public MonVCntAggStrutB30() {
    }

    @EmbeddedId
    public MonVCntAggStrutB30Id getMonVCntAggStrutB30Id() {
        return monVCntAggStrutB30Id;
    }

    public void setMonVCntAggStrutB30Id(MonVCntAggStrutB30Id monVCntAggStrutB30Id) {
        this.monVCntAggStrutB30Id = monVCntAggStrutB30Id;
    }

    @Column(name = "NI_AGG")
    public BigDecimal getNiAgg() {
        return this.niAgg;
    }

    public void setNiAgg(BigDecimal niAgg) {
        this.niAgg = niAgg;
    }

}
