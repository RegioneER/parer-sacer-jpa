package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class DecVCalcTiServOnTipoUdId implements Serializable {

    private BigDecimal idCategTipoUnitaDoc;

    @Column(name = "ID_CATEG_TIPO_UNITA_DOC")
    public BigDecimal getIdCategTipoUnitaDoc() {
        return idCategTipoUnitaDoc;
    }

    public void setIdCategTipoUnitaDoc(BigDecimal idCategTipoUnitaDoc) {
        this.idCategTipoUnitaDoc = idCategTipoUnitaDoc;
    }

    private BigDecimal idStrut;

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.idCategTipoUnitaDoc);
        hash = 53 * hash + Objects.hashCode(this.idStrut);
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
        final DecVCalcTiServOnTipoUdId other = (DecVCalcTiServOnTipoUdId) obj;
        if (!Objects.equals(this.idCategTipoUnitaDoc, other.idCategTipoUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.idStrut, other.idStrut)) {
            return false;
        }
        return true;
    }

}
