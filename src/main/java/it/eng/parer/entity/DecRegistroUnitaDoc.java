package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_REGISTRO_UNITA_DOC database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_REGISTRO_UNITA_DOC")
public class DecRegistroUnitaDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idRegistroUnitaDoc;
    private String cdRegistroNormaliz;
    private String cdRegistroUnitaDoc;
    private String cdSerieDaCreare;
    private String dsRegistroUnitaDoc;
    private String dsSerieDaCreare;
    private String dsTipoSerieDaCreare;
    private Date dtIstituz;
    private Date dtSoppres;
    private String flCreaSerie;
    private String flCreaTipoSerieStandard;
    private String flRegistroFisc;
    private String flTipoSerieMult;
    private BigDecimal niAnniConserv;
    private String nmTipoSerieDaCreare;
    private List<AroUnitaDoc> aroUnitaDocs;
    private List<DecAaRegistroUnitaDoc> decAaRegistroUnitaDocs;
    private List<DecCriterioFiltroMultiplo> decCriterioFiltroMultiplos;
    private List<DecCriterioFiltroMultiplo> decRangeCriterioFiltroMultiplos;
    private OrgStrut orgStrut;
    private List<DecTipoUnitaDocAmmesso> decTipoUnitaDocAmmessos;
    private List<MonAaUnitaDocRegistro> monAaUnitaDocRegistros;
    private List<DecTipoSerieUd> decTipoSerieUds;
    private List<MonContaUdDocComp> monContaUdDocComps;
    private DecModelloTipoSerie decModelloTipoSerie;
    private List<DecTipoStrutUdReg> decTipoStrutUdRegs;

    public DecRegistroUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_REGISTRO_UNITA_DOC_IDREGISTROUNITADOC_GENERATOR", sequenceName = "SDEC_REGISTRO_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_REGISTRO_UNITA_DOC_IDREGISTROUNITADOC_GENERATOR")
    @Column(name = "ID_REGISTRO_UNITA_DOC")
    @XmlID
    public long getIdRegistroUnitaDoc() {
        return this.idRegistroUnitaDoc;
    }

    public void setIdRegistroUnitaDoc(long idRegistroUnitaDoc) {
        this.idRegistroUnitaDoc = idRegistroUnitaDoc;
    }

    @Column(name = "CD_REGISTRO_UNITA_DOC")
    public String getCdRegistroUnitaDoc() {
        return this.cdRegistroUnitaDoc;
    }

    public void setCdRegistroUnitaDoc(String cdRegistroUnitaDoc) {
        this.cdRegistroUnitaDoc = cdRegistroUnitaDoc;
    }

    @Column(name = "CD_REGISTRO_NORMALIZ")
    public String getCdRegistroNormaliz() {
        return this.cdRegistroNormaliz;
    }

    public void setCdRegistroNormaliz(String cdRegistroNormaliz) {
        this.cdRegistroNormaliz = cdRegistroNormaliz;
    }

    @Column(name = "CD_SERIE_DA_CREARE")
    public String getCdSerieDaCreare() {
        return this.cdSerieDaCreare;
    }

    public void setCdSerieDaCreare(String cdSerieDaCreare) {
        this.cdSerieDaCreare = cdSerieDaCreare;
    }

    @Column(name = "DS_REGISTRO_UNITA_DOC")
    public String getDsRegistroUnitaDoc() {
        return this.dsRegistroUnitaDoc;
    }

    public void setDsRegistroUnitaDoc(String dsRegistroUnitaDoc) {
        this.dsRegistroUnitaDoc = dsRegistroUnitaDoc;
    }

    @Column(name = "DS_SERIE_DA_CREARE")
    public String getDsSerieDaCreare() {
        return this.dsSerieDaCreare;
    }

    public void setDsSerieDaCreare(String dsSerieDaCreare) {
        this.dsSerieDaCreare = dsSerieDaCreare;
    }

    @Column(name = "DS_TIPO_SERIE_DA_CREARE")
    public String getDsTipoSerieDaCreare() {
        return this.dsTipoSerieDaCreare;
    }

    public void setDsTipoSerieDaCreare(String dsTipoSerieDaCreare) {
        this.dsTipoSerieDaCreare = dsTipoSerieDaCreare;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ISTITUZ")
    public Date getDtIstituz() {
        return this.dtIstituz;
    }

    public void setDtIstituz(Date dtIstituz) {
        this.dtIstituz = dtIstituz;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SOPPRES")
    public Date getDtSoppres() {
        return this.dtSoppres;
    }

    public void setDtSoppres(Date dtSoppres) {
        this.dtSoppres = dtSoppres;
    }

    @Column(name = "FL_CREA_SERIE")
    public String getFlCreaSerie() {
        return this.flCreaSerie;
    }

    public void setFlCreaSerie(String flCreaSerie) {
        this.flCreaSerie = flCreaSerie;
    }

    @Column(name = "FL_CREA_TIPO_SERIE_STANDARD")
    public String getFlCreaTipoSerieStandard() {
        return this.flCreaTipoSerieStandard;
    }

    public void setFlCreaTipoSerieStandard(String flCreaTipoSerieStandard) {
        this.flCreaTipoSerieStandard = flCreaTipoSerieStandard;
    }

    @Column(name = "FL_REGISTRO_FISC")
    public String getFlRegistroFisc() {
        return this.flRegistroFisc;
    }

    public void setFlRegistroFisc(String flRegistroFisc) {
        this.flRegistroFisc = flRegistroFisc;
    }

    @Column(name = "FL_TIPO_SERIE_MULT")
    public String getFlTipoSerieMult() {
        return this.flTipoSerieMult;
    }

    public void setFlTipoSerieMult(String flTipoSerieMult) {
        this.flTipoSerieMult = flTipoSerieMult;
    }

    @Column(name = "NI_ANNI_CONSERV")
    public BigDecimal getNiAnniConserv() {
        return this.niAnniConserv;
    }

    public void setNiAnniConserv(BigDecimal niAnniConserv) {
        this.niAnniConserv = niAnniConserv;
    }

    @Column(name = "NM_TIPO_SERIE_DA_CREARE")
    public String getNmTipoSerieDaCreare() {
        return this.nmTipoSerieDaCreare;
    }

    public void setNmTipoSerieDaCreare(String nmTipoSerieDaCreare) {
        this.nmTipoSerieDaCreare = nmTipoSerieDaCreare;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @OneToMany(mappedBy = "decRegistroUnitaDoc")
    @XmlTransient
    public List<AroUnitaDoc> getAroUnitaDocs() {
        return this.aroUnitaDocs;
    }

    public void setAroUnitaDocs(List<AroUnitaDoc> aroUnitaDocs) {
        this.aroUnitaDocs = aroUnitaDocs;
    }

    // bi-directional many-to-one association to DecAaRegistroUnitaDoc
    @OneToMany(mappedBy = "decRegistroUnitaDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    public List<DecAaRegistroUnitaDoc> getDecAaRegistroUnitaDocs() {
        return this.decAaRegistroUnitaDocs;
    }

    public void setDecAaRegistroUnitaDocs(List<DecAaRegistroUnitaDoc> decAaRegistroUnitaDocs) {
        this.decAaRegistroUnitaDocs = decAaRegistroUnitaDocs;

    }

    // bi-directional many-to-one association to DecCriterioFiltroMultiplo
    @OneToMany(mappedBy = "decRegistroUnitaDoc")
    @XmlIDREF
    public List<DecCriterioFiltroMultiplo> getDecCriterioFiltroMultiplos() {
        return this.decCriterioFiltroMultiplos;
    }

    public void setDecCriterioFiltroMultiplos(List<DecCriterioFiltroMultiplo> decCriterioFiltroMultiplos) {
        this.decCriterioFiltroMultiplos = decCriterioFiltroMultiplos;
    }

    // bi-directional many-to-one association to DecCriterioFiltroMultiplo
    @OneToMany(mappedBy = "decRegistroRangeUnitaDoc")
    @XmlIDREF
    public List<DecCriterioFiltroMultiplo> getDecRangeCriterioFiltroMultiplos() {
        return this.decRangeCriterioFiltroMultiplos;
    }

    public void setDecRangeCriterioFiltroMultiplos(List<DecCriterioFiltroMultiplo> decRangeCriterioFiltroMultiplos) {
        this.decRangeCriterioFiltroMultiplos = decRangeCriterioFiltroMultiplos;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "decRegistroUnitaDocs")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to DecTipoUnitaDocAmmesso
    @OneToMany(mappedBy = "decRegistroUnitaDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    public List<DecTipoUnitaDocAmmesso> getDecTipoUnitaDocAmmessos() {
        return this.decTipoUnitaDocAmmessos;
    }

    public void setDecTipoUnitaDocAmmessos(List<DecTipoUnitaDocAmmesso> decTipoUnitaDocAmmessos) {
        this.decTipoUnitaDocAmmessos = decTipoUnitaDocAmmessos;
    }

    // bi-directional many-to-one association to MonAaUnitaDocRegistro
    @OneToMany(mappedBy = "decRegistroUnitaDoc")
    @XmlTransient
    public List<MonAaUnitaDocRegistro> getMonAaUnitaDocRegistros() {
        return this.monAaUnitaDocRegistros;
    }

    public void setMonAaUnitaDocRegistros(List<MonAaUnitaDocRegistro> monAaUnitaDocRegistros) {
        this.monAaUnitaDocRegistros = monAaUnitaDocRegistros;
    }

    // bi-directional many-to-one association to DecTipoSerieUd
    @OneToMany(mappedBy = "decRegistroUnitaDoc", cascade = CascadeType.REMOVE)
    @XmlTransient
    public List<DecTipoSerieUd> getDecTipoSerieUds() {
        return this.decTipoSerieUds;
    }

    public void setDecTipoSerieUds(List<DecTipoSerieUd> decTipoSerieUds) {
        this.decTipoSerieUds = decTipoSerieUds;
    }

    // bi-directional many-to-one association to MonContaUdDocComp
    @OneToMany(mappedBy = "decRegistroUnitaDoc")
    @XmlTransient
    public List<MonContaUdDocComp> getMonContaUdDocComps() {
        return this.monContaUdDocComps;
    }

    public void setMonContaUdDocComps(List<MonContaUdDocComp> monContaUdDocComps) {
        this.monContaUdDocComps = monContaUdDocComps;
    }

    // bi-directional many-to-one association to DecModelloTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODELLO_TIPO_SERIE")
    public DecModelloTipoSerie getDecModelloTipoSerie() {
        return this.decModelloTipoSerie;
    }

    public void setDecModelloTipoSerie(DecModelloTipoSerie decModelloTipoSerie) {
        this.decModelloTipoSerie = decModelloTipoSerie;
    }

    // bi-directional many-to-one association to DecTipoStrutUdReg
    @OneToMany(mappedBy = "decRegistroUnitaDoc", cascade = CascadeType.PERSIST)
    @XmlTransient
    public List<DecTipoStrutUdReg> getDecTipoStrutUdRegs() {
        return this.decTipoStrutUdRegs;
    }

    public void setDecTipoStrutUdRegs(List<DecTipoStrutUdReg> decTipoStrutUdRegs) {
        this.decTipoStrutUdRegs = decTipoStrutUdRegs;
    }

}
