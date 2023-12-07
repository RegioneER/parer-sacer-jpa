package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author manuel.bertuzzi@eng.it
 */
@Embeddable
public class MonVCntUdEnteId implements Serializable {

    private BigDecimal idEnte;
    private BigDecimal idUserIam;
    private String tiDtCreazione;
    private String tiStatoUd;

    @Column(name = "TI_DT_CREAZIONE", columnDefinition = "char")
    public String getTiDtCreazione() {
        return this.tiDtCreazione;
    }

    public void setTiDtCreazione(String tiDtCreazione) {
        this.tiDtCreazione = tiDtCreazione;
    }

    @Column(name = "TI_STATO_UD")
    public String getTiStatoUd() {
        return this.tiStatoUd;
    }

    public void setTiStatoUd(String tiStatoUd) {
        this.tiStatoUd = tiStatoUd;
    }

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idEnte);
        hash = 97 * hash + Objects.hashCode(this.idUserIam);
        hash = 97 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 97 * hash + Objects.hashCode(this.tiStatoUd);
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
        final MonVCntUdEnteId other = (MonVCntUdEnteId) obj;
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoUd, other.tiStatoUd)) {
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
