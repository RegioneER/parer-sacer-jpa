package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the MON_KEY_TOTAL_UD_KO database table.
 * 
 */
@Entity
@Table(name = "MON_KEY_TOTAL_UD_KO")
@NamedQuery(name = "MonKeyTotalUdKo.findAll", query = "SELECT m FROM MonKeyTotalUdKo m")
public class MonKeyTotalUdKo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idKeyTotalUdKo;
    private BigDecimal aaKeyUnitaDoc;
    private Date dtLastUpdUdKo;
    private OrgStrut orgStrut;
    private DecTipoDoc decTipoDocPrinc;
    private DecTipoUnitaDoc decTipoUnitaDoc;
    private DecRegistroUnitaDoc decRegistroUnitaDoc;
    private List<MonContaSesUpdUdKo> monContaSesUpdUdKos;

    public MonKeyTotalUdKo() {
    }

    @Id
    @SequenceGenerator(name = "MON_KEY_TOTAL_UD_KO_IDKEYTOTALUDKO_GENERATOR", sequenceName = "SMON_KEY_TOTAL_UD_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MON_KEY_TOTAL_UD_KO_IDKEYTOTALUDKO_GENERATOR")
    @Column(name = "ID_KEY_TOTAL_UD_KO")
    public long getIdKeyTotalUdKo() {
        return this.idKeyTotalUdKo;
    }

    public void setIdKeyTotalUdKo(long idKeyTotalUdKo) {
        this.idKeyTotalUdKo = idKeyTotalUdKo;
    }

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "DT_LAST_UPD_UD_KO")
    public Date getDtLastUpdUdKo() {
        return this.dtLastUpdUdKo;
    }

    public void setDtLastUpdUdKo(Date dtLastUpdUdKo) {
        this.dtLastUpdUdKo = dtLastUpdUdKo;
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

    // bi-directional many-to-one association to MonContaSesUpdUdKo
    @OneToMany(mappedBy = "monKeyTotalUdKo")
    public List<MonContaSesUpdUdKo> getMonContaSesUpdUdKos() {
        return this.monContaSesUpdUdKos;
    }

    public void setMonContaSesUpdUdKos(List<MonContaSesUpdUdKo> monContaSesUpdUdKos) {
        this.monContaSesUpdUdKos = monContaSesUpdUdKos;
    }

}