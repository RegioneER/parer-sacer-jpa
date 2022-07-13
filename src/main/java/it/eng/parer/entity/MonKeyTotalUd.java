package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the MON_KEY_TOTAL_UD database table.
 * 
 */
@Entity
@Table(name = "MON_KEY_TOTAL_UD")
@NamedQuery(name = "MonKeyTotalUd.findAll", query = "SELECT m FROM MonKeyTotalUd m")
public class MonKeyTotalUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idKeyTotalUd;
    private BigDecimal aaKeyUnitaDoc;
    private Date dtLastUpdUd;
    private OrgStrut orgStrut;
    private OrgSubStrut orgSubStrut;
    private DecTipoDoc decTipoDocPrinc;
    private DecTipoUnitaDoc decTipoUnitaDoc;
    private DecRegistroUnitaDoc decRegistroUnitaDoc;
    private List<MonContaSesUpdUd> monContaSesUpdUds;

    public MonKeyTotalUd() {
    }

    @Id
    @SequenceGenerator(name = "MON_KEY_TOTAL_UD_IDKEYTOTALUD_GENERATOR", sequenceName = "SMON_KEY_TOTAL_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MON_KEY_TOTAL_UD_IDKEYTOTALUD_GENERATOR")
    @Column(name = "ID_KEY_TOTAL_UD")
    public long getIdKeyTotalUd() {
        return this.idKeyTotalUd;
    }

    public void setIdKeyTotalUd(long idKeyTotalUd) {
        this.idKeyTotalUd = idKeyTotalUd;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_LAST_UPD_UD")
    public Date getDtLastUpdUd() {
        return this.dtLastUpdUd;
    }

    public void setDtLastUpdUd(Date dtLastUpdUd) {
        this.dtLastUpdUd = dtLastUpdUd;
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

    // bi-directional many-to-one association to OrgSubStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SUB_STRUT")
    public OrgSubStrut getOrgSubStrut() {
        return this.orgSubStrut;
    }

    public void setOrgSubStrut(OrgSubStrut orgSubStrut) {
        this.orgSubStrut = orgSubStrut;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC_PRINC")
    public DecTipoDoc getDecTipoDocPrinc() {
        return this.decTipoDocPrinc;
    }

    public void setDecTipoDocPrinc(DecTipoDoc decTipoDocPrinc) {
        this.decTipoDocPrinc = decTipoDocPrinc;
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

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

    // bi-directional many-to-one association to MonContaSesUpdUd
    @OneToMany(mappedBy = "monKeyTotalUd")
    public List<MonContaSesUpdUd> getMonContaSesUpdUds() {
        return this.monContaSesUpdUds;
    }

    public void setMonContaSesUpdUds(List<MonContaSesUpdUd> monContaSesUpdUds) {
        this.monContaSesUpdUds = monContaSesUpdUds;
    }

}