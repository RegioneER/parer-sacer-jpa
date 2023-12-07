package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_FASC_KO_BY_AMB database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_FASC_KO_BY_AMB")
@NamedQuery(name = "MonVCntFascKoByAmb.findByAmbUser", query = "SELECT m FROM MonVCntFascKoByAmb m WHERE m.monVCntFascKoByAmbId.idAmbiente = :idAmbiente AND m.monVCntFascKoByAmbId.idUserIam = :idUser")
public class MonVCntFascKoByAmb implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal niFascKo;
    private MonVCntFascKoByAmbId monVCntFascKoByAmbId;

    public MonVCntFascKoByAmb() {/* Hibernate */
    }

    @Column(name = "NI_FASC_KO")
    public BigDecimal getNiFascKo() {
        return this.niFascKo;
    }

    public void setNiFascKo(BigDecimal niFascKo) {
        this.niFascKo = niFascKo;
    }

    @EmbeddedId
    public MonVCntFascKoByAmbId getMonVCntFascKoByAmbId() {
        return monVCntFascKoByAmbId;
    }

    public void setMonVCntFascKoByAmbId(MonVCntFascKoByAmbId monVCntFascKoByAmbId) {
        this.monVCntFascKoByAmbId = monVCntFascKoByAmbId;
    }

}
