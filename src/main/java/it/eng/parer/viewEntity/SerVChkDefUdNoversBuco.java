package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

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

    public SerVChkDefUdNoversBuco() {
    }

    @Column(name = "FL_DEF_UD_NON_VERS")
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