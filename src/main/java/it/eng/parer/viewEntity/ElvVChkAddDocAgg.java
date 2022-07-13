package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ELV_V_CHK_ADD_DOC_AGG database table.
 *
 */
@Entity
@Table(name = "ELV_V_CHK_ADD_DOC_AGG")
@NamedQueries({ @NamedQuery(name = "ElvVChkAddDocAgg.findAll", query = "SELECT e FROM ElvVChkAddDocAgg e"),
        @NamedQuery(name = "ElvVChkAddDocAgg.findByIdDocIdElenco", query = "SELECT e FROM ElvVChkAddDocAgg e WHERE e.idDoc=:idDoc AND e.idElencoVersCor=:idElencoVersCor") })
public class ElvVChkAddDocAgg implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idDoc;
    private BigDecimal idElencoVersCor;
    private String flAddDocUdOk;
    private String flAllAddDocPrecOk;

    public ElvVChkAddDocAgg() {
    }

    @Id
    @Column(name = "ID_DOC")
    public BigDecimal getIdDoc() {
        return this.idDoc;
    }

    public void setIdDoc(BigDecimal idDoc) {
        this.idDoc = idDoc;
    }

    @Column(name = "ID_ELENCO_VERS_COR")
    public BigDecimal getIdElencoVersCor() {
        return this.idElencoVersCor;
    }

    public void setIdElencoVersCor(BigDecimal idElencoVersCor) {
        this.idElencoVersCor = idElencoVersCor;
    }

    @Column(name = "FL_ADD_DOC_UD_OK")
    public String getFlAddDocUdOk() {
        return this.flAddDocUdOk;
    }

    public void setFlAddDocUdOk(String flAddDocUdOk) {
        this.flAddDocUdOk = flAddDocUdOk;
    }

    @Column(name = "FL_ALL_ADD_DOC_PREC_OK")
    public String getFlAllAddDocPrecOk() {
        return this.flAllAddDocPrecOk;
    }

    public void setFlAllAddDocPrecOk(String flAllAddDocPrecOk) {
        this.flAllAddDocPrecOk = flAllAddDocPrecOk;
    }

}
