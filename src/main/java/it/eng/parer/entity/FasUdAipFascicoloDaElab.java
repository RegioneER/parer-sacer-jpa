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
 * The persistent class for the FAS_UD_AIP_FASCICOLO_DA_ELAB database table.
 */
@Entity
@Table(name = "FAS_UD_AIP_FASCICOLO_DA_ELAB")
public class FasUdAipFascicoloDaElab implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUdAipFascicoloDaElab;

    private AroVerIndiceAipUd aroVerIndiceAipUd;

    private FasAipFascicoloDaElab fasAipFascicoloDaElab;

    public FasUdAipFascicoloDaElab() {/* Hibernate */
    }

    @Id
    // "FAS_UD_AIP_FASCICOLO_DA_ELAB_IDUDAIPFASCICOLODAELAB_GENERATOR",
    // allocationSize = 1, sequenceName =
    // "SFAS_UD_AIP_FASCICOLO_DA_ELAB")
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "FAS_UD_AIP_FASCICOLO_DA_ELAB_IDUDAIPFASCICOLODAELAB_GENERATOR")
    @Column(name = "ID_UD_AIP_FASCICOLO_DA_ELAB")
    @GenericGenerator(name = "SFAS_UD_AIP_FASCICOLO_DA_ELAB_ID_UD_AIP_FASCICOLO_DA_ELAB_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_UD_AIP_FASCICOLO_DA_ELAB"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_UD_AIP_FASCICOLO_DA_ELAB_ID_UD_AIP_FASCICOLO_DA_ELAB_GENERATOR")
    public Long getIdUdAipFascicoloDaElab() {
        return this.idUdAipFascicoloDaElab;
    }

    public void setIdUdAipFascicoloDaElab(Long idUdAipFascicoloDaElab) {
        this.idUdAipFascicoloDaElab = idUdAipFascicoloDaElab;
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

    // bi-directional many-to-one association to FasAipFascicoloDaElab
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AIP_FASCICOLO_DA_ELAB")
    public FasAipFascicoloDaElab getFasAipFascicoloDaElab() {
        return this.fasAipFascicoloDaElab;
    }

    public void setFasAipFascicoloDaElab(FasAipFascicoloDaElab fasAipFascicoloDaElab) {
        this.fasAipFascicoloDaElab = fasAipFascicoloDaElab;
    }

}
