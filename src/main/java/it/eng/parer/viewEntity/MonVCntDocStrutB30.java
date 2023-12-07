package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_STRUT_B30 database table.
 */
@Entity
@Table(name = "MON_V_CNT_DOC_STRUT_B30")
@NamedQuery(name = "MonVCntDocStrutB30.findAll", query = "SELECT m FROM MonVCntDocStrutB30 m")
public class MonVCntDocStrutB30 implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niDoc;

    public MonVCntDocStrutB30() {
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }

    private MonVCntDocStrutB30Id monVCntDocStrutB30Id;

    @EmbeddedId()
    public MonVCntDocStrutB30Id getMonVCntDocStrutB30Id() {
        return monVCntDocStrutB30Id;
    }

    public void setMonVCntDocStrutB30Id(MonVCntDocStrutB30Id monVCntDocStrutB30Id) {
        this.monVCntDocStrutB30Id = monVCntDocStrutB30Id;
    }
}
