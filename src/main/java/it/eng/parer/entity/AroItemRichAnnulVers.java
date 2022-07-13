package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the ARO_ITEM_RICH_ANNUL_VERS database table.
 * 
 */
@Entity
@Table(name = "ARO_ITEM_RICH_ANNUL_VERS")
@NamedQuery(name = "AroItemRichAnnulVers.findAll", query = "SELECT a FROM AroItemRichAnnulVers a")
public class AroItemRichAnnulVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idItemRichAnnulVers;
    private BigDecimal aaFascicolo;
    private BigDecimal aaKeyUnitaDoc;
    private String cdKeyFascicolo;
    private String cdKeyUnitaDoc;
    private String cdRegistroKeyUnitaDoc;
    private BigDecimal idStrut;
    private BigDecimal pgItemRichAnnulVers;
    private String tiItemRichAnnulVers;
    private String tiStatoItem;
    private List<AroErrRichAnnulVers> aroErrRichAnnulVers;
    private AroRichAnnulVers aroRichAnnulVers;
    private AroUnitaDoc aroUnitaDoc;
    private FasFascicolo fasFascicolo;

    public AroItemRichAnnulVers() {
    }

    @Id
    @SequenceGenerator(name = "ARO_ITEM_RICH_ANNUL_VERS_IDITEMRICHANNULVERS_GENERATOR", sequenceName = "SARO_ITEM_RICH_ANNUL_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_ITEM_RICH_ANNUL_VERS_IDITEMRICHANNULVERS_GENERATOR")
    @Column(name = "ID_ITEM_RICH_ANNUL_VERS")
    public long getIdItemRichAnnulVers() {
        return this.idItemRichAnnulVers;
    }

    public void setIdItemRichAnnulVers(long idItemRichAnnulVers) {
        this.idItemRichAnnulVers = idItemRichAnnulVers;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Column(name = "CD_KEY_FASCICOLO")
    public String getCdKeyFascicolo() {
        return this.cdKeyFascicolo;
    }

    public void setCdKeyFascicolo(String cdKeyFascicolo) {
        this.cdKeyFascicolo = cdKeyFascicolo;
    }

    @Column(name = "CD_KEY_UNITA_DOC")
    public String getCdKeyUnitaDoc() {
        return this.cdKeyUnitaDoc;
    }

    public void setCdKeyUnitaDoc(String cdKeyUnitaDoc) {
        this.cdKeyUnitaDoc = cdKeyUnitaDoc;
    }

    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC")
    public String getCdRegistroKeyUnitaDoc() {
        return this.cdRegistroKeyUnitaDoc;
    }

    public void setCdRegistroKeyUnitaDoc(String cdRegistroKeyUnitaDoc) {
        this.cdRegistroKeyUnitaDoc = cdRegistroKeyUnitaDoc;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "PG_ITEM_RICH_ANNUL_VERS")
    public BigDecimal getPgItemRichAnnulVers() {
        return this.pgItemRichAnnulVers;
    }

    public void setPgItemRichAnnulVers(BigDecimal pgItemRichAnnulVers) {
        this.pgItemRichAnnulVers = pgItemRichAnnulVers;
    }

    @Column(name = "TI_ITEM_RICH_ANNUL_VERS")
    public String getTiItemRichAnnulVers() {
        return this.tiItemRichAnnulVers;
    }

    public void setTiItemRichAnnulVers(String tiItemRichAnnulVers) {
        this.tiItemRichAnnulVers = tiItemRichAnnulVers;
    }

    @Column(name = "TI_STATO_ITEM")
    public String getTiStatoItem() {
        return this.tiStatoItem;
    }

    public void setTiStatoItem(String tiStatoItem) {
        this.tiStatoItem = tiStatoItem;
    }

    // bi-directional many-to-one association to AroErrRichAnnulVers
    @OneToMany(mappedBy = "aroItemRichAnnulVers", cascade = CascadeType.PERSIST)
    public List<AroErrRichAnnulVers> getAroErrRichAnnulVers() {
        return this.aroErrRichAnnulVers;
    }

    public void setAroErrRichAnnulVers(List<AroErrRichAnnulVers> aroErrRichAnnulVers) {
        this.aroErrRichAnnulVers = aroErrRichAnnulVers;
    }

    public AroErrRichAnnulVers addAroErrRichAnnulVers(AroErrRichAnnulVers aroErrRichAnnulVers) {
        getAroErrRichAnnulVers().add(aroErrRichAnnulVers);
        aroErrRichAnnulVers.setAroItemRichAnnulVers(this);

        return aroErrRichAnnulVers;
    }

    public AroErrRichAnnulVers removeAroErrRichAnnulVers(AroErrRichAnnulVers aroErrRichAnnulVers) {
        getAroErrRichAnnulVers().remove(aroErrRichAnnulVers);
        aroErrRichAnnulVers.setAroItemRichAnnulVers(null);

        return aroErrRichAnnulVers;
    }

    // bi-directional many-to-one association to AroRichAnnulVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RICH_ANNUL_VERS")
    public AroRichAnnulVers getAroRichAnnulVers() {
        return this.aroRichAnnulVers;
    }

    public void setAroRichAnnulVers(AroRichAnnulVers aroRichAnnulVers) {
        this.aroRichAnnulVers = aroRichAnnulVers;
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