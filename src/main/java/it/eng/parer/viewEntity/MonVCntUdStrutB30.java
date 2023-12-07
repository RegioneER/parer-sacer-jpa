package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_STRUT_B30 database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_STRUT_B30")
@NamedQuery(name = "MonVCntUdStrutB30.findAll", query = "SELECT m FROM MonVCntUdStrutB30 m")
public class MonVCntUdStrutB30 implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niUd;

    public MonVCntUdStrutB30() {
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }

    private MonVCntUdStrutB30Id monVCntUdStrutB30Id;

    @EmbeddedId()
    public MonVCntUdStrutB30Id getMonVCntUdStrutB30Id() {
        return monVCntUdStrutB30Id;
    }

    public void setMonVCntUdStrutB30Id(MonVCntUdStrutB30Id monVCntUdStrutB30Id) {
        this.monVCntUdStrutB30Id = monVCntUdStrutB30Id;
    }
}
