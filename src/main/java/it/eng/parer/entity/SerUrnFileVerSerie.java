package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.SerUrnFileVerSerie.TiUrnFileVerSerie;

/**
 * The persistent class for the SER_URN_FILE_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_URN_FILE_VER_SERIE")
@NamedQuery(name = "SerUrnFileVerSerie.findAll", query = "SELECT s FROM SerUrnFileVerSerie s")
public class SerUrnFileVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUrnFileVerSerie;
    private String dsUrn;
    private TiUrnFileVerSerie tiUrn;
    private SerFileVerSerie serFileVerSerie;

    public SerUrnFileVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_URN_FILE_VER_SERIE_IDURNFILEVERSERIE_GENERATOR", sequenceName = "SSER_URN_FILE_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_URN_FILE_VER_SERIE_IDURNFILEVERSERIE_GENERATOR")
    @Column(name = "ID_URN_FILE_VER_SERIE")
    public long getIdUrnFileVerSerie() {
        return this.idUrnFileVerSerie;
    }

    public void setIdUrnFileVerSerie(long idUrnFileVerSerie) {
        this.idUrnFileVerSerie = idUrnFileVerSerie;
    }

    @Column(name = "DS_URN")
    public String getDsUrn() {
        return this.dsUrn;
    }

    public void setDsUrn(String dsUrn) {
        this.dsUrn = dsUrn;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_URN")
    public TiUrnFileVerSerie getTiUrn() {
        return this.tiUrn;
    }

    public void setTiUrn(TiUrnFileVerSerie tiUrn) {
        this.tiUrn = tiUrn;
    }

    // bi-directional many-to-one association to SerFileVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILE_VER_SERIE")
    public SerFileVerSerie getSerFileVerSerie() {
        return this.serFileVerSerie;
    }

    public void setSerFileVerSerie(SerFileVerSerie serFileVerSerie) {
        this.serFileVerSerie = serFileVerSerie;
    }

}