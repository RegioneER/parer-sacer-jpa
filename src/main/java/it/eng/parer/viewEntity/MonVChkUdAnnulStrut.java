package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CHK_UD_ANNUL_STRUT database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_UD_ANNUL_STRUT")
@NamedQuery(name = "MonVChkUdAnnulStrut.findAll", query = "SELECT m FROM MonVChkUdAnnulStrut m")
public class MonVChkUdAnnulStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flUdAnnul;
    private String flUdAnnulDafarePing;
    private String flUdAnnulDafareSacer;
    private BigDecimal idStrut;

    public MonVChkUdAnnulStrut() {/* Hibernate */
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

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

}
