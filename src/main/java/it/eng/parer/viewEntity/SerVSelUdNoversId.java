package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author manuel.bertuzzi@eng.it
 */
@Embeddable
public class SerVSelUdNoversId implements Serializable {

    private BigDecimal idUnitaDocNonVers;
    private BigDecimal idVerSerie;

    @Column(name = "ID_UNITA_DOC_NON_VERS")
    public BigDecimal getIdUnitaDocNonVers() {
        return this.idUnitaDocNonVers;
    }

    public void setIdUnitaDocNonVers(BigDecimal idUnitaDocNonVers) {
        this.idUnitaDocNonVers = idUnitaDocNonVers;
    }

    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idUnitaDocNonVers);
        hash = 89 * hash + Objects.hashCode(this.idVerSerie);
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
        final SerVSelUdNoversId other = (SerVSelUdNoversId) obj;
        if (!Objects.equals(this.idUnitaDocNonVers, other.idUnitaDocNonVers)) {
            return false;
        }
        if (!Objects.equals(this.idVerSerie, other.idVerSerie)) {
            return false;
        }
        return true;
    }

}
