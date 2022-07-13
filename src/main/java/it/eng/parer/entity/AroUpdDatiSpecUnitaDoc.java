package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import it.eng.parer.entity.constraint.AroUpdDatiSpecUnitaDoc.TiEntitaAroUpdDatiSpecUnitaDoc;
import it.eng.parer.entity.constraint.AroUpdDatiSpecUnitaDoc.TiUsoXsdAroUpdDatiSpecUnitaDoc;

/**
 * The persistent class for the ARO_UPD_DATI_SPEC_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_UPD_DATI_SPEC_UNITA_DOC")
@NamedQuery(name = "AroUpdDatiSpecUnitaDoc.findAll", query = "SELECT a FROM AroUpdDatiSpecUnitaDoc a")
public class AroUpdDatiSpecUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUpdDatiSpecUnitaDoc;
    private String blXmlDatiSpec;
    private Date dtIniSes;
    private OrgStrut orgStrut;
    private AroUpdCompUnitaDoc aroUpdCompUnitaDoc;
    private AroUpdDocUnitaDoc aroUpdDocUnitaDoc;
    private AroUpdUnitaDoc aroUpdUnitaDoc;
    private DecXsdDatiSpec decXsdDatiSpec;
    private TiEntitaAroUpdDatiSpecUnitaDoc tiEntitaSacer;
    private TiUsoXsdAroUpdDatiSpecUnitaDoc tiUsoXsd;

    public AroUpdDatiSpecUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UPD_DATI_SPEC_UNITA_DOC_IDUPDDATISPECUNITADOC_GENERATOR", sequenceName = "SARO_UPD_DATI_SPEC_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UPD_DATI_SPEC_UNITA_DOC_IDUPDDATISPECUNITADOC_GENERATOR")
    @Column(name = "ID_UPD_DATI_SPEC_UNITA_DOC")
    public long getIdUpdDatiSpecUnitaDoc() {
        return this.idUpdDatiSpecUnitaDoc;
    }

    public void setIdUpdDatiSpecUnitaDoc(long idUpdDatiSpecUnitaDoc) {
        this.idUpdDatiSpecUnitaDoc = idUpdDatiSpecUnitaDoc;
    }

    @Lob
    @Column(name = "BL_XML_DATI_SPEC")
    public String getBlXmlDatiSpec() {
        return this.blXmlDatiSpec;
    }

    public void setBlXmlDatiSpec(String blXmlDatiSpec) {
        this.blXmlDatiSpec = blXmlDatiSpec;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_INI_SES")
    public Date getDtIniSes() {
        return this.dtIniSes;
    }

    public void setDtIniSes(Date dtIniSes) {
        this.dtIniSes = dtIniSes;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to AroUpdCompUnitaDoc
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_COMP_UNITA_DOC")
    public AroUpdCompUnitaDoc getAroUpdCompUnitaDoc() {
        return this.aroUpdCompUnitaDoc;
    }

    public void setAroUpdCompUnitaDoc(AroUpdCompUnitaDoc aroUpdCompUnitaDoc) {
        this.aroUpdCompUnitaDoc = aroUpdCompUnitaDoc;
    }

    // bi-directional many-to-one association to AroUpdDocUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_DOC_UNITA_DOC")
    public AroUpdDocUnitaDoc getAroUpdDocUnitaDoc() {
        return this.aroUpdDocUnitaDoc;
    }

    public void setAroUpdDocUnitaDoc(AroUpdDocUnitaDoc aroUpdDocUnitaDoc) {
        this.aroUpdDocUnitaDoc = aroUpdDocUnitaDoc;
    }

    // bi-directional many-to-one association to AroUpdUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }

    // bi-directional many-to-one association to DecXsdDatiSpec
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_XSD_DATI_SPEC")
    public DecXsdDatiSpec getDecXsdDatiSpec() {
        return this.decXsdDatiSpec;
    }

    public void setDecXsdDatiSpec(DecXsdDatiSpec decXsdDatiSpec) {
        this.decXsdDatiSpec = decXsdDatiSpec;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_ENTITA_SACER")
    public TiEntitaAroUpdDatiSpecUnitaDoc getTiEntitaSacer() {
        return this.tiEntitaSacer;
    }

    public void setTiEntitaSacer(TiEntitaAroUpdDatiSpecUnitaDoc tiEntitaSacer) {
        this.tiEntitaSacer = tiEntitaSacer;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_USO_XSD")
    public TiUsoXsdAroUpdDatiSpecUnitaDoc getTiUsoXsd() {
        return this.tiUsoXsd;
    }

    public void setTiUsoXsd(TiUsoXsdAroUpdDatiSpecUnitaDoc tiUsoXsd) {
        this.tiUsoXsd = tiUsoXsd;
    }

}