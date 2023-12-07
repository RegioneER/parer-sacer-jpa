package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_AMB_B30 database table.
 */
@Entity
@Table(name = "MON_V_CNT_DOC_AMB_B30")
@NamedQuery(name = "MonVCntDocAmbB30.findAll", query = "SELECT m FROM MonVCntDocAmbB30 m")
public class MonVCntDocAmbB30 implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niDoc;

    public MonVCntDocAmbB30() {
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }

    private MonVCntDocAmbB30Id monVCntDocAmbB30Id;

    @EmbeddedId()
    public MonVCntDocAmbB30Id getMonVCntDocAmbB30Id() {
        return monVCntDocAmbB30Id;
    }

    public void setMonVCntDocAmbB30Id(MonVCntDocAmbB30Id monVCntDocAmbB30Id) {
        this.monVCntDocAmbB30Id = monVCntDocAmbB30Id;
    }
}
