package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_LIS_ERR_CONTEN_SERIE_UD database table.
 * 
 */
@Entity
@Table(name = "SER_V_LIS_ERR_CONTEN_SERIE_UD")
@NamedQuery(name = "SerVLisErrContenSerieUd.findAll", query = "SELECT s FROM SerVLisErrContenSerieUd s")
public class SerVLisErrContenSerieUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dlErr;
    private BigDecimal idContenutoVerSerie;
    private BigDecimal idErrContenutoVerSerie;
    private BigDecimal pgErr;
    private String tiErr;
    private String tiGravitaErr;
    private String tiOrigineErr;

    public SerVLisErrContenSerieUd() {/* Hibernate */
    }

    @Column(name = "DL_ERR")
    public String getDlErr() {
        return this.dlErr;
    }

    public void setDlErr(String dlErr) {
        this.dlErr = dlErr;
    }

    @Column(name = "ID_CONTENUTO_VER_SERIE")
    public BigDecimal getIdContenutoVerSerie() {
        return this.idContenutoVerSerie;
    }

    public void setIdContenutoVerSerie(BigDecimal idContenutoVerSerie) {
        this.idContenutoVerSerie = idContenutoVerSerie;
    }

    @Id
    @Column(name = "ID_ERR_CONTENUTO_VER_SERIE")
    public BigDecimal getIdErrContenutoVerSerie() {
        return this.idErrContenutoVerSerie;
    }

    public void setIdErrContenutoVerSerie(BigDecimal idErrContenutoVerSerie) {
        this.idErrContenutoVerSerie = idErrContenutoVerSerie;
    }

    @Column(name = "PG_ERR")
    public BigDecimal getPgErr() {
        return this.pgErr;
    }

    public void setPgErr(BigDecimal pgErr) {
        this.pgErr = pgErr;
    }

    @Column(name = "TI_ERR")
    public String getTiErr() {
        return this.tiErr;
    }

    public void setTiErr(String tiErr) {
        this.tiErr = tiErr;
    }

    @Column(name = "TI_GRAVITA_ERR")
    public String getTiGravitaErr() {
        return this.tiGravitaErr;
    }

    public void setTiGravitaErr(String tiGravitaErr) {
        this.tiGravitaErr = tiGravitaErr;
    }

    @Column(name = "TI_ORIGINE_ERR")
    public String getTiOrigineErr() {
        return this.tiOrigineErr;
    }

    public void setTiOrigineErr(String tiOrigineErr) {
        this.tiOrigineErr = tiOrigineErr;
    }

}