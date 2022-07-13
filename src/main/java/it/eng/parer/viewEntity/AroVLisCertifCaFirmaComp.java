package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_LIS_CERTIF_CA_FIRMA_COMP database table.
 * 
 */
@Entity
@Table(name = "ARO_V_LIS_CERTIF_CA_FIRMA_COMP")
public class AroVLisCertifCaFirmaComp implements Serializable {
    private static final long serialVersionUID = 1L;

    private String dlDnIssuerCertifCa;
    private String dlDnIssuerCrl;
    private Date dtFinValCertifCa;
    private Date dtIniValCertifCa;
    private Date dtScadCrl;
    private BigDecimal idContrFirmaComp;
    private BigDecimal idFirmaComp;
    private BigDecimal idUsoCertifCaContrComp;
    private BigDecimal niSerialCertifCa;
    private BigDecimal niSerialCertifCrl;
    private BigDecimal niSerialCrl;
    private BigDecimal pgCertifCa;
    private String dlDnIssuerCertifOcsp;
    private BigDecimal niSerialCertifOcsp;
    private Date dtIniValCertifOcsp;
    private Date dtFinValCertifOcsp;
    private String tiContr;

    public AroVLisCertifCaFirmaComp() {
    }

    @Column(name = "DL_DN_ISSUER_CERTIF_CA")
    public String getDlDnIssuerCertifCa() {
        return this.dlDnIssuerCertifCa;
    }

    public void setDlDnIssuerCertifCa(String dlDnIssuerCertifCa) {
        this.dlDnIssuerCertifCa = dlDnIssuerCertifCa;
    }

    @Column(name = "DL_DN_ISSUER_CRL")
    public String getDlDnIssuerCrl() {
        return this.dlDnIssuerCrl;
    }

    public void setDlDnIssuerCrl(String dlDnIssuerCrl) {
        this.dlDnIssuerCrl = dlDnIssuerCrl;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIN_VAL_CERTIF_CA")
    public Date getDtFinValCertifCa() {
        return this.dtFinValCertifCa;
    }

    public void setDtFinValCertifCa(Date dtFinValCertifCa) {
        this.dtFinValCertifCa = dtFinValCertifCa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL_CERTIF_CA")
    public Date getDtIniValCertifCa() {
        return this.dtIniValCertifCa;
    }

    public void setDtIniValCertifCa(Date dtIniValCertifCa) {
        this.dtIniValCertifCa = dtIniValCertifCa;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SCAD_CRL")
    public Date getDtScadCrl() {
        return this.dtScadCrl;
    }

    public void setDtScadCrl(Date dtScadCrl) {
        this.dtScadCrl = dtScadCrl;
    }

    @Column(name = "ID_CONTR_FIRMA_COMP")
    public BigDecimal getIdContrFirmaComp() {
        return this.idContrFirmaComp;
    }

    public void setIdContrFirmaComp(BigDecimal idContrFirmaComp) {
        this.idContrFirmaComp = idContrFirmaComp;
    }

    @Column(name = "ID_FIRMA_COMP")
    public BigDecimal getIdFirmaComp() {
        return this.idFirmaComp;
    }

    public void setIdFirmaComp(BigDecimal idFirmaComp) {
        this.idFirmaComp = idFirmaComp;
    }

    @Id
    @Column(name = "ID_USO_CERTIF_CA_CONTR_COMP")
    public BigDecimal getIdUsoCertifCaContrComp() {
        return this.idUsoCertifCaContrComp;
    }

    public void setIdUsoCertifCaContrComp(BigDecimal idUsoCertifCaContrComp) {
        this.idUsoCertifCaContrComp = idUsoCertifCaContrComp;
    }

    @Column(name = "NI_SERIAL_CERTIF_CA")
    public BigDecimal getNiSerialCertifCa() {
        return this.niSerialCertifCa;
    }

    public void setNiSerialCertifCa(BigDecimal niSerialCertifCa) {
        this.niSerialCertifCa = niSerialCertifCa;
    }

    @Column(name = "NI_SERIAL_CERTIF_CRL")
    public BigDecimal getNiSerialCertifCrl() {
        return this.niSerialCertifCrl;
    }

    public void setNiSerialCertifCrl(BigDecimal niSerialCertifCrl) {
        this.niSerialCertifCrl = niSerialCertifCrl;
    }

    @Column(name = "NI_SERIAL_CRL")
    public BigDecimal getNiSerialCrl() {
        return this.niSerialCrl;
    }

    public void setNiSerialCrl(BigDecimal niSerialCrl) {
        this.niSerialCrl = niSerialCrl;
    }

    @Column(name = "PG_CERTIF_CA")
    public BigDecimal getPgCertifCa() {
        return this.pgCertifCa;
    }

    public void setPgCertifCa(BigDecimal pgCertifCa) {
        this.pgCertifCa = pgCertifCa;
    }

    @Column(name = "DL_DN_ISSUER_CERTIF_OCSP")
    public String getDlDnIssuerCertifOcsp() {
        return dlDnIssuerCertifOcsp;
    }

    public void setDlDnIssuerCertifOcsp(String dlDnIssuerCertifOcsp) {
        this.dlDnIssuerCertifOcsp = dlDnIssuerCertifOcsp;
    }

    @Column(name = "NI_SERIAL_CERTIF_OCSP")
    public BigDecimal getNiSerialCertifOcsp() {
        return niSerialCertifOcsp;
    }

    public void setNiSerialCertifOcsp(BigDecimal niSerialCertifOcsp) {
        this.niSerialCertifOcsp = niSerialCertifOcsp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL_CERTIF_OCSP")
    public Date getDtIniValCertifOcsp() {
        return dtIniValCertifOcsp;
    }

    public void setDtIniValCertifOcsp(Date dtIniValCertifOcsp) {
        this.dtIniValCertifOcsp = dtIniValCertifOcsp;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIN_VAL_CERTIF_OCSP")
    public Date getDtFinValCertifOcsp() {
        return dtFinValCertifOcsp;
    }

    public void setDtFinValCertifOcsp(Date dtFinValCertifOcsp) {
        this.dtFinValCertifOcsp = dtFinValCertifOcsp;
    }

    @Column(name = "TI_CONTR")
    public String getTiContr() {
        return tiContr;
    }

    public void setTiContr(String tiContr) {
        this.tiContr = tiContr;
    }

}