package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_V_CHK_FMT_NUMERO_FASC database table.
 *
 */
@Entity
@Table(name = "DEC_V_CHK_FMT_NUMERO_FASC")
@NamedQuery(name = "DecVChkFmtNumeroFasc.findAll", query = "SELECT d FROM DecVChkFmtNumeroFasc d")
public class DecVChkFmtNumeroFasc implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flFmtNumeroOk;
    private BigDecimal idAaTipoFascicolo;
    private BigDecimal idStrut;
    private BigDecimal idTipoFascicolo;

    public DecVChkFmtNumeroFasc() {/* Hibernate */
    }

    @Column(name = "FL_FMT_NUMERO_OK", columnDefinition = "char(1)")
    public String getFlFmtNumeroOk() {
        return this.flFmtNumeroOk;
    }

    public void setFlFmtNumeroOk(String flFmtNumeroOk) {
        this.flFmtNumeroOk = flFmtNumeroOk;
    }

    @Id
    @Column(name = "ID_AA_TIPO_FASCICOLO")
    public BigDecimal getIdAaTipoFascicolo() {
        return this.idAaTipoFascicolo;
    }

    public void setIdAaTipoFascicolo(BigDecimal idAaTipoFascicolo) {
        this.idAaTipoFascicolo = idAaTipoFascicolo;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_TIPO_FASCICOLO")
    public BigDecimal getIdTipoFascicolo() {
        return this.idTipoFascicolo;
    }

    public void setIdTipoFascicolo(BigDecimal idTipoFascicolo) {
        this.idTipoFascicolo = idTipoFascicolo;
    }

}
