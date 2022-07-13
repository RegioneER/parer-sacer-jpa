package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_STATO_RICH_ANNUL_VERS database table.
 * 
 */
@Entity
@Table(name = "ARO_STATO_RICH_ANNUL_VERS")
@NamedQuery(name = "AroStatoRichAnnulVers.findAll", query = "SELECT a FROM AroStatoRichAnnulVers a")
public class AroStatoRichAnnulVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idStatoRichAnnulVers;
    private String dsNotaRichAnnulVers;
    private Date dtRegStatoRichAnnulVers;
    private BigDecimal pgStatoRichAnnulVers;
    private String tiStatoRichAnnulVers;
    private AroRichAnnulVers aroRichAnnulVers;
    private IamUser iamUser;

    public AroStatoRichAnnulVers() {
    }

    @Id
    @SequenceGenerator(name = "ARO_STATO_RICH_ANNUL_VERS_IDSTATORICHANNULVERS_GENERATOR", sequenceName = "SARO_STATO_RICH_ANNUL_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_STATO_RICH_ANNUL_VERS_IDSTATORICHANNULVERS_GENERATOR")
    @Column(name = "ID_STATO_RICH_ANNUL_VERS")
    public long getIdStatoRichAnnulVers() {
        return this.idStatoRichAnnulVers;
    }

    public void setIdStatoRichAnnulVers(long idStatoRichAnnulVers) {
        this.idStatoRichAnnulVers = idStatoRichAnnulVers;
    }

    @Column(name = "DS_NOTA_RICH_ANNUL_VERS")
    public String getDsNotaRichAnnulVers() {
        return this.dsNotaRichAnnulVers;
    }

    public void setDsNotaRichAnnulVers(String dsNotaRichAnnulVers) {
        this.dsNotaRichAnnulVers = dsNotaRichAnnulVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_STATO_RICH_ANNUL_VERS")
    public Date getDtRegStatoRichAnnulVers() {
        return this.dtRegStatoRichAnnulVers;
    }

    public void setDtRegStatoRichAnnulVers(Date dtRegStatoRichAnnulVers) {
        this.dtRegStatoRichAnnulVers = dtRegStatoRichAnnulVers;
    }

    @Column(name = "PG_STATO_RICH_ANNUL_VERS")
    public BigDecimal getPgStatoRichAnnulVers() {
        return this.pgStatoRichAnnulVers;
    }

    public void setPgStatoRichAnnulVers(BigDecimal pgStatoRichAnnulVers) {
        this.pgStatoRichAnnulVers = pgStatoRichAnnulVers;
    }

    @Column(name = "TI_STATO_RICH_ANNUL_VERS")
    public String getTiStatoRichAnnulVers() {
        return this.tiStatoRichAnnulVers;
    }

    public void setTiStatoRichAnnulVers(String tiStatoRichAnnulVers) {
        this.tiStatoRichAnnulVers = tiStatoRichAnnulVers;
    }

    // bi-directional many-to-one association to AroRichAnnulVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RICH_ANNUL_VERS")
    public AroRichAnnulVers getAroRichAnnulVers() {
        return this.aroRichAnnulVers;
    }

    public void setAroRichAnnulVers(AroRichAnnulVers aroRichAnnulVers) {
        this.aroRichAnnulVers = aroRichAnnulVers;
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