package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the USR_V_ABIL_ENTE_SACER_XSTRUT database table.
 *
 */
@Entity
@Table(schema = "SACER_IAM", name = "USR_V_ABIL_ENTE_SACER_XSTRUT")
@NamedQuery(name = "UsrVAbilEnteSacerXstrut.findAll", query = "SELECT u FROM UsrVAbilEnteSacerXstrut u")
public class UsrVAbilEnteSacerXstrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsOrganiz;
    private BigDecimal idOrganizApplicPadre;
    private String nmApplic;
    private String nmOrganiz;
    private UsrVAbilEnteSacerXstrutId usrVAbilEnteSacerXstrutId;

    public UsrVAbilEnteSacerXstrut() {/* Hibernate */
    }

    @EmbeddedId
    public UsrVAbilEnteSacerXstrutId getUsrVAbilEnteSacerXstrutId() {
        return usrVAbilEnteSacerXstrutId;
    }

    public void setUsrVAbilEnteSacerXstrutId(UsrVAbilEnteSacerXstrutId usrVAbilEnteSacerXstrutId) {
        this.usrVAbilEnteSacerXstrutId = usrVAbilEnteSacerXstrutId;
    }

    @Column(name = "DS_ORGANIZ")
    public String getDsOrganiz() {
        return this.dsOrganiz;
    }

    public void setDsOrganiz(String dsOrganiz) {
        this.dsOrganiz = dsOrganiz;
    }

    @Column(name = "ID_ORGANIZ_APPLIC_PADRE")
    public BigDecimal getIdOrganizApplicPadre() {
        return this.idOrganizApplicPadre;
    }

    public void setIdOrganizApplicPadre(BigDecimal idOrganizApplicPadre) {
        this.idOrganizApplicPadre = idOrganizApplicPadre;
    }

    @Column(name = "NM_APPLIC")
    public String getNmApplic() {
        return this.nmApplic;
    }

    public void setNmApplic(String nmApplic) {
        this.nmApplic = nmApplic;
    }

    @Column(name = "NM_ORGANIZ")
    public String getNmOrganiz() {
        return this.nmOrganiz;
    }

    public void setNmOrganiz(String nmOrganiz) {
        this.nmOrganiz = nmOrganiz;
    }

}
