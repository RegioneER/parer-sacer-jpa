package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_VERS_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_VERS_AMB")
@NamedQuery(name = "MonVCntVersAmb.findAll", query = "SELECT m FROM MonVCntVersAmb m")
public class MonVCntVersAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal niVers;
    private MonVCntVersAmbId monVCntVersAmbId;

    @EmbeddedId
    public MonVCntVersAmbId getMonVCntVersAmbId() {
        return monVCntVersAmbId;
    }

    public void setMonVCntVersAmbId(MonVCntVersAmbId monVCntVersAmbId) {
        this.monVCntVersAmbId = monVCntVersAmbId;
    }

    public MonVCntVersAmb() {/* Hibernate */
    }

    @Column(name = "NI_VERS")
    public BigDecimal getNiVers() {
        return this.niVers;
    }

    public void setNiVers(BigDecimal niVers) {
        this.niVers = niVers;
    }

}
