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
 * The persistent class for the ARO_V_DT_VERS_MAX_BY_UNITA_DOC database table.
 *
 */
@Entity
@Table(name = "ARO_V_DT_VERS_MAX_BY_UNITA_DOC")
@NamedQuery(name = "AroVDtVersMaxByUnitaDoc.findAll", query = "SELECT a FROM AroVDtVersMaxByUnitaDoc a")
public class AroVDtVersMaxByUnitaDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private Date dtVersMax;

    public AroVDtVersMaxByUnitaDoc(BigDecimal idUnitaDoc, Date dtVersMax) {
        this.idUnitaDoc = idUnitaDoc;
        this.dtVersMax = dtVersMax;
    }

    public AroVDtVersMaxByUnitaDoc() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS_MAX")
    public Date getDtVersMax() {
        return this.dtVersMax;
    }

    public void setDtVersMax(Date dtVersMax) {
        this.dtVersMax = dtVersMax;
    }

}
