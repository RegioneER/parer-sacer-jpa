package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the SER_V_SEL_UD_NOVERS_BUCO database table.
 * 
 */
@Entity
@Table(name = "SER_V_SEL_UD_NOVERS_BUCO")
@NamedQuery(name = "SerVSelUdNoversBuco.findAll", query = "SELECT s FROM SerVSelUdNoversBuco s")
public class SerVSelUdNoversBuco implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idSerie;
    private BigDecimal idUnitaDocNonVers;
    private BigDecimal idVerSerie;
    private BigDecimal pgUnitaDoc;

    public SerVSelUdNoversBuco() {
    }

    @Column(name = "ID_SERIE")
    public BigDecimal getIdSerie() {
        return this.idSerie;
    }

    public void setIdSerie(BigDecimal idSerie) {
        this.idSerie = idSerie;
    }

    @Id
    @Column(name = "ID_UNITA_DOC_NON_VERS")
    public BigDecimal getIdUnitaDocNonVers() {
        return this.idUnitaDocNonVers;
    }

    public void setIdUnitaDocNonVers(BigDecimal idUnitaDocNonVers) {
        this.idUnitaDocNonVers = idUnitaDocNonVers;
    }

    @Id
    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

    @Column(name = "PG_UNITA_DOC")
    public BigDecimal getPgUnitaDoc() {
        return this.pgUnitaDoc;
    }

    public void setPgUnitaDoc(BigDecimal pgUnitaDoc) {
        this.pgUnitaDoc = pgUnitaDoc;
    }

}