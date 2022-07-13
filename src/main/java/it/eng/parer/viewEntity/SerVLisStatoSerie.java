package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the SER_V_LIS_STATO_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_V_LIS_STATO_SERIE")
@NamedQuery(name = "SerVLisStatoSerie.findAll", query = "SELECT s FROM SerVLisStatoSerie s")
public class SerVLisStatoSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private String dsAzione;
    private String dsNotaAzione;
    private Date dtRegStatoVerSerie;
    private BigDecimal idStatoVerSerie;
    private BigDecimal idUserIam;
    private BigDecimal idVerSerie;
    private String nmUserid;
    private BigDecimal pgStatoVerSerie;
    private String tiStatoVerSerie;

    public SerVLisStatoSerie() {
    }

    @Column(name = "DS_AZIONE")
    public String getDsAzione() {
        return this.dsAzione;
    }

    public void setDsAzione(String dsAzione) {
        this.dsAzione = dsAzione;
    }

    @Column(name = "DS_NOTA_AZIONE")
    public String getDsNotaAzione() {
        return this.dsNotaAzione;
    }

    public void setDsNotaAzione(String dsNotaAzione) {
        this.dsNotaAzione = dsNotaAzione;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_STATO_VER_SERIE")
    public Date getDtRegStatoVerSerie() {
        return this.dtRegStatoVerSerie;
    }

    public void setDtRegStatoVerSerie(Date dtRegStatoVerSerie) {
        this.dtRegStatoVerSerie = dtRegStatoVerSerie;
    }

    @Id
    @Column(name = "ID_STATO_VER_SERIE")
    public BigDecimal getIdStatoVerSerie() {
        return this.idStatoVerSerie;
    }

    public void setIdStatoVerSerie(BigDecimal idStatoVerSerie) {
        this.idStatoVerSerie = idStatoVerSerie;
    }

    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

    @Column(name = "NM_USERID")
    public String getNmUserid() {
        return this.nmUserid;
    }

    public void setNmUserid(String nmUserid) {
        this.nmUserid = nmUserid;
    }

    @Column(name = "PG_STATO_VER_SERIE")
    public BigDecimal getPgStatoVerSerie() {
        return this.pgStatoVerSerie;
    }

    public void setPgStatoVerSerie(BigDecimal pgStatoVerSerie) {
        this.pgStatoVerSerie = pgStatoVerSerie;
    }

    @Column(name = "TI_STATO_VER_SERIE")
    public String getTiStatoVerSerie() {
        return this.tiStatoVerSerie;
    }

    public void setTiStatoVerSerie(String tiStatoVerSerie) {
        this.tiStatoVerSerie = tiStatoVerSerie;
    }

}