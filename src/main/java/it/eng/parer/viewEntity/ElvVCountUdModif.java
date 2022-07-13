package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ELV_V_COUNT_UD_MODIF database table.
 *
 */
@Entity
@Table(name = "ELV_V_COUNT_UD_MODIF")
@NamedQuery(name = "ElvVCountUdModif.findAll", query = "SELECT e FROM ElvVCountUdModif e")
public class ElvVCountUdModif implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal niUnitaDocModElenco;
    private BigDecimal idElencoVers;

    public ElvVCountUdModif() {
    }

    @Column(name = "NI_UNITA_DOC_MOD_ELENCO")
    public BigDecimal getNiUnitaDocModElenco() {
        return this.niUnitaDocModElenco;
    }

    public void setNiUnitaDocModElenco(BigDecimal niUnitaDocModElenco) {
        this.niUnitaDocModElenco = niUnitaDocModElenco;
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
