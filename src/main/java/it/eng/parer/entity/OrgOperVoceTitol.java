package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ORG_OPER_VOCE_TITOL database table.
 * 
 */
@Entity
@Table(name = "ORG_OPER_VOCE_TITOL")
public class OrgOperVoceTitol implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idOperVoceTitol;
    private String dlNote;
    private Date dtValOperVoceTitol;
    private BigDecimal pgOperVoceTitol;
    private String tiOperVoceTitol;
    private DecVoceTitol decVoceTitol;
    private OrgOperTitol orgOperTitol;

    public OrgOperVoceTitol() {
    }

    @Id
    @SequenceGenerator(name = "ORG_OPER_VOCE_TITOL_IDOPERVOCETITOL_GENERATOR", sequenceName = "SORG_OPER_VOCE_TITOL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_OPER_VOCE_TITOL_IDOPERVOCETITOL_GENERATOR")
    @Column(name = "ID_OPER_VOCE_TITOL")
    public long getIdOperVoceTitol() {
        return this.idOperVoceTitol;
    }

    public void setIdOperVoceTitol(long idOperVoceTitol) {
        this.idOperVoceTitol = idOperVoceTitol;
    }

    @Column(name = "DL_NOTE")
    public String getDlNote() {
        return this.dlNote;
    }

    public void setDlNote(String dlNote) {
        this.dlNote = dlNote;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VAL_OPER_VOCE_TITOL")
    public Date getDtValOperVoceTitol() {
        return this.dtValOperVoceTitol;
    }

    public void setDtValOperVoceTitol(Date dtValOperVoceTitol) {
        this.dtValOperVoceTitol = dtValOperVoceTitol;
    }

    @Column(name = "PG_OPER_VOCE_TITOL")
    public BigDecimal getPgOperVoceTitol() {
        return this.pgOperVoceTitol;
    }

    public void setPgOperVoceTitol(BigDecimal pgOperVoceTitol) {
        this.pgOperVoceTitol = pgOperVoceTitol;
    }

    @Column(name = "TI_OPER_VOCE_TITOL")
    public String getTiOperVoceTitol() {
        return this.tiOperVoceTitol;
    }

    public void setTiOperVoceTitol(String tiOperVoceTitol) {
        this.tiOperVoceTitol = tiOperVoceTitol;
    }

    // bi-directional many-to-one association to DecVoceTitol
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VOCE_TITOL")
    public DecVoceTitol getDecVoceTitol() {
        return this.decVoceTitol;
    }

    public void setDecVoceTitol(DecVoceTitol decVoceTitol) {
        this.decVoceTitol = decVoceTitol;
    }

    // bi-directional many-to-one association to OrgOperTitol
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_OPER_TITOL")
    public OrgOperTitol getOrgOperTitol() {
        return this.orgOperTitol;
    }

    public void setOrgOperTitol(OrgOperTitol orgOperTitol) {
        this.orgOperTitol = orgOperTitol;
    }

}