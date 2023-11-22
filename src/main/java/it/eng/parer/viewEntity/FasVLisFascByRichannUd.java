package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the FAS_V_LIS_FASC_BY_RICHANN_UD database table.
 */
@Entity
@Table(name = "FAS_V_LIS_FASC_BY_RICHANN_UD")
@NamedQuery(name = "FasVLisFascByRichannUd.findAll", query = "SELECT f FROM FasVLisFascByRichannUd f")
public class FasVLisFascByRichannUd implements Serializable {

    private static final long serialVersionUID = 1L;

    public FasVLisFascByRichannUd() {/* Hibernate */
    }

    private FasVLisFascByRichannUdId fasVLisFascByRichannUdId;

    @EmbeddedId()
    public FasVLisFascByRichannUdId getFasVLisFascByRichannUdId() {
        return fasVLisFascByRichannUdId;
    }

    public void setFasVLisFascByRichannUdId(FasVLisFascByRichannUdId fasVLisFascByRichannUdId) {
        this.fasVLisFascByRichannUdId = fasVLisFascByRichannUdId;
    }
}
