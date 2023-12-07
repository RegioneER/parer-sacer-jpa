package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVCntUdTipoUdB30Id implements Serializable {

    private BigDecimal idStrut;

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    private BigDecimal idTipoUnitaDoc;

    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }

    private String tiStatoUd;

    @Column(name = "TI_STATO_UD")
    public String getTiStatoUd() {
        return tiStatoUd;
    }

    public void setTiStatoUd(String tiStatoUd) {
        this.tiStatoUd = tiStatoUd;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.idStrut);
        hash = 29 * hash + Objects.hashCode(this.idTipoUnitaDoc);
        hash = 29 * hash + Objects.hashCode(this.tiStatoUd);
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
        final MonVCntUdTipoUdB30Id other = (MonVCntUdTipoUdB30Id) obj;
        if (!Objects.equals(this.tiStatoUd, other.tiStatoUd)) {
            return false;
        }
        if (!Objects.equals(this.idStrut, other.idStrut)) {
            return false;
        }
        if (!Objects.equals(this.idTipoUnitaDoc, other.idTipoUnitaDoc)) {
            return false;
        }
        return true;
    }
}
