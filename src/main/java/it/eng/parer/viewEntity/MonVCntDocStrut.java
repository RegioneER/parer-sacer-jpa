package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_STRUT database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_STRUT")
@NamedQuery(name = "MonVCntDocStrut.findAll", query = "SELECT m FROM MonVCntDocStrut m")
public class MonVCntDocStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private MonVCntDocStrutId monVCntDocStrutId;

    @EmbeddedId
    public MonVCntDocStrutId getMonVCntDocStrutId() {
        return monVCntDocStrutId;
    }

    public void setMonVCntDocStrutId(MonVCntDocStrutId monVCntDocStrutId) {
        this.monVCntDocStrutId = monVCntDocStrutId;
    }

    private BigDecimal niDoc;

    public MonVCntDocStrut() {/* Hibernate */
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }

}
