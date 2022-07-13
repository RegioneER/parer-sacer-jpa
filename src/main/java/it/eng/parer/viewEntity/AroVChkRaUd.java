package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_V_CHK_RA_UD database table.
 *
 */
@Entity
@Table(name = "ARO_V_CHK_RA_UD")
@NamedQuery(name = "AroVChkRaUd.findAll", query = "SELECT e FROM AroVChkRaUd e")
public class AroVChkRaUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flUdNonInElenco;
    private String flElencoNonCompletato;
    private String flElencoNonFirmato;
    private String flAipNonFirmato;
    private BigDecimal idEnteConvenz;

    public AroVChkRaUd() {
    }

    @Column(name = "FL_UD_NON_IN_ELENCO")
    public String getFlUdNonInElenco() {
        return this.flUdNonInElenco;
    }

    public void setFlUdNonInElenco(String flUdNonInElenco) {
        this.flUdNonInElenco = flUdNonInElenco;
    }

    @Column(name = "FL_ELENCO_NON_COMPLETATO")
    public String getFlElencoNonCompletato() {
        return this.flElencoNonCompletato;
    }

    public void setFlElencoNonCompletato(String flElencoNonCompletato) {
        this.flElencoNonCompletato = flElencoNonCompletato;
    }

    @Column(name = "FL_ELENCO_NON_FIRMATO")
    public String getFlElencoNonFirmato() {
        return flElencoNonFirmato;
    }

    public void setFlElencoNonFirmato(String flElencoNonFirmato) {
        this.flElencoNonFirmato = flElencoNonFirmato;
    }

    @Column(name = "FL_AIP_NON_FIRMATO")
    public String getFlAipNonFirmato() {
        return flAipNonFirmato;
    }

    public void setFlAipNonFirmato(String flAipNonFirmato) {
        this.flAipNonFirmato = flAipNonFirmato;
    }

    @Id
    @Column(name = "ID_ENTE_CONVENZ")
    public BigDecimal getIdEnteConvenz() {
        return this.idEnteConvenz;
    }

    public void setIdEnteConvenz(BigDecimal idEnteConvenz) {
        this.idEnteConvenz = idEnteConvenz;
    }

}
