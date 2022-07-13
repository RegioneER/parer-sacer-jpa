package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_DOC_NONVERS_STRUT database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_NONVERS_STRUT")
@NamedQuery(name = "MonVCntDocNonversStrut.findAll", query = "SELECT m FROM MonVCntDocNonversStrut m")
public class MonVCntDocNonversStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idStrut;
    private BigDecimal niDocNonvers;
    private String tiStatoDocNonvers;

    public MonVCntDocNonversStrut() {
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_DOC_NONVERS")
    public BigDecimal getNiDocNonvers() {
        return this.niDocNonvers;
    }

    public void setNiDocNonvers(BigDecimal niDocNonvers) {
        this.niDocNonvers = niDocNonvers;
    }

    @Id
    @Column(name = "TI_STATO_DOC_NONVERS")
    public String getTiStatoDocNonvers() {
        return this.tiStatoDocNonvers;
    }

    public void setTiStatoDocNonvers(String tiStatoDocNonvers) {
        this.tiStatoDocNonvers = tiStatoDocNonvers;
    }

}