package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * The persistent class for the ARO_UPD_DOC_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_UPD_DOC_UNITA_DOC")
@NamedQuery(name = "AroUpdDocUnitaDoc.findAll", query = "SELECT a FROM AroUpdDocUnitaDoc a")
public class AroUpdDocUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUpdDocUnitaDoc;
    private String dlDoc;
    private String dsAutoreDoc;
    private AroDoc aroDoc;
    private AroUpdUnitaDoc aroUpdUnitaDoc;
    private List<AroUpdCompUnitaDoc> aroUpdCompUnitaDocs;
    private List<AroUpdDatiSpecUnitaDoc> aroUpdDatiSpecUnitaDocs;
    private String flUpdProfiloDoc;
    private String flUpdDatiSpec;
    private String flUpdDatiSpecMigraz;

    public AroUpdDocUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UPD_DOC_UNITA_DOC_IDUPDDOCUNITADOC_GENERATOR", sequenceName = "SARO_UPD_DOC_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UPD_DOC_UNITA_DOC_IDUPDDOCUNITADOC_GENERATOR")
    @Column(name = "ID_UPD_DOC_UNITA_DOC")
    public long getIdUpdDocUnitaDoc() {
        return this.idUpdDocUnitaDoc;
    }

    public void setIdUpdDocUnitaDoc(long idUpdDocUnitaDoc) {
        this.idUpdDocUnitaDoc = idUpdDocUnitaDoc;
    }

    @Column(name = "DL_DOC")
    public String getDlDoc() {
        return this.dlDoc;
    }

    public void setDlDoc(String dlDoc) {
        this.dlDoc = dlDoc;
    }

    @Column(name = "DS_AUTORE_DOC")
    public String getDsAutoreDoc() {
        return this.dsAutoreDoc;
    }

    public void setDsAutoreDoc(String dsAutoreDoc) {
        this.dsAutoreDoc = dsAutoreDoc;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOC")
    public AroDoc getAroDoc() {
        return this.aroDoc;
    }

    public void setAroDoc(AroDoc aroDoc) {
        this.aroDoc = aroDoc;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }

    // bi-directional many-to-one association to AroUpdCompUnitaDoc
    @OneToMany(mappedBy = "aroUpdDocUnitaDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroUpdCompUnitaDoc> getAroUpdCompUnitaDocs() {
        return this.aroUpdCompUnitaDocs;
    }

    public void setAroUpdCompUnitaDocs(List<AroUpdCompUnitaDoc> aroUpdCompUnitaDocs) {
        this.aroUpdCompUnitaDocs = aroUpdCompUnitaDocs;
    }

    // bi-directional many-to-one association to AroUpdDatiSpecUnitaDoc
    @OneToMany(mappedBy = "aroUpdDocUnitaDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroUpdDatiSpecUnitaDoc> getAroUpdDatiSpecUnitaDocs() {
        return this.aroUpdDatiSpecUnitaDocs;
    }

    public void setAroUpdDatiSpecUnitaDocs(List<AroUpdDatiSpecUnitaDoc> aroUpdDatiSpecUnitaDocs) {
        this.aroUpdDatiSpecUnitaDocs = aroUpdDatiSpecUnitaDocs;
    }

    @Column(name = "FL_UPD_PROFILO_DOC")
    public String getFlUpdProfiloDoc() {
        return this.flUpdProfiloDoc;
    }

    public void setFlUpdProfiloDoc(String flUpdProfiloDoc) {
        this.flUpdProfiloDoc = flUpdProfiloDoc;
    }

    @Column(name = "FL_UPD_DATI_SPEC")
    public String getFlUpdDatiSpec() {
        return this.flUpdDatiSpec;
    }

    public void setFlUpdDatiSpec(String flUpdDatiSpec) {
        this.flUpdDatiSpec = flUpdDatiSpec;
    }

    @Column(name = "FL_UPD_DATI_SPEC_MIGRAZ")
    public String getFlUpdDatiSpecMigraz() {
        return this.flUpdDatiSpecMigraz;
    }

    public void setFlUpdDatiSpecMigraz(String flUpdDatiSpecMigraz) {
        this.flUpdDatiSpecMigraz = flUpdDatiSpecMigraz;
    }
}