package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the SER_ERR_CONTENUTO_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_ERR_CONTENUTO_VER_SERIE")
@NamedQuery(name = "SerErrContenutoVerSerie.findAll", query = "SELECT s FROM SerErrContenutoVerSerie s")
public class SerErrContenutoVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idErrContenutoVerSerie;
    private String dlErr;
    private BigDecimal pgErr;
    private String tiErr;
    private String tiGravitaErr;
    private String tiOrigineErr;
    private SerContenutoVerSerie serContenutoVerSerie;
    private List<SerUdNonVersErr> serUdNonVersErrs;

    public SerErrContenutoVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_ERR_CONTENUTO_VER_SERIE_IDERRCONTENUTOVERSERIE_GENERATOR", sequenceName = "SSER_ERR_CONTENUTO_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_ERR_CONTENUTO_VER_SERIE_IDERRCONTENUTOVERSERIE_GENERATOR")
    @Column(name = "ID_ERR_CONTENUTO_VER_SERIE")
    public long getIdErrContenutoVerSerie() {
        return this.idErrContenutoVerSerie;
    }

    public void setIdErrContenutoVerSerie(long idErrContenutoVerSerie) {
        this.idErrContenutoVerSerie = idErrContenutoVerSerie;
    }

    @Column(name = "DL_ERR")
    public String getDlErr() {
        return this.dlErr;
    }

    public void setDlErr(String dlErr) {
        this.dlErr = dlErr;
    }

    @Column(name = "PG_ERR")
    public BigDecimal getPgErr() {
        return this.pgErr;
    }

    public void setPgErr(BigDecimal pgErr) {
        this.pgErr = pgErr;
    }

    @Column(name = "TI_ERR")
    public String getTiErr() {
        return this.tiErr;
    }

    public void setTiErr(String tiErr) {
        this.tiErr = tiErr;
    }

    @Column(name = "TI_GRAVITA_ERR")
    public String getTiGravitaErr() {
        return this.tiGravitaErr;
    }

    public void setTiGravitaErr(String tiGravitaErr) {
        this.tiGravitaErr = tiGravitaErr;
    }

    @Column(name = "TI_ORIGINE_ERR")
    public String getTiOrigineErr() {
        return this.tiOrigineErr;
    }

    public void setTiOrigineErr(String tiOrigineErr) {
        this.tiOrigineErr = tiOrigineErr;
    }

    // bi-directional many-to-one association to SerContenutoVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTENUTO_VER_SERIE")
    public SerContenutoVerSerie getSerContenutoVerSerie() {
        return this.serContenutoVerSerie;
    }

    public void setSerContenutoVerSerie(SerContenutoVerSerie serContenutoVerSerie) {
        this.serContenutoVerSerie = serContenutoVerSerie;
    }

    // bi-directional many-to-one association to SerUdNonVersErr
    @OneToMany(mappedBy = "serErrContenutoVerSerie", cascade = CascadeType.PERSIST)
    public List<SerUdNonVersErr> getSerUdNonVersErrs() {
        return this.serUdNonVersErrs;
    }

    public void setSerUdNonVersErrs(List<SerUdNonVersErr> serUdNonVersErrs) {
        this.serUdNonVersErrs = serUdNonVersErrs;
    }

    public SerUdNonVersErr addSerUdNonVersErr(SerUdNonVersErr serUdNonVersErr) {
        getSerUdNonVersErrs().add(serUdNonVersErr);
        serUdNonVersErr.setSerErrContenutoVerSerie(this);

        return serUdNonVersErr;
    }

    public SerUdNonVersErr removeSerUdNonVersErr(SerUdNonVersErr serUdNonVersErr) {
        getSerUdNonVersErrs().remove(serUdNonVersErr);
        serUdNonVersErr.setSerErrContenutoVerSerie(null);

        return serUdNonVersErr;
    }

}