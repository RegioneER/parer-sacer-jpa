package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class ElvVSelUnitaDocVerId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.idCriterioRaggr);
        hash = 47 * hash + Objects.hashCode(this.idUnitaDoc);
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
        final ElvVSelUnitaDocVerId other = (ElvVSelUnitaDocVerId) obj;
        if (!Objects.equals(this.idCriterioRaggr, other.idCriterioRaggr)) {
            return false;
        }
        if (!Objects.equals(this.idUnitaDoc, other.idUnitaDoc)) {
            return false;
        }
        return true;
    }

    private BigDecimal idCriterioRaggr;

    @Column(name = "ID_CRITERIO_RAGGR")
    public BigDecimal getIdCriterioRaggr() {
        return idCriterioRaggr;
    }

    public void setIdCriterioRaggr(BigDecimal idCriterioRaggr) {
        this.idCriterioRaggr = idCriterioRaggr;
    }

    private BigDecimal idUnitaDoc;

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }
}
