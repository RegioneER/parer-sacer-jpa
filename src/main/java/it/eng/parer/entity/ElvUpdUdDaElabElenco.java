package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.ElvUpdUdDaElabElenco.ElvUpdUdDaElabTiStatoUpdElencoVers;

import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_UPD_UD_DA_ELAB_ELENCO database table.
 * 
 */
@Entity
@Table(name = "ELV_UPD_UD_DA_ELAB_ELENCO")
@NamedQuery(name = "ElvUpdUdDaElabElenco.findAll", query = "SELECT e FROM ElvUpdUdDaElabElenco e")
public class ElvUpdUdDaElabElenco implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUpdUdDaElabElenco;
    private BigDecimal aaKeyUnitaDoc;
    private Date dtCreazione;
    private OrgStrut orgStrut;
    private OrgSubStrut orgSubStrut;
    private AroUpdUnitaDoc aroUpdUnitaDoc;
    private ElvUpdUdDaElabTiStatoUpdElencoVers tiStatoUpdElencoVers;
    private DecRegistroUnitaDoc decRegistroUnitaDoc;
    private DecTipoUnitaDoc decTipoUnitaDoc;
    private DecTipoDoc decTipoDocPrinc;

    public ElvUpdUdDaElabElenco() {
    }

    @Id
    @SequenceGenerator(name = "ELV_UPD_UD_DA_ELAB_ELENCO_IDUPDUDDAELABELENCO_GENERATOR", sequenceName = "SELV_UPD_UD_DA_ELAB_ELENCO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_UPD_UD_DA_ELAB_ELENCO_IDUPDUDDAELABELENCO_GENERATOR")
    @Column(name = "ID_UPD_UD_DA_ELAB_ELENCO")
    public long getIdUpdUdDaElabElenco() {
        return this.idUpdUdDaElabElenco;
    }

    public void setIdUpdUdDaElabElenco(long idUpdUdDaElabElenco) {
        this.idUpdUdDaElabElenco = idUpdUdDaElabElenco;
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

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to OrgSubStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SUB_STRUT")
    public OrgSubStrut getOrgSubStrut() {
        return this.orgSubStrut;
    }

    public void setOrgSubStrut(OrgSubStrut orgSubStrut) {
        this.orgSubStrut = orgSubStrut;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO_UPD_ELENCO_VERS")
    public ElvUpdUdDaElabTiStatoUpdElencoVers getTiStatoUpdElencoVers() {
        return this.tiStatoUpdElencoVers;
    }

    public void setTiStatoUpdElencoVers(ElvUpdUdDaElabTiStatoUpdElencoVers tiStatoUpdElencoVers) {
        this.tiStatoUpdElencoVers = tiStatoUpdElencoVers;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_UNITA_DOC")
    public DecRegistroUnitaDoc getDecRegistroUnitaDoc() {
        return this.decRegistroUnitaDoc;
    }

    public void setDecRegistroUnitaDoc(DecRegistroUnitaDoc decRegistroUnitaDoc) {
        this.decRegistroUnitaDoc = decRegistroUnitaDoc;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC_PRINC")
    public DecTipoDoc getDecTipoDocPrinc() {
        return this.decTipoDocPrinc;
    }

    public void setDecTipoDocPrinc(DecTipoDoc decTipoDocPrinc) {
        this.decTipoDocPrinc = decTipoDocPrinc;
    }
}
