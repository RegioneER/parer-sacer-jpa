package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntDocStrutB30Id implements Serializable {

    private BigDecimal idStrut;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.idStrut);
        hash = 17 * hash + Objects.hashCode(this.tiStatoDoc);
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
        final MonVCntDocStrutB30Id other = (MonVCntDocStrutB30Id) obj;
        if (!Objects.equals(this.tiStatoDoc, other.tiStatoDoc)) {
            return false;
        }
        if (!Objects.equals(this.idStrut, other.idStrut)) {
            return false;
        }
        return true;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    private String tiStatoDoc;

    @Column(name = "TI_STATO_DOC")
    public String getTiStatoDoc() {
        return tiStatoDoc;
    }

    public void setTiStatoDoc(String tiStatoDoc) {
        this.tiStatoDoc = tiStatoDoc;
    }
}
