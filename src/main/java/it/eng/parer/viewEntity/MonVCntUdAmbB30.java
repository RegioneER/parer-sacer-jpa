package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_AMB_B30 database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_UD_AMB_B30")
@NamedQuery(name = "MonVCntUdAmbB30.findAll", query = "SELECT m FROM MonVCntUdAmbB30 m")
public class MonVCntUdAmbB30 implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal niUd;
    private MonVCntUdAmbB30Id monVCntUdAmbB30Id;

    public MonVCntUdAmbB30() {
    }

    @EmbeddedId
    public MonVCntUdAmbB30Id getMonVCntUdAmbB30Id() {
        return monVCntUdAmbB30Id;
    }

    public void setMonVCntUdAmbB30Id(MonVCntUdAmbB30Id monVCntUdAmbB30Id) {
        this.monVCntUdAmbB30Id = monVCntUdAmbB30Id;
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }

}
