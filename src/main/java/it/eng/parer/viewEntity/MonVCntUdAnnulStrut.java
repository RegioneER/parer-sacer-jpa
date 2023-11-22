package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_ANNUL_STRUT database table.
 */
@Entity
@Table(name = "MON_V_CNT_UD_ANNUL_STRUT")
@NamedQuery(name = "MonVCntUdAnnulStrut.findAll", query = "SELECT m FROM MonVCntUdAnnulStrut m")
public class MonVCntUdAnnulStrut implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niAnnul;

    public MonVCntUdAnnulStrut() {/* Hibernate */
    }

    @Column(name = "NI_ANNUL")
    public BigDecimal getNiAnnul() {
        return this.niAnnul;
    }

    public void setNiAnnul(BigDecimal niAnnul) {
        this.niAnnul = niAnnul;
    }

    private MonVCntUdAnnulStrutId monVCntUdAnnulStrutId;

    @EmbeddedId()
    public MonVCntUdAnnulStrutId getMonVCntUdAnnulStrutId() {
        return monVCntUdAnnulStrutId;
    }

    public void setMonVCntUdAnnulStrutId(MonVCntUdAnnulStrutId monVCntUdAnnulStrutId) {
        this.monVCntUdAnnulStrutId = monVCntUdAnnulStrutId;
    }
}
