package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_V_DOC_VOL_TI_UD_RANGE_DT database table.
 */
@Entity
@Table(name = "ARO_V_DOC_VOL_TI_UD_RANGE_DT")
public class AroVDocVolTiUdRangeDt implements Serializable {

    private static final long serialVersionUID = 1L;

    public AroVDocVolTiUdRangeDt() {/* Hibernate */
    }

    private AroVDocVolTiUdRangeDtId aroVDocVolTiUdRangeDtId;

    @EmbeddedId()
    public AroVDocVolTiUdRangeDtId getAroVDocVolTiUdRangeDtId() {
        return aroVDocVolTiUdRangeDtId;
    }

    public void setAroVDocVolTiUdRangeDtId(AroVDocVolTiUdRangeDtId aroVDocVolTiUdRangeDtId) {
        this.aroVDocVolTiUdRangeDtId = aroVDocVolTiUdRangeDtId;
    }
}
