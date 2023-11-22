package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ORG_STORICO_ENTE_AMBIENTE database table.
 */
@Entity
@Table(name = "ORG_STORICO_ENTE_AMBIENTE")
@NamedQuery(name = "OrgStoricoEnteAmbiente.findAll", query = "SELECT o FROM OrgStoricoEnteAmbiente o")
public class OrgStoricoEnteAmbiente implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idStoricoEnteAmbiente;

    private Date dtFinVal;

    private Date dtIniVal;

    private OrgAmbiente orgAmbiente;

    private OrgEnte orgEnte;

    public OrgStoricoEnteAmbiente() {/* Hibernate */
    }

    @Id
    // "ORG_STORICO_ENTE_AMBIENTE_IDSTORICOENTEAMBIENTE_GENERATOR",
    // sequenceName =
    // "SORG_STORICO_ENTE_AMBIENTE")
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ORG_STORICO_ENTE_AMBIENTE_IDSTORICOENTEAMBIENTE_GENERATOR")
    @Column(name = "ID_STORICO_ENTE_AMBIENTE")
    @GenericGenerator(name = "SORG_STORICO_ENTE_AMBIENTE_ID_STORICO_ENTE_AMBIENTE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SORG_STORICO_ENTE_AMBIENTE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SORG_STORICO_ENTE_AMBIENTE_ID_STORICO_ENTE_AMBIENTE_GENERATOR")
    public Long getIdStoricoEnteAmbiente() {
        return this.idStoricoEnteAmbiente;
    }

    public void setIdStoricoEnteAmbiente(Long idStoricoEnteAmbiente) {
        this.idStoricoEnteAmbiente = idStoricoEnteAmbiente;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_FIN_VAL")
    public Date getDtFinVal() {
        return this.dtFinVal;
    }

    public void setDtFinVal(Date dtFinVal) {
        this.dtFinVal = dtFinVal;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_INI_VAL")
    public Date getDtIniVal() {
        return this.dtIniVal;
    }

    public void setDtIniVal(Date dtIniVal) {
        this.dtIniVal = dtIniVal;
    }

    // bi-directional many-to-one association to OrgAmbiente
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AMBIENTE")
    public OrgAmbiente getOrgAmbiente() {
        return this.orgAmbiente;
    }

    public void setOrgAmbiente(OrgAmbiente orgAmbiente) {
        this.orgAmbiente = orgAmbiente;
    }

    // bi-directional many-to-one association to OrgEnte
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ENTE")
    public OrgEnte getOrgEnte() {
        return this.orgEnte;
    }

    public void setOrgEnte(OrgEnte orgEnte) {
        this.orgEnte = orgEnte;
    }
}
