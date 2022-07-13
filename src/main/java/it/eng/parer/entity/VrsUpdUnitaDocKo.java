package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.VrsUpdUnitaDocKo.TiStatoUdpUdKo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the VRS_UPD_UNITA_DOC_KO database table.
 * 
 */
@Entity
@Table(name = "VRS_UPD_UNITA_DOC_KO")
@NamedQuery(name = "VrsUpdUnitaDocKo.findAll", query = "SELECT v FROM VrsUpdUnitaDocKo v")
public class VrsUpdUnitaDocKo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUpdUnitaDocKo;
    private BigDecimal aaKeyUnitaDoc;
    private String cdKeyUnitaDoc;
    private String cdRegistroKeyUnitaDoc;
    private String dsErrPrinc;
    private DecControlloWs decControlloWsPrinc;
    private DecErrSacer decErrSacerPrinc;
    private DecRegistroUnitaDoc decRegistroUnitaDocLast;
    private VrsSesUpdUnitaDocKo vrsSesUpdUnitaDocKoFirst;
    private VrsSesUpdUnitaDocKo vrsSesUpdUnitaDocKoLast;
    private OrgStrut orgStrut;
    private DecTipoDoc decTipoDocPrincLast;
    private DecTipoUnitaDoc decTipoUnitaDocLast;
    private TiStatoUdpUdKo tiStatoUdpUdKo;
    private Date tsIniFirstSes;
    private Date tsIniLastSes;
    private List<VrsSesUpdUnitaDocKo> vrsSesUpdUnitaDocKos;

    public VrsUpdUnitaDocKo() {
    }

    @Id
    @SequenceGenerator(name = "VRS_UPD_UNITA_DOC_KO_IDUPDUNITADOCKO_GENERATOR", sequenceName = "SVRS_UPD_UNITA_DOC_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_UPD_UNITA_DOC_KO_IDUPDUNITADOCKO_GENERATOR")
    @Column(name = "ID_UPD_UNITA_DOC_KO")
    public long getIdUpdUnitaDocKo() {
        return this.idUpdUnitaDocKo;
    }

    public void setIdUpdUnitaDocKo(long idUpdUnitaDocKo) {
        this.idUpdUnitaDocKo = idUpdUnitaDocKo;
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

    // bi-directional many-to-one association to DecErrSacer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_SACER_PRINC")
    public DecErrSacer getDecErrSacerPrinc() {
        return this.decErrSacerPrinc;
    }

    public void setDecErrSacerPrinc(DecErrSacer decErrSacerPrinc) {
        this.decErrSacerPrinc = decErrSacerPrinc;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_UNITA_DOC_LAST")
    public DecRegistroUnitaDoc getDecRegistroUnitaDocLast() {
        return this.decRegistroUnitaDocLast;
    }

    public void setDecRegistroUnitaDocLast(DecRegistroUnitaDoc decRegistroUnitaDocLast) {
        this.decRegistroUnitaDocLast = decRegistroUnitaDocLast;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SES_UPD_UD_KO_FIRST")
    public VrsSesUpdUnitaDocKo getVrsSesUpdUnitaDocKoFirst() {
        return this.vrsSesUpdUnitaDocKoFirst;
    }

    public void setVrsSesUpdUnitaDocKoFirst(VrsSesUpdUnitaDocKo vrsSesUpdUnitaDocKoFirst) {
        this.vrsSesUpdUnitaDocKoFirst = vrsSesUpdUnitaDocKoFirst;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SES_UPD_UD_KO_LAST")
    public VrsSesUpdUnitaDocKo getVrsSesUpdUnitaDocKoLast() {
        return this.vrsSesUpdUnitaDocKoLast;
    }

    public void setVrsSesUpdUnitaDocKoLast(VrsSesUpdUnitaDocKo vrsSesUpdUnitaDocKoLast) {
        this.vrsSesUpdUnitaDocKoLast = vrsSesUpdUnitaDocKoLast;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC_PRINC_LAST")
    public DecTipoDoc getDecTipoDocPrincLast() {
        return this.decTipoDocPrincLast;
    }

    public void setDecTipoDocPrincLast(DecTipoDoc decTipoDocPrincLast) {
        this.decTipoDocPrincLast = decTipoDocPrincLast;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC_LAST")
    public DecTipoUnitaDoc getDecTipoUnitaDocLast() {
        return this.decTipoUnitaDocLast;
    }

    public void setDecTipoUnitaDocLast(DecTipoUnitaDoc decTipoUnitaDocLast) {
        this.decTipoUnitaDocLast = decTipoUnitaDocLast;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO_UDP_UD_KO")
    public TiStatoUdpUdKo getTiStatoUdpUdKo() {
        return this.tiStatoUdpUdKo;
    }

    public void setTiStatoUdpUdKo(TiStatoUdpUdKo tiStatoUdpUdKo) {
        this.tiStatoUdpUdKo = tiStatoUdpUdKo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_INI_FIRST_SES")
    public Date getTsIniFirstSes() {
        return this.tsIniFirstSes;
    }

    public void setTsIniFirstSes(Date tsIniFirstSes) {
        this.tsIniFirstSes = tsIniFirstSes;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_INI_LAST_SES")
    public Date getTsIniLastSes() {
        return this.tsIniLastSes;
    }

    public void setTsIniLastSes(Date tsIniLastSes) {
        this.tsIniLastSes = tsIniLastSes;
    }

    // bi-directional many-to-one association to VrsSesFascicoloKo
    @OneToMany(mappedBy = "vrsUpdUnitaDocKo")
    public List<VrsSesUpdUnitaDocKo> getVrsSesUpdUnitaDocKos() {
        return this.vrsSesUpdUnitaDocKos;
    }

    public void setVrsSesUpdUnitaDocKos(List<VrsSesUpdUnitaDocKo> vrsSesUpdUnitaDocKos) {
        this.vrsSesUpdUnitaDocKos = vrsSesUpdUnitaDocKos;
    }

}