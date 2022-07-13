package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the VRS_XML_DATI_SESSIONE_VERS database table.
 *
 */
@Entity
@Table(name = "VRS_XML_DATI_SESSIONE_VERS")
public class VrsXmlDatiSessioneVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idXmlDatiSessioneVers;
    private String blXml;
    private String cdEncodingHashXmlVers;
    private String cdVersioneXml;
    private String dsAlgoHashXmlVers;
    private String dsHashXmlVers;
    private String dsUrnXmlVers;
    private BigDecimal idStrut;
    private String tiXmlDati;
    private String flCanonicalized;
    private VrsDatiSessioneVers vrsDatiSessioneVers;
    private List<VrsUrnXmlSessioneVers> vrsUrnXmlSessioneVers;

    public VrsXmlDatiSessioneVers() {
    }

    @Id
    @SequenceGenerator(name = "VRS_XML_DATI_SESSIONE_VERS_IDXMLDATISESSIONEVERS_GENERATOR", sequenceName = "SVRS_XML_DATI_SESSIONE_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_XML_DATI_SESSIONE_VERS_IDXMLDATISESSIONEVERS_GENERATOR")
    @Column(name = "ID_XML_DATI_SESSIONE_VERS")
    public long getIdXmlDatiSessioneVers() {
        return this.idXmlDatiSessioneVers;
    }

    public void setIdXmlDatiSessioneVers(long idXmlDatiSessioneVers) {
        this.idXmlDatiSessioneVers = idXmlDatiSessioneVers;
    }

    @Lob()
    @Column(name = "BL_XML")
    public String getBlXml() {
        return this.blXml;
    }

    public void setBlXml(String blXml) {
        this.blXml = blXml;
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

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "TI_XML_DATI")
    public String getTiXmlDati() {
        return this.tiXmlDati;
    }

    public void setTiXmlDati(String tiXmlDati) {
        this.tiXmlDati = tiXmlDati;
    }

    // bi-directional many-to-one association to VrsDatiSessioneVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATI_SESSIONE_VERS")
    public VrsDatiSessioneVers getVrsDatiSessioneVers() {
        return this.vrsDatiSessioneVers;
    }

    public void setVrsDatiSessioneVers(VrsDatiSessioneVers vrsDatiSessioneVers) {
        this.vrsDatiSessioneVers = vrsDatiSessioneVers;
    }

    @Column(name = "FL_CANONICALIZED")
    public String getFlCanonicalized() {
        return this.flCanonicalized;
    }

    public void setFlCanonicalized(String flCanonicalized) {
        this.flCanonicalized = flCanonicalized;
    }

    // bi-directional many-to-one association to VrsXmlDatiSessioneVers
    @OneToMany(mappedBy = "vrsXmlDatiSessioneVers")
    public List<VrsUrnXmlSessioneVers> getVrsUrnXmlSessioneVers() {
        return this.vrsUrnXmlSessioneVers;
    }

    public void setVrsUrnXmlSessioneVers(List<VrsUrnXmlSessioneVers> vrsUrnXmlSessioneVers) {
        this.vrsUrnXmlSessioneVers = vrsUrnXmlSessioneVers;
    }

}