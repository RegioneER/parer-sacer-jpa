package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the DEC_NOTA_MODELLO_TIPO_SERIE database table.
 * 
 */
@Entity
@Table(name = "DEC_NOTA_MODELLO_TIPO_SERIE")
@NamedQuery(name = "DecNotaModelloTipoSerie.findAll", query = "SELECT d FROM DecNotaModelloTipoSerie d")
public class DecNotaModelloTipoSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idNotaModelloTipoSerie;
    private String dsNotaTipoSerie;
    private Date dtNotaTipoSerie;
    private BigDecimal pgNotaTipoSerie;
    private DecModelloTipoSerie decModelloTipoSerie;
    private DecTipoNotaSerie decTipoNotaSerie;
    private IamUser iamUser;

    public DecNotaModelloTipoSerie() {
    }

    @Id
    @SequenceGenerator(name = "DEC_NOTA_MODELLO_TIPO_SERIE_IDNOTAMODELLOTIPOSERIE_GENERATOR", sequenceName = "SDEC_NOTA_MODELLO_TIPO_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_NOTA_MODELLO_TIPO_SERIE_IDNOTAMODELLOTIPOSERIE_GENERATOR")
    @Column(name = "ID_NOTA_MODELLO_TIPO_SERIE")
    public long getIdNotaModelloTipoSerie() {
        return this.idNotaModelloTipoSerie;
    }

    public void setIdNotaModelloTipoSerie(long idNotaModelloTipoSerie) {
        this.idNotaModelloTipoSerie = idNotaModelloTipoSerie;
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

    // bi-directional many-to-one association to DecModelloTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODELLO_TIPO_SERIE")
    public DecModelloTipoSerie getDecModelloTipoSerie() {
        return this.decModelloTipoSerie;
    }

    public void setDecModelloTipoSerie(DecModelloTipoSerie decModelloTipoSerie) {
        this.decModelloTipoSerie = decModelloTipoSerie;
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

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

}