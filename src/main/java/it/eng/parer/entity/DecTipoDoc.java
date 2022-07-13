package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_TIPO_DOC database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_TIPO_DOC")
public class DecTipoDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idTipoDoc;
    private String dlNoteTipoDoc;
    private String dsPeriodicitaVers;
    private String dsTipoDoc;
    private Date dtIstituz;
    private Date dtSoppres;
    private String flTipoDocPrincipale;
    private String nmTipoDoc;
    private List<AroDoc> aroDocs;
    private List<DecAttribDatiSpec> decAttribDatiSpecs;
    private List<DecCriterioFiltroMultiplo> decCriterioFiltroMultiplos;
    private List<DecFiltroSelUd> decFiltroSelUds;
    private OrgStrut orgStrut;
    private List<DecTipoDocAmmesso> decTipoDocAmmessos;
    private List<DecTipoStrutDocAmmesso> decTipoStrutDocAmmessos;
    private List<DecXsdDatiSpec> decXsdDatiSpecs;
    private List<MonContaUdDocComp> monContaUdDocComps;
    private List<OrgRegolaValSubStrut> orgRegolaValSubStruts;
    private List<DecModelloTipoSerie> decModelloTipoSeries;
    private List<DecUsoModelloXsdDoc> decUsoModelloXsdDocs;

    public DecTipoDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_DOC_IDTIPODOC_GENERATOR", sequenceName = "SDEC_TIPO_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_DOC_IDTIPODOC_GENERATOR")
    @Column(name = "ID_TIPO_DOC")
    @XmlID
    public long getIdTipoDoc() {
        return this.idTipoDoc;
    }

    public void setIdTipoDoc(long idTipoDoc) {
        this.idTipoDoc = idTipoDoc;
    }

    @Column(name = "DL_NOTE_TIPO_DOC")
    public String getDlNoteTipoDoc() {
        return this.dlNoteTipoDoc;
    }

    public void setDlNoteTipoDoc(String dlNoteTipoDoc) {
        this.dlNoteTipoDoc = dlNoteTipoDoc;
    }

    @Column(name = "DS_PERIODICITA_VERS")
    public String getDsPeriodicitaVers() {
        return this.dsPeriodicitaVers;
    }

    public void setDsPeriodicitaVers(String dsPeriodicitaVers) {
        this.dsPeriodicitaVers = dsPeriodicitaVers;
    }

    @Column(name = "DS_TIPO_DOC")
    public String getDsTipoDoc() {
        return this.dsTipoDoc;
    }

    public void setDsTipoDoc(String dsTipoDoc) {
        this.dsTipoDoc = dsTipoDoc;
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

    @Column(name = "FL_TIPO_DOC_PRINCIPALE")
    public String getFlTipoDocPrincipale() {
        return this.flTipoDocPrincipale;
    }

    public void setFlTipoDocPrincipale(String flTipoDocPrincipale) {
        this.flTipoDocPrincipale = flTipoDocPrincipale;
    }

    @Column(name = "NM_TIPO_DOC")
    public String getNmTipoDoc() {
        return this.nmTipoDoc;
    }

    public void setNmTipoDoc(String nmTipoDoc) {
        this.nmTipoDoc = nmTipoDoc;
    }

    // bi-directional many-to-one association to AroDoc
    @OneToMany(mappedBy = "decTipoDoc")
    @XmlTransient
    public List<AroDoc> getAroDocs() {
        return this.aroDocs;
    }

    public void setAroDocs(List<AroDoc> aroDocs) {
        this.aroDocs = aroDocs;
    }

    // bi-directional many-to-one association to DecAttribDatiSpec
    @OneToMany(mappedBy = "decTipoDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlIDREF
    public List<DecAttribDatiSpec> getDecAttribDatiSpecs() {
        return this.decAttribDatiSpecs;
    }

    public void setDecAttribDatiSpecs(List<DecAttribDatiSpec> decAttribDatiSpecs) {
        this.decAttribDatiSpecs = decAttribDatiSpecs;
    }

    // bi-directional many-to-one association to DecCriterioFiltroMultiplo
    @OneToMany(mappedBy = "decTipoDoc")
    @XmlIDREF
    public List<DecCriterioFiltroMultiplo> getDecCriterioFiltroMultiplos() {
        return this.decCriterioFiltroMultiplos;
    }

    public void setDecCriterioFiltroMultiplos(List<DecCriterioFiltroMultiplo> decCriterioFiltroMultiplos) {
        this.decCriterioFiltroMultiplos = decCriterioFiltroMultiplos;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "decTipoDocs")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to DecTipoDocAmmesso
    @OneToMany(mappedBy = "decTipoDoc", cascade = CascadeType.PERSIST)
    public List<DecTipoDocAmmesso> getDecTipoDocAmmessos() {
        return this.decTipoDocAmmessos;
    }

    public void setDecTipoDocAmmessos(List<DecTipoDocAmmesso> decTipoDocAmmessos) {
        this.decTipoDocAmmessos = decTipoDocAmmessos;
    }

    // bi-directional many-to-one association to DecTipoStrutDocAmmesso
    @OneToMany(mappedBy = "decTipoDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    public List<DecTipoStrutDocAmmesso> getDecTipoStrutDocAmmessos() {
        return this.decTipoStrutDocAmmessos;
    }

    public void setDecTipoStrutDocAmmessos(List<DecTipoStrutDocAmmesso> decTipoStrutDocAmmessos) {
        this.decTipoStrutDocAmmessos = decTipoStrutDocAmmessos;
    }

    // bi-directional many-to-one association to DecXsdDatiSpec
    @OneToMany(mappedBy = "decTipoDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlIDREF
    public List<DecXsdDatiSpec> getDecXsdDatiSpecs() {
        return this.decXsdDatiSpecs;
    }

    public void setDecXsdDatiSpecs(List<DecXsdDatiSpec> decXsdDatiSpecs) {
        this.decXsdDatiSpecs = decXsdDatiSpecs;
    }

    // bi-directional many-to-one association to OrgRegolaValSubStrut
    @OneToMany(mappedBy = "decTipoDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlIDREF
    public List<OrgRegolaValSubStrut> getOrgRegolaValSubStruts() {
        return this.orgRegolaValSubStruts;
    }

    public void setOrgRegolaValSubStruts(List<OrgRegolaValSubStrut> orgRegolaValSubStruts) {
        this.orgRegolaValSubStruts = orgRegolaValSubStruts;
    }

    // bi-directional many-to-one association to DecFiltroSelUd
    @OneToMany(mappedBy = "decTipoDoc", cascade = CascadeType.REMOVE)
    @XmlTransient
    public List<DecFiltroSelUd> getDecFiltroSelUds() {
        return this.decFiltroSelUds;
    }

    public void setDecFiltroSelUds(List<DecFiltroSelUd> decFiltroSelUds) {
        this.decFiltroSelUds = decFiltroSelUds;
    }

    // bi-directional many-to-one association to MonContaUdDocComp
    @OneToMany(mappedBy = "decTipoDoc")
    @XmlTransient
    public List<MonContaUdDocComp> getMonContaUdDocComps() {
        return this.monContaUdDocComps;
    }

    public void setMonContaUdDocComps(List<MonContaUdDocComp> monContaUdDocComps) {
        this.monContaUdDocComps = monContaUdDocComps;
    }

    // bi-directional many-to-one association to DecModelloTipoSerie
    @OneToMany(mappedBy = "decTipoDoc")
    @XmlTransient
    public List<DecModelloTipoSerie> getDecModelloTipoSeries() {
        return this.decModelloTipoSeries;
    }

    public void setDecModelloTipoSeries(List<DecModelloTipoSerie> decModelloTipoSeries) {
        this.decModelloTipoSeries = decModelloTipoSeries;
    }

    public DecModelloTipoSerie addDecModelloTipoSery(DecModelloTipoSerie decModelloTipoSery) {
        getDecModelloTipoSeries().add(decModelloTipoSery);
        decModelloTipoSery.setDecTipoDoc(this);

        return decModelloTipoSery;
    }

    public DecModelloTipoSerie removeDecModelloTipoSery(DecModelloTipoSerie decModelloTipoSery) {
        getDecModelloTipoSeries().remove(decModelloTipoSery);
        decModelloTipoSery.setDecTipoDoc(null);

        return decModelloTipoSery;
    }

    // bi-directional many-to-one association to DecTipoRapprAmmesso
    @OneToMany(mappedBy = "decTipoDoc", cascade = CascadeType.PERSIST)
    public List<DecUsoModelloXsdDoc> getDecUsoModelloXsdDocs() {
        return this.decUsoModelloXsdDocs;
    }

    public void setDecUsoModelloXsdDocs(List<DecUsoModelloXsdDoc> decUsoModelloXsdDocs) {
        this.decUsoModelloXsdDocs = decUsoModelloXsdDocs;
    }
}
