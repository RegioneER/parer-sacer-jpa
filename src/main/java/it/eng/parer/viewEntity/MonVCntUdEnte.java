package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_ENTE database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_UD_ENTE")
@NamedQuery(name = "MonVCntUdEnte.findAll", query = "SELECT m FROM MonVCntUdEnte m")
public class MonVCntUdEnte implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal niUd;
    private MonVCntUdEnteId monVCntUdEnteId;

    public MonVCntUdEnte() {/* Hibernate */
    }

    @EmbeddedId
    public MonVCntUdEnteId getMonVCntUdEnteId() {
        return monVCntUdEnteId;
    }

    public void setMonVCntUdEnteId(MonVCntUdEnteId monVCntUdEnteId) {
        this.monVCntUdEnteId = monVCntUdEnteId;
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }

}
