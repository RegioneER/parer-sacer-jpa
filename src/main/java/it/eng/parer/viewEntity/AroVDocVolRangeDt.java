package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_V_DOC_VOL_RANGE_DT database table.
 */
@Entity
@Table(name = "ARO_V_DOC_VOL_RANGE_DT")
public class AroVDocVolRangeDt implements Serializable {

    private static final long serialVersionUID = 1L;

    public AroVDocVolRangeDt() {/* Hibernate */
    }

    private AroVDocVolRangeDtId aroVDocVolRangeDtId;

    @EmbeddedId()
    public AroVDocVolRangeDtId getAroVDocVolRangeDtId() {
        return aroVDocVolRangeDtId;
    }

    public void setAroVDocVolRangeDtId(AroVDocVolRangeDtId aroVDocVolRangeDtId) {
        this.aroVDocVolRangeDtId = aroVDocVolRangeDtId;
    }
}
