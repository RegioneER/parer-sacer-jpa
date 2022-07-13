package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_DOC_NONVERS_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_NONVERS_AMB")
@NamedQuery(name = "MonVCntDocNonversAmb.findAll", query = "SELECT m FROM MonVCntDocNonversAmb m")
public class MonVCntDocNonversAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idAmbiente;
    private BigDecimal idUserIam;
    private BigDecimal niDocNonvers;
    private String tiStatoDocNonvers;

    public MonVCntDocNonversAmb() {
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