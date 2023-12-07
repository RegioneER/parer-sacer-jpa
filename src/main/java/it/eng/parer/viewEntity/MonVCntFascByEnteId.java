package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntFascByEnteId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.idEnte);
        hash = 79 * hash + Objects.hashCode(this.idUserIam);
        hash = 79 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 79 * hash + Objects.hashCode(this.tiStatoFasc);
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
        final MonVCntFascByEnteId other = (MonVCntFascByEnteId) obj;
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoFasc, other.tiStatoFasc)) {
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
