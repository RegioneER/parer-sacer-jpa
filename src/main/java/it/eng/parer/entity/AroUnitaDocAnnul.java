package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * The persistent class for the ARO_UNITA_DOC_ANNUL database table.
 *
 */
@Entity
@XmlRootElement
@Cacheable(true)
@Table(name = "ARO_UNITA_DOC_ANNUL")
public class AroUnitaDocAnnul implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUnitaDocAnnul;
    private BigDecimal aaKeyUnitaDoc;
    private String cdKeyUnitaDoc;
    private String cdRegistroKeyUnitaDoc;
    private Date dtAnnul;
    private OrgStrut orgStrut;

    public AroUnitaDocAnnul() {
    }

    @Id
    @SequenceGenerator(name = "ARO_UNITA_DOC_ANNUL_IDUNITADOCANNUL_GENERATOR", sequenceName = "SARO_UNITA_DOC_ANNUL", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_UNITA_DOC_ANNUL_IDUNITADOCANNUL_GENERATOR")
    @Column(name = "ID_UNITA_DOC_ANNUL")
    public long getIdUnitaDocAnnul() {
        return this.idUnitaDocAnnul;
    }

    public void setIdUnitaDocAnnul(long idUnitaDocAnnul) {
        this.idUnitaDocAnnul = idUnitaDocAnnul;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Column(name = "CD_KEY_UNITA_DOC")
    public String getCdKeyUnitaDoc() {
        return this.cdKeyUnitaDoc;
    }

    public void setCdKeyUnitaDoc(String cdKeyUnitaDoc) {
        this.cdKeyUnitaDoc = cdKeyUnitaDoc;
    }

    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC")
    public String getCdRegistroKeyUnitaDoc() {
        return this.cdRegistroKeyUnitaDoc;
    }

    public void setCdRegistroKeyUnitaDoc(String cdRegistroKeyUnitaDoc) {
        this.cdRegistroKeyUnitaDoc = cdRegistroKeyUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ANNUL")
    public Date getDtAnnul() {
        return this.dtAnnul;
    }

    public void setDtAnnul(Date dtAnnul) {
        this.dtAnnul = dtAnnul;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

}