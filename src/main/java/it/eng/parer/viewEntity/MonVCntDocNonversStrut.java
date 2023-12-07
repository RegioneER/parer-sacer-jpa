package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_NONVERS_STRUT database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_NONVERS_STRUT")
@NamedQuery(name = "MonVCntDocNonversStrut.findAll", query = "SELECT m FROM MonVCntDocNonversStrut m")
public class MonVCntDocNonversStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal niDocNonvers;
    private MonVCntDocNonversStrutId monVCntDocNonversStrutId;

    @EmbeddedId
    public MonVCntDocNonversStrutId getMonVCntDocNonversStrutId() {
        return monVCntDocNonversStrutId;
    }

    public void setMonVCntDocNonversStrutId(MonVCntDocNonversStrutId monVCntDocNonversStrutId) {
        this.monVCntDocNonversStrutId = monVCntDocNonversStrutId;
    }

    public MonVCntDocNonversStrut() {/* Hibernate */
    }

    @Column(name = "NI_DOC_NONVERS")
    public BigDecimal getNiDocNonvers() {
        return this.niDocNonvers;
    }

    public void setNiDocNonvers(BigDecimal niDocNonvers) {
        this.niDocNonvers = niDocNonvers;
    }
}
