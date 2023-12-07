package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_CHK_CONSERVAZIONE_UD database table.
 * 
 */
@Entity
@Table(name = "SER_V_CHK_CONSERVAZIONE_UD")
@NamedQuery(name = "SerVChkConservazioneUd.findAll", query = "SELECT s FROM SerVChkConservazioneUd s")
public class SerVChkConservazioneUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flOkStatoConservazione;
    private BigDecimal idVerSerie;

    public SerVChkConservazioneUd() {/* Hibernate */
    }

    @Column(name = "FL_OK_STATO_CONSERVAZIONE", columnDefinition = "char(1)")
    public String getFlOkStatoConservazione() {
        return this.flOkStatoConservazione;
    }

    public void setFlOkStatoConservazione(String flOkStatoConservazione) {
        this.flOkStatoConservazione = flOkStatoConservazione;
    }

    @Id
    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

}
