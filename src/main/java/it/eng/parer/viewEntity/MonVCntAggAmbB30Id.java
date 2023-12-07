package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntAggAmbB30Id implements Serializable {

    private BigDecimal idAmbiente;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idAmbiente);
        hash = 71 * hash + Objects.hashCode(this.idUserIam);
        hash = 71 * hash + Objects.hashCode(this.tiStatoVers);
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
        final MonVCntAggAmbB30Id other = (MonVCntAggAmbB30Id) obj;
        if (!Objects.equals(this.tiStatoVers, other.tiStatoVers)) {
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

    private String tiStatoVers;

    @Column(name = "TI_STATO_VERS")
    public String getTiStatoVers() {
        return tiStatoVers;
    }

    public void setTiStatoVers(String tiStatoVers) {
        this.tiStatoVers = tiStatoVers;
    }
}
