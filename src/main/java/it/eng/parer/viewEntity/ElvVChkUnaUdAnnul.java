package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ELV_V_CHK_UNA_UD_ANNUL database table.
 *
 */
@Entity
@Table(name = "ELV_V_CHK_UNA_UD_ANNUL")
@NamedQuery(name = "ElvVChkUnaUdAnnul.findAll", query = "SELECT e FROM ElvVChkUnaUdAnnul e")
public class ElvVChkUnaUdAnnul implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flUnaUdUpdUdAnnul;
    private String flUnaUdDocAggAnnul;
    private String flUnaUdVersAnnul;
    private BigDecimal idElencoVers;

    public ElvVChkUnaUdAnnul() {
    }

    @Column(name = "FL_UNA_UD_UPD_UD_ANNUL")
    public String getFlUnaUdUpdUdAnnul() {
        return this.flUnaUdUpdUdAnnul;
    }

    public void setFlUnaUdUpdUdAnnul(String flUnaUdUpdUdAnnul) {
        this.flUnaUdUpdUdAnnul = flUnaUdUpdUdAnnul;
    }

    @Column(name = "FL_UNA_UD_DOC_AGG_ANNUL")
    public String getFlUnaUdDocAggAnnul() {
        return this.flUnaUdDocAggAnnul;
    }

    public void setFlUnaUdDocAggAnnul(String flUnaUdDocAggAnnul) {
        this.flUnaUdDocAggAnnul = flUnaUdDocAggAnnul;
    }

    @Column(name = "FL_UNA_UD_VERS_ANNUL")
    public String getFlUnaUdVersAnnul() {
        return this.flUnaUdVersAnnul;
    }

    public void setFlUnaUdVersAnnul(String flUnaUdVersAnnul) {
        this.flUnaUdVersAnnul = flUnaUdVersAnnul;
    }

    @Id
    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

}
