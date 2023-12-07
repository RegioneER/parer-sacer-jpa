package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_FASC_BY_STRUT database table.
 */
@Entity
@Table(name = "MON_V_CNT_FASC_BY_STRUT")
@NamedQuery(name = "MonVCntFascByStrut.findByStrutUserId", query = "SELECT m FROM MonVCntFascByStrut m WHERE m.monVCntFascByStrutId.idStrut = :idStrut AND m.monVCntFascByStrutId.idUserIam=:idUserIam")
public class MonVCntFascByStrut implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niFasc;

    public MonVCntFascByStrut() {/* Hibernate */
    }

    @Column(name = "NI_FASC")
    public BigDecimal getNiFasc() {
        return this.niFasc;
    }

    public void setNiFasc(BigDecimal niFasc) {
        this.niFasc = niFasc;
    }

    private MonVCntFascByStrutId monVCntFascByStrutId;

    @EmbeddedId()
    public MonVCntFascByStrutId getMonVCntFascByStrutId() {
        return monVCntFascByStrutId;
    }

    public void setMonVCntFascByStrutId(MonVCntFascByStrutId monVCntFascByStrutId) {
        this.monVCntFascByStrutId = monVCntFascByStrutId;
    }
}
