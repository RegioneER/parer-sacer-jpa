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
 * The persistent class for the DEC_WARN_AA_TIPO_FASCICOLO database table.
 */
@Entity
@Table(name = "DEC_WARN_AA_TIPO_FASCICOLO")
@NamedQuery(name = "DecWarnAaTipoFascicolo.findAll", query = "SELECT d FROM DecWarnAaTipoFascicolo d")
public class DecWarnAaTipoFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idWarnAaTipoFascicolo;

    private BigDecimal aaTipoFascicolo;

    private String flWarnAaTipoFascicolo;

    private DecAaTipoFascicolo decAaTipoFascicolo;

    public DecWarnAaTipoFascicolo() {/* Hibernate */
    }

    @Id
    // "DEC_WARN_AA_TIPO_FASCICOLO_IDWARNAATIPOFASCICOLO_GENERATOR",
    // sequenceName =
    // "SDEC_WARN_AA_TIPO_FASCICOLO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_WARN_AA_TIPO_FASCICOLO_IDWARNAATIPOFASCICOLO_GENERATOR")
    @Column(name = "ID_WARN_AA_TIPO_FASCICOLO")
    @GenericGenerator(name = "SDEC_WARN_AA_TIPO_FASCICOLO_ID_WARN_AA_TIPO_FASCICOLO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_WARN_AA_TIPO_FASCICOLO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_WARN_AA_TIPO_FASCICOLO_ID_WARN_AA_TIPO_FASCICOLO_GENERATOR")
    public Long getIdWarnAaTipoFascicolo() {
        return this.idWarnAaTipoFascicolo;
    }

    public void setIdWarnAaTipoFascicolo(Long idWarnAaTipoFascicolo) {
        this.idWarnAaTipoFascicolo = idWarnAaTipoFascicolo;
    }

    @Column(name = "AA_TIPO_FASCICOLO")
    public BigDecimal getAaTipoFascicolo() {
        return this.aaTipoFascicolo;
    }

    public void setAaTipoFascicolo(BigDecimal aaTipoFascicolo) {
        this.aaTipoFascicolo = aaTipoFascicolo;
    }

    @Column(name = "FL_WARN_AA_TIPO_FASCICOLO", columnDefinition = "char(1)")
    public String getFlWarnAaTipoFascicolo() {
        return this.flWarnAaTipoFascicolo;
    }

    public void setFlWarnAaTipoFascicolo(String flWarnAaTipoFascicolo) {
        this.flWarnAaTipoFascicolo = flWarnAaTipoFascicolo;
    }

    // bi-directional many-to-one association to DecAaTipoFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AA_TIPO_FASCICOLO")
    public DecAaTipoFascicolo getDecAaTipoFascicolo() {
        return this.decAaTipoFascicolo;
    }

    public void setDecAaTipoFascicolo(DecAaTipoFascicolo decAaTipoFascicolo) {
        this.decAaTipoFascicolo = decAaTipoFascicolo;
    }

}
