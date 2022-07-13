package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the FAS_XML_FASCICOLO database table.
 * 
 */
@Entity
@Table(name = "FAS_XML_FASCICOLO")
@NamedQuery(name = "FasXmlFascicolo.findAll", query = "SELECT f FROM FasXmlFascicolo f")
public class FasXmlFascicolo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idXmlFascicolo;
    private String blXml;
    private Date dtVersFascicolo;
    private BigDecimal idStrut;
    private String tiModelloXsd;
    private DecModelloXsdFascicolo decModelloXsdFascicolo;
    private FasFascicolo fasFascicolo;

    public FasXmlFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_XML_FASCICOLO_IDXMLFASCICOLO_GENERATOR", sequenceName = "SFAS_XML_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_XML_FASCICOLO_IDXMLFASCICOLO_GENERATOR")
    @Column(name = "ID_XML_FASCICOLO")
    public long getIdXmlFascicolo() {
        return this.idXmlFascicolo;
    }

    public void setIdXmlFascicolo(long idXmlFascicolo) {
        this.idXmlFascicolo = idXmlFascicolo;
    }

    @Lob
    @Column(name = "BL_XML")
    public String getBlXml() {
        return this.blXml;
    }

    public void setBlXml(String blXml) {
        this.blXml = blXml;
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

    @Column(name = "TI_MODELLO_XSD")
    public String getTiModelloXsd() {
        return this.tiModelloXsd;
    }

    public void setTiModelloXsd(String tiModelloXsd) {
        this.tiModelloXsd = tiModelloXsd;
    }

    // bi-directional many-to-one association to DecModelloXsdFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODELLO_XSD_FASCICOLO")
    public DecModelloXsdFascicolo getDecModelloXsdFascicolo() {
        return this.decModelloXsdFascicolo;
    }

    public void setDecModelloXsdFascicolo(DecModelloXsdFascicolo decModelloXsdFascicolo) {
        this.decModelloXsdFascicolo = decModelloXsdFascicolo;
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

}