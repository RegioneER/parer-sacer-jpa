package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_AGG_STRUT database table.
 */
@Entity
@Table(name = "MON_V_CNT_AGG_STRUT")
@NamedQuery(name = "MonVCntAggStrut.findAll", query = "SELECT m FROM MonVCntAggStrut m")
public class MonVCntAggStrut implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niAgg;

    public MonVCntAggStrut() {/* Hibernate */
    }

    @Column(name = "NI_AGG")
    public BigDecimal getNiAgg() {
        return this.niAgg;
    }

    public void setNiAgg(BigDecimal niAgg) {
        this.niAgg = niAgg;
    }

    private MonVCntAggStrutId monVCntAggStrutId;

    @EmbeddedId()
    public MonVCntAggStrutId getMonVCntAggStrutId() {
        return monVCntAggStrutId;
    }

    public void setMonVCntAggStrutId(MonVCntAggStrutId monVCntAggStrutId) {
        this.monVCntAggStrutId = monVCntAggStrutId;
    }
}
