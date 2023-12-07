package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the VRS_V_UD_NON_VERS database table.
 */
@Entity
@Table(name = "VRS_V_UD_NON_VERS")
public class VrsVUdNonVer implements Serializable {

    private static final long serialVersionUID = 1L;

    public VrsVUdNonVer() {/* Hibernate */
    }

    private VrsVUdNonVerId vrsVUdNonVerId;

    @EmbeddedId()
    public VrsVUdNonVerId getVrsVUdNonVerId() {
        return vrsVUdNonVerId;
    }

    public void setVrsVUdNonVerId(VrsVUdNonVerId vrsVUdNonVerId) {
        this.vrsVUdNonVerId = vrsVUdNonVerId;
    }
}
