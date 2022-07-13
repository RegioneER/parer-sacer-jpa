package it.eng.parer.entity;

import it.eng.parer.entity.constraint.ElvStatoElencoVer.TiStatoElenco;
import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the ELV_STATO_ELENCO_VERS database table.
 *
 */
@Entity
@Table(name = "ELV_STATO_ELENCO_VERS")
@NamedQuery(name = "ElvStatoElencoVer.findAll", query = "SELECT e FROM ElvStatoElencoVer e")
public class ElvStatoElencoVer implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idStatoElencoVers;
    private String dsCondStatoElencoVers;
    private BigDecimal idTiEveStatoElencoVers;
    private BigDecimal pgStatoElencoVers;
    private TiStatoElenco tiStatoElenco;
    private Date tsStatoElencoVers;
    private ElvElencoVer elvElencoVer;
    private IamUser iamUser;

    public ElvStatoElencoVer() {
    }

    @Id
    @SequenceGenerator(name = "ELV_STATO_ELENCO_VERS_IDSTATOELENCOVERS_GENERATOR", sequenceName = "SELV_STATO_ELENCO_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_STATO_ELENCO_VERS_IDSTATOELENCOVERS_GENERATOR")
    @Column(name = "ID_STATO_ELENCO_VERS")
    public long getIdStatoElencoVers() {
        return this.idStatoElencoVers;
    }

    public void setIdStatoElencoVers(long idStatoElencoVers) {
        this.idStatoElencoVers = idStatoElencoVers;
    }

    @Column(name = "DS_COND_STATO_ELENCO_VERS")
    public String getDsCondStatoElencoVers() {
        return this.dsCondStatoElencoVers;
    }

    public void setDsCondStatoElencoVers(String dsCondStatoElencoVers) {
        this.dsCondStatoElencoVers = dsCondStatoElencoVers;
    }

    @Column(name = "ID_TI_EVE_STATO_ELENCO_VERS")
    public BigDecimal getIdTiEveStatoElencoVers() {
        return this.idTiEveStatoElencoVers;
    }

    public void setIdTiEveStatoElencoVers(BigDecimal idTiEveStatoElencoVers) {
        this.idTiEveStatoElencoVers = idTiEveStatoElencoVers;
    }

    @Column(name = "PG_STATO_ELENCO_VERS")
    public BigDecimal getPgStatoElencoVers() {
        return this.pgStatoElencoVers;
    }

    public void setPgStatoElencoVers(BigDecimal pgStatoElencoVers) {
        this.pgStatoElencoVers = pgStatoElencoVers;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO_ELENCO")
    public TiStatoElenco getTiStatoElenco() {
        return this.tiStatoElenco;
    }

    public void setTiStatoElenco(TiStatoElenco tiStatoElenco) {
        this.tiStatoElenco = tiStatoElenco;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_STATO_ELENCO_VERS")
    public Date getTsStatoElencoVers() {
        return this.tsStatoElencoVers;
    }

    public void setTsStatoElencoVers(Date tsStatoElencoVers) {
        this.tsStatoElencoVers = tsStatoElencoVers;
    }

    // bi-directional many-to-one association to ElvElencoVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS")
    public ElvElencoVer getElvElencoVer() {
        return this.elvElencoVer;
    }

    public void setElvElencoVer(ElvElencoVer elvElencoVer) {
        this.elvElencoVer = elvElencoVer;
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
