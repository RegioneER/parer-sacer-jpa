package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the VOL_APPART_FIRMA_VOLUME database table.
 * 
 */
@Entity
@Table(name = "VOL_APPART_FIRMA_VOLUME")
public class VolAppartFirmaVolume implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idAppartFirmaVolume;
    private AroFirmaComp aroFirmaComp;
    private VolAppartCompVolume volAppartCompVolume;
    private List<VolVerifFirmaVolume> volVerifFirmaVolumes;

    public VolAppartFirmaVolume() {
    }

    @Id
    @SequenceGenerator(name = "VOL_APPART_FIRMA_VOLUME_IDAPPARTFIRMAVOLUME_GENERATOR", sequenceName = "SVOL_APPART_FIRMA_VOLUME", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOL_APPART_FIRMA_VOLUME_IDAPPARTFIRMAVOLUME_GENERATOR")
    @Column(name = "ID_APPART_FIRMA_VOLUME")
    public long getIdAppartFirmaVolume() {
        return this.idAppartFirmaVolume;
    }

    public void setIdAppartFirmaVolume(long idAppartFirmaVolume) {
        this.idAppartFirmaVolume = idAppartFirmaVolume;
    }

    // bi-directional many-to-one association to AroFirmaComp
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_FIRMA_COMP")
    public AroFirmaComp getAroFirmaComp() {
        return this.aroFirmaComp;
    }

    public void setAroFirmaComp(AroFirmaComp aroFirmaComp) {
        this.aroFirmaComp = aroFirmaComp;
    }

    // bi-directional many-to-one association to VolAppartCompVolume
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_APPART_COMP_VOLUME")
    public VolAppartCompVolume getVolAppartCompVolume() {
        return this.volAppartCompVolume;
    }

    public void setVolAppartCompVolume(VolAppartCompVolume volAppartCompVolume) {
        this.volAppartCompVolume = volAppartCompVolume;
    }

    // bi-directional many-to-one association to VolVerifFirmaVolume
    @OneToMany(mappedBy = "volAppartFirmaVolume", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.DETACH, CascadeType.REFRESH })
    public List<VolVerifFirmaVolume> getVolVerifFirmaVolumes() {
        return this.volVerifFirmaVolumes;
    }

    public void setVolVerifFirmaVolumes(List<VolVerifFirmaVolume> volVerifFirmaVolumes) {
        this.volVerifFirmaVolumes = volVerifFirmaVolumes;
    }

}