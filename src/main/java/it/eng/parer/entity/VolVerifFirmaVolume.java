package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the VOL_VERIF_FIRMA_VOLUME database table.
 * 
 */
@Entity
@Table(name = "VOL_VERIF_FIRMA_VOLUME")
public class VolVerifFirmaVolume implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idVerifFirmaVolume;
    private String dsMsgEsitoVerifFirma;
    private String tiEsitoVerifFirma;
    private String tiVerif;
    private List<VolContrVerifFirmaVolume> volContrVerifFirmaVolumes;
    private VolAppartFirmaVolume volAppartFirmaVolume;

    public VolVerifFirmaVolume() {
    }

    @Id
    @SequenceGenerator(name = "VOL_VERIF_FIRMA_VOLUME_IDVERIFFIRMAVOLUME_GENERATOR", sequenceName = "SVOL_VERIF_FIRMA_VOLUME", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOL_VERIF_FIRMA_VOLUME_IDVERIFFIRMAVOLUME_GENERATOR")
    @Column(name = "ID_VERIF_FIRMA_VOLUME")
    public long getIdVerifFirmaVolume() {
        return this.idVerifFirmaVolume;
    }

    public void setIdVerifFirmaVolume(long idVerifFirmaVolume) {
        this.idVerifFirmaVolume = idVerifFirmaVolume;
    }

    @Column(name = "DS_MSG_ESITO_VERIF_FIRMA")
    public String getDsMsgEsitoVerifFirma() {
        return this.dsMsgEsitoVerifFirma;
    }

    public void setDsMsgEsitoVerifFirma(String dsMsgEsitoVerifFirma) {
        this.dsMsgEsitoVerifFirma = dsMsgEsitoVerifFirma;
    }

    @Column(name = "TI_ESITO_VERIF_FIRMA")
    public String getTiEsitoVerifFirma() {
        return this.tiEsitoVerifFirma;
    }

    public void setTiEsitoVerifFirma(String tiEsitoVerifFirma) {
        this.tiEsitoVerifFirma = tiEsitoVerifFirma;
    }

    @Column(name = "TI_VERIF")
    public String getTiVerif() {
        return this.tiVerif;
    }

    public void setTiVerif(String tiVerif) {
        this.tiVerif = tiVerif;
    }

    // bi-directional many-to-one association to VolContrVerifFirmaVolume
    @OneToMany(mappedBy = "volVerifFirmaVolume", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
    public List<VolContrVerifFirmaVolume> getVolContrVerifFirmaVolumes() {
        return this.volContrVerifFirmaVolumes;
    }

    public void setVolContrVerifFirmaVolumes(List<VolContrVerifFirmaVolume> volContrVerifFirmaVolumes) {
        this.volContrVerifFirmaVolumes = volContrVerifFirmaVolumes;
    }

    // bi-directional many-to-one association to VolAppartFirmaVolume
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_APPART_FIRMA_VOLUME")
    public VolAppartFirmaVolume getVolAppartFirmaVolume() {
        return this.volAppartFirmaVolume;
    }

    public void setVolAppartFirmaVolume(VolAppartFirmaVolume volAppartFirmaVolume) {
        this.volAppartFirmaVolume = volAppartFirmaVolume;
    }

}