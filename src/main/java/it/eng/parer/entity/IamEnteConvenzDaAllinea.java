package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the IAM_ENTE_CONVENZ_DA_ALLINEA database table.
 *
 */
@Entity
@Table(name = "IAM_ENTE_CONVENZ_DA_ALLINEA")
public class IamEnteConvenzDaAllinea implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idEnteConvenzDaAllinea;
    private String cdErr;
    private String dsMsgErr;
    private Date dtErr;
    private Date dtLogEnteConvenzDaAllinea;
    private BigDecimal idEnteConvenz;
    private String nmEnteConvenz;
    private String tiOperAllinea;
    private String tiStatoAllinea;

    public IamEnteConvenzDaAllinea() {
    }

    @Id
    @SequenceGenerator(name = "IAM_ENTE_CONVENZ_DA_ALLINEA_IDENTECONVENZDAALLINEA_GENERATOR", sequenceName = "SIAM_ENTE_CONVENZ_DA_ALLINEA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IAM_ENTE_CONVENZ_DA_ALLINEA_IDENTECONVENZDAALLINEA_GENERATOR")
    @Column(name = "ID_ENTE_CONVENZ_DA_ALLINEA")
    public long getIdEnteConvenzDaAllinea() {
        return this.idEnteConvenzDaAllinea;
    }

    public void setIdEnteConvenzDaAllinea(long idEnteConvenzDaAllinea) {
        this.idEnteConvenzDaAllinea = idEnteConvenzDaAllinea;
    }

    @Column(name = "CD_ERR")
    public String getCdErr() {
        return this.cdErr;
    }

    public void setCdErr(String cdErr) {
        this.cdErr = cdErr;
    }

    @Column(name = "DS_MSG_ERR")
    public String getDsMsgErr() {
        return this.dsMsgErr;
    }

    public void setDsMsgErr(String dsMsgErr) {
        this.dsMsgErr = dsMsgErr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ERR")
    public Date getDtErr() {
        return this.dtErr;
    }

    public void setDtErr(Date dtErr) {
        this.dtErr = dtErr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LOG_ENTE_CONVENZ_DA_ALLINEA")
    public Date getDtLogEnteConvenzDaAllinea() {
        return this.dtLogEnteConvenzDaAllinea;
    }

    public void setDtLogEnteConvenzDaAllinea(Date dtLogEnteConvenzDaAllinea) {
        this.dtLogEnteConvenzDaAllinea = dtLogEnteConvenzDaAllinea;
    }

    @Column(name = "ID_ENTE_CONVENZ")
    public BigDecimal getIdEnteConvenz() {
        return this.idEnteConvenz;
    }

    public void setIdEnteConvenz(BigDecimal idEnteConvenz) {
        this.idEnteConvenz = idEnteConvenz;
    }

    @Column(name = "NM_ENTE_CONVENZ")
    public String getNmEnteConvenz() {
        return this.nmEnteConvenz;
    }

    public void setNmEnteConvenz(String nmEnteConvenz) {
        this.nmEnteConvenz = nmEnteConvenz;
    }

    @Column(name = "TI_OPER_ALLINEA")
    public String getTiOperAllinea() {
        return this.tiOperAllinea;
    }

    public void setTiOperAllinea(String tiOperAllinea) {
        this.tiOperAllinea = tiOperAllinea;
    }

    @Column(name = "TI_STATO_ALLINEA")
    public String getTiStatoAllinea() {
        return this.tiStatoAllinea;
    }

    public void setTiStatoAllinea(String tiStatoAllinea) {
        this.tiStatoAllinea = tiStatoAllinea;
    }

}
