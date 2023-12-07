package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class ElvVCreaLisFascElencoId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + Objects.hashCode(this.idElencoVersFasc);
        hash = 13 * hash + Objects.hashCode(this.idFascicolo);
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
        final ElvVCreaLisFascElencoId other = (ElvVCreaLisFascElencoId) obj;
        if (!Objects.equals(this.idElencoVersFasc, other.idElencoVersFasc)) {
            return false;
        }
        if (!Objects.equals(this.idFascicolo, other.idFascicolo)) {
            return false;
        }
        return true;
    }

    private BigDecimal idElencoVersFasc;

    @Column(name = "ID_ELENCO_VERS_FASC")
    public BigDecimal getIdElencoVersFasc() {
        return idElencoVersFasc;
    }

    public void setIdElencoVersFasc(BigDecimal idElencoVersFasc) {
        this.idElencoVersFasc = idElencoVersFasc;
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
