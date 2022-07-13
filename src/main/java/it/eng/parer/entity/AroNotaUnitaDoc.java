package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_NOTA_UNITA_DOC database table.
 * 
 */
@Entity
@Table(name = "ARO_NOTA_UNITA_DOC")
@NamedQuery(name = "AroNotaUnitaDoc.findAll", query = "SELECT s FROM AroNotaUnitaDoc s")
public class AroNotaUnitaDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idNotaUnitaDoc;
    private String dsNotaUnitaDoc;
    private Date dtNotaUnitaDoc;
    private BigDecimal pgNotaUnitaDoc;
    private IamUser iamUser;
    private AroUnitaDoc aroUnitaDoc;
    private AroVerIndiceAipUd aroVerIndiceAipUd;
    private DecTipoNotaUnitaDoc decTipoNotaUnitaDoc;

    public AroNotaUnitaDoc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_NOTA_UNITA_DOC_IDNOTAUNITADOC_GENERATOR", sequenceName = "SARO_NOTA_UNITA_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_NOTA_UNITA_DOC_IDNOTAUNITADOC_GENERATOR")
    @Column(name = "ID_NOTA_UNITA_DOC")
    public long getIdNotaUnitaDoc() {
        return this.idNotaUnitaDoc;
    }

    public void setIdNotaUnitaDoc(long idNotaUnitaDoc) {
        this.idNotaUnitaDoc = idNotaUnitaDoc;
    }

    @Column(name = "DS_NOTA_UNITA_DOC")
    public String getDsNotaUnitaDoc() {
        return this.dsNotaUnitaDoc;
    }

    public void setDsNotaUnitaDoc(String dsNotaUnitaDoc) {
        this.dsNotaUnitaDoc = dsNotaUnitaDoc;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_NOTA_UNITA_DOC")
    public Date getDtNotaUnitaDoc() {
        return this.dtNotaUnitaDoc;
    }

    public void setDtNotaUnitaDoc(Date dtNotaUnitaDoc) {
        this.dtNotaUnitaDoc = dtNotaUnitaDoc;
    }

    @Column(name = "PG_NOTA_UNITA_DOC")
    public BigDecimal getPgNotaUnitaDoc() {
        return this.pgNotaUnitaDoc;
    }

    public void setPgNotaUnitaDoc(BigDecimal pgNotaUnitaDoc) {
        this.pgNotaUnitaDoc = pgNotaUnitaDoc;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
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

    // bi-directional many-to-one association to AroVerIndiceAipUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VER_INDICE_AIP")
    public AroVerIndiceAipUd getAroVerIndiceAipUd() {
        return this.aroVerIndiceAipUd;
    }

    public void setAroVerIndiceAipUd(AroVerIndiceAipUd aroVerIndiceAipUd) {
        this.aroVerIndiceAipUd = aroVerIndiceAipUd;
    }

    // bi-directional many-to-one association to DecTipoNotaUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_NOTA_UNITA_DOC")
    public DecTipoNotaUnitaDoc getDecTipoNotaUnitaDoc() {
        return this.decTipoNotaUnitaDoc;
    }

    public void setDecTipoNotaUnitaDoc(DecTipoNotaUnitaDoc decTipoNotaUnitaDoc) {
        this.decTipoNotaUnitaDoc = decTipoNotaUnitaDoc;
    }

}