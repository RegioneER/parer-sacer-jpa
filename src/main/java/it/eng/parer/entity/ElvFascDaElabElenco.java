package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.ElvFascDaElabElenco.TiStatoFascDaElab;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_FASC_DA_ELAB_ELENCO database table.
 *
 */
@Entity
@Table(name = "ELV_FASC_DA_ELAB_ELENCO")
@NamedQuery(name = "ElvFascDaElabElenco.findAll", query = "SELECT e FROM ElvFascDaElabElenco e")
public class ElvFascDaElabElenco implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idFascDaElabElenco;
    private BigDecimal aaFascicolo;
    private Date tsVersFascicolo;
    private BigDecimal idStrut;
    private TiStatoFascDaElab tiStatoFascDaElab;
    private FasFascicolo fasFascicolo;
    private BigDecimal idTipoFascicolo;

    public ElvFascDaElabElenco() {
    }

    @Id
    @SequenceGenerator(name = "ELV_FASC_DA_ELAB_ELENCO_IDFASCDAELABELENCO_GENERATOR", sequenceName = "SELV_FASC_DA_ELAB_ELENCO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_FASC_DA_ELAB_ELENCO_IDFASCDAELABELENCO_GENERATOR")
    @Column(name = "ID_FASC_DA_ELAB_ELENCO")
    public long getIdFascDaElabElenco() {
        return this.idFascDaElabElenco;
    }

    public void setIdFascDaElabElenco(long idFascDaElabElenco) {
        this.idFascDaElabElenco = idFascDaElabElenco;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_VERS_FASCICOLO")
    public Date getTsVersFascicolo() {
        return this.tsVersFascicolo;
    }

    public void setTsVersFascicolo(Date tsVersFascicolo) {
        this.tsVersFascicolo = tsVersFascicolo;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO_FASC_DA_ELAB")
    public TiStatoFascDaElab getTiStatoFascDaElab() {
        return this.tiStatoFascDaElab;
    }

    public void setTiStatoFascDaElab(TiStatoFascDaElab tiStatoFascDaElab) {
        this.tiStatoFascDaElab = tiStatoFascDaElab;
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

    @Column(name = "ID_TIPO_FASCICOLO")
    public BigDecimal getIdTipoFascicolo() {
        return this.idTipoFascicolo;
    }

    public void setIdTipoFascicolo(BigDecimal idTipoFascicolo) {
        this.idTipoFascicolo = idTipoFascicolo;
    }

}
