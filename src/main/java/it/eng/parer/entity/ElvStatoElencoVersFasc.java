package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import it.eng.parer.entity.constraint.ElvStatoElencoVersFasc.TiStatoElencoFasc;

/**
 * The persistent class for the ELV_STATO_ELENCO_VERS_FASC database table.
 */
@Entity
@Table(name = "ELV_STATO_ELENCO_VERS_FASC")
@NamedQueries({ @NamedQuery(name = "ElvStatoElencoVersFasc.findAll", query = "SELECT e FROM ElvStatoElencoVersFasc e"),
        @NamedQuery(name = "ElvStatoElencoVersFasc.findByElencoVersFasc", query = "SELECT e FROM ElvStatoElencoVersFasc e WHERE e.elvElencoVersFasc = :elvElencoVersFasc ORDER BY e.tsStato ASC") })
public class ElvStatoElencoVersFasc implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idStatoElencoVersFasc;

    private IamUser iamUser;

    private TiStatoElencoFasc tiStato;

    private Date tsStato;

    private ElvElencoVersFasc elvElencoVersFasc;

    public ElvStatoElencoVersFasc() {
        // Hibernate
    }

    @Id
    // "ELV_STATO_ELENCO_VERS_FASC_IDSTATOELENCOVERSFASC_GENERATOR",
    // sequenceName =
    // "SELV_STATO_ELENCO_VERS_FASC",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ELV_STATO_ELENCO_VERS_FASC_IDSTATOELENCOVERSFASC_GENERATOR")
    @Column(name = "ID_STATO_ELENCO_VERS_FASC")
    @GenericGenerator(name = "SELV_STATO_ELENCO_VERS_FASC_ID_STATO_ELENCO_VERS_FASC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SELV_STATO_ELENCO_VERS_FASC"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SELV_STATO_ELENCO_VERS_FASC_ID_STATO_ELENCO_VERS_FASC_GENERATOR")
    public Long getIdStatoElencoVersFasc() {
        return this.idStatoElencoVersFasc;
    }

    public void setIdStatoElencoVersFasc(Long idStatoElencoVersFasc) {
        this.idStatoElencoVersFasc = idStatoElencoVersFasc;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO")
    public TiStatoElencoFasc getTiStato() {
        return this.tiStato;
    }

    public void setTiStato(TiStatoElencoFasc tiStato) {
        this.tiStato = tiStato;
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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_STATO")
    public Date getTsStato() {
        return this.tsStato;
    }

    public void setTsStato(Date tsStato) {
        this.tsStato = tsStato;
    }

    // bi-directional many-to-one association to ElvElencoVersFasc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS_FASC", nullable = false)
    public ElvElencoVersFasc getElvElencoVersFasc() {
        return this.elvElencoVersFasc;
    }

    public void setElvElencoVersFasc(ElvElencoVersFasc elvElencoVersFasc) {
        this.elvElencoVersFasc = elvElencoVersFasc;
    }
}
