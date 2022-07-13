package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CHK_DOC_STRUT database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_DOC_STRUT")
@NamedQuery(name = "MonVChkDocStrut.findAll", query = "SELECT m FROM MonVChkDocStrut m")
public class MonVChkDocStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flDoc30gg;
    private String flDocAttesaMem30gg;
    private String flDocAttesaMemCorr;
    private String flDocAttesaSched30gg;
    private String flDocAttesaSchedCorr;
    private String flDocCorr;
    private String flDocNoselSched30gg;
    private String flDocNoselSchedCorr;
    private BigDecimal idStrut;

    public MonVChkDocStrut() {
    }

    @Column(name = "FL_DOC_30GG")
    public String getFlDoc30gg() {
        return this.flDoc30gg;
    }

    public void setFlDoc30gg(String flDoc30gg) {
        this.flDoc30gg = flDoc30gg;
    }

    @Column(name = "FL_DOC_ATTESA_MEM_30GG")
    public String getFlDocAttesaMem30gg() {
        return this.flDocAttesaMem30gg;
    }

    public void setFlDocAttesaMem30gg(String flDocAttesaMem30gg) {
        this.flDocAttesaMem30gg = flDocAttesaMem30gg;
    }

    @Column(name = "FL_DOC_ATTESA_MEM_CORR")
    public String getFlDocAttesaMemCorr() {
        return this.flDocAttesaMemCorr;
    }

    public void setFlDocAttesaMemCorr(String flDocAttesaMemCorr) {
        this.flDocAttesaMemCorr = flDocAttesaMemCorr;
    }

    @Column(name = "FL_DOC_ATTESA_SCHED_30GG")
    public String getFlDocAttesaSched30gg() {
        return this.flDocAttesaSched30gg;
    }

    public void setFlDocAttesaSched30gg(String flDocAttesaSched30gg) {
        this.flDocAttesaSched30gg = flDocAttesaSched30gg;
    }

    @Column(name = "FL_DOC_ATTESA_SCHED_CORR")
    public String getFlDocAttesaSchedCorr() {
        return this.flDocAttesaSchedCorr;
    }

    public void setFlDocAttesaSchedCorr(String flDocAttesaSchedCorr) {
        this.flDocAttesaSchedCorr = flDocAttesaSchedCorr;
    }

    @Column(name = "FL_DOC_CORR")
    public String getFlDocCorr() {
        return this.flDocCorr;
    }

    public void setFlDocCorr(String flDocCorr) {
        this.flDocCorr = flDocCorr;
    }

    @Column(name = "FL_DOC_NOSEL_SCHED_30GG")
    public String getFlDocNoselSched30gg() {
        return this.flDocNoselSched30gg;
    }

    public void setFlDocNoselSched30gg(String flDocNoselSched30gg) {
        this.flDocNoselSched30gg = flDocNoselSched30gg;
    }

    @Column(name = "FL_DOC_NOSEL_SCHED_CORR")
    public String getFlDocNoselSchedCorr() {
        return this.flDocNoselSchedCorr;
    }

    public void setFlDocNoselSchedCorr(String flDocNoselSchedCorr) {
        this.flDocNoselSchedCorr = flDocNoselSchedCorr;
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