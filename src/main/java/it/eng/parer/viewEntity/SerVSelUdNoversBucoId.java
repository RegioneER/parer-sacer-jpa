package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class SerVSelUdNoversBucoId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.idUnitaDocNonVers);
        hash = 53 * hash + Objects.hashCode(this.idVerSerie);
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
        final SerVSelUdNoversBucoId other = (SerVSelUdNoversBucoId) obj;
        if (!Objects.equals(this.idUnitaDocNonVers, other.idUnitaDocNonVers)) {
            return false;
        }
        if (!Objects.equals(this.idVerSerie, other.idVerSerie)) {
            return false;
        }
        return true;
    }

    private BigDecimal idUnitaDocNonVers;

    @Column(name = "ID_UNITA_DOC_NON_VERS")
    public BigDecimal getIdUnitaDocNonVers() {
        return idUnitaDocNonVers;
    }

    public void setIdUnitaDocNonVers(BigDecimal idUnitaDocNonVers) {
        this.idUnitaDocNonVers = idUnitaDocNonVers;
    }

    private BigDecimal idVerSerie;

    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }
}
