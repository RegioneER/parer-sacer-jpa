package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_LIS_ERR_FILE_SERIE_UD database table.
 * 
 */
@Entity
@Table(name = "SER_V_LIS_ERR_FILE_SERIE_UD")
@NamedQuery(name = "SerVLisErrFileSerieUd.findAll", query = "SELECT s FROM SerVLisErrFileSerieUd s")
public class SerVLisErrFileSerieUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dsRecErr;
    private BigDecimal idErrFileInput;
    private BigDecimal idFileInputVerSerie;
    private BigDecimal idVerSerie;
    private BigDecimal niRecErr;
    private String tiErrRec;
    private String tiScopoFileInputVerSerie;

    public SerVLisErrFileSerieUd() {/* Hibernate */
    }

    @Column(name = "DS_REC_ERR")
    public String getDsRecErr() {
        return this.dsRecErr;
    }

    public void setDsRecErr(String dsRecErr) {
        this.dsRecErr = dsRecErr;
    }

    @Id
    @Column(name = "ID_ERR_FILE_INPUT")
    public BigDecimal getIdErrFileInput() {
        return this.idErrFileInput;
    }

    public void setIdErrFileInput(BigDecimal idErrFileInput) {
        this.idErrFileInput = idErrFileInput;
    }

    @Column(name = "ID_FILE_INPUT_VER_SERIE")
    public BigDecimal getIdFileInputVerSerie() {
        return this.idFileInputVerSerie;
    }

    public void setIdFileInputVerSerie(BigDecimal idFileInputVerSerie) {
        this.idFileInputVerSerie = idFileInputVerSerie;
    }

    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

    @Column(name = "NI_REC_ERR")
    public BigDecimal getNiRecErr() {
        return this.niRecErr;
    }

    public void setNiRecErr(BigDecimal niRecErr) {
        this.niRecErr = niRecErr;
    }

    @Column(name = "TI_ERR_REC")
    public String getTiErrRec() {
        return this.tiErrRec;
    }

    public void setTiErrRec(String tiErrRec) {
        this.tiErrRec = tiErrRec;
    }

    @Column(name = "TI_SCOPO_FILE_INPUT_VER_SERIE")
    public String getTiScopoFileInputVerSerie() {
        return this.tiScopoFileInputVerSerie;
    }

    public void setTiScopoFileInputVerSerie(String tiScopoFileInputVerSerie) {
        this.tiScopoFileInputVerSerie = tiScopoFileInputVerSerie;
    }

}
