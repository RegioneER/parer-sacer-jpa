package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the SER_IX_VOL_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_IX_VOL_VER_SERIE")
@NamedQuery(name = "SerIxVolVerSerie.findAll", query = "SELECT s FROM SerIxVolVerSerie s")
public class SerIxVolVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idIxVolVerSerie;
    private String blIxVol;
    private String cdEncodingHashIxVol;
    private String cdVerXsdIxVol;
    private String dsAlgoHashIxVol;
    private String dsHashIxVol;
    private Date dtCreazione;
    private BigDecimal idStrut;
    private SerVolVerSerie serVolVerSerie;
    private List<SerUrnIxVolVerSerie> serUrnIxVolVerSeries;

    public SerIxVolVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_IX_VOL_VER_SERIE_IDIXVOLVERSERIE_GENERATOR", sequenceName = "SSER_IX_VOL_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_IX_VOL_VER_SERIE_IDIXVOLVERSERIE_GENERATOR")
    @Column(name = "ID_IX_VOL_VER_SERIE")
    public long getIdIxVolVerSerie() {
        return this.idIxVolVerSerie;
    }

    public void setIdIxVolVerSerie(long idIxVolVerSerie) {
        this.idIxVolVerSerie = idIxVolVerSerie;
    }

    @Lob
    @Column(name = "BL_IX_VOL")
    public String getBlIxVol() {
        return this.blIxVol;
    }

    public void setBlIxVol(String blIxVol) {
        this.blIxVol = blIxVol;
    }

    @Column(name = "CD_ENCODING_HASH_IX_VOL")
    public String getCdEncodingHashIxVol() {
        return this.cdEncodingHashIxVol;
    }

    public void setCdEncodingHashIxVol(String cdEncodingHashIxVol) {
        this.cdEncodingHashIxVol = cdEncodingHashIxVol;
    }

    @Column(name = "CD_VER_XSD_IX_VOL")
    public String getCdVerXsdIxVol() {
        return this.cdVerXsdIxVol;
    }

    public void setCdVerXsdIxVol(String cdVerXsdIxVol) {
        this.cdVerXsdIxVol = cdVerXsdIxVol;
    }

    @Column(name = "DS_ALGO_HASH_IX_VOL")
    public String getDsAlgoHashIxVol() {
        return this.dsAlgoHashIxVol;
    }

    public void setDsAlgoHashIxVol(String dsAlgoHashIxVol) {
        this.dsAlgoHashIxVol = dsAlgoHashIxVol;
    }

    @Column(name = "DS_HASH_IX_VOL")
    public String getDsHashIxVol() {
        return this.dsHashIxVol;
    }

    public void setDsHashIxVol(String dsHashIxVol) {
        this.dsHashIxVol = dsHashIxVol;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to SerVolVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VOL_VER_SERIE")
    public SerVolVerSerie getSerVolVerSerie() {
        return this.serVolVerSerie;
    }

    public void setSerVolVerSerie(SerVolVerSerie serVolVerSerie) {
        this.serVolVerSerie = serVolVerSerie;
    }

    // bi-directional many-to-one association to SerUrnIxVolVerSerie
    // TODO: verifica su cascade (se corretto/utile)
    @OneToMany(mappedBy = "serIxVolVerSerie", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<SerUrnIxVolVerSerie> getSerUrnIxVolVerSeries() {
        return this.serUrnIxVolVerSeries;
    }

    public void setSerUrnIxVolVerSeries(List<SerUrnIxVolVerSerie> serUrnIxVolVerSeries) {
        this.serUrnIxVolVerSeries = serUrnIxVolVerSeries;
    }

}