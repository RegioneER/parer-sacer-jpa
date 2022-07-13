package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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

import it.eng.parer.entity.constraint.AroVersIniDatiSpec.TiEntitaSacerAroVersIniDatiSpec;
import it.eng.parer.entity.constraint.AroVersIniDatiSpec.TiUsoXsdAroVersIniDatiSpec;

/**
 * The persistent class for the ARO_VERS_INI_DATI_SPEC database table.
 * 
 */
@Entity
@Table(name = "ARO_VERS_INI_DATI_SPEC")
@NamedQuery(name = "AroVersIniDatiSpec.findAll", query = "SELECT a FROM AroVersIniDatiSpec a")
public class AroVersIniDatiSpec implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idVersIniDatiSpec;
    private String blXmlDatiSpec;
    private Date dtReg;
    private BigDecimal idStrut;
    private AroVersIniComp aroVersIniComp;
    private AroVersIniDoc aroVersIniDoc;
    private AroVersIniUnitaDoc aroVersIniUnitaDoc;
    private DecXsdDatiSpec decXsdDatiSpec;
    private TiEntitaSacerAroVersIniDatiSpec tiEntitaSacer;
    private TiUsoXsdAroVersIniDatiSpec tiUsoXsd;

    public AroVersIniDatiSpec() {
    }

    @Id
    @SequenceGenerator(name = "ARO_VERS_INI_DATI_SPEC_IDVERSINIDATISPEC_GENERATOR", sequenceName = "SARO_VERS_INI_DATI_SPEC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_VERS_INI_DATI_SPEC_IDVERSINIDATISPEC_GENERATOR")
    @Column(name = "ID_VERS_INI_DATI_SPEC")
    public long getIdVersIniDatiSpec() {
        return this.idVersIniDatiSpec;
    }

    public void setIdVersIniDatiSpec(long idVersIniDatiSpec) {
        this.idVersIniDatiSpec = idVersIniDatiSpec;
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
    @Column(name = "DT_REG")
    public Date getDtReg() {
        return this.dtReg;
    }

    public void setDtReg(Date dtReg) {
        this.dtReg = dtReg;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERS_INI_COMP")
    public AroVersIniComp getAroVersIniComp() {
        return this.aroVersIniComp;
    }

    public void setAroVersIniComp(AroVersIniComp aroVersIniComp) {
        this.aroVersIniComp = aroVersIniComp;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERS_INI_DOC")
    public AroVersIniDoc getAroVersIniDoc() {
        return this.aroVersIniDoc;
    }

    public void setAroVersIniDoc(AroVersIniDoc aroVersIniDoc) {
        this.aroVersIniDoc = aroVersIniDoc;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERS_INI_UNITA_DOC")
    public AroVersIniUnitaDoc getAroVersIniUnitaDoc() {
        return this.aroVersIniUnitaDoc;
    }

    public void setAroVersIniUnitaDoc(AroVersIniUnitaDoc aroVersIniUnitaDoc) {
        this.aroVersIniUnitaDoc = aroVersIniUnitaDoc;
    }

    // bi-directional many-to-one association to AroUnitaDoc
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
    public TiEntitaSacerAroVersIniDatiSpec getTiEntitaSacer() {
        return this.tiEntitaSacer;
    }

    public void setTiEntitaSacer(TiEntitaSacerAroVersIniDatiSpec tiEntitaSacer) {
        this.tiEntitaSacer = tiEntitaSacer;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_USO_XSD")
    public TiUsoXsdAroVersIniDatiSpec getTiUsoXsd() {
        return this.tiUsoXsd;
    }

    public void setTiUsoXsd(TiUsoXsdAroVersIniDatiSpec tiUsoXsd) {
        this.tiUsoXsd = tiUsoXsd;
    }

}