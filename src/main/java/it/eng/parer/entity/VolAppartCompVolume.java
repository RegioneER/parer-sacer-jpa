package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the VOL_APPART_COMP_VOLUME database table.
 * 
 */
@Entity
@Table(name = "VOL_APPART_COMP_VOLUME")
public class VolAppartCompVolume implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idAppartCompVolume;
    private String dsEsitoVerifFirmeChius;
    private BigDecimal idStrut;
    private String tiEsitoVerifFirmeChius;
    private AroCompDoc aroCompDoc;
    private VolAppartDocVolume volAppartDocVolume;
    private List<VolAppartFirmaVolume> volAppartFirmaVolumes;

    public VolAppartCompVolume() {
    }

    @Id
    @SequenceGenerator(name = "VOL_APPART_COMP_VOLUME_IDAPPARTCOMPVOLUME_GENERATOR", sequenceName = "SVOL_APPART_COMP_VOLUME", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VOL_APPART_COMP_VOLUME_IDAPPARTCOMPVOLUME_GENERATOR")
    @Column(name = "ID_APPART_COMP_VOLUME")
    public long getIdAppartCompVolume() {
        return this.idAppartCompVolume;
    }

    public void setIdAppartCompVolume(long idAppartCompVolume) {
        this.idAppartCompVolume = idAppartCompVolume;
    }

    @Column(name = "DS_ESITO_VERIF_FIRME_CHIUS")
    public String getDsEsitoVerifFirmeChius() {
        return this.dsEsitoVerifFirmeChius;
    }

    public void setDsEsitoVerifFirmeChius(String dsEsitoVerifFirmeChius) {
        this.dsEsitoVerifFirmeChius = dsEsitoVerifFirmeChius;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "TI_ESITO_VERIF_FIRME_CHIUS")
    public String getTiEsitoVerifFirmeChius() {
        return this.tiEsitoVerifFirmeChius;
    }

    public void setTiEsitoVerifFirmeChius(String tiEsitoVerifFirmeChius) {
        this.tiEsitoVerifFirmeChius = tiEsitoVerifFirmeChius;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_COMP_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

    // bi-directional many-to-one association to VolAppartDocVolume
    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.DETACH })
    @JoinColumn(name = "ID_APPART_DOC_VOLUME")
    public VolAppartDocVolume getVolAppartDocVolume() {
        return this.volAppartDocVolume;
    }

    public void setVolAppartDocVolume(VolAppartDocVolume volAppartDocVolume) {
        this.volAppartDocVolume = volAppartDocVolume;
    }

    // bi-directional many-to-one association to VolAppartFirmaVolume
    @OneToMany(mappedBy = "volAppartCompVolume", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
    public List<VolAppartFirmaVolume> getVolAppartFirmaVolumes() {
        return this.volAppartFirmaVolumes;
    }

    public void setVolAppartFirmaVolumes(List<VolAppartFirmaVolume> volAppartFirmaVolumes) {
        this.volAppartFirmaVolumes = volAppartFirmaVolumes;
    }

}