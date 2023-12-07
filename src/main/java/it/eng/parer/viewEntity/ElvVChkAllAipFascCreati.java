package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ELV_V_CHK_ALL_AIP_FASC_CREATI database table.
 *
 */
@Entity
@Table(name = "ELV_V_CHK_ALL_AIP_FASC_CREATI")
@NamedQuery(name = "ElvVChkAllAipFascCreati.findAll", query = "SELECT e FROM ElvVChkAllAipFascCreati e")
public class ElvVChkAllAipFascCreati implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idElencoVersFasc;
    private String flAllAipCreati;

    public ElvVChkAllAipFascCreati() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_ELENCO_VERS_FASC")
    public BigDecimal getIdElencoVersFasc() {
        return this.idElencoVersFasc;
    }

    public void setIdElencoVersFasc(BigDecimal idElencoVersFasc) {
        this.idElencoVersFasc = idElencoVersFasc;
    }

    @Column(name = "FL_ALL_AIP_CREATI", columnDefinition = "char(1)")
    public String getFlAllAipCreati() {
        return this.flAllAipCreati;
    }

    public void setFlAllAipCreati(String flAllAipCreati) {
        this.flAllAipCreati = flAllAipCreati;
    }

}
