package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the DEC_LINK_TIPO_SERIE database table.
 * 
 */
@Entity
@Table(name = "DEC_LINK_TIPO_SERIE")
@NamedQuery(name = "DecLinkTipoSerie.findAll", query = "SELECT d FROM DecLinkTipoSerie d")
public class DecLinkTipoSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idLinkTipoSerie;
    private String dsLinkTipoSerie;
    private DecTipoSerie decTipoSeriePartenza;
    private DecTipoSerie decTipoSerieArrivo;

    public DecLinkTipoSerie() {
    }

    @Id
    @SequenceGenerator(name = "DEC_LINK_TIPO_SERIE_IDLINKTIPOSERIE_GENERATOR", sequenceName = "SDEC_LINK_TIPO_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_LINK_TIPO_SERIE_IDLINKTIPOSERIE_GENERATOR")
    @Column(name = "ID_LINK_TIPO_SERIE")
    public long getIdLinkTipoSerie() {
        return this.idLinkTipoSerie;
    }

    public void setIdLinkTipoSerie(long idLinkTipoSerie) {
        this.idLinkTipoSerie = idLinkTipoSerie;
    }

    @Column(name = "DS_LINK_TIPO_SERIE")
    public String getDsLinkTipoSerie() {
        return this.dsLinkTipoSerie;
    }

    public void setDsLinkTipoSerie(String dsLinkTipoSerie) {
        this.dsLinkTipoSerie = dsLinkTipoSerie;
    }

    // bi-directional many-to-one association to DecTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERIE_PARTENZA")
    public DecTipoSerie getDecTipoSeriePartenza() {
        return this.decTipoSeriePartenza;
    }

    public void setDecTipoSeriePartenza(DecTipoSerie decTipoSeriePartenza) {
        this.decTipoSeriePartenza = decTipoSeriePartenza;
    }

    // bi-directional many-to-one association to DecTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERIE_ARRIVO")
    public DecTipoSerie getDecTipoSerieArrivo() {
        return this.decTipoSerieArrivo;
    }

    public void setDecTipoSerieArrivo(DecTipoSerie decTipoSerieArrivo) {
        this.decTipoSerieArrivo = decTipoSerieArrivo;
    }

}