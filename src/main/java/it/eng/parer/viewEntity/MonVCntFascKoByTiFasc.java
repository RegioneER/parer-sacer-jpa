package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_FASC_KO_BY_TI_FASC database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_FASC_KO_BY_TI_FASC")
@NamedQuery(name = "MonVCntFascKoByTiFasc.findByTiFasc", query = "SELECT m FROM MonVCntFascKoByTiFasc m WHERE m.idTipoFascicolo = :idTipoFascicolo")
public class MonVCntFascKoByTiFasc implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idTipoFascicolo;
    private BigDecimal niFascKo;
    private String tiDtCreazione;
    private String tiStatoFascKo;

    public MonVCntFascKoByTiFasc() {
    }

    @Id
    @Column(name = "ID_TIPO_FASCICOLO")
    public BigDecimal getIdTipoFascicolo() {
        return this.idTipoFascicolo;
    }

    public void setIdTipoFascicolo(BigDecimal idTipoFascicolo) {
        this.idTipoFascicolo = idTipoFascicolo;
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
