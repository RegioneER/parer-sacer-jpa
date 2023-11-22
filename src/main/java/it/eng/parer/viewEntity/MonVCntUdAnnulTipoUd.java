package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_UD_ANNUL_TIPO_UD database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_UD_ANNUL_TIPO_UD")
@NamedQuery(name = "MonVCntUdAnnulTipoUd.findAll", query = "SELECT m FROM MonVCntUdAnnulTipoUd m")
public class MonVCntUdAnnulTipoUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal niAnnul;
    private MonVCntUdAnnulTipoUdId monVCntUdAnnulTipoUdId;

    public MonVCntUdAnnulTipoUd() {/* Hibernate */
    }

    @Column(name = "NI_ANNUL")
    public BigDecimal getNiAnnul() {
        return this.niAnnul;
    }

    public void setNiAnnul(BigDecimal niAnnul) {
        this.niAnnul = niAnnul;
    }

    @EmbeddedId
    public MonVCntUdAnnulTipoUdId getMonVCntUdAnnulTipoUdId() {
        return monVCntUdAnnulTipoUdId;
    }

    public void setMonVCntUdAnnulTipoUdId(MonVCntUdAnnulTipoUdId monVCntUdAnnulTipoUdId) {
        this.monVCntUdAnnulTipoUdId = monVCntUdAnnulTipoUdId;
    }

}
