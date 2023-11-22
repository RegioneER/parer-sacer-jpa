package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_FASC_BY_AMB database table.
 */
@Entity
@Table(name = "MON_V_CNT_FASC_BY_AMB")
@NamedQuery(name = "MonVCntFascByAmb.findByAmbUser", query = "SELECT m FROM MonVCntFascByAmb m WHERE m.monVCntFascByAmbId.idAmbiente = :idAmbiente AND m.monVCntFascByAmbId.idUserIam = :idUser")
public class MonVCntFascByAmb implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niFasc;

    public MonVCntFascByAmb() {/* Hibernate */
    }

    @Column(name = "NI_FASC")
    public BigDecimal getNiFasc() {
        return this.niFasc;
    }

    public void setNiFasc(BigDecimal niFasc) {
        this.niFasc = niFasc;
    }

    private MonVCntFascByAmbId monVCntFascByAmbId;

    @EmbeddedId()
    public MonVCntFascByAmbId getMonVCntFascByAmbId() {
        return monVCntFascByAmbId;
    }

    public void setMonVCntFascByAmbId(MonVCntFascByAmbId monVCntFascByAmbId) {
        this.monVCntFascByAmbId = monVCntFascByAmbId;
    }
}
