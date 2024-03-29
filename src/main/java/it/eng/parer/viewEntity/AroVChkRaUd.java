package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

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

    public AroVChkRaUd() {/* Hibernate */
    }

    @Column(name = "FL_UD_NON_IN_ELENCO", columnDefinition = "number")
    public String getFlUdNonInElenco() {
        return this.flUdNonInElenco;
    }

    public void setFlUdNonInElenco(String flUdNonInElenco) {
        this.flUdNonInElenco = flUdNonInElenco;
    }

    @Column(name = "FL_ELENCO_NON_COMPLETATO", columnDefinition = "number")
    public String getFlElencoNonCompletato() {
        return this.flElencoNonCompletato;
    }

    public void setFlElencoNonCompletato(String flElencoNonCompletato) {
        this.flElencoNonCompletato = flElencoNonCompletato;
    }

    @Column(name = "FL_ELENCO_NON_FIRMATO", columnDefinition = "number")
    public String getFlElencoNonFirmato() {
        return flElencoNonFirmato;
    }

    public void setFlElencoNonFirmato(String flElencoNonFirmato) {
        this.flElencoNonFirmato = flElencoNonFirmato;
    }

    @Column(name = "FL_AIP_NON_FIRMATO", columnDefinition = "number")
    public String getFlAipNonFirmato() {
        return flAipNonFirmato;
    }

    public void setFlAipNonFirmato(String flAipNonFirmato) {
        this.flAipNonFirmato = flAipNonFirmato;
    }

    private AroVChkRaUdId aroVChkRaUdId;

    @EmbeddedId()
    public AroVChkRaUdId getAroVChkRaUdId() {
        return aroVChkRaUdId;
    }

    public void setAroVChkRaUdId(AroVChkRaUdId aroVChkRaUdId) {
        this.aroVChkRaUdId = aroVChkRaUdId;
    }

}
