package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntDocNonversEnteId implements Serializable {

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

    private String tiStatoDocNonvers;

    @Column(name = "TI_STATO_DOC_NONVERS")
    public String getTiStatoDocNonvers() {
        return tiStatoDocNonvers;
    }

    public void setTiStatoDocNonvers(String tiStatoDocNonvers) {
        this.tiStatoDocNonvers = tiStatoDocNonvers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idEnte);
        hash = 47 * hash + Objects.hashCode(this.idUserIam);
        hash = 47 * hash + Objects.hashCode(this.tiStatoDocNonvers);
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
        final MonVCntDocNonversEnteId other = (MonVCntDocNonversEnteId) obj;
        if (!Objects.equals(this.tiStatoDocNonvers, other.tiStatoDocNonvers)) {
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

}
