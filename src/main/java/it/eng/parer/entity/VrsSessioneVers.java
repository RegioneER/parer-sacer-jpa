package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the VRS_SESSIONE_VERS database table.
 *
 */
@Entity
@Table(name = "VRS_SESSIONE_VERS")
public class VrsSessioneVers implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idSessioneVers;
    private BigDecimal aaKeyUnitaDoc;
    private String cdErrPrinc;
    private String cdKeyDocVers;
    private String cdKeyUnitaDoc;
    private String cdRegistroKeyUnitaDoc;
    private String cdVersioneWs;
    private String dsErrPrinc;
    private Date dtApertura;
    private Date dtChiusura;
    private Date tsApertura;
    private Date tsChiusura;
    private String flSessioneErrNonRisolub;
    private String flSessioneErrVerif;
    private BigDecimal niFileErr;
    private String nmAmbiente;
    private String nmEnte;
    private String nmStrut;
    private String nmUserid;
    private String nmUseridWs;
    private String nmUtente;
    private String tiSessioneVers;
    private String tiStatoSessioneVers;
    private String cdIndIpClient;
    private String cdIndServer;
    private List<VrsDatiSessioneVers> vrsDatiSessioneVers;
    private AroDoc aroDoc;
    private AroUnitaDoc aroUnitaDoc;
    private OrgStrut orgStrut;
    private IamUser iamUser;
    private List<VrsSessioneVersSosp> vrsSessioneVersSosps;

    public VrsSessioneVers() {
    }

    @Id
    @SequenceGenerator(name = "VRS_SESSIONE_VERS_IDSESSIONEVERS_GENERATOR", sequenceName = "SVRS_SESSIONE_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_SESSIONE_VERS_IDSESSIONEVERS_GENERATOR")
    @Column(name = "ID_SESSIONE_VERS")
    public long getIdSessioneVers() {
        return this.idSessioneVers;
    }

    public void setIdSessioneVers(long idSessioneVers) {
        this.idSessioneVers = idSessioneVers;
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

    @Column(name = "CD_KEY_DOC_VERS")
    public String getCdKeyDocVers() {
        return this.cdKeyDocVers;
    }

    public void setCdKeyDocVers(String cdKeyDocVers) {
        this.cdKeyDocVers = cdKeyDocVers;
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

    @Column(name = "CD_VERSIONE_WS")
    public String getCdVersioneWs() {
        return this.cdVersioneWs;
    }

    public void setCdVersioneWs(String cdVersioneWs) {
        this.cdVersioneWs = cdVersioneWs;
    }

    @Column(name = "DS_ERR_PRINC")
    public String getDsErrPrinc() {
        return this.dsErrPrinc;
    }

    public void setDsErrPrinc(String dsErrPrinc) {
        this.dsErrPrinc = dsErrPrinc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_APERTURA")
    public Date getDtApertura() {
        return this.dtApertura;
    }

    public void setDtApertura(Date dtApertura) {
        this.dtApertura = dtApertura;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CHIUSURA")
    public Date getDtChiusura() {
        return this.dtChiusura;
    }

    public void setDtChiusura(Date dtChiusura) {
        this.dtChiusura = dtChiusura;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_APERTURA")
    public Date getTsApertura() {
        return tsApertura;
    }

    public void setTsApertura(Date tsApertura) {
        this.tsApertura = tsApertura;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_CHIUSURA")
    public Date getTsChiusura() {
        return tsChiusura;
    }

    public void setTsChiusura(Date tsChiusura) {
        this.tsChiusura = tsChiusura;
    }

    @Column(name = "FL_SESSIONE_ERR_NON_RISOLUB")
    public String getFlSessioneErrNonRisolub() {
        return this.flSessioneErrNonRisolub;
    }

    public void setFlSessioneErrNonRisolub(String flSessioneErrNonRisolub) {
        this.flSessioneErrNonRisolub = flSessioneErrNonRisolub;
    }

    @Column(name = "FL_SESSIONE_ERR_VERIF")
    public String getFlSessioneErrVerif() {
        return this.flSessioneErrVerif;
    }

    public void setFlSessioneErrVerif(String flSessioneErrVerif) {
        this.flSessioneErrVerif = flSessioneErrVerif;
    }

    @Column(name = "NI_FILE_ERR")
    public BigDecimal getNiFileErr() {
        return this.niFileErr;
    }

    public void setNiFileErr(BigDecimal niFileErr) {
        this.niFileErr = niFileErr;
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

    @Column(name = "NM_USERID")
    public String getNmUserid() {
        return this.nmUserid;
    }

    public void setNmUserid(String nmUserid) {
        this.nmUserid = nmUserid;
    }

    @Column(name = "NM_USERID_WS")
    public String getNmUseridWs() {
        return this.nmUseridWs;
    }

    public void setNmUseridWs(String nmUseridWs) {
        this.nmUseridWs = nmUseridWs;
    }

    @Column(name = "TI_SESSIONE_VERS")
    public String getTiSessioneVers() {
        return this.tiSessioneVers;
    }

    public void setTiSessioneVers(String tiSessioneVers) {
        this.tiSessioneVers = tiSessioneVers;
    }

    @Column(name = "TI_STATO_SESSIONE_VERS")
    public String getTiStatoSessioneVers() {
        return this.tiStatoSessioneVers;
    }

    public void setTiStatoSessioneVers(String tiStatoSessioneVers) {
        this.tiStatoSessioneVers = tiStatoSessioneVers;
    }

    @Column(name = "CD_IND_IP_CLIENT")
    public String getCdIndIpClient() {
        return cdIndIpClient;
    }

    public void setCdIndIpClient(String cdIndIpClient) {
        this.cdIndIpClient = cdIndIpClient;
    }

    @Column(name = "CD_IND_SERVER")
    public String getCdIndServer() {
        return cdIndServer;
    }

    public void setCdIndServer(String cdIndServer) {
        this.cdIndServer = cdIndServer;
    }

    // bi-directional many-to-one association to VrsDatiSessioneVers
    @OneToMany(mappedBy = "vrsSessioneVers")
    public List<VrsDatiSessioneVers> getVrsDatiSessioneVers() {
        return this.vrsDatiSessioneVers;
    }

    public void setVrsDatiSessioneVers(List<VrsDatiSessioneVers> vrsDatiSessioneVers) {
        this.vrsDatiSessioneVers = vrsDatiSessioneVers;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOC")
    public AroDoc getAroDoc() {
        return this.aroDoc;
    }

    public void setAroDoc(AroDoc aroDoc) {
        this.aroDoc = aroDoc;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
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

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

    @Column(name = "NM_UTENTE")
    public String getNmUtente() {
        return this.nmUtente;
    }

    public void setNmUtente(String nmUtente) {
        this.nmUtente = nmUtente;
    }

    // bi-directional many-to-one association to VrsSessioneVersSosp
    @OneToMany(mappedBy = "vrsSessioneVers")
    public List<VrsSessioneVersSosp> getVrsSessioneVersSosps() {
        return this.vrsSessioneVersSosps;
    }

    public void setVrsSessioneVersSosps(List<VrsSessioneVersSosp> vrsSessioneVersSosps) {
        this.vrsSessioneVersSosps = vrsSessioneVersSosps;
    }

}
