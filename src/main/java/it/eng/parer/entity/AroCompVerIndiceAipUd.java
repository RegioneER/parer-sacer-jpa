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
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_COMP_VER_INDICE_AIP_UD database table.
 */
@Entity
@Table(name = "ARO_COMP_VER_INDICE_AIP_UD")
public class AroCompVerIndiceAipUd implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idCompVerIndiceAipUd;

    private AroCompDoc aroCompDoc;

    private AroVerIndiceAipUd aroVerIndiceAipUd;

    public AroCompVerIndiceAipUd() {/* Hibernate */
    }

    @Id
    // "ARO_COMP_VER_INDICE_AIP_UD_IDCOMPVERINDICEAIPUD_GENERATOR",
    // allocationSize = 1, sequenceName =
    // "SARO_COMP_VER_INDICE_AIP_UD")
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ARO_COMP_VER_INDICE_AIP_UD_IDCOMPVERINDICEAIPUD_GENERATOR")
    @Column(name = "ID_COMP_VER_INDICE_AIP_UD")
    @GenericGenerator(name = "SARO_COMP_VER_INDICE_AIP_UD_ID_COMP_VER_INDICE_AIP_UD_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_COMP_VER_INDICE_AIP_UD"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_COMP_VER_INDICE_AIP_UD_ID_COMP_VER_INDICE_AIP_UD_GENERATOR")
    public Long getIdCompVerIndiceAipUd() {
        return this.idCompVerIndiceAipUd;
    }

    public void setIdCompVerIndiceAipUd(Long idCompVerIndiceAipUd) {
        this.idCompVerIndiceAipUd = idCompVerIndiceAipUd;
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

    // bi-directional many-to-one association to AroVerIndiceAipUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VER_INDICE_AIP")
    public AroVerIndiceAipUd getAroVerIndiceAipUd() {
        return this.aroVerIndiceAipUd;
    }

    public void setAroVerIndiceAipUd(AroVerIndiceAipUd aroVerIndiceAipUd) {
        this.aroVerIndiceAipUd = aroVerIndiceAipUd;
    }
}
