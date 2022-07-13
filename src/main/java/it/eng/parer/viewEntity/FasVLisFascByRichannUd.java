package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the FAS_V_LIS_FASC_BY_RICHANN_UD database table.
 *
 */
@Entity
@Table(name = "FAS_V_LIS_FASC_BY_RICHANN_UD")
@NamedQuery(name = "FasVLisFascByRichannUd.findAll", query = "SELECT f FROM FasVLisFascByRichannUd f")
public class FasVLisFascByRichannUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idFascicolo;
    private BigDecimal idRichAnnulVers;

    public FasVLisFascByRichannUd() {
    }

    @Id
    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return this.idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
    }

    @Id
    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return this.idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }

}
