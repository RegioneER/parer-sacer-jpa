package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_WARN_UPD_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_WARN_UPD_UNITA_DOC")
@NamedQuery(name = "AroWarnUpdUnitaDoc.findAll", query = "SELECT a FROM AroWarnUpdUnitaDoc a")
public class AroWarnUpdUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idWarnUpdUnitaDoc;
    private String dsErr;
    private DecControlloWs decControlloWs;
    private DecErrSacer decErrSacer;
    private AroUpdUnitaDoc aroUpdUnitaDoc;
    private BigDecimal pgWarn;

    public AroWarnUpdUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_WARN_UPD_UNITA_DOC_IDWARNUPDUNITADOC_GENERATOR", sequenceName = "SARO_WARN_UPD_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_WARN_UPD_UNITA_DOC_IDWARNUPDUNITADOC_GENERATOR")
    @Column(name = "ID_WARN_UPD_UNITA_DOC")
    public long getIdWarnUpdUnitaDoc() {
        return this.idWarnUpdUnitaDoc;
    }

    public void setIdWarnUpdUnitaDoc(long idWarnUpdUnitaDoc) {
        this.idWarnUpdUnitaDoc = idWarnUpdUnitaDoc;
    }

    @Column(name = "DS_ERR")
    public String getDsErr() {
        return this.dsErr;
    }

    public void setDsErr(String dsErr) {
        this.dsErr = dsErr;
    }

    // bi-directional many-to-one association to DecControlloWs
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTROLLO_WS")
    public DecControlloWs getDecControlloWs() {
        return this.decControlloWs;
    }

    public void setDecControlloWs(DecControlloWs decControlloWs) {
        this.decControlloWs = decControlloWs;
    }

    // bi-directional many-to-one association to DecErrSacer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_SACER")
    public DecErrSacer getDecErrSacer() {
        return this.decErrSacer;
    }

    public void setDecErrSacer(DecErrSacer decErrSacer) {
        this.decErrSacer = decErrSacer;
    }

    // bi-directional one-to-one association to AroUpdUnitaDoc
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UPD_UNITA_DOC")
    public AroUpdUnitaDoc getAroUpdUnitaDoc() {
        return this.aroUpdUnitaDoc;
    }

    public void setAroUpdUnitaDoc(AroUpdUnitaDoc aroUpdUnitaDoc) {
        this.aroUpdUnitaDoc = aroUpdUnitaDoc;
    }

    @Column(name = "PG_WARN")
    public BigDecimal getPgWarn() {
        return this.pgWarn;
    }

    public void setPgWarn(BigDecimal pgWarn) {
        this.pgWarn = pgWarn;
    }

}