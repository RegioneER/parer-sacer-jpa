package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the IAM_IND_IP_USER database table.
 */
@Entity
@Table(name = "IAM_IND_IP_USER")
@NamedQuery(name = "IamIndIpUser.deleteByIdUser", query = "DELETE FROM IamIndIpUser i where i.iamUser = :iamUser")
public class IamIndIpUser implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idIndIpUser;

    private String cdIndIpUser;

    private IamUser iamUser;

    public IamIndIpUser() {/* Hibernate */
    }

    @Id
    // "IAM_IND_IP_USER_IDINDIPUSER_GENERATOR",
    // sequenceName = "SIAM_IND_IP_USER",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IAM_IND_IP_USER_IDINDIPUSER_GENERATOR")
    @Column(name = "ID_IND_IP_USER")
    @GenericGenerator(name = "SIAM_IND_IP_USER_ID_IND_IP_USER_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SIAM_IND_IP_USER"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SIAM_IND_IP_USER_ID_IND_IP_USER_GENERATOR")
    public Long getIdIndIpUser() {
        return this.idIndIpUser;
    }

    public void setIdIndIpUser(Long idIndIpUser) {
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
