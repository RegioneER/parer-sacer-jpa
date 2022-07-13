package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_AA_UNITA_DOC_REGISTRO database table.
 *
 */
@Entity
@Table(name = "MON_AA_UNITA_DOC_REGISTRO")
public class MonAaUnitaDocRegistro implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idAaUnitaDocRegistro;
    private BigDecimal aaUnitaDocRegistro;
    private DecRegistroUnitaDoc decRegistroUnitaDoc;

    public MonAaUnitaDocRegistro() {
    }

    @Id
    @SequenceGenerator(name = "MON_AA_UNITA_DOC_REGISTRO_IDAAUNITADOCREGISTRO_GENERATOR", sequenceName = "SMON_AA_UNITA_DOC_REGISTRO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MON_AA_UNITA_DOC_REGISTRO_IDAAUNITADOCREGISTRO_GENERATOR")
    @Column(name = "ID_AA_UNITA_DOC_REGISTRO")
    public long getIdAaUnitaDocRegistro() {
        return this.idAaUnitaDocRegistro;
    }

    public void setIdAaUnitaDocRegistro(long idAaUnitaDocRegistro) {
        this.idAaUnitaDocRegistro = idAaUnitaDocRegistro;
    }

    @Column(name = "AA_UNITA_DOC_REGISTRO")
    public BigDecimal getAaUnitaDocRegistro() {
        return this.aaUnitaDocRegistro;
    }

    public void setAaUnitaDocRegistro(BigDecimal aaUnitaDocRegistro) {
        this.aaUnitaDocRegistro = aaUnitaDocRegistro;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_UNITA_DOC")
    public DecRegistroUnitaDoc getDecRegistroUnitaDoc() {
        return this.decRegistroUnitaDoc;
    }

    public void setDecRegistroUnitaDoc(DecRegistroUnitaDoc decRegistroUnitaDoc) {
        this.decRegistroUnitaDoc = decRegistroUnitaDoc;
    }
}