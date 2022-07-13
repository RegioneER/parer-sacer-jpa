package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the ARO_VERIF_FIRMA_DT_VERS database table.
 *
 */
@Entity
@Table(name = "ARO_VERIF_FIRMA_DT_VERS")
@NamedQuery(name = "AroVerifFirmaDtVer.findAll", query = "SELECT a FROM AroVerifFirmaDtVer a")
public class AroVerifFirmaDtVer implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idVerifFirmaDtVers;
    private String dsMsgEsitoVerifFirma;
    private String tiEsitoVerifFirma;
    private List<AroContrVerifFirmaDtVer> aroContrVerifFirmaDtVers;
    private AroFirmaComp aroFirmaComp;

    public AroVerifFirmaDtVer() {
    }

    @Id
    @SequenceGenerator(name = "ARO_VERIF_FIRMA_DT_VERS_IDVERIFFIRMADTVERS_GENERATOR", sequenceName = "SARO_VERIF_FIRMA_DT_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_VERIF_FIRMA_DT_VERS_IDVERIFFIRMADTVERS_GENERATOR")
    @Column(name = "ID_VERIF_FIRMA_DT_VERS")
    public long getIdVerifFirmaDtVers() {
        return this.idVerifFirmaDtVers;
    }

    public void setIdVerifFirmaDtVers(long idVerifFirmaDtVers) {
        this.idVerifFirmaDtVers = idVerifFirmaDtVers;
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

    // bi-directional many-to-one association to AroContrVerifFirmaDtVer
    @OneToMany(mappedBy = "aroVerifFirmaDtVer", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH })
    public List<AroContrVerifFirmaDtVer> getAroContrVerifFirmaDtVers() {
        return this.aroContrVerifFirmaDtVers;
    }

    public void setAroContrVerifFirmaDtVers(List<AroContrVerifFirmaDtVer> aroContrVerifFirmaDtVers) {
        this.aroContrVerifFirmaDtVers = aroContrVerifFirmaDtVers;
    }

    public AroContrVerifFirmaDtVer addAroContrVerifFirmaDtVer(AroContrVerifFirmaDtVer aroContrVerifFirmaDtVer) {
        getAroContrVerifFirmaDtVers().add(aroContrVerifFirmaDtVer);
        aroContrVerifFirmaDtVer.setAroVerifFirmaDtVer(this);

        return aroContrVerifFirmaDtVer;
    }

    public AroContrVerifFirmaDtVer removeAroContrVerifFirmaDtVer(AroContrVerifFirmaDtVer aroContrVerifFirmaDtVer) {
        getAroContrVerifFirmaDtVers().remove(aroContrVerifFirmaDtVer);
        aroContrVerifFirmaDtVer.setAroVerifFirmaDtVer(null);

        return aroContrVerifFirmaDtVer;
    }

    // bi-directional many-to-one association to AroFirmaComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FIRMA_COMP")
    public AroFirmaComp getAroFirmaComp() {
        return this.aroFirmaComp;
    }

    public void setAroFirmaComp(AroFirmaComp aroFirmaComp) {
        this.aroFirmaComp = aroFirmaComp;
    }

}
