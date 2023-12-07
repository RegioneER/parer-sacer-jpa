package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ELV_V_LIS_FASC_ANNUL_BY_ELENCO database table.
 *
 */
@Entity
@Table(name = "ELV_V_LIS_FASC_ANNUL_BY_ELENCO")
@NamedQuery(name = "ElvVLisFascAnnulByElenco.findAll", query = "SELECT e FROM ElvVLisFascAnnulByElenco e")
public class ElvVLisFascAnnulByElenco implements Serializable {

    private static final long serialVersionUID = 1L;
    private String dsUrnFascicoloAnnul;
    private BigDecimal idElencoVersFasc;
    private BigDecimal idFascicolo;
    private BigDecimal idRichAnnulVers;

    public ElvVLisFascAnnulByElenco() {/* Hibernate */
    }

    @Column(name = "DS_URN_FASCICOLO_ANNUL")
    public String getDsUrnFascicoloAnnul() {
        return this.dsUrnFascicoloAnnul;
    }

    public void setDsUrnFascicoloAnnul(String dsUrnFascicoloAnnul) {
        this.dsUrnFascicoloAnnul = dsUrnFascicoloAnnul;
    }

    @Column(name = "ID_ELENCO_VERS_FASC")
    public BigDecimal getIdElencoVersFasc() {
        return this.idElencoVersFasc;
    }

    public void setIdElencoVersFasc(BigDecimal idElencoVersFasc) {
        this.idElencoVersFasc = idElencoVersFasc;
    }

    @Id
    @Column(name = "ID_FASCICOLO")
    public BigDecimal getIdFascicolo() {
        return this.idFascicolo;
    }

    public void setIdFascicolo(BigDecimal idFascicolo) {
        this.idFascicolo = idFascicolo;
    }

    @Column(name = "ID_RICH_ANNUL_VERS")
    public BigDecimal getIdRichAnnulVers() {
        return this.idRichAnnulVers;
    }

    public void setIdRichAnnulVers(BigDecimal idRichAnnulVers) {
        this.idRichAnnulVers = idRichAnnulVers;
    }

}
