package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_CATEG_TIPO_UNITA_DOC database table.
 *
 */
@Entity
@Table(name = "DEC_CATEG_TIPO_UNITA_DOC")
public class DecCategTipoUnitaDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idCategTipoUnitaDoc;
    private String cdCategTipoUnitaDoc;
    private String dsCategTipoUnitaDoc;
    private DecCategTipoUnitaDoc decCategTipoUnitaDoc;
    private List<DecCategTipoUnitaDoc> decCategTipoUnitaDocs;
    private List<DecTipoUnitaDoc> decTipoUnitaDocs;

    public DecCategTipoUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_CATEG_TIPO_UNITA_DOC_IDCATEGTIPOUNITADOC_GENERATOR", sequenceName = "SDEC_CATEG_TIPO_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_CATEG_TIPO_UNITA_DOC_IDCATEGTIPOUNITADOC_GENERATOR")
    @Column(name = "ID_CATEG_TIPO_UNITA_DOC")
    public long getIdCategTipoUnitaDoc() {
        return this.idCategTipoUnitaDoc;
    }

    public void setIdCategTipoUnitaDoc(long idCategTipoUnitaDoc) {
        this.idCategTipoUnitaDoc = idCategTipoUnitaDoc;
    }

    @Column(name = "CD_CATEG_TIPO_UNITA_DOC")
    public String getCdCategTipoUnitaDoc() {
        return this.cdCategTipoUnitaDoc;
    }

    public void setCdCategTipoUnitaDoc(String cdCategTipoUnitaDoc) {
        this.cdCategTipoUnitaDoc = cdCategTipoUnitaDoc;
    }

    @Column(name = "DS_CATEG_TIPO_UNITA_DOC")
    public String getDsCategTipoUnitaDoc() {
        return this.dsCategTipoUnitaDoc;
    }

    public void setDsCategTipoUnitaDoc(String dsCategTipoUnitaDoc) {
        this.dsCategTipoUnitaDoc = dsCategTipoUnitaDoc;
    }

    // bi-directional many-to-one association to DecCategTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CATEG_TIPO_UNITA_DOC_PADRE")
    @XmlTransient
    public DecCategTipoUnitaDoc getDecCategTipoUnitaDoc() {
        return this.decCategTipoUnitaDoc;
    }

    public void setDecCategTipoUnitaDoc(DecCategTipoUnitaDoc decCategTipoUnitaDoc) {
        this.decCategTipoUnitaDoc = decCategTipoUnitaDoc;
    }

    // bi-directional many-to-one association to DecCategTipoUnitaDoc
    @OneToMany(mappedBy = "decCategTipoUnitaDoc")
    public List<DecCategTipoUnitaDoc> getDecCategTipoUnitaDocs() {
        return this.decCategTipoUnitaDocs;
    }

    public void setDecCategTipoUnitaDocs(List<DecCategTipoUnitaDoc> decCategTipoUnitaDocs) {
        this.decCategTipoUnitaDocs = decCategTipoUnitaDocs;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @OneToMany(mappedBy = "decCategTipoUnitaDoc")
    @XmlInverseReference(mappedBy = "decCategTipoUnitaDoc")
    // @XmlTransient
    public List<DecTipoUnitaDoc> getDecTipoUnitaDocs() {
        return this.decTipoUnitaDocs;
    }

    public void setDecTipoUnitaDocs(List<DecTipoUnitaDoc> decTipoUnitaDocs) {
        this.decTipoUnitaDocs = decTipoUnitaDocs;
    }

}
