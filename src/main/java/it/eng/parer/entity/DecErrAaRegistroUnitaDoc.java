package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_ERR_AA_REGISTRO_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "DEC_ERR_AA_REGISTRO_UNITA_DOC")
@NamedQuery(name = "DecErrAaRegistroUnitaDoc.findAll", query = "SELECT d FROM DecErrAaRegistroUnitaDoc d")
public class DecErrAaRegistroUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idErrAaRegistroUnitaDoc;
    private BigDecimal aaRegistroUnitaDoc;
    private String dsErrFmtNumero;
    private BigDecimal idUnitaDocErrFmtNumero;
    private DecAaRegistroUnitaDoc decAaRegistroUnitaDoc;

    public DecErrAaRegistroUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_ERR_AA_REGISTRO_UNITA_DOC_IDERRAAREGISTROUNITADOC_GENERATOR", sequenceName = "SDEC_ERR_AA_REGISTRO_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_ERR_AA_REGISTRO_UNITA_DOC_IDERRAAREGISTROUNITADOC_GENERATOR")
    @Column(name = "ID_ERR_AA_REGISTRO_UNITA_DOC")
    public long getIdErrAaRegistroUnitaDoc() {
        return this.idErrAaRegistroUnitaDoc;
    }

    public void setIdErrAaRegistroUnitaDoc(long idErrAaRegistroUnitaDoc) {
        this.idErrAaRegistroUnitaDoc = idErrAaRegistroUnitaDoc;
    }

    @Column(name = "AA_REGISTRO_UNITA_DOC")
    public BigDecimal getAaRegistroUnitaDoc() {
        return this.aaRegistroUnitaDoc;
    }

    public void setAaRegistroUnitaDoc(BigDecimal aaRegistroUnitaDoc) {
        this.aaRegistroUnitaDoc = aaRegistroUnitaDoc;
    }

    @Column(name = "DS_ERR_FMT_NUMERO")
    public String getDsErrFmtNumero() {
        return this.dsErrFmtNumero;
    }

    public void setDsErrFmtNumero(String dsErrFmtNumero) {
        this.dsErrFmtNumero = dsErrFmtNumero;
    }

    @Column(name = "ID_UNITA_DOC_ERR_FMT_NUMERO")
    public BigDecimal getIdUnitaDocErrFmtNumero() {
        return this.idUnitaDocErrFmtNumero;
    }

    public void setIdUnitaDocErrFmtNumero(BigDecimal idUnitaDocErrFmtNumero) {
        this.idUnitaDocErrFmtNumero = idUnitaDocErrFmtNumero;
    }

    // bi-directional many-to-one association to DecAaRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AA_REGISTRO_UNITA_DOC")
    public DecAaRegistroUnitaDoc getDecAaRegistroUnitaDoc() {
        return this.decAaRegistroUnitaDoc;
    }

    public void setDecAaRegistroUnitaDoc(DecAaRegistroUnitaDoc decAaRegistroUnitaDoc) {
        this.decAaRegistroUnitaDoc = decAaRegistroUnitaDoc;
    }

}