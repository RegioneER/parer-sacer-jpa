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
public class DecVTreeTitolId implements Serializable {

    private BigDecimal idValVoceTitol;
    private BigDecimal idVoceTitol;

    @Column(name = "ID_VAL_VOCE_TITOL")
    public BigDecimal getIdValVoceTitol() {
        return this.idValVoceTitol;
    }

    public void setIdValVoceTitol(BigDecimal idValVoceTitol) {
        this.idValVoceTitol = idValVoceTitol;
    }

    @Column(name = "ID_VOCE_TITOL")
    public BigDecimal getIdVoceTitol() {
        return this.idVoceTitol;
    }

    public void setIdVoceTitol(BigDecimal idVoceTitol) {
        this.idVoceTitol = idVoceTitol;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.idValVoceTitol);
        hash = 29 * hash + Objects.hashCode(this.idVoceTitol);
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
        final DecVTreeTitolId other = (DecVTreeTitolId) obj;
        if (!Objects.equals(this.idValVoceTitol, other.idValVoceTitol)) {
            return false;
        }
        if (!Objects.equals(this.idVoceTitol, other.idVoceTitol)) {
            return false;
        }
        return true;
    }

}
