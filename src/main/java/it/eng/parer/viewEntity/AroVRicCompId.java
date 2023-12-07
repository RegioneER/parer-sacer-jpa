package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class AroVRicCompId implements Serializable {

    private BigDecimal idCompDoc;

    @Column(name = "ID_COMP_DOC")
    public BigDecimal getIdCompDoc() {
        return idCompDoc;
    }

    public void setIdCompDoc(BigDecimal idCompDoc) {
        this.idCompDoc = idCompDoc;
    }

    private BigDecimal idFirmaComp;

    @Column(name = "ID_FIRMA_COMP")
    public BigDecimal getIdFirmaComp() {
        return idFirmaComp;
    }

    public void setIdFirmaComp(BigDecimal idFirmaComp) {
        this.idFirmaComp = idFirmaComp;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.idCompDoc);
        hash = 97 * hash + Objects.hashCode(this.idFirmaComp);
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
        final AroVRicCompId other = (AroVRicCompId) obj;
        if (!Objects.equals(this.idCompDoc, other.idCompDoc)) {
            return false;
        }
        if (!Objects.equals(this.idFirmaComp, other.idFirmaComp)) {
            return false;
        }
        return true;
    }
}
