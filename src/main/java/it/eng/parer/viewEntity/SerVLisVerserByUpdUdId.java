package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class SerVLisVerserByUpdUdId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idUnitaDoc);
        hash = 97 * hash + Objects.hashCode(this.idVerSerie);
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
        final SerVLisVerserByUpdUdId other = (SerVLisVerserByUpdUdId) obj;
        if (!Objects.equals(this.idUnitaDoc, other.idUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.idVerSerie, other.idVerSerie)) {
            return false;
        }
        return true;
    }

    private BigDecimal idUnitaDoc;

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    private BigDecimal idVerSerie;

    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }
}
