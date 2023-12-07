package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CHK_UD_ANNUL_ENTE database table.
 */
@Entity
@Table(name = "MON_V_CHK_UD_ANNUL_ENTE")
@NamedQuery(name = "MonVChkUdAnnulEnte.findAll", query = "SELECT m FROM MonVChkUdAnnulEnte m")
public class MonVChkUdAnnulEnte implements Serializable {

    private static final long serialVersionUID = 1L;

    private String flUdAnnul;

    private String flUdAnnulDafarePing;

    private String flUdAnnulDafareSacer;

    public MonVChkUdAnnulEnte() {/* Hibernate */
    }

    @Column(name = "FL_UD_ANNUL", columnDefinition = "char(1)")
    public String getFlUdAnnul() {
        return this.flUdAnnul;
    }

    public void setFlUdAnnul(String flUdAnnul) {
        this.flUdAnnul = flUdAnnul;
    }

    @Column(name = "FL_UD_ANNUL_DAFARE_PING", columnDefinition = "char(1)")
    public String getFlUdAnnulDafarePing() {
        return this.flUdAnnulDafarePing;
    }

    public void setFlUdAnnulDafarePing(String flUdAnnulDafarePing) {
        this.flUdAnnulDafarePing = flUdAnnulDafarePing;
    }

    @Column(name = "FL_UD_ANNUL_DAFARE_SACER", columnDefinition = "char(1)")
    public String getFlUdAnnulDafareSacer() {
        return this.flUdAnnulDafareSacer;
    }

    public void setFlUdAnnulDafareSacer(String flUdAnnulDafareSacer) {
        this.flUdAnnulDafareSacer = flUdAnnulDafareSacer;
    }

    private MonVChkUdAnnulEnteId monVChkUdAnnulEnteId;

    @EmbeddedId()
    public MonVChkUdAnnulEnteId getMonVChkUdAnnulEnteId() {
        return monVChkUdAnnulEnteId;
    }

    public void setMonVChkUdAnnulEnteId(MonVChkUdAnnulEnteId monVChkUdAnnulEnteId) {
        this.monVChkUdAnnulEnteId = monVChkUdAnnulEnteId;
    }
}
