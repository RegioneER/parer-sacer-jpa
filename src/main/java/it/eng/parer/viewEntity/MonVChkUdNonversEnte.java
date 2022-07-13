package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CHK_UD_NONVERS_ENTE database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_UD_NONVERS_ENTE")
@NamedQuery(name = "MonVChkUdNonversEnte.findAll", query = "SELECT m FROM MonVChkUdNonversEnte m")
public class MonVChkUdNonversEnte implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flUdNonversNorisolub;
    private String flUdNonversNoverif;
    private String flUdNonversVerif;
    private BigDecimal idEnte;
    private BigDecimal idUserIam;

    public MonVChkUdNonversEnte() {
    }

    @Column(name = "FL_UD_NONVERS_NORISOLUB")
    public String getFlUdNonversNorisolub() {
        return this.flUdNonversNorisolub;
    }

    public void setFlUdNonversNorisolub(String flUdNonversNorisolub) {
        this.flUdNonversNorisolub = flUdNonversNorisolub;
    }

    @Column(name = "FL_UD_NONVERS_NOVERIF")
    public String getFlUdNonversNoverif() {
        return this.flUdNonversNoverif;
    }

    public void setFlUdNonversNoverif(String flUdNonversNoverif) {
        this.flUdNonversNoverif = flUdNonversNoverif;
    }

    @Column(name = "FL_UD_NONVERS_VERIF")
    public String getFlUdNonversVerif() {
        return this.flUdNonversVerif;
    }

    public void setFlUdNonversVerif(String flUdNonversVerif) {
        this.flUdNonversVerif = flUdNonversVerif;
    }

    @Id
    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

}