package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ELV_V_LIS_ELENCO_UD_ANNUL database table.
 *
 */
@Entity
@Table(name = "ELV_V_LIS_ELENCO_UD_ANNUL")
@NamedQuery(name = "ElvVLisElencoUdAnnul.findAll", query = "SELECT e FROM ElvVLisElencoUdAnnul e")
public class ElvVLisElencoUdAnnul implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idElencoVers;
    private BigDecimal idRichAnnulVers;
    private String ntElencoChiuso;

    public ElvVLisElencoUdAnnul() {
    }

    @Id
    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    @Id
    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return this.idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }

    @Column(name = "NT_ELENCO_CHIUSO")
    public String getNtElencoChiuso() {
        return this.ntElencoChiuso;
    }

    public void setNtElencoChiuso(String ntElencoChiuso) {
        this.ntElencoChiuso = ntElencoChiuso;
    }

}
