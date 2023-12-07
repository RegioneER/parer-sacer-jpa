package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;

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

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the FAS_WARN_FASCICOLO database table.
 */
@Entity
@Table(name = "FAS_WARN_FASCICOLO")
@NamedQuery(name = "FasWarnFascicolo.findAll", query = "SELECT f FROM FasWarnFascicolo f")
public class FasWarnFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idWarnFascicolo;

    private String dsWarn;

    private BigDecimal pgWarn;

    private DecErrSacer decErrSacer;

    private FasFascicolo fasFascicolo;

    public FasWarnFascicolo() {/* Hibernate */
    }

    @Id
    // "FAS_WARN_FASCICOLO_IDWARNFASCICOLO_GENERATOR",
    // sequenceName = "SFAS_WARN_FASCICOLO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_WARN_FASCICOLO_IDWARNFASCICOLO_GENERATOR")
    @Column(name = "ID_WARN_FASCICOLO")
    @GenericGenerator(name = "SFAS_WARN_FASCICOLO_ID_WARN_FASCICOLO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_WARN_FASCICOLO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_WARN_FASCICOLO_ID_WARN_FASCICOLO_GENERATOR")
    public Long getIdWarnFascicolo() {
        return this.idWarnFascicolo;
    }

    public void setIdWarnFascicolo(Long idWarnFascicolo) {
        this.idWarnFascicolo = idWarnFascicolo;
    }

    @Column(name = "DS_WARN")
    public String getDsWarn() {
        return this.dsWarn;
    }

    public void setDsWarn(String dsWarn) {
        this.dsWarn = dsWarn;
    }

    @Column(name = "PG_WARN")
    public BigDecimal getPgWarn() {
        return this.pgWarn;
    }

    public void setPgWarn(BigDecimal pgWarn) {
        this.pgWarn = pgWarn;
    }

    // bi-directional many-to-one association to DecErrSacer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_SACER")
    public DecErrSacer getDecErrSacer() {
        return this.decErrSacer;
    }

    public void setDecErrSacer(DecErrSacer decErrSacer) {
        this.decErrSacer = decErrSacer;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
    }

}
