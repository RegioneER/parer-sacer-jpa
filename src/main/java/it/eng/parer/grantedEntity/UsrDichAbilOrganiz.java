package it.eng.parer.grantedEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the USR_DICH_ABIL_ORGANIZ database table.
 */
@Entity
@Table(schema = "SACER_IAM", name = "USR_DICH_ABIL_ORGANIZ")
@NamedQuery(name = "UsrDichAbilOrganiz.findAll", query = "SELECT u FROM UsrDichAbilOrganiz u")
public class UsrDichAbilOrganiz implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idDichAbilOrganiz;

    private String dsCausaleDich;

    private String tiScopoDichAbilOrganiz;

    private SIUsrOrganizIam usrOrganizIam;

    private UsrUsoUserApplic usrUsoUserApplic;

    public UsrDichAbilOrganiz() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_DICH_ABIL_ORGANIZ")
    public Long getIdDichAbilOrganiz() {
        return this.idDichAbilOrganiz;
    }

    public void setIdDichAbilOrganiz(Long idDichAbilOrganiz) {
        this.idDichAbilOrganiz = idDichAbilOrganiz;
    }

    @Column(name = "DS_CAUSALE_DICH")
    public String getDsCausaleDich() {
        return this.dsCausaleDich;
    }

    public void setDsCausaleDich(String dsCausaleDich) {
        this.dsCausaleDich = dsCausaleDich;
    }

    @Column(name = "TI_SCOPO_DICH_ABIL_ORGANIZ")
    public String getTiScopoDichAbilOrganiz() {
        return this.tiScopoDichAbilOrganiz;
    }

    public void setTiScopoDichAbilOrganiz(String tiScopoDichAbilOrganiz) {
        this.tiScopoDichAbilOrganiz = tiScopoDichAbilOrganiz;
    }

    // bi-directional many-to-one association to UsrOrganizIam
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ORGANIZ_IAM")
    public SIUsrOrganizIam getUsrOrganizIam() {
        return this.usrOrganizIam;
    }

    public void setUsrOrganizIam(SIUsrOrganizIam usrOrganizIam) {
        this.usrOrganizIam = usrOrganizIam;
    }

    // bi-directional many-to-one association to UsrUsoUserApplic
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USO_USER_APPLIC")
    public UsrUsoUserApplic getUsrUsoUserApplic() {
        return this.usrUsoUserApplic;
    }

    public void setUsrUsoUserApplic(UsrUsoUserApplic usrUsoUserApplic) {
        this.usrUsoUserApplic = usrUsoUserApplic;
    }
}
