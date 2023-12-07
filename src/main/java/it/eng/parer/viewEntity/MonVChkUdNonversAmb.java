package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CHK_UD_NONVERS_AMB database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_UD_NONVERS_AMB")
@NamedQuery(name = "MonVChkUdNonversAmb.findAll", query = "SELECT m FROM MonVChkUdNonversAmb m")
public class MonVChkUdNonversAmb implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flUdNonversNorisolub;
    private String flUdNonversNoverif;
    private String flUdNonversVerif;
    private MonVChkUdNonversAmbId monVChkUdNonversAmbId;

    @EmbeddedId
    public MonVChkUdNonversAmbId getMonVChkUdNonversAmbId() {
        return monVChkUdNonversAmbId;
    }

    public void setMonVChkUdNonversAmbId(MonVChkUdNonversAmbId monVChkUdNonversAmbId) {
        this.monVChkUdNonversAmbId = monVChkUdNonversAmbId;
    }

    public MonVChkUdNonversAmb() {/* Hibernate */
    }

    @Column(name = "FL_UD_NONVERS_NORISOLUB", columnDefinition = "char(1)")
    public String getFlUdNonversNorisolub() {
        return this.flUdNonversNorisolub;
    }

    public void setFlUdNonversNorisolub(String flUdNonversNorisolub) {
        this.flUdNonversNorisolub = flUdNonversNorisolub;
    }

    @Column(name = "FL_UD_NONVERS_NOVERIF", columnDefinition = "char(1)")
    public String getFlUdNonversNoverif() {
        return this.flUdNonversNoverif;
    }

    public void setFlUdNonversNoverif(String flUdNonversNoverif) {
        this.flUdNonversNoverif = flUdNonversNoverif;
    }

    @Column(name = "FL_UD_NONVERS_VERIF", columnDefinition = "char(1)")
    public String getFlUdNonversVerif() {
        return this.flUdNonversVerif;
    }

    public void setFlUdNonversVerif(String flUdNonversVerif) {
        this.flUdNonversVerif = flUdNonversVerif;
    }

}
