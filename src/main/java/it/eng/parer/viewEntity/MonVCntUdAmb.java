package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_UD_AMB")
@NamedQuery(name = "MonVCntUdAmb.findAll", query = "SELECT m FROM MonVCntUdAmb m")
public class MonVCntUdAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal niUd;
    private MonVCntUdAmbId monVCntUdAmbId;

    @EmbeddedId
    public MonVCntUdAmbId getMonVCntUdAmbId() {
        return monVCntUdAmbId;
    }

    public void setMonVCntUdAmbId(MonVCntUdAmbId monVCntUdAmbId) {
        this.monVCntUdAmbId = monVCntUdAmbId;
    }

    public MonVCntUdAmb() {/* Hibernate */
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }

}