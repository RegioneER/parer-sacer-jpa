package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the APL_VAL_PARAM_APPLIC_MULTI database table.
 * 
 */
@Entity
@Table(name = "APL_VAL_PARAM_APPLIC_MULTI")
@NamedQuery(name = "AplValParamApplicMulti.findAll", query = "SELECT a FROM AplValParamApplicMulti a")
public class AplValParamApplicMulti implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idValParamApplicMulti;
    private String dsValoreParamApplic;
    private AplParamApplic aplParamApplic;
    private OrgAmbiente orgAmbiente;

    public AplValParamApplicMulti() {
    }

    @Id
    @SequenceGenerator(name = "APL_VAL_PARAM_APPLIC_MULTI_IDVALPARAMAPPLICMULTI_GENERATOR", sequenceName = "SAPL_VAL_PARAM_APPLIC_MULTI", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APL_VAL_PARAM_APPLIC_MULTI_IDVALPARAMAPPLICMULTI_GENERATOR")
    @Column(name = "ID_VAL_PARAM_APPLIC_MULTI")
    public long getIdValParamApplicMulti() {
        return this.idValParamApplicMulti;
    }

    public void setIdValParamApplicMulti(long idValParamApplicMulti) {
        this.idValParamApplicMulti = idValParamApplicMulti;
    }

    @Column(name = "DS_VALORE_PARAM_APPLIC")
    public String getDsValoreParamApplic() {
        return this.dsValoreParamApplic;
    }

    public void setDsValoreParamApplic(String dsValoreParamApplic) {
        this.dsValoreParamApplic = dsValoreParamApplic;
    }

    // bi-directional many-to-one association to AplParamApplic
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PARAM_APPLIC")
    public AplParamApplic getAplParamApplic() {
        return this.aplParamApplic;
    }

    public void setAplParamApplic(AplParamApplic aplParamApplic) {
        this.aplParamApplic = aplParamApplic;
    }

    // bi-directional many-to-one association to OrgAmbiente
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AMBIENTE")
    public OrgAmbiente getOrgAmbiente() {
        return this.orgAmbiente;
    }

    public void setOrgAmbiente(OrgAmbiente orgAmbiente) {
        this.orgAmbiente = orgAmbiente;
    }

}