package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the MON_V_RIC_CONTA_BY_STATO_CONSERV_NEW database table.
 * 
 */
@Entity
@Table(name = "MON_V_RIC_CONTA_BY_STATO_CONSERV_NEW")
@NamedQuery(name = "MonVRicContaByStatoConservNew.findAll", query = "SELECT m FROM MonVRicContaByStatoConservNew m")
public class MonVRicContaByStatoConservNew implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal aaKeyUnitaDoc;
    private Date dtRifConta;
    private BigDecimal idContaByStatoConserv;
    private BigDecimal idRegistroUnitaDoc;
    private BigDecimal idStrut;
    private BigDecimal idSubStrut;
    private BigDecimal idTipoDocPrinc;
    private BigDecimal idTipoUnitaDoc;
    private BigDecimal niCompAipGenerato;
    private BigDecimal niCompAipInAggiorn;
    private BigDecimal niCompAnnul;
    private BigDecimal niCompInVolume;
    private BigDecimal niCompPresaInCarico;

    public MonVRicContaByStatoConservNew() {
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return this.dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    @Id
    @Column(name = "ID_CONTA_BY_STATO_CONSERV")
    public BigDecimal getIdContaByStatoConserv() {
        return this.idContaByStatoConserv;
    }

    public void setIdContaByStatoConserv(BigDecimal idContaByStatoConserv) {
        this.idContaByStatoConserv = idContaByStatoConserv;
    }

    @Column(name = "ID_REGISTRO_UNITA_DOC")
    public BigDecimal getIdRegistroUnitaDoc() {
        return this.idRegistroUnitaDoc;
    }

    public void setIdRegistroUnitaDoc(BigDecimal idRegistroUnitaDoc) {
        this.idRegistroUnitaDoc = idRegistroUnitaDoc;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_SUB_STRUT")
    public BigDecimal getIdSubStrut() {
        return this.idSubStrut;
    }

    public void setIdSubStrut(BigDecimal idSubStrut) {
        this.idSubStrut = idSubStrut;
    }

    @Column(name = "ID_TIPO_DOC_PRINC")
    public BigDecimal getIdTipoDocPrinc() {
        return this.idTipoDocPrinc;
    }

    public void setIdTipoDocPrinc(BigDecimal idTipoDocPrinc) {
        this.idTipoDocPrinc = idTipoDocPrinc;
    }

    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return this.idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }

    @Column(name = "NI_COMP_AIP_GENERATO")
    public BigDecimal getNiCompAipGenerato() {
        return this.niCompAipGenerato;
    }

    public void setNiCompAipGenerato(BigDecimal niCompAipGenerato) {
        this.niCompAipGenerato = niCompAipGenerato;
    }

    @Column(name = "NI_COMP_AIP_IN_AGGIORN")
    public BigDecimal getNiCompAipInAggiorn() {
        return this.niCompAipInAggiorn;
    }

    public void setNiCompAipInAggiorn(BigDecimal niCompAipInAggiorn) {
        this.niCompAipInAggiorn = niCompAipInAggiorn;
    }

    @Column(name = "NI_COMP_ANNUL")
    public BigDecimal getNiCompAnnul() {
        return this.niCompAnnul;
    }

    public void setNiCompAnnul(BigDecimal niCompAnnul) {
        this.niCompAnnul = niCompAnnul;
    }

    @Column(name = "NI_COMP_IN_VOLUME")
    public BigDecimal getNiCompInVolume() {
        return this.niCompInVolume;
    }

    public void setNiCompInVolume(BigDecimal niCompInVolume) {
        this.niCompInVolume = niCompInVolume;
    }

    @Column(name = "NI_COMP_PRESA_IN_CARICO")
    public BigDecimal getNiCompPresaInCarico() {
        return this.niCompPresaInCarico;
    }

    public void setNiCompPresaInCarico(BigDecimal niCompPresaInCarico) {
        this.niCompPresaInCarico = niCompPresaInCarico;
    }

}