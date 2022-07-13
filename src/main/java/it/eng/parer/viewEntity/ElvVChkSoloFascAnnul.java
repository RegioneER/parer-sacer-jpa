package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * The persistent class for the ELV_V_CHK_SOLO_FASC_ANNUL database table.
 *
 */
@Entity
@Table(name = "ELV_V_CHK_SOLO_FASC_ANNUL")
@NamedQuery(name = "ElvVChkSoloFascAnnul.findAll", query = "SELECT e FROM ElvVChkSoloFascAnnul e")
public class ElvVChkSoloFascAnnul implements Serializable {

    private static final long serialVersionUID = 1L;

    private String flSoloFascAnnul;
    private BigDecimal idElencoVersFasc;

    public ElvVChkSoloFascAnnul() {
    }

    @Id
    @Column(name = "ID_ELENCO_VERS_FASC")
    public BigDecimal getIdElencoVersFasc() {
        return this.idElencoVersFasc;
    }

    public void setIdElencoVersFasc(BigDecimal idElencoVersFasc) {
        this.idElencoVersFasc = idElencoVersFasc;
    }

    @Column(name = "FL_SOLO_FASC_ANNUL")
    public String getFlSoloFascAnnul() {
        return this.flSoloFascAnnul;
    }

    public void setFlSoloFascAnnul(String flSoloFascAnnul) {
        this.flSoloFascAnnul = flSoloFascAnnul;
    }

}
