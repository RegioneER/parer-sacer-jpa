package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * The persistent class for the VRS_V_SESSIONE_VERS_RISOLTA database table.
 */
@Entity
@Table(name = "VRS_V_SESSIONE_VERS_RISOLTA")
public class VrsVSessioneVersRisolta implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal idStrut;

    public VrsVSessioneVersRisolta() {/* Hibernate */
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    private VrsVSessioneVersRisoltaId vrsVSessioneVersRisoltaId;

    @EmbeddedId()
    public VrsVSessioneVersRisoltaId getVrsVSessioneVersRisoltaId() {
        return vrsVSessioneVersRisoltaId;
    }

    public void setVrsVSessioneVersRisoltaId(VrsVSessioneVersRisoltaId vrsVSessioneVersRisoltaId) {
        this.vrsVSessioneVersRisoltaId = vrsVSessioneVersRisoltaId;
    }
}
