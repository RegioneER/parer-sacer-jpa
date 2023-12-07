package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntUdStrutB30Id implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.idStrut);
        hash = 47 * hash + Objects.hashCode(this.tiStatoUd);
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
        final MonVCntUdStrutB30Id other = (MonVCntUdStrutB30Id) obj;
        if (!Objects.equals(this.tiStatoUd, other.tiStatoUd)) {
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

    private String tiStatoUd;

    @Column(name = "TI_STATO_UD")
    public String getTiStatoUd() {
        return tiStatoUd;
    }

    public void setTiStatoUd(String tiStatoUd) {
        this.tiStatoUd = tiStatoUd;
    }
}
