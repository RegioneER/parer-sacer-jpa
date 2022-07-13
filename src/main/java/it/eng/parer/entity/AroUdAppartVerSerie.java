package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_UD_APPART_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "ARO_UD_APPART_VER_SERIE")
@NamedQuery(name = "AroUdAppartVerSerie.findAll", query = "SELECT a FROM AroUdAppartVerSerie a")
public class AroUdAppartVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUdAppartVerSerie;
    private String cdUdSerie;
    private String dsKeyOrdUdSerie;
    private Date dtUdSerie;
    private BigDecimal idVerIndiceAipUd;
    private String infoUdSerie;
    private BigDecimal pgUdSerie;
    private AroUnitaDoc aroUnitaDoc;
    private SerContenutoVerSerie serContenutoVerSerie;
    private SerVolVerSerie serVolVerSerie;

    public AroUdAppartVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UD_APPART_VER_SERIE_IDUDAPPARTVERSERIE_GENERATOR", sequenceName = "SARO_UD_APPART_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UD_APPART_VER_SERIE_IDUDAPPARTVERSERIE_GENERATOR")
    @Column(name = "ID_UD_APPART_VER_SERIE")
    public long getIdUdAppartVerSerie() {
        return this.idUdAppartVerSerie;
    }

    public void setIdUdAppartVerSerie(long idUdAppartVerSerie) {
        this.idUdAppartVerSerie = idUdAppartVerSerie;
    }

    @Column(name = "CD_UD_SERIE")
    public String getCdUdSerie() {
        return this.cdUdSerie;
    }

    public void setCdUdSerie(String cdUdSerie) {
        this.cdUdSerie = cdUdSerie;
    }

    @Column(name = "DS_KEY_ORD_UD_SERIE")
    public String getDsKeyOrdUdSerie() {
        return this.dsKeyOrdUdSerie;
    }

    public void setDsKeyOrdUdSerie(String dsKeyOrdUdSerie) {
        this.dsKeyOrdUdSerie = dsKeyOrdUdSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_UD_SERIE")
    public Date getDtUdSerie() {
        return this.dtUdSerie;
    }

    public void setDtUdSerie(Date dtUdSerie) {
        this.dtUdSerie = dtUdSerie;
    }

    @Column(name = "ID_VER_INDICE_AIP_UD")
    public BigDecimal getIdVerIndiceAipUd() {
        return this.idVerIndiceAipUd;
    }

    public void setIdVerIndiceAipUd(BigDecimal idVerIndiceAipUd) {
        this.idVerIndiceAipUd = idVerIndiceAipUd;
    }

    @Column(name = "INFO_UD_SERIE")
    public String getInfoUdSerie() {
        return this.infoUdSerie;
    }

    public void setInfoUdSerie(String infoUdSerie) {
        this.infoUdSerie = infoUdSerie;
    }

    @Column(name = "PG_UD_SERIE")
    public BigDecimal getPgUdSerie() {
        return this.pgUdSerie;
    }

    public void setPgUdSerie(BigDecimal pgUdSerie) {
        this.pgUdSerie = pgUdSerie;
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

    // bi-directional many-to-one association to SerContenutoVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTENUTO_VER_SERIE")
    public SerContenutoVerSerie getSerContenutoVerSerie() {
        return this.serContenutoVerSerie;
    }

    public void setSerContenutoVerSerie(SerContenutoVerSerie serContenutoVerSerie) {
        this.serContenutoVerSerie = serContenutoVerSerie;
    }

    // bi-directional many-to-one association to SerVolVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VOL_VER_SERIE")
    public SerVolVerSerie getSerVolVerSerie() {
        return this.serVolVerSerie;
    }

    public void setSerVolVerSerie(SerVolVerSerie serVolVerSerie) {
        this.serVolVerSerie = serVolVerSerie;
    }

}