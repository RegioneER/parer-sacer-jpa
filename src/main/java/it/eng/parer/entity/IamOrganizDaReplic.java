package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the IAM_ORGANIZ_DA_REPLIC database table.
 * 
 */
@Entity
@Table(name = "IAM_ORGANIZ_DA_REPLIC")
public class IamOrganizDaReplic implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idOrganizDaReplic;
    private String cdErr;
    private String dsMsgErr;
    private Date dtErr;
    private Date dtLogOrganizDaReplic;
    private BigDecimal idOrganizApplic;
    private String nmOrganiz;
    private String nmTipoOrganiz;
    private String tiOperReplic;
    private String tiStatoReplic;

    public IamOrganizDaReplic() {
    }

    @Id
    @SequenceGenerator(name = "IAM_ORGANIZ_DA_REPLIC_IDORGANIZDAREPLIC_GENERATOR", sequenceName = "SIAM_ORGANIZ_DA_REPLIC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "IAM_ORGANIZ_DA_REPLIC_IDORGANIZDAREPLIC_GENERATOR")
    @Column(name = "ID_ORGANIZ_DA_REPLIC")
    public long getIdOrganizDaReplic() {
        return this.idOrganizDaReplic;
    }

    public void setIdOrganizDaReplic(long idOrganizDaReplic) {
        this.idOrganizDaReplic = idOrganizDaReplic;
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
    @Column(name = "DT_LOG_ORGANIZ_DA_REPLIC")
    public Date getDtLogOrganizDaReplic() {
        return this.dtLogOrganizDaReplic;
    }

    public void setDtLogOrganizDaReplic(Date dtLogOrganizDaReplic) {
        this.dtLogOrganizDaReplic = dtLogOrganizDaReplic;
    }

    @Column(name = "ID_ORGANIZ_APPLIC")
    public BigDecimal getIdOrganizApplic() {
        return this.idOrganizApplic;
    }

    public void setIdOrganizApplic(BigDecimal idOrganizApplic) {
        this.idOrganizApplic = idOrganizApplic;
    }

    @Column(name = "NM_ORGANIZ")
    public String getNmOrganiz() {
        return this.nmOrganiz;
    }

    public void setNmOrganiz(String nmOrganiz) {
        this.nmOrganiz = nmOrganiz;
    }

    @Column(name = "NM_TIPO_ORGANIZ")
    public String getNmTipoOrganiz() {
        return this.nmTipoOrganiz;
    }

    public void setNmTipoOrganiz(String nmTipoOrganiz) {
        this.nmTipoOrganiz = nmTipoOrganiz;
    }

    @Column(name = "TI_OPER_REPLIC")
    public String getTiOperReplic() {
        return this.tiOperReplic;
    }

    public void setTiOperReplic(String tiOperReplic) {
        this.tiOperReplic = tiOperReplic;
    }

    @Column(name = "TI_STATO_REPLIC")
    public String getTiStatoReplic() {
        return this.tiStatoReplic;
    }

    public void setTiStatoReplic(String tiStatoReplic) {
        this.tiStatoReplic = tiStatoReplic;
    }

}