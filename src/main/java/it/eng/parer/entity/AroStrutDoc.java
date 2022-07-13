package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the ARO_STRUT_DOC database table.
 *
 */
@Entity
@Table(name = "ARO_STRUT_DOC")
public class AroStrutDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idStrutDoc;
    private String flStrutOrig;
    private BigDecimal idStrut;
    private BigDecimal niOrdStrutDoc;
    private List<AroCompDoc> aroCompDocs;
    private AroDoc aroDoc;
    private DecTipoStrutDoc decTipoStrutDoc;

    public AroStrutDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_STRUT_DOC_IDSTRUTDOC_GENERATOR", sequenceName = "SARO_STRUT_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_STRUT_DOC_IDSTRUTDOC_GENERATOR")
    @Column(name = "ID_STRUT_DOC")
    public long getIdStrutDoc() {
        return this.idStrutDoc;
    }

    public void setIdStrutDoc(long idStrutDoc) {
        this.idStrutDoc = idStrutDoc;
    }

    @Column(name = "FL_STRUT_ORIG")
    public String getFlStrutOrig() {
        return this.flStrutOrig;
    }

    public void setFlStrutOrig(String flStrutOrig) {
        this.flStrutOrig = flStrutOrig;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_ORD_STRUT_DOC")
    public BigDecimal getNiOrdStrutDoc() {
        return this.niOrdStrutDoc;
    }

    public void setNiOrdStrutDoc(BigDecimal niOrdStrutDoc) {
        this.niOrdStrutDoc = niOrdStrutDoc;
    }

    // bi-directional many-to-one association to AroCompDoc
    @OneToMany(mappedBy = "aroStrutDoc", cascade = { CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroCompDoc> getAroCompDocs() {
        return this.aroCompDocs;
    }

    public void setAroCompDocs(List<AroCompDoc> aroCompDocs) {
        this.aroCompDocs = aroCompDocs;
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

    // bi-directional many-to-one association to DecTipoStrutDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_STRUT_DOC")
    public DecTipoStrutDoc getDecTipoStrutDoc() {
        return this.decTipoStrutDoc;
    }

    public void setDecTipoStrutDoc(DecTipoStrutDoc decTipoStrutDoc) {
        this.decTipoStrutDoc = decTipoStrutDoc;
    }

}