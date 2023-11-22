package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_FASC_KO_BY_TI_FASC database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_FASC_KO_BY_TI_FASC")
@NamedQuery(name = "MonVCntFascKoByTiFasc.findByTiFasc", query = "SELECT m FROM MonVCntFascKoByTiFasc m WHERE m.monVCntFascKoByTiFascId.idTipoFascicolo = :idTipoFascicolo")
public class MonVCntFascKoByTiFasc implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niFascKo;
    private MonVCntFascKoByTiFascId monVCntFascKoByTiFascId;

    public MonVCntFascKoByTiFasc() {/* Hibernate */
    }

    @EmbeddedId
    public MonVCntFascKoByTiFascId getMonVCntFascKoByTiFascId() {
        return monVCntFascKoByTiFascId;
    }

    public void setMonVCntFascKoByTiFascId(MonVCntFascKoByTiFascId monVCntFascKoByTiFascId) {
        this.monVCntFascKoByTiFascId = monVCntFascKoByTiFascId;
    }

    @Column(name = "NI_FASC_KO")
    public BigDecimal getNiFascKo() {
        return this.niFascKo;
    }

    public void setNiFascKo(BigDecimal niFascKo) {
        this.niFascKo = niFascKo;
    }
}
