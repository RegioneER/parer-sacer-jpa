package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the VRS_V_SESSIONE_AGG_RISOLTA database table.
 */
@Entity
@Table(name = "VRS_V_SESSIONE_AGG_RISOLTA")
public class VrsVSessioneAggRisolta implements Serializable {

    private static final long serialVersionUID = 1L;

    public VrsVSessioneAggRisolta() {/* Hibernate */
    }

    private VrsVSessioneAggRisoltaId vrsVSessioneAggRisoltaId;

    @EmbeddedId()
    public VrsVSessioneAggRisoltaId getVrsVSessioneAggRisoltaId() {
        return vrsVSessioneAggRisoltaId;
    }

    public void setVrsVSessioneAggRisoltaId(VrsVSessioneAggRisoltaId vrsVSessioneAggRisoltaId) {
        this.vrsVSessioneAggRisoltaId = vrsVSessioneAggRisoltaId;
    }
}
