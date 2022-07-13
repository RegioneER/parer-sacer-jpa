package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the VRS_SES_FASCICOLO_ERR database table.
 *
 */
@Entity
@Table(name = "VRS_SES_FASCICOLO_ERR")
@NamedQuery(name = "VrsSesFascicoloErr.findAll", query = "SELECT v FROM VrsSesFascicoloErr v")
public class VrsSesFascicoloErr implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idSesFascicoloErr;
    private BigDecimal aaFascicolo;
    private String cdKeyFascicolo;
    private String dsErr;
    private String nmAmbiente;
    private String nmEnte;
    private String nmStrut;
    private String nmTipoFascicolo;
    private String nmUseridWs;
    private String tiStatoSes;
    private Date tsFineSes;
    private Date tsIniSes;
    private String cdVersioneWs;
    private String cdIndIpClient;
    private String cdIndServer;
    private DecErrSacer decErrSacer;
    private DecTipoFascicolo decTipoFascicolo;
    private OrgStrut orgStrut;
    private List<VrsXmlSesFascicoloErr> vrsXmlSesFascicoloErrs;

    public VrsSesFascicoloErr() {
    }

    @Id
    @SequenceGenerator(name = "VRS_SES_FASCICOLO_ERR_IDSESFASCICOLOERR_GENERATOR", sequenceName = "SVRS_SES_FASCICOLO_ERR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_SES_FASCICOLO_ERR_IDSESFASCICOLOERR_GENERATOR")
    @Column(name = "ID_SES_FASCICOLO_ERR")
    public long getIdSesFascicoloErr() {
        return this.idSesFascicoloErr;
    }

    public void setIdSesFascicoloErr(long idSesFascicoloErr) {
        this.idSesFascicoloErr = idSesFascicoloErr;
    }

    @Column(name = "AA_FASCICOLO")
    public BigDecimal getAaFascicolo() {
        return this.aaFascicolo;
    }

    public void setAaFascicolo(BigDecimal aaFascicolo) {
        this.aaFascicolo = aaFascicolo;
    }

    @Column(name = "CD_KEY_FASCICOLO")
    public String getCdKeyFascicolo() {
        return this.cdKeyFascicolo;
    }

    public void setCdKeyFascicolo(String cdKeyFascicolo) {
        this.cdKeyFascicolo = cdKeyFascicolo;
    }

    @Column(name = "DS_ERR")
    public String getDsErr() {
        return this.dsErr;
    }

    public void setDsErr(String dsErr) {
        this.dsErr = dsErr;
    }

    @Column(name = "NM_AMBIENTE")
    public String getNmAmbiente() {
        return this.nmAmbiente;
    }

    public void setNmAmbiente(String nmAmbiente) {
        this.nmAmbiente = nmAmbiente;
    }

    @Column(name = "NM_ENTE")
    public String getNmEnte() {
        return this.nmEnte;
    }

    public void setNmEnte(String nmEnte) {
        this.nmEnte = nmEnte;
    }

    @Column(name = "NM_STRUT")
    public String getNmStrut() {
        return this.nmStrut;
    }

    public void setNmStrut(String nmStrut) {
        this.nmStrut = nmStrut;
    }

    @Column(name = "NM_TIPO_FASCICOLO")
    public String getNmTipoFascicolo() {
        return this.nmTipoFascicolo;
    }

    public void setNmTipoFascicolo(String nmTipoFascicolo) {
        this.nmTipoFascicolo = nmTipoFascicolo;
    }

    @Column(name = "NM_USERID_WS")
    public String getNmUseridWs() {
        return this.nmUseridWs;
    }

    public void setNmUseridWs(String nmUseridWs) {
        this.nmUseridWs = nmUseridWs;
    }

    @Column(name = "TI_STATO_SES")
    public String getTiStatoSes() {
        return this.tiStatoSes;
    }

    public void setTiStatoSes(String tiStatoSes) {
        this.tiStatoSes = tiStatoSes;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_FINE_SES")
    public Date getTsFineSes() {
        return this.tsFineSes;
    }

    public void setTsFineSes(Date tsFineSes) {
        this.tsFineSes = tsFineSes;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_INI_SES")
    public Date getTsIniSes() {
        return this.tsIniSes;
    }

    public void setTsIniSes(Date tsIniSes) {
        this.tsIniSes = tsIniSes;
    }

    @Column(name = "CD_VERSIONE_WS")
    public String getCdVersioneWs() {
        return cdVersioneWs;
    }

    public void setCdVersioneWs(String cdVersioneWs) {
        this.cdVersioneWs = cdVersioneWs;
    }

    @Column(name = "CD_IND_IP_CLIENT")
    public String getCdIndIpClient() {
        return cdIndIpClient;
    }

    public void setCdIndIpClient(String cdIndIpClient) {
        this.cdIndIpClient = cdIndIpClient;
    }

    @Column(name = "CD_IND_SERVER")
    public String getCdIndServer() {
        return cdIndServer;
    }

    public void setCdIndServer(String cdIndServer) {
        this.cdIndServer = cdIndServer;
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

    // bi-directional many-to-one association to DecTipoFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_FASCICOLO")
    public DecTipoFascicolo getDecTipoFascicolo() {
        return this.decTipoFascicolo;
    }

    public void setDecTipoFascicolo(DecTipoFascicolo decTipoFascicolo) {
        this.decTipoFascicolo = decTipoFascicolo;
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

    // bi-directional many-to-one association to VrsXmlSesFascicoloErr
    @OneToMany(mappedBy = "vrsSesFascicoloErr")
    public List<VrsXmlSesFascicoloErr> getVrsXmlSesFascicoloErrs() {
        return this.vrsXmlSesFascicoloErrs;
    }

    public void setVrsXmlSesFascicoloErrs(List<VrsXmlSesFascicoloErr> vrsXmlSesFascicoloErrs) {
        this.vrsXmlSesFascicoloErrs = vrsXmlSesFascicoloErrs;
    }

    public VrsXmlSesFascicoloErr addVrsXmlSesFascicoloErr(VrsXmlSesFascicoloErr vrsXmlSesFascicoloErr) {
        getVrsXmlSesFascicoloErrs().add(vrsXmlSesFascicoloErr);
        vrsXmlSesFascicoloErr.setVrsSesFascicoloErr(this);

        return vrsXmlSesFascicoloErr;
    }

    public VrsXmlSesFascicoloErr removeVrsXmlSesFascicoloErr(VrsXmlSesFascicoloErr vrsXmlSesFascicoloErr) {
        getVrsXmlSesFascicoloErrs().remove(vrsXmlSesFascicoloErr);
        vrsXmlSesFascicoloErr.setVrsSesFascicoloErr(null);

        return vrsXmlSesFascicoloErr;
    }

}
