package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_VERS_ENTE database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_VERS_ENTE")
@NamedQuery(name = "MonVCntVersEnte.findAll", query = "SELECT m FROM MonVCntVersEnte m")
public class MonVCntVersEnte implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal niVers;
    private MonVCntVersEnteId monVCntVersEnteId;

    @EmbeddedId
    public MonVCntVersEnteId getMonVCntVersEnteId() {
        return monVCntVersEnteId;
    }

    public void setMonVCntVersEnteId(MonVCntVersEnteId monVCntVersEnteId) {
        this.monVCntVersEnteId = monVCntVersEnteId;
    }

    public MonVCntVersEnte() {/* Hibernate */
    }

    @Column(name = "NI_VERS")
    public BigDecimal getNiVers() {
        return this.niVers;
    }

    public void setNiVers(BigDecimal niVers) {
        this.niVers = niVers;
    }
}
