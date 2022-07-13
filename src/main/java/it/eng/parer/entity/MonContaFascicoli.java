package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the MON_CONTA_FASCICOLI database table.
 *
 */
@Entity
@Table(name = "MON_CONTA_FASCICOLI")
@NamedQueries({ @NamedQuery(name = "MonContaFascicoli.findAll", query = "SELECT m FROM MonContaFascicoli m"),
        @NamedQuery(name = "MonContaFascicoli.findByChiaveTotalizz", query = "SELECT m FROM MonContaFascicoli m WHERE m.orgStrut.idStrut=:idStrut AND FUNC('trunc',m.dtRifConta)=:dtRifConta AND m.decTipoFascicolo.idTipoFascicolo=:idTipoFascicolo AND m.aaFascicolo=:aaFascicolo AND m.iamUser.idUserIam=:idUserIam"), })
public class MonContaFascicoli implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idContaFascicoli;
    private BigDecimal aaFascicolo;
    private Date dtRifConta;
    private BigDecimal niFascicoliVers;
    private DecTipoFascicolo decTipoFascicolo;
    private IamUser iamUser;
    private OrgStrut orgStrut;

    public MonContaFascicoli() {
    }

    @Id
    @SequenceGenerator(name = "MON_CONTA_FASCICOLI_IDCONTAFASCICOLI_GENERATOR", sequenceName = "SMON_CONTA_FASCICOLI", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MON_CONTA_FASCICOLI_IDCONTAFASCICOLI_GENERATOR")
    @Column(name = "ID_CONTA_FASCICOLI")
    public long getIdContaFascicoli() {
        return this.idContaFascicoli;
    }

    public void setIdContaFascicoli(long idContaFascicoli) {
        this.idContaFascicoli = idContaFascicoli;
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

    @Column(name = "NI_FASCICOLI_VERS")
    public BigDecimal getNiFascicoliVers() {
        return this.niFascicoliVers;
    }

    public void setNiFascicoliVers(BigDecimal niFascicoliVers) {
        this.niFascicoliVers = niFascicoliVers;
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

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
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
