package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the OST_V_LIS_STRUT_MM_BLOB database table.
 *
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
    private BigDecimal idStrut;
    private BigDecimal idSubPartition;
    private BigDecimal mmVers;

    public OstVLisStrutMmBlob() {
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

    @Column(name = "FL_FILE_AGGIUNTI")
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

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Id
    @Column(name = "ID_SUB_PARTITION")
    public BigDecimal getIdSubPartition() {
        return this.idSubPartition;
    }

    public void setIdSubPartition(BigDecimal idSubPartition) {
        this.idSubPartition = idSubPartition;
    }

    @Id
    @Column(name = "MM_VERS")
    public BigDecimal getMmVers() {
        return this.mmVers;
    }

    public void setMmVers(BigDecimal mmVers) {
        this.mmVers = mmVers;
    }

}
