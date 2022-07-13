package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the FAS_V_LIS_FASC_BY_UPD_UD database table.
 *
 */
@Entity
@Table(name = "FAS_V_LIS_FASC_BY_UPD_UD")
@NamedQuery(name = "FasVLisFascByUpdUd.findAll", query = "SELECT s FROM FasVLisFascByUpdUd s")
public class FasVLisFascByUpdUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private BigDecimal idFascicolo;

    public FasVLisFascByUpdUd() {
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
    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return this.idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
    }

}
