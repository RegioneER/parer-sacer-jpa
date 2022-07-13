package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_WARN_AA_TIPO_FASCICOLO database table.
 * 
 */
@Entity
@Table(name = "DEC_WARN_AA_TIPO_FASCICOLO")
@NamedQuery(name = "DecWarnAaTipoFascicolo.findAll", query = "SELECT d FROM DecWarnAaTipoFascicolo d")
public class DecWarnAaTipoFascicolo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idWarnAaTipoFascicolo;
    private BigDecimal aaTipoFascicolo;
    private String flWarnAaTipoFascicolo;
    private DecAaTipoFascicolo decAaTipoFascicolo;

    public DecWarnAaTipoFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "DEC_WARN_AA_TIPO_FASCICOLO_IDWARNAATIPOFASCICOLO_GENERATOR", sequenceName = "SDEC_WARN_AA_TIPO_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_WARN_AA_TIPO_FASCICOLO_IDWARNAATIPOFASCICOLO_GENERATOR")
    @Column(name = "ID_WARN_AA_TIPO_FASCICOLO")
    public long getIdWarnAaTipoFascicolo() {
        return this.idWarnAaTipoFascicolo;
    }

    public void setIdWarnAaTipoFascicolo(long idWarnAaTipoFascicolo) {
        this.idWarnAaTipoFascicolo = idWarnAaTipoFascicolo;
    }

    @Column(name = "AA_TIPO_FASCICOLO")
    public BigDecimal getAaTipoFascicolo() {
        return this.aaTipoFascicolo;
    }

    public void setAaTipoFascicolo(BigDecimal aaTipoFascicolo) {
        this.aaTipoFascicolo = aaTipoFascicolo;
    }

    @Column(name = "FL_WARN_AA_TIPO_FASCICOLO")
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