package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_V_SEL_UD_SER_FASC_BY_ENTE database table.
 */
@Entity
@Table(name = "ARO_V_SEL_UD_SER_FASC_BY_ENTE")
@NamedQuery(name = "AroVSelUdSerFascByEnte.findAll", query = "SELECT e FROM AroVSelUdSerFascByEnte e")
public class AroVSelUdSerFascByEnte implements Serializable {

    private static final long serialVersionUID = 1L;

    private String tiEle;

    private BigDecimal idStrut;

    public AroVSelUdSerFascByEnte() {/* Hibernate */
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

    private AroVSelUdSerFascByEnteId aroVSelUdSerFascByEnteId;

    @EmbeddedId()
    public AroVSelUdSerFascByEnteId getAroVSelUdSerFascByEnteId() {
        return aroVSelUdSerFascByEnteId;
    }

    public void setAroVSelUdSerFascByEnteId(AroVSelUdSerFascByEnteId aroVSelUdSerFascByEnteId) {
        this.aroVSelUdSerFascByEnteId = aroVSelUdSerFascByEnteId;
    }
}
