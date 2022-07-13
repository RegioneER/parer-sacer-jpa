package it.eng.parer.grantedViewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ORG_V_CHK_SERV_FATT_BY_STRUT database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.ORG_V_CHK_SERV_FATT_BY_STRUT")
public class OrgVChkServFattByStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private Date dtIniVal;
    private String flEliminaEnteStrut;
    private BigDecimal idEnteConvenz;
    private BigDecimal idStrut;

    public OrgVChkServFattByStrut() {
    }

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL")
    public Date getDtIniVal() {
        return this.dtIniVal;
    }

    public void setDtIniVal(Date dtIniVal) {
        this.dtIniVal = dtIniVal;
    }

    @Column(name = "FL_ELIMINA_ENTE_STRUT")
    public String getFlEliminaEnteStrut() {
        return this.flEliminaEnteStrut;
    }

    public void setFlEliminaEnteStrut(String flEliminaEnteStrut) {
        this.flEliminaEnteStrut = flEliminaEnteStrut;
    }

    @Id
    @Column(name = "ID_ENTE_CONVENZ")
    public BigDecimal getIdEnteConvenz() {
        return this.idEnteConvenz;
    }

    public void setIdEnteConvenz(BigDecimal idEnteConvenz) {
        this.idEnteConvenz = idEnteConvenz;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

}
