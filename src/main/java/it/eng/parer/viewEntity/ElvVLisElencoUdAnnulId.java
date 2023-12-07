package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class ElvVLisElencoUdAnnulId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.idElencoVers);
        hash = 71 * hash + Objects.hashCode(this.idRichAnnulVers);
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
        final ElvVLisElencoUdAnnulId other = (ElvVLisElencoUdAnnulId) obj;
        if (!Objects.equals(this.idElencoVers, other.idElencoVers)) {
            return false;
        }
        if (!Objects.equals(this.idRichAnnulVers, other.idRichAnnulVers)) {
            return false;
        }
        return true;
    }

    private BigDecimal idElencoVers;

    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    private BigDecimal idRichAnnulVers;

    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }
}
