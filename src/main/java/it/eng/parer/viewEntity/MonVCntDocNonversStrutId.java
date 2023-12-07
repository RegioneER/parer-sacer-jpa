package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntDocNonversStrutId implements Serializable {

    private BigDecimal idStrut;

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    private String tiStatoDocNonvers;

    @Column(name = "TI_STATO_DOC_NONVERS")
    public String getTiStatoDocNonvers() {
        return tiStatoDocNonvers;
    }

    public void setTiStatoDocNonvers(String tiStatoDocNonvers) {
        this.tiStatoDocNonvers = tiStatoDocNonvers;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idStrut);
        hash = 97 * hash + Objects.hashCode(this.tiStatoDocNonvers);
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
        final MonVCntDocNonversStrutId other = (MonVCntDocNonversStrutId) obj;
        if (!Objects.equals(this.tiStatoDocNonvers, other.tiStatoDocNonvers)) {
            return false;
        }
        if (!Objects.equals(this.idStrut, other.idStrut)) {
            return false;
        }
        return true;
    }
}
