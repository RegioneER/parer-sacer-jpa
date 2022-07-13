package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_TIPO_STRUT_DOC database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_TIPO_STRUT_DOC")
public class DecTipoStrutDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idTipoStrutDoc;
    private String dsTipoStrutDoc;
    private Date dtIstituz;
    private Date dtSoppres;
    private String nmTipoStrutDoc;
    private List<AroStrutDoc> aroStrutDocs;
    private List<DecTipoCompDoc> decTipoCompDocs;
    private OrgStrut orgStrut;
    private List<DecTipoStrutDocAmmesso> decTipoStrutDocAmmessos;

    public DecTipoStrutDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_STRUT_DOC_IDTIPOSTRUTDOC_GENERATOR", sequenceName = "SDEC_TIPO_STRUT_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_STRUT_DOC_IDTIPOSTRUTDOC_GENERATOR")
    @Column(name = "ID_TIPO_STRUT_DOC")
    public long getIdTipoStrutDoc() {
        return this.idTipoStrutDoc;
    }

    public void setIdTipoStrutDoc(long idTipoStrutDoc) {
        this.idTipoStrutDoc = idTipoStrutDoc;
    }

    @Column(name = "DS_TIPO_STRUT_DOC")
    public String getDsTipoStrutDoc() {
        return this.dsTipoStrutDoc;
    }

    public void setDsTipoStrutDoc(String dsTipoStrutDoc) {
        this.dsTipoStrutDoc = dsTipoStrutDoc;
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

    @Column(name = "NM_TIPO_STRUT_DOC")
    public String getNmTipoStrutDoc() {
        return this.nmTipoStrutDoc;
    }

    public void setNmTipoStrutDoc(String nmTipoStrutDoc) {
        this.nmTipoStrutDoc = nmTipoStrutDoc;
    }

    // bi-directional many-to-one association to AroStrutDoc
    @OneToMany(mappedBy = "decTipoStrutDoc")
    @XmlTransient
    public List<AroStrutDoc> getAroStrutDocs() {
        return this.aroStrutDocs;
    }

    public void setAroStrutDocs(List<AroStrutDoc> aroStrutDocs) {
        this.aroStrutDocs = aroStrutDocs;
    }

    // bi-directional many-to-one association to DecTipoCompDoc
    @OneToMany(mappedBy = "decTipoStrutDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    public List<DecTipoCompDoc> getDecTipoCompDocs() {
        return this.decTipoCompDocs;
    }

    public void setDecTipoCompDocs(List<DecTipoCompDoc> decTipoCompDocs) {
        this.decTipoCompDocs = decTipoCompDocs;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    @XmlInverseReference(mappedBy = "decTipoStrutDocs")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to DecTipoStrutDocAmmesso
    @OneToMany(mappedBy = "decTipoStrutDoc", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
    @XmlIDREF
    public List<DecTipoStrutDocAmmesso> getDecTipoStrutDocAmmessos() {
        return this.decTipoStrutDocAmmessos;
    }

    public void setDecTipoStrutDocAmmessos(List<DecTipoStrutDocAmmesso> decTipoStrutDocAmmessos) {
        this.decTipoStrutDocAmmessos = decTipoStrutDocAmmessos;
    }
}
