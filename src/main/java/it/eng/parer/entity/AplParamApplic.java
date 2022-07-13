package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the APL_PARAM_APPLIC database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "APL_PARAM_APPLIC")
@NamedQuery(name = "AplParamApplic.findAll", query = "SELECT a FROM AplParamApplic a")
public class AplParamApplic implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idParamApplic;
    private String dmParamApplic;
    private String dsParamApplic;
    private String dsListaValoriAmmessi;
    private String flAppartAaTipoFascicolo;
    private String flAppartAmbiente;
    private String flAppartApplic;
    private String flAppartStrut;
    private String flAppartTipoUnitaDoc;
    private String flMulti;
    private String nmParamApplic;
    private String tiGestioneParam;
    private String tiParamApplic;
    private String tiValoreParamApplic;
    private List<AplValoreParamApplic> aplValoreParamApplics;
    private List<AplValParamApplicMulti> aplValParamApplicMultis;

    public AplParamApplic() {
    }

    @Id
    @SequenceGenerator(name = "APL_PARAM_APPLIC_IDPARAMAPPLIC_GENERATOR", sequenceName = "SAPL_PARAM_APPLIC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APL_PARAM_APPLIC_IDPARAMAPPLIC_GENERATOR")
    @Column(name = "ID_PARAM_APPLIC")
    public long getIdParamApplic() {
        return this.idParamApplic;
    }

    public void setIdParamApplic(long idParamApplic) {
        this.idParamApplic = idParamApplic;
    }

    @Column(name = "DM_PARAM_APPLIC")
    public String getDmParamApplic() {
        return this.dmParamApplic;
    }

    public void setDmParamApplic(String dmParamApplic) {
        this.dmParamApplic = dmParamApplic;
    }

    @Column(name = "DS_PARAM_APPLIC")
    public String getDsParamApplic() {
        return this.dsParamApplic;
    }

    public void setDsParamApplic(String dsParamApplic) {
        this.dsParamApplic = dsParamApplic;
    }

    @Column(name = "DS_LISTA_VALORI_AMMESSI")
    public String getDsListaValoriAmmessi() {
        return this.dsListaValoriAmmessi;
    }

    public void setDsListaValoriAmmessi(String dsListaValoriAmmessi) {
        this.dsListaValoriAmmessi = dsListaValoriAmmessi;
    }

    @Column(name = "FL_APPART_AA_TIPO_FASCICOLO")
    public String getFlAppartAaTipoFascicolo() {
        return this.flAppartAaTipoFascicolo;
    }

    public void setFlAppartAaTipoFascicolo(String flAppartAaTipoFascicolo) {
        this.flAppartAaTipoFascicolo = flAppartAaTipoFascicolo;
    }

    @Column(name = "FL_APPART_AMBIENTE")
    public String getFlAppartAmbiente() {
        return this.flAppartAmbiente;
    }

    public void setFlAppartAmbiente(String flAppartAmbiente) {
        this.flAppartAmbiente = flAppartAmbiente;
    }

    @Column(name = "FL_APPART_APPLIC")
    public String getFlAppartApplic() {
        return this.flAppartApplic;
    }

    public void setFlAppartApplic(String flAppartApplic) {
        this.flAppartApplic = flAppartApplic;
    }

    @Column(name = "FL_APPART_STRUT")
    public String getFlAppartStrut() {
        return this.flAppartStrut;
    }

    public void setFlAppartStrut(String flAppartStrut) {
        this.flAppartStrut = flAppartStrut;
    }

    @Column(name = "FL_APPART_TIPO_UNITA_DOC")
    public String getFlAppartTipoUnitaDoc() {
        return this.flAppartTipoUnitaDoc;
    }

    public void setFlAppartTipoUnitaDoc(String flAppartTipoUnitaDoc) {
        this.flAppartTipoUnitaDoc = flAppartTipoUnitaDoc;
    }

    @Column(name = "FL_MULTI")
    public String getFlMulti() {
        return this.flMulti;
    }

    public void setFlMulti(String flMulti) {
        this.flMulti = flMulti;
    }

    @Column(name = "NM_PARAM_APPLIC")
    public String getNmParamApplic() {
        return this.nmParamApplic;
    }

    public void setNmParamApplic(String nmParamApplic) {
        this.nmParamApplic = nmParamApplic;
    }

    @Column(name = "TI_GESTIONE_PARAM")
    public String getTiGestioneParam() {
        return this.tiGestioneParam;
    }

    public void setTiGestioneParam(String tiGestioneParam) {
        this.tiGestioneParam = tiGestioneParam;
    }

    @Column(name = "TI_PARAM_APPLIC")
    public String getTiParamApplic() {
        return this.tiParamApplic;
    }

    public void setTiParamApplic(String tiParamApplic) {
        this.tiParamApplic = tiParamApplic;
    }

    // bi-directional many-to-one association to AplValoreParamApplic
    @OneToMany(mappedBy = "aplParamApplic", cascade = { CascadeType.REMOVE })
    @XmlTransient
    public List<AplValoreParamApplic> getAplValoreParamApplics() {
        return this.aplValoreParamApplics;
    }

    public void setAplValoreParamApplics(List<AplValoreParamApplic> aplValoreParamApplics) {
        this.aplValoreParamApplics = aplValoreParamApplics;
    }

    // MEV26587
    @Column(name = "TI_VALORE_PARAM_APPLIC")
    public String getTiValoreParamApplic() {
        return tiValoreParamApplic;
    }

    public void setTiValoreParamApplic(String tiValoreParamApplic) {
        this.tiValoreParamApplic = tiValoreParamApplic;
    }

    public AplValoreParamApplic addAplValoreParamApplic(AplValoreParamApplic aplValoreParamApplic) {
        getAplValoreParamApplics().add(aplValoreParamApplic);
        aplValoreParamApplic.setAplParamApplic(this);

        return aplValoreParamApplic;
    }

    public AplValoreParamApplic removeAplValoreParamApplic(AplValoreParamApplic aplValoreParamApplic) {
        getAplValoreParamApplics().remove(aplValoreParamApplic);
        aplValoreParamApplic.setAplParamApplic(null);

        return aplValoreParamApplic;
    }

    // bi-directional many-to-one association to AplValParamApplicMulti
    @OneToMany(mappedBy = "aplParamApplic", cascade = { CascadeType.REMOVE })
    @XmlTransient
    public List<AplValParamApplicMulti> getAplValParamApplicMultis() {
        return this.aplValParamApplicMultis;
    }

    public void setAplValParamApplicMultis(List<AplValParamApplicMulti> aplValParamApplicMultis) {
        this.aplValParamApplicMultis = aplValParamApplicMultis;
    }

    public AplValParamApplicMulti addAplValParamApplicMulti(AplValParamApplicMulti aplValParamApplicMulti) {
        getAplValParamApplicMultis().add(aplValParamApplicMulti);
        aplValParamApplicMulti.setAplParamApplic(this);

        return aplValParamApplicMulti;
    }

    public AplValParamApplicMulti removeAplValParamApplicMulti(AplValParamApplicMulti aplValParamApplicMulti) {
        getAplValParamApplicMultis().remove(aplValParamApplicMulti);
        aplValParamApplicMulti.setAplParamApplic(null);

        return aplValParamApplicMulti;
    }

}
