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
 * The persistent class for the ELV_V_LISAIPUD_URNDACALC_BYELE database table.
 *
 */
@Entity
@Table(name = "ELV_V_LISAIPUD_URNDACALC_BYELE")
@NamedQuery(name = "ElvVLisaipudUrndacalcByele.findAll", query = "SELECT v FROM ElvVLisaipudUrndacalcByele v")
public class ElvVLisaipudUrndacalcByele implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private BigDecimal idElencoVers;
    private Date dtVersMax;
    private Date dtCreazione;
    private String cdKeyUnitaDocNormaliz;

    public ElvVLisaipudUrndacalcByele() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Id
    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS_MAX")
    public Date getDtVersMax() {
        return this.dtVersMax;
    }

    public void setDtVersMax(Date dtVersMax) {
        this.dtVersMax = dtVersMax;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "CD_KEY_UNITA_DOC_NORMALIZ")
    public String getCdKeyUnitaDocNormaliz() {
        return this.cdKeyUnitaDocNormaliz;
    }

    public void setCdKeyUnitaDocNormaliz(String cdKeyUnitaDocNormaliz) {
        this.cdKeyUnitaDocNormaliz = cdKeyUnitaDocNormaliz;
    }
}
