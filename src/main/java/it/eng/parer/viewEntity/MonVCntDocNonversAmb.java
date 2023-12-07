package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_NONVERS_AMB database table.
 */
@Entity
@Table(name = "MON_V_CNT_DOC_NONVERS_AMB")
@NamedQuery(name = "MonVCntDocNonversAmb.findAll", query = "SELECT m FROM MonVCntDocNonversAmb m")
public class MonVCntDocNonversAmb implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal niDocNonvers;

    public MonVCntDocNonversAmb() {/* Hibernate */
    }

    @Column(name = "NI_DOC_NONVERS")
    public BigDecimal getNiDocNonvers() {
        return this.niDocNonvers;
    }

    public void setNiDocNonvers(BigDecimal niDocNonvers) {
        this.niDocNonvers = niDocNonvers;
    }

    private MonVCntDocNonversAmbId monVCntDocNonversAmbId;

    @EmbeddedId()
    public MonVCntDocNonversAmbId getMonVCntDocNonversAmbId() {
        return monVCntDocNonversAmbId;
    }

    public void setMonVCntDocNonversAmbId(MonVCntDocNonversAmbId monVCntDocNonversAmbId) {
        this.monVCntDocNonversAmbId = monVCntDocNonversAmbId;
    }
}
