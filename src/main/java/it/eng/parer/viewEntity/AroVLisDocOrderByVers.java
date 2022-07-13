package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_LIS_DOC_ORDER_BY_VERS database table.
 *
 */
@Entity
@Table(name = "ARO_V_LIS_DOC_ORDER_BY_VERS")
@NamedQuery(name = "AroVLisDocOrderByVers.findAll", query = "SELECT a FROM AroVLisDocOrderByVers a")
public class AroVLisDocOrderByVers implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private Date dtCreazione;
    private BigDecimal niPesoOrder;
    private BigDecimal pgDoc;

    public AroVLisDocOrderByVers(BigDecimal idUnitaDoc, Date dtCreazione, BigDecimal niPesoOrder, BigDecimal pgDoc) {
        this.idUnitaDoc = idUnitaDoc;
        this.dtCreazione = dtCreazione;
        this.niPesoOrder = niPesoOrder;
        this.pgDoc = pgDoc;
    }

    public AroVLisDocOrderByVers() {
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
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "NI_PESO_ORDER")
    public BigDecimal getNiPesoOrder() {
        return this.niPesoOrder;
    }

    public void setNiPesoOrder(BigDecimal niPesoOrder) {
        this.niPesoOrder = niPesoOrder;
    }

    @Column(name = "PG_DOC")
    public BigDecimal getPgDoc() {
        return this.pgDoc;
    }

    public void setPgDoc(BigDecimal pgDoc) {
        this.pgDoc = pgDoc;
    }

}
