/*
 * Engineering Ingegneria Informatica S.p.A.
 *
 * Copyright (C) 2023 Regione Emilia-Romagna
 * <p/>
 * This program is free software: you can redistribute it and/or modify it under the terms of
 * the GNU Affero General Public License as published by the Free Software Foundation,
 * either version 3 of the License, or (at your option) any later version.
 * <p/>
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Affero General Public License for more details.
 * <p/>
 * You should have received a copy of the GNU Affero General Public License along with this program.
 * If not, see <https://www.gnu.org/licenses/>.
 */

package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class ElvVSelUdDocUpdByCritId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.idCriterioRaggr);
        hash = 89 * hash + Objects.hashCode(this.idUnitaDoc);
        hash = 89 * hash + Objects.hashCode(this.idDoc);
        hash = 89 * hash + Objects.hashCode(this.idUpdUnitaDoc);
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
        final ElvVSelUdDocUpdByCritId other = (ElvVSelUdDocUpdByCritId) obj;
        if (!Objects.equals(this.idCriterioRaggr, other.idCriterioRaggr)) {
            return false;
        }
        if (!Objects.equals(this.idUnitaDoc, other.idUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.idDoc, other.idDoc)) {
            return false;
        }
        if (!Objects.equals(this.idUpdUnitaDoc, other.idUpdUnitaDoc)) {
            return false;
        }
        return true;
    }

    private BigDecimal idCriterioRaggr;

    @Column(name = "ID_CRITERIO_RAGGR")
    public BigDecimal getIdCriterioRaggr() {
        return idCriterioRaggr;
    }

    public void setIdCriterioRaggr(BigDecimal idCriterioRaggr) {
        this.idCriterioRaggr = idCriterioRaggr;
    }

    private BigDecimal idUnitaDoc;

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    private BigDecimal idDoc;

    @Column(name = "ID_DOC")
    public BigDecimal getIdDoc() {
        return idDoc;
    }

    public void setIdDoc(BigDecimal idDoc) {
        this.idDoc = idDoc;
    }

    private BigDecimal idUpdUnitaDoc;

    @Column(name = "ID_UPD_UNITA_DOC")
    public BigDecimal getIdUpdUnitaDoc() {
        return idUpdUnitaDoc;
    }

    public void setIdUpdUnitaDoc(BigDecimal idUpdUnitaDoc) {
        this.idUpdUnitaDoc = idUpdUnitaDoc;
    }
}
