package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_INDICE_AIP_UD database table.
 */
@Entity
@Table(name = "ARO_INDICE_AIP_UD")
public class AroIndiceAipUd implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idIndiceAip;
    private BigDecimal idVerIndiceAipLast = BigDecimal.ZERO;
    private String tiFormatoIndiceAip;

    private AroUnitaDoc aroUnitaDoc;

    private List<AroVerIndiceAipUd> aroVerIndiceAipUds = new ArrayList<>();

    private List<AroAipRestituzioneArchivio> aroAipRestituzioneArchivios = new ArrayList<>();

    public AroIndiceAipUd() {/* Hibernate */
    }

    @Id
    // "ARO_INDICE_AIP_UD_IDINDICEAIP_GENERATOR",
    // sequenceName = "SARO_INDICE_AIP_UD",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_INDICE_AIP_UD_IDINDICEAIP_GENERATOR")
    @Column(name = "ID_INDICE_AIP")
    @GenericGenerator(name = "SARO_INDICE_AIP_UD_ID_INDICE_AIP_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_INDICE_AIP_UD"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_INDICE_AIP_UD_ID_INDICE_AIP_GENERATOR")
    public Long getIdIndiceAip() {
        return this.idIndiceAip;
    }

    public void setIdIndiceAip(Long idIndiceAip) {
        this.idIndiceAip = idIndiceAip;
    }

    @Column(name = "ID_VER_INDICE_AIP_LAST")
    public BigDecimal getIdVerIndiceAipLast() {
        return this.idVerIndiceAipLast;
    }

    public void setIdVerIndiceAipLast(BigDecimal idVerIndiceAipLast) {
        this.idVerIndiceAipLast = idVerIndiceAipLast;
    }

    @Column(name = "TI_FORMATO_INDICE_AIP")
    public String getTiFormatoIndiceAip() {
        return this.tiFormatoIndiceAip;
    }

    public void setTiFormatoIndiceAip(String tiFormatoIndiceAip) {
        this.tiFormatoIndiceAip = tiFormatoIndiceAip;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }

    // bi-directional many-to-one association to AroVerIndiceAipUd
    @OneToMany(mappedBy = "aroIndiceAipUd", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<AroVerIndiceAipUd> getAroVerIndiceAipUds() {
        return this.aroVerIndiceAipUds;
    }

    public void setAroVerIndiceAipUds(List<AroVerIndiceAipUd> aroVerIndiceAipUds) {
        this.aroVerIndiceAipUds = aroVerIndiceAipUds;
    }

    // bi-directional many-to-one association to AroAipRestituzioneArchivio
    @OneToMany(mappedBy = "aroIndiceAipUd", cascade = CascadeType.PERSIST)
    public List<AroAipRestituzioneArchivio> getAroAipRestituzioneArchivios() {
        return this.aroAipRestituzioneArchivios;
    }

    public void setAroAipRestituzioneArchivios(List<AroAipRestituzioneArchivio> aroAipRestituzioneArchivios) {
        this.aroAipRestituzioneArchivios = aroAipRestituzioneArchivios;
    }

    public AroAipRestituzioneArchivio addAroAipRestituzioneArchivio(
            AroAipRestituzioneArchivio aroAipRestituzioneArchivio) {
        getAroAipRestituzioneArchivios().add(aroAipRestituzioneArchivio);
        aroAipRestituzioneArchivio.setAroIndiceAipUd(this);
        return aroAipRestituzioneArchivio;
    }

    public AroAipRestituzioneArchivio removeAroAipRestituzioneArchivio(
            AroAipRestituzioneArchivio aroAipRestituzioneArchivio) {
        getAroAipRestituzioneArchivios().remove(aroAipRestituzioneArchivio);
        aroAipRestituzioneArchivio.setAroIndiceAipUd(null);
        return aroAipRestituzioneArchivio;
    }
}
