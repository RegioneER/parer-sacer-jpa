package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_FASC_BY_ENTE database table.
 */
@Entity
@Table(name = "MON_V_CNT_FASC_BY_ENTE")
@NamedQuery(name = "MonVCntFascByEnte.findByEnteUser", query = "SELECT m FROM MonVCntFascByEnte m WHERE m.monVCntFascByEnteId.idEnte = :idEnte AND m.monVCntFascByEnteId.idUserIam = :idUser")
public class MonVCntFascByEnte implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niFasc;

    public MonVCntFascByEnte() {/* Hibernate */
    }

    @Column(name = "NI_FASC")
    public BigDecimal getNiFasc() {
        return this.niFasc;
    }

    public void setNiFasc(BigDecimal niFasc) {
        this.niFasc = niFasc;
    }

    private MonVCntFascByEnteId monVCntFascByEnteId;

    @EmbeddedId()
    public MonVCntFascByEnteId getMonVCntFascByEnteId() {
        return monVCntFascByEnteId;
    }

    public void setMonVCntFascByEnteId(MonVCntFascByEnteId monVCntFascByEnteId) {
        this.monVCntFascByEnteId = monVCntFascByEnteId;
    }
}
