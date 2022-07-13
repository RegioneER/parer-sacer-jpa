package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the DEC_FILTRO_SEL_UD database table.
 * 
 */
@Entity
@Table(name = "DEC_FILTRO_SEL_UD")
@NamedQuery(name = "DecFiltroSelUd.findAll", query = "SELECT d FROM DecFiltroSelUd d")
public class DecFiltroSelUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFiltroSelUd;
    private BigDecimal pgFiltro;
    private String tiFiltro;
    private DecTipoDoc decTipoDoc;
    private DecTipoSerieUd decTipoSerieUd;

    public DecFiltroSelUd() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FILTRO_SEL_UD_IDFILTROSELUD_GENERATOR", sequenceName = "SDEC_FILTRO_SEL_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FILTRO_SEL_UD_IDFILTROSELUD_GENERATOR")
    @Column(name = "ID_FILTRO_SEL_UD")
    public long getIdFiltroSelUd() {
        return this.idFiltroSelUd;
    }

    public void setIdFiltroSelUd(long idFiltroSelUd) {
        this.idFiltroSelUd = idFiltroSelUd;
    }

    @Column(name = "PG_FILTRO")
    public BigDecimal getPgFiltro() {
        return this.pgFiltro;
    }

    public void setPgFiltro(BigDecimal pgFiltro) {
        this.pgFiltro = pgFiltro;
    }

    @Column(name = "TI_FILTRO")
    public String getTiFiltro() {
        return this.tiFiltro;
    }

    public void setTiFiltro(String tiFiltro) {
        this.tiFiltro = tiFiltro;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC_PRINC")
    public DecTipoDoc getDecTipoDoc() {
        return this.decTipoDoc;
    }

    public void setDecTipoDoc(DecTipoDoc decTipoDoc) {
        this.decTipoDoc = decTipoDoc;
    }

    // bi-directional many-to-one association to DecTipoSerieUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERIE_UD")
    public DecTipoSerieUd getDecTipoSerieUd() {
        return this.decTipoSerieUd;
    }

    public void setDecTipoSerieUd(DecTipoSerieUd decTipoSerieUd) {
        this.decTipoSerieUd = decTipoSerieUd;
    }

}