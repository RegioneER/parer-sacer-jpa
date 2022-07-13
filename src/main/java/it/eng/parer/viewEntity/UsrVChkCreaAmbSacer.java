package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the USR_V_CHK_CREA_AMB_SACER database table.
 * 
 */
@Entity
@Table(name = "USR_V_CHK_CREA_AMB_SACER")
@NamedQuery(name = "UsrVChkCreaAmbSacer.findAll", query = "SELECT u FROM UsrVChkCreaAmbSacer u")
public class UsrVChkCreaAmbSacer implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flCreaAmbiente;
    private BigDecimal idApplic;
    private BigDecimal idUserIam;
    private String nmApplic;

    public UsrVChkCreaAmbSacer() {
    }

    @Column(name = "FL_CREA_AMBIENTE")
    public String getFlCreaAmbiente() {
        return this.flCreaAmbiente;
    }

    public void setFlCreaAmbiente(String flCreaAmbiente) {
        this.flCreaAmbiente = flCreaAmbiente;
    }

    @Id
    @Column(name = "ID_APPLIC")
    public BigDecimal getIdApplic() {
        return this.idApplic;
    }

    public void setIdApplic(BigDecimal idApplic) {
        this.idApplic = idApplic;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "NM_APPLIC")
    public String getNmApplic() {
        return this.nmApplic;
    }

    public void setNmApplic(String nmApplic) {
        this.nmApplic = nmApplic;
    }

}