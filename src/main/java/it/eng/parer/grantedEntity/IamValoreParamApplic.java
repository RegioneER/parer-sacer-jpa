package it.eng.parer.grantedEntity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the IAM_VALORE_PARAM_APPLIC database table.
 * 
 */
@Entity
@Table(name = "SACER_IAM.IAM_VALORE_PARAM_APPLIC")
@NamedQuery(name = "IamValoreParamApplic.findAll", query = "SELECT i FROM IamValoreParamApplic i")
public class IamValoreParamApplic implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idValoreParamApplic;
    private String dsValoreParamApplic;
    private String tiAppart;
    private IamParamApplic iamParamApplic;
    private SIOrgAmbienteEnteConvenz orgAmbienteEnteConvenz;
    private SIOrgEnteSiam orgEnteSiam;

    public IamValoreParamApplic() {
    }

    @Id
    @SequenceGenerator(name = "IAM_VALORE_PARAM_APPLIC_IDVALOREPARAMAPPLIC_GENERATOR", sequenceName = "SIAM_VALORE_PARAM_APPLIC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IAM_VALORE_PARAM_APPLIC_IDVALOREPARAMAPPLIC_GENERATOR")
    @Column(name = "ID_VALORE_PARAM_APPLIC")
    public Long getIdValoreParamApplic() {
        return this.idValoreParamApplic;
    }

    public void setIdValoreParamApplic(Long idValoreParamApplic) {
        this.idValoreParamApplic = idValoreParamApplic;
    }

    @Column(name = "DS_VALORE_PARAM_APPLIC")
    public String getDsValoreParamApplic() {
        return this.dsValoreParamApplic;
    }

    public void setDsValoreParamApplic(String dsValoreParamApplic) {
        this.dsValoreParamApplic = dsValoreParamApplic;
    }

    @Column(name = "TI_APPART")
    public String getTiAppart() {
        return this.tiAppart;
    }

    public void setTiAppart(String tiAppart) {
        this.tiAppart = tiAppart;
    }

    // bi-directional many-to-one association to IamParamApplic
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PARAM_APPLIC")
    public IamParamApplic getIamParamApplic() {
        return this.iamParamApplic;
    }

    public void setIamParamApplic(IamParamApplic iamParamApplic) {
        this.iamParamApplic = iamParamApplic;
    }

    // bi-directional many-to-one association to OrgAmbienteEnteConvenz
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AMBIENTE_ENTE_CONVENZ")
    public SIOrgAmbienteEnteConvenz getOrgAmbienteEnteConvenz() {
        return this.orgAmbienteEnteConvenz;
    }

    public void setOrgAmbienteEnteConvenz(SIOrgAmbienteEnteConvenz orgAmbienteEnteConvenz) {
        this.orgAmbienteEnteConvenz = orgAmbienteEnteConvenz;
    }

    // bi-directional many-to-one association to OrgEnteSiam
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ENTE_CONVENZ")
    public SIOrgEnteSiam getOrgEnteSiam() {
        return this.orgEnteSiam;
    }

    public void setOrgEnteSiam(SIOrgEnteSiam orgEnteSiam) {
        this.orgEnteSiam = orgEnteSiam;
    }

}