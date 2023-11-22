package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_TIPO_UD database table.
 */
@Entity
@Table(name = "MON_V_CNT_DOC_TIPO_UD")
@NamedQuery(name = "MonVCntDocTipoUd.findAll", query = "SELECT m FROM MonVCntDocTipoUd m")
public class MonVCntDocTipoUd implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niDoc;

    public MonVCntDocTipoUd() {/* Hibernate */
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }

    private MonVCntDocTipoUdId monVCntDocTipoUdId;

    @EmbeddedId()
    public MonVCntDocTipoUdId getMonVCntDocTipoUdId() {
        return monVCntDocTipoUdId;
    }

    public void setMonVCntDocTipoUdId(MonVCntDocTipoUdId monVCntDocTipoUdId) {
        this.monVCntDocTipoUdId = monVCntDocTipoUdId;
    }
}
