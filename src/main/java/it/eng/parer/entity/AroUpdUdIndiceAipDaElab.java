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

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_UPD_UD_INDICE_AIP_DA_ELAB database table.
 */
@Entity
@Table(name = "ARO_UPD_UD_INDICE_AIP_DA_ELAB")
@NamedQuery(name = "AroUpdUdIndiceAipDaElab.findAll", query = "SELECT a FROM AroUpdUdIndiceAipDaElab a")
public class AroUpdUdIndiceAipDaElab implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUpdUdIndiceAipDaElab;

    private AroIndiceAipUdDaElab aroIndiceAipUdDaElab;

    private AroUpdUnitaDoc aroUpdUnitaDoc;

    public AroUpdUdIndiceAipDaElab() {/* Hibernate */
    }

    @Id
    // "ARO_UPD_UD_INDICE_AIP_DA_ELAB_IDUPDUDINDICEAIPDAELAB_GENERATOR",
    // sequenceName =
    // "SARO_UPD_UD_INDICE_AIP_DA_ELAB",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ARO_UPD_UD_INDICE_AIP_DA_ELAB_IDUPDUDINDICEAIPDAELAB_GENERATOR")
    @Column(name = "ID_UPD_UD_INDICE_AIP_DA_ELAB")
    @GenericGenerator(name = "SARO_UPD_UD_INDICE_AIP_DA_ELAB_ID_UPD_UD_INDICE_AIP_DA_ELAB_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_UPD_UD_INDICE_AIP_DA_ELAB"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_UPD_UD_INDICE_AIP_DA_ELAB_ID_UPD_UD_INDICE_AIP_DA_ELAB_GENERATOR")
    public Long getIdUpdUdIndiceAipDaElab() {
        return this.idUpdUdIndiceAipDaElab;
    }

    public void setIdUpdUdIndiceAipDaElab(Long idUpdUdIndiceAipDaElab) {
        this.idUpdUdIndiceAipDaElab = idUpdUdIndiceAipDaElab;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_INDICE_AIP_DA_ELAB")
    public AroIndiceAipUdDaElab getAroIndiceAipUdDaElab() {
        return this.aroIndiceAipUdDaElab;
    }

    public void setAroIndiceAipUdDaElab(AroIndiceAipUdDaElab aroIndiceAipUdDaElab) {
        this.aroIndiceAipUdDaElab = aroIndiceAipUdDaElab;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }
}
