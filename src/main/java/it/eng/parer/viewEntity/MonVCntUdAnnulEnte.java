package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_ANNUL_ENTE database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_ANNUL_ENTE")
@NamedQuery(name = "MonVCntUdAnnulEnte.findAll", query = "SELECT m FROM MonVCntUdAnnulEnte m")
public class MonVCntUdAnnulEnte implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niAnnul;

    public MonVCntUdAnnulEnte() {/* Hibernate */
    }

    @Column(name = "NI_ANNUL")
    public BigDecimal getNiAnnul() {
        return this.niAnnul;
    }

    public void setNiAnnul(BigDecimal niAnnul) {
        this.niAnnul = niAnnul;
    }

    private MonVCntUdAnnulEnteId monVCntUdAnnulEnteId;

    @EmbeddedId()
    public MonVCntUdAnnulEnteId getMonVCntUdAnnulEnteId() {
        return monVCntUdAnnulEnteId;
    }

    public void setMonVCntUdAnnulEnteId(MonVCntUdAnnulEnteId monVCntUdAnnulEnteId) {
        this.monVCntUdAnnulEnteId = monVCntUdAnnulEnteId;
    }
}
