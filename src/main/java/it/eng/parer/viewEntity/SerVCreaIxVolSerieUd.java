package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the SER_V_CREA_IX_VOL_SERIE_UD database table.
 *
 */
@Entity
@Table(name = "SER_V_CREA_IX_VOL_SERIE_UD")
@NamedQuery(name = "SerVCreaIxVolSerieUd.findAll", query = "SELECT s FROM SerVCreaIxVolSerieUd s")
public class SerVCreaIxVolSerieUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private String cdFirstUnitaDocVol;
    private String cdLastUnitaDocVol;
    private String cdVerSerie;
    private String cdVerXsdIxVol;
    private String dsAutoreCriterioOrdinamento;
    private String dsCriterioOrdinamento;
    private String dsIdSerie;
    private String dsSerie;
    private Date dtCriterioOrdinamento;
    private Date dtFirstUnitaDocVol;
    private Date dtLastUnitaDocVol;
    private BigDecimal idVolVerSerie;
    private BigDecimal niUnitaDocVol;

    public SerVCreaIxVolSerieUd() {/* Hibernate */
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

    @Column(name = "CD_VER_SERIE")
    public String getCdVerSerie() {
        return this.cdVerSerie;
    }

    public void setCdVerSerie(String cdVerSerie) {
        this.cdVerSerie = cdVerSerie;
    }

    @Column(name = "CD_VER_XSD_IX_VOL", columnDefinition = "char")
    public String getCdVerXsdIxVol() {
        return this.cdVerXsdIxVol;
    }

    public void setCdVerXsdIxVol(String cdVerXsdIxVol) {
        this.cdVerXsdIxVol = cdVerXsdIxVol;
    }

    @Column(name = "DS_AUTORE_CRITERIO_ORDINAMENTO")
    public String getDsAutoreCriterioOrdinamento() {
        return this.dsAutoreCriterioOrdinamento;
    }

    public void setDsAutoreCriterioOrdinamento(String dsAutoreCriterioOrdinamento) {
        this.dsAutoreCriterioOrdinamento = dsAutoreCriterioOrdinamento;
    }

    @Column(name = "DS_CRITERIO_ORDINAMENTO")
    public String getDsCriterioOrdinamento() {
        return this.dsCriterioOrdinamento;
    }

    public void setDsCriterioOrdinamento(String dsCriterioOrdinamento) {
        this.dsCriterioOrdinamento = dsCriterioOrdinamento;
    }

    @Column(name = "DS_ID_SERIE")
    public String getDsIdSerie() {
        return this.dsIdSerie;
    }

    public void setDsIdSerie(String dsIdSerie) {
        this.dsIdSerie = dsIdSerie;
    }

    @Column(name = "DS_SERIE")
    public String getDsSerie() {
        return this.dsSerie;
    }

    public void setDsSerie(String dsSerie) {
        this.dsSerie = dsSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CRITERIO_ORDINAMENTO")
    public Date getDtCriterioOrdinamento() {
        return this.dtCriterioOrdinamento;
    }

    public void setDtCriterioOrdinamento(Date dtCriterioOrdinamento) {
        this.dtCriterioOrdinamento = dtCriterioOrdinamento;
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

}
