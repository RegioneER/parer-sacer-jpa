package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.FasStatoConservFascicolo.TiStatoConservazione;

import java.util.Date;

/**
 * The persistent class for the FAS_STATO_CONSERV_FASCICOLO database table.
 * 
 */
@Entity
@Table(name = "FAS_STATO_CONSERV_FASCICOLO")
@NamedQuery(name = "FasStatoConservFascicolo.findAll", query = "SELECT e FROM FasStatoConservFascicolo e")
public class FasStatoConservFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idStatoConservFascicolo;
    private FasFascicolo fasFascicolo;
    private IamUser iamUser;
    private TiStatoConservazione tiStatoConservazione;
    private Date tsStato;

    public FasStatoConservFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_STATO_CONSERV_FASCICOLO_IDSTATOCONSERVFASCICOLO_GENERATOR", sequenceName = "SFAS_STATO_CONSERV_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_STATO_CONSERV_FASCICOLO_IDSTATOCONSERVFASCICOLO_GENERATOR")
    @Column(name = "ID_STATO_CONSERV_FASCICOLO")
    public long getIdStatoConservFascicolo() {
        return this.idStatoConservFascicolo;
    }

    public void setIdStatoConservFascicolo(long idStatoConservFascicolo) {
        this.idStatoConservFascicolo = idStatoConservFascicolo;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
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

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO_CONSERVAZIONE")
    public TiStatoConservazione getTiStatoConservazione() {
        return this.tiStatoConservazione;
    }

    public void setTiStatoConservazione(TiStatoConservazione tiStatoConservazione) {
        this.tiStatoConservazione = tiStatoConservazione;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_STATO")
    public Date getTsStato() {
        return this.tsStato;
    }

    public void setTsStato(Date tsStato) {
        this.tsStato = tsStato;
    }

}