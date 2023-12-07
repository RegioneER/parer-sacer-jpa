package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the USR_V_ABIL_AMB_XENTE database table.
 *
 */
@Entity
@Table(name = "USR_V_ABIL_AMB_XENTE")
@NamedQuery(name = "UsrVAbilAmbXente.findAll", query = "SELECT u FROM UsrVAbilAmbXente u")
public class UsrVAbilAmbXente implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsOrganiz;
    private UsrVAbilAmbXenteId usrVAbilAmbXenteId;

    @EmbeddedId
    public UsrVAbilAmbXenteId getUsrVAbilAmbXenteId() {
        return usrVAbilAmbXenteId;
    }

    public void setUsrVAbilAmbXenteId(UsrVAbilAmbXenteId usrVAbilAmbXenteId) {
        this.usrVAbilAmbXenteId = usrVAbilAmbXenteId;
    }

    private String nmApplic;
    private String nmOrganiz;
    private Date dtFinVal;
    private Date dtIniVal;

    public UsrVAbilAmbXente() {/* Hibernate */
    }

    @Column(name = "DS_ORGANIZ")
    public String getDsOrganiz() {
        return this.dsOrganiz;
    }

    public void setDsOrganiz(String dsOrganiz) {
        this.dsOrganiz = dsOrganiz;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIN_VAL")
    public Date getDtFinVal() {
        return this.dtFinVal;
    }

    public void setDtFinVal(Date dtFinVal) {
        this.dtFinVal = dtFinVal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL")
    public Date getDtIniVal() {
        return this.dtIniVal;
    }

    public void setDtIniVal(Date dtIniVal) {
        this.dtIniVal = dtIniVal;
    }

}
