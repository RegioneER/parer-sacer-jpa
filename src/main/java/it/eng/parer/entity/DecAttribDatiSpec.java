package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_ATTRIB_DATI_SPEC database table.
 *
 */
@Entity
@Table(name = "DEC_ATTRIB_DATI_SPEC")
public class DecAttribDatiSpec implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idAttribDatiSpec;
    private String dsAttribDatiSpec;
    private String nmAttribDatiSpec;
    private String nmSistemaMigraz;
    private String tiEntitaSacer;
    private String tiUsoAttrib;
    private String tiAttribDatiSpec;
    private List<AroValoreAttribDatiSpec> aroValoreAttribDatiSpecs;
    private DecTipoCompDoc decTipoCompDoc;
    private DecTipoDoc decTipoDoc;
    private DecTipoUnitaDoc decTipoUnitaDoc;
    private OrgStrut orgStrut;
    private List<DecXsdAttribDatiSpec> decXsdAttribDatiSpecs;
    private List<OrgCampoValSubStrut> orgCampoValSubStruts;
    private List<DecCampoInpUd> decCampoInpUds;
    private List<DecCampoOutSelUd> decCampoOutSelUds;
    private List<DecFiltroSelUdDato> decFiltroSelUdDatos;

    public DecAttribDatiSpec() {
    }

    @Id
    @SequenceGenerator(name = "DEC_ATTRIB_DATI_SPEC_IDATTRIBDATISPEC_GENERATOR", sequenceName = "SDEC_ATTRIB_DATI_SPEC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_ATTRIB_DATI_SPEC_IDATTRIBDATISPEC_GENERATOR")
    @Column(name = "ID_ATTRIB_DATI_SPEC")
    @XmlID
    public long getIdAttribDatiSpec() {
        return this.idAttribDatiSpec;
    }

    public void setIdAttribDatiSpec(long idAttribDatiSpec) {
        this.idAttribDatiSpec = idAttribDatiSpec;
    }

    @Column(name = "DS_ATTRIB_DATI_SPEC")
    public String getDsAttribDatiSpec() {
        return this.dsAttribDatiSpec;
    }

    public void setDsAttribDatiSpec(String dsAttribDatiSpec) {
        this.dsAttribDatiSpec = dsAttribDatiSpec;
    }

    @Column(name = "NM_ATTRIB_DATI_SPEC")
    public String getNmAttribDatiSpec() {
        return this.nmAttribDatiSpec;
    }

    public void setNmAttribDatiSpec(String nmAttribDatiSpec) {
        this.nmAttribDatiSpec = nmAttribDatiSpec;
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

    @Column(name = "TI_USO_ATTRIB")
    public String getTiUsoAttrib() {
        return this.tiUsoAttrib;
    }

    public void setTiUsoAttrib(String tiUsoAttrib) {
        this.tiUsoAttrib = tiUsoAttrib;
    }

    @Column(name = "TI_ATTRIB_DATI_SPEC")
    public String getTiAttribDatiSpec() {
        return tiAttribDatiSpec;
    }

    public void setTiAttribDatiSpec(String tiAttribDatiSpec) {
        this.tiAttribDatiSpec = tiAttribDatiSpec;
    }

    // bi-directional many-to-one association to AroValoreAttribDatiSpec
    @OneToMany(mappedBy = "decAttribDatiSpec")
    @XmlTransient
    public List<AroValoreAttribDatiSpec> getAroValoreAttribDatiSpecs() {
        return this.aroValoreAttribDatiSpecs;
    }

    public void setAroValoreAttribDatiSpecs(List<AroValoreAttribDatiSpec> aroValoreAttribDatiSpecs) {
        this.aroValoreAttribDatiSpecs = aroValoreAttribDatiSpecs;
    }

    // bi-directional many-to-one association to DecTipoCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_COMP_DOC")
    @XmlInverseReference(mappedBy = "decAttribDatiSpecs")
    public DecTipoCompDoc getDecTipoCompDoc() {
        return this.decTipoCompDoc;
    }

    public void setDecTipoCompDoc(DecTipoCompDoc decTipoCompDoc) {
        this.decTipoCompDoc = decTipoCompDoc;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC")
    @XmlInverseReference(mappedBy = "decAttribDatiSpecs")
    public DecTipoDoc getDecTipoDoc() {
        return this.decTipoDoc;
    }

    public void setDecTipoDoc(DecTipoDoc decTipoDoc) {
        this.decTipoDoc = decTipoDoc;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decAttribDatiSpecs")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "decAttribDatiSpecs")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to DecXsdAttribDatiSpec
    @OneToMany(mappedBy = "decAttribDatiSpec", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    public List<DecXsdAttribDatiSpec> getDecXsdAttribDatiSpecs() {
        return this.decXsdAttribDatiSpecs;
    }

    public void setDecXsdAttribDatiSpecs(List<DecXsdAttribDatiSpec> decXsdAttribDatiSpecs) {
        this.decXsdAttribDatiSpecs = decXsdAttribDatiSpecs;
    }

    // bi-directional many-to-one association to OrgCampoValSubStrut
    @OneToMany(mappedBy = "decAttribDatiSpec", cascade = CascadeType.PERSIST)
    @XmlIDREF
    public List<OrgCampoValSubStrut> getOrgCampoValSubStruts() {
        return this.orgCampoValSubStruts;
    }

    public void setOrgCampoValSubStruts(List<OrgCampoValSubStrut> orgCampoValSubStruts) {
        this.orgCampoValSubStruts = orgCampoValSubStruts;
    }

    // bi-directional many-to-one association to DecCampoInpUd
    @OneToMany(mappedBy = "decAttribDatiSpec")
    @XmlTransient
    public List<DecCampoInpUd> getDecCampoInpUds() {
        return this.decCampoInpUds;
    }

    public void setDecCampoInpUds(List<DecCampoInpUd> decCampoInpUds) {
        this.decCampoInpUds = decCampoInpUds;
    }

    // bi-directional many-to-one association to DecCampoOutSelUd
    @OneToMany(mappedBy = "decAttribDatiSpec")
    @XmlTransient
    public List<DecCampoOutSelUd> getDecCampoOutSelUds() {
        return this.decCampoOutSelUds;
    }

    public void setDecCampoOutSelUds(List<DecCampoOutSelUd> decCampoOutSelUds) {
        this.decCampoOutSelUds = decCampoOutSelUds;
    }

    // bi-directional many-to-one association to DecFiltroSelUdDato
    @OneToMany(mappedBy = "decAttribDatiSpec")
    @XmlTransient
    public List<DecFiltroSelUdDato> getDecFiltroSelUdDatos() {
        return this.decFiltroSelUdDatos;
    }

    public void setDecFiltroSelUdDatos(List<DecFiltroSelUdDato> decFiltroSelUdDatos) {
        this.decFiltroSelUdDatos = decFiltroSelUdDatos;
    }
}
