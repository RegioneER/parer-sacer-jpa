package it.eng.parer.grantedViewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ORG_V_RIC_ENTE_CONVENZ_BY_ESTERNO database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.ORG_V_RIC_ENTE_CONVENZ_BY_EST")
@NamedQuery(name = "OrgVRicEnteConvenzByEsterno.findAll", query = "SELECT o FROM OrgVRicEnteConvenzByEsterno o")
public class OrgVRicEnteConvenzByEsterno implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date dtCessazione;
    private Date dtDecAccordo;
    private Date dtIniVal;
    private Date dtScadAccordo;
    private Date dtFineValidAccordo;
    private String enteAttivo;
    private String flInCorsoConvenz;
    private String flNonConvenz;
    private String flRecesso;
    private BigDecimal idAmbienteEnteConvenz;
    private BigDecimal idAmbitoTerrit;
    private BigDecimal idCategEnte;
    private BigDecimal idEnteConserv;
    private BigDecimal idEnteConvenz;
    private BigDecimal idEnteGestore;
    private BigDecimal idUserIamCor;
    private String nmEnteConvenz;
    private String tiEnteConvenz;

    public OrgVRicEnteConvenzByEsterno() {
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_CESSAZIONE")
    public Date getDtCessazione() {
        return this.dtCessazione;
    }

    public void setDtCessazione(Date dtCessazione) {
        this.dtCessazione = dtCessazione;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_DEC_ACCORDO")
    public Date getDtDecAccordo() {
        return this.dtDecAccordo;
    }

    public void setDtDecAccordo(Date dtDecAccordo) {
        this.dtDecAccordo = dtDecAccordo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_INI_VAL")
    public Date getDtIniVal() {
        return this.dtIniVal;
    }

    public void setDtIniVal(Date dtIniVal) {
        this.dtIniVal = dtIniVal;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_SCAD_ACCORDO")
    public Date getDtScadAccordo() {
        return this.dtScadAccordo;
    }

    public void setDtScadAccordo(Date dtScadAccordo) {
        this.dtScadAccordo = dtScadAccordo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_FINE_VALID_ACCORDO")
    public Date getDtFineValidAccordo() {
        return this.dtFineValidAccordo;
    }

    public void setDtFineValidAccordo(Date dtFineValidAccordo) {
        this.dtFineValidAccordo = dtFineValidAccordo;
    }

    @Column(name = "ENTE_ATTIVO")
    public String getEnteAttivo() {
        return this.enteAttivo;
    }

    public void setEnteAttivo(String enteAttivo) {
        this.enteAttivo = enteAttivo;
    }

    @Column(name = "FL_IN_CORSO_CONVENZ")
    public String getFlInCorsoConvenz() {
        return this.flInCorsoConvenz;
    }

    public void setFlInCorsoConvenz(String flInCorsoConvenz) {
        this.flInCorsoConvenz = flInCorsoConvenz;
    }

    @Column(name = "FL_NON_CONVENZ")
    public String getFlNonConvenz() {
        return this.flNonConvenz;
    }

    public void setFlNonConvenz(String flNonConvenz) {
        this.flNonConvenz = flNonConvenz;
    }

    @Column(name = "FL_RECESSO")
    public String getFlRecesso() {
        return this.flRecesso;
    }

    public void setFlRecesso(String flRecesso) {
        this.flRecesso = flRecesso;
    }

    @Column(name = "ID_AMBIENTE_ENTE_CONVENZ")
    public BigDecimal getIdAmbienteEnteConvenz() {
        return this.idAmbienteEnteConvenz;
    }

    public void setIdAmbienteEnteConvenz(BigDecimal idAmbienteEnteConvenz) {
        this.idAmbienteEnteConvenz = idAmbienteEnteConvenz;
    }

    @Column(name = "ID_AMBITO_TERRIT")
    public BigDecimal getIdAmbitoTerrit() {
        return this.idAmbitoTerrit;
    }

    public void setIdAmbitoTerrit(BigDecimal idAmbitoTerrit) {
        this.idAmbitoTerrit = idAmbitoTerrit;
    }

    @Column(name = "ID_CATEG_ENTE")
    public BigDecimal getIdCategEnte() {
        return this.idCategEnte;
    }

    public void setIdCategEnte(BigDecimal idCategEnte) {
        this.idCategEnte = idCategEnte;
    }

    @Column(name = "ID_ENTE_CONSERV")
    public BigDecimal getIdEnteConserv() {
        return this.idEnteConserv;
    }

    public void setIdEnteConserv(BigDecimal idEnteConserv) {
        this.idEnteConserv = idEnteConserv;
    }

    @Id
    @Column(name = "ID_ENTE_CONVENZ")
    public BigDecimal getIdEnteConvenz() {
        return this.idEnteConvenz;
    }

    public void setIdEnteConvenz(BigDecimal idEnteConvenz) {
        this.idEnteConvenz = idEnteConvenz;
    }

    @Column(name = "ID_ENTE_GESTORE")
    public BigDecimal getIdEnteGestore() {
        return this.idEnteGestore;
    }

    public void setIdEnteGestore(BigDecimal idEnteGestore) {
        this.idEnteGestore = idEnteGestore;
    }

    @Column(name = "ID_USER_IAM_COR")
    public BigDecimal getIdUserIamCor() {
        return this.idUserIamCor;
    }

    public void setIdUserIamCor(BigDecimal idUserIamCor) {
        this.idUserIamCor = idUserIamCor;
    }

    @Column(name = "NM_ENTE_CONVENZ")
    public String getNmEnteConvenz() {
        return this.nmEnteConvenz;
    }

    public void setNmEnteConvenz(String nmEnteConvenz) {
        this.nmEnteConvenz = nmEnteConvenz;
    }

    @Column(name = "TI_ENTE_CONVENZ")
    public String getTiEnteConvenz() {
        return this.tiEnteConvenz;
    }

    public void setTiEnteConvenz(String tiEnteConvenz) {
        this.tiEnteConvenz = tiEnteConvenz;
    }
}
