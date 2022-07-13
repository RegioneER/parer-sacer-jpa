package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.eng.parer.entity.constraint.VrsSesUpdUnitaDocKo.TiStatoSesUpdKo;

/**
 * The persistent class for the VRS_SES_UPD_UNITA_DOC_KO database table.
 * 
 */
@Entity
@Table(name = "VRS_SES_UPD_UNITA_DOC_KO")
@NamedQuery(name = "VrsSesUpdUnitaDocKo.findAll", query = "SELECT v FROM VrsSesUpdUnitaDocKo v")
public class VrsSesUpdUnitaDocKo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idSesUpdUnitaDocKo;
    private BigDecimal aaKeyUnitaDoc;
    private String cdVersioneWs;
    private String dsErrPrinc;
    private DecControlloWs decControlloWsPrinc;
    private DecErrSacer decErrSacerPrinc;
    private DecRegistroUnitaDoc decRegistroUnitaDoc;
    private OrgStrut orgStrut;
    private DecTipoDoc decTipoDocPrinc;
    private DecTipoUnitaDoc decTipoUnitaDoc;
    private VrsUpdUnitaDocKo vrsUpdUnitaDocKo;
    private AroUpdUnitaDoc aroUpdUnitaDoc;
    private IamUser iamUser;
    private TiStatoSesUpdKo tiStatoSesUpdKo;
    private Date tsFineSes;
    private Date tsIniSes;
    private List<VrsErrSesUpdUnitaDocKo> vrsErrSesUpdUnitaDocKos;
    private List<VrsXmlSesUpdUnitaDocKo> vrsXmlSesUpdUnitaDocKos;

    public VrsSesUpdUnitaDocKo() {
    }

    @Id
    @SequenceGenerator(name = "VRS_SES_UPD_UNITA_DOC_KO_IDSESUPDUNITADOCKO_GENERATOR", sequenceName = "SVRS_SES_UPD_UNITA_DOC_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_SES_UPD_UNITA_DOC_KO_IDSESUPDUNITADOCKO_GENERATOR")
    @Column(name = "ID_SES_UPD_UNITA_DOC_KO")
    public long getIdSesUpdUnitaDocKo() {
        return this.idSesUpdUnitaDocKo;
    }

    public void setIdSesUpdUnitaDocKo(long idSesUpdUnitaDocKo) {
        this.idSesUpdUnitaDocKo = idSesUpdUnitaDocKo;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
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

    // bi-directional many-to-one association to DecErrSacer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTROLLO_WS_PRINC")
    public DecControlloWs getDecControlloWsPrinc() {
        return this.decControlloWsPrinc;
    }

    public void setDecControlloWsPrinc(DecControlloWs decControlloWsPrinc) {
        this.decControlloWsPrinc = decControlloWsPrinc;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_SACER_PRINC")
    public DecErrSacer getDecErrSacerPrinc() {
        return this.decErrSacerPrinc;
    }

    public void setDecErrSacerPrinc(DecErrSacer decErrSacerPrinc) {
        this.decErrSacerPrinc = decErrSacerPrinc;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_UNITA_DOC")
    public DecRegistroUnitaDoc getDecRegistroUnitaDoc() {
        return this.decRegistroUnitaDoc;
    }

    public void setDecRegistroUnitaDoc(DecRegistroUnitaDoc decRegistroUnitaDoc) {
        this.decRegistroUnitaDoc = decRegistroUnitaDoc;
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
    @JoinColumn(name = "ID_TIPO_DOC_PRINC")
    public DecTipoDoc getDecTipoDocPrinc() {
        return this.decTipoDocPrinc;
    }

    public void setDecTipoDocPrinc(DecTipoDoc decTipoDocPrinc) {
        this.decTipoDocPrinc = decTipoDocPrinc;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC_KO")
    public VrsUpdUnitaDocKo getVrsUpdUnitaDocKo() {
        return this.vrsUpdUnitaDocKo;
    }

    public void setVrsUpdUnitaDocKo(VrsUpdUnitaDocKo vrsUpdUnitaDocKo) {
        this.vrsUpdUnitaDocKo = vrsUpdUnitaDocKo;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO_SES_UPD_KO")
    public TiStatoSesUpdKo getTiStatoSesUpdKo() {
        return this.tiStatoSesUpdKo;
    }

    public void setTiStatoSesUpdKo(TiStatoSesUpdKo tiStatoSesUpdKo) {
        this.tiStatoSesUpdKo = tiStatoSesUpdKo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_FINE_SES")
    public Date getTsFineSes() {
        return this.tsFineSes;
    }

    public void setTsFineSes(Date tsFineSes) {
        this.tsFineSes = tsFineSes;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_INI_SES")
    public Date getTsIniSes() {
        return this.tsIniSes;
    }

    public void setTsIniSes(Date tsIniSes) {
        this.tsIniSes = tsIniSes;
    }

    // bi-directional many-to-one association to VrsSesFascicoloKo
    @OneToMany(mappedBy = "vrsSesUpdUnitaDocKo")
    public List<VrsErrSesUpdUnitaDocKo> getVrsErrSesUpdUnitaDocKos() {
        return this.vrsErrSesUpdUnitaDocKos;
    }

    public void setVrsErrSesUpdUnitaDocKos(List<VrsErrSesUpdUnitaDocKo> vrsErrSesUpdUnitaDocKos) {
        this.vrsErrSesUpdUnitaDocKos = vrsErrSesUpdUnitaDocKos;
    }

    // bi-directional many-to-one association to VrsSesFascicoloKo
    @OneToMany(mappedBy = "vrsSesUpdUnitaDocKo")
    public List<VrsXmlSesUpdUnitaDocKo> getVrsXmlSesUpdUnitaDocKos() {
        return this.vrsXmlSesUpdUnitaDocKos;
    }

    public void setVrsXmlSesUpdUnitaDocKos(List<VrsXmlSesUpdUnitaDocKo> vrsXmlSesUpdUnitaDocKos) {
        this.vrsXmlSesUpdUnitaDocKos = vrsXmlSesUpdUnitaDocKos;
    }
}