package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the SER_CONTENUTO_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_CONTENUTO_VER_SERIE")
@NamedQuery(name = "SerContenutoVerSerie.findAll", query = "SELECT s FROM SerContenutoVerSerie s")
public class SerContenutoVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idContenutoVerSerie;
    private Date dtStatoContenutoVerSerie;
    private String flTipoSerieUpd;
    private BigDecimal idFirstUdAppartVerSerie;
    private BigDecimal idLastUdAppartVerSerie;
    private BigDecimal niUdContenutoVerSerie;
    private String tiContenutoVerSerie;
    private String tiStatoContenutoVerSerie;
    private List<AroUdAppartVerSerie> aroUdAppartVerSeries;
    private SerVerSerie serVerSerie;
    private List<SerErrContenutoVerSerie> serErrContenutoVerSeries;
    private List<SerQueryContenutoVerSerie> serQueryContenutoVerSeries;

    public SerContenutoVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_CONTENUTO_VER_SERIE_IDCONTENUTOVERSERIE_GENERATOR", sequenceName = "SSER_CONTENUTO_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_CONTENUTO_VER_SERIE_IDCONTENUTOVERSERIE_GENERATOR")
    @Column(name = "ID_CONTENUTO_VER_SERIE")
    public long getIdContenutoVerSerie() {
        return this.idContenutoVerSerie;
    }

    public void setIdContenutoVerSerie(long idContenutoVerSerie) {
        this.idContenutoVerSerie = idContenutoVerSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_STATO_CONTENUTO_VER_SERIE")
    public Date getDtStatoContenutoVerSerie() {
        return this.dtStatoContenutoVerSerie;
    }

    public void setDtStatoContenutoVerSerie(Date dtStatoContenutoVerSerie) {
        this.dtStatoContenutoVerSerie = dtStatoContenutoVerSerie;
    }

    @Column(name = "FL_TIPO_SERIE_UPD")
    public String getFlTipoSerieUpd() {
        return this.flTipoSerieUpd;
    }

    public void setFlTipoSerieUpd(String flTipoSerieUpd) {
        this.flTipoSerieUpd = flTipoSerieUpd;
    }

    @Column(name = "ID_FIRST_UD_APPART_VER_SERIE")
    public BigDecimal getIdFirstUdAppartVerSerie() {
        return this.idFirstUdAppartVerSerie;
    }

    public void setIdFirstUdAppartVerSerie(BigDecimal idFirstUdAppartVerSerie) {
        this.idFirstUdAppartVerSerie = idFirstUdAppartVerSerie;
    }

    @Column(name = "ID_LAST_UD_APPART_VER_SERIE")
    public BigDecimal getIdLastUdAppartVerSerie() {
        return this.idLastUdAppartVerSerie;
    }

    public void setIdLastUdAppartVerSerie(BigDecimal idLastUdAppartVerSerie) {
        this.idLastUdAppartVerSerie = idLastUdAppartVerSerie;
    }

    @Column(name = "NI_UD_CONTENUTO_VER_SERIE")
    public BigDecimal getNiUdContenutoVerSerie() {
        return this.niUdContenutoVerSerie;
    }

    public void setNiUdContenutoVerSerie(BigDecimal niUdContenutoVerSerie) {
        this.niUdContenutoVerSerie = niUdContenutoVerSerie;
    }

    @Column(name = "TI_CONTENUTO_VER_SERIE")
    public String getTiContenutoVerSerie() {
        return this.tiContenutoVerSerie;
    }

    public void setTiContenutoVerSerie(String tiContenutoVerSerie) {
        this.tiContenutoVerSerie = tiContenutoVerSerie;
    }

    @Column(name = "TI_STATO_CONTENUTO_VER_SERIE")
    public String getTiStatoContenutoVerSerie() {
        return this.tiStatoContenutoVerSerie;
    }

    public void setTiStatoContenutoVerSerie(String tiStatoContenutoVerSerie) {
        this.tiStatoContenutoVerSerie = tiStatoContenutoVerSerie;
    }

    // bi-directional many-to-one association to AroUdAppartVerSerie
    @OneToMany(mappedBy = "serContenutoVerSerie", cascade = CascadeType.PERSIST)
    public List<AroUdAppartVerSerie> getAroUdAppartVerSeries() {
        return this.aroUdAppartVerSeries;
    }

    public void setAroUdAppartVerSeries(List<AroUdAppartVerSerie> aroUdAppartVerSeries) {
        this.aroUdAppartVerSeries = aroUdAppartVerSeries;
    }

    public AroUdAppartVerSerie addAroUdAppartVerSery(AroUdAppartVerSerie aroUdAppartVerSery) {
        getAroUdAppartVerSeries().add(aroUdAppartVerSery);
        aroUdAppartVerSery.setSerContenutoVerSerie(this);

        return aroUdAppartVerSery;
    }

    public AroUdAppartVerSerie removeAroUdAppartVerSery(AroUdAppartVerSerie aroUdAppartVerSery) {
        getAroUdAppartVerSeries().remove(aroUdAppartVerSery);
        aroUdAppartVerSery.setSerContenutoVerSerie(null);

        return aroUdAppartVerSery;
    }

    // bi-directional many-to-one association to SerVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VER_SERIE")
    public SerVerSerie getSerVerSerie() {
        return this.serVerSerie;
    }

    public void setSerVerSerie(SerVerSerie serVerSerie) {
        this.serVerSerie = serVerSerie;
    }

    // bi-directional many-to-one association to SerErrContenutoVerSerie
    @OneToMany(mappedBy = "serContenutoVerSerie", cascade = CascadeType.PERSIST)
    public List<SerErrContenutoVerSerie> getSerErrContenutoVerSeries() {
        return this.serErrContenutoVerSeries;
    }

    public void setSerErrContenutoVerSeries(List<SerErrContenutoVerSerie> serErrContenutoVerSeries) {
        this.serErrContenutoVerSeries = serErrContenutoVerSeries;
    }

    public SerErrContenutoVerSerie addSerErrContenutoVerSery(SerErrContenutoVerSerie serErrContenutoVerSery) {
        getSerErrContenutoVerSeries().add(serErrContenutoVerSery);
        serErrContenutoVerSery.setSerContenutoVerSerie(this);

        return serErrContenutoVerSery;
    }

    public SerErrContenutoVerSerie removeSerErrContenutoVerSery(SerErrContenutoVerSerie serErrContenutoVerSery) {
        getSerErrContenutoVerSeries().remove(serErrContenutoVerSery);
        serErrContenutoVerSery.setSerContenutoVerSerie(null);

        return serErrContenutoVerSery;
    }

    // bi-directional many-to-one association to SerQueryContenutoVerSerie
    @OneToMany(mappedBy = "serContenutoVerSerie", cascade = CascadeType.PERSIST)
    public List<SerQueryContenutoVerSerie> getSerQueryContenutoVerSeries() {
        return this.serQueryContenutoVerSeries;
    }

    public void setSerQueryContenutoVerSeries(List<SerQueryContenutoVerSerie> serQueryContenutoVerSeries) {
        this.serQueryContenutoVerSeries = serQueryContenutoVerSeries;
    }

    public SerQueryContenutoVerSerie addSerQueryContenutoVerSery(SerQueryContenutoVerSerie serQueryContenutoVerSery) {
        getSerQueryContenutoVerSeries().add(serQueryContenutoVerSery);
        serQueryContenutoVerSery.setSerContenutoVerSerie(this);

        return serQueryContenutoVerSery;
    }

    public SerQueryContenutoVerSerie removeSerQueryContenutoVerSery(
            SerQueryContenutoVerSerie serQueryContenutoVerSery) {
        getSerQueryContenutoVerSeries().remove(serQueryContenutoVerSery);
        serQueryContenutoVerSery.setSerContenutoVerSerie(null);

        return serQueryContenutoVerSery;
    }

}