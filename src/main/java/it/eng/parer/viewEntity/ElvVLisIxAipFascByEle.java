package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ELV_V_LIS_IX_AIP_FASC_BY_ELE database table.
 *
 */
@Entity
@Table(name = "ELV_V_LIS_IX_AIP_FASC_BY_ELE")
@NamedQuery(name = "ElvVLisIxAipFascByEle.findAll", query = "SELECT e FROM ElvVLisIxAipFascByEle e")
public class ElvVLisIxAipFascByEle implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsHashFile;
    private String cdVerAip;
    private String nmAmbiente;
    private String nmEnte;
    private String nmStrut;
    private BigDecimal aaFascicolo;
    private String cdKeyFascicolo;
    private String cdKeyOrd;
    private BigDecimal idElencoVersFasc;
    private BigDecimal idVerAipFascicolo;

    public ElvVLisIxAipFascByEle() {/* Hibernate */
    }

    @Column(name = "DS_HASH_FILE")
    public String getDsHashFile() {
        return this.dsHashFile;
    }

    public void setDsHashFile(String dsHashFile) {
        this.dsHashFile = dsHashFile;
    }

    @Column(name = "CD_VER_AIP")
    public String getCdVerAip() {
        return this.cdVerAip;
    }

    public void setCdVerAip(String cdVerAip) {
        this.cdVerAip = cdVerAip;
    }

    @Column(name = "NM_AMBIENTE")
    public String getNmAmbiente() {
        return this.nmAmbiente;
    }

    public void setNmAmbiente(String nmAmbiente) {
        this.nmAmbiente = nmAmbiente;
    }

    @Column(name = "NM_ENTE")
    public String getNmEnte() {
        return this.nmEnte;
    }

    public void setNmEnte(String nmEnte) {
        this.nmEnte = nmEnte;
    }

    @Column(name = "NM_STRUT")
    public String getNmStrut() {
        return this.nmStrut;
    }

    public void setNmStrut(String nmStrut) {
        this.nmStrut = nmStrut;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "CD_KEY_FASCICOLO")
    public String getCdKeyFascicolo() {
        return this.cdKeyFascicolo;
    }

    public void setCdKeyFascicolo(String cdKeyFascicolo) {
        this.cdKeyFascicolo = cdKeyFascicolo;
    }

    @Column(name = "CD_KEY_ORD")
    public String getCdKeyOrd() {
        return this.cdKeyOrd;
    }

    public void setCdKeyOrd(String cdKeyOrd) {
        this.cdKeyOrd = cdKeyOrd;
    }

    @Id
    @Column(name = "ID_ELENCO_VERS_FASC")
    public BigDecimal getIdElencoVersFasc() {
        return this.idElencoVersFasc;
    }

    public void setIdElencoVersFasc(BigDecimal idElencoVersFasc) {
        this.idElencoVersFasc = idElencoVersFasc;
    }

    @Column(name = "ID_VER_AIP_FASCICOLO")
    public BigDecimal getIdVerAipFascicolo() {
        return this.idVerAipFascicolo;
    }

    public void setIdVerAipFascicolo(BigDecimal idVerAipFascicolo) {
        this.idVerAipFascicolo = idVerAipFascicolo;
    }

}
