package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the MON_CONTA_FASCICOLI_KO database table.
 *
 */
@Entity
@Table(name = "MON_CONTA_FASCICOLI_KO")
@NamedQueries({ @NamedQuery(name = "MonContaFascicoliKo.findAll", query = "SELECT m FROM MonContaFascicoliKo m"),
        @NamedQuery(name = "MonContaFascicoliKo.findByChiaveTotaliz", query = "SELECT m FROM MonContaFascicoliKo m WHERE m.dtRifConta=:dtRifConta AND m.orgStrut=:orgStrut AND m.tiStatoFascicoloKo=:tiStatoFascicoloKo AND m.aaFascicolo=:aaFascicolo AND m.decTipoFascicolo=:decTipoFascicolo"),
        @NamedQuery(name = "MonContaFascicoliKo.findByChiaveTotalizIds", query = "SELECT m FROM MonContaFascicoliKo m WHERE FUNC('trunc',m.dtRifConta)=:dtRifConta AND m.orgStrut.idStrut=:idStrut AND m.tiStatoFascicoloKo=:tiStatoFascicoloKo AND m.aaFascicolo=:aaFascicolo AND m.decTipoFascicolo.idTipoFascicolo=:idTipoFascicolo") })
public class MonContaFascicoliKo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idContaFascicoliKo;
    private BigDecimal aaFascicolo;
    private Date dtRifConta;
    private BigDecimal niFascicoliKo;
    private String tiStatoFascicoloKo;
    private DecTipoFascicolo decTipoFascicolo;
    private OrgStrut orgStrut;

    public MonContaFascicoliKo() {
    }

    @Id
    @SequenceGenerator(name = "MON_CONTA_FASCICOLI_KO_IDCONTAFASCICOLIKO_GENERATOR", sequenceName = "SMON_CONTA_FASCICOLI_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MON_CONTA_FASCICOLI_KO_IDCONTAFASCICOLIKO_GENERATOR")
    @Column(name = "ID_CONTA_FASCICOLI_KO")
    public long getIdContaFascicoliKo() {
        return this.idContaFascicoliKo;
    }

    public void setIdContaFascicoliKo(long idContaFascicoliKo) {
        this.idContaFascicoliKo = idContaFascicoliKo;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return this.dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    @Column(name = "NI_FASCICOLI_KO")
    public BigDecimal getNiFascicoliKo() {
        return this.niFascicoliKo;
    }

    public void setNiFascicoliKo(BigDecimal niFascicoliKo) {
        this.niFascicoliKo = niFascicoliKo;
    }

    @Column(name = "TI_STATO_FASCICOLO_KO")
    public String getTiStatoFascicoloKo() {
        return this.tiStatoFascicoloKo;
    }

    public void setTiStatoFascicoloKo(String tiStatoFascicoloKo) {
        this.tiStatoFascicoloKo = tiStatoFascicoloKo;
    }

    // bi-directional many-to-one association to DecTipoFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_FASCICOLO")
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

}
