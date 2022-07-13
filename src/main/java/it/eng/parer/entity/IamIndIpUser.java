package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the IAM_IND_IP_USER database table.
 *
 */
@Entity
@Table(name = "IAM_IND_IP_USER")
@NamedQuery(name = "IamIndIpUser.deleteByIdUser", query = "DELETE FROM IamIndIpUser i where i.iamUser = :iamUser")
public class IamIndIpUser implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idIndIpUser;
    private String cdIndIpUser;
    private IamUser iamUser;

    public IamIndIpUser() {
    }

    @Id
    @SequenceGenerator(name = "IAM_IND_IP_USER_IDINDIPUSER_GENERATOR", sequenceName = "SIAM_IND_IP_USER", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IAM_IND_IP_USER_IDINDIPUSER_GENERATOR")
    @Column(name = "ID_IND_IP_USER")
    public long getIdIndIpUser() {
        return this.idIndIpUser;
    }

    public void setIdIndIpUser(long idIndIpUser) {
        this.idIndIpUser = idIndIpUser;
    }

    @Column(name = "CD_IND_IP_USER")
    public String getCdIndIpUser() {
        return this.cdIndIpUser;
    }

    public void setCdIndIpUser(String cdIndIpUser) {
        this.cdIndIpUser = cdIndIpUser;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

}
