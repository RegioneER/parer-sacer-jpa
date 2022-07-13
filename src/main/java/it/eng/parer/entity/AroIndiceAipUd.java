package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the ARO_INDICE_AIP_UD database table.
 *
 */
@Entity
@Table(name = "ARO_INDICE_AIP_UD")
public class AroIndiceAipUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idIndiceAip;
    private BigDecimal idVerIndiceAipLast;
    private String tiFormatoIndiceAip;
    private AroUnitaDoc aroUnitaDoc;
    private List<AroVerIndiceAipUd> aroVerIndiceAipUds;
    private List<AroAipRestituzioneArchivio> aroAipRestituzioneArchivios;

    public AroIndiceAipUd() {
    }

    @Id
    @SequenceGenerator(name = "ARO_INDICE_AIP_UD_IDINDICEAIP_GENERATOR", sequenceName = "SARO_INDICE_AIP_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_INDICE_AIP_UD_IDINDICEAIP_GENERATOR")
    @Column(name = "ID_INDICE_AIP")
    public long getIdIndiceAip() {
        return this.idIndiceAip;
    }

    public void setIdIndiceAip(long idIndiceAip) {
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
