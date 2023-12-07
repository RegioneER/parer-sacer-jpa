package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class ElvVSelFascVersId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idCriterioRaggrFasc);
        hash = 53 * hash + Objects.hashCode(this.idFascicolo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ElvVSelFascVersId other = (ElvVSelFascVersId) obj;
        if (!Objects.equals(this.idCriterioRaggrFasc, other.idCriterioRaggrFasc)) {
            return false;
        }
        if (!Objects.equals(this.idFascicolo, other.idFascicolo)) {
            return false;
        }
        return true;
    }

    private BigDecimal idCriterioRaggrFasc;

    @Column(name = "ID_CRITERIO_RAGGR_FASC")
    public BigDecimal getIdCriterioRaggrFasc() {
        return idCriterioRaggrFasc;
    }

    public void setIdCriterioRaggrFasc(BigDecimal idCriterioRaggrFasc) {
        this.idCriterioRaggrFasc = idCriterioRaggrFasc;
    }

    private BigDecimal idFascicolo;

    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
    }
}
