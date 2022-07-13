package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_UD_ANNUL_STRUT database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_UD_ANNUL_STRUT")
@NamedQuery(name = "MonVCntUdAnnulStrut.findAll", query = "SELECT m FROM MonVCntUdAnnulStrut m")
public class MonVCntUdAnnulStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idStrut;
    private BigDecimal niAnnul;
    private String tiStatoAnnul;

    public MonVCntUdAnnulStrut() {
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_ANNUL")
    public BigDecimal getNiAnnul() {
        return this.niAnnul;
    }

    public void setNiAnnul(BigDecimal niAnnul) {
        this.niAnnul = niAnnul;
    }

    @Id
    @Column(name = "TI_STATO_ANNUL")
    public String getTiStatoAnnul() {
        return this.tiStatoAnnul;
    }

    public void setTiStatoAnnul(String tiStatoAnnul) {
        this.tiStatoAnnul = tiStatoAnnul;
    }

}