package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_TIPO_UD database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_UD_TIPO_UD")
@NamedQuery(name = "MonVCntUdTipoUd.findAll", query = "SELECT m FROM MonVCntUdTipoUd m")
public class MonVCntUdTipoUd implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niUd;
    private MonVCntUdTipoUdId monVCntUdTipoUdId;

    @EmbeddedId
    public MonVCntUdTipoUdId getMonVCntUdTipoUdId() {
        return monVCntUdTipoUdId;
    }

    public void setMonVCntUdTipoUdId(MonVCntUdTipoUdId monVCntUdTipoUdId) {
        this.monVCntUdTipoUdId = monVCntUdTipoUdId;
    }

    public MonVCntUdTipoUd() {/* Hibernate */
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }
}
