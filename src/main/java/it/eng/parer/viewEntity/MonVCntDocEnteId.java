/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author mbertuzzi
 */
@Embeddable
public class MonVCntDocEnteId implements Serializable {

    private BigDecimal idEnte;
    private BigDecimal idUserIam;
    private String tiDtCreazione;
    private String tiStatoDoc;

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "TI_DT_CREAZIONE", columnDefinition = "char")
    public String getTiDtCreazione() {
        return this.tiDtCreazione;
    }

    public void setTiDtCreazione(String tiDtCreazione) {
        this.tiDtCreazione = tiDtCreazione;
    }

    @Column(name = "TI_STATO_DOC")
    public String getTiStatoDoc() {
        return this.tiStatoDoc;
    }

    public void setTiStatoDoc(String tiStatoDoc) {
        this.tiStatoDoc = tiStatoDoc;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.idEnte);
        hash = 67 * hash + Objects.hashCode(this.idUserIam);
        hash = 67 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 67 * hash + Objects.hashCode(this.tiStatoDoc);
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
        final MonVCntDocEnteId other = (MonVCntDocEnteId) obj;
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoDoc, other.tiStatoDoc)) {
            return false;
        }
        if (!Objects.equals(this.idEnte, other.idEnte)) {
            return false;
        }
        if (!Objects.equals(this.idUserIam, other.idUserIam)) {
            return false;
        }
        return true;
    }

}
