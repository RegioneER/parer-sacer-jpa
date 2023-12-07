package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntFascByAmbId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idAmbiente);
        hash = 47 * hash + Objects.hashCode(this.idUserIam);
        hash = 47 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 47 * hash + Objects.hashCode(this.tiStatoFasc);
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
        final MonVCntFascByAmbId other = (MonVCntFascByAmbId) obj;
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoFasc, other.tiStatoFasc)) {
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

    private String tiDtCreazione;

    @Column(name = "TI_DT_CREAZIONE")
    public String getTiDtCreazione() {
        return tiDtCreazione;
    }

    public void setTiDtCreazione(String tiDtCreazione) {
        this.tiDtCreazione = tiDtCreazione;
    }

    private String tiStatoFasc;

    @Column(name = "TI_STATO_FASC")
    public String getTiStatoFasc() {
        return tiStatoFasc;
    }

    public void setTiStatoFasc(String tiStatoFasc) {
        this.tiStatoFasc = tiStatoFasc;
    }
}
