package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_DOC_AGG_DA_ELAB_ELENCO database table.
 *
 */
@Entity
@Table(name = "ELV_DOC_AGG_DA_ELAB_ELENCO")
@NamedQuery(name = "ElvDocAggDaElabElenco.findAll", query = "SELECT e FROM ElvDocAggDaElabElenco e")
public class ElvDocAggDaElabElenco implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idDocAggDaElabElenco;
    private BigDecimal aaKeyUnitaDoc;
    private Date dtCreazione;
    private BigDecimal idStrut;
    private String tiStatoDocDaElab;
    private AroDoc aroDoc;

    public ElvDocAggDaElabElenco() {
    }

    @Id
    @SequenceGenerator(name = "ELV_DOC_AGG_DA_ELAB_ELENCO_IDDOCAGGDAELABELENCO_GENERATOR", sequenceName = "SELV_DOC_AGG_DA_ELAB_ELENCO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_DOC_AGG_DA_ELAB_ELENCO_IDDOCAGGDAELABELENCO_GENERATOR")
    @Column(name = "ID_DOC_AGG_DA_ELAB_ELENCO")
    public long getIdDocAggDaElabElenco() {
        return this.idDocAggDaElabElenco;
    }

    public void setIdDocAggDaElabElenco(long idDocAggDaElabElenco) {
        this.idDocAggDaElabElenco = idDocAggDaElabElenco;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "TI_STATO_DOC_DA_ELAB")
    public String getTiStatoDocDaElab() {
        return this.tiStatoDocDaElab;
    }

    public void setTiStatoDocDaElab(String tiStatoDocDaElab) {
        this.tiStatoDocDaElab = tiStatoDocDaElab;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOC")
    public AroDoc getAroDoc() {
        return this.aroDoc;
    }

    public void setAroDoc(AroDoc aroDoc) {
        this.aroDoc = aroDoc;
    }

}
