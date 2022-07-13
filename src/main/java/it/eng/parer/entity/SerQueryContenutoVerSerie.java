package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the SER_QUERY_CONTENUTO_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_QUERY_CONTENUTO_VER_SERIE")
@NamedQuery(name = "SerQueryContenutoVerSerie.findAll", query = "SELECT s FROM SerQueryContenutoVerSerie s")
public class SerQueryContenutoVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idQueryContenutoVerSerie;
    private String blQuery;
    private BigDecimal idRegistroUnitaDoc;
    private BigDecimal idTipoUnitaDoc;
    private SerContenutoVerSerie serContenutoVerSerie;

    public SerQueryContenutoVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_QUERY_CONTENUTO_VER_SERIE_IDQUERYCONTENUTOVERSERIE_GENERATOR", sequenceName = "SSER_QUERY_CONTENUTO_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_QUERY_CONTENUTO_VER_SERIE_IDQUERYCONTENUTOVERSERIE_GENERATOR")
    @Column(name = "ID_QUERY_CONTENUTO_VER_SERIE")
    public long getIdQueryContenutoVerSerie() {
        return this.idQueryContenutoVerSerie;
    }

    public void setIdQueryContenutoVerSerie(long idQueryContenutoVerSerie) {
        this.idQueryContenutoVerSerie = idQueryContenutoVerSerie;
    }

    @Lob
    @Column(name = "BL_QUERY")
    public String getBlQuery() {
        return this.blQuery;
    }

    public void setBlQuery(String blQuery) {
        this.blQuery = blQuery;
    }

    @Column(name = "ID_REGISTRO_UNITA_DOC")
    public BigDecimal getIdRegistroUnitaDoc() {
        return this.idRegistroUnitaDoc;
    }

    public void setIdRegistroUnitaDoc(BigDecimal idRegistroUnitaDoc) {
        this.idRegistroUnitaDoc = idRegistroUnitaDoc;
    }

    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return this.idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
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

}