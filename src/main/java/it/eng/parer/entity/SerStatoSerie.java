package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the SER_STATO_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_STATO_SERIE")
@NamedQuery(name = "SerStatoSerie.findAll", query = "SELECT s FROM SerStatoSerie s")
public class SerStatoSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idStatoSerie;
    private String dsAzione;
    private String dsNotaAzione;
    private Date dtRegStatoSerie;
    private BigDecimal pgStatoSerie;
    private String tiStatoSerie;
    private IamUser iamUser;
    private SerSerie serSerie;

    public SerStatoSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_STATO_SERIE_IDSTATOSERIE_GENERATOR", sequenceName = "SSER_STATO_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_STATO_SERIE_IDSTATOSERIE_GENERATOR")
    @Column(name = "ID_STATO_SERIE")
    public long getIdStatoSerie() {
        return this.idStatoSerie;
    }

    public void setIdStatoSerie(long idStatoSerie) {
        this.idStatoSerie = idStatoSerie;
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
    @Column(name = "DT_REG_STATO_SERIE")
    public Date getDtRegStatoSerie() {
        return this.dtRegStatoSerie;
    }

    public void setDtRegStatoSerie(Date dtRegStatoSerie) {
        this.dtRegStatoSerie = dtRegStatoSerie;
    }

    @Column(name = "PG_STATO_SERIE")
    public BigDecimal getPgStatoSerie() {
        return this.pgStatoSerie;
    }

    public void setPgStatoSerie(BigDecimal pgStatoSerie) {
        this.pgStatoSerie = pgStatoSerie;
    }

    @Column(name = "TI_STATO_SERIE")
    public String getTiStatoSerie() {
        return this.tiStatoSerie;
    }

    public void setTiStatoSerie(String tiStatoSerie) {
        this.tiStatoSerie = tiStatoSerie;
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

    // bi-directional many-to-one association to SerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SERIE")
    public SerSerie getSerSerie() {
        return this.serSerie;
    }

    public void setSerSerie(SerSerie serSerie) {
        this.serSerie = serSerie;
    }

}