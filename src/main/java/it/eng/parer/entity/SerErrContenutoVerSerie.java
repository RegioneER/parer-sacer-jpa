package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the SER_ERR_CONTENUTO_VER_SERIE database table.
 */
@Entity
@Table(name = "SER_ERR_CONTENUTO_VER_SERIE")
@NamedQuery(name = "SerErrContenutoVerSerie.findAll", query = "SELECT s FROM SerErrContenutoVerSerie s")
public class SerErrContenutoVerSerie implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idErrContenutoVerSerie;

    private String dlErr;

    private BigDecimal pgErr;

    private String tiErr;

    private String tiGravitaErr;

    private String tiOrigineErr;

    private SerContenutoVerSerie serContenutoVerSerie;

    private List<SerUdNonVersErr> serUdNonVersErrs = new ArrayList<>();

    public SerErrContenutoVerSerie() {/* Hibernate */
    }

    @Id
    // "SER_ERR_CONTENUTO_VER_SERIE_IDERRCONTENUTOVERSERIE_GENERATOR",
    // sequenceName =
    // "SSER_ERR_CONTENUTO_VER_SERIE",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "SER_ERR_CONTENUTO_VER_SERIE_IDERRCONTENUTOVERSERIE_GENERATOR")
    @Column(name = "ID_ERR_CONTENUTO_VER_SERIE")
    @GenericGenerator(name = "SSER_ERR_CONTENUTO_VER_SERIE_ID_ERR_CONTENUTO_VER_SERIE_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SSER_ERR_CONTENUTO_VER_SERIE"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SSER_ERR_CONTENUTO_VER_SERIE_ID_ERR_CONTENUTO_VER_SERIE_GENERATOR")
    public Long getIdErrContenutoVerSerie() {
        return this.idErrContenutoVerSerie;
    }

    public void setIdErrContenutoVerSerie(Long idErrContenutoVerSerie) {
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
