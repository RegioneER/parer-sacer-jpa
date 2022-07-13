package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_V_SEL_UD_SER_FASC_BY_ENTE database table.
 * 
 */
@Entity
@Table(name = "ARO_V_SEL_UD_SER_FASC_BY_ENTE")
@NamedQuery(name = "AroVSelUdSerFascByEnte.findAll", query = "SELECT e FROM AroVSelUdSerFascByEnte e")
public class AroVSelUdSerFascByEnte implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private BigDecimal idSerie;
    private BigDecimal idFascicolo;
    private String tiEle;
    private BigDecimal idStrut;
    private BigDecimal idRootstrut;

    public AroVSelUdSerFascByEnte() {
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
    @Column(name = "ID_SERIE")
    public BigDecimal getIdSerie() {
        return this.idSerie;
    }

    public void setIdSerie(BigDecimal idSerie) {
        this.idSerie = idSerie;
    }

    @Id
    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return this.idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
    }

    @Column(name = "TI_ELE")
    public String getTiEle() {
        return this.tiEle;
    }

    public void setTiEle(String tiEle) {
        this.tiEle = tiEle;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Id
    @Column(name = "ID_ROOTSTRUT")
    public BigDecimal getIdRootstrut() {
        return this.idRootstrut;
    }

    public void setIdRootstrut(BigDecimal idRootstrut) {
        this.idRootstrut = idRootstrut;
    }
}