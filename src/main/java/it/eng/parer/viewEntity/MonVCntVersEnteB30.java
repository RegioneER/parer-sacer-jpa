package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_VERS_ENTE_B30 database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_VERS_ENTE_B30")
@NamedQuery(name = "MonVCntVersEnteB30.findAll", query = "SELECT m FROM MonVCntVersEnteB30 m")
public class MonVCntVersEnteB30 implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idEnte;
    private BigDecimal idUserIam;
    private BigDecimal niVers;
    private String tiStatoVers;

    public MonVCntVersEnteB30() {
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

    @Column(name = "NI_VERS")
    public BigDecimal getNiVers() {
        return this.niVers;
    }

    public void setNiVers(BigDecimal niVers) {
        this.niVers = niVers;
    }

    @Id
    @Column(name = "TI_STATO_VERS")
    public String getTiStatoVers() {
        return this.tiStatoVers;
    }

    public void setTiStatoVers(String tiStatoVers) {
        this.tiStatoVers = tiStatoVers;
    }

}