package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class AroVLisLinkUnitaDocId implements Serializable {

    private BigDecimal idLinkUnitaDoc;

    @Column(name = "ID_LINK_UNITA_DOC")
    public BigDecimal getIdLinkUnitaDoc() {
        return idLinkUnitaDoc;
    }

    public void setIdLinkUnitaDoc(BigDecimal idLinkUnitaDoc) {
        this.idLinkUnitaDoc = idLinkUnitaDoc;
    }

    private BigDecimal idUnitaDoc;

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.idLinkUnitaDoc);
        hash = 71 * hash + Objects.hashCode(this.idUnitaDoc);
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
        final AroVLisLinkUnitaDocId other = (AroVLisLinkUnitaDocId) obj;
        if (!Objects.equals(this.idLinkUnitaDoc, other.idLinkUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.idUnitaDoc, other.idUnitaDoc)) {
            return false;
        }
        return true;
    }
}
