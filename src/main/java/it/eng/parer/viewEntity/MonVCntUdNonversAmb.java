package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_UD_NONVERS_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_UD_NONVERS_AMB")
@NamedQuery(name = "MonVCntUdNonversAmb.findAll", query = "SELECT m FROM MonVCntUdNonversAmb m")
public class MonVCntUdNonversAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idAmbiente;
    private BigDecimal idUserIam;
    private BigDecimal niUdNonvers;
    private String tiStatoUdNonvers;

    public MonVCntUdNonversAmb() {
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