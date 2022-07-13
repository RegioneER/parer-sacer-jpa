package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the IAM_ABIL_ORGANIZ database table.
 *
 */
@Entity
@Table(name = "IAM_ABIL_ORGANIZ")
@NamedQuery(name = "IamAbilOrganiz.deleteByIdUser", query = "DELETE FROM IamAbilOrganiz i where i.iamUser = :iamUser")
public class IamAbilOrganiz implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idAbilOrganiz;
    private String flOrganizDefault;
    private BigDecimal idOrganizApplic;
    private IamUser iamUser;
    private List<IamAbilTipoDato> iamAbilTipoDatos;
    private List<IamAutorServ> iamAutorServs;

    public IamAbilOrganiz() {
    }

    @Id
    @SequenceGenerator(name = "IAM_ABIL_ORGANIZ_IDABILORGANIZ_GENERATOR", sequenceName = "SIAM_ABIL_ORGANIZ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IAM_ABIL_ORGANIZ_IDABILORGANIZ_GENERATOR")
    @Column(name = "ID_ABIL_ORGANIZ")
    public long getIdAbilOrganiz() {
        return this.idAbilOrganiz;
    }

    public void setIdAbilOrganiz(long idAbilOrganiz) {
        this.idAbilOrganiz = idAbilOrganiz;
    }

    @Column(name = "FL_ORGANIZ_DEFAULT")
    public String getFlOrganizDefault() {
        return this.flOrganizDefault;
    }

    public void setFlOrganizDefault(String flOrganizDefault) {
        this.flOrganizDefault = flOrganizDefault;
    }

    @Column(name = "ID_ORGANIZ_APPLIC")
    public BigDecimal getIdOrganizApplic() {
        return this.idOrganizApplic;
    }

    public void setIdOrganizApplic(BigDecimal idOrganizApplic) {
        this.idOrganizApplic = idOrganizApplic;
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

    // bi-directional many-to-one association to IamAbilTipoDato
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
            CascadeType.REMOVE }, mappedBy = "iamAbilOrganiz")
    public List<IamAbilTipoDato> getIamAbilTipoDatos() {
        return this.iamAbilTipoDatos;
    }

    public void setIamAbilTipoDatos(List<IamAbilTipoDato> iamAbilTipoDatos) {
        this.iamAbilTipoDatos = iamAbilTipoDatos;
    }

    // bi-directional many-to-one association to IamAutorServ
    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH,
            CascadeType.REMOVE }, mappedBy = "iamAbilOrganiz")
    public List<IamAutorServ> getIamAutorServs() {
        return this.iamAutorServs;
    }

    public void setIamAutorServs(List<IamAutorServ> iamAutorServs) {
        this.iamAutorServs = iamAutorServs;
    }

}
