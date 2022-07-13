package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_LOG_ELENCO_VERS database table.
 * 
 */
@Entity
@Table(name = "ELV_LOG_ELENCO_VERS")
@NamedQuery(name = "ElvLogElencoVer.findAll", query = "SELECT e FROM ElvLogElencoVer e")
public class ElvLogElencoVer implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idLogElencoVers;
    private BigDecimal aaKeyUnitaDoc;
    private String cdKeyUnitaDoc;
    private String cdRegistroKeyUnitaDoc;
    private BigDecimal idElencoVers;
    private String nmElenco;
    private BigDecimal pgDoc;
    private BigDecimal pgUpdUnitaDoc;
    private String tiDoc;
    private String tiOper;
    private Date tmOper;
    private IamUser iamUser;
    private LogJob logJob;
    private OrgStrut orgStrut;

    public ElvLogElencoVer() {
    }

    @Id
    @SequenceGenerator(name = "ELV_LOG_ELENCO_VERS_IDLOGELENCOVERS_GENERATOR", sequenceName = "SELV_LOG_ELENCO_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_LOG_ELENCO_VERS_IDLOGELENCOVERS_GENERATOR")
    @Column(name = "ID_LOG_ELENCO_VERS")
    public long getIdLogElencoVers() {
        return this.idLogElencoVers;
    }

    public void setIdLogElencoVers(long idLogElencoVers) {
        this.idLogElencoVers = idLogElencoVers;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
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

    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    @Column(name = "NM_ELENCO")
    public String getNmElenco() {
        return this.nmElenco;
    }

    public void setNmElenco(String nmElenco) {
        this.nmElenco = nmElenco;
    }

    @Column(name = "PG_DOC")
    public BigDecimal getPgDoc() {
        return this.pgDoc;
    }

    public void setPgDoc(BigDecimal pgDoc) {
        this.pgDoc = pgDoc;
    }

    @Column(name = "PG_UPD_UNITA_DOC")
    public BigDecimal getPgUpdUnitaDoc() {
        return this.pgUpdUnitaDoc;
    }

    public void setPgUpdUnitaDoc(BigDecimal pgUpdUnitaDoc) {
        this.pgUpdUnitaDoc = pgUpdUnitaDoc;
    }

    @Column(name = "TI_DOC")
    public String getTiDoc() {
        return this.tiDoc;
    }

    public void setTiDoc(String tiDoc) {
        this.tiDoc = tiDoc;
    }

    @Column(name = "TI_OPER")
    public String getTiOper() {
        return this.tiOper;
    }

    public void setTiOper(String tiOper) {
        this.tiOper = tiOper;
    }

    @Column(name = "TM_OPER")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getTmOper() {
        return this.tmOper;
    }

    public void setTmOper(Date tmOper) {
        this.tmOper = tmOper;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

    // bi-directional many-to-one association to LogJob
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_LOG_JOB")
    public LogJob getLogJob() {
        return this.logJob;
    }

    public void setLogJob(LogJob logJob) {
        this.logJob = logJob;
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