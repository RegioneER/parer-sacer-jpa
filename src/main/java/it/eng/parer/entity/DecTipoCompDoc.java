package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_TIPO_COMP_DOC database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_TIPO_COMP_DOC")
@NamedQuery(name = "DecTipoCompDoc.findAll", query = "SELECT d FROM DecTipoCompDoc d")
public class DecTipoCompDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idTipoCompDoc;
    private String dsTipoCompDoc;
    private Date dtIstituz;
    private Date dtSoppres;
    private String nmTipoCompDoc;
    private String tiUsoCompDoc;
    private List<AroCompDoc> aroCompDocs;
    private List<DecAttribDatiSpec> decAttribDatiSpecs;
    private List<DecFormatoFileAmmesso> decFormatoFileAmmessos;
    private DecTipoStrutDoc decTipoStrutDoc;
    private List<DecTipoRapprAmmesso> decTipoRapprAmmessos;
    private List<DecXsdDatiSpec> decXsdDatiSpecs;
    private List<DecUsoModelloXsdCompDoc> decUsoModelloXsdCompDocs;

    public DecTipoCompDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_COMP_DOC_IDTIPOCOMPDOC_GENERATOR", sequenceName = "SDEC_TIPO_COMP_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_COMP_DOC_IDTIPOCOMPDOC_GENERATOR")
    @Column(name = "ID_TIPO_COMP_DOC")
    public long getIdTipoCompDoc() {
        return this.idTipoCompDoc;
    }

    public void setIdTipoCompDoc(long idTipoCompDoc) {
        this.idTipoCompDoc = idTipoCompDoc;
    }

    @Column(name = "DS_TIPO_COMP_DOC")
    public String getDsTipoCompDoc() {
        return this.dsTipoCompDoc;
    }

    public void setDsTipoCompDoc(String dsTipoCompDoc) {
        this.dsTipoCompDoc = dsTipoCompDoc;
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

    @Column(name = "NM_TIPO_COMP_DOC")
    public String getNmTipoCompDoc() {
        return this.nmTipoCompDoc;
    }

    public void setNmTipoCompDoc(String nmTipoCompDoc) {
        this.nmTipoCompDoc = nmTipoCompDoc;
    }

    @Column(name = "TI_USO_COMP_DOC")
    public String getTiUsoCompDoc() {
        return this.tiUsoCompDoc;
    }

    public void setTiUsoCompDoc(String tiUsoCompDoc) {
        this.tiUsoCompDoc = tiUsoCompDoc;
    }

    // bi-directional many-to-one association to AroCompDoc
    @OneToMany(mappedBy = "decTipoCompDoc")
    @XmlTransient
    public List<AroCompDoc> getAroCompDocs() {
        return this.aroCompDocs;
    }

    public void setAroCompDocs(List<AroCompDoc> aroCompDocs) {
        this.aroCompDocs = aroCompDocs;
    }

    // bi-directional many-to-one association to DecFormatoFileAmmesso
    @OneToMany(mappedBy = "decTipoCompDoc", cascade = CascadeType.PERSIST)
    public List<DecFormatoFileAmmesso> getDecFormatoFileAmmessos() {
        return this.decFormatoFileAmmessos;
    }

    public void setDecFormatoFileAmmessos(List<DecFormatoFileAmmesso> decFormatoFileAmmessos) {
        this.decFormatoFileAmmessos = decFormatoFileAmmessos;
    }

    // bi-directional many-to-one association to DecTipoStrutDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_STRUT_DOC")
    @XmlInverseReference(mappedBy = "decTipoCompDocs")
    public DecTipoStrutDoc getDecTipoStrutDoc() {
        return this.decTipoStrutDoc;
    }

    public void setDecTipoStrutDoc(DecTipoStrutDoc decTipoStrutDoc) {
        this.decTipoStrutDoc = decTipoStrutDoc;
    }

    // bi-directional many-to-one association to DecAttribDatiSpec
    @OneToMany(mappedBy = "decTipoCompDoc", cascade = CascadeType.PERSIST)
    @XmlIDREF
    public List<DecAttribDatiSpec> getDecAttribDatiSpecs() {
        return this.decAttribDatiSpecs;
    }

    public void setDecAttribDatiSpecs(List<DecAttribDatiSpec> decAttribDatiSpecs) {
        this.decAttribDatiSpecs = decAttribDatiSpecs;
    }

    // bi-directional many-to-one association to DecXsdDatiSpec
    @OneToMany(mappedBy = "decTipoCompDoc", cascade = CascadeType.PERSIST)
    @XmlIDREF
    public List<DecXsdDatiSpec> getDecXsdDatiSpecs() {
        return this.decXsdDatiSpecs;
    }

    public void setDecXsdDatiSpecs(List<DecXsdDatiSpec> decXsdDatiSpecs) {
        this.decXsdDatiSpecs = decXsdDatiSpecs;
    }

    // bi-directional many-to-one association to DecTipoRapprAmmesso
    @OneToMany(mappedBy = "decTipoCompDoc")
    public List<DecTipoRapprAmmesso> getDecTipoRapprAmmessos() {
        return this.decTipoRapprAmmessos;
    }

    public void setDecTipoRapprAmmessos(List<DecTipoRapprAmmesso> decTipoRapprAmmessos) {
        this.decTipoRapprAmmessos = decTipoRapprAmmessos;
    }

    // bi-directional many-to-one association to DecTipoRapprAmmesso
    @OneToMany(mappedBy = "decTipoCompDoc", cascade = CascadeType.PERSIST)
    public List<DecUsoModelloXsdCompDoc> getDecUsoModelloXsdCompDocs() {
        return this.decUsoModelloXsdCompDocs;
    }

    public void setDecUsoModelloXsdCompDocs(List<DecUsoModelloXsdCompDoc> decUsoModelloXsdCompDocs) {
        this.decUsoModelloXsdCompDocs = decUsoModelloXsdCompDocs;
    }
}
