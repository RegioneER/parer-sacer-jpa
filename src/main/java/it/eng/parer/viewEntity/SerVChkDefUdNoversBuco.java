package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_CHK_DEF_UD_NOVERS_BUCO database table.
 * 
 */
@Entity
@Table(name = "SER_V_CHK_DEF_UD_NOVERS_BUCO")
@NamedQuery(name = "SerVChkDefUdNoversBuco.findAll", query = "SELECT s FROM SerVChkDefUdNoversBuco s")
public class SerVChkDefUdNoversBuco implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flDefUdNonVers;
    private BigDecimal idSerie;
    private BigDecimal idVerSerie;

    public SerVChkDefUdNoversBuco() {/* Hibernate */
    }

    @Column(name = "FL_DEF_UD_NON_VERS", columnDefinition = "char(1)")
    public String getFlDefUdNonVers() {
        return this.flDefUdNonVers;
    }

    public void setFlDefUdNonVers(String flDefUdNonVers) {
        this.flDefUdNonVers = flDefUdNonVers;
    }

    @Column(name = "ID_SERIE")
    public BigDecimal getIdSerie() {
        return this.idSerie;
    }

    public void setIdSerie(BigDecimal idSerie) {
        this.idSerie = idSerie;
    }

    @Id
    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

}
