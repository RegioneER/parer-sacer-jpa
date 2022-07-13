package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the ARO_INDICE_AIP_UD_DA_ELAB database table.
 *
 */
@Entity
@Table(name = "ARO_INDICE_AIP_UD_DA_ELAB")
public class AroIndiceAipUdDaElab implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idIndiceAipDaElab;
    private String dsCausale;
    private Date dtCreazioneDaElab;
    private BigDecimal pgCreazioneDaElab;
    private String tiCreazione;
    private List<AroCompIndiceAipDaElab> aroCompIndiceAipDaElabs;
    private AroUnitaDoc aroUnitaDoc;
    private ElvElencoVer elvElencoVer;
    private String flInCoda;
    private Date tsInCoda;

    public AroIndiceAipUdDaElab() {
    }

    @Id
    @SequenceGenerator(name = "ARO_INDICE_AIP_UD_DA_ELAB_IDINDICEAIPDAELAB_GENERATOR", allocationSize = 1, sequenceName = "SARO_INDICE_AIP_UD_DA_ELAB")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_INDICE_AIP_UD_DA_ELAB_IDINDICEAIPDAELAB_GENERATOR")
    @Column(name = "ID_INDICE_AIP_DA_ELAB")
    public long getIdIndiceAipDaElab() {
        return this.idIndiceAipDaElab;
    }

    public void setIdIndiceAipDaElab(long idIndiceAipDaElab) {
        this.idIndiceAipDaElab = idIndiceAipDaElab;
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

    // bi-directional many-to-one association to AroCompIndiceAipDaElab
    @OneToMany(mappedBy = "aroIndiceAipUdDaElab")
    public List<AroCompIndiceAipDaElab> getAroCompIndiceAipDaElabs() {
        return this.aroCompIndiceAipDaElabs;
    }

    public void setAroCompIndiceAipDaElabs(List<AroCompIndiceAipDaElab> aroCompIndiceAipDaElabs) {
        this.aroCompIndiceAipDaElabs = aroCompIndiceAipDaElabs;
    }

    public AroCompIndiceAipDaElab addAroCompIndiceAipDaElab(AroCompIndiceAipDaElab aroCompIndiceAipDaElab) {
        getAroCompIndiceAipDaElabs().add(aroCompIndiceAipDaElab);
        aroCompIndiceAipDaElab.setAroIndiceAipUdDaElab(this);

        return aroCompIndiceAipDaElab;
    }

    public AroCompIndiceAipDaElab removeAroCompIndiceAipDaElab(AroCompIndiceAipDaElab aroCompIndiceAipDaElab) {
        getAroCompIndiceAipDaElabs().remove(aroCompIndiceAipDaElab);
        aroCompIndiceAipDaElab.setAroIndiceAipUdDaElab(null);

        return aroCompIndiceAipDaElab;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
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

    @Column(name = "FL_IN_CODA")
    public String getFlInCoda() {
        return flInCoda;
    }

    public void setFlInCoda(String flInCoda) {
        this.flInCoda = flInCoda;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_IN_CODA")
    public Date getTsInCoda() {
        return tsInCoda;
    }

    public void setTsInCoda(Date tsInCoda) {
        this.tsInCoda = tsInCoda;
    }

}
