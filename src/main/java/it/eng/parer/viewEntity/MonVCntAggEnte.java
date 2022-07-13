package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_AGG_ENTE database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_AGG_ENTE")
@NamedQuery(name = "MonVCntAggEnte.findAll", query = "SELECT m FROM MonVCntAggEnte m")
public class MonVCntAggEnte implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idEnte;
    private BigDecimal idUserIam;
    private BigDecimal niAgg;
    private String tiDtCreazione;
    private String tiStatoVers;

    public MonVCntAggEnte() {
    }

    @Id
    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "NI_AGG")
    public BigDecimal getNiAgg() {
        return this.niAgg;
    }

    public void setNiAgg(BigDecimal niAgg) {
        this.niAgg = niAgg;
    }

    @Id
    @Column(name = "TI_DT_CREAZIONE")
    public String getTiDtCreazione() {
        return this.tiDtCreazione;
    }

    public void setTiDtCreazione(String tiDtCreazione) {
        this.tiDtCreazione = tiDtCreazione;
    }

    @Id
    @Column(name = "TI_STATO_VERS")
    public String getTiStatoVers() {
        return this.tiStatoVers;
    }

    public void setTiStatoVers(String tiStatoVers) {
        this.tiStatoVers = tiStatoVers;
    }

}