package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the SER_LACUNA_CONSIST_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_LACUNA_CONSIST_VER_SERIE")
@NamedQuery(name = "SerLacunaConsistVerSerie.findAll", query = "SELECT s FROM SerLacunaConsistVerSerie s")
public class SerLacunaConsistVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idLacunaConsistVerSerie;
    private String dlLacuna;
    private String dlNotaLacuna;
    private BigDecimal niFinLacuna;
    private BigDecimal niIniLacuna;
    private BigDecimal pgLacuna;
    private String tiLacuna;
    private String tiModLacuna;
    private SerConsistVerSerie serConsistVerSerie;

    public SerLacunaConsistVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_LACUNA_CONSIST_VER_SERIE_IDLACUNACONSISTVERSERIE_GENERATOR", sequenceName = "SSER_LACUNA_CONSIST_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_LACUNA_CONSIST_VER_SERIE_IDLACUNACONSISTVERSERIE_GENERATOR")
    @Column(name = "ID_LACUNA_CONSIST_VER_SERIE")
    public long getIdLacunaConsistVerSerie() {
        return this.idLacunaConsistVerSerie;
    }

    public void setIdLacunaConsistVerSerie(long idLacunaConsistVerSerie) {
        this.idLacunaConsistVerSerie = idLacunaConsistVerSerie;
    }

    @Column(name = "DL_LACUNA")
    public String getDlLacuna() {
        return this.dlLacuna;
    }

    public void setDlLacuna(String dlLacuna) {
        this.dlLacuna = dlLacuna;
    }

    @Column(name = "DL_NOTA_LACUNA")
    public String getDlNotaLacuna() {
        return this.dlNotaLacuna;
    }

    public void setDlNotaLacuna(String dlNotaLacuna) {
        this.dlNotaLacuna = dlNotaLacuna;
    }

    @Column(name = "NI_FIN_LACUNA")
    public BigDecimal getNiFinLacuna() {
        return this.niFinLacuna;
    }

    public void setNiFinLacuna(BigDecimal niFinLacuna) {
        this.niFinLacuna = niFinLacuna;
    }

    @Column(name = "NI_INI_LACUNA")
    public BigDecimal getNiIniLacuna() {
        return this.niIniLacuna;
    }

    public void setNiIniLacuna(BigDecimal niIniLacuna) {
        this.niIniLacuna = niIniLacuna;
    }

    @Column(name = "PG_LACUNA")
    public BigDecimal getPgLacuna() {
        return this.pgLacuna;
    }

    public void setPgLacuna(BigDecimal pgLacuna) {
        this.pgLacuna = pgLacuna;
    }

    @Column(name = "TI_LACUNA")
    public String getTiLacuna() {
        return this.tiLacuna;
    }

    public void setTiLacuna(String tiLacuna) {
        this.tiLacuna = tiLacuna;
    }

    @Column(name = "TI_MOD_LACUNA")
    public String getTiModLacuna() {
        return this.tiModLacuna;
    }

    public void setTiModLacuna(String tiModLacuna) {
        this.tiModLacuna = tiModLacuna;
    }

    // bi-directional many-to-one association to SerConsistVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONSIST_VER_SERIE")
    public SerConsistVerSerie getSerConsistVerSerie() {
        return this.serConsistVerSerie;
    }

    public void setSerConsistVerSerie(SerConsistVerSerie serConsistVerSerie) {
        this.serConsistVerSerie = serConsistVerSerie;
    }

}