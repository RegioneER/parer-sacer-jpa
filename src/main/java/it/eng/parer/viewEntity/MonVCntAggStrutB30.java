package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_AGG_STRUT_B30 database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_AGG_STRUT_B30")
@NamedQuery(name = "MonVCntAggStrutB30.findAll", query = "SELECT m FROM MonVCntAggStrutB30 m")
public class MonVCntAggStrutB30 implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idStrut;
    private BigDecimal niAgg;
    private String tiStatoVers;

    public MonVCntAggStrutB30() {
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
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