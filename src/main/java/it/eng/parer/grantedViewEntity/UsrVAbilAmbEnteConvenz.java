package it.eng.parer.grantedViewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the USR_V_ABIL_AMB_ENTE_CONVENZ database table.
 *
 */
@Entity
@Table(schema = "SACER_IAM", name = "USR_V_ABIL_AMB_ENTE_CONVENZ")
@NamedQuery(name = "UsrVAbilAmbEnteConvenz.findAll", query = "SELECT u FROM UsrVAbilAmbEnteConvenz u")
public class UsrVAbilAmbEnteConvenz implements Serializable {

    private static final long serialVersionUID = 1L;
    private UsrVAbilAmbEnteConvenzId usrVAbilAmbEnteConvenzId;
    private String nmAmbienteEnteConvenz;
    private String nmUserid;

    public UsrVAbilAmbEnteConvenz() {/* Hibernate */
    }

    @EmbeddedId
    public UsrVAbilAmbEnteConvenzId getUsrVAbilAmbEnteConvenzId() {
        return usrVAbilAmbEnteConvenzId;
    }

    public void setUsrVAbilAmbEnteConvenzId(UsrVAbilAmbEnteConvenzId usrVAbilAmbEnteConvenzId) {
        this.usrVAbilAmbEnteConvenzId = usrVAbilAmbEnteConvenzId;
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
