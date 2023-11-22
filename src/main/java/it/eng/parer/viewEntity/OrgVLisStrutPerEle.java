package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ORG_V_LIS_STRUT_PER_ELE database table.
 *
 */
@Entity
@Table(name = "ORG_V_LIS_STRUT_PER_ELE")
@NamedQuery(name = "OrgVLisStrutPerEle.findAll", query = "SELECT e FROM OrgVLisStrutPerEle e")
public class OrgVLisStrutPerEle implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idStrut;
    private String flPresenzaElencoFisc;

    public OrgVLisStrutPerEle() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "FL_PRESENZA_ELENCO_FISC", columnDefinition = "char(1)")
    public String getFlPresenzaElencoFisc() {
        return this.flPresenzaElencoFisc;
    }

    public void setFlPresenzaElencoFisc(String flPresenzaElencoFisc) {
        this.flPresenzaElencoFisc = flPresenzaElencoFisc;
    }

}
