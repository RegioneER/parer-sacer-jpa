package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlID;

import org.eclipse.persistence.oxm.annotations.XmlInverseReference;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the DEC_TIPO_RAPPR_AMMESSO database table.
 */
@Entity
@Table(name = "DEC_TIPO_RAPPR_AMMESSO")
@NamedQuery(name = "DecTipoRapprAmmesso.findAll", query = "SELECT d FROM DecTipoRapprAmmesso d")
public class DecTipoRapprAmmesso implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idTipoRapprAmmesso;

    private DecTipoCompDoc decTipoCompDoc;

    private DecTipoRapprComp decTipoRapprComp;

    public DecTipoRapprAmmesso() {/* Hibernate */
    }

    @Id
    // "DEC_TIPO_RAPPR_AMMESSO_IDTIPORAPPRAMMESSO_GENERATOR",
    // sequenceName =
    // "SDEC_TIPO_RAPPR_AMMESSO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_TIPO_RAPPR_AMMESSO_IDTIPORAPPRAMMESSO_GENERATOR")
    @Column(name = "ID_TIPO_RAPPR_AMMESSO")
    @XmlID
    @GenericGenerator(name = "SDEC_TIPO_RAPPR_AMMESSO_ID_TIPO_RAPPR_AMMESSO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_TIPO_RAPPR_AMMESSO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_TIPO_RAPPR_AMMESSO_ID_TIPO_RAPPR_AMMESSO_GENERATOR")
    public Long getIdTipoRapprAmmesso() {
        return this.idTipoRapprAmmesso;
    }

    public void setIdTipoRapprAmmesso(Long idTipoRapprAmmesso) {
        this.idTipoRapprAmmesso = idTipoRapprAmmesso;
    }

    // bi-directional many-to-one association to DecTipoCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_COMP_DOC")
    @XmlInverseReference(mappedBy = "decTipoRapprAmmessos")
    public DecTipoCompDoc getDecTipoCompDoc() {
        return this.decTipoCompDoc;
    }

    public void setDecTipoCompDoc(DecTipoCompDoc decTipoCompDoc) {
        this.decTipoCompDoc = decTipoCompDoc;
    }

    // bi-directional many-to-one association to DecTipoRapprComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_RAPPR_COMP")
    @XmlInverseReference(mappedBy = "decTipoRapprAmmessos")
    public DecTipoRapprComp getDecTipoRapprComp() {
        return this.decTipoRapprComp;
    }

    public void setDecTipoRapprComp(DecTipoRapprComp decTipoRapprComp) {
        this.decTipoRapprComp = decTipoRapprComp;
    }

}
