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
 * The persistent class for the ARO_UPD_UD_VER_INDICE_AIP_UD database table.
 */
@Entity
@Table(name = "ARO_UPD_UD_VER_INDICE_AIP_UD")
@NamedQuery(name = "AroUpdUdVerIndiceAipUd.findAll", query = "SELECT a FROM AroUpdUdVerIndiceAipUd a")
public class AroUpdUdVerIndiceAipUd implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUpdUdVerIndiceAipUd;

    private AroUpdUnitaDoc aroUpdUnitaDoc;

    private AroVerIndiceAipUd aroVerIndiceAipUd;

    public AroUpdUdVerIndiceAipUd() {/* Hibernate */
    }

    @Id
    // "ARO_UPD_UD_VER_INDICE_AIP_UD_IDUPDUDVERINDICEAIPUD_GENERATOR",
    // sequenceName =
    // "SARO_UPD_UD_VER_INDICE_AIP_UD",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ARO_UPD_UD_VER_INDICE_AIP_UD_IDUPDUDVERINDICEAIPUD_GENERATOR")
    @Column(name = "ID_UPD_UD_VER_INDICE_AIP_UD")
    @GenericGenerator(name = "SARO_UPD_UD_VER_INDICE_AIP_UD_ID_UPD_UD_VER_INDICE_AIP_UD_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_UPD_UD_VER_INDICE_AIP_UD"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_UPD_UD_VER_INDICE_AIP_UD_ID_UPD_UD_VER_INDICE_AIP_UD_GENERATOR")
    public Long getIdUpdUdVerIndiceAipUd() {
        return this.idUpdUdVerIndiceAipUd;
    }

    public void setIdUpdUdVerIndiceAipUd(Long idUpdUdVerIndiceAipUd) {
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
