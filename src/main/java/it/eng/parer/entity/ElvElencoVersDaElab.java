package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_ELENCO_VERS_DA_ELAB database table.
 *
 */
@Entity
@Table(name = "ELV_ELENCO_VERS_DA_ELAB")
@NamedQuery(name = "ElvElencoVersDaElab.findAll", query = "SELECT e FROM ElvElencoVersDaElab e")
public class ElvElencoVersDaElab implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idElencoVersDaElab;
    private BigDecimal aaKeyUnitaDoc;
    private BigDecimal idCriterioRaggr;
    private BigDecimal idStrut;
    private String tiStatoElenco;
    private ElvElencoVer elvElencoVer;
    private Date tsStatoElenco;

    public ElvElencoVersDaElab() {
    }

    @Id
    @SequenceGenerator(name = "ELV_ELENCO_VERS_DA_ELAB_IDELENCOVERSDAELAB_GENERATOR", sequenceName = "SELV_ELENCO_VERS_DA_ELAB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_ELENCO_VERS_DA_ELAB_IDELENCOVERSDAELAB_GENERATOR")
    @Column(name = "ID_ELENCO_VERS_DA_ELAB")
    public long getIdElencoVersDaElab() {
        return this.idElencoVersDaElab;
    }

    public void setIdElencoVersDaElab(long idElencoVersDaElab) {
        this.idElencoVersDaElab = idElencoVersDaElab;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Column(name = "ID_CRITERIO_RAGGR")
    public BigDecimal getIdCriterioRaggr() {
        return this.idCriterioRaggr;
    }

    public void setIdCriterioRaggr(BigDecimal idCriterioRaggr) {
        this.idCriterioRaggr = idCriterioRaggr;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "TI_STATO_ELENCO")
    public String getTiStatoElenco() {
        return this.tiStatoElenco;
    }

    public void setTiStatoElenco(String tiStatoElenco) {
        this.tiStatoElenco = tiStatoElenco;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_STATO_ELENCO")
    public Date getTsStatoElenco() {
        return tsStatoElenco;
    }

    public void setTsStatoElenco(Date tsStatoElenco) {
        this.tsStatoElenco = tsStatoElenco;
    }

}
