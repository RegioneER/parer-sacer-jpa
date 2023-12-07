package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the MON_V_CHK_VERS_AMB database table.
 */
@Entity
@Table(name = "MON_V_CHK_VERS_AMB")
@NamedQuery(name = "MonVChkVersAmb.findAll", query = "SELECT m FROM MonVChkVersAmb m")
public class MonVChkVersAmb implements Serializable {

    private static final long serialVersionUID = 1L;

    private String flVersNorisolub30gg;

    private String flVersNorisolubCorr;

    private String flVersNoverif30gg;

    private String flVersNoverifCorr;

    private String flVersRisolti30gg;

    private String flVersRisoltiCorr;

    private String flVersVerif30gg;

    private String flVersVerifCorr;

    public MonVChkVersAmb() {/* Hibernate */
    }

    @Column(name = "FL_VERS_NORISOLUB_30GG", columnDefinition = "char")
    public String getFlVersNorisolub30gg() {
        return this.flVersNorisolub30gg;
    }

    public void setFlVersNorisolub30gg(String flVersNorisolub30gg) {
        this.flVersNorisolub30gg = flVersNorisolub30gg;
    }

    @Column(name = "FL_VERS_NORISOLUB_CORR", columnDefinition = "char(1)")
    public String getFlVersNorisolubCorr() {
        return this.flVersNorisolubCorr;
    }

    public void setFlVersNorisolubCorr(String flVersNorisolubCorr) {
        this.flVersNorisolubCorr = flVersNorisolubCorr;
    }

    @Column(name = "FL_VERS_NOVERIF_30GG", columnDefinition = "char")
    public String getFlVersNoverif30gg() {
        return this.flVersNoverif30gg;
    }

    public void setFlVersNoverif30gg(String flVersNoverif30gg) {
        this.flVersNoverif30gg = flVersNoverif30gg;
    }

    @Column(name = "FL_VERS_NOVERIF_CORR", columnDefinition = "char(1)")
    public String getFlVersNoverifCorr() {
        return this.flVersNoverifCorr;
    }

    public void setFlVersNoverifCorr(String flVersNoverifCorr) {
        this.flVersNoverifCorr = flVersNoverifCorr;
    }

    @Column(name = "FL_VERS_RISOLTI_30GG", columnDefinition = "char")
    public String getFlVersRisolti30gg() {
        return this.flVersRisolti30gg;
    }

    public void setFlVersRisolti30gg(String flVersRisolti30gg) {
        this.flVersRisolti30gg = flVersRisolti30gg;
    }

    @Column(name = "FL_VERS_RISOLTI_CORR", columnDefinition = "char(1)")
    public String getFlVersRisoltiCorr() {
        return this.flVersRisoltiCorr;
    }

    public void setFlVersRisoltiCorr(String flVersRisoltiCorr) {
        this.flVersRisoltiCorr = flVersRisoltiCorr;
    }

    @Column(name = "FL_VERS_VERIF_30GG", columnDefinition = "char")
    public String getFlVersVerif30gg() {
        return this.flVersVerif30gg;
    }

    public void setFlVersVerif30gg(String flVersVerif30gg) {
        this.flVersVerif30gg = flVersVerif30gg;
    }

    @Column(name = "FL_VERS_VERIF_CORR", columnDefinition = "char(1)")
    public String getFlVersVerifCorr() {
        return this.flVersVerifCorr;
    }

    public void setFlVersVerifCorr(String flVersVerifCorr) {
        this.flVersVerifCorr = flVersVerifCorr;
    }

    private MonVChkVersAmbId monVChkVersAmbId;

    @EmbeddedId()
    public MonVChkVersAmbId getMonVChkVersAmbId() {
        return monVChkVersAmbId;
    }

    public void setMonVChkVersAmbId(MonVChkVersAmbId monVChkVersAmbId) {
        this.monVChkVersAmbId = monVChkVersAmbId;
    }
}
