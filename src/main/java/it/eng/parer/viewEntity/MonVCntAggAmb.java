package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_AGG_AMB database table.
 */
@Entity
@Table(name = "MON_V_CNT_AGG_AMB")
@NamedQuery(name = "MonVCntAggAmb.findAll", query = "SELECT m FROM MonVCntAggAmb m")
public class MonVCntAggAmb implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niAgg;

    public MonVCntAggAmb() {/* Hibernate */
    }

    @Column(name = "NI_AGG")
    public BigDecimal getNiAgg() {
        return this.niAgg;
    }

    public void setNiAgg(BigDecimal niAgg) {
        this.niAgg = niAgg;
    }

    private MonVCntAggAmbId monVCntAggAmbId;

    @EmbeddedId()
    public MonVCntAggAmbId getMonVCntAggAmbId() {
        return monVCntAggAmbId;
    }

    public void setMonVCntAggAmbId(MonVCntAggAmbId monVCntAggAmbId) {
        this.monVCntAggAmbId = monVCntAggAmbId;
    }
}
