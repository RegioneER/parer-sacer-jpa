package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the SER_VER_SERIE_DA_ELAB database table.
 */
@Entity
@Table(name = "SER_VER_SERIE_DA_ELAB")
@NamedQuery(name = "SerVerSerieDaElab.findAll", query = "SELECT s FROM SerVerSerieDaElab s")
public class SerVerSerieDaElab implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idVerSerieDaElab;

    private Date dtRegStatoVerSerie;

    private BigDecimal idStrut;

    private String tiStatoVerSerie;

    private SerVerSerie serVerSerie;

    public SerVerSerieDaElab() {/* Hibernate */
    }

    @Id
    // "SER_VER_SERIE_DA_ELAB_IDVERSERIEDAELAB_GENERATOR",
    // sequenceName = "SSER_VER_SERIE_DA_ELAB",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "SER_VER_SERIE_DA_ELAB_IDVERSERIEDAELAB_GENERATOR")
    @Column(name = "ID_VER_SERIE_DA_ELAB")
    @GenericGenerator(name = "SSER_VER_SERIE_DA_ELAB_ID_VER_SERIE_DA_ELAB_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SSER_VER_SERIE_DA_ELAB"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SSER_VER_SERIE_DA_ELAB_ID_VER_SERIE_DA_ELAB_GENERATOR")
    public Long getIdVerSerieDaElab() {
        return this.idVerSerieDaElab;
    }

    public void setIdVerSerieDaElab(Long idVerSerieDaElab) {
        this.idVerSerieDaElab = idVerSerieDaElab;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_STATO_VER_SERIE")
    public Date getDtRegStatoVerSerie() {
        return this.dtRegStatoVerSerie;
    }

    public void setDtRegStatoVerSerie(Date dtRegStatoVerSerie) {
        this.dtRegStatoVerSerie = dtRegStatoVerSerie;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "TI_STATO_VER_SERIE")
    public String getTiStatoVerSerie() {
        return this.tiStatoVerSerie;
    }

    public void setTiStatoVerSerie(String tiStatoVerSerie) {
        this.tiStatoVerSerie = tiStatoVerSerie;
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

}
