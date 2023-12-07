package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntUdAnnulAmbId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.idAmbiente);
        hash = 79 * hash + Objects.hashCode(this.idUserIam);
        hash = 79 * hash + Objects.hashCode(this.tiStatoAnnul);
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
        final MonVCntUdAnnulAmbId other = (MonVCntUdAnnulAmbId) obj;
        if (!Objects.equals(this.tiStatoAnnul, other.tiStatoAnnul)) {
            return false;
        }
        if (!Objects.equals(this.idAmbiente, other.idAmbiente)) {
            return false;
        }
        if (!Objects.equals(this.idUserIam, other.idUserIam)) {
            return false;
        }
        return true;
    }

    private BigDecimal idAmbiente;

    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    private BigDecimal idUserIam;

    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    private String tiStatoAnnul;

    @Column(name = "TI_STATO_ANNUL")
    public String getTiStatoAnnul() {
        return tiStatoAnnul;
    }

    public void setTiStatoAnnul(String tiStatoAnnul) {
        this.tiStatoAnnul = tiStatoAnnul;
    }
}
