package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the DEC_TIPO_NOTA_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "DEC_TIPO_NOTA_UNITA_DOC")
@NamedQuery(name = "DecTipoNotaUnitaDoc.findAll", query = "SELECT d FROM DecTipoNotaUnitaDoc d")
public class DecTipoNotaUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idTipoNotaUnitaDoc;
    private String cdTipoNotaUnitaDoc;
    private String dsTipoNotaUnitaDoc;
    private String flMolt;
    private String flObblig;
    private BigDecimal niOrd;
    private List<AroNotaUnitaDoc> aroNotaUnitaDocs;

    public DecTipoNotaUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_NOTA_UNITA_DOC_IDTIPONOTAUNITADOC_GENERATOR", sequenceName = "SDEC_TIPO_NOTA_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_NOTA_UNITA_DOC_IDTIPONOTAUNITADOC_GENERATOR")
    @Column(name = "ID_TIPO_NOTA_UNITA_DOC")
    public long getIdTipoNotaUnitaDoc() {
        return this.idTipoNotaUnitaDoc;
    }

    public void setIdTipoNotaUnitaDoc(long idTipoNotaUnitaDoc) {
        this.idTipoNotaUnitaDoc = idTipoNotaUnitaDoc;
    }

    @Column(name = "CD_TIPO_NOTA_UNITA_DOC")
    public String getCdTipoNotaUnitaDoc() {
        return this.cdTipoNotaUnitaDoc;
    }

    public void setCdTipoNotaUnitaDoc(String cdTipoNotaUnitaDoc) {
        this.cdTipoNotaUnitaDoc = cdTipoNotaUnitaDoc;
    }

    @Column(name = "DS_TIPO_NOTA_UNITA_DOC")
    public String getDsTipoNotaUnitaDoc() {
        return this.dsTipoNotaUnitaDoc;
    }

    public void setDsTipoNotaUnitaDoc(String dsTipoNotaUnitaDoc) {
        this.dsTipoNotaUnitaDoc = dsTipoNotaUnitaDoc;
    }

    @Column(name = "FL_MOLT")
    public String getFlMolt() {
        return this.flMolt;
    }

    public void setFlMolt(String flMolt) {
        this.flMolt = flMolt;
    }

    @Column(name = "FL_OBBLIG")
    public String getFlObblig() {
        return this.flObblig;
    }

    public void setFlObblig(String flObblig) {
        this.flObblig = flObblig;
    }

    @Column(name = "NI_ORD")
    public BigDecimal getNiOrd() {
        return this.niOrd;
    }

    public void setNiOrd(BigDecimal niOrd) {
        this.niOrd = niOrd;
    }

    // bi-directional many-to-one association to AroNotaUnitaDoc
    @OneToMany(mappedBy = "decTipoNotaUnitaDoc")
    public List<AroNotaUnitaDoc> getAroNotaUnitaDocs() {
        return this.aroNotaUnitaDocs;
    }

    public void setAroNotaUnitaDocs(List<AroNotaUnitaDoc> aroNotaUnitaDocs) {
        this.aroNotaUnitaDocs = aroNotaUnitaDocs;
    }

    public AroNotaUnitaDoc addAroNotaUnitaDoc(AroNotaUnitaDoc aroNotaUnitaDoc) {
        getAroNotaUnitaDocs().add(aroNotaUnitaDoc);
        aroNotaUnitaDoc.setDecTipoNotaUnitaDoc(this);

        return aroNotaUnitaDoc;
    }

    public AroNotaUnitaDoc removeAroNotaUnitaDoc(AroNotaUnitaDoc aroNotaUnitaDoc) {
        getAroNotaUnitaDocs().remove(aroNotaUnitaDoc);
        aroNotaUnitaDoc.setDecTipoNotaUnitaDoc(null);

        return aroNotaUnitaDoc;
    }

}