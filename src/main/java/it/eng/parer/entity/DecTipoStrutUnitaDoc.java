package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlIDREF;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_TIPO_STRUT_UNITA_DOC database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_TIPO_STRUT_UNITA_DOC")
public class DecTipoStrutUnitaDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idTipoStrutUnitaDoc;
    private String dsTipoStrutUnitaDoc;
    private String dsDataTipoStrutUnitaDoc;
    private String dsOggTipoStrutUnitaDoc;
    private String dsNumeroTipoStrutUnitaDoc;
    private String dsAnnoTipoStrutUnitaDoc;
    private BigDecimal aaMinTipoStrutUnitaDoc;
    private BigDecimal aaMaxTipoStrutUnitaDoc;
    private String dsRifTempTipoStrutUd;
    private String dsCollegamentiUd;
    private String dsPeriodicitaVers;
    private String dsFirma;
    private Date dtIstituz;
    private Date dtSoppres;
    private String nmTipoStrutUnitaDoc;
    private List<DecTipoDocAmmesso> decTipoDocAmmessos;
    private List<DecTipoStrutUdReg> decTipoStrutUdRegs;
    private List<DecTipoStrutUdXsd> decTipoStrutUdXsds;
    private List<DecTipoStrutUdSisVer> decTipoStrutUdSisVers;
    private DecTipoUnitaDoc decTipoUnitaDoc;

    public DecTipoStrutUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_STRUT_UNITA_DOC_IDTIPOSTRUTUNITADOC_GENERATOR", sequenceName = "SDEC_TIPO_STRUT_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_STRUT_UNITA_DOC_IDTIPOSTRUTUNITADOC_GENERATOR")
    @Column(name = "ID_TIPO_STRUT_UNITA_DOC")
    public long getIdTipoStrutUnitaDoc() {
        return this.idTipoStrutUnitaDoc;
    }

    public void setIdTipoStrutUnitaDoc(long idTipoStrutUnitaDoc) {
        this.idTipoStrutUnitaDoc = idTipoStrutUnitaDoc;
    }

    @Column(name = "DS_TIPO_STRUT_UNITA_DOC")
    public String getDsTipoStrutUnitaDoc() {
        return this.dsTipoStrutUnitaDoc;
    }

    public void setDsTipoStrutUnitaDoc(String dsTipoStrutUnitaDoc) {
        this.dsTipoStrutUnitaDoc = dsTipoStrutUnitaDoc;
    }

    @Column(name = "DS_DATA_TIPO_STRUT_UNITA_DOC")
    public String getDsDataTipoStrutUnitaDoc() {
        return dsDataTipoStrutUnitaDoc;
    }

    public void setDsDataTipoStrutUnitaDoc(String dsDataTipoStrutUnitaDoc) {
        this.dsDataTipoStrutUnitaDoc = dsDataTipoStrutUnitaDoc;
    }

    @Column(name = "DS_OGG_TIPO_STRUT_UNITA_DOC")
    public String getDsOggTipoStrutUnitaDoc() {
        return dsOggTipoStrutUnitaDoc;
    }

    public void setDsOggTipoStrutUnitaDoc(String dsOggTipoStrutUnitaDoc) {
        this.dsOggTipoStrutUnitaDoc = dsOggTipoStrutUnitaDoc;
    }

    @Column(name = "DS_NUMERO_TIPO_STRUT_UNITA_DOC")
    public String getDsNumeroTipoStrutUnitaDoc() {
        return dsNumeroTipoStrutUnitaDoc;
    }

    public void setDsNumeroTipoStrutUnitaDoc(String dsNumeroTipoStrutUnitaDoc) {
        this.dsNumeroTipoStrutUnitaDoc = dsNumeroTipoStrutUnitaDoc;
    }

    @Column(name = "DS_ANNO_TIPO_STRUT_UNITA_DOC")
    public String getDsAnnoTipoStrutUnitaDoc() {
        return dsAnnoTipoStrutUnitaDoc;
    }

    public void setDsAnnoTipoStrutUnitaDoc(String dsAnnoTipoStrutUnitaDoc) {
        this.dsAnnoTipoStrutUnitaDoc = dsAnnoTipoStrutUnitaDoc;
    }

    @Column(name = "AA_MIN_TIPO_STRUT_UNITA_DOC")
    public BigDecimal getAaMinTipoStrutUnitaDoc() {
        return aaMinTipoStrutUnitaDoc;
    }

    public void setAaMinTipoStrutUnitaDoc(BigDecimal aaMinTipoStrutUnitaDoc) {
        this.aaMinTipoStrutUnitaDoc = aaMinTipoStrutUnitaDoc;
    }

    @Column(name = "AA_MAX_TIPO_STRUT_UNITA_DOC")
    public BigDecimal getAaMaxTipoStrutUnitaDoc() {
        return aaMaxTipoStrutUnitaDoc;
    }

    public void setAaMaxTipoStrutUnitaDoc(BigDecimal aaMaxTipoStrutUnitaDoc) {
        this.aaMaxTipoStrutUnitaDoc = aaMaxTipoStrutUnitaDoc;
    }

    @Column(name = "DS_RIF_TEMP_TIPO_STRUT_UD")
    public String getDsRifTempTipoStrutUd() {
        return dsRifTempTipoStrutUd;
    }

    public void setDsRifTempTipoStrutUd(String dsRifTempTipoStrutUd) {
        this.dsRifTempTipoStrutUd = dsRifTempTipoStrutUd;
    }

    @Column(name = "DS_COLLEGAMENTI_UD")
    public String getDsCollegamentiUd() {
        return dsCollegamentiUd;
    }

    public void setDsCollegamentiUd(String dsCollegamentiUd) {
        this.dsCollegamentiUd = dsCollegamentiUd;
    }

    @Column(name = "DS_PERIODICITA_VERS")
    public String getDsPeriodicitaVers() {
        return dsPeriodicitaVers;
    }

    public void setDsPeriodicitaVers(String dsPeriodicitaVers) {
        this.dsPeriodicitaVers = dsPeriodicitaVers;
    }

    @Column(name = "DS_FIRMA")
    public String getDsFirma() {
        return dsFirma;
    }

    public void setDsFirma(String dsFirma) {
        this.dsFirma = dsFirma;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ISTITUZ")
    public Date getDtIstituz() {
        return this.dtIstituz;
    }

    public void setDtIstituz(Date dtIstituz) {
        this.dtIstituz = dtIstituz;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SOPPRES")
    public Date getDtSoppres() {
        return this.dtSoppres;
    }

    public void setDtSoppres(Date dtSoppres) {
        this.dtSoppres = dtSoppres;
    }

    @Column(name = "NM_TIPO_STRUT_UNITA_DOC")
    public String getNmTipoStrutUnitaDoc() {
        return this.nmTipoStrutUnitaDoc;
    }

    public void setNmTipoStrutUnitaDoc(String nmTipoStrutUnitaDoc) {
        this.nmTipoStrutUnitaDoc = nmTipoStrutUnitaDoc;
    }

    // bi-directional many-to-one association to DecTipoDocAmmesso
    @OneToMany(mappedBy = "decTipoStrutUnitaDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlIDREF
    public List<DecTipoDocAmmesso> getDecTipoDocAmmessos() {
        return this.decTipoDocAmmessos;
    }

    public void setDecTipoDocAmmessos(List<DecTipoDocAmmesso> decTipoDocAmmessos) {
        this.decTipoDocAmmessos = decTipoDocAmmessos;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decTipoStrutUnitaDocs")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

    // bi-directional many-to-one association to DecTipoStrutUdSisVer
    @OneToMany(mappedBy = "decTipoStrutUnitaDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    // @XmlIDREF
    public List<DecTipoStrutUdSisVer> getDecTipoStrutUdSisVers() {
        return this.decTipoStrutUdSisVers;
    }

    public void setDecTipoStrutUdSisVers(List<DecTipoStrutUdSisVer> decTipoStrutUdSisVers) {
        this.decTipoStrutUdSisVers = decTipoStrutUdSisVers;
    }

    // bi-directional many-to-one association to DecTipoStrutUdRegs
    @OneToMany(mappedBy = "decTipoStrutUnitaDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    // @XmlIDREF
    public List<DecTipoStrutUdReg> getDecTipoStrutUdRegs() {
        return this.decTipoStrutUdRegs;
    }

    public void setDecTipoStrutUdRegs(List<DecTipoStrutUdReg> decTipoStrutUdRegs) {
        this.decTipoStrutUdRegs = decTipoStrutUdRegs;
    }

    // bi-directional many-to-one association to DecTipoStrutUdRegs
    @OneToMany(mappedBy = "decTipoStrutUnitaDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    // @XmlIDREF
    public List<DecTipoStrutUdXsd> getDecTipoStrutUdXsds() {
        return this.decTipoStrutUdXsds;
    }

    public void setDecTipoStrutUdXsds(List<DecTipoStrutUdXsd> decTipoStrutUdXsds) {
        this.decTipoStrutUdXsds = decTipoStrutUdXsds;
    }

}
