package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * The persistent class for the ARO_UPD_COMP_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_UPD_COMP_UNITA_DOC")
@NamedQuery(name = "AroUpdCompUnitaDoc.findAll", query = "SELECT a FROM AroUpdCompUnitaDoc a")
public class AroUpdCompUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUpdCompUnitaDoc;
    private String dlUrnCompVers;
    private String dsIdCompVers;
    private String dsNomeCompVers;
    private AroCompDoc aroCompDoc;
    private AroUpdDocUnitaDoc aroUpdDocUnitaDoc;
    private List<AroUpdDatiSpecUnitaDoc> aroUpdDatiSpecUnitaDocs;
    private String flUpdDatiSpec;
    private String flUpdDatiSpecMigraz;

    public AroUpdCompUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UPD_COMP_UNITA_DOC_IDUPDCOMPUNITADOC_GENERATOR", sequenceName = "SARO_UPD_COMP_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UPD_COMP_UNITA_DOC_IDUPDCOMPUNITADOC_GENERATOR")
    @Column(name = "ID_UPD_COMP_UNITA_DOC")
    public long getIdUpdCompUnitaDoc() {
        return this.idUpdCompUnitaDoc;
    }

    public void setIdUpdCompUnitaDoc(long idUpdCompUnitaDoc) {
        this.idUpdCompUnitaDoc = idUpdCompUnitaDoc;
    }

    @Column(name = "DL_URN_COMP_VERS")
    public String getDlUrnCompVers() {
        return this.dlUrnCompVers;
    }

    public void setDlUrnCompVers(String dlUrnCompVers) {
        this.dlUrnCompVers = dlUrnCompVers;
    }

    @Column(name = "DS_ID_COMP_VERS")
    public String getDsIdCompVers() {
        return this.dsIdCompVers;
    }

    public void setDsIdCompVers(String dsIdCompVers) {
        this.dsIdCompVers = dsIdCompVers;
    }

    @Column(name = "DS_NOME_COMP_VERS")
    public String getDsNomeCompVers() {
        return this.dsNomeCompVers;
    }

    public void setDsNomeCompVers(String dsNomeCompVers) {
        this.dsNomeCompVers = dsNomeCompVers;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_DOC_UNITA_DOC")
    public AroUpdDocUnitaDoc getAroUpdDocUnitaDoc() {
        return this.aroUpdDocUnitaDoc;
    }

    public void setAroUpdDocUnitaDoc(AroUpdDocUnitaDoc aroUpdDocUnitaDoc) {
        this.aroUpdDocUnitaDoc = aroUpdDocUnitaDoc;
    }

    // bi-directional many-to-one association to AroUpdDatiSpecUnitaDoc
    @OneToMany(mappedBy = "aroUpdCompUnitaDoc", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroUpdDatiSpecUnitaDoc> getAroUpdDatiSpecUnitaDocs() {
        return this.aroUpdDatiSpecUnitaDocs;
    }

    public void setAroUpdDatiSpecUnitaDocs(List<AroUpdDatiSpecUnitaDoc> aroUpdDatiSpecUnitaDocs) {
        this.aroUpdDatiSpecUnitaDocs = aroUpdDatiSpecUnitaDocs;
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