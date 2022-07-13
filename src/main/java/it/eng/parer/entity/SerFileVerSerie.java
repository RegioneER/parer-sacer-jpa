package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the SER_FILE_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_FILE_VER_SERIE")
@NamedQuery(name = "SerFileVerSerie.findAll", query = "SELECT s FROM SerFileVerSerie s")
public class SerFileVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFileVerSerie;
    private byte[] blFile;
    private String cdEncodingHashFile;
    private String cdVerXsdFile;
    private String dsAlgoHashFile;
    private String dsHashFile;
    private Date dtCreazione;
    private BigDecimal idStrut;
    private String tiFileVerSerie;
    private SerVerSerie serVerSerie;
    private BigDecimal idEnteConserv;
    private List<SerUrnFileVerSerie> serUrnFileVerSeries;

    public SerFileVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_FILE_VER_SERIE_IDFILEVERSERIE_GENERATOR", sequenceName = "SSER_FILE_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_FILE_VER_SERIE_IDFILEVERSERIE_GENERATOR")
    @Column(name = "ID_FILE_VER_SERIE")
    public long getIdFileVerSerie() {
        return this.idFileVerSerie;
    }

    public void setIdFileVerSerie(long idFileVerSerie) {
        this.idFileVerSerie = idFileVerSerie;
    }

    @Lob
    @Column(name = "BL_FILE")
    public byte[] getBlFile() {
        return this.blFile;
    }

    public void setBlFile(byte[] blFile) {
        this.blFile = blFile;
    }

    @Column(name = "CD_ENCODING_HASH_FILE")
    public String getCdEncodingHashFile() {
        return this.cdEncodingHashFile;
    }

    public void setCdEncodingHashFile(String cdEncodingHashFile) {
        this.cdEncodingHashFile = cdEncodingHashFile;
    }

    @Column(name = "CD_VER_XSD_FILE")
    public String getCdVerXsdFile() {
        return this.cdVerXsdFile;
    }

    public void setCdVerXsdFile(String cdVerXsdFile) {
        this.cdVerXsdFile = cdVerXsdFile;
    }

    @Column(name = "DS_ALGO_HASH_FILE")
    public String getDsAlgoHashFile() {
        return this.dsAlgoHashFile;
    }

    public void setDsAlgoHashFile(String dsAlgoHashFile) {
        this.dsAlgoHashFile = dsAlgoHashFile;
    }

    @Column(name = "DS_HASH_FILE")
    public String getDsHashFile() {
        return this.dsHashFile;
    }

    public void setDsHashFile(String dsHashFile) {
        this.dsHashFile = dsHashFile;
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

    @Column(name = "TI_FILE_VER_SERIE")
    public String getTiFileVerSerie() {
        return this.tiFileVerSerie;
    }

    public void setTiFileVerSerie(String tiFileVerSerie) {
        this.tiFileVerSerie = tiFileVerSerie;
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

    @Column(name = "ID_ENTE_CONSERV")
    public BigDecimal getIdEnteConserv() {
        return this.idEnteConserv;
    }

    public void setIdEnteConserv(BigDecimal idEnteConserv) {
        this.idEnteConserv = idEnteConserv;
    }

    // bi-directional many-to-one association to SerUrnFileVerSerie
    @OneToMany(mappedBy = "serFileVerSerie", cascade = CascadeType.PERSIST)
    public List<SerUrnFileVerSerie> getSerUrnFileVerSeries() {
        return this.serUrnFileVerSeries;
    }

    public void setSerUrnFileVerSeries(List<SerUrnFileVerSerie> serUrnFileVerSeries) {
        this.serUrnFileVerSeries = serUrnFileVerSeries;
    }

    public SerUrnFileVerSerie addSerUrnFileVerSerie(SerUrnFileVerSerie serUrnFileVerSerie) {
        getSerUrnFileVerSeries().add(serUrnFileVerSerie);
        serUrnFileVerSerie.setSerFileVerSerie(this);

        return serUrnFileVerSerie;
    }

    public SerUrnFileVerSerie removeSerUrnFileVerSerie(SerUrnFileVerSerie serUrnFileVerSerie) {
        getSerUrnFileVerSeries().remove(serUrnFileVerSerie);
        serUrnFileVerSerie.setSerFileVerSerie(null);

        return serUrnFileVerSerie;
    }
}