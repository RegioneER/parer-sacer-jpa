package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_LIS_DOC database table.
 *
 */
@Entity
@Table(name = "ARO_V_LIS_DOC")
@NamedQuery(name = "AroVLisDoc.findAll", query = "SELECT a FROM AroVLisDoc a")
public class AroVLisDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdKeyDocVers;
    private String dlDoc;
    private String dsAutoreDoc;
    private Date dtCreazione;
    private String flDocFirmato;
    private BigDecimal idDoc;
    private BigDecimal idUnitaDoc;
    private String nmTipoDoc;
    private BigDecimal pgDoc;
    private String tiDoc;
    private BigDecimal tiDocOrd;
    private String tiEsitoVerifFirme;
    private String tiStatoElencoVers;

    public AroVLisDoc(String cdKeyDocVers, String dlDoc, String dsAutoreDoc, Date dtCreazione, String flDocFirmato,
            BigDecimal idDoc, BigDecimal idUnitaDoc, String nmTipoDoc, BigDecimal pgDoc, String tiDoc,
            BigDecimal tiDocOrd, String tiStatoElencoVers, String tiEsitoVerifFirme) {
        this.cdKeyDocVers = cdKeyDocVers;
        this.dlDoc = dlDoc;
        this.dsAutoreDoc = dsAutoreDoc;
        this.dtCreazione = dtCreazione;
        this.flDocFirmato = flDocFirmato;
        this.idDoc = idDoc;
        this.idUnitaDoc = idUnitaDoc;
        this.nmTipoDoc = nmTipoDoc;
        this.pgDoc = pgDoc;
        this.tiDoc = tiDoc;
        this.tiDocOrd = tiDocOrd;
        this.tiStatoElencoVers = tiStatoElencoVers;
        this.tiEsitoVerifFirme = tiEsitoVerifFirme;
    }

    public AroVLisDoc() {
    }

    @Column(name = "CD_KEY_DOC_VERS")
    public String getCdKeyDocVers() {
        return this.cdKeyDocVers;
    }

    public void setCdKeyDocVers(String cdKeyDocVers) {
        this.cdKeyDocVers = cdKeyDocVers;
    }

    @Column(name = "DL_DOC")
    public String getDlDoc() {
        return this.dlDoc;
    }

    public void setDlDoc(String dlDoc) {
        this.dlDoc = dlDoc;
    }

    @Column(name = "DS_AUTORE_DOC")
    public String getDsAutoreDoc() {
        return this.dsAutoreDoc;
    }

    public void setDsAutoreDoc(String dsAutoreDoc) {
        this.dsAutoreDoc = dsAutoreDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "FL_DOC_FIRMATO")
    public String getFlDocFirmato() {
        return this.flDocFirmato;
    }

    public void setFlDocFirmato(String flDocFirmato) {
        this.flDocFirmato = flDocFirmato;
    }

    @Id
    @Column(name = "ID_DOC")
    public BigDecimal getIdDoc() {
        return this.idDoc;
    }

    public void setIdDoc(BigDecimal idDoc) {
        this.idDoc = idDoc;
    }

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Column(name = "NM_TIPO_DOC")
    public String getNmTipoDoc() {
        return this.nmTipoDoc;
    }

    public void setNmTipoDoc(String nmTipoDoc) {
        this.nmTipoDoc = nmTipoDoc;
    }

    @Column(name = "PG_DOC")
    public BigDecimal getPgDoc() {
        return this.pgDoc;
    }

    public void setPgDoc(BigDecimal pgDoc) {
        this.pgDoc = pgDoc;
    }

    @Column(name = "TI_DOC")
    public String getTiDoc() {
        return this.tiDoc;
    }

    public void setTiDoc(String tiDoc) {
        this.tiDoc = tiDoc;
    }

    @Column(name = "TI_DOC_ORD")
    public BigDecimal getTiDocOrd() {
        return this.tiDocOrd;
    }

    public void setTiDocOrd(BigDecimal tiDocOrd) {
        this.tiDocOrd = tiDocOrd;
    }

    @Column(name = "TI_ESITO_VERIF_FIRME")
    public String getTiEsitoVerifFirme() {
        return this.tiEsitoVerifFirme;
    }

    public void setTiEsitoVerifFirme(String tiEsitoVerifFirme) {
        this.tiEsitoVerifFirme = tiEsitoVerifFirme;
    }

    @Column(name = "TI_STATO_ELENCO_VERS")
    public String getTiStatoElencoVers() {
        return this.tiStatoElencoVers;
    }

    public void setTiStatoElencoVers(String tiStatoElencoVers) {
        this.tiStatoElencoVers = tiStatoElencoVers;
    }

}
