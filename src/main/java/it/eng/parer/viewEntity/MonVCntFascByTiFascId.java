package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntFascByTiFascId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.idTipoFascicolo);
        hash = 83 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 83 * hash + Objects.hashCode(this.tiStatoFasc);
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
        final MonVCntFascByTiFascId other = (MonVCntFascByTiFascId) obj;
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoFasc, other.tiStatoFasc)) {
            return false;
        }
        if (!Objects.equals(this.idTipoFascicolo, other.idTipoFascicolo)) {
            return false;
        }
        return true;
    }

    private BigDecimal idTipoFascicolo;

    @Column(name = "ID_TIPO_FASCICOLO")
    public BigDecimal getIdTipoFascicolo() {
        return idTipoFascicolo;
    }

    public void setIdTipoFascicolo(BigDecimal idTipoFascicolo) {
        this.idTipoFascicolo = idTipoFascicolo;
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
