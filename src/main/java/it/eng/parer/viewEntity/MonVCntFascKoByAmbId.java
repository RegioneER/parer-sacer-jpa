package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntFascKoByAmbId implements Serializable {

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

    private String tiStatoFascKo;

    @Column(name = "TI_STATO_FASC_KO")
    public String getTiStatoFascKo() {
        return tiStatoFascKo;
    }

    public void setTiStatoFascKo(String tiStatoFascKo) {
        this.tiStatoFascKo = tiStatoFascKo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.idAmbiente);
        hash = 37 * hash + Objects.hashCode(this.idUserIam);
        hash = 37 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 37 * hash + Objects.hashCode(this.tiStatoFascKo);
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
        final MonVCntFascKoByAmbId other = (MonVCntFascKoByAmbId) obj;
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoFascKo, other.tiStatoFascKo)) {
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

}
