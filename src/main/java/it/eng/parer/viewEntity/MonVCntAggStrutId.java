package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntAggStrutId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.idStrut);
        hash = 79 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 79 * hash + Objects.hashCode(this.tiStatoVers);
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
        final MonVCntAggStrutId other = (MonVCntAggStrutId) obj;
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoVers, other.tiStatoVers)) {
            return false;
        }
        if (!Objects.equals(this.idStrut, other.idStrut)) {
            return false;
        }
        return true;
    }

    private BigDecimal idStrut;

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
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
