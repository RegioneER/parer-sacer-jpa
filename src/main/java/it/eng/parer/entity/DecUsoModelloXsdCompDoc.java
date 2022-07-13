package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

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

/**
 * The persistent class for the DEC_USO_MODELLO_XSD_COMP_DOC database table.
 * 
 */
@Entity
@Table(name = "DEC_USO_MODELLO_XSD_COMP_DOC")
public class DecUsoModelloXsdCompDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idUsoModelloXsdCompDoc;
    private String flStandard;
    private Date dtIstituz;
    private Date dtSoppres;
    private DecModelloXsdUd decModelloXsdUd;
    private DecTipoCompDoc decTipoCompDoc;

    public DecUsoModelloXsdCompDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_USO_MODELLO_XSD_COMP_DOC_IDUSOMODELLOXSDCOMPDOC_GENERATOR", sequenceName = "SDEC_USO_MODELLO_XSD_COMP_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_USO_MODELLO_XSD_COMP_DOC_IDUSOMODELLOXSDCOMPDOC_GENERATOR")
    @Column(name = "ID_USO_MODELLO_XSD_COMP_DOC")
    public Long getIdUsoModelloXsdCompDoc() {
        return this.idUsoModelloXsdCompDoc;
    }

    public void setIdUsoModelloXsdCompDoc(Long idUsoModelloXsdCompDoc) {
        this.idUsoModelloXsdCompDoc = idUsoModelloXsdCompDoc;
    }

    @Column(name = "FL_STANDARD")
    public String getFlStandard() {
        return this.flStandard;
    }

    public void setFlStandard(String flStandard) {
        this.flStandard = flStandard;
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

    // bi-directional many-to-one association to DecAaTipoFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODELLO_XSD_UD")
    public DecModelloXsdUd getDecModelloXsdUd() {
        return this.decModelloXsdUd;
    }

    public void setDecModelloXsdUd(DecModelloXsdUd decModelloXsdUd) {
        this.decModelloXsdUd = decModelloXsdUd;
    }

    // bi-directional many-to-one association to DecModelloXsdFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_COMP_DOC")
    public DecTipoCompDoc getDecTipoCompDoc() {
        return this.decTipoCompDoc;
    }

    public void setDecTipoCompDoc(DecTipoCompDoc decTipoCompDoc) {
        this.decTipoCompDoc = decTipoCompDoc;
    }

}