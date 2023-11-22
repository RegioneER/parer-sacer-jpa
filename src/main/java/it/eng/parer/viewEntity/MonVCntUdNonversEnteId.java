package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntUdNonversEnteId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idEnte);
        hash = 37 * hash + Objects.hashCode(this.idUserIam);
        hash = 37 * hash + Objects.hashCode(this.tiStatoUdNonvers);
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
        final MonVCntUdNonversEnteId other = (MonVCntUdNonversEnteId) obj;
        if (!Objects.equals(this.tiStatoUdNonvers, other.tiStatoUdNonvers)) {
            return false;
        }
        if (!Objects.equals(this.idEnte, other.idEnte)) {
            return false;
        }
        if (!Objects.equals(this.idUserIam, other.idUserIam)) {
            return false;
        }
        return true;
    }

    private BigDecimal idEnte;

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    private BigDecimal idUserIam;

    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    private String tiStatoUdNonvers;

    @Column(name = "TI_STATO_UD_NONVERS")
    public String getTiStatoUdNonvers() {
        return tiStatoUdNonvers;
    }

    public void setTiStatoUdNonvers(String tiStatoUdNonvers) {
        this.tiStatoUdNonvers = tiStatoUdNonvers;
    }
}
