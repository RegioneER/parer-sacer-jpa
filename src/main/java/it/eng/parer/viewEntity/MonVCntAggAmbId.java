package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntAggAmbId implements Serializable {

    private BigDecimal idAmbiente;

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.idAmbiente);
        hash = 67 * hash + Objects.hashCode(this.idUserIam);
        hash = 67 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 67 * hash + Objects.hashCode(this.tiStatoVers);
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
        final MonVCntAggAmbId other = (MonVCntAggAmbId) obj;
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
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

    private String tiDtCreazione;

    @Column(name = "TI_DT_CREAZIONE", columnDefinition = "char")
    public String getTiDtCreazione() {
        return tiDtCreazione;
    }

    public void setTiDtCreazione(String tiDtCreazione) {
        this.tiDtCreazione = tiDtCreazione;
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
