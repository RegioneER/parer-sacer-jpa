package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_V_LISAIPUD_URNDACALC_BYUD database table.
 *
 */
@Entity
@Table(name = "ARO_V_LISAIPUD_URNDACALC_BYUD")
@NamedQuery(name = "AroVLisaipudUrndacalcByud.findAll", query = "SELECT v FROM AroVLisaipudUrndacalcByud v")
public class AroVLisaipudUrndacalcByud implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idUnitaDoc;
    private BigDecimal idVerIndiceAip;

    public AroVLisaipudUrndacalcByud() {/* Hibernate */
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
    @Column(name = "ID_VER_INDICE_AIP")
    public BigDecimal getIdVerIndiceAip() {
        return idVerIndiceAip;
    }

    public void setIdVerIndiceAip(BigDecimal idVerIndiceAip) {
        this.idVerIndiceAip = idVerIndiceAip;
    }

}
