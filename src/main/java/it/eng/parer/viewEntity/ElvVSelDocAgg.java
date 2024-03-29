package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ELV_V_SEL_DOC_AGG database table.
 */
// @Entity
// @Table(name = "ELV_V_SEL_DOC_AGG")
@NamedQuery(name = "ElvVSelDocAgg.findAll", query = "SELECT e FROM ElvVSelDocAgg e")
public class ElvVSelDocAgg implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal aaKeyUnitaDoc;

    private Date dtCreazione;

    private BigDecimal idUnitaDoc;

    public ElvVSelDocAgg() {/* Hibernate */
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    private ElvVSelDocAggId elvVSelDocAggId;

    @EmbeddedId()
    public ElvVSelDocAggId getElvVSelDocAggId() {
        return elvVSelDocAggId;
    }

    public void setElvVSelDocAggId(ElvVSelDocAggId elvVSelDocAggId) {
        this.elvVSelDocAggId = elvVSelDocAggId;
    }
}
