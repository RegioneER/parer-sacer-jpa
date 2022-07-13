package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_UD_STRUT_B30 database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_UD_STRUT_B30")
@NamedQuery(name = "MonVCntUdStrutB30.findAll", query = "SELECT m FROM MonVCntUdStrutB30 m")
public class MonVCntUdStrutB30 implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idStrut;
    private BigDecimal niUd;
    private String tiStatoUd;

    public MonVCntUdStrutB30() {
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_UD")
    public BigDecimal getNiUd() {
        return this.niUd;
    }

    public void setNiUd(BigDecimal niUd) {
        this.niUd = niUd;
    }

    @Id
    @Column(name = "TI_STATO_UD")
    public String getTiStatoUd() {
        return this.tiStatoUd;
    }

    public void setTiStatoUd(String tiStatoUd) {
        this.tiStatoUd = tiStatoUd;
    }

}