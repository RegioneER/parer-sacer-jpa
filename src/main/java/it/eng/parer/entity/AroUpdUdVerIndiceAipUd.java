package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ARO_UPD_UD_VER_INDICE_AIP_UD database table.
 * 
 */
@Entity
@Table(name = "ARO_UPD_UD_VER_INDICE_AIP_UD")
@NamedQuery(name = "AroUpdUdVerIndiceAipUd.findAll", query = "SELECT a FROM AroUpdUdVerIndiceAipUd a")
public class AroUpdUdVerIndiceAipUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUpdUdVerIndiceAipUd;
    private AroUpdUnitaDoc aroUpdUnitaDoc;
    private AroVerIndiceAipUd aroVerIndiceAipUd;

    public AroUpdUdVerIndiceAipUd() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UPD_UD_VER_INDICE_AIP_UD_IDUPDUDVERINDICEAIPUD_GENERATOR", sequenceName = "SARO_UPD_UD_VER_INDICE_AIP_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UPD_UD_VER_INDICE_AIP_UD_IDUPDUDVERINDICEAIPUD_GENERATOR")
    @Column(name = "ID_UPD_UD_VER_INDICE_AIP_UD")
    public long getIdUpdUdVerIndiceAipUd() {
        return this.idUpdUdVerIndiceAipUd;
    }

    public void setIdUpdUdVerIndiceAipUd(long idUpdUdVerIndiceAipUd) {
        this.idUpdUdVerIndiceAipUd = idUpdUdVerIndiceAipUd;
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

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VER_INDICE_AIP")
    public AroVerIndiceAipUd getAroVerIndiceAipUd() {
        return this.aroVerIndiceAipUd;
    }

    public void setAroVerIndiceAipUd(AroVerIndiceAipUd aroVerIndiceAipUd) {
        this.aroVerIndiceAipUd = aroVerIndiceAipUd;
    }

}