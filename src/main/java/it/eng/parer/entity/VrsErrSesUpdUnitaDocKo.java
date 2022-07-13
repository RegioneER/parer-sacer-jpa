package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.VrsErrUpdUnitaDocKo.TiErrVrsErrUpdUnitaDocKo;

import java.math.BigDecimal;

/**
 * The persistent class for the VRS_ERR_SES_UPD_UNITA_DOC_KO database table.
 * 
 */
@Entity
@Table(name = "VRS_ERR_SES_UPD_UNITA_DOC_KO")
@NamedQuery(name = "VrsErrSesUpdUnitaDocKo.findAll", query = "SELECT v FROM VrsErrSesUpdUnitaDocKo v")
public class VrsErrSesUpdUnitaDocKo implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idErrSesUpdUnitaDocKo;
    private String dsErr;
    private String flErrPrinc;
    private DecControlloWs decControlloWs;
    private DecErrSacer decErrSacer;
    private VrsSesUpdUnitaDocKo vrsSesUpdUnitaDocKo;
    private BigDecimal pgErr;
    private TiErrVrsErrUpdUnitaDocKo tiErr;

    public VrsErrSesUpdUnitaDocKo() {
    }

    @Id
    @SequenceGenerator(name = "VRS_ERR_SES_UPD_UNITA_DOC_KO_IDERRSESUPDUNITADOCKO_GENERATOR", sequenceName = "SVRS_ERR_SES_UPD_UNITA_DOC_KO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_ERR_SES_UPD_UNITA_DOC_KO_IDERRSESUPDUNITADOCKO_GENERATOR")
    @Column(name = "ID_ERR_SES_UPD_UNITA_DOC_KO")
    public long getIdErrSesUpdUnitaDocKo() {
        return this.idErrSesUpdUnitaDocKo;
    }

    public void setIdErrSesUpdUnitaDocKo(long idErrSesUpdUnitaDocKo) {
        this.idErrSesUpdUnitaDocKo = idErrSesUpdUnitaDocKo;
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

    // bi-directional many-to-one association to DecErrSacer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_SACER")
    public DecErrSacer getDecErrSacer() {
        return this.decErrSacer;
    }

    public void setDecErrSacer(DecErrSacer decErrSacer) {
        this.decErrSacer = decErrSacer;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SES_UPD_UNITA_DOC_KO")
    public VrsSesUpdUnitaDocKo getVrsSesUpdUnitaDocKo() {
        return this.vrsSesUpdUnitaDocKo;
    }

    public void setVrsSesUpdUnitaDocKo(VrsSesUpdUnitaDocKo vrsSesUpdUnitaDocKo) {
        this.vrsSesUpdUnitaDocKo = vrsSesUpdUnitaDocKo;
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
    public TiErrVrsErrUpdUnitaDocKo getTiErr() {
        return this.tiErr;
    }

    public void setTiErr(TiErrVrsErrUpdUnitaDocKo tiErr) {
        this.tiErr = tiErr;
    }

}