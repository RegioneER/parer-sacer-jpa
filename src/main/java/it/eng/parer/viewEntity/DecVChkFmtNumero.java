package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_V_CHK_FMT_NUMERO database table.
 *
 */
@Entity
@Table(name = "DEC_V_CHK_FMT_NUMERO")
public class DecVChkFmtNumero implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flFmtNumeroOk;
    private BigDecimal idAaRegistroUnitaDoc;
    private BigDecimal idRegistroUnitaDoc;
    private BigDecimal idStrut;

    public DecVChkFmtNumero() {/* Hibernate */
    }

    @Column(name = "FL_FMT_NUMERO_OK", columnDefinition = "char(1)")
    public String getFlFmtNumeroOk() {
        return this.flFmtNumeroOk;
    }

    public void setFlFmtNumeroOk(String flFmtNumeroOk) {
        this.flFmtNumeroOk = flFmtNumeroOk;
    }

    @Id
    @Column(name = "ID_AA_REGISTRO_UNITA_DOC")
    public BigDecimal getIdAaRegistroUnitaDoc() {
        return this.idAaRegistroUnitaDoc;
    }

    public void setIdAaRegistroUnitaDoc(BigDecimal idAaRegistroUnitaDoc) {
        this.idAaRegistroUnitaDoc = idAaRegistroUnitaDoc;
    }

    @Column(name = "ID_REGISTRO_UNITA_DOC")
    public BigDecimal getIdRegistroUnitaDoc() {
        return this.idRegistroUnitaDoc;
    }

    public void setIdRegistroUnitaDoc(BigDecimal idRegistroUnitaDoc) {
        this.idRegistroUnitaDoc = idRegistroUnitaDoc;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

}
