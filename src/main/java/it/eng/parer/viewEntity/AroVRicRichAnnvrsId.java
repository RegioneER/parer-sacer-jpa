package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class AroVRicRichAnnvrsId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idRichAnnulVers);
        hash = 53 * hash + Objects.hashCode(this.idUserIam);
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
        final AroVRicRichAnnvrsId other = (AroVRicRichAnnvrsId) obj;
        if (!Objects.equals(this.idRichAnnulVers, other.idRichAnnulVers)) {
            return false;
        }
        if (!Objects.equals(this.idUserIam, other.idUserIam)) {
            return false;
        }
        return true;
    }

    private BigDecimal idRichAnnulVers;

    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }

    private BigDecimal idUserIam;

    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }
}
