package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_FASC_KO_BY_ENTE database table.
 */
@Entity
@Table(name = "MON_V_CNT_FASC_KO_BY_ENTE")
@NamedQuery(name = "MonVCntFascKoByEnte.findByEnteUser", query = "SELECT m FROM MonVCntFascKoByEnte m WHERE m.monVCntFascKoByEnteId.idEnte = :idEnte AND m.monVCntFascKoByEnteId.idUserIam = :idUser")
public class MonVCntFascKoByEnte implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niFascKo;

    public MonVCntFascKoByEnte() {/* Hibernate */
    }

    @Column(name = "NI_FASC_KO")
    public BigDecimal getNiFascKo() {
        return this.niFascKo;
    }

    public void setNiFascKo(BigDecimal niFascKo) {
        this.niFascKo = niFascKo;
    }

    private MonVCntFascKoByEnteId monVCntFascKoByEnteId;

    @EmbeddedId()
    public MonVCntFascKoByEnteId getMonVCntFascKoByEnteId() {
        return monVCntFascKoByEnteId;
    }

    public void setMonVCntFascKoByEnteId(MonVCntFascKoByEnteId monVCntFascKoByEnteId) {
        this.monVCntFascKoByEnteId = monVCntFascKoByEnteId;
    }
}
