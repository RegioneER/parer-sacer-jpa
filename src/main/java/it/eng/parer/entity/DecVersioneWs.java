package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_VERSIONE_WS database table.
 * 
 */
@Entity
@Table(name = "DEC_VERSIONE_WS")
@NamedQuery(name = "DecVersioneWs.findAll", query = "SELECT d FROM DecVersioneWs d")
public class DecVersioneWs implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cdVersioneWs;
    private BigDecimal idVersioneWs;
    private String tiWs;

    public DecVersioneWs() {
    }

    @Column(name = "CD_VERSIONE_WS")
    public String getCdVersioneWs() {
        return this.cdVersioneWs;
    }

    public void setCdVersioneWs(String cdVersioneWs) {
        this.cdVersioneWs = cdVersioneWs;
    }

    @Id
    @Column(name = "ID_VERSIONE_WS")
    public BigDecimal getIdVersioneWs() {
        return this.idVersioneWs;
    }

    public void setIdVersioneWs(BigDecimal idVersioneWs) {
        this.idVersioneWs = idVersioneWs;
    }

    @Column(name = "TI_WS")
    public String getTiWs() {
        return this.tiWs;
    }

    public void setTiWs(String tiWs) {
        this.tiWs = tiWs;
    }

}
