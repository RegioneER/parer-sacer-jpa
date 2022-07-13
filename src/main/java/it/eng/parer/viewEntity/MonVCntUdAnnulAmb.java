package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_UD_ANNUL_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_UD_ANNUL_AMB")
@NamedQuery(name = "MonVCntUdAnnulAmb.findAll", query = "SELECT m FROM MonVCntUdAnnulAmb m")
public class MonVCntUdAnnulAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idAmbiente;
    private BigDecimal idUserIam;
    private BigDecimal niAnnul;
    private String tiStatoAnnul;

    public MonVCntUdAnnulAmb() {
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