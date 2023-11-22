package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_VERS_STRUT database table.
 */
@Entity
@Table(name = "MON_V_CNT_VERS_STRUT")
@NamedQuery(name = "MonVCntVersStrut.findAll", query = "SELECT m FROM MonVCntVersStrut m")
public class MonVCntVersStrut implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niVers;

    public MonVCntVersStrut() {/* Hibernate */
    }

    @Column(name = "NI_VERS")
    public BigDecimal getNiVers() {
        return this.niVers;
    }

    public void setNiVers(BigDecimal niVers) {
        this.niVers = niVers;
    }

    private MonVCntVersStrutId monVCntVersStrutId;

    @EmbeddedId()
    public MonVCntVersStrutId getMonVCntVersStrutId() {
        return monVCntVersStrutId;
    }

    public void setMonVCntVersStrutId(MonVCntVersStrutId monVCntVersStrutId) {
        this.monVCntVersStrutId = monVCntVersStrutId;
    }
}
