package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_V_LIS_UD_BY_STATO database table.
 *
 */
@Entity
@Table(name = "ELV_V_LIS_UD_BY_STATO")
@NamedQuery(name = "ElvVLisUdByStato.findAll", query = "SELECT e FROM ElvVLisUdByStato e")
public class ElvVLisUdByStato implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idElencoVers;
    private BigDecimal idUnitaDoc;
    private String tiStatoElencoVers;
    private String tiMotivo;
    private String tiStatoUd;
    private Date tsLastResetStato;

    public ElvVLisUdByStato() {
    }

    @Column(name = "TI_STATO_ELENCO_VERS")
    public String getTiStatoElencoVers() {
        return this.tiStatoElencoVers;
    }

    public void setTiStatoElencoVers(String tiStatoElencoVers) {
        this.tiStatoElencoVers = tiStatoElencoVers;
    }

    @Column(name = "ID_ELENCO_VERS")
    public BigDecimal getIdElencoVers() {
        return this.idElencoVers;
    }

    public void setIdElencoVers(BigDecimal idElencoVers) {
        this.idElencoVers = idElencoVers;
    }

    @Column(name = "TI_MOTIVO")
    public String getTiMotivo() {
        return this.tiMotivo;
    }

    public void setTiMotivo(String tiMotivo) {
        this.tiMotivo = tiMotivo;
    }

    @Id
    @Column(name = "ID_UNITA_DOC")
    public BigDecimal getIdUnitaDoc() {
        return this.idUnitaDoc;
    }

    public void setIdUnitaDoc(BigDecimal idUnitaDoc) {
        this.idUnitaDoc = idUnitaDoc;
    }

    @Column(name = "TI_STATO_UD")
    public String getTiStatoUd() {
        return this.tiStatoUd;
    }

    public void setTiStatoUd(String tiStatoUd) {
        this.tiStatoUd = tiStatoUd;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_LAST_RESET_STATO")
    public Date getTsLastResetStato() {
        return this.tsLastResetStato;
    }

    public void setTsLastResetStato(Date tsLastResetStato) {
        this.tsLastResetStato = tsLastResetStato;
    }

}
