package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the ARO_UD_ANNUL_DA_ELAB database table.
 * 
 */
@Entity
@Table(name = "ARO_UD_ANNUL_DA_ELAB")
@NamedQuery(name = "AroUdAnnulDaElab.findAll", query = "SELECT a FROM AroUdAnnulDaElab a")
public class AroUdAnnulDaElab implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUdAnnulDaElab;
    private Date dtAnnul;
    private Date dtCreazione;
    private BigDecimal idRegistroUnitaDoc;
    private BigDecimal idStrut;
    private BigDecimal idTipoUnitaDoc;
    private String tiStatoAnnul;
    private String tiStatoDtVers;
    private List<AroDocAnnulDaElab> aroDocAnnulDaElabs;
    private AroUnitaDoc aroUnitaDoc;

    public AroUdAnnulDaElab() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UD_ANNUL_DA_ELAB_IDUDANNULDAELAB_GENERATOR", sequenceName = "SARO_UD_ANNUL_DA_ELAB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UD_ANNUL_DA_ELAB_IDUDANNULDAELAB_GENERATOR")
    @Column(name = "ID_UD_ANNUL_DA_ELAB")
    public long getIdUdAnnulDaElab() {
        return this.idUdAnnulDaElab;
    }

    public void setIdUdAnnulDaElab(long idUdAnnulDaElab) {
        this.idUdAnnulDaElab = idUdAnnulDaElab;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ANNUL")
    public Date getDtAnnul() {
        return this.dtAnnul;
    }

    public void setDtAnnul(Date dtAnnul) {
        this.dtAnnul = dtAnnul;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "ID_REGISTRO_UNITA_DOC")
    public BigDecimal getIdRegistroUnitaDoc() {
        return this.idRegistroUnitaDoc;
    }

    public void setIdRegistroUnitaDoc(BigDecimal idRegistroUnitaDoc) {
        this.idRegistroUnitaDoc = idRegistroUnitaDoc;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return this.idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }

    @Column(name = "TI_STATO_ANNUL")
    public String getTiStatoAnnul() {
        return this.tiStatoAnnul;
    }

    public void setTiStatoAnnul(String tiStatoAnnul) {
        this.tiStatoAnnul = tiStatoAnnul;
    }

    @Column(name = "TI_STATO_DT_VERS")
    public String getTiStatoDtVers() {
        return this.tiStatoDtVers;
    }

    public void setTiStatoDtVers(String tiStatoDtVers) {
        this.tiStatoDtVers = tiStatoDtVers;
    }

    // bi-directional many-to-one association to AroDocAnnulDaElab
    @OneToMany(mappedBy = "aroUdAnnulDaElab")
    public List<AroDocAnnulDaElab> getAroDocAnnulDaElabs() {
        return this.aroDocAnnulDaElabs;
    }

    public void setAroDocAnnulDaElabs(List<AroDocAnnulDaElab> aroDocAnnulDaElabs) {
        this.aroDocAnnulDaElabs = aroDocAnnulDaElabs;
    }

    public AroDocAnnulDaElab addAroDocAnnulDaElab(AroDocAnnulDaElab aroDocAnnulDaElab) {
        getAroDocAnnulDaElabs().add(aroDocAnnulDaElab);
        aroDocAnnulDaElab.setAroUdAnnulDaElab(this);

        return aroDocAnnulDaElab;
    }

    public AroDocAnnulDaElab removeAroDocAnnulDaElab(AroDocAnnulDaElab aroDocAnnulDaElab) {
        getAroDocAnnulDaElabs().remove(aroDocAnnulDaElab);
        aroDocAnnulDaElab.setAroUdAnnulDaElab(null);

        return aroDocAnnulDaElab;
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