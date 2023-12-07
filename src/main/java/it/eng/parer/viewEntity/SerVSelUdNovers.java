package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_SEL_UD_NOVERS database table.
 * 
 */
@Entity
@Table(name = "SER_V_SEL_UD_NOVERS")
@NamedQuery(name = "SerVSelUdNovers.findAll", query = "SELECT s FROM SerVSelUdNovers s")
public class SerVSelUdNovers implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal aaKeyUnitaDoc;
    private BigDecimal idSerie;
    private SerVSelUdNoversId serVSelUdNovers;

    @EmbeddedId
    public SerVSelUdNoversId getSerVSelUdNoversId() {
        return serVSelUdNovers;
    }

    public void setSerVSelUdNoversId(SerVSelUdNoversId serVSelUdNovers) {
        this.serVSelUdNovers = serVSelUdNovers;
    }

    public SerVSelUdNovers() {/* Hibernate */
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Column(name = "ID_SERIE")
    public BigDecimal getIdSerie() {
        return this.idSerie;
    }

    public void setIdSerie(BigDecimal idSerie) {
        this.idSerie = idSerie;
    }

}
