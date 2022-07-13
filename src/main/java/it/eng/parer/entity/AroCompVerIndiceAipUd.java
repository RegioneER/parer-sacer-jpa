package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ARO_COMP_VER_INDICE_AIP_UD database table.
 * 
 */
@Entity
@Table(name = "ARO_COMP_VER_INDICE_AIP_UD")
public class AroCompVerIndiceAipUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idCompVerIndiceAipUd;
    private AroCompDoc aroCompDoc;
    private AroVerIndiceAipUd aroVerIndiceAipUd;

    public AroCompVerIndiceAipUd() {
    }

    @Id
    @SequenceGenerator(name = "ARO_COMP_VER_INDICE_AIP_UD_IDCOMPVERINDICEAIPUD_GENERATOR", allocationSize = 1, sequenceName = "SARO_COMP_VER_INDICE_AIP_UD")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_COMP_VER_INDICE_AIP_UD_IDCOMPVERINDICEAIPUD_GENERATOR")
    @Column(name = "ID_COMP_VER_INDICE_AIP_UD")
    public long getIdCompVerIndiceAipUd() {
        return this.idCompVerIndiceAipUd;
    }

    public void setIdCompVerIndiceAipUd(long idCompVerIndiceAipUd) {
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