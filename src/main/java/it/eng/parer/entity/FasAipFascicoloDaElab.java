package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the FAS_AIP_FASCICOLO_DA_ELAB database table.
 *
 */
@Entity
@Table(name = "FAS_AIP_FASCICOLO_DA_ELAB")
public class FasAipFascicoloDaElab implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idAipFascicoloDaElab;
    private String dsCausale;
    private Date dtCreazioneDaElab;
    private BigDecimal pgCreazioneDaElab;
    private String tiCreazione;
    private List<FasUdAipFascicoloDaElab> fasUdAipFascicoloDaElabs;
    private FasFascicolo fasFascicolo;
    private ElvElencoVersFasc elvElencoVersFasc;

    public FasAipFascicoloDaElab() {
    }

    @Id
    @SequenceGenerator(name = "FAS_AIP_FASCICOLO_DA_ELAB_IDAIPFASCICOLODAELAB_GENERATOR", allocationSize = 1, sequenceName = "SFAS_AIP_FASCICOLO_DA_ELAB")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_AIP_FASCICOLO_DA_ELAB_IDAIPFASCICOLODAELAB_GENERATOR")
    @Column(name = "ID_AIP_FASCICOLO_DA_ELAB")
    public long getIdAipFascicoloDaElab() {
        return this.idAipFascicoloDaElab;
    }

    public void setIdAipFascicoloDaElab(long idAipFascicoloDaElab) {
        this.idAipFascicoloDaElab = idAipFascicoloDaElab;
    }

    @Column(name = "DS_CAUSALE")
    public String getDsCausale() {
        return this.dsCausale;
    }

    public void setDsCausale(String dsCausale) {
        this.dsCausale = dsCausale;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE_DA_ELAB")
    public Date getDtCreazioneDaElab() {
        return this.dtCreazioneDaElab;
    }

    public void setDtCreazioneDaElab(Date dtCreazioneDaElab) {
        this.dtCreazioneDaElab = dtCreazioneDaElab;
    }

    @Column(name = "PG_CREAZIONE_DA_ELAB")
    public BigDecimal getPgCreazioneDaElab() {
        return this.pgCreazioneDaElab;
    }

    public void setPgCreazioneDaElab(BigDecimal pgCreazioneDaElab) {
        this.pgCreazioneDaElab = pgCreazioneDaElab;
    }

    @Column(name = "TI_CREAZIONE")
    public String getTiCreazione() {
        return this.tiCreazione;
    }

    public void setTiCreazione(String tiCreazione) {
        this.tiCreazione = tiCreazione;
    }

    // bi-directional many-to-one association to FasUdAipFascicoloDaElab
    @OneToMany(mappedBy = "fasAipFascicoloDaElab")
    public List<FasUdAipFascicoloDaElab> getFasUdAipFascicoloDaElabs() {
        return this.fasUdAipFascicoloDaElabs;
    }

    public void setFasUdAipFascicoloDaElabs(List<FasUdAipFascicoloDaElab> fasUdAipFascicoloDaElabs) {
        this.fasUdAipFascicoloDaElabs = fasUdAipFascicoloDaElabs;
    }

    public FasUdAipFascicoloDaElab addFasUdAipFascicoloDaElab(FasUdAipFascicoloDaElab fasUdAipFascicoloDaElab) {
        getFasUdAipFascicoloDaElabs().add(fasUdAipFascicoloDaElab);
        fasUdAipFascicoloDaElab.setFasAipFascicoloDaElab(this);

        return fasUdAipFascicoloDaElab;
    }

    public FasUdAipFascicoloDaElab removeFasUdAipFascicoloDaElab(FasUdAipFascicoloDaElab fasUdAipFascicoloDaElab) {
        getFasUdAipFascicoloDaElabs().remove(fasUdAipFascicoloDaElab);
        fasUdAipFascicoloDaElab.setFasAipFascicoloDaElab(null);

        return fasUdAipFascicoloDaElab;
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

    // bi-directional many-to-one association to ElvElencoVersFasc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS_FASC")
    public ElvElencoVersFasc getElvElencoVersFasc() {
        return this.elvElencoVersFasc;
    }

    public void setElvElencoVersFasc(ElvElencoVersFasc elvElencoVersFasc) {
        this.elvElencoVersFasc = elvElencoVersFasc;
    }

}
