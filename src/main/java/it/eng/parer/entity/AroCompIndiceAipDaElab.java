package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ARO_COMP_INDICE_AIP_DA_ELAB database table.
 * 
 */
@Entity
@Table(name = "ARO_COMP_INDICE_AIP_DA_ELAB")
public class AroCompIndiceAipDaElab implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idCompIndiceAipDaElab;
    private AroCompDoc aroCompDoc;
    private AroIndiceAipUdDaElab aroIndiceAipUdDaElab;

    public AroCompIndiceAipDaElab() {
    }

    @Id
    @SequenceGenerator(name = "ARO_COMP_INDICE_AIP_DA_ELAB_IDCOMPINDICEAIPDAELAB_GENERATOR", allocationSize = 1, sequenceName = "SARO_COMP_INDICE_AIP_DA_ELAB")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_COMP_INDICE_AIP_DA_ELAB_IDCOMPINDICEAIPDAELAB_GENERATOR")
    @Column(name = "ID_COMP_INDICE_AIP_DA_ELAB")
    public long getIdCompIndiceAipDaElab() {
        return this.idCompIndiceAipDaElab;
    }

    public void setIdCompIndiceAipDaElab(long idCompIndiceAipDaElab) {
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_INDICE_AIP_DA_ELAB")
    public AroIndiceAipUdDaElab getAroIndiceAipUdDaElab() {
        return this.aroIndiceAipUdDaElab;
    }

    public void setAroIndiceAipUdDaElab(AroIndiceAipUdDaElab aroIndiceAipUdDaElab) {
        this.aroIndiceAipUdDaElab = aroIndiceAipUdDaElab;
    }

}