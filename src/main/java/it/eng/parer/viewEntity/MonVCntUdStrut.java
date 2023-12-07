package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_STRUT database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_STRUT")
@NamedQuery(name = "MonVCntUdStrut.findAll", query = "SELECT m FROM MonVCntUdStrut m")
public class MonVCntUdStrut implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niUd;

    public MonVCntUdStrut() {/* Hibernate */
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }

    private MonVCntUdStrutId monVCntUdStrutId;

    @EmbeddedId()
    public MonVCntUdStrutId getMonVCntUdStrutId() {
        return monVCntUdStrutId;
    }

    public void setMonVCntUdStrutId(MonVCntUdStrutId monVCntUdStrutId) {
        this.monVCntUdStrutId = monVCntUdStrutId;
    }
}
