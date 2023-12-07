package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class AroVLisVolNoValDocId implements Serializable {

    private BigDecimal idDoc;

    @Column(name = "ID_DOC")
    public BigDecimal getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(BigDecimal idDoc) {
        this.idDoc = idDoc;
    }

    private BigDecimal idVolumeConserv;

    @Column(name = "ID_VOLUME_CONSERV")
    public BigDecimal getIdVolumeConserv() {
        return idVolumeConserv;
    }

    public void setIdVolumeConserv(BigDecimal idVolumeConserv) {
        this.idVolumeConserv = idVolumeConserv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.idDoc);
        hash = 59 * hash + Objects.hashCode(this.idVolumeConserv);
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
        final AroVLisVolNoValDocId other = (AroVLisVolNoValDocId) obj;
        if (!Objects.equals(this.idDoc, other.idDoc)) {
            return false;
        }
        if (!Objects.equals(this.idVolumeConserv, other.idVolumeConserv)) {
            return false;
        }
        return true;
    }
}
