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
 * The persistent class for the SER_NOTA_VER_SERIE database table.
 */
@Entity
@Table(name = "SER_NOTA_VER_SERIE")
@NamedQuery(name = "SerNotaVerSerie.findAll", query = "SELECT s FROM SerNotaVerSerie s")
public class SerNotaVerSerie implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idNotaVerSerie;

    private String dsNotaVerSerie;

    private Date dtNotaVerSerie;

    private BigDecimal pgNotaVerSerie;

    private IamUser iamUser;

    private SerVerSerie serVerSerie;

    private DecTipoNotaSerie decTipoNotaSerie;

    public SerNotaVerSerie() {/* Hibernate */
    }

    @Id
    // "SER_NOTA_VER_SERIE_IDNOTAVERSERIE_GENERATOR",
    // sequenceName = "SSER_NOTA_VER_SERIE",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_NOTA_VER_SERIE_IDNOTAVERSERIE_GENERATOR")
    @Column(name = "ID_NOTA_VER_SERIE")
    @GenericGenerator(name = "SSER_NOTA_VER_SERIE_ID_NOTA_VER_SERIE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SSER_NOTA_VER_SERIE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SSER_NOTA_VER_SERIE_ID_NOTA_VER_SERIE_GENERATOR")
    public Long getIdNotaVerSerie() {
        return this.idNotaVerSerie;
    }

    public void setIdNotaVerSerie(Long idNotaVerSerie) {
        this.idNotaVerSerie = idNotaVerSerie;
    }

    @Column(name = "DS_NOTA_VER_SERIE")
    public String getDsNotaVerSerie() {
        return this.dsNotaVerSerie;
    }

    public void setDsNotaVerSerie(String dsNotaVerSerie) {
        this.dsNotaVerSerie = dsNotaVerSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_NOTA_VER_SERIE")
    public Date getDtNotaVerSerie() {
        return this.dtNotaVerSerie;
    }

    public void setDtNotaVerSerie(Date dtNotaVerSerie) {
        this.dtNotaVerSerie = dtNotaVerSerie;
    }

    @Column(name = "PG_NOTA_VER_SERIE")
    public BigDecimal getPgNotaVerSerie() {
        return this.pgNotaVerSerie;
    }

    public void setPgNotaVerSerie(BigDecimal pgNotaVerSerie) {
        this.pgNotaVerSerie = pgNotaVerSerie;
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

    // bi-directional many-to-one association to DecTipoNotaSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_NOTA_SERIE")
    public DecTipoNotaSerie getDecTipoNotaSerie() {
        return this.decTipoNotaSerie;
    }

    public void setDecTipoNotaSerie(DecTipoNotaSerie decTipoNotaSerie) {
        this.decTipoNotaSerie = decTipoNotaSerie;
    }

}
