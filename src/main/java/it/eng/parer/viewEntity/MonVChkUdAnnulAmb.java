package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CHK_UD_ANNUL_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_UD_ANNUL_AMB")
@NamedQuery(name = "MonVChkUdAnnulAmb.findAll", query = "SELECT m FROM MonVChkUdAnnulAmb m")
public class MonVChkUdAnnulAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flUdAnnul;
    private String flUdAnnulDafarePing;
    private String flUdAnnulDafareSacer;
    private BigDecimal idAmbiente;
    private BigDecimal idUserIam;

    public MonVChkUdAnnulAmb() {
    }

    @Column(name = "FL_UD_ANNUL")
    public String getFlUdAnnul() {
        return this.flUdAnnul;
    }

    public void setFlUdAnnul(String flUdAnnul) {
        this.flUdAnnul = flUdAnnul;
    }

    @Column(name = "FL_UD_ANNUL_DAFARE_PING")
    public String getFlUdAnnulDafarePing() {
        return this.flUdAnnulDafarePing;
    }

    public void setFlUdAnnulDafarePing(String flUdAnnulDafarePing) {
        this.flUdAnnulDafarePing = flUdAnnulDafarePing;
    }

    @Column(name = "FL_UD_ANNUL_DAFARE_SACER")
    public String getFlUdAnnulDafareSacer() {
        return this.flUdAnnulDafareSacer;
    }

    public void setFlUdAnnulDafareSacer(String flUdAnnulDafareSacer) {
        this.flUdAnnulDafareSacer = flUdAnnulDafareSacer;
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

}