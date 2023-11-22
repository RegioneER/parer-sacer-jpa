package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_VERS_AMB_B30 database table.
 */
@Entity
@Table(name = "MON_V_CNT_VERS_AMB_B30")
@NamedQuery(name = "MonVCntVersAmbB30.findAll", query = "SELECT m FROM MonVCntVersAmbB30 m")
public class MonVCntVersAmbB30 implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niVers;

    public MonVCntVersAmbB30() {
    }

    @Column(name = "NI_VERS")
    public BigDecimal getNiVers() {
        return this.niVers;
    }

    public void setNiVers(BigDecimal niVers) {
        this.niVers = niVers;
    }

    private MonVCntVersAmbB30Id monVCntVersAmbB30Id;

    @EmbeddedId()
    public MonVCntVersAmbB30Id getMonVCntVersAmbB30Id() {
        return monVCntVersAmbB30Id;
    }

    public void setMonVCntVersAmbB30Id(MonVCntVersAmbB30Id monVCntVersAmbB30Id) {
        this.monVCntVersAmbB30Id = monVCntVersAmbB30Id;
    }
}
