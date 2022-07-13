package it.eng.parer.grantedEntity;

import it.eng.parer.entity.OrgTipoServizio;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the ORG_SERVIZIO_EROG database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.ORG_SERVIZIO_EROG")
@NamedQuery(name = "OrgServizioErog.findAll", query = "SELECT o FROM OrgServizioErog o")
public class OrgServizioErog implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idServizioErogato;
    private Date dtErog;
    private String flPagamento;
    private BigDecimal imValoreTariffa;
    private String nmServizioErogato;
    private OrgTipoServizio orgTipoServizio;
    private SIOrgAccordoEnte orgAccordoEnte;

    public OrgServizioErog() {
    }

    @Id
    @SequenceGenerator(name = "ORG_SERVIZIO_EROG_IDSERVIZIOEROGATO_GENERATOR", sequenceName = "SORG_SERVIZIO_EROG", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_SERVIZIO_EROG_IDSERVIZIOEROGATO_GENERATOR")
    @Column(name = "ID_SERVIZIO_EROGATO")
    public long getIdServizioErogato() {
        return this.idServizioErogato;
    }

    public void setIdServizioErogato(long idServizioErogato) {
        this.idServizioErogato = idServizioErogato;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_EROG")
    public Date getDtErog() {
        return this.dtErog;
    }

    public void setDtErog(Date dtErog) {
        this.dtErog = dtErog;
    }

    @Column(name = "FL_PAGAMENTO")
    public String getFlPagamento() {
        return this.flPagamento;
    }

    public void setFlPagamento(String flPagamento) {
        this.flPagamento = flPagamento;
    }

    @Column(name = "IM_VALORE_TARIFFA")
    public BigDecimal getImValoreTariffa() {
        return this.imValoreTariffa;
    }

    public void setImValoreTariffa(BigDecimal imValoreTariffa) {
        this.imValoreTariffa = imValoreTariffa;
    }

    @Column(name = "NM_SERVIZIO_EROGATO")
    public String getNmServizioErogato() {
        return this.nmServizioErogato;
    }

    public void setNmServizioErogato(String nmServizioErogato) {
        this.nmServizioErogato = nmServizioErogato;
    }

    // bi-directional many-to-one association to OrgTipoServizio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERVIZIO")
    public OrgTipoServizio getOrgTipoServizio() {
        return this.orgTipoServizio;
    }

    public void setOrgTipoServizio(OrgTipoServizio orgTipoServizio) {
        this.orgTipoServizio = orgTipoServizio;
    }

    // bi-directional many-to-one association to OrgAccordoEnte
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ACCORDO_ENTE")
    public SIOrgAccordoEnte getOrgAccordoEnte() {
        return this.orgAccordoEnte;
    }

    public void setOrgAccordoEnte(SIOrgAccordoEnte orgAccordoEnte) {
        this.orgAccordoEnte = orgAccordoEnte;
    }
}
