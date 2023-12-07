package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ELV_V_LIS_UD_MODIF_ELENCO database table.
 *
 */
@Entity
@Table(name = "ELV_V_LIS_UD_MODIF_ELENCO")
@NamedQuery(name = "ElvVLisUdModifElenco.findAll", query = "SELECT e FROM ElvVLisUdModifElenco e")
public class ElvVLisUdModifElenco implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsUrnUnitaDoc;
    private BigDecimal idElencoVers;
    private Date dtVersMin;
    private BigDecimal idUnitaDoc;

    public ElvVLisUdModifElenco() {/* Hibernate */
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS_MIN")
    public Date getDtVersMin() {
        return this.dtVersMin;
    }

    public void setDtVersMin(Date dtVersMin) {
        this.dtVersMin = dtVersMin;
    }

    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    @Column(name = "DS_URN_UNITA_DOC")
    public String getDsUrnUnitaDoc() {
        return this.dsUrnUnitaDoc;
    }

    public void setDsUrnUnitaDoc(String dsUrnUnitaDoc) {
        this.dsUrnUnitaDoc = dsUrnUnitaDoc;
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
