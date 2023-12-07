package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_ENTE_B30 database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_ENTE_B30")
@NamedQuery(name = "MonVCntUdEnteB30.findAll", query = "SELECT m FROM MonVCntUdEnteB30 m")
public class MonVCntUdEnteB30 implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niUd;

    public MonVCntUdEnteB30() {
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }

    private MonVCntUdEnteB30Id monVCntUdEnteB30Id;

    @EmbeddedId()
    public MonVCntUdEnteB30Id getMonVCntUdEnteB30Id() {
        return monVCntUdEnteB30Id;
    }

    public void setMonVCntUdEnteB30Id(MonVCntUdEnteB30Id monVCntUdEnteB30Id) {
        this.monVCntUdEnteB30Id = monVCntUdEnteB30Id;
    }
}
