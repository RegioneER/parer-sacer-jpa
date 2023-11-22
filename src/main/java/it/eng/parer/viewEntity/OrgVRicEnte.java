package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ORG_V_RIC_ENTE database table.
 *
 */
@Entity
@Table(name = "ORG_V_RIC_ENTE")
@NamedQuery(name = "OrgVRicEnte.findAll", query = "SELECT o FROM OrgVRicEnte o")
public class OrgVRicEnte implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsAmbiente;
    private String dsEnte;
    private BigDecimal idAmbiente;
    private BigDecimal idCategEnte;
    private String nmAmbiente;
    private String nmEnte;
    private String tipoDefTemplateEnte;

    public OrgVRicEnte() {/* Hibernate */
    }

    @Column(name = "DS_AMBIENTE")
    public String getDsAmbiente() {
        return this.dsAmbiente;
    }

    public void setDsAmbiente(String dsAmbiente) {
        this.dsAmbiente = dsAmbiente;
    }

    @Column(name = "DS_ENTE")
    public String getDsEnte() {
        return this.dsEnte;
    }

    public void setDsEnte(String dsEnte) {
        this.dsEnte = dsEnte;
    }

    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Column(name = "ID_CATEG_ENTE")
    public BigDecimal getIdCategEnte() {
        return this.idCategEnte;
    }

    public void setIdCategEnte(BigDecimal idCategEnte) {
        this.idCategEnte = idCategEnte;
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

    @Column(name = "TIPO_DEF_TEMPLATE_ENTE")
    public String getTipoDefTemplateEnte() {
        return tipoDefTemplateEnte;
    }

    public void setTipoDefTemplateEnte(String tipoDefTemplateEnte) {
        this.tipoDefTemplateEnte = tipoDefTemplateEnte;
    }

    private OrgVRicEnteId orgVRicEnteId;

    @EmbeddedId()
    public OrgVRicEnteId getOrgVRicEnteId() {
        return orgVRicEnteId;
    }

    public void setOrgVRicEnteId(OrgVRicEnteId orgVRicEnteId) {
        this.orgVRicEnteId = orgVRicEnteId;
    }
}
