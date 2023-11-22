package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntUdAnnulStrutId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.idStrut);
        hash = 29 * hash + Objects.hashCode(this.tiStatoAnnul);
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
        final MonVCntUdAnnulStrutId other = (MonVCntUdAnnulStrutId) obj;
        if (!Objects.equals(this.tiStatoAnnul, other.tiStatoAnnul)) {
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

    private String tiStatoAnnul;

    @Column(name = "TI_STATO_ANNUL")
    public String getTiStatoAnnul() {
        return tiStatoAnnul;
    }

    public void setTiStatoAnnul(String tiStatoAnnul) {
        this.tiStatoAnnul = tiStatoAnnul;
    }
}
