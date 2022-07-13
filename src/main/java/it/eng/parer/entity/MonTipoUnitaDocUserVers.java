package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the MON_TIPO_UNITA_DOC_USER_VERS database table.
 *
 */
@Entity
@Table(name = "MON_TIPO_UNITA_DOC_USER_VERS")
@NamedQuery(name = "MonTipoUnitaDocUserVers.findAll", query = "SELECT m FROM MonTipoUnitaDocUserVers m")
public class MonTipoUnitaDocUserVers implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idTipoUnitaDocUserVers;
    private Date dtRifConta;
    private BigDecimal niUnitaDocVers;
    private DecTipoUnitaDoc decTipoUnitaDoc;
    private IamUser iamUser;

    public MonTipoUnitaDocUserVers() {
    }

    @Id
    @SequenceGenerator(name = "MON_TIPO_UNITA_DOC_USER_VERS_IDTIPOUNITADOCUSERVERS_GENERATOR", sequenceName = "SMON_TIPO_UNITA_DOC_USER_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MON_TIPO_UNITA_DOC_USER_VERS_IDTIPOUNITADOCUSERVERS_GENERATOR")
    @Column(name = "ID_TIPO_UNITA_DOC_USER_VERS")
    public long getIdTipoUnitaDocUserVers() {
        return this.idTipoUnitaDocUserVers;
    }

    public void setIdTipoUnitaDocUserVers(long idTipoUnitaDocUserVers) {
        this.idTipoUnitaDocUserVers = idTipoUnitaDocUserVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return this.dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    @Column(name = "NI_UNITA_DOC_VERS")
    public BigDecimal getNiUnitaDocVers() {
        return this.niUnitaDocVers;
    }

    public void setNiUnitaDocVers(BigDecimal niUnitaDocVers) {
        this.niUnitaDocVers = niUnitaDocVers;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
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
