package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the SER_VER_SERIE_DA_ELAB database table.
 * 
 */
@Entity
@Table(name = "SER_VER_SERIE_DA_ELAB")
@NamedQuery(name = "SerVerSerieDaElab.findAll", query = "SELECT s FROM SerVerSerieDaElab s")
public class SerVerSerieDaElab implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idVerSerieDaElab;
    private Date dtRegStatoVerSerie;
    private BigDecimal idStrut;
    private String tiStatoVerSerie;
    private SerVerSerie serVerSerie;

    public SerVerSerieDaElab() {
    }

    @Id
    @SequenceGenerator(name = "SER_VER_SERIE_DA_ELAB_IDVERSERIEDAELAB_GENERATOR", sequenceName = "SSER_VER_SERIE_DA_ELAB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_VER_SERIE_DA_ELAB_IDVERSERIEDAELAB_GENERATOR")
    @Column(name = "ID_VER_SERIE_DA_ELAB")
    public long getIdVerSerieDaElab() {
        return this.idVerSerieDaElab;
    }

    public void setIdVerSerieDaElab(long idVerSerieDaElab) {
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