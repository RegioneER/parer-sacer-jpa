package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_V_DOC_RANGE_DT database table.
 */
@Entity
@Table(name = "ARO_V_DOC_RANGE_DT")
public class AroVDocRangeDt implements Serializable {

    private static final long serialVersionUID = 1L;

    public AroVDocRangeDt() {/* Hibernate */
    }

    private AroVDocRangeDtId aroVDocRangeDtId;

    @EmbeddedId()
    public AroVDocRangeDtId getAroVDocRangeDtId() {
        return aroVDocRangeDtId;
    }

    public void setAroVDocRangeDtId(AroVDocRangeDtId aroVDocRangeDtId) {
        this.aroVDocRangeDtId = aroVDocRangeDtId;
    }
}
