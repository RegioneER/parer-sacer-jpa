package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;

/**
 * The persistent class for the DEC_WARN_AA_REGISTRO_UD database table.
 *
 */
@Entity
@Table(name = "DEC_WARN_AA_REGISTRO_UD")
@NamedQuery(name = "DecWarnAaRegistroUd.findAll", query = "SELECT d FROM DecWarnAaRegistroUd d")
public class DecWarnAaRegistroUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idWarnAaRegistroUnitaDoc;
    private BigDecimal aaRegistroUnitaDoc;
    private String flWarnAaRegistroUnitaDoc;
    private DecAaRegistroUnitaDoc decAaRegistroUnitaDoc;

    public DecWarnAaRegistroUd() {
    }

    @Id
    @SequenceGenerator(name = "DEC_WARN_AA_REGISTRO_UD_IDWARNAAREGISTROUNITADOC_GENERATOR", sequenceName = "SDEC_WARN_AA_REGISTRO_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_WARN_AA_REGISTRO_UD_IDWARNAAREGISTROUNITADOC_GENERATOR")
    @Column(name = "ID_WARN_AA_REGISTRO_UNITA_DOC")
    public long getIdWarnAaRegistroUnitaDoc() {
        return this.idWarnAaRegistroUnitaDoc;
    }

    public void setIdWarnAaRegistroUnitaDoc(long idWarnAaRegistroUnitaDoc) {
        this.idWarnAaRegistroUnitaDoc = idWarnAaRegistroUnitaDoc;
    }

    @Column(name = "AA_REGISTRO_UNITA_DOC")
    public BigDecimal getAaRegistroUnitaDoc() {
        return this.aaRegistroUnitaDoc;
    }

    public void setAaRegistroUnitaDoc(BigDecimal aaRegistroUnitaDoc) {
        this.aaRegistroUnitaDoc = aaRegistroUnitaDoc;
    }

    @Column(name = "FL_WARN_AA_REGISTRO_UNITA_DOC")
    public String getFlWarnAaRegistroUnitaDoc() {
        return this.flWarnAaRegistroUnitaDoc;
    }

    public void setFlWarnAaRegistroUnitaDoc(String flWarnAaRegistroUnitaDoc) {
        this.flWarnAaRegistroUnitaDoc = flWarnAaRegistroUnitaDoc;
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
