package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ELV_V_LIS_UD_ANNUL_BY_ELENCO database table.
 *
 */
@Entity
@Table(name = "ELV_V_LIS_UD_ANNUL_BY_ELENCO")
@NamedQuery(name = "ElvVLisUdAnnulByElenco.findAll", query = "SELECT e FROM ElvVLisUdAnnulByElenco e")
public class ElvVLisUdAnnulByElenco implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsUrnUnitaDocAnnul;
    private BigDecimal idElencoVers;
    private BigDecimal idRichAnnulVers;
    private BigDecimal idUnitaDoc;

    public ElvVLisUdAnnulByElenco() {
    }

    @Column(name = "DS_URN_UNITA_DOC_ANNUL")
    public String getDsUrnUnitaDocAnnul() {
        return this.dsUrnUnitaDocAnnul;
    }

    public void setDsUrnUnitaDocAnnul(String dsUrnUnitaDocAnnul) {
        this.dsUrnUnitaDocAnnul = dsUrnUnitaDocAnnul;
    }

    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
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

}
