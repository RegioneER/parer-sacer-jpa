package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_V_DOC_TI_UD_RANGE_DT database table.
 * 
 */
@Entity
@Table(name = "ARO_V_DOC_TI_UD_RANGE_DT")
public class AroVDocTiUdRangeDt implements Serializable {
    private static final long serialVersionUID = 1L;
    private AroVDocTiUdRangeDtId aroVDocTiUdRangeDtId;

    public AroVDocTiUdRangeDt() {/* Hibernate */
    }

    @EmbeddedId
    public AroVDocTiUdRangeDtId getAroVDocTiUdRangeDtId() {
        return aroVDocTiUdRangeDtId;
    }

    public void setAroVDocTiUdRangeDtId(AroVDocTiUdRangeDtId aroVDocTiUdRangeDtId) {
        this.aroVDocTiUdRangeDtId = aroVDocTiUdRangeDtId;
    }

}
