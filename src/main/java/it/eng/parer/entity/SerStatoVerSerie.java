package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * The persistent class for the SER_STATO_VER_SERIE database table.
 */
@Entity
@Table(name = "SER_STATO_VER_SERIE")
@NamedQuery(name = "SerStatoVerSerie.findAll", query = "SELECT s FROM SerStatoVerSerie s")
public class SerStatoVerSerie implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idStatoVerSerie;

    private String dsAzione;

    private String dsNotaAzione;

    private Date dtRegStatoVerSerie;

    private BigDecimal pgStatoVerSerie;

    private String tiStatoVerSerie;

    private IamUser iamUser;

    private SerVerSerie serVerSerie;

    public SerStatoVerSerie() {/* Hibernate */
    }

    @Id
    // "SER_STATO_VER_SERIE_IDSTATOVERSERIE_GENERATOR",
    // sequenceName = "SSER_STATO_VER_SERIE",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_STATO_VER_SERIE_IDSTATOVERSERIE_GENERATOR")
    @Column(name = "ID_STATO_VER_SERIE")
    @GenericGenerator(name = "SSER_STATO_VER_SERIE_ID_STATO_VER_SERIE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SSER_STATO_VER_SERIE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SSER_STATO_VER_SERIE_ID_STATO_VER_SERIE_GENERATOR")
    public Long getIdStatoVerSerie() {
        return this.idStatoVerSerie;
    }

    public void setIdStatoVerSerie(Long idStatoVerSerie) {
        this.idStatoVerSerie = idStatoVerSerie;
    }

    @Column(name = "DS_AZIONE")
    public String getDsAzione() {
        return this.dsAzione;
    }

    public void setDsAzione(String dsAzione) {
        this.dsAzione = dsAzione;
    }

    @Column(name = "DS_NOTA_AZIONE")
    public String getDsNotaAzione() {
        return this.dsNotaAzione;
    }

    public void setDsNotaAzione(String dsNotaAzione) {
        this.dsNotaAzione = dsNotaAzione;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_STATO_VER_SERIE")
    public Date getDtRegStatoVerSerie() {
        return this.dtRegStatoVerSerie;
    }

    public void setDtRegStatoVerSerie(Date dtRegStatoVerSerie) {
        this.dtRegStatoVerSerie = dtRegStatoVerSerie;
    }

    @Column(name = "PG_STATO_VER_SERIE")
    public BigDecimal getPgStatoVerSerie() {
        return this.pgStatoVerSerie;
    }

    public void setPgStatoVerSerie(BigDecimal pgStatoVerSerie) {
        this.pgStatoVerSerie = pgStatoVerSerie;
    }

    @Column(name = "TI_STATO_VER_SERIE")
    public String getTiStatoVerSerie() {
        return this.tiStatoVerSerie;
    }

    public void setTiStatoVerSerie(String tiStatoVerSerie) {
        this.tiStatoVerSerie = tiStatoVerSerie;
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

}
