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
 * The persistent class for the DEC_VAL_VOCE_TITOL database table.
 * 
 */
@Entity
@Table(name = "DEC_VAL_VOCE_TITOL")
public class DecValVoceTitol implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idValVoceTitol;
    private String dlNote;
    private String dsVoceTitol;
    private Date dtFinVal;
    private Date dtIniVal;
    private String flUsoClassif;
    private BigDecimal niAnniConserv;
    private DecVoceTitol decVoceTitol;

    public DecValVoceTitol() {
    }

    @Id
    @SequenceGenerator(name = "DEC_VAL_VOCE_TITOL_IDVALVOCETITOL_GENERATOR", sequenceName = "SDEC_VAL_VOCE_TITOL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_VAL_VOCE_TITOL_IDVALVOCETITOL_GENERATOR")
    @Column(name = "ID_VAL_VOCE_TITOL")
    public long getIdValVoceTitol() {
        return this.idValVoceTitol;
    }

    public void setIdValVoceTitol(long idValVoceTitol) {
        this.idValVoceTitol = idValVoceTitol;
    }

    @Column(name = "DL_NOTE")
    public String getDlNote() {
        return this.dlNote;
    }

    public void setDlNote(String dlNote) {
        this.dlNote = dlNote;
    }

    @Column(name = "DS_VOCE_TITOL")
    public String getDsVoceTitol() {
        return this.dsVoceTitol;
    }

    public void setDsVoceTitol(String dsVoceTitol) {
        this.dsVoceTitol = dsVoceTitol;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIN_VAL")
    public Date getDtFinVal() {
        return this.dtFinVal;
    }

    public void setDtFinVal(Date dtFinVal) {
        this.dtFinVal = dtFinVal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL")
    public Date getDtIniVal() {
        return this.dtIniVal;
    }

    public void setDtIniVal(Date dtIniVal) {
        this.dtIniVal = dtIniVal;
    }

    @Column(name = "FL_USO_CLASSIF")
    public String getFlUsoClassif() {
        return this.flUsoClassif;
    }

    public void setFlUsoClassif(String flUsoClassif) {
        this.flUsoClassif = flUsoClassif;
    }

    @Column(name = "NI_ANNI_CONSERV")
    public BigDecimal getNiAnniConserv() {
        return this.niAnniConserv;
    }

    public void setNiAnniConserv(BigDecimal niAnniConserv) {
        this.niAnniConserv = niAnniConserv;
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

}