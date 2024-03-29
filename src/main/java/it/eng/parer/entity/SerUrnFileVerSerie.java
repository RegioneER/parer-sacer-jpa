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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import it.eng.parer.entity.constraint.SerUrnFileVerSerie.TiUrnFileVerSerie;

/**
 * The persistent class for the SER_URN_FILE_VER_SERIE database table.
 */
@Entity
@Table(name = "SER_URN_FILE_VER_SERIE")
@NamedQuery(name = "SerUrnFileVerSerie.findAll", query = "SELECT s FROM SerUrnFileVerSerie s")
public class SerUrnFileVerSerie implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUrnFileVerSerie;

    private String dsUrn;

    private TiUrnFileVerSerie tiUrn;

    private SerFileVerSerie serFileVerSerie;

    public SerUrnFileVerSerie() {/* Hibernate */
    }

    @Id
    // @SequenceGenerator(name = "SER_URN_FILE_VER_SERIE_IDURNFILEVERSERIE_GENERATOR", sequenceName =
    // "SSER_URN_FILE_VER_SERIE", allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "SER_URN_FILE_VER_SERIE_IDURNFILEVERSERIE_GENERATOR")
    @Column(name = "ID_URN_FILE_VER_SERIE")
    @GenericGenerator(name = "SSER_URN_FILE_VER_SERIE_ID_URN_FILE_VER_SERIE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SSER_URN_FILE_VER_SERIE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SSER_URN_FILE_VER_SERIE_ID_URN_FILE_VER_SERIE_GENERATOR")
    public Long getIdUrnFileVerSerie() {
        return this.idUrnFileVerSerie;
    }

    public void setIdUrnFileVerSerie(Long idUrnFileVerSerie) {
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
