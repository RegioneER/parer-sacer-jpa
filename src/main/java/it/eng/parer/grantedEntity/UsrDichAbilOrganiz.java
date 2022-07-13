package it.eng.parer.grantedEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the USR_DICH_ABIL_ORGANIZ database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.USR_DICH_ABIL_ORGANIZ")
@NamedQuery(name = "UsrDichAbilOrganiz.findAll", query = "SELECT u FROM UsrDichAbilOrganiz u")
public class UsrDichAbilOrganiz implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idDichAbilOrganiz;
    private String dsCausaleDich;
    private String tiScopoDichAbilOrganiz;
    private SIUsrOrganizIam usrOrganizIam;
    private UsrUsoUserApplic usrUsoUserApplic;

    public UsrDichAbilOrganiz() {
    }

    @Id
    @SequenceGenerator(name = "USR_DICH_ABIL_ORGANIZ_IDDICHABILORGANIZ_GENERATOR", sequenceName = "SUSR_DICH_ABIL_ORGANIZ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USR_DICH_ABIL_ORGANIZ_IDDICHABILORGANIZ_GENERATOR")
    @Column(name = "ID_DICH_ABIL_ORGANIZ")
    public long getIdDichAbilOrganiz() {
        return this.idDichAbilOrganiz;
    }

    public void setIdDichAbilOrganiz(long idDichAbilOrganiz) {
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