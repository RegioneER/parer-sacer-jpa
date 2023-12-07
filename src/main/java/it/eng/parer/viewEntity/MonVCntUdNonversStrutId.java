package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntUdNonversStrutId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.idStrut);
        hash = 43 * hash + Objects.hashCode(this.tiStatoUdNonvers);
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
        final MonVCntUdNonversStrutId other = (MonVCntUdNonversStrutId) obj;
        if (!Objects.equals(this.tiStatoUdNonvers, other.tiStatoUdNonvers)) {
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

    private String tiStatoUdNonvers;

    @Column(name = "TI_STATO_UD_NONVERS")
    public String getTiStatoUdNonvers() {
        return tiStatoUdNonvers;
    }

    public void setTiStatoUdNonvers(String tiStatoUdNonvers) {
        this.tiStatoUdNonvers = tiStatoUdNonvers;
    }
}
