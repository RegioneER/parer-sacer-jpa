package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_ENTE_B30 database table.
 */
@Entity
@Table(name = "MON_V_CNT_DOC_ENTE_B30")
@NamedQuery(name = "MonVCntDocEnteB30.findAll", query = "SELECT m FROM MonVCntDocEnteB30 m")
public class MonVCntDocEnteB30 implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal niDoc;

    public MonVCntDocEnteB30() {
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }

    private MonVCntDocEnteB30Id monVCntDocEnteB30Id;

    @EmbeddedId()
    public MonVCntDocEnteB30Id getMonVCntDocEnteB30Id() {
        return monVCntDocEnteB30Id;
    }

    public void setMonVCntDocEnteB30Id(MonVCntDocEnteB30Id monVCntDocEnteB30Id) {
        this.monVCntDocEnteB30Id = monVCntDocEnteB30Id;
    }
}
