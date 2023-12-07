package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class FasVLisUdInFascId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idFascicolo);
        hash = 37 * hash + Objects.hashCode(this.idUnitaDoc);
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
        final FasVLisUdInFascId other = (FasVLisUdInFascId) obj;
        if (!Objects.equals(this.idFascicolo, other.idFascicolo)) {
            return false;
        }
        if (!Objects.equals(this.idUnitaDoc, other.idUnitaDoc)) {
            return false;
        }
        return true;
    }

    private BigDecimal idFascicolo;

    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
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
