package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the DEC_NOTA_TIPO_SERIE database table.
 * 
 */
@Entity
@Table(name = "DEC_NOTA_TIPO_SERIE")
@NamedQuery(name = "DecNotaTipoSerie.findAll", query = "SELECT d FROM DecNotaTipoSerie d")
public class DecNotaTipoSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idNotaTipoSerie;
    private String dsNotaTipoSerie;
    private Date dtNotaTipoSerie;
    private BigDecimal pgNotaTipoSerie;
    private DecTipoSerie decTipoSerie;
    private IamUser iamUser;
    private DecTipoNotaSerie decTipoNotaSerie;

    public DecNotaTipoSerie() {
    }

    @Id
    @SequenceGenerator(name = "DEC_NOTA_TIPO_SERIE_IDNOTATIPOSERIE_GENERATOR", sequenceName = "SDEC_NOTA_TIPO_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_NOTA_TIPO_SERIE_IDNOTATIPOSERIE_GENERATOR")
    @Column(name = "ID_NOTA_TIPO_SERIE")
    public long getIdNotaTipoSerie() {
        return this.idNotaTipoSerie;
    }

    public void setIdNotaTipoSerie(long idNotaTipoSerie) {
        this.idNotaTipoSerie = idNotaTipoSerie;
    }

    @Column(name = "DS_NOTA_TIPO_SERIE")
    public String getDsNotaTipoSerie() {
        return this.dsNotaTipoSerie;
    }

    public void setDsNotaTipoSerie(String dsNotaTipoSerie) {
        this.dsNotaTipoSerie = dsNotaTipoSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_NOTA_TIPO_SERIE")
    public Date getDtNotaTipoSerie() {
        return this.dtNotaTipoSerie;
    }

    public void setDtNotaTipoSerie(Date dtNotaTipoSerie) {
        this.dtNotaTipoSerie = dtNotaTipoSerie;
    }

    @Column(name = "PG_NOTA_TIPO_SERIE")
    public BigDecimal getPgNotaTipoSerie() {
        return this.pgNotaTipoSerie;
    }

    public void setPgNotaTipoSerie(BigDecimal pgNotaTipoSerie) {
        this.pgNotaTipoSerie = pgNotaTipoSerie;
    }

    // bi-directional many-to-one association to DecTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERIE")
    public DecTipoSerie getDecTipoSerie() {
        return this.decTipoSerie;
    }

    public void setDecTipoSerie(DecTipoSerie decTipoSerie) {
        this.decTipoSerie = decTipoSerie;
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