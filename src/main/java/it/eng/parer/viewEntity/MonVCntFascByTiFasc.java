package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_FASC_BY_TI_FASC database table.
 */
@Entity
@Table(name = "MON_V_CNT_FASC_BY_TI_FASC")
@NamedQuery(name = "MonVCntFascByTiFasc.findByTiFasc", query = "SELECT m FROM MonVCntFascByTiFasc m WHERE m.monVCntFascByTiFascId.idTipoFascicolo = :idTipoFascicolo")
public class MonVCntFascByTiFasc implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niFasc;

    public MonVCntFascByTiFasc() {/* Hibernate */
    }

    @Column(name = "NI_FASC")
    public BigDecimal getNiFasc() {
        return this.niFasc;
    }

    public void setNiFasc(BigDecimal niFasc) {
        this.niFasc = niFasc;
    }

    private MonVCntFascByTiFascId monVCntFascByTiFascId;

    @EmbeddedId()
    public MonVCntFascByTiFascId getMonVCntFascByTiFascId() {
        return monVCntFascByTiFascId;
    }

    public void setMonVCntFascByTiFascId(MonVCntFascByTiFascId monVCntFascByTiFascId) {
        this.monVCntFascByTiFascId = monVCntFascByTiFascId;
    }
}
