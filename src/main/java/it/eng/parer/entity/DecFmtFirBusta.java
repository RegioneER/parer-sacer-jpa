package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_FMT_FIR_BUSTA database table.
 * 
 */
@Entity
@Table(name = "DEC_FMT_FIR_BUSTA")
@NamedQuery(name = "DecFmtFirBusta.findAll", query = "SELECT d FROM DecFmtFirBusta d")
public class DecFmtFirBusta implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFmtFirBusta;
    private String dsFormato;
    private String tiFormato;

    public DecFmtFirBusta() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FMT_FIR_BUSTA")
    public long getIdFmtFirBusta() {
        return this.idFmtFirBusta;
    }

    public void setIdFmtFirBusta(long idFmtFirBusta) {
        this.idFmtFirBusta = idFmtFirBusta;
    }

    @Column(name = "DS_FORMATO")
    public String getDsFormato() {
        return this.dsFormato;
    }

    public void setDsFormato(String dsFormato) {
        this.dsFormato = dsFormato;
    }

    @Column(name = "TI_FORMATO")
    public String getTiFormato() {
        return this.tiFormato;
    }

    public void setTiFormato(String tiFormato) {
        this.tiFormato = tiFormato;
    }

}