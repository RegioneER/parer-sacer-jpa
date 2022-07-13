package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * The persistent class for the ELV_V_CHK_ALL_AIP_FASC_IN_CODA database table.
 *
 */
@Entity
@Table(name = "ELV_V_CHK_ALL_AIP_FASC_IN_CODA")
@NamedQuery(name = "ElvVChkAllAipFascInCoda.findAll", query = "SELECT e FROM ElvVChkAllAipFascInCoda e")
public class ElvVChkAllAipFascInCoda implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idElencoVersFasc;
    private String flAllAipInCoda;

    public ElvVChkAllAipFascInCoda() {
    }

    @Id
    @Column(name = "ID_ELENCO_VERS_FASC")
    public BigDecimal getIdElencoVersFasc() {
        return this.idElencoVersFasc;
    }

    public void setIdElencoVersFasc(BigDecimal idElencoVersFasc) {
        this.idElencoVersFasc = idElencoVersFasc;
    }

    @Column(name = "FL_ALL_AIP_IN_CODA")
    public String getFlAllAipInCoda() {
        return this.flAllAipInCoda;
    }

    public void setFlAllAipInCoda(String flAllAipInCoda) {
        this.flAllAipInCoda = flAllAipInCoda;
    }

}
