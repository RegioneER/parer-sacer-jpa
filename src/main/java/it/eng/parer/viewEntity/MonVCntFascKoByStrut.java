package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_FASC_KO_BY_STRUT database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_FASC_KO_BY_STRUT")
@NamedQuery(name = "MonVCntFascKoByStrut.findByStrutUserId", query = "SELECT m FROM MonVCntFascKoByStrut m WHERE m.monVCntFascKoByStrutId.idStrut=:idStrut AND m.monVCntFascKoByStrutId.idUserIam=:idUserIam")
public class MonVCntFascKoByStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private MonVCntFascKoByStrutId monVCntFascKoByStrutId;
    private BigDecimal niFascKo;

    public MonVCntFascKoByStrut() {/* Hibernate */
    }

    @EmbeddedId
    public MonVCntFascKoByStrutId getMonVCntFascKoByStrutId() {
        return monVCntFascKoByStrutId;
    }

    public void setMonVCntFascKoByStrutId(MonVCntFascKoByStrutId monVCntFascKoByStrutId) {
        this.monVCntFascKoByStrutId = monVCntFascKoByStrutId;
    }

    @Column(name = "NI_FASC_KO")
    public BigDecimal getNiFascKo() {
        return this.niFascKo;
    }

    public void setNiFascKo(BigDecimal niFascKo) {
        this.niFascKo = niFascKo;
    }

}
