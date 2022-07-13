package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_XSD_DATI_SPEC database table.
 *
 */
@Entity
// @Cacheable(true)
@Table(name = "DEC_XSD_DATI_SPEC")
public class DecXsdDatiSpec implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idXsdDatiSpec;
    private String blXsd;
    private String cdVersioneXsd;
    private Date dtIstituz;
    private Date dtSoppres;
    private String nmSistemaMigraz;
    private String tiEntitaSacer;
    private String tiUsoXsd;
    private String dsVersioneXsd;
    private List<AroUsoXsdDatiSpec> aroUsoXsdDatiSpecs;
    private List<DecXsdAttribDatiSpec> decXsdAttribDatiSpecs;
    private List<DecTipoStrutUdXsd> decTipoStrutUdXsds;
    private DecTipoCompDoc decTipoCompDoc;
    private DecTipoDoc decTipoDoc;
    private DecTipoUnitaDoc decTipoUnitaDoc;
    private OrgStrut orgStrut;

    public DecXsdDatiSpec() {
    }

    @Id
    @SequenceGenerator(name = "DEC_XSD_DATI_SPEC_IDXSDDATISPEC_GENERATOR", sequenceName = "SDEC_XSD_DATI_SPEC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_XSD_DATI_SPEC_IDXSDDATISPEC_GENERATOR")
    @Column(name = "ID_XSD_DATI_SPEC")
    @XmlID
    public long getIdXsdDatiSpec() {
        return this.idXsdDatiSpec;
    }

    public void setIdXsdDatiSpec(long idXsdDatiSpec) {
        this.idXsdDatiSpec = idXsdDatiSpec;
    }

    @Lob()
    @Column(name = "BL_XSD")
    public String getBlXsd() {
        return this.blXsd;
    }

    public void setBlXsd(String blXsd) {
        this.blXsd = blXsd;
    }

    @Column(name = "CD_VERSIONE_XSD")
    public String getCdVersioneXsd() {
        return this.cdVersioneXsd;
    }

    public void setCdVersioneXsd(String cdVersioneXsd) {
        this.cdVersioneXsd = cdVersioneXsd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ISTITUZ")
    public Date getDtIstituz() {
        return dtIstituz;
    }

    public void setDtIstituz(Date dtIstituz) {
        this.dtIstituz = dtIstituz;
    }

    @Column(name = "DT_SOPPRES")
    @Temporal(TemporalType.TIMESTAMP)
    public Date getDtSoppres() {
        return dtSoppres;
    }

    public void setDtSoppres(Date dtSoppres) {
        this.dtSoppres = dtSoppres;
    }

    @Column(name = "NM_SISTEMA_MIGRAZ")
    public String getNmSistemaMigraz() {
        return this.nmSistemaMigraz;
    }

    public void setNmSistemaMigraz(String nmSistemaMigraz) {
        this.nmSistemaMigraz = nmSistemaMigraz;
    }

    @Column(name = "TI_ENTITA_SACER")
    public String getTiEntitaSacer() {
        return this.tiEntitaSacer;
    }

    public void setTiEntitaSacer(String tiEntitaSacer) {
        this.tiEntitaSacer = tiEntitaSacer;
    }

    @Column(name = "TI_USO_XSD")
    public String getTiUsoXsd() {
        return this.tiUsoXsd;
    }

    public void setTiUsoXsd(String tiUsoXsd) {
        this.tiUsoXsd = tiUsoXsd;
    }

    @Column(name = "DS_VERSIONE_XSD")
    public String getDsVersioneXsd() {
        return dsVersioneXsd;
    }

    public void setDsVersioneXsd(String dsVersioneXsd) {
        this.dsVersioneXsd = dsVersioneXsd;
    }

    // bi-directional many-to-one association to AroUsoXsdDatiSpec
    @OneToMany(mappedBy = "decXsdDatiSpec")
    @XmlTransient
    public List<AroUsoXsdDatiSpec> getAroUsoXsdDatiSpecs() {
        return this.aroUsoXsdDatiSpecs;
    }

    public void setAroUsoXsdDatiSpecs(List<AroUsoXsdDatiSpec> aroUsoXsdDatiSpecs) {
        this.aroUsoXsdDatiSpecs = aroUsoXsdDatiSpecs;
    }

    // bi-directional many-to-one association to DecXsdAttribDatiSpec
    @OneToMany(mappedBy = "decXsdDatiSpec", cascade = CascadeType.PERSIST)
    @OrderBy("niOrdAttrib ASC")
    @XmlIDREF
    public List<DecXsdAttribDatiSpec> getDecXsdAttribDatiSpecs() {
        return this.decXsdAttribDatiSpecs;
    }

    public void setDecXsdAttribDatiSpecs(List<DecXsdAttribDatiSpec> decXsdAttribDatiSpecs) {
        this.decXsdAttribDatiSpecs = decXsdAttribDatiSpecs;
    }

    // bi-directional many-to-one association to DecTipoCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_COMP_DOC")
    @XmlInverseReference(mappedBy = "decXsdDatiSpecs")
    public DecTipoCompDoc getDecTipoCompDoc() {
        return this.decTipoCompDoc;
    }

    public void setDecTipoCompDoc(DecTipoCompDoc decTipoCompDoc) {
        this.decTipoCompDoc = decTipoCompDoc;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC")
    @XmlInverseReference(mappedBy = "decXsdDatiSpecs")
    public DecTipoDoc getDecTipoDoc() {
        return this.decTipoDoc;
    }

    public void setDecTipoDoc(DecTipoDoc decTipoDoc) {
        this.decTipoDoc = decTipoDoc;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decXsdDatiSpecs")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "decXsdDatiSpecs")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to DecTipoStrutUdRegs
    @OneToMany(mappedBy = "decXsdDatiSpec", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlTransient
    public List<DecTipoStrutUdXsd> getDecTipoStrutUdXsds() {
        return this.decTipoStrutUdXsds;
    }

    public void setDecTipoStrutUdXsds(List<DecTipoStrutUdXsd> decTipoStrutUdXsds) {
        this.decTipoStrutUdXsds = decTipoStrutUdXsds;
    }

}
