package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.VrsErrSesUpdUnitaDocErr.TiErrVrsErrSesUpdUnitaDocErr;

import java.math.BigDecimal;

/**
 * The persistent class for the VRS_ERR_SES_UPD_UNITA_DOC_ERR database table.
 * 
 */
@Entity
@Table(name = "VRS_ERR_SES_UPD_UNITA_DOC_ERR")
@NamedQuery(name = "VrsErrSesUpdUnitaDocErr.findAll", query = "SELECT v FROM VrsErrSesUpdUnitaDocErr v")
public class VrsErrSesUpdUnitaDocErr implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idErrSesUpdUnitaDocErr;
    private String dsErr;
    private String flErrPrinc;
    private DecControlloWs decControlloWs;
    private DecErrSacer decErrSacer;
    private VrsSesUpdUnitaDocErr vrsSesUpdUnitaDocErr;
    private BigDecimal pgErr;
    private TiErrVrsErrSesUpdUnitaDocErr tiErr;

    public VrsErrSesUpdUnitaDocErr() {
    }

    @Id
    @SequenceGenerator(name = "VRS_ERR_SES_UPD_UNITA_DOC_ERR_IDERRSESUPDUNITADOCERR_GENERATOR", sequenceName = "SVRS_ERR_SES_UPD_UNITA_DOC_ERR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_ERR_SES_UPD_UNITA_DOC_ERR_IDERRSESUPDUNITADOCERR_GENERATOR")
    @Column(name = "ID_ERR_SES_UPD_UNITA_DOC_ERR")
    public long getIdErrSesUpdUnitaDocErr() {
        return this.idErrSesUpdUnitaDocErr;
    }

    public void setIdErrSesUpdUnitaDocErr(long idErrSesUpdUnitaDocErr) {
        this.idErrSesUpdUnitaDocErr = idErrSesUpdUnitaDocErr;
    }

    @Column(name = "DS_ERR")
    public String getDsErr() {
        return this.dsErr;
    }

    public void setDsErr(String dsErr) {
        this.dsErr = dsErr;
    }

    @Column(name = "FL_ERR_PRINC")
    public String getFlErrPrinc() {
        return this.flErrPrinc;
    }

    public void setFlErrPrinc(String flErrPrinc) {
        this.flErrPrinc = flErrPrinc;
    }

    // bi-directional many-to-one association to DecErrSacer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONTROLLO_WS")
    public DecControlloWs getDecControlloWs() {
        return this.decControlloWs;
    }

    public void setDecControlloWs(DecControlloWs decControlloWs) {
        this.decControlloWs = decControlloWs;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_SACER")
    public DecErrSacer getDecErrSacer() {
        return this.decErrSacer;
    }

    public void setDecErrSacer(DecErrSacer decErrSacer) {
        this.decErrSacer = decErrSacer;
    }

    // bi-directional many-to-one association to DecErrSacer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SES_UPD_UNITA_DOC_ERR")
    public VrsSesUpdUnitaDocErr getVrsSesUpdUnitaDocErr() {
        return this.vrsSesUpdUnitaDocErr;
    }

    public void setVrsSesUpdUnitaDocErr(VrsSesUpdUnitaDocErr vrsSesUpdUnitaDocErr) {
        this.vrsSesUpdUnitaDocErr = vrsSesUpdUnitaDocErr;
    }

    @Column(name = "PG_ERR")
    public BigDecimal getPgErr() {
        return this.pgErr;
    }

    public void setPgErr(BigDecimal pgErr) {
        this.pgErr = pgErr;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_ERR")
    public TiErrVrsErrSesUpdUnitaDocErr getTiErr() {
        return this.tiErr;
    }

    public void setTiErr(TiErrVrsErrSesUpdUnitaDocErr tiErr) {
        this.tiErr = tiErr;
    }

}