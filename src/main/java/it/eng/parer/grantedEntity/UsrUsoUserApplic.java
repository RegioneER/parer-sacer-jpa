package it.eng.parer.grantedEntity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the USR_USO_USER_APPLIC database table.
 */
@Entity
@Table(schema = "SACER_IAM", name = "USR_USO_USER_APPLIC")
public class UsrUsoUserApplic implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUsoUserApplic;

    private List<UsrDichAbilOrganiz> usrDichAbilOrganizs = new ArrayList<>();

    private SIAplApplic aplApplic;

    private UsrUser usrUser;

    public UsrUsoUserApplic() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_USO_USER_APPLIC")
    public Long getIdUsoUserApplic() {
        return this.idUsoUserApplic;
    }

    public void setIdUsoUserApplic(Long idUsoUserApplic) {
        this.idUsoUserApplic = idUsoUserApplic;
    }

    // bi-directional many-to-one association to UsrDichAbilOrganiz
    @OneToMany(mappedBy = "usrUsoUserApplic", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
            CascadeType.REMOVE })
    public List<UsrDichAbilOrganiz> getUsrDichAbilOrganizs() {
        return this.usrDichAbilOrganizs;
    }

    public void setUsrDichAbilOrganizs(List<UsrDichAbilOrganiz> usrDichAbilOrganizs) {
        this.usrDichAbilOrganizs = usrDichAbilOrganizs;
    }

    // bi-directional many-to-one association to AplApplic
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_APPLIC")
    public SIAplApplic getAplApplic() {
        return this.aplApplic;
    }

    public void setAplApplic(SIAplApplic aplApplic) {
        this.aplApplic = aplApplic;
    }

    // bi-directional many-to-one association to UsrUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public UsrUser getUsrUser() {
        return this.usrUser;
    }

    public void setUsrUser(UsrUser usrUser) {
        this.usrUser = usrUser;
    }
}
