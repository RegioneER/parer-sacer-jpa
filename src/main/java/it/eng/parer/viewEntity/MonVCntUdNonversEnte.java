package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_NONVERS_ENTE database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_NONVERS_ENTE")
@NamedQuery(name = "MonVCntUdNonversEnte.findAll", query = "SELECT m FROM MonVCntUdNonversEnte m")
public class MonVCntUdNonversEnte implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niUdNonvers;

    public MonVCntUdNonversEnte() {/* Hibernate */
    }

    @Column(name = "NI_UD_NONVERS")
    public BigDecimal getNiUdNonvers() {
        return this.niUdNonvers;
    }

    public void setNiUdNonvers(BigDecimal niUdNonvers) {
        this.niUdNonvers = niUdNonvers;
    }

    private MonVCntUdNonversEnteId monVCntUdNonversEnteId;

    @EmbeddedId()
    public MonVCntUdNonversEnteId getMonVCntUdNonversEnteId() {
        return monVCntUdNonversEnteId;
    }

    public void setMonVCntUdNonversEnteId(MonVCntUdNonversEnteId monVCntUdNonversEnteId) {
        this.monVCntUdNonversEnteId = monVCntUdNonversEnteId;
    }
}
