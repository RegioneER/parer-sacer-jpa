package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_COMP_INDICE_AIP_DA_ELAB database table.
 */
@Entity
@Table(name = "ARO_COMP_INDICE_AIP_DA_ELAB")
public class AroCompIndiceAipDaElab implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idCompIndiceAipDaElab;

    private AroCompDoc aroCompDoc;

    private AroIndiceAipUdDaElab aroIndiceAipUdDaElab;

    public AroCompIndiceAipDaElab() {/* Hibernate */
    }

    @Id
    // "ARO_COMP_INDICE_AIP_DA_ELAB_IDCOMPINDICEAIPDAELAB_GENERATOR",
    // allocationSize = 1, sequenceName =
    // "SARO_COMP_INDICE_AIP_DA_ELAB")
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ARO_COMP_INDICE_AIP_DA_ELAB_IDCOMPINDICEAIPDAELAB_GENERATOR")
    @Column(name = "ID_COMP_INDICE_AIP_DA_ELAB")
    @GenericGenerator(name = "SARO_COMP_INDICE_AIP_DA_ELAB_ID_COMP_INDICE_AIP_DA_ELAB_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_COMP_INDICE_AIP_DA_ELAB"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_COMP_INDICE_AIP_DA_ELAB_ID_COMP_INDICE_AIP_DA_ELAB_GENERATOR")
    public Long getIdCompIndiceAipDaElab() {
        return this.idCompIndiceAipDaElab;
    }

    public void setIdCompIndiceAipDaElab(Long idCompIndiceAipDaElab) {
        this.idCompIndiceAipDaElab = idCompIndiceAipDaElab;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

    // bi-directional many-to-one association to AroIndiceAipUdDaElab
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_INDICE_AIP_DA_ELAB")
    public AroIndiceAipUdDaElab getAroIndiceAipUdDaElab() {
        return this.aroIndiceAipUdDaElab;
    }

    public void setAroIndiceAipUdDaElab(AroIndiceAipUdDaElab aroIndiceAipUdDaElab) {
        this.aroIndiceAipUdDaElab = aroIndiceAipUdDaElab;
    }
}
