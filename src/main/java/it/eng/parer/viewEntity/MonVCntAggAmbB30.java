package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_AGG_AMB_B30 database table.
 */
@Entity
@Table(name = "MON_V_CNT_AGG_AMB_B30")
@NamedQuery(name = "MonVCntAggAmbB30.findAll", query = "SELECT m FROM MonVCntAggAmbB30 m")
public class MonVCntAggAmbB30 implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niAgg;

    public MonVCntAggAmbB30() {
    }

    @Column(name = "NI_AGG")
    public BigDecimal getNiAgg() {
        return this.niAgg;
    }

    public void setNiAgg(BigDecimal niAgg) {
        this.niAgg = niAgg;
    }

    private MonVCntAggAmbB30Id monVCntAggAmbB30Id;

    @EmbeddedId()
    public MonVCntAggAmbB30Id getMonVCntAggAmbB30Id() {
        return monVCntAggAmbB30Id;
    }

    public void setMonVCntAggAmbB30Id(MonVCntAggAmbB30Id monVCntAggAmbB30Id) {
        this.monVCntAggAmbB30Id = monVCntAggAmbB30Id;
    }
}
