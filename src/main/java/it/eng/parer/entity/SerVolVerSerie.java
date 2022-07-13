package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the SER_VOL_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_VOL_VER_SERIE")
@NamedQuery(name = "SerVolVerSerie.findAll", query = "SELECT s FROM SerVolVerSerie s")
public class SerVolVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idVolVerSerie;
    private BigDecimal idFirstUdAppartVol;
    private BigDecimal idLastUdAppartVol;
    private BigDecimal niUnitaDocVol;
    private BigDecimal pgVolVerSerie;
    private List<AroUdAppartVerSerie> aroUdAppartVerSeries;
    private SerVerSerie serVerSerie;
    private List<SerIxVolVerSerie> serIxVolVerSeries;

    public SerVolVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_VOL_VER_SERIE_IDVOLVERSERIE_GENERATOR", sequenceName = "SSER_VOL_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_VOL_VER_SERIE_IDVOLVERSERIE_GENERATOR")
    @Column(name = "ID_VOL_VER_SERIE")
    public long getIdVolVerSerie() {
        return this.idVolVerSerie;
    }

    public void setIdVolVerSerie(long idVolVerSerie) {
        this.idVolVerSerie = idVolVerSerie;
    }

    @Column(name = "ID_FIRST_UD_APPART_VOL")
    public BigDecimal getIdFirstUdAppartVol() {
        return this.idFirstUdAppartVol;
    }

    public void setIdFirstUdAppartVol(BigDecimal idFirstUdAppartVol) {
        this.idFirstUdAppartVol = idFirstUdAppartVol;
    }

    @Column(name = "ID_LAST_UD_APPART_VOL")
    public BigDecimal getIdLastUdAppartVol() {
        return this.idLastUdAppartVol;
    }

    public void setIdLastUdAppartVol(BigDecimal idLastUdAppartVol) {
        this.idLastUdAppartVol = idLastUdAppartVol;
    }

    @Column(name = "NI_UNITA_DOC_VOL")
    public BigDecimal getNiUnitaDocVol() {
        return this.niUnitaDocVol;
    }

    public void setNiUnitaDocVol(BigDecimal niUnitaDocVol) {
        this.niUnitaDocVol = niUnitaDocVol;
    }

    @Column(name = "PG_VOL_VER_SERIE")
    public BigDecimal getPgVolVerSerie() {
        return this.pgVolVerSerie;
    }

    public void setPgVolVerSerie(BigDecimal pgVolVerSerie) {
        this.pgVolVerSerie = pgVolVerSerie;
    }

    // bi-directional many-to-one association to AroUdAppartVerSerie
    @OneToMany(mappedBy = "serVolVerSerie")
    public List<AroUdAppartVerSerie> getAroUdAppartVerSeries() {
        return this.aroUdAppartVerSeries;
    }

    public void setAroUdAppartVerSeries(List<AroUdAppartVerSerie> aroUdAppartVerSeries) {
        this.aroUdAppartVerSeries = aroUdAppartVerSeries;
    }

    public AroUdAppartVerSerie addAroUdAppartVerSery(AroUdAppartVerSerie aroUdAppartVerSery) {
        getAroUdAppartVerSeries().add(aroUdAppartVerSery);
        aroUdAppartVerSery.setSerVolVerSerie(this);

        return aroUdAppartVerSery;
    }

    public AroUdAppartVerSerie removeAroUdAppartVerSery(AroUdAppartVerSerie aroUdAppartVerSery) {
        getAroUdAppartVerSeries().remove(aroUdAppartVerSery);
        aroUdAppartVerSery.setSerVolVerSerie(null);

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

    // bi-directional many-to-one association to SerIxVolVerSerie
    @OneToMany(mappedBy = "serVolVerSerie")
    public List<SerIxVolVerSerie> getSerIxVolVerSeries() {
        return this.serIxVolVerSeries;
    }

    public void setSerIxVolVerSeries(List<SerIxVolVerSerie> serIxVolVerSeries) {
        this.serIxVolVerSeries = serIxVolVerSeries;
    }

    public SerIxVolVerSerie addSerIxVolVerSery(SerIxVolVerSerie serIxVolVerSery) {
        getSerIxVolVerSeries().add(serIxVolVerSery);
        serIxVolVerSery.setSerVolVerSerie(this);

        return serIxVolVerSery;
    }

    public SerIxVolVerSerie removeSerIxVolVerSery(SerIxVolVerSerie serIxVolVerSery) {
        getSerIxVolVerSeries().remove(serIxVolVerSery);
        serIxVolVerSery.setSerVolVerSerie(null);

        return serIxVolVerSery;
    }

}