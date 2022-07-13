package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_FASC_KO_BY_AMB database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_FASC_KO_BY_AMB")
@NamedQuery(name = "MonVCntFascKoByAmb.findByAmbUser", query = "SELECT m FROM MonVCntFascKoByAmb m WHERE m.idAmbiente = :idAmbiente AND m.idUserIam = :idUser")
public class MonVCntFascKoByAmb implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idAmbiente;
    private BigDecimal idUserIam;
    private BigDecimal niFascKo;
    private String tiDtCreazione;
    private String tiStatoFascKo;

    public MonVCntFascKoByAmb() {
    }

    @Id
    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
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

}
