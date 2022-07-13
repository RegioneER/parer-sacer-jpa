package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the OST_MIGRAZ_STRUT_MESE database table.
 *
 */
@Entity
@Table(name = "OST_MIGRAZ_STRUT_MESE")
@NamedQuery(name = "OstMigrazStrutMese.findAll", query = "SELECT o FROM OstMigrazStrutMese o")
public class OstMigrazStrutMese implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idMigrazStrutMese;
    private Date dtVersFine;
    private Date dtVersIni;
    private String flFileAggiunti;
    private BigDecimal idStrut;
    private BigDecimal mmVers;
    private OstMigrazSubPart ostMigrazSubPart;

    public OstMigrazStrutMese() {
    }

    @Id
    @SequenceGenerator(name = "OST_MIGRAZ_STRUT_MESE_IDMIGRAZSTRUTMESE_GENERATOR", sequenceName = "SOST_MIGRAZ_STRUT_MESE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OST_MIGRAZ_STRUT_MESE_IDMIGRAZSTRUTMESE_GENERATOR")
    @Column(name = "ID_MIGRAZ_STRUT_MESE")
    public long getIdMigrazStrutMese() {
        return this.idMigrazStrutMese;
    }

    public void setIdMigrazStrutMese(long idMigrazStrutMese) {
        this.idMigrazStrutMese = idMigrazStrutMese;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS_FINE")
    public Date getDtVersFine() {
        return this.dtVersFine;
    }

    public void setDtVersFine(Date dtVersFine) {
        this.dtVersFine = dtVersFine;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_VERS_INI")
    public Date getDtVersIni() {
        return this.dtVersIni;
    }

    public void setDtVersIni(Date dtVersIni) {
        this.dtVersIni = dtVersIni;
    }

    @Column(name = "FL_FILE_AGGIUNTI")
    public String getFlFileAggiunti() {
        return this.flFileAggiunti;
    }

    public void setFlFileAggiunti(String flFileAggiunti) {
        this.flFileAggiunti = flFileAggiunti;
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

    // bi-directional many-to-one association to OstMigrazSubPart
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MIGRAZ_SUB_PART")
    public OstMigrazSubPart getOstMigrazSubPart() {
        return this.ostMigrazSubPart;
    }

    public void setOstMigrazSubPart(OstMigrazSubPart ostMigrazSubPart) {
        this.ostMigrazSubPart = ostMigrazSubPart;
    }

}
