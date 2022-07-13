package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_CONTENUTO_COMP database table.
 *
 */
@Entity
@Table(name = "ARO_CONTENUTO_COMP")
public class AroContenutoComp implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idContenComp;
    private BigDecimal aaKeyUnitaDoc;
    private byte[] blContenComp;
    private BigDecimal idStrut;
    private AroCompDoc aroCompDoc;
    private BigDecimal mmVers;

    public AroContenutoComp() {
    }

    @Id
    @SequenceGenerator(name = "ARO_CONTENUTO_COMP_IDCONTENCOMP_GENERATOR", sequenceName = "SARO_CONTENUTO_COMP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_CONTENUTO_COMP_IDCONTENCOMP_GENERATOR")
    @Column(name = "ID_CONTEN_COMP")
    public long getIdContenComp() {
        return this.idContenComp;
    }

    public void setIdContenComp(long idContenComp) {
        this.idContenComp = idContenComp;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Lob()
    @Column(name = "BL_CONTEN_COMP")
    public byte[] getBlContenComp() {
        return this.blContenComp;
    }

    public void setBlContenComp(byte[] blContenComp) {
        this.blContenComp = blContenComp;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "MM_VERS")
    public BigDecimal getMmVers() {
        return this.mmVers;
    }

    public void setMmVers(BigDecimal mmVers) {
        this.mmVers = mmVers;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_STRUT_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }
}