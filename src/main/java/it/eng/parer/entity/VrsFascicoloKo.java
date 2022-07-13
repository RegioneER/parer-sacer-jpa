package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the VRS_FASCICOLO_KO database table.
 *
 */
@Entity
@Table(name = "VRS_FASCICOLO_KO")
@NamedQueries({ @NamedQuery(name = "VrsFascicoloKo.findByFascKo", query = "SELECT v FROM VrsFascicoloKo v"),
        @NamedQuery(name = "VrsFascicoloKo.findByStrutAnnoNum", query = "SELECT f FROM VrsFascicoloKo f WHERE f.orgStrut = :orgStrut AND f.aaFascicolo=:aaFascicolo AND f.cdKeyFascicolo=:cdKeyFascicolo"),
        @NamedQuery(name = "VrsFascicoloKo.findCountFascicoliNonVersatiNelGiorno", query = "SELECT f.orgStrut.idStrut, f.decTipoFascicolo.idTipoFascicolo, f.aaFascicolo, COUNT(f.idFascicoloKo), f.tiStatoFascicoloKo FROM VrsFascicoloKo f JOIN f.orgStrut strut WHERE FUNC('trunc', f.tsIniLastSes, 'DD')=FUNC('to_date',FUNC('to_char',:data,'DD/MM/YYYY'),'DD/MM/YYYY') GROUP BY f.orgStrut.idStrut, f.decTipoFascicolo.idTipoFascicolo, f.aaFascicolo, f.tiStatoFascicoloKo") })
public class VrsFascicoloKo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idFascicoloKo;
    private BigDecimal aaFascicolo;
    private String cdKeyFascicolo;
    private String dsErrPrinc;
    private BigDecimal idSesFascicoloKoFirst;
    private BigDecimal idSesFascicoloKoLast;
    private String tiStatoFascicoloKo;
    private Date tsIniFirstSes;
    private Date tsIniLastSes;
    private DecErrSacer decErrSacer;
    private DecTipoFascicolo decTipoFascicolo;
    private OrgStrut orgStrut;
    private List<VrsSesFascicoloKo> vrsSesFascicoloKos;

    public VrsFascicoloKo() {
    }

    @Id
    @SequenceGenerator(name = "VRS_FASCICOLO_KO_IDFASCICOLOKO_GENERATOR", sequenceName = "SVRS_FASCICOLO_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_FASCICOLO_KO_IDFASCICOLOKO_GENERATOR")
    @Column(name = "ID_FASCICOLO_KO")
    public long getIdFascicoloKo() {
        return this.idFascicoloKo;
    }

    public void setIdFascicoloKo(long idFascicoloKo) {
        this.idFascicoloKo = idFascicoloKo;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "CD_KEY_FASCICOLO")
    public String getCdKeyFascicolo() {
        return this.cdKeyFascicolo;
    }

    public void setCdKeyFascicolo(String cdKeyFascicolo) {
        this.cdKeyFascicolo = cdKeyFascicolo;
    }

    @Column(name = "DS_ERR_PRINC")
    public String getDsErrPrinc() {
        return this.dsErrPrinc;
    }

    public void setDsErrPrinc(String dsErrPrinc) {
        this.dsErrPrinc = dsErrPrinc;
    }

    @Column(name = "ID_SES_FASCICOLO_KO_FIRST")
    public BigDecimal getIdSesFascicoloKoFirst() {
        return this.idSesFascicoloKoFirst;
    }

    public void setIdSesFascicoloKoFirst(BigDecimal idSesFascicoloKoFirst) {
        this.idSesFascicoloKoFirst = idSesFascicoloKoFirst;
    }

    @Column(name = "ID_SES_FASCICOLO_KO_LAST")
    public BigDecimal getIdSesFascicoloKoLast() {
        return this.idSesFascicoloKoLast;
    }

    public void setIdSesFascicoloKoLast(BigDecimal idSesFascicoloKoLast) {
        this.idSesFascicoloKoLast = idSesFascicoloKoLast;
    }

    @Column(name = "TI_STATO_FASCICOLO_KO")
    public String getTiStatoFascicoloKo() {
        return this.tiStatoFascicoloKo;
    }

    public void setTiStatoFascicoloKo(String tiStatoFascicoloKo) {
        this.tiStatoFascicoloKo = tiStatoFascicoloKo;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_INI_FIRST_SES")
    public Date getTsIniFirstSes() {
        return this.tsIniFirstSes;
    }

    public void setTsIniFirstSes(Date tsIniFirstSes) {
        this.tsIniFirstSes = tsIniFirstSes;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_INI_LAST_SES")
    public Date getTsIniLastSes() {
        return this.tsIniLastSes;
    }

    public void setTsIniLastSes(Date tsIniLastSes) {
        this.tsIniLastSes = tsIniLastSes;
    }

    // bi-directional many-to-one association to DecErrSacer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_SACER_PRINC")
    public DecErrSacer getDecErrSacer() {
        return this.decErrSacer;
    }

    public void setDecErrSacer(DecErrSacer decErrSacer) {
        this.decErrSacer = decErrSacer;
    }

    // bi-directional many-to-one association to DecTipoFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_FASCICOLO_LAST")
    public DecTipoFascicolo getDecTipoFascicolo() {
        return this.decTipoFascicolo;
    }

    public void setDecTipoFascicolo(DecTipoFascicolo decTipoFascicolo) {
        this.decTipoFascicolo = decTipoFascicolo;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

    // bi-directional many-to-one association to VrsSesFascicoloKo
    @OneToMany(mappedBy = "vrsFascicoloKo")
    public List<VrsSesFascicoloKo> getVrsSesFascicoloKos() {
        return this.vrsSesFascicoloKos;
    }

    public void setVrsSesFascicoloKos(List<VrsSesFascicoloKo> vrsSesFascicoloKos) {
        this.vrsSesFascicoloKos = vrsSesFascicoloKos;
    }

    public VrsSesFascicoloKo addVrsSesFascicoloKo(VrsSesFascicoloKo vrsSesFascicoloKo) {
        getVrsSesFascicoloKos().add(vrsSesFascicoloKo);
        vrsSesFascicoloKo.setVrsFascicoloKo(this);

        return vrsSesFascicoloKo;
    }

    public VrsSesFascicoloKo removeVrsSesFascicoloKo(VrsSesFascicoloKo vrsSesFascicoloKo) {
        getVrsSesFascicoloKos().remove(vrsSesFascicoloKo);
        vrsSesFascicoloKo.setVrsFascicoloKo(null);

        return vrsSesFascicoloKo;
    }

}
