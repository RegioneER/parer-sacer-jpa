package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the VRS_UNITA_DOC_NON_VERS database table.
 *
 */
@Entity
@Table(name = "VRS_UNITA_DOC_NON_VERS")
@NamedQuery(name = "VrsUnitaDocNonVer.findAll", query = "SELECT v FROM VrsUnitaDocNonVer v")
public class VrsUnitaDocNonVer implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUnitaDocNonVers;
    private BigDecimal aaKeyUnitaDoc;
    private String cdErrPrinc;
    private String cdKeyUnitaDoc;
    private String cdRegistroKeyUnitaDoc;
    private String dsErrPrinc;
    private Date dtFirstSesErr;
    private Date dtLastSesErr;
    private OrgStrut orgStrut;

    public VrsUnitaDocNonVer() {
    }

    @Id
    @SequenceGenerator(name = "VRS_UNITA_DOC_NON_VERS_IDUNITADOCNONVERS_GENERATOR", sequenceName = "SVRS_UNITA_DOC_NON_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_UNITA_DOC_NON_VERS_IDUNITADOCNONVERS_GENERATOR")
    @Column(name = "ID_UNITA_DOC_NON_VERS")
    public long getIdUnitaDocNonVers() {
        return this.idUnitaDocNonVers;
    }

    public void setIdUnitaDocNonVers(long idUnitaDocNonVers) {
        this.idUnitaDocNonVers = idUnitaDocNonVers;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Column(name = "CD_ERR_PRINC")
    public String getCdErrPrinc() {
        return this.cdErrPrinc;
    }

    public void setCdErrPrinc(String cdErrPrinc) {
        this.cdErrPrinc = cdErrPrinc;
    }

    @Column(name = "CD_KEY_UNITA_DOC")
    public String getCdKeyUnitaDoc() {
        return this.cdKeyUnitaDoc;
    }

    public void setCdKeyUnitaDoc(String cdKeyUnitaDoc) {
        this.cdKeyUnitaDoc = cdKeyUnitaDoc;
    }

    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC")
    public String getCdRegistroKeyUnitaDoc() {
        return this.cdRegistroKeyUnitaDoc;
    }

    public void setCdRegistroKeyUnitaDoc(String cdRegistroKeyUnitaDoc) {
        this.cdRegistroKeyUnitaDoc = cdRegistroKeyUnitaDoc;
    }

    @Column(name = "DS_ERR_PRINC")
    public String getDsErrPrinc() {
        return this.dsErrPrinc;
    }

    public void setDsErrPrinc(String dsErrPrinc) {
        this.dsErrPrinc = dsErrPrinc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIRST_SES_ERR")
    public Date getDtFirstSesErr() {
        return this.dtFirstSesErr;
    }

    public void setDtFirstSesErr(Date dtFirstSesErr) {
        this.dtFirstSesErr = dtFirstSesErr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LAST_SES_ERR")
    public Date getDtLastSesErr() {
        return this.dtLastSesErr;
    }

    public void setDtLastSesErr(Date dtLastSesErr) {
        this.dtLastSesErr = dtLastSesErr;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

}