package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_FASC_BY_STRUT database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_FASC_BY_STRUT")
@NamedQuery(name = "MonVCntFascByStrut.findByStrutUserId", query = "SELECT m FROM MonVCntFascByStrut m WHERE m.idStrut = :idStrut AND m.idUserIam=:idUserIam")
public class MonVCntFascByStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idStrut;
    private BigDecimal niFasc;
    private String tiDtCreazione;
    private String tiStatoFasc;
    private BigDecimal idUserIam;

    public MonVCntFascByStrut() {
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_FASC")
    public BigDecimal getNiFasc() {
        return this.niFasc;
    }

    public void setNiFasc(BigDecimal niFasc) {
        this.niFasc = niFasc;
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
    @Column(name = "TI_STATO_FASC")
    public String getTiStatoFasc() {
        return this.tiStatoFasc;
    }

    public void setTiStatoFasc(String tiStatoFasc) {
        this.tiStatoFasc = tiStatoFasc;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

}
