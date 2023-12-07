package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class VrsVSessioneAggRisoltaId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.dtChiusura);
        hash = 89 * hash + Objects.hashCode(this.flSesNonRisolub);
        hash = 89 * hash + Objects.hashCode(this.flSesRisolta);
        hash = 89 * hash + Objects.hashCode(this.flVerif);
        hash = 89 * hash + Objects.hashCode(this.idStrut);
        hash = 89 * hash + Objects.hashCode(this.tiDtCreazione);
        hash = 89 * hash + Objects.hashCode(this.tiSessioneVers);
        hash = 89 * hash + Objects.hashCode(this.tiStatoSessioneVers);
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
        final VrsVSessioneAggRisoltaId other = (VrsVSessioneAggRisoltaId) obj;
        if (!Objects.equals(this.flSesNonRisolub, other.flSesNonRisolub)) {
            return false;
        }
        if (!Objects.equals(this.flSesRisolta, other.flSesRisolta)) {
            return false;
        }
        if (!Objects.equals(this.flVerif, other.flVerif)) {
            return false;
        }
        if (!Objects.equals(this.tiDtCreazione, other.tiDtCreazione)) {
            return false;
        }
        if (!Objects.equals(this.tiSessioneVers, other.tiSessioneVers)) {
            return false;
        }
        if (!Objects.equals(this.tiStatoSessioneVers, other.tiStatoSessioneVers)) {
            return false;
        }
        if (!Objects.equals(this.dtChiusura, other.dtChiusura)) {
            return false;
        }
        if (!Objects.equals(this.idStrut, other.idStrut)) {
            return false;
        }
        return true;
    }

    private Date dtChiusura;

    @Column(name = "DT_CHIUSURA")
    public Date getDtChiusura() {
        return dtChiusura;
    }

    public void setDtChiusura(Date dtChiusura) {
        this.dtChiusura = dtChiusura;
    }

    private String flSesNonRisolub;

    @Column(name = "FL_SES_NON_RISOLUB", columnDefinition = "char(1)")
    public String getFlSesNonRisolub() {
        return flSesNonRisolub;
    }

    public void setFlSesNonRisolub(String flSesNonRisolub) {
        this.flSesNonRisolub = flSesNonRisolub;
    }

    private String flSesRisolta;

    @Column(name = "FL_SES_RISOLTA", columnDefinition = "char(1)")
    public String getFlSesRisolta() {
        return flSesRisolta;
    }

    public void setFlSesRisolta(String flSesRisolta) {
        this.flSesRisolta = flSesRisolta;
    }

    private String flVerif;

    @Column(name = "FL_VERIF", columnDefinition = "char(1)")
    public String getFlVerif() {
        return flVerif;
    }

    public void setFlVerif(String flVerif) {
        this.flVerif = flVerif;
    }

    private BigDecimal idStrut;

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    private String tiDtCreazione;

    @Column(name = "TI_DT_CREAZIONE")
    public String getTiDtCreazione() {
        return tiDtCreazione;
    }

    public void setTiDtCreazione(String tiDtCreazione) {
        this.tiDtCreazione = tiDtCreazione;
    }

    private String tiSessioneVers;

    @Column(name = "TI_SESSIONE_VERS")
    public String getTiSessioneVers() {
        return tiSessioneVers;
    }

    public void setTiSessioneVers(String tiSessioneVers) {
        this.tiSessioneVers = tiSessioneVers;
    }

    private String tiStatoSessioneVers;

    @Column(name = "TI_STATO_SESSIONE_VERS")
    public String getTiStatoSessioneVers() {
        return tiStatoSessioneVers;
    }

    public void setTiStatoSessioneVers(String tiStatoSessioneVers) {
        this.tiStatoSessioneVers = tiStatoSessioneVers;
    }
}
