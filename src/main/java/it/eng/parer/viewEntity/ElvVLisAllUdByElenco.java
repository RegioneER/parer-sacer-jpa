package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_V_LIS_ALL_UD_BY_ELENCO database table.
 *
 */
@Entity
@Table(name = "ELV_V_LIS_ALL_UD_BY_ELENCO")
@NamedQuery(name = "ElvVLisAllUdByElenco.find", query = "SELECT e FROM ElvVLisAllUdByElenco e WHERE e.idElencoVers = :idElencoVers")
public class ElvVLisAllUdByElenco implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdKeyUnitaDocNormaliz;
    private Date dtVersMax;
    private BigDecimal idElencoVers;
    private BigDecimal idUnitaDoc;

    public ElvVLisAllUdByElenco() {
    }

    @Column(name = "CD_KEY_UNITA_DOC_NORMALIZ")
    public String getCdKeyUnitaDocNormaliz() {
        return this.cdKeyUnitaDocNormaliz;
    }

    public void setCdKeyUnitaDocNormaliz(String cdKeyUnitaDocNormaliz) {
        this.cdKeyUnitaDocNormaliz = cdKeyUnitaDocNormaliz;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS_MAX")
    public Date getDtVersMax() {
        return this.dtVersMax;
    }

    public void setDtVersMax(Date dtVersMax) {
        this.dtVersMax = dtVersMax;
    }

    @Id
    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
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