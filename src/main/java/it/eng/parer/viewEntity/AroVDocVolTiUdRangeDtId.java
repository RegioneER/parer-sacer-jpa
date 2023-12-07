package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class AroVDocVolTiUdRangeDtId implements Serializable {

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

    private String tiDoc;

    @Column(name = "TI_DOC")
    public String getTiDoc() {
        return tiDoc;
    }

    public void setTiDoc(String tiDoc) {
        this.tiDoc = tiDoc;
    }

    private String tiDtCreazione;

    @Column(name = "TI_DT_CREAZIONE")
    public String getTiDtCreazione() {
        return tiDtCreazione;
    }

    public void setTiDtCreazione(String tiDtCreazione) {
        this.tiDtCreazione = tiDtCreazione;
    }

    private String tiStatoDoc;

    @Column(name = "TI_STATO_DOC")
    public String getTiStatoDoc() {
        return tiStatoDoc;
    }

    public void setTiStatoDoc(String tiStatoDoc) {
        this.tiStatoDoc = tiStatoDoc;
    }

    private String tiStatoVolumeConserv;

    @Column(name = "TI_STATO_VOLUME_CONSERV")
    public String getTiStatoVolumeConserv() {
        return tiStatoVolumeConserv;
    }

    public void setTiStatoVolumeConserv(String tiStatoVolumeConserv) {
        this.tiStatoVolumeConserv = tiStatoVolumeConserv;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.idStrut);
        hash = 89 * hash + Objects.hashCode(this.idTipoUnitaDoc);
        hash = 89 * hash + Objects.hashCode(this.tiDoc);
        hash = 89 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 89 * hash + Objects.hashCode(this.tiStatoDoc);
        hash = 89 * hash + Objects.hashCode(this.tiStatoVolumeConserv);
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
        final AroVDocVolTiUdRangeDtId other = (AroVDocVolTiUdRangeDtId) obj;
        if (!Objects.equals(this.tiDoc, other.tiDoc)) {
            return false;
        }
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoDoc, other.tiStatoDoc)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoVolumeConserv, other.tiStatoVolumeConserv)) {
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
