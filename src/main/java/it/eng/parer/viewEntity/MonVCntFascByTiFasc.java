package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_FASC_BY_TI_FASC database table.
 *
 */
@Entity
@Table(name = "MON_V_CNT_FASC_BY_TI_FASC")
@NamedQuery(name = "MonVCntFascByTiFasc.findByTiFasc", query = "SELECT m FROM MonVCntFascByTiFasc m WHERE m.idTipoFascicolo = :idTipoFascicolo")
public class MonVCntFascByTiFasc implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idTipoFascicolo;
    private BigDecimal niFasc;
    private String tiDtCreazione;
    private String tiStatoFasc;

    public MonVCntFascByTiFasc() {
    }

    @Id
    @Column(name = "ID_TIPO_FASCICOLO")
    public BigDecimal getIdTipoFascicolo() {
        return this.idTipoFascicolo;
    }

    public void setIdTipoFascicolo(BigDecimal idTipoFascicolo) {
        this.idTipoFascicolo = idTipoFascicolo;
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

}
