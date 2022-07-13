package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the ARO_VER_INDICE_AIP_UD database table.
 *
 */
@Entity
@Table(name = "ARO_VER_INDICE_AIP_UD")
public class AroVerIndiceAipUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idVerIndiceAip;
    private String cdEncodingHashAip;
    private String cdEncodingHashIndiceAip;
    private String cdVerIndiceAip;
    private String cdVerXsdIndiceAip;
    private String dsAlgoHashAip;
    private String dsAlgoHashIndiceAip;
    private String dsCausale;
    private String dsHashIndiceAip;
    private String dsHashAip;
    private String dsUrn;
    private Date dtCreazione;
    private BigDecimal pgVerIndiceAip;
    private BigDecimal idEnteConserv;
    private List<AroCompVerIndiceAipUd> aroCompVerIndiceAipUds;
    private List<AroFileVerIndiceAipUd> aroFileVerIndiceAipUds;
    private List<AroNotaUnitaDoc> aroNotaUnitaDocs;
    private List<FasContenVerAipFascicolo> fasContenVerAipFascicolos;
    private List<FasUdAipFascicoloDaElab> fasUdAipFascicoloDaElabs;
    private AroIndiceAipUd aroIndiceAipUd;
    private ElvElencoVer elvElencoVer;
    private List<AroUpdUdVerIndiceAipUd> aroUpdUdVerIndiceAipUds;
    private List<AroUrnVerIndiceAipUd> aroUrnVerIndiceAipUds;

    public AroVerIndiceAipUd() {
    }

    @Id
    @SequenceGenerator(name = "ARO_VER_INDICE_AIP_UD_IDVERINDICEAIP_GENERATOR", sequenceName = "SARO_VER_INDICE_AIP_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_VER_INDICE_AIP_UD_IDVERINDICEAIP_GENERATOR")
    @Column(name = "ID_VER_INDICE_AIP")
    public long getIdVerIndiceAip() {
        return this.idVerIndiceAip;
    }

    public void setIdVerIndiceAip(long idVerIndiceAip) {
        this.idVerIndiceAip = idVerIndiceAip;
    }

    @Column(name = "CD_ENCODING_HASH_AIP")
    public String getCdEncodingHashAip() {
        return this.cdEncodingHashAip;
    }

    public void setCdEncodingHashAip(String cdEncodingHashAip) {
        this.cdEncodingHashAip = cdEncodingHashAip;
    }

    @Column(name = "CD_ENCODING_HASH_INDICE_AIP")
    public String getCdEncodingHashIndiceAip() {
        return this.cdEncodingHashIndiceAip;
    }

    public void setCdEncodingHashIndiceAip(String cdEncodingHashIndiceAip) {
        this.cdEncodingHashIndiceAip = cdEncodingHashIndiceAip;
    }

    @Column(name = "CD_VER_INDICE_AIP")
    public String getCdVerIndiceAip() {
        return this.cdVerIndiceAip;
    }

    public void setCdVerIndiceAip(String cdVerIndiceAip) {
        this.cdVerIndiceAip = cdVerIndiceAip;
    }

    @Column(name = "CD_VER_XSD_INDICE_AIP")
    public String getCdVerXsdIndiceAip() {
        return this.cdVerXsdIndiceAip;
    }

    public void setCdVerXsdIndiceAip(String cdVerXsdIndiceAip) {
        this.cdVerXsdIndiceAip = cdVerXsdIndiceAip;
    }

    @Column(name = "DS_ALGO_HASH_AIP")
    public String getDsAlgoHashAip() {
        return this.dsAlgoHashAip;
    }

    public void setDsAlgoHashAip(String dsAlgoHashAip) {
        this.dsAlgoHashAip = dsAlgoHashAip;
    }

    @Column(name = "DS_ALGO_HASH_INDICE_AIP")
    public String getDsAlgoHashIndiceAip() {
        return this.dsAlgoHashIndiceAip;
    }

    public void setDsAlgoHashIndiceAip(String dsAlgoHashIndiceAip) {
        this.dsAlgoHashIndiceAip = dsAlgoHashIndiceAip;
    }

    @Column(name = "DS_CAUSALE")
    public String getDsCausale() {
        return this.dsCausale;
    }

    public void setDsCausale(String dsCausale) {
        this.dsCausale = dsCausale;
    }

    @Column(name = "DS_HASH_INDICE_AIP")
    public String getDsHashIndiceAip() {
        return this.dsHashIndiceAip;
    }

    public void setDsHashIndiceAip(String dsHashIndiceAip) {
        this.dsHashIndiceAip = dsHashIndiceAip;
    }

    @Column(name = "DS_HASH_AIP")
    public String getDsHashAip() {
        return this.dsHashAip;
    }

    public void setDsHashAip(String dsHashAip) {
        this.dsHashAip = dsHashAip;
    }

    @Column(name = "DS_URN")
    public String getDsUrn() {
        return this.dsUrn;
    }

    public void setDsUrn(String dsUrn) {
        this.dsUrn = dsUrn;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE")
    public Date getDtCreazione() {
        return this.dtCreazione;
    }

    public void setDtCreazione(Date dtCreazione) {
        this.dtCreazione = dtCreazione;
    }

    @Column(name = "PG_VER_INDICE_AIP")
    public BigDecimal getPgVerIndiceAip() {
        return this.pgVerIndiceAip;
    }

    public void setPgVerIndiceAip(BigDecimal pgVerIndiceAip) {
        this.pgVerIndiceAip = pgVerIndiceAip;
    }

    @Column(name = "ID_ENTE_CONSERV")
    public BigDecimal getIdEnteConserv() {
        return this.idEnteConserv;
    }

    public void setIdEnteConserv(BigDecimal idEnteConserv) {
        this.idEnteConserv = idEnteConserv;
    }

    // bi-directional many-to-one association to AroCompVerIndiceAipUd
    @OneToMany(mappedBy = "aroVerIndiceAipUd", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroCompVerIndiceAipUd> getAroCompVerIndiceAipUds() {
        return this.aroCompVerIndiceAipUds;
    }

    public void setAroCompVerIndiceAipUds(List<AroCompVerIndiceAipUd> aroCompVerIndiceAipUds) {
        this.aroCompVerIndiceAipUds = aroCompVerIndiceAipUds;
    }

    // bi-directional many-to-one association to AroFileVerIndiceAipUd
    @OneToMany(mappedBy = "aroVerIndiceAipUd", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroFileVerIndiceAipUd> getAroFileVerIndiceAipUds() {
        return this.aroFileVerIndiceAipUds;
    }

    public void setAroFileVerIndiceAipUds(List<AroFileVerIndiceAipUd> aroFileVerIndiceAipUds) {
        this.aroFileVerIndiceAipUds = aroFileVerIndiceAipUds;
    }

    // bi-directional many-to-one association to AroNotaUnitaDoc
    @OneToMany(mappedBy = "aroVerIndiceAipUd", cascade = CascadeType.PERSIST)
    public List<AroNotaUnitaDoc> getAroNotaUnitaDocs() {
        return this.aroNotaUnitaDocs;
    }

    public void setAroNotaUnitaDocs(List<AroNotaUnitaDoc> aroNotaUnitaDocs) {
        this.aroNotaUnitaDocs = aroNotaUnitaDocs;
    }

    // bi-directional many-to-one association to FasContenVerAipFascicolo
    @OneToMany(mappedBy = "aroVerIndiceAipUd", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<FasContenVerAipFascicolo> getFasContenVerAipFascicolos() {
        return this.fasContenVerAipFascicolos;
    }

    public void setFasContenVerAipFascicolos(List<FasContenVerAipFascicolo> fasContenVerAipFascicolos) {
        this.fasContenVerAipFascicolos = fasContenVerAipFascicolos;
    }

    // bi-directional many-to-one association to FasUdAipFascicoloDaElab
    @OneToMany(mappedBy = "aroVerIndiceAipUd", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<FasUdAipFascicoloDaElab> getFasUdAipFascicoloDaElabs() {
        return this.fasUdAipFascicoloDaElabs;
    }

    public void setFasUdAipFascicoloDaElabs(List<FasUdAipFascicoloDaElab> fasUdAipFascicoloDaElabs) {
        this.fasUdAipFascicoloDaElabs = fasUdAipFascicoloDaElabs;
    }

    // bi-directional many-to-one association to AroIndiceAipUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_INDICE_AIP")
    public AroIndiceAipUd getAroIndiceAipUd() {
        return this.aroIndiceAipUd;
    }

    public void setAroIndiceAipUd(AroIndiceAipUd aroIndiceAipUd) {
        this.aroIndiceAipUd = aroIndiceAipUd;
    }

    // bi-directional many-to-one association to ElvElencoVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS")
    public ElvElencoVer getElvElencoVer() {
        return this.elvElencoVer;
    }

    public void setElvElencoVer(ElvElencoVer elvElencoVer) {
        this.elvElencoVer = elvElencoVer;
    }

    // bi-directional many-to-one association to AroFileVerIndiceAipUd
    // TODO: verifica su cascade (se corretto/utile)
    @OneToMany(mappedBy = "aroVerIndiceAipUd", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroUpdUdVerIndiceAipUd> getAroUpdUdVerIndiceAipUdss() {
        return this.aroUpdUdVerIndiceAipUds;
    }

    public void setAroUpdUdVerIndiceAipUdss(List<AroUpdUdVerIndiceAipUd> aroUpdUdVerIndiceAipUds) {
        this.aroUpdUdVerIndiceAipUds = aroUpdUdVerIndiceAipUds;
    }

    // bi-directional many-to-one association to AroUrnVerIndiceAipUd
    // TODO: verifica su cascade (se corretto/utile)
    @OneToMany(mappedBy = "aroVerIndiceAipUd", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<AroUrnVerIndiceAipUd> getAroUrnVerIndiceAipUds() {
        return this.aroUrnVerIndiceAipUds;
    }

    public void setAroUrnVerIndiceAipUds(List<AroUrnVerIndiceAipUd> aroUrnVerIndiceAipUds) {
        this.aroUrnVerIndiceAipUds = aroUrnVerIndiceAipUds;
    }

}
