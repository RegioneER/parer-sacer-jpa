package it.eng.parer.grantedViewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the USR_V_ABIL_AMB_ENTE_CONVENZ database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.USR_V_ABIL_AMB_ENTE_CONVENZ")
@NamedQuery(name = "UsrVAbilAmbEnteConvenz.findAll", query = "SELECT u FROM UsrVAbilAmbEnteConvenz u")
public class UsrVAbilAmbEnteConvenz implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idAmbienteEnteConvenz;
    private BigDecimal idUserIam;
    private String nmAmbienteEnteConvenz;
    private String nmUserid;

    public UsrVAbilAmbEnteConvenz() {
    }

    @Id
    @Column(name = "ID_AMBIENTE_ENTE_CONVENZ")
    public BigDecimal getIdAmbienteEnteConvenz() {
        return this.idAmbienteEnteConvenz;
    }

    public void setIdAmbienteEnteConvenz(BigDecimal idAmbienteEnteConvenz) {
        this.idAmbienteEnteConvenz = idAmbienteEnteConvenz;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "NM_AMBIENTE_ENTE_CONVENZ")
    public String getNmAmbienteEnteConvenz() {
        return this.nmAmbienteEnteConvenz;
    }

    public void setNmAmbienteEnteConvenz(String nmAmbienteEnteConvenz) {
        this.nmAmbienteEnteConvenz = nmAmbienteEnteConvenz;
    }

    @Column(name = "NM_USERID")
    public String getNmUserid() {
        return this.nmUserid;
    }

    public void setNmUserid(String nmUserid) {
        this.nmUserid = nmUserid;
    }

}
