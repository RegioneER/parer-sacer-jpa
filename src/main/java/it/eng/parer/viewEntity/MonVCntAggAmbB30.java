package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_AGG_AMB_B30 database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_AGG_AMB_B30")
@NamedQuery(name = "MonVCntAggAmbB30.findAll", query = "SELECT m FROM MonVCntAggAmbB30 m")
public class MonVCntAggAmbB30 implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idAmbiente;
    private BigDecimal idUserIam;
    private BigDecimal niAgg;
    private String tiStatoVers;

    public MonVCntAggAmbB30() {
    }

    @Id
    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "NI_AGG")
    public BigDecimal getNiAgg() {
        return this.niAgg;
    }

    public void setNiAgg(BigDecimal niAgg) {
        this.niAgg = niAgg;
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