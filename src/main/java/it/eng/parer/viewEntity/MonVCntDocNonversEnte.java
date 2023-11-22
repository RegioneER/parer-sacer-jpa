package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_NONVERS_ENTE database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_NONVERS_ENTE")
@NamedQuery(name = "MonVCntDocNonversEnte.findAll", query = "SELECT m FROM MonVCntDocNonversEnte m")
public class MonVCntDocNonversEnte implements Serializable {
    private static final long serialVersionUID = 1L;
    private MonVCntDocNonversEnteId monVCntDocNonversEnteId;
    private BigDecimal niDocNonvers;

    public MonVCntDocNonversEnte() {/* Hibernate */
    }

    @EmbeddedId
    public MonVCntDocNonversEnteId getMonVCntDocNonversEnteId() {
        return monVCntDocNonversEnteId;
    }

    public void setMonVCntDocNonversEnteId(MonVCntDocNonversEnteId monVCntDocNonversEnteId) {
        this.monVCntDocNonversEnteId = monVCntDocNonversEnteId;
    }

    @Column(name = "NI_DOC_NONVERS")
    public BigDecimal getNiDocNonvers() {
        return this.niDocNonvers;
    }

    public void setNiDocNonvers(BigDecimal niDocNonvers) {
        this.niDocNonvers = niDocNonvers;
    }
}
