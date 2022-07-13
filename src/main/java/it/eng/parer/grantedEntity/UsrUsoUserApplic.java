package it.eng.parer.grantedEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the USR_USO_USER_APPLIC database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.USR_USO_USER_APPLIC")
public class UsrUsoUserApplic implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idUsoUserApplic;
    private List<UsrDichAbilOrganiz> usrDichAbilOrganizs;
    private SIAplApplic aplApplic;
    private UsrUser usrUser;

    public UsrUsoUserApplic() {
    }

    @Id
    @SequenceGenerator(name = "USR_USO_USER_APPLIC_IDUSOUSERAPPLIC_GENERATOR", sequenceName = "SUSR_USO_USER_APPLIC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USR_USO_USER_APPLIC_IDUSOUSERAPPLIC_GENERATOR")
    @Column(name = "ID_USO_USER_APPLIC")
    public long getIdUsoUserApplic() {
        return this.idUsoUserApplic;
    }

    public void setIdUsoUserApplic(long idUsoUserApplic) {
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
