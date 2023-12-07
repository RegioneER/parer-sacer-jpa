package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_AMB")
@NamedQuery(name = "MonVCntDocAmb.findAll", query = "SELECT m FROM MonVCntDocAmb m")
public class MonVCntDocAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal niDoc;
    private MonVCntDocAmbId monVCntDocAmbId;

    @EmbeddedId
    public MonVCntDocAmbId getMonVCntDocAmbId() {
        return monVCntDocAmbId;
    }

    public void setMonVCntDocAmbId(MonVCntDocAmbId monVCntDocAmbId) {
        this.monVCntDocAmbId = monVCntDocAmbId;
    }

    public MonVCntDocAmb() {/* Hibernate */
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }

}
