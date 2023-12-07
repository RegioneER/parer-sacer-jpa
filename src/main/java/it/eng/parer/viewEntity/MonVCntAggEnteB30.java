package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_AGG_ENTE_B30 database table.
 */
@Entity
@Table(name = "MON_V_CNT_AGG_ENTE_B30")
@NamedQuery(name = "MonVCntAggEnteB30.findAll", query = "SELECT m FROM MonVCntAggEnteB30 m")
public class MonVCntAggEnteB30 implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niAgg;

    public MonVCntAggEnteB30() {
    }

    @Column(name = "NI_AGG")
    public BigDecimal getNiAgg() {
        return this.niAgg;
    }

    public void setNiAgg(BigDecimal niAgg) {
        this.niAgg = niAgg;
    }

    private MonVCntAggEnteB30Id monVCntAggEnteB30Id;

    @EmbeddedId()
    public MonVCntAggEnteB30Id getMonVCntAggEnteB30Id() {
        return monVCntAggEnteB30Id;
    }

    public void setMonVCntAggEnteB30Id(MonVCntAggEnteB30Id monVCntAggEnteB30Id) {
        this.monVCntAggEnteB30Id = monVCntAggEnteB30Id;
    }
}
