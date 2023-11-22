package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the FAS_V_LIS_FASC_BY_UPD_UD database table.
 *
 */
@Entity
@Table(name = "FAS_V_LIS_FASC_BY_UPD_UD")
@NamedQuery(name = "FasVLisFascByUpdUd.findAll", query = "SELECT s FROM FasVLisFascByUpdUd s")
public class FasVLisFascByUpdUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private FasVLisFascByUpdUdId fasVLisFascByUpdUdId;

    @EmbeddedId
    public FasVLisFascByUpdUdId getFasVLisFascByUpdUdId() {
        return fasVLisFascByUpdUdId;
    }

    public void setFasVLisFascByUpdUdId(FasVLisFascByUpdUdId fasVLisFascByUpdUdId) {
        this.fasVLisFascByUpdUdId = fasVLisFascByUpdUdId;
    }

    public FasVLisFascByUpdUd() {/* Hibernate */
    }

}
