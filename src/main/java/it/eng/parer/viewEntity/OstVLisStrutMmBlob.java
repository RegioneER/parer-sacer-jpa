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
 * The persistent class for the OST_V_LIS_STRUT_MM_BLOB database table.
 */
@Entity
@Table(name = "OST_V_LIS_STRUT_MM_BLOB")
@NamedQuery(name = "OstVLisStrutMmBlob.findAll", query = "SELECT o FROM OstVLisStrutMmBlob o")
public class OstVLisStrutMmBlob implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cdPartition;

    private String cdSubPartition;

    private Date dtVersFine;

    private Date dtVersIni;

    private String flFileAggiunti;

    private BigDecimal idPartition;

    public OstVLisStrutMmBlob() {/* Hibernate */
    }

    @Column(name = "CD_PARTITION")
    public String getCdPartition() {
        return this.cdPartition;
    }

    public void setCdPartition(String cdPartition) {
        this.cdPartition = cdPartition;
    }

    @Column(name = "CD_SUB_PARTITION")
    public String getCdSubPartition() {
        return this.cdSubPartition;
    }

    public void setCdSubPartition(String cdSubPartition) {
        this.cdSubPartition = cdSubPartition;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_VERS_FINE")
    public Date getDtVersFine() {
        return this.dtVersFine;
    }

    public void setDtVersFine(Date dtVersFine) {
        this.dtVersFine = dtVersFine;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_VERS_INI")
    public Date getDtVersIni() {
        return this.dtVersIni;
    }

    public void setDtVersIni(Date dtVersIni) {
        this.dtVersIni = dtVersIni;
    }

    @Column(name = "FL_FILE_AGGIUNTI", columnDefinition = "char(1)")
    public String getFlFileAggiunti() {
        return this.flFileAggiunti;
    }

    public void setFlFileAggiunti(String flFileAggiunti) {
        this.flFileAggiunti = flFileAggiunti;
    }

    @Column(name = "ID_PARTITION")
    public BigDecimal getIdPartition() {
        return this.idPartition;
    }

    public void setIdPartition(BigDecimal idPartition) {
        this.idPartition = idPartition;
    }

    private OstVLisStrutMmBlobId ostVLisStrutMmBlobId;

    @EmbeddedId()
    public OstVLisStrutMmBlobId getOstVLisStrutMmBlobId() {
        return ostVLisStrutMmBlobId;
    }

    public void setOstVLisStrutMmBlobId(OstVLisStrutMmBlobId ostVLisStrutMmBlobId) {
        this.ostVLisStrutMmBlobId = ostVLisStrutMmBlobId;
    }
}
