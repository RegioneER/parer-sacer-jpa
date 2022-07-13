package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ARO_UPD_UD_INDICE_AIP_DA_ELAB database table.
 * 
 */
@Entity
@Table(name = "ARO_UPD_UD_INDICE_AIP_DA_ELAB")
@NamedQuery(name = "AroUpdUdIndiceAipDaElab.findAll", query = "SELECT a FROM AroUpdUdIndiceAipDaElab a")
public class AroUpdUdIndiceAipDaElab implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUpdUdIndiceAipDaElab;
    private AroIndiceAipUdDaElab aroIndiceAipUdDaElab;
    private AroUpdUnitaDoc aroUpdUnitaDoc;

    public AroUpdUdIndiceAipDaElab() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UPD_UD_INDICE_AIP_DA_ELAB_IDUPDUDINDICEAIPDAELAB_GENERATOR", sequenceName = "SARO_UPD_UD_INDICE_AIP_DA_ELAB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UPD_UD_INDICE_AIP_DA_ELAB_IDUPDUDINDICEAIPDAELAB_GENERATOR")
    @Column(name = "ID_UPD_UD_INDICE_AIP_DA_ELAB")
    public long getIdUpdUdIndiceAipDaElab() {
        return this.idUpdUdIndiceAipDaElab;
    }

    public void setIdUpdUdIndiceAipDaElab(long idUpdUdIndiceAipDaElab) {
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