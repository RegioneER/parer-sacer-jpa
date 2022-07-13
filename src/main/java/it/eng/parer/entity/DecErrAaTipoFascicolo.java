package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_ERR_AA_TIPO_FASCICOLO database table.
 * 
 */
@Entity
@Table(name = "DEC_ERR_AA_TIPO_FASCICOLO")
@NamedQuery(name = "DecErrAaTipoFascicolo.findAll", query = "SELECT d FROM DecErrAaTipoFascicolo d")
public class DecErrAaTipoFascicolo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idErrAaTipoFascicolo;
    private BigDecimal aaFascicolo;
    private String dsErrFmtNumero;
    private BigDecimal idFascicoloErrFmtNumero;
    private DecAaTipoFascicolo decAaTipoFascicolo;

    public DecErrAaTipoFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "DEC_ERR_AA_TIPO_FASCICOLO_IDERRAATIPOFASCICOLO_GENERATOR", sequenceName = "SDEC_ERR_AA_TIPO_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_ERR_AA_TIPO_FASCICOLO_IDERRAATIPOFASCICOLO_GENERATOR")
    @Column(name = "ID_ERR_AA_TIPO_FASCICOLO")
    public long getIdErrAaTipoFascicolo() {
        return this.idErrAaTipoFascicolo;
    }

    public void setIdErrAaTipoFascicolo(long idErrAaTipoFascicolo) {
        this.idErrAaTipoFascicolo = idErrAaTipoFascicolo;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "DS_ERR_FMT_NUMERO")
    public String getDsErrFmtNumero() {
        return this.dsErrFmtNumero;
    }

    public void setDsErrFmtNumero(String dsErrFmtNumero) {
        this.dsErrFmtNumero = dsErrFmtNumero;
    }

    @Column(name = "ID_FASCICOLO_ERR_FMT_NUMERO")
    public BigDecimal getIdFascicoloErrFmtNumero() {
        return this.idFascicoloErrFmtNumero;
    }

    public void setIdFascicoloErrFmtNumero(BigDecimal idFascicoloErrFmtNumero) {
        this.idFascicoloErrFmtNumero = idFascicoloErrFmtNumero;
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