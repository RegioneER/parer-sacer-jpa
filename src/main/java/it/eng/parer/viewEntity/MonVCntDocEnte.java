package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_DOC_ENTE database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_ENTE")
@NamedQuery(name = "MonVCntDocEnte.findAll", query = "SELECT m FROM MonVCntDocEnte m")
public class MonVCntDocEnte implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idEnte;
    private BigDecimal idUserIam;
    private BigDecimal niDoc;
    private String tiDtCreazione;
    private String tiStatoDoc;

    public MonVCntDocEnte() {
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

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
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
    @Column(name = "TI_STATO_DOC")
    public String getTiStatoDoc() {
        return this.tiStatoDoc;
    }

    public void setTiStatoDoc(String tiStatoDoc) {
        this.tiStatoDoc = tiStatoDoc;
    }

}