package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_WARN_UNITA_DOC database table.
 *
 */
@Entity
@Table(name = "ARO_WARN_UNITA_DOC")
public class AroWarnUnitaDoc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idWarnUnitaDoc;
    private String cdWarn;
    private String dsWarn;
    private BigDecimal pgWarnUnitaDoc;
    private String tiEntitaSacer;
    private AroDoc aroDoc;
    private AroUnitaDoc aroUnitaDoc;

    public AroWarnUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_WARN_UNITA_DOC_IDWARNUNITADOC_GENERATOR", sequenceName = "SARO_WARN_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_WARN_UNITA_DOC_IDWARNUNITADOC_GENERATOR")
    @Column(name = "ID_WARN_UNITA_DOC")
    public long getIdWarnUnitaDoc() {
        return this.idWarnUnitaDoc;
    }

    public void setIdWarnUnitaDoc(long idWarnUnitaDoc) {
        this.idWarnUnitaDoc = idWarnUnitaDoc;
    }

    @Column(name = "CD_WARN")
    public String getCdWarn() {
        return this.cdWarn;
    }

    public void setCdWarn(String cdWarn) {
        this.cdWarn = cdWarn;
    }

    @Column(name = "DS_WARN")
    public String getDsWarn() {
        return this.dsWarn;
    }

    public void setDsWarn(String dsWarn) {
        this.dsWarn = dsWarn;
    }

    @Column(name = "PG_WARN_UNITA_DOC")
    public BigDecimal getPgWarnUnitaDoc() {
        return this.pgWarnUnitaDoc;
    }

    public void setPgWarnUnitaDoc(BigDecimal pgWarnUnitaDoc) {
        this.pgWarnUnitaDoc = pgWarnUnitaDoc;
    }

    @Column(name = "TI_ENTITA_SACER")
    public String getTiEntitaSacer() {
        return this.tiEntitaSacer;
    }

    public void setTiEntitaSacer(String tiEntitaSacer) {
        this.tiEntitaSacer = tiEntitaSacer;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOC")
    public AroDoc getAroDoc() {
        return this.aroDoc;
    }

    public void setAroDoc(AroDoc aroDoc) {
        this.aroDoc = aroDoc;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }
}