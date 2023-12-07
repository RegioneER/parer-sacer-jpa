package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_ENTE database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_DOC_ENTE")
@NamedQuery(name = "MonVCntDocEnte.findAll", query = "SELECT m FROM MonVCntDocEnte m")
public class MonVCntDocEnte implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niDoc;
    private MonVCntDocEnteId monVCntDocEnteId;

    public MonVCntDocEnte() {/* Hibernate */
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }

    @EmbeddedId
    public MonVCntDocEnteId getMonVCntDocEnteId() {
        return monVCntDocEnteId;
    }

    public void setMonVCntDocEnteId(MonVCntDocEnteId monVCntDocEnteId) {
        this.monVCntDocEnteId = monVCntDocEnteId;
    }

}
