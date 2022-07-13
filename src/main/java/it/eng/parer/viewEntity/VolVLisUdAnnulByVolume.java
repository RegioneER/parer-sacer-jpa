package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the VOL_V_LIS_UD_ANNUL_BY_VOLUME database table.
 *
 */
@Entity
@Table(name = "VOL_V_LIS_UD_ANNUL_BY_VOLUME")
@NamedQuery(name = "VolVLisUdAnnulByVolume.findAll", query = "SELECT v FROM VolVLisUdAnnulByVolume v")
public class VolVLisUdAnnulByVolume implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsUrnUnitaDocAnnul;
    private BigDecimal idRichAnnulVers;
    private BigDecimal idUnitaDoc;
    private BigDecimal idVolumeConserv;

    public VolVLisUdAnnulByVolume() {
    }

    @Column(name = "DS_URN_UNITA_DOC_ANNUL")
    public String getDsUrnUnitaDocAnnul() {
        return this.dsUrnUnitaDocAnnul;
    }

    public void setDsUrnUnitaDocAnnul(String dsUrnUnitaDocAnnul) {
        this.dsUrnUnitaDocAnnul = dsUrnUnitaDocAnnul;
    }

    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return this.idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }

    @Id
    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Column(name = "ID_VOLUME_CONSERV")
    public BigDecimal getIdVolumeConserv() {
        return this.idVolumeConserv;
    }

    public void setIdVolumeConserv(BigDecimal idVolumeConserv) {
        this.idVolumeConserv = idVolumeConserv;
    }

}
