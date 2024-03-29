package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CHK_DOC_NONVERS_ENTE database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_DOC_NONVERS_ENTE")
@NamedQuery(name = "MonVChkDocNonversEnte.findAll", query = "SELECT m FROM MonVChkDocNonversEnte m")
public class MonVChkDocNonversEnte implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flDocNonversNorisolub;
    private String flDocNonversNoverif;
    private String flDocNonversVerif;
    private MonVChkDocNonversEnteId monVChkDocNonversEnteId;

    @EmbeddedId
    public MonVChkDocNonversEnteId getMonVChkDocNonversEnteId() {
        return monVChkDocNonversEnteId;
    }

    public void setMonVChkDocNonversEnteId(MonVChkDocNonversEnteId monVChkDocNonversEnteId) {
        this.monVChkDocNonversEnteId = monVChkDocNonversEnteId;
    }

    public MonVChkDocNonversEnte() {/* Hibernate */
    }

    @Column(name = "FL_DOC_NONVERS_NORISOLUB", columnDefinition = "char(1)")
    public String getFlDocNonversNorisolub() {
        return this.flDocNonversNorisolub;
    }

    public void setFlDocNonversNorisolub(String flDocNonversNorisolub) {
        this.flDocNonversNorisolub = flDocNonversNorisolub;
    }

    @Column(name = "FL_DOC_NONVERS_NOVERIF", columnDefinition = "char(1)")
    public String getFlDocNonversNoverif() {
        return this.flDocNonversNoverif;
    }

    public void setFlDocNonversNoverif(String flDocNonversNoverif) {
        this.flDocNonversNoverif = flDocNonversNoverif;
    }

    @Column(name = "FL_DOC_NONVERS_VERIF", columnDefinition = "char(1)")
    public String getFlDocNonversVerif() {
        return this.flDocNonversVerif;
    }

    public void setFlDocNonversVerif(String flDocNonversVerif) {
        this.flDocNonversVerif = flDocNonversVerif;
    }
}
