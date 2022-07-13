package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ELV_V_CHK_SOLO_UD_ANNUL database table.
 *
 */
@Entity
@Table(name = "ELV_V_CHK_SOLO_UD_ANNUL")
@NamedQuery(name = "ElvVChkSoloUdAnnul.findAll", query = "SELECT e FROM ElvVChkSoloUdAnnul e")
public class ElvVChkSoloUdAnnul implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flSoloDocAnnul;
    private String flSoloUdAnnul;
    private String flSoloUpdUdAnnul;
    private BigDecimal idElencoVers;

    public ElvVChkSoloUdAnnul() {
    }

    @Column(name = "FL_SOLO_DOC_ANNUL")
    public String getFlSoloDocAnnul() {
        return this.flSoloDocAnnul;
    }

    public void setFlSoloDocAnnul(String flSoloDocAnnul) {
        this.flSoloDocAnnul = flSoloDocAnnul;
    }

    @Column(name = "FL_SOLO_UD_ANNUL")
    public String getFlSoloUdAnnul() {
        return this.flSoloUdAnnul;
    }

    public void setFlSoloUdAnnul(String flSoloUdAnnul) {
        this.flSoloUdAnnul = flSoloUdAnnul;
    }

    @Column(name = "FL_SOLO_UPD_UD_ANNUL")
    public String getFlSoloUpdUdAnnul() {
        return flSoloUpdUdAnnul;
    }

    public void setFlSoloUpdUdAnnul(String flSoloUpdUdAnnul) {
        this.flSoloUpdUdAnnul = flSoloUpdUdAnnul;
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
