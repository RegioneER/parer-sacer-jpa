package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import it.eng.parer.entity.constraint.FasStatoConservFascicolo.TiStatoConservazione;

/**
 * The persistent class for the FAS_STATO_CONSERV_FASCICOLO database table.
 */
@Entity
@Table(name = "FAS_STATO_CONSERV_FASCICOLO")
@NamedQuery(name = "FasStatoConservFascicolo.findAll", query = "SELECT e FROM FasStatoConservFascicolo e")
public class FasStatoConservFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idStatoConservFascicolo;

    private FasFascicolo fasFascicolo;

    private IamUser iamUser;

    private TiStatoConservazione tiStatoConservazione;

    private Date tsStato;

    public FasStatoConservFascicolo() {/* Hibernate */
    }

    @Id
    // "FAS_STATO_CONSERV_FASCICOLO_IDSTATOCONSERVFASCICOLO_GENERATOR",
    // sequenceName =
    // "SFAS_STATO_CONSERV_FASCICOLO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "FAS_STATO_CONSERV_FASCICOLO_IDSTATOCONSERVFASCICOLO_GENERATOR")
    @Column(name = "ID_STATO_CONSERV_FASCICOLO")
    @GenericGenerator(name = "SFAS_STATO_CONSERV_FASCICOLO_ID_STATO_CONSERV_FASCICOLO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_STATO_CONSERV_FASCICOLO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_STATO_CONSERV_FASCICOLO_ID_STATO_CONSERV_FASCICOLO_GENERATOR")
    public Long getIdStatoConservFascicolo() {
        return this.idStatoConservFascicolo;
    }

    public void setIdStatoConservFascicolo(Long idStatoConservFascicolo) {
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
