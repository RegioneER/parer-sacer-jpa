package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Cacheable;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_FORMATO_FILE_DOC database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_FORMATO_FILE_DOC")
public class DecFormatoFileDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFormatoFileDoc;
    private String cdVersione;
    private String dsFormatoFileDoc;
    private Date dtIstituz;
    private Date dtSoppres;
    private String nmFormatoFileDoc;
    private List<AroCompDoc> aroCompDocs;
    private List<DecFormatoFileAmmesso> decFormatoFileAmmessos;
    private OrgStrut orgStrut;
    private List<DecUsoFormatoFileStandard> decUsoFormatoFileStandards;
    private List<DecTipoRapprComp> decTipoRapprCompConts;
    private List<DecTipoRapprComp> decTipoRapprCompConvs;

    public DecFormatoFileDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FORMATO_FILE_DOC_IDFORMATOFILEDOC_GENERATOR", sequenceName = "SDEC_FORMATO_FILE_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FORMATO_FILE_DOC_IDFORMATOFILEDOC_GENERATOR")
    @Column(name = "ID_FORMATO_FILE_DOC")
    public long getIdFormatoFileDoc() {
        return this.idFormatoFileDoc;
    }

    public void setIdFormatoFileDoc(long idFormatoFileDoc) {
        this.idFormatoFileDoc = idFormatoFileDoc;
    }

    @Column(name = "CD_VERSIONE")
    public String getCdVersione() {
        return this.cdVersione;
    }

    public void setCdVersione(String cdVersione) {
        this.cdVersione = cdVersione;
    }

    @Column(name = "DS_FORMATO_FILE_DOC")
    public String getDsFormatoFileDoc() {
        return this.dsFormatoFileDoc;
    }

    public void setDsFormatoFileDoc(String dsFormatoFileDoc) {
        this.dsFormatoFileDoc = dsFormatoFileDoc;
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

    @Column(name = "NM_FORMATO_FILE_DOC")
    public String getNmFormatoFileDoc() {
        return this.nmFormatoFileDoc;
    }

    public void setNmFormatoFileDoc(String nmFormatoFileDoc) {
        this.nmFormatoFileDoc = nmFormatoFileDoc;
    }

    // bi-directional many-to-one association to AroCompDoc
    @OneToMany(mappedBy = "decFormatoFileDoc")
    @XmlTransient
    public List<AroCompDoc> getAroCompDocs() {
        return this.aroCompDocs;
    }

    public void setAroCompDocs(List<AroCompDoc> aroCompDocs) {
        this.aroCompDocs = aroCompDocs;
    }

    // bi-directional many-to-one association to DecFormatoFileAmmesso
    @OneToMany(mappedBy = "decFormatoFileDoc", cascade = CascadeType.PERSIST)
    @XmlIDREF
    public List<DecFormatoFileAmmesso> getDecFormatoFileAmmessos() {
        return this.decFormatoFileAmmessos;
    }

    public void setDecFormatoFileAmmessos(List<DecFormatoFileAmmesso> decFormatoFileAmmessos) {
        this.decFormatoFileAmmessos = decFormatoFileAmmessos;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "decFormatoFileDocs")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to DecUsoFormatoFileStandard
    @OneToMany(mappedBy = "decFormatoFileDoc", cascade = CascadeType.PERSIST)
    public List<DecUsoFormatoFileStandard> getDecUsoFormatoFileStandards() {
        return this.decUsoFormatoFileStandards;
    }

    public void setDecUsoFormatoFileStandards(List<DecUsoFormatoFileStandard> decUsoFormatoFileStandards) {
        this.decUsoFormatoFileStandards = decUsoFormatoFileStandards;
    }

    // bi-directional many-to-one association to DecTipoRapprComp
    @OneToMany(mappedBy = "decFormatoFileDocCont", cascade = CascadeType.PERSIST)
    @XmlIDREF
    public List<DecTipoRapprComp> getDecTipoRapprCompConts() {
        return this.decTipoRapprCompConts;
    }

    public void setDecTipoRapprCompConts(List<DecTipoRapprComp> decTipoRapprCompConts) {
        this.decTipoRapprCompConts = decTipoRapprCompConts;
    }

    // bi-directional many-to-one association to DecTipoRapprComp
    @OneToMany(mappedBy = "decFormatoFileDocConv", cascade = CascadeType.PERSIST)
    @XmlIDREF
    public List<DecTipoRapprComp> getDecTipoRapprCompConvs() {
        return this.decTipoRapprCompConvs;
    }

    public void setDecTipoRapprCompConvs(List<DecTipoRapprComp> decTipoRapprCompConvs) {
        this.decTipoRapprCompConvs = decTipoRapprCompConvs;
    }

}