package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the SER_CONSIST_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_CONSIST_VER_SERIE")
@NamedQuery(name = "SerConsistVerSerie.findAll", query = "SELECT s FROM SerConsistVerSerie s")
public class SerConsistVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idConsistVerSerie;
    private BigDecimal aaUnitaDocFirst;
    private BigDecimal aaUnitaDocLast;
    private String cdDocConsistVerSerie;
    private String cdFirstUnitaDocAttesa;
    private String cdLastUnitaDocAttesa;
    private String cdRegistroFirst;
    private String cdRegistroLast;
    private String cdUnitaDocFirst;
    private String cdUnitaDocLast;
    private String dsDocConsistVerSerie;
    private Date dtComunicConsistVerSerie;
    private BigDecimal niFirstUnitaDocAttesa;
    private BigDecimal niLastUnitaDocAttesa;
    private BigDecimal niUnitaDocAttese;
    private String tiModConsistFirstLast;
    private IamUser iamUser;
    private SerVerSerie serVerSerie;
    private List<SerLacunaConsistVerSerie> serLacunaConsistVerSeries;

    public SerConsistVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_CONSIST_VER_SERIE_IDCONSISTVERSERIE_GENERATOR", sequenceName = "SSER_CONSIST_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_CONSIST_VER_SERIE_IDCONSISTVERSERIE_GENERATOR")
    @Column(name = "ID_CONSIST_VER_SERIE")
    public long getIdConsistVerSerie() {
        return this.idConsistVerSerie;
    }

    public void setIdConsistVerSerie(long idConsistVerSerie) {
        this.idConsistVerSerie = idConsistVerSerie;
    }

    @Column(name = "AA_UNITA_DOC_FIRST")
    public BigDecimal getAaUnitaDocFirst() {
        return this.aaUnitaDocFirst;
    }

    public void setAaUnitaDocFirst(BigDecimal aaUnitaDocFirst) {
        this.aaUnitaDocFirst = aaUnitaDocFirst;
    }

    @Column(name = "AA_UNITA_DOC_LAST")
    public BigDecimal getAaUnitaDocLast() {
        return this.aaUnitaDocLast;
    }

    public void setAaUnitaDocLast(BigDecimal aaUnitaDocLast) {
        this.aaUnitaDocLast = aaUnitaDocLast;
    }

    @Column(name = "CD_DOC_CONSIST_VER_SERIE")
    public String getCdDocConsistVerSerie() {
        return this.cdDocConsistVerSerie;
    }

    public void setCdDocConsistVerSerie(String cdDocConsistVerSerie) {
        this.cdDocConsistVerSerie = cdDocConsistVerSerie;
    }

    @Column(name = "CD_FIRST_UNITA_DOC_ATTESA")
    public String getCdFirstUnitaDocAttesa() {
        return this.cdFirstUnitaDocAttesa;
    }

    public void setCdFirstUnitaDocAttesa(String cdFirstUnitaDocAttesa) {
        this.cdFirstUnitaDocAttesa = cdFirstUnitaDocAttesa;
    }

    @Column(name = "CD_LAST_UNITA_DOC_ATTESA")
    public String getCdLastUnitaDocAttesa() {
        return this.cdLastUnitaDocAttesa;
    }

    public void setCdLastUnitaDocAttesa(String cdLastUnitaDocAttesa) {
        this.cdLastUnitaDocAttesa = cdLastUnitaDocAttesa;
    }

    @Column(name = "CD_REGISTRO_FIRST")
    public String getCdRegistroFirst() {
        return this.cdRegistroFirst;
    }

    public void setCdRegistroFirst(String cdRegistroFirst) {
        this.cdRegistroFirst = cdRegistroFirst;
    }

    @Column(name = "CD_REGISTRO_LAST")
    public String getCdRegistroLast() {
        return this.cdRegistroLast;
    }

    public void setCdRegistroLast(String cdRegistroLast) {
        this.cdRegistroLast = cdRegistroLast;
    }

    @Column(name = "CD_UNITA_DOC_FIRST")
    public String getCdUnitaDocFirst() {
        return this.cdUnitaDocFirst;
    }

    public void setCdUnitaDocFirst(String cdUnitaDocFirst) {
        this.cdUnitaDocFirst = cdUnitaDocFirst;
    }

    @Column(name = "CD_UNITA_DOC_LAST")
    public String getCdUnitaDocLast() {
        return this.cdUnitaDocLast;
    }

    public void setCdUnitaDocLast(String cdUnitaDocLast) {
        this.cdUnitaDocLast = cdUnitaDocLast;
    }

    @Column(name = "DS_DOC_CONSIST_VER_SERIE")
    public String getDsDocConsistVerSerie() {
        return this.dsDocConsistVerSerie;
    }

    public void setDsDocConsistVerSerie(String dsDocConsistVerSerie) {
        this.dsDocConsistVerSerie = dsDocConsistVerSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_COMUNIC_CONSIST_VER_SERIE")
    public Date getDtComunicConsistVerSerie() {
        return this.dtComunicConsistVerSerie;
    }

    public void setDtComunicConsistVerSerie(Date dtComunicConsistVerSerie) {
        this.dtComunicConsistVerSerie = dtComunicConsistVerSerie;
    }

    @Column(name = "NI_FIRST_UNITA_DOC_ATTESA")
    public BigDecimal getNiFirstUnitaDocAttesa() {
        return this.niFirstUnitaDocAttesa;
    }

    public void setNiFirstUnitaDocAttesa(BigDecimal niFirstUnitaDocAttesa) {
        this.niFirstUnitaDocAttesa = niFirstUnitaDocAttesa;
    }

    @Column(name = "NI_LAST_UNITA_DOC_ATTESA")
    public BigDecimal getNiLastUnitaDocAttesa() {
        return this.niLastUnitaDocAttesa;
    }

    public void setNiLastUnitaDocAttesa(BigDecimal niLastUnitaDocAttesa) {
        this.niLastUnitaDocAttesa = niLastUnitaDocAttesa;
    }

    @Column(name = "NI_UNITA_DOC_ATTESE")
    public BigDecimal getNiUnitaDocAttese() {
        return this.niUnitaDocAttese;
    }

    public void setNiUnitaDocAttese(BigDecimal niUnitaDocAttese) {
        this.niUnitaDocAttese = niUnitaDocAttese;
    }

    @Column(name = "TI_MOD_CONSIST_FIRST_LAST")
    public String getTiModConsistFirstLast() {
        return this.tiModConsistFirstLast;
    }

    public void setTiModConsistFirstLast(String tiModConsistFirstLast) {
        this.tiModConsistFirstLast = tiModConsistFirstLast;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

    // bi-directional many-to-one association to SerVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VER_SERIE")
    public SerVerSerie getSerVerSerie() {
        return this.serVerSerie;
    }

    public void setSerVerSerie(SerVerSerie serVerSerie) {
        this.serVerSerie = serVerSerie;
    }

    // bi-directional many-to-one association to SerLacunaConsistVerSerie
    @OneToMany(mappedBy = "serConsistVerSerie", cascade = CascadeType.PERSIST)
    public List<SerLacunaConsistVerSerie> getSerLacunaConsistVerSeries() {
        return this.serLacunaConsistVerSeries;
    }

    public void setSerLacunaConsistVerSeries(List<SerLacunaConsistVerSerie> serLacunaConsistVerSeries) {
        this.serLacunaConsistVerSeries = serLacunaConsistVerSeries;
    }

    public SerLacunaConsistVerSerie addSerLacunaConsistVerSery(SerLacunaConsistVerSerie serLacunaConsistVerSery) {
        getSerLacunaConsistVerSeries().add(serLacunaConsistVerSery);
        serLacunaConsistVerSery.setSerConsistVerSerie(this);

        return serLacunaConsistVerSery;
    }

    public SerLacunaConsistVerSerie removeSerLacunaConsistVerSery(SerLacunaConsistVerSerie serLacunaConsistVerSery) {
        getSerLacunaConsistVerSeries().remove(serLacunaConsistVerSery);
        serLacunaConsistVerSery.setSerConsistVerSerie(null);

        return serLacunaConsistVerSery;
    }

}