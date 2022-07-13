package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the SER_V_LIS_VOL_SERIE_UD database table.
 * 
 */
@Entity
@Table(name = "SER_V_LIS_VOL_SERIE_UD")
@NamedQuery(name = "SerVLisVolSerieUd.findAll", query = "SELECT s FROM SerVLisVolSerieUd s")
public class SerVLisVolSerieUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private String cdFirstUnitaDocVol;
    private String cdLastUnitaDocVol;
    private Date dtFirstUnitaDocVol;
    private Date dtLastUnitaDocVol;
    private BigDecimal idVerSerie;
    private BigDecimal idVolVerSerie;
    private BigDecimal niUnitaDocVol;
    private BigDecimal pgVolVerSerie;

    public SerVLisVolSerieUd() {
    }

    @Column(name = "CD_FIRST_UNITA_DOC_VOL")
    public String getCdFirstUnitaDocVol() {
        return this.cdFirstUnitaDocVol;
    }

    public void setCdFirstUnitaDocVol(String cdFirstUnitaDocVol) {
        this.cdFirstUnitaDocVol = cdFirstUnitaDocVol;
    }

    @Column(name = "CD_LAST_UNITA_DOC_VOL")
    public String getCdLastUnitaDocVol() {
        return this.cdLastUnitaDocVol;
    }

    public void setCdLastUnitaDocVol(String cdLastUnitaDocVol) {
        this.cdLastUnitaDocVol = cdLastUnitaDocVol;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIRST_UNITA_DOC_VOL")
    public Date getDtFirstUnitaDocVol() {
        return this.dtFirstUnitaDocVol;
    }

    public void setDtFirstUnitaDocVol(Date dtFirstUnitaDocVol) {
        this.dtFirstUnitaDocVol = dtFirstUnitaDocVol;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LAST_UNITA_DOC_VOL")
    public Date getDtLastUnitaDocVol() {
        return this.dtLastUnitaDocVol;
    }

    public void setDtLastUnitaDocVol(Date dtLastUnitaDocVol) {
        this.dtLastUnitaDocVol = dtLastUnitaDocVol;
    }

    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

    @Id
    @Column(name = "ID_VOL_VER_SERIE")
    public BigDecimal getIdVolVerSerie() {
        return this.idVolVerSerie;
    }

    public void setIdVolVerSerie(BigDecimal idVolVerSerie) {
        this.idVolVerSerie = idVolVerSerie;
    }

    @Column(name = "NI_UNITA_DOC_VOL")
    public BigDecimal getNiUnitaDocVol() {
        return this.niUnitaDocVol;
    }

    public void setNiUnitaDocVol(BigDecimal niUnitaDocVol) {
        this.niUnitaDocVol = niUnitaDocVol;
    }

    @Column(name = "PG_VOL_VER_SERIE")
    public BigDecimal getPgVolVerSerie() {
        return this.pgVolVerSerie;
    }

    public void setPgVolVerSerie(BigDecimal pgVolVerSerie) {
        this.pgVolVerSerie = pgVolVerSerie;
    }

}