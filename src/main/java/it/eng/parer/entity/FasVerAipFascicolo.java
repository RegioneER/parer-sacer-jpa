package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the FAS_VER_AIP_FASCICOLO database table.
 *
 */
@Entity
@Table(name = "FAS_VER_AIP_FASCICOLO")
public class FasVerAipFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idVerAipFascicolo;
    private String cdVerAip;
    private String dsCausale;
    private Date dtCreazione;
    private BigDecimal pgVerAipFascicolo;
    private List<FasContenVerAipFascicolo> fasContenVerAipFascicolos;
    private List<FasMetaVerAipFascicolo> fasMetaVerAipFascicolos;
    private List<FasSipVerAipFascicolo> fasSipVerAipFascicolos;
    private FasFascicolo fasFascicolo;
    private ElvElencoVersFasc elvElencoVersFasc;
    private BigDecimal idEnteConserv;
    private String dsUrnAipFascicolo;
    private String dsUrnNormalizAipFascicolo;

    public FasVerAipFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_VER_AIP_FASCICOLO_IDVERAIPFASCICOLO_GENERATOR", sequenceName = "SFAS_VER_AIP_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_VER_AIP_FASCICOLO_IDVERAIPFASCICOLO_GENERATOR")
    @Column(name = "ID_VER_AIP_FASCICOLO")
    public long getIdVerAipFascicolo() {
        return this.idVerAipFascicolo;
    }

    public void setIdVerAipFascicolo(long idVerAipFascicolo) {
        this.idVerAipFascicolo = idVerAipFascicolo;
    }

    @Column(name = "CD_VER_AIP")
    public String getCdVerAip() {
        return this.cdVerAip;
    }

    public void setCdVerAip(String cdVerAip) {
        this.cdVerAip = cdVerAip;
    }

    @Column(name = "DS_CAUSALE")
    public String getDsCausale() {
        return this.dsCausale;
    }

    public void setDsCausale(String dsCausale) {
        this.dsCausale = dsCausale;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "PG_VER_AIP_FASCICOLO")
    public BigDecimal getPgVerAipFascicolo() {
        return this.pgVerAipFascicolo;
    }

    public void setPgVerAipFascicolo(BigDecimal pgVerAipFascicolo) {
        this.pgVerAipFascicolo = pgVerAipFascicolo;
    }

    // bi-directional many-to-one association to FasContenVerAipFascicolo
    @OneToMany(mappedBy = "fasVerAipFascicolo", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<FasContenVerAipFascicolo> getFasContenVerAipFascicolos() {
        return this.fasContenVerAipFascicolos;
    }

    public void setFasContenVerAipFascicolos(List<FasContenVerAipFascicolo> fasContenVerAipFascicolos) {
        this.fasContenVerAipFascicolos = fasContenVerAipFascicolos;
    }

    // bi-directional many-to-one association to FasMetaVerAipFascicolo
    @OneToMany(mappedBy = "fasVerAipFascicolo", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<FasMetaVerAipFascicolo> getFasMetaVerAipFascicolos() {
        return this.fasMetaVerAipFascicolos;
    }

    public void setFasMetaVerAipFascicolos(List<FasMetaVerAipFascicolo> fasMetaVerAipFascicolos) {
        this.fasMetaVerAipFascicolos = fasMetaVerAipFascicolos;
    }

    // bi-directional many-to-one association to FasSipVerAipFascicolo
    @OneToMany(mappedBy = "fasVerAipFascicolo", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<FasSipVerAipFascicolo> getFasSipVerAipFascicolos() {
        return this.fasSipVerAipFascicolos;
    }

    public void setFasSipVerAipFascicolos(List<FasSipVerAipFascicolo> fasSipVerAipFascicolos) {
        this.fasSipVerAipFascicolos = fasSipVerAipFascicolos;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
    }

    // bi-directional many-to-one association to ElvElencoVersFasc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS_FASC")
    public ElvElencoVersFasc getElvElencoVersFasc() {
        return this.elvElencoVersFasc;
    }

    public void setElvElencoVersFasc(ElvElencoVersFasc elvElencoVersFasc) {
        this.elvElencoVersFasc = elvElencoVersFasc;
    }

    @Column(name = "ID_ENTE_CONSERV")
    public BigDecimal getIdEnteConserv() {
        return this.idEnteConserv;
    }

    public void setIdEnteConserv(BigDecimal idEnteConserv) {
        this.idEnteConserv = idEnteConserv;
    }

    @Column(name = "DS_URN_AIP_FASCICOLO")
    public String getDsUrnAipFascicolo() {
        return this.dsUrnAipFascicolo;
    }

    public void setDsUrnAipFascicolo(String dsUrnAipFascicolo) {
        this.dsUrnAipFascicolo = dsUrnAipFascicolo;
    }

    @Column(name = "DS_URN_NORMALIZ_AIP_FASCICOLO")
    public String getDsUrnNormalizAipFascicolo() {
        return this.dsUrnNormalizAipFascicolo;
    }

    public void setDsUrnNormalizAipFascicolo(String dsUrnNormalizAipFascicolo) {
        this.dsUrnNormalizAipFascicolo = dsUrnNormalizAipFascicolo;
    }

}
