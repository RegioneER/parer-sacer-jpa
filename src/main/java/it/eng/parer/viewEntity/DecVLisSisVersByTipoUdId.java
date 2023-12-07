package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author manuel.bertuzzi@eng.it
 */
@Embeddable
public class DecVLisSisVersByTipoUdId implements Serializable {

    private BigDecimal idSistemaVersante;
    private BigDecimal idTipoUnitaDoc;

    @Column(name = "ID_SISTEMA_VERSANTE")
    public BigDecimal getIdSistemaVersante() {
        return this.idSistemaVersante;
    }

    public void setIdSistemaVersante(BigDecimal idSistemaVersante) {
        this.idSistemaVersante = idSistemaVersante;
    }

    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return this.idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idSistemaVersante);
        hash = 71 * hash + Objects.hashCode(this.idTipoUnitaDoc);
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
        final DecVLisSisVersByTipoUdId other = (DecVLisSisVersByTipoUdId) obj;
        if (!Objects.equals(this.idSistemaVersante, other.idSistemaVersante)) {
            return false;
        }
        if (!Objects.equals(this.idTipoUnitaDoc, other.idTipoUnitaDoc)) {
            return false;
        }
        return true;
    }

}
