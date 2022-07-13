package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_UD_NONVERS_ENTE database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_UD_NONVERS_ENTE")
@NamedQuery(name = "MonVCntUdNonversEnte.findAll", query = "SELECT m FROM MonVCntUdNonversEnte m")
public class MonVCntUdNonversEnte implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idEnte;
    private BigDecimal idUserIam;
    private BigDecimal niUdNonvers;
    private String tiStatoUdNonvers;

    public MonVCntUdNonversEnte() {
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

    @Column(name = "NI_UD_NONVERS")
    public BigDecimal getNiUdNonvers() {
        return this.niUdNonvers;
    }

    public void setNiUdNonvers(BigDecimal niUdNonvers) {
        this.niUdNonvers = niUdNonvers;
    }

    @Id
    @Column(name = "TI_STATO_UD_NONVERS")
    public String getTiStatoUdNonvers() {
        return this.tiStatoUdNonvers;
    }

    public void setTiStatoUdNonvers(String tiStatoUdNonvers) {
        this.tiStatoUdNonvers = tiStatoUdNonvers;
    }

}