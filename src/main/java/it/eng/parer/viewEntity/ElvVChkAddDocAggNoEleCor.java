package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ELV_V_CHK_ADD_DOC_AGG_NO_ELE_COR database table.
 *
 */
@Entity
@Table(name = "ELV_V_CHK_ADD_DOC_AGG_NO_ELE_COR")
@NamedQueries({
        @NamedQuery(name = "ElvVChkAddDocAggNoEleCor.findAll", query = "SELECT e FROM ElvVChkAddDocAggNoEleCor e"),
        @NamedQuery(name = "ElvVChkAddDocAggNoEleCor.findByIdDoc", query = "SELECT e FROM ElvVChkAddDocAggNoEleCor e WHERE e.idDoc=:idDoc") })
public class ElvVChkAddDocAggNoEleCor implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idDoc;
    private String flAddDocUdOk;
    private String flAllAddDocPrecOk;

    public ElvVChkAddDocAggNoEleCor() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_DOC")
    public BigDecimal getIdDoc() {
        return this.idDoc;
    }

    public void setIdDoc(BigDecimal idDoc) {
        this.idDoc = idDoc;
    }

    @Column(name = "FL_ADD_DOC_UD_OK", columnDefinition = "char(1)")
    public String getFlAddDocUdOk() {
        return this.flAddDocUdOk;
    }

    public void setFlAddDocUdOk(String flAddDocUdOk) {
        this.flAddDocUdOk = flAddDocUdOk;
    }

    @Column(name = "FL_ALL_ADD_DOC_PREC_OK", columnDefinition = "char(1)")
    public String getFlAllAddDocPrecOk() {
        return this.flAllAddDocPrecOk;
    }

    public void setFlAllAddDocPrecOk(String flAllAddDocPrecOk) {
        this.flAllAddDocPrecOk = flAllAddDocPrecOk;
    }

}
