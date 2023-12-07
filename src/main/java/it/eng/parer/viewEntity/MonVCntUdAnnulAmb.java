package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_ANNUL_AMB database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_ANNUL_AMB")
@NamedQuery(name = "MonVCntUdAnnulAmb.findAll", query = "SELECT m FROM MonVCntUdAnnulAmb m")
public class MonVCntUdAnnulAmb implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niAnnul;

    public MonVCntUdAnnulAmb() {/* Hibernate */
    }

    @Column(name = "NI_ANNUL")
    public BigDecimal getNiAnnul() {
        return this.niAnnul;
    }

    public void setNiAnnul(BigDecimal niAnnul) {
        this.niAnnul = niAnnul;
    }

    private MonVCntUdAnnulAmbId monVCntUdAnnulAmbId;

    @EmbeddedId()
    public MonVCntUdAnnulAmbId getMonVCntUdAnnulAmbId() {
        return monVCntUdAnnulAmbId;
    }

    public void setMonVCntUdAnnulAmbId(MonVCntUdAnnulAmbId monVCntUdAnnulAmbId) {
        this.monVCntUdAnnulAmbId = monVCntUdAnnulAmbId;
    }
}
