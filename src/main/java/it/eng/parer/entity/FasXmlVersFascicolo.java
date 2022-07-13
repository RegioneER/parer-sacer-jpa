package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the FAS_XML_VERS_FASCICOLO database table.
 * 
 */
@Entity
@Table(name = "FAS_XML_VERS_FASCICOLO")
@NamedQuery(name = "FasXmlVersFascicolo.findAll", query = "SELECT f FROM FasXmlVersFascicolo f")
public class FasXmlVersFascicolo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idXmlVersFascicolo;
    private String blXmlVers;
    private String cdEncodingHashXmlVers;
    private String cdVersioneXml;
    private String dsAlgoHashXmlVers;
    private String dsHashXmlVers;
    private String dsUrnXmlVers;
    private String dsUrnNormalizXmlVers;
    private Date dtVersFascicolo;
    private BigDecimal idStrut;
    private String tiXmlVers;
    private FasFascicolo fasFascicolo;
    private List<FasSipVerAipFascicolo> fasSipVerAipFascicoloRichs;
    private List<FasSipVerAipFascicolo> fasSipVerAipFascicoloRisps;

    public FasXmlVersFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_XML_VERS_FASCICOLO_IDXMLVERSFASCICOLO_GENERATOR", sequenceName = "SFAS_XML_VERS_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_XML_VERS_FASCICOLO_IDXMLVERSFASCICOLO_GENERATOR")
    @Column(name = "ID_XML_VERS_FASCICOLO")
    public long getIdXmlVersFascicolo() {
        return this.idXmlVersFascicolo;
    }

    public void setIdXmlVersFascicolo(long idXmlVersFascicolo) {
        this.idXmlVersFascicolo = idXmlVersFascicolo;
    }

    @Lob
    @Column(name = "BL_XML_VERS")
    public String getBlXmlVers() {
        return this.blXmlVers;
    }

    public void setBlXmlVers(String blXmlVers) {
        this.blXmlVers = blXmlVers;
    }

    @Column(name = "CD_ENCODING_HASH_XML_VERS")
    public String getCdEncodingHashXmlVers() {
        return this.cdEncodingHashXmlVers;
    }

    public void setCdEncodingHashXmlVers(String cdEncodingHashXmlVers) {
        this.cdEncodingHashXmlVers = cdEncodingHashXmlVers;
    }

    @Column(name = "CD_VERSIONE_XML")
    public String getCdVersioneXml() {
        return this.cdVersioneXml;
    }

    public void setCdVersioneXml(String cdVersioneXml) {
        this.cdVersioneXml = cdVersioneXml;
    }

    @Column(name = "DS_ALGO_HASH_XML_VERS")
    public String getDsAlgoHashXmlVers() {
        return this.dsAlgoHashXmlVers;
    }

    public void setDsAlgoHashXmlVers(String dsAlgoHashXmlVers) {
        this.dsAlgoHashXmlVers = dsAlgoHashXmlVers;
    }

    @Column(name = "DS_HASH_XML_VERS")
    public String getDsHashXmlVers() {
        return this.dsHashXmlVers;
    }

    public void setDsHashXmlVers(String dsHashXmlVers) {
        this.dsHashXmlVers = dsHashXmlVers;
    }

    @Column(name = "DS_URN_XML_VERS")
    public String getDsUrnXmlVers() {
        return this.dsUrnXmlVers;
    }

    public void setDsUrnXmlVers(String dsUrnXmlVers) {
        this.dsUrnXmlVers = dsUrnXmlVers;
    }

    @Column(name = "DS_URN_NORMALIZ_XML_VERS")
    public String getDsUrnNormalizXmlVers() {
        return this.dsUrnNormalizXmlVers;
    }

    public void setDsUrnNormalizXmlVers(String dsUrnNormalizXmlVers) {
        this.dsUrnNormalizXmlVers = dsUrnNormalizXmlVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS_FASCICOLO")
    public Date getDtVersFascicolo() {
        return this.dtVersFascicolo;
    }

    public void setDtVersFascicolo(Date dtVersFascicolo) {
        this.dtVersFascicolo = dtVersFascicolo;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "TI_XML_VERS")
    public String getTiXmlVers() {
        return this.tiXmlVers;
    }

    public void setTiXmlVers(String tiXmlVers) {
        this.tiXmlVers = tiXmlVers;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
    }

    // bi-directional many-to-one association to FasSipVerAipFascicolo
    @OneToMany(mappedBy = "fasXmlVersFascicoloRich", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<FasSipVerAipFascicolo> getFasSipVerAipFascicoloRichs() {
        return this.fasSipVerAipFascicoloRichs;
    }

    public void setFasSipVerAipFascicoloRichs(List<FasSipVerAipFascicolo> fasSipVerAipFascicoloRichs) {
        this.fasSipVerAipFascicoloRichs = fasSipVerAipFascicoloRichs;
    }

    // bi-directional many-to-one association to FasSipVerAipFascicolo
    @OneToMany(mappedBy = "fasXmlVersFascicoloRisp", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<FasSipVerAipFascicolo> getFasSipVerAipFascicoloRisps() {
        return this.fasSipVerAipFascicoloRisps;
    }

    public void setFasSipVerAipFascicoloRisps(List<FasSipVerAipFascicolo> fasSipVerAipFascicoloRisps) {
        this.fasSipVerAipFascicoloRisps = fasSipVerAipFascicoloRisps;
    }

}