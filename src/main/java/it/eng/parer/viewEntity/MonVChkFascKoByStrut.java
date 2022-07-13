package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CHK_FASC_KO_BY_STRUT database table.
 *
 */
@Entity
@Table(name = "MON_V_CHK_FASC_KO_BY_STRUT")
@NamedQuery(name = "MonVChkFascKoByStrut.findByStrutUser", query = "SELECT m FROM MonVChkFascKoByStrut m WHERE m.idStrut = :idStrut AND m.idUserIam=:idUserIam")
public class MonVChkFascKoByStrut implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flFascKoNonRisolub30gg;
    private String flFascKoNonRisolubB30gg;
    private String flFascKoNonRisolubCorr;
    private String flFascKoNonVerif30gg;
    private String flFascKoNonVerifB30gg;
    private String flFascKoNonVerifCorr;
    private String flFascKoVerif30gg;
    private String flFascKoVerifB30gg;
    private String flFascKoVerifCorr;
    private BigDecimal idStrut;
    private BigDecimal idUserIam;

    public MonVChkFascKoByStrut() {
    }

    @Column(name = "FL_FASC_KO_NON_RISOLUB_30GG")
    public String getFlFascKoNonRisolub30gg() {
        return this.flFascKoNonRisolub30gg;
    }

    public void setFlFascKoNonRisolub30gg(String flFascKoNonRisolub30gg) {
        this.flFascKoNonRisolub30gg = flFascKoNonRisolub30gg;
    }

    @Column(name = "FL_FASC_KO_NON_RISOLUB_B30GG")
    public String getFlFascKoNonRisolubB30gg() {
        return this.flFascKoNonRisolubB30gg;
    }

    public void setFlFascKoNonRisolubB30gg(String flFascKoNonRisolubB30gg) {
        this.flFascKoNonRisolubB30gg = flFascKoNonRisolubB30gg;
    }

    @Column(name = "FL_FASC_KO_NON_RISOLUB_CORR")
    public String getFlFascKoNonRisolubCorr() {
        return this.flFascKoNonRisolubCorr;
    }

    public void setFlFascKoNonRisolubCorr(String flFascKoNonRisolubCorr) {
        this.flFascKoNonRisolubCorr = flFascKoNonRisolubCorr;
    }

    @Column(name = "FL_FASC_KO_NON_VERIF_30GG")
    public String getFlFascKoNonVerif30gg() {
        return this.flFascKoNonVerif30gg;
    }

    public void setFlFascKoNonVerif30gg(String flFascKoNonVerif30gg) {
        this.flFascKoNonVerif30gg = flFascKoNonVerif30gg;
    }

    @Column(name = "FL_FASC_KO_NON_VERIF_B30GG")
    public String getFlFascKoNonVerifB30gg() {
        return this.flFascKoNonVerifB30gg;
    }

    public void setFlFascKoNonVerifB30gg(String flFascKoNonVerifB30gg) {
        this.flFascKoNonVerifB30gg = flFascKoNonVerifB30gg;
    }

    @Column(name = "FL_FASC_KO_NON_VERIF_CORR")
    public String getFlFascKoNonVerifCorr() {
        return this.flFascKoNonVerifCorr;
    }

    public void setFlFascKoNonVerifCorr(String flFascKoNonVerifCorr) {
        this.flFascKoNonVerifCorr = flFascKoNonVerifCorr;
    }

    @Column(name = "FL_FASC_KO_VERIF_30GG")
    public String getFlFascKoVerif30gg() {
        return this.flFascKoVerif30gg;
    }

    public void setFlFascKoVerif30gg(String flFascKoVerif30gg) {
        this.flFascKoVerif30gg = flFascKoVerif30gg;
    }

    @Column(name = "FL_FASC_KO_VERIF_B30GG")
    public String getFlFascKoVerifB30gg() {
        return this.flFascKoVerifB30gg;
    }

    public void setFlFascKoVerifB30gg(String flFascKoVerifB30gg) {
        this.flFascKoVerifB30gg = flFascKoVerifB30gg;
    }

    @Column(name = "FL_FASC_KO_VERIF_CORR")
    public String getFlFascKoVerifCorr() {
        return this.flFascKoVerifCorr;
    }

    public void setFlFascKoVerifCorr(String flFascKoVerifCorr) {
        this.flFascKoVerifCorr = flFascKoVerifCorr;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
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
