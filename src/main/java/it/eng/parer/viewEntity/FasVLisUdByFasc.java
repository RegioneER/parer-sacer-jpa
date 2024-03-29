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
 * The persistent class for the FAS_V_LIS_UD_BY_FASC database table.
 *
 */
@Entity
@Table(name = "FAS_V_LIS_UD_BY_FASC")
@NamedQuery(name = "FasVLisUdByFasc.find", query = "SELECT f FROM FasVLisUdByFasc f WHERE f.idFascicolo = :idFascicolo")
public class FasVLisUdByFasc implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdKeyUnitaDocNormaliz;
    private Date dtVersMax;
    private BigDecimal idFascicolo;
    private BigDecimal idUnitaDoc;

    public FasVLisUdByFasc() {/* Hibernate */
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
    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return this.idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
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
