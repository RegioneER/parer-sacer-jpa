package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the VRS_V_UNITA_DOC_NON_VERS database table.
 * 
 */
@Entity
@Table(name = "VRS_V_UNITA_DOC_NON_VERS")
@NamedQuery(name = "VrsVUnitaDocNonVer.findAll", query = "SELECT v FROM VrsVUnitaDocNonVer v")
public class VrsVUnitaDocNonVer implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal aaKeyUnitaDoc;
    private String cdErrLast;
    private String cdKeyUnitaDoc;
    private String cdRegistroKeyUnitaDoc;
    private String clErrLast;
    private String dsErrLast;
    private Date dtFirstSesErr;
    private Date dtLastSesErr;
    private String flDiversiErr;
    private String flNonRisolub;
    private String flVerif;
    private BigDecimal idStrut;
    private BigDecimal idUnitaDocNonVers;

    public VrsVUnitaDocNonVer() {
    }

    @Id
    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Column(name = "CD_ERR_LAST")
    public String getCdErrLast() {
        return this.cdErrLast;
    }

    public void setCdErrLast(String cdErrLast) {
        this.cdErrLast = cdErrLast;
    }

    @Id
    @Column(name = "CD_KEY_UNITA_DOC")
    public String getCdKeyUnitaDoc() {
        return this.cdKeyUnitaDoc;
    }

    public void setCdKeyUnitaDoc(String cdKeyUnitaDoc) {
        this.cdKeyUnitaDoc = cdKeyUnitaDoc;
    }

    @Id
    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC")
    public String getCdRegistroKeyUnitaDoc() {
        return this.cdRegistroKeyUnitaDoc;
    }

    public void setCdRegistroKeyUnitaDoc(String cdRegistroKeyUnitaDoc) {
        this.cdRegistroKeyUnitaDoc = cdRegistroKeyUnitaDoc;
    }

    @Column(name = "CL_ERR_LAST")
    public String getClErrLast() {
        return this.clErrLast;
    }

    public void setClErrLast(String clErrLast) {
        this.clErrLast = clErrLast;
    }

    @Column(name = "DS_ERR_LAST")
    public String getDsErrLast() {
        return this.dsErrLast;
    }

    public void setDsErrLast(String dsErrLast) {
        this.dsErrLast = dsErrLast;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_FIRST_SES_ERR")
    public Date getDtFirstSesErr() {
        return this.dtFirstSesErr;
    }

    public void setDtFirstSesErr(Date dtFirstSesErr) {
        this.dtFirstSesErr = dtFirstSesErr;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_LAST_SES_ERR")
    public Date getDtLastSesErr() {
        return this.dtLastSesErr;
    }

    public void setDtLastSesErr(Date dtLastSesErr) {
        this.dtLastSesErr = dtLastSesErr;
    }

    @Column(name = "FL_DIVERSI_ERR", columnDefinition = "char(1)")
    public String getFlDiversiErr() {
        return this.flDiversiErr;
    }

    public void setFlDiversiErr(String flDiversiErr) {
        this.flDiversiErr = flDiversiErr;
    }

    @Column(name = "FL_NON_RISOLUB", columnDefinition = "char(1)")
    public String getFlNonRisolub() {
        return this.flNonRisolub;
    }

    public void setFlNonRisolub(String flNonRisolub) {
        this.flNonRisolub = flNonRisolub;
    }

    @Column(name = "FL_VERIF", columnDefinition = "char(1)")
    public String getFlVerif() {
        return this.flVerif;
    }

    public void setFlVerif(String flVerif) {
        this.flVerif = flVerif;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_UNITA_DOC_NON_VERS")
    public BigDecimal getIdUnitaDocNonVers() {
        return this.idUnitaDocNonVers;
    }

    public void setIdUnitaDocNonVers(BigDecimal idUnitaDocNonVers) {
        this.idUnitaDocNonVers = idUnitaDocNonVers;
    }

}