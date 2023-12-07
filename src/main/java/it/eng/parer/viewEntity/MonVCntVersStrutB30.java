package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_VERS_STRUT_B30 database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_VERS_STRUT_B30")
@NamedQuery(name = "MonVCntVersStrutB30.findAll", query = "SELECT m FROM MonVCntVersStrutB30 m")
public class MonVCntVersStrutB30 implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal niVers;
    private MonVCntVersStrutB30Id monVCntVersStrutB30Id;

    @EmbeddedId
    public MonVCntVersStrutB30Id getMonVCntVersStrutB30Id() {
        return monVCntVersStrutB30Id;
    }

    public void setMonVCntVersStrutB30Id(MonVCntVersStrutB30Id monVCntVersStrutB30Id) {
        this.monVCntVersStrutB30Id = monVCntVersStrutB30Id;
    }

    public MonVCntVersStrutB30() {
    }

    @Column(name = "NI_VERS")
    public BigDecimal getNiVers() {
        return this.niVers;
    }

    public void setNiVers(BigDecimal niVers) {
        this.niVers = niVers;
    }
}