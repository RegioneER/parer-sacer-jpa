package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class AroVSelUdSerFascByEnteId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.idUnitaDoc);
        hash = 31 * hash + Objects.hashCode(this.idSerie);
        hash = 31 * hash + Objects.hashCode(this.idFascicolo);
        hash = 31 * hash + Objects.hashCode(this.idRootstrut);
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
        final AroVSelUdSerFascByEnteId other = (AroVSelUdSerFascByEnteId) obj;
        if (!Objects.equals(this.idUnitaDoc, other.idUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.idSerie, other.idSerie)) {
            return false;
        }
        if (!Objects.equals(this.idFascicolo, other.idFascicolo)) {
            return false;
        }
        if (!Objects.equals(this.idRootstrut, other.idRootstrut)) {
            return false;
        }
        return true;
    }

    private BigDecimal idUnitaDoc;

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    private BigDecimal idSerie;

    @Column(name = "ID_SERIE")
    public BigDecimal getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(BigDecimal idSerie) {
        this.idSerie = idSerie;
    }

    private BigDecimal idFascicolo;

    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
    }

    private BigDecimal idRootstrut;

    @Column(name = "ID_ROOTSTRUT")
    public BigDecimal getIdRootstrut() {
        return idRootstrut;
    }

    public void setIdRootstrut(BigDecimal idRootstrut) {
        this.idRootstrut = idRootstrut;
    }
}
