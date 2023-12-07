package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the VRS_V_DOC_NON_VERS database table.
 */
@Entity
@Table(name = "VRS_V_DOC_NON_VERS")
@NamedQuery(name = "VrsVDocNonVer.findAll", query = "SELECT v FROM VrsVDocNonVer v")
public class VrsVDocNonVer implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdErrLast;
    private String clErrLast;
    private String dsErrLast;
    private Date dtFirstSesErr;
    private Date dtLastSesErr;
    private String flDiversiErr;
    private BigDecimal idDocNonVers;

    public VrsVDocNonVer() {/* Hibernate */
    }

    private VrsVDocNonVerId vrsVDocNonVerId;

    @EmbeddedId()
    public VrsVDocNonVerId getVrsVDocNonVerId() {
        return vrsVDocNonVerId;
    }

    public void setVrsVDocNonVerId(VrsVDocNonVerId vrsVDocNonVerId) {
        this.vrsVDocNonVerId = vrsVDocNonVerId;
    }

    @Column(name = "CD_ERR_LAST")
    public String getCdErrLast() {
        return this.cdErrLast;
    }

    public void setCdErrLast(String cdErrLast) {
        this.cdErrLast = cdErrLast;
    }

    @Column(name = "CL_ERR_LAST")
    public String getClErrLast() {
        return this.clErrLast;
    }

    public void setClErrLast(String clErrLast) {
        this.clErrLast = clErrLast;
    }

    @Column(name = "DS_ERR_LAST")
    public String getDsErrLast() {
        return this.dsErrLast;
    }

    public void setDsErrLast(String dsErrLast) {
        this.dsErrLast = dsErrLast;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_FIRST_SES_ERR")
    public Date getDtFirstSesErr() {
        return this.dtFirstSesErr;
    }

    public void setDtFirstSesErr(Date dtFirstSesErr) {
        this.dtFirstSesErr = dtFirstSesErr;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_LAST_SES_ERR")
    public Date getDtLastSesErr() {
        return this.dtLastSesErr;
    }

    public void setDtLastSesErr(Date dtLastSesErr) {
        this.dtLastSesErr = dtLastSesErr;
    }

    @Column(name = "FL_DIVERSI_ERR", columnDefinition = "CHAR")
    public String getFlDiversiErr() {
        return this.flDiversiErr;
    }

    public void setFlDiversiErr(String flDiversiErr) {
        this.flDiversiErr = flDiversiErr;
    }

    @Column(name = "ID_DOC_NON_VERS")
    public BigDecimal getIdDocNonVers() {
        return this.idDocNonVers;
    }

    public void setIdDocNonVers(BigDecimal idDocNonVers) {
        this.idDocNonVers = idDocNonVers;
    }

}