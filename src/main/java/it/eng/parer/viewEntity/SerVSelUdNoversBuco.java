package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_SEL_UD_NOVERS_BUCO database table.
 */
@Entity
@Table(name = "SER_V_SEL_UD_NOVERS_BUCO")
@NamedQuery(name = "SerVSelUdNoversBuco.findAll", query = "SELECT s FROM SerVSelUdNoversBuco s")
public class SerVSelUdNoversBuco implements Serializable {

    private static final long serialVersionUID = 1L;

    private BigDecimal idSerie;

    private BigDecimal pgUnitaDoc;

    public SerVSelUdNoversBuco() {/* Hibernate */
    }

    @Column(name = "ID_SERIE")
    public BigDecimal getIdSerie() {
        return this.idSerie;
    }

    public void setIdSerie(BigDecimal idSerie) {
        this.idSerie = idSerie;
    }

    @Column(name = "PG_UNITA_DOC")
    public BigDecimal getPgUnitaDoc() {
        return this.pgUnitaDoc;
    }

    public void setPgUnitaDoc(BigDecimal pgUnitaDoc) {
        this.pgUnitaDoc = pgUnitaDoc;
    }

    private SerVSelUdNoversBucoId serVSelUdNoversBucoId;

    @EmbeddedId()
    public SerVSelUdNoversBucoId getSerVSelUdNoversBucoId() {
        return serVSelUdNoversBucoId;
    }

    public void setSerVSelUdNoversBucoId(SerVSelUdNoversBucoId serVSelUdNoversBucoId) {
        this.serVSelUdNoversBucoId = serVSelUdNoversBucoId;
    }
}
