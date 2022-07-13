package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CHK_AGG_STRUT database table.
 * 
 */
@Entity
@Table(name = "MON_V_CHK_AGG_STRUT")
@NamedQuery(name = "MonVChkAggStrut.findAll", query = "SELECT m FROM MonVChkAggStrut m")
public class MonVChkAggStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flAggNorisolub30gg;
    private String flAggNorisolubCorr;
    private String flAggNoverif30gg;
    private String flAggNoverifCorr;
    private String flAggRisolti30gg;
    private String flAggRisoltiCorr;
    private String flAggVerif30gg;
    private String flAggVerifCorr;
    private BigDecimal idStrut;

    public MonVChkAggStrut() {
    }

    @Column(name = "FL_AGG_NORISOLUB_30GG")
    public String getFlAggNorisolub30gg() {
        return this.flAggNorisolub30gg;
    }

    public void setFlAggNorisolub30gg(String flAggNorisolub30gg) {
        this.flAggNorisolub30gg = flAggNorisolub30gg;
    }

    @Column(name = "FL_AGG_NORISOLUB_CORR")
    public String getFlAggNorisolubCorr() {
        return this.flAggNorisolubCorr;
    }

    public void setFlAggNorisolubCorr(String flAggNorisolubCorr) {
        this.flAggNorisolubCorr = flAggNorisolubCorr;
    }

    @Column(name = "FL_AGG_NOVERIF_30GG")
    public String getFlAggNoverif30gg() {
        return this.flAggNoverif30gg;
    }

    public void setFlAggNoverif30gg(String flAggNoverif30gg) {
        this.flAggNoverif30gg = flAggNoverif30gg;
    }

    @Column(name = "FL_AGG_NOVERIF_CORR")
    public String getFlAggNoverifCorr() {
        return this.flAggNoverifCorr;
    }

    public void setFlAggNoverifCorr(String flAggNoverifCorr) {
        this.flAggNoverifCorr = flAggNoverifCorr;
    }

    @Column(name = "FL_AGG_RISOLTI_30GG")
    public String getFlAggRisolti30gg() {
        return this.flAggRisolti30gg;
    }

    public void setFlAggRisolti30gg(String flAggRisolti30gg) {
        this.flAggRisolti30gg = flAggRisolti30gg;
    }

    @Column(name = "FL_AGG_RISOLTI_CORR")
    public String getFlAggRisoltiCorr() {
        return this.flAggRisoltiCorr;
    }

    public void setFlAggRisoltiCorr(String flAggRisoltiCorr) {
        this.flAggRisoltiCorr = flAggRisoltiCorr;
    }

    @Column(name = "FL_AGG_VERIF_30GG")
    public String getFlAggVerif30gg() {
        return this.flAggVerif30gg;
    }

    public void setFlAggVerif30gg(String flAggVerif30gg) {
        this.flAggVerif30gg = flAggVerif30gg;
    }

    @Column(name = "FL_AGG_VERIF_CORR")
    public String getFlAggVerifCorr() {
        return this.flAggVerifCorr;
    }

    public void setFlAggVerifCorr(String flAggVerifCorr) {
        this.flAggVerifCorr = flAggVerifCorr;
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