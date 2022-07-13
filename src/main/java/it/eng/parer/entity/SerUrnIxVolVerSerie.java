package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import it.eng.parer.entity.constraint.SerUrnIxVolVerSerie.TiUrnIxVolVerSerie;

/**
 * The persistent class for the SER_URN_IX_VOL_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_URN_IX_VOL_VER_SERIE")
@NamedQuery(name = "SerUrnIxVolVerSerie.findAll", query = "SELECT v FROM SerUrnIxVolVerSerie v")
public class SerUrnIxVolVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUrnIxVolVerSerie;
    private String dsUrn;
    private TiUrnIxVolVerSerie tiUrn;
    private SerIxVolVerSerie serIxVolVerSerie;

    public SerUrnIxVolVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_URN_IX_VOL_VER_SERIE_IDURNIXVOLVERSERIE_GENERATOR", sequenceName = "SSER_URN_IX_VOL_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_URN_IX_VOL_VER_SERIE_IDURNIXVOLVERSERIE_GENERATOR")
    @Column(name = "ID_URN_IX_VOL_VER_SERIE")
    public long getIdUrnIxVolVerSerie() {
        return this.idUrnIxVolVerSerie;
    }

    public void setIdUrnIxVolVerSerie(long idUrnIxVolVerSerie) {
        this.idUrnIxVolVerSerie = idUrnIxVolVerSerie;
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
    public TiUrnIxVolVerSerie getTiUrn() {
        return this.tiUrn;
    }

    public void setTiUrn(TiUrnIxVolVerSerie tiUrn) {
        this.tiUrn = tiUrn;
    }

    // bi-directional many-to-one association to SerIxVolVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_IX_VOL_VER_SERIE")
    public SerIxVolVerSerie getSerIxVolVerSerie() {
        return this.serIxVolVerSerie;
    }

    public void setSerIxVolVerSerie(SerIxVolVerSerie serIxVolVerSerie) {
        this.serIxVolVerSerie = serIxVolVerSerie;
    }

}