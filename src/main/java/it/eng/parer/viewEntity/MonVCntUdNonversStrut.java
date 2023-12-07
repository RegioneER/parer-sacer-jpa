package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_NONVERS_STRUT database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_NONVERS_STRUT")
@NamedQuery(name = "MonVCntUdNonversStrut.findAll", query = "SELECT m FROM MonVCntUdNonversStrut m")
public class MonVCntUdNonversStrut implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niUdNonvers;

    public MonVCntUdNonversStrut() {/* Hibernate */
    }

    @Column(name = "NI_UD_NONVERS")
    public BigDecimal getNiUdNonvers() {
        return this.niUdNonvers;
    }

    public void setNiUdNonvers(BigDecimal niUdNonvers) {
        this.niUdNonvers = niUdNonvers;
    }

    private MonVCntUdNonversStrutId monVCntUdNonversStrutId;

    @EmbeddedId()
    public MonVCntUdNonversStrutId getMonVCntUdNonversStrutId() {
        return monVCntUdNonversStrutId;
    }

    public void setMonVCntUdNonversStrutId(MonVCntUdNonversStrutId monVCntUdNonversStrutId) {
        this.monVCntUdNonversStrutId = monVCntUdNonversStrutId;
    }
}
