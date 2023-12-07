package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ELV_V_CHK_IX_AIP_UD_GEN database table.
 *
 */
@Entity
@Table(name = "ELV_V_CHK_IX_AIP_UD_GEN")
@NamedQuery(name = "ElvVChkIxAipUdGen.findAll", query = "SELECT e FROM ElvVChkIxAipUdGen e")
public class ElvVChkIxAipUdGen implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flIxAipUdGenOk;
    private BigDecimal idElencoVers;

    public ElvVChkIxAipUdGen() {/* Hibernate */
    }

    @Column(name = "FL_IX_AIP_UD_GEN_OK", columnDefinition = "char(1)")
    public String getFlIxAipUdGenOk() {
        return this.flIxAipUdGenOk;
    }

    public void setFlIxAipUdGenOk(String flIxAipUdGenOk) {
        this.flIxAipUdGenOk = flIxAipUdGenOk;
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
