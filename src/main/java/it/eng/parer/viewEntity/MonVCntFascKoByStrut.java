package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_FASC_KO_BY_STRUT database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_FASC_KO_BY_STRUT")
@NamedQuery(name = "MonVCntFascKoByStrut.findByStrutUserId", query = "SELECT m FROM MonVCntFascKoByStrut m WHERE m.idStrut=:idStrut AND m.idUserIam=:idUserIam")
public class MonVCntFascKoByStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idStrut;
    private BigDecimal niFascKo;
    private String tiDtCreazione;
    private String tiStatoFascKo;
    private BigDecimal idUserIam;

    public MonVCntFascKoByStrut() {
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NI_FASC_KO")
    public BigDecimal getNiFascKo() {
        return this.niFascKo;
    }

    public void setNiFascKo(BigDecimal niFascKo) {
        this.niFascKo = niFascKo;
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
    @Column(name = "TI_STATO_FASC_KO")
    public String getTiStatoFascKo() {
        return this.tiStatoFascKo;
    }

    public void setTiStatoFascKo(String tiStatoFascKo) {
        this.tiStatoFascKo = tiStatoFascKo;
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
