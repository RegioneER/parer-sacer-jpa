package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CNT_DOC_TIPO_UD_B30 database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_TIPO_UD_B30")
@NamedQuery(name = "MonVCntDocTipoUdB30.findAll", query = "SELECT m FROM MonVCntDocTipoUdB30 m")
public class MonVCntDocTipoUdB30 implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal niDoc;
    private MonVCntDocTipoUdB30Id monVCntDocTipoUdB30Id;

    public MonVCntDocTipoUdB30() {
    }

    @EmbeddedId
    public MonVCntDocTipoUdB30Id getMonVCntDocTipoUdB30Id() {
        return monVCntDocTipoUdB30Id;
    }

    public void setMonVCntDocTipoUdB30Id(MonVCntDocTipoUdB30Id monVCntDocTipoUdB30Id) {
        this.monVCntDocTipoUdB30Id = monVCntDocTipoUdB30Id;
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }
}