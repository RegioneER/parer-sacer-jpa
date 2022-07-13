package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.FasStatoFascicoloElenco.TiStatoFascElenco;

import java.util.Date;

/**
 * The persistent class for the FAS_STATO_FASCICOLO_ELENCO database table.
 *
 */
@Entity
@Table(name = "FAS_STATO_FASCICOLO_ELENCO")
@NamedQueries({
        @NamedQuery(name = "FasStatoFascicoloElenco.findAll", query = "SELECT e FROM FasStatoFascicoloElenco e"),
        @NamedQuery(name = "FasStatoFascicoloElenco.findByFasFascicolo", query = "SELECT e FROM FasStatoFascicoloElenco e WHERE e.fasFascicolo = :fasFascicolo") })
public class FasStatoFascicoloElenco implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idStatoFascicoloElenco;
    private IamUser iamUser;
    private TiStatoFascElenco tiStatoFascElencoVers;
    private Date tsStato;
    private FasFascicolo fasFascicolo;

    public FasStatoFascicoloElenco() {
    }

    @Id
    @SequenceGenerator(name = "FAS_STATO_FASCICOLO_ELENCO_IDSTATOFASCICOLOELENCO_GENERATOR", sequenceName = "SFAS_STATO_FASCICOLO_ELENCO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_STATO_FASCICOLO_ELENCO_IDSTATOFASCICOLOELENCO_GENERATOR")
    @Column(name = "ID_STATO_FASCICOLO_ELENCO")
    public long getIdStatoFascicoloElenco() {
        return this.idStatoFascicoloElenco;
    }

    public void setIdStatoFascicoloElenco(long idStatoFascicoloElenco) {
        this.idStatoFascicoloElenco = idStatoFascicoloElenco;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO_FASC_ELENCO_VERS")
    public TiStatoFascElenco getTiStatoFascElencoVers() {
        return this.tiStatoFascElencoVers;
    }

    public void setTiStatoFascElencoVers(TiStatoFascElenco tiStatoFascElencoVers) {
        this.tiStatoFascElencoVers = tiStatoFascElencoVers;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_STATO")
    public Date getTsStato() {
        return this.tsStato;
    }

    public void setTsStato(Date tsStato) {
        this.tsStato = tsStato;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
    }
}