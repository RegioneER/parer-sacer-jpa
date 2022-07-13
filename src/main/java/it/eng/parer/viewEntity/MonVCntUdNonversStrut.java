package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_UD_NONVERS_STRUT database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_UD_NONVERS_STRUT")
@NamedQuery(name = "MonVCntUdNonversStrut.findAll", query = "SELECT m FROM MonVCntUdNonversStrut m")
public class MonVCntUdNonversStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idStrut;
    private BigDecimal niUdNonvers;
    private String tiStatoUdNonvers;

    public MonVCntUdNonversStrut() {
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
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