package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the VRS_V_SESSIONE_VERS_RISOLTA database table.
 *
 */
@Entity
@Table(name = "VRS_V_SESSIONE_VERS_RISOLTA")
public class VrsVSessioneVersRisolta implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date dtChiusura;
    private String flSesNonRisolub;
    private String flSesRisolta;
    private String flVerif;
    private BigDecimal idStrut;
    private String tiDtCreazione;
    private String tiSessioneVers;
    private String tiStatoSessioneVers;

    public VrsVSessioneVersRisolta() {
    }

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CHIUSURA")
    public Date getDtChiusura() {
        return this.dtChiusura;
    }

    public void setDtChiusura(Date dtChiusura) {
        this.dtChiusura = dtChiusura;
    }

    @Id
    @Column(name = "FL_SES_NON_RISOLUB")
    public String getFlSesNonRisolub() {
        return this.flSesNonRisolub;
    }

    public void setFlSesNonRisolub(String flSesNonRisolub) {
        this.flSesNonRisolub = flSesNonRisolub;
    }

    @Id
    @Column(name = "FL_SES_RISOLTA")
    public String getFlSesRisolta() {
        return this.flSesRisolta;
    }

    public void setFlSesRisolta(String flSesRisolta) {
        this.flSesRisolta = flSesRisolta;
    }

    @Id
    @Column(name = "FL_VERIF")
    public String getFlVerif() {
        return this.flVerif;
    }

    public void setFlVerif(String flVerif) {
        this.flVerif = flVerif;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Id
    @Column(name = "TI_DT_CREAZIONE")
    public String getTiDtCreazione() {
        return this.tiDtCreazione;
    }

    public void setTiDtCreazione(String tiDtCreazione) {
        this.tiDtCreazione = tiDtCreazione;
    }

    @Id
    @Column(name = "TI_SESSIONE_VERS")
    public String getTiSessioneVers() {
        return this.tiSessioneVers;
    }

    public void setTiSessioneVers(String tiSessioneVers) {
        this.tiSessioneVers = tiSessioneVers;
    }

    @Id
    @Column(name = "TI_STATO_SESSIONE_VERS")
    public String getTiStatoSessioneVers() {
        return this.tiStatoSessioneVers;
    }

    public void setTiStatoSessioneVers(String tiStatoSessioneVers) {
        this.tiStatoSessioneVers = tiStatoSessioneVers;
    }
}