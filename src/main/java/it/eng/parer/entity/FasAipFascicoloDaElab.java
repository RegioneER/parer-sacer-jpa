package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the FAS_AIP_FASCICOLO_DA_ELAB database table.
 */
@Entity
@Table(name = "FAS_AIP_FASCICOLO_DA_ELAB")
public class FasAipFascicoloDaElab implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idAipFascicoloDaElab;

    private String dsCausale;

    private Date dtCreazioneDaElab;

    private BigDecimal pgCreazioneDaElab;

    private String tiCreazione;

    private List<FasUdAipFascicoloDaElab> fasUdAipFascicoloDaElabs = new ArrayList<>();

    private FasFascicolo fasFascicolo;

    private ElvElencoVersFasc elvElencoVersFasc;

    public FasAipFascicoloDaElab() {/* Hibernate */
    }

    @Id
    // "FAS_AIP_FASCICOLO_DA_ELAB_IDAIPFASCICOLODAELAB_GENERATOR",
    // allocationSize = 1, sequenceName =
    // "SFAS_AIP_FASCICOLO_DA_ELAB")
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "FAS_AIP_FASCICOLO_DA_ELAB_IDAIPFASCICOLODAELAB_GENERATOR")
    @Column(name = "ID_AIP_FASCICOLO_DA_ELAB")
    @GenericGenerator(name = "SFAS_AIP_FASCICOLO_DA_ELAB_ID_AIP_FASCICOLO_DA_ELAB_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_AIP_FASCICOLO_DA_ELAB"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_AIP_FASCICOLO_DA_ELAB_ID_AIP_FASCICOLO_DA_ELAB_GENERATOR")
    public Long getIdAipFascicoloDaElab() {
        return this.idAipFascicoloDaElab;
    }

    public void setIdAipFascicoloDaElab(Long idAipFascicoloDaElab) {
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
