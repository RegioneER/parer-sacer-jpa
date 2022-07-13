package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the USR_V_ABIL_AMB_SACER_XSTRUT database table.
 * 
 */
@Entity
@Table(name = "USR_V_ABIL_AMB_SACER_XSTRUT")
@NamedQuery(name = "UsrVAbilAmbSacerXstrut.findAll", query = "SELECT u FROM UsrVAbilAmbSacerXstrut u")
public class UsrVAbilAmbSacerXstrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dsOrganiz;
    private BigDecimal idOrganizApplic;
    private BigDecimal idUserIam;
    private String nmApplic;
    private String nmOrganiz;

    public UsrVAbilAmbSacerXstrut() {
    }

    @Column(name = "DS_ORGANIZ")
    public String getDsOrganiz() {
        return this.dsOrganiz;
    }

    public void setDsOrganiz(String dsOrganiz) {
        this.dsOrganiz = dsOrganiz;
    }

    @Id
    @Column(name = "ID_ORGANIZ_APPLIC")
    public BigDecimal getIdOrganizApplic() {
        return this.idOrganizApplic;
    }

    public void setIdOrganizApplic(BigDecimal idOrganizApplic) {
        this.idOrganizApplic = idOrganizApplic;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
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