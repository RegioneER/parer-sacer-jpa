package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_NONVERS_AMB database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_NONVERS_AMB")
@NamedQuery(name = "MonVCntUdNonversAmb.findAll", query = "SELECT m FROM MonVCntUdNonversAmb m")
public class MonVCntUdNonversAmb implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niUdNonvers;

    public MonVCntUdNonversAmb() {/* Hibernate */
    }

    @Column(name = "NI_UD_NONVERS")
    public BigDecimal getNiUdNonvers() {
        return this.niUdNonvers;
    }

    public void setNiUdNonvers(BigDecimal niUdNonvers) {
        this.niUdNonvers = niUdNonvers;
    }

    private MonVCntUdNonversAmbId monVCntUdNonversAmbId;

    @EmbeddedId()
    public MonVCntUdNonversAmbId getMonVCntUdNonversAmbId() {
        return monVCntUdNonversAmbId;
    }

    public void setMonVCntUdNonversAmbId(MonVCntUdNonversAmbId monVCntUdNonversAmbId) {
        this.monVCntUdNonversAmbId = monVCntUdNonversAmbId;
    }
}
