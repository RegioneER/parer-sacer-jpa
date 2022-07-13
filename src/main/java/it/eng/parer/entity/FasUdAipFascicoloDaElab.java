package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the FAS_UD_AIP_FASCICOLO_DA_ELAB database table.
 * 
 */
@Entity
@Table(name = "FAS_UD_AIP_FASCICOLO_DA_ELAB")
public class FasUdAipFascicoloDaElab implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUdAipFascicoloDaElab;
    private AroVerIndiceAipUd aroVerIndiceAipUd;
    private FasAipFascicoloDaElab fasAipFascicoloDaElab;

    public FasUdAipFascicoloDaElab() {
    }

    @Id
    @SequenceGenerator(name = "FAS_UD_AIP_FASCICOLO_DA_ELAB_IDUDAIPFASCICOLODAELAB_GENERATOR", allocationSize = 1, sequenceName = "SFAS_UD_AIP_FASCICOLO_DA_ELAB")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_UD_AIP_FASCICOLO_DA_ELAB_IDUDAIPFASCICOLODAELAB_GENERATOR")
    @Column(name = "ID_UD_AIP_FASCICOLO_DA_ELAB")
    public long getIdUdAipFascicoloDaElab() {
        return this.idUdAipFascicoloDaElab;
    }

    public void setIdUdAipFascicoloDaElab(long idUdAipFascicoloDaElab) {
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