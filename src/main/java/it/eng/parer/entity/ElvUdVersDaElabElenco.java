package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_UD_VERS_DA_ELAB_ELENCO database table.
 *
 */
@Entity
@Table(name = "ELV_UD_VERS_DA_ELAB_ELENCO")
@NamedQuery(name = "ElvUdVersDaElabElenco.findAll", query = "SELECT e FROM ElvUdVersDaElabElenco e")
public class ElvUdVersDaElabElenco implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idUdVersDaElabElenco;
    private BigDecimal aaKeyUnitaDoc;
    private Date dtCreazione;
    private BigDecimal idStrut;
    private String tiStatoUdDaElab;
    private AroUnitaDoc aroUnitaDoc;

    public ElvUdVersDaElabElenco() {
    }

    @Id
    @SequenceGenerator(name = "ELV_UD_VERS_DA_ELAB_ELENCO_IDUDVERSDAELABELENCO_GENERATOR", sequenceName = "SELV_UD_VERS_DA_ELAB_ELENCO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_UD_VERS_DA_ELAB_ELENCO_IDUDVERSDAELABELENCO_GENERATOR")
    @Column(name = "ID_UD_VERS_DA_ELAB_ELENCO")
    public long getIdUdVersDaElabElenco() {
        return this.idUdVersDaElabElenco;
    }

    public void setIdUdVersDaElabElenco(long idUdVersDaElabElenco) {
        this.idUdVersDaElabElenco = idUdVersDaElabElenco;
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

    @Column(name = "TI_STATO_UD_DA_ELAB")
    public String getTiStatoUdDaElab() {
        return this.tiStatoUdDaElab;
    }

    public void setTiStatoUdDaElab(String tiStatoUdDaElab) {
        this.tiStatoUdDaElab = tiStatoUdDaElab;
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

}
