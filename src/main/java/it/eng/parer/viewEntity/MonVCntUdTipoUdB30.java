package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_TIPO_UD_B30 database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_TIPO_UD_B30")
@NamedQuery(name = "MonVCntUdTipoUdB30.findAll", query = "SELECT m FROM MonVCntUdTipoUdB30 m")
public class MonVCntUdTipoUdB30 implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niUd;

    public MonVCntUdTipoUdB30() {
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }

    private MonVCntUdTipoUdB30Id monVCntUdTipoUdB30Id;

    @EmbeddedId()
    public MonVCntUdTipoUdB30Id getMonVCntUdTipoUdB30Id() {
        return monVCntUdTipoUdB30Id;
    }

    public void setMonVCntUdTipoUdB30Id(MonVCntUdTipoUdB30Id monVCntUdTipoUdB30Id) {
        this.monVCntUdTipoUdB30Id = monVCntUdTipoUdB30Id;
    }
}
