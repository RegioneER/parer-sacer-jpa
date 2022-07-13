package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the IAM_USER database table.
 *
 */
@Entity
@Table(name = "IAM_USER")
public class IamUser implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idUserIam;
    private String cdFisc;
    private String cdPsw;
    private String cdSalt;
    private String dsEmail;
    private Date dtRegPsw;
    private Date dtScadPsw;
    private String flAttivo;
    private String flContrIp;
    private String flUserAdmin;
    private String nmCognomeUser;
    private String nmNomeUser;
    private String nmUserid;
    private String tipoUser;
    private String tipoAuth;
    private List<AroUnitaDoc> aroUnitaDocs;
    private List<AroNotaUnitaDoc> aroNotaUnitaDocs;
    private List<DecNotaTipoSerie> decNotaTipoSeries;
    private List<ElvElencoVer> elvElencoVers1;
    private List<ElvElencoVer> elvElencoVers2;
    private List<ElvLogElencoVer> elvLogElencoVers;
    private List<IamAbilOrganiz> iamAbilOrganizs;
    private List<IamIndIpUser> iamIndIpUsers;
    private List<LogOper> logOpers;
    private List<RecSessioneRecup> recSessioneRecups;
    private List<SerConsistVerSerie> serConsistVerSeries;
    private List<SerFileInputVerSerie> serFileInputVerSeries;
    private List<SerNotaVerSerie> serNotaVerSeries;
    private List<SerStatoSerie> serStatoSeries;
    private List<SerStatoVerSerie> serStatoVerSeries;
    private List<VolVolumeConserv> volVolumeConservUserCreaziones;
    private List<VolVolumeConserv> volVolumeConservUserFirmaMarcas;
    private List<VrsSessioneVers> vrsSessioneVers;
    private List<AroStatoRichAnnulVers> aroStatoRichAnnulVers;
    private List<MonTipoUnitaDocUserVers> monTipoUnitaDocUserVers;
    private List<HsmSessioneFirma> hsmSessioneFirmas;
    private List<ElvStatoElencoVersFasc> elvStatoElencoVersFascs;

    public IamUser() {
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public long getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(long idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "CD_FISC")
    public String getCdFisc() {
        return this.cdFisc;
    }

    public void setCdFisc(String cdFisc) {
        this.cdFisc = cdFisc;
    }

    @Column(name = "CD_PSW")
    public String getCdPsw() {
        return this.cdPsw;
    }

    public void setCdPsw(String cdPsw) {
        this.cdPsw = cdPsw;
    }

    @Column(name = "CD_SALT")
    public String getCdSalt() {
        return this.cdSalt;
    }

    public void setCdSalt(String cdSalt) {
        this.cdSalt = cdSalt;
    }

    @Column(name = "DS_EMAIL")
    public String getDsEmail() {
        return this.dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_REG_PSW")
    public Date getDtRegPsw() {
        return this.dtRegPsw;
    }

    public void setDtRegPsw(Date dtRegPsw) {
        this.dtRegPsw = dtRegPsw;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_SCAD_PSW")
    public Date getDtScadPsw() {
        return this.dtScadPsw;
    }

    public void setDtScadPsw(Date dtScadPsw) {
        this.dtScadPsw = dtScadPsw;
    }

    @Column(name = "FL_ATTIVO")
    public String getFlAttivo() {
        return this.flAttivo;
    }

    public void setFlAttivo(String flAttivo) {
        this.flAttivo = flAttivo;
    }

    @Column(name = "FL_CONTR_IP")
    public String getFlContrIp() {
        return this.flContrIp;
    }

    public void setFlContrIp(String flContrIp) {
        this.flContrIp = flContrIp;
    }

    @Column(name = "FL_USER_ADMIN")
    public String getFlUserAdmin() {
        return this.flUserAdmin;
    }

    public void setFlUserAdmin(String flUserAdmin) {
        this.flUserAdmin = flUserAdmin;
    }

    @Column(name = "NM_COGNOME_USER")
    public String getNmCognomeUser() {
        return this.nmCognomeUser;
    }

    public void setNmCognomeUser(String nmCognomeUser) {
        this.nmCognomeUser = nmCognomeUser;
    }

    @Column(name = "NM_NOME_USER")
    public String getNmNomeUser() {
        return this.nmNomeUser;
    }

    public void setNmNomeUser(String nmNomeUser) {
        this.nmNomeUser = nmNomeUser;
    }

    @Column(name = "NM_USERID")
    public String getNmUserid() {
        return this.nmUserid;
    }

    public void setNmUserid(String nmUserid) {
        this.nmUserid = nmUserid;
    }

    @Column(name = "TIPO_USER")
    public String getTipoUser() {
        return this.tipoUser;
    }

    public void setTipoUser(String tipoUser) {
        this.tipoUser = tipoUser;
    }

    @Column(name = "TIPO_AUTH")
    public String getTipoAuth() {
        return this.tipoAuth;
    }

    public void setTipoAuth(String tipoAuth) {
        this.tipoAuth = tipoAuth;
    }

    // bi-directional many-to-one association to DecNotaTipoSerie
    @OneToMany(mappedBy = "iamUser")
    public List<DecNotaTipoSerie> getDecNotaTipoSeries() {
        return this.decNotaTipoSeries;
    }

    public void setDecNotaTipoSeries(List<DecNotaTipoSerie> decNotaTipoSeries) {
        this.decNotaTipoSeries = decNotaTipoSeries;
    }

    public DecNotaTipoSerie addDecNotaTipoSery(DecNotaTipoSerie decNotaTipoSery) {
        getDecNotaTipoSeries().add(decNotaTipoSery);
        decNotaTipoSery.setIamUser(this);

        return decNotaTipoSery;
    }

    public DecNotaTipoSerie removeDecNotaTipoSery(DecNotaTipoSerie decNotaTipoSery) {
        getDecNotaTipoSeries().remove(decNotaTipoSery);
        decNotaTipoSery.setIamUser(null);

        return decNotaTipoSery;
    }

    // bi-directional many-to-one association to IamAbilOrganiz
    @OneToMany(mappedBy = "iamUser", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<IamAbilOrganiz> getIamAbilOrganizs() {
        return this.iamAbilOrganizs;
    }

    public void setIamAbilOrganizs(List<IamAbilOrganiz> iamAbilOrganizs) {
        this.iamAbilOrganizs = iamAbilOrganizs;
    }

    // bi-directional many-to-one association to IamIndIpUser
    @OneToMany(mappedBy = "iamUser", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<IamIndIpUser> getIamIndIpUsers() {
        return this.iamIndIpUsers;
    }

    public void setIamIndIpUsers(List<IamIndIpUser> iamIndIpUsers) {
        this.iamIndIpUsers = iamIndIpUsers;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @OneToMany(mappedBy = "iamUser")
    public List<AroUnitaDoc> getAroUnitaDocs() {
        return this.aroUnitaDocs;
    }

    public void setAroUnitaDocs(List<AroUnitaDoc> aroUnitaDocs) {
        this.aroUnitaDocs = aroUnitaDocs;
    }

    // bi-directional many-to-one association to AroNotaUnitaDoc
    @OneToMany(mappedBy = "iamUser")
    public List<AroNotaUnitaDoc> getAroNotaUnitaDocs() {
        return this.aroNotaUnitaDocs;
    }

    public void setAroNotaUnitaDocs(List<AroNotaUnitaDoc> aroNotaUnitaDocs) {
        this.aroNotaUnitaDocs = aroNotaUnitaDocs;
    }

    // bi-directional many-to-one association to ElvElencoVer
    @OneToMany(mappedBy = "iamUserFirmaIndice")
    public List<ElvElencoVer> getElvElencoVers1() {
        return this.elvElencoVers1;
    }

    public void setElvElencoVers1(List<ElvElencoVer> elvElencoVers1) {
        this.elvElencoVers1 = elvElencoVers1;
    }

    // bi-directional many-to-one association to ElvElencoVer
    @OneToMany(mappedBy = "iamUserChiusoElenco")
    public List<ElvElencoVer> getElvElencoVers2() {
        return this.elvElencoVers2;
    }

    public void setElvElencoVers2(List<ElvElencoVer> elvElencoVers2) {
        this.elvElencoVers2 = elvElencoVers2;
    }

    // bi-directional many-to-one association to ElvLogElencoVer
    @OneToMany(mappedBy = "iamUser")
    public List<ElvLogElencoVer> getElvLogElencoVers() {
        return this.elvLogElencoVers;
    }

    public void setElvLogElencoVers(List<ElvLogElencoVer> elvLogElencoVers) {
        this.elvLogElencoVers = elvLogElencoVers;
    }

    // bi-directional many-to-one association to LogOper
    @OneToMany(mappedBy = "iamUser")
    public List<LogOper> getLogOpers() {
        return this.logOpers;
    }

    public void setLogOpers(List<LogOper> logOpers) {
        this.logOpers = logOpers;
    }

    // bi-directional many-to-one association to RecSessioneRecup
    @OneToMany(mappedBy = "iamUser")
    public List<RecSessioneRecup> getRecSessioneRecups() {
        return this.recSessioneRecups;
    }

    public void setRecSessioneRecups(List<RecSessioneRecup> recSessioneRecups) {
        this.recSessioneRecups = recSessioneRecups;
    }

    // bi-directional many-to-one association to VolVolumeConserv
    @OneToMany(mappedBy = "iamUserCreazione", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<VolVolumeConserv> getVolVolumeConservUserCreaziones() {
        return this.volVolumeConservUserCreaziones;
    }

    public void setVolVolumeConservUserCreaziones(List<VolVolumeConserv> volVolumeConservUserCreaziones) {
        this.volVolumeConservUserCreaziones = volVolumeConservUserCreaziones;
    }

    // bi-directional many-to-one association to VolVolumeConserv
    @OneToMany(mappedBy = "iamUserFirmaMarca")
    public List<VolVolumeConserv> getVolVolumeConservUserFirmaMarcas() {
        return this.volVolumeConservUserFirmaMarcas;
    }

    public void setVolVolumeConservUserFirmaMarcas(List<VolVolumeConserv> volVolumeConservUserFirmaMarcas) {
        this.volVolumeConservUserFirmaMarcas = volVolumeConservUserFirmaMarcas;
    }

    // bi-directional many-to-one association to VrsSessioneVers
    @OneToMany(mappedBy = "iamUser")
    public List<VrsSessioneVers> getVrsSessioneVers() {
        return this.vrsSessioneVers;
    }

    public void setVrsSessioneVers(List<VrsSessioneVers> vrsSessioneVers) {
        this.vrsSessioneVers = vrsSessioneVers;
    }

    // bi-directional many-to-one association to SerConsistVerSerie
    @OneToMany(mappedBy = "iamUser")
    public List<SerConsistVerSerie> getSerConsistVerSeries() {
        return this.serConsistVerSeries;
    }

    public void setSerConsistVerSeries(List<SerConsistVerSerie> serConsistVerSeries) {
        this.serConsistVerSeries = serConsistVerSeries;
    }

    public SerConsistVerSerie addSerConsistVerSery(SerConsistVerSerie serConsistVerSery) {
        getSerConsistVerSeries().add(serConsistVerSery);
        serConsistVerSery.setIamUser(this);

        return serConsistVerSery;
    }

    public SerConsistVerSerie removeSerConsistVerSery(SerConsistVerSerie serConsistVerSery) {
        getSerConsistVerSeries().remove(serConsistVerSery);
        serConsistVerSery.setIamUser(null);

        return serConsistVerSery;
    }

    // bi-directional many-to-one association to SerFileInputVerSerie
    @OneToMany(mappedBy = "iamUser")
    public List<SerFileInputVerSerie> getSerFileInputVerSeries() {
        return this.serFileInputVerSeries;
    }

    public void setSerFileInputVerSeries(List<SerFileInputVerSerie> serFileInputVerSeries) {
        this.serFileInputVerSeries = serFileInputVerSeries;
    }

    public SerFileInputVerSerie addSerFileInputVerSery(SerFileInputVerSerie serFileInputVerSery) {
        getSerFileInputVerSeries().add(serFileInputVerSery);
        serFileInputVerSery.setIamUser(this);

        return serFileInputVerSery;
    }

    public SerFileInputVerSerie removeSerFileInputVerSery(SerFileInputVerSerie serFileInputVerSery) {
        getSerFileInputVerSeries().remove(serFileInputVerSery);
        serFileInputVerSery.setIamUser(null);

        return serFileInputVerSery;
    }

    // bi-directional many-to-one association to SerNotaVerSerie
    @OneToMany(mappedBy = "iamUser")
    public List<SerNotaVerSerie> getSerNotaVerSeries() {
        return this.serNotaVerSeries;
    }

    public void setSerNotaVerSeries(List<SerNotaVerSerie> serNotaVerSeries) {
        this.serNotaVerSeries = serNotaVerSeries;
    }

    public SerNotaVerSerie addSerNotaVerSery(SerNotaVerSerie serNotaVerSery) {
        getSerNotaVerSeries().add(serNotaVerSery);
        serNotaVerSery.setIamUser(this);

        return serNotaVerSery;
    }

    public SerNotaVerSerie removeSerNotaVerSery(SerNotaVerSerie serNotaVerSery) {
        getSerNotaVerSeries().remove(serNotaVerSery);
        serNotaVerSery.setIamUser(null);

        return serNotaVerSery;
    }

    // bi-directional many-to-one association to SerStatoSerie
    @OneToMany(mappedBy = "iamUser")
    public List<SerStatoSerie> getSerStatoSeries() {
        return this.serStatoSeries;
    }

    public void setSerStatoSeries(List<SerStatoSerie> serStatoSeries) {
        this.serStatoSeries = serStatoSeries;
    }

    public SerStatoSerie addSerStatoSery(SerStatoSerie serStatoSery) {
        getSerStatoSeries().add(serStatoSery);
        serStatoSery.setIamUser(this);

        return serStatoSery;
    }

    public SerStatoSerie removeSerStatoSery(SerStatoSerie serStatoSery) {
        getSerStatoSeries().remove(serStatoSery);
        serStatoSery.setIamUser(null);

        return serStatoSery;
    }

    // bi-directional many-to-one association to SerStatoVerSerie
    @OneToMany(mappedBy = "iamUser")
    public List<SerStatoVerSerie> getSerStatoVerSeries() {
        return this.serStatoVerSeries;
    }

    public void setSerStatoVerSeries(List<SerStatoVerSerie> serStatoVerSeries) {
        this.serStatoVerSeries = serStatoVerSeries;
    }

    public SerStatoVerSerie addSerStatoVerSery(SerStatoVerSerie serStatoVerSery) {
        getSerStatoVerSeries().add(serStatoVerSery);
        serStatoVerSery.setIamUser(this);

        return serStatoVerSery;
    }

    public SerStatoVerSerie removeSerStatoVerSery(SerStatoVerSerie serStatoVerSery) {
        getSerStatoVerSeries().remove(serStatoVerSery);
        serStatoVerSery.setIamUser(null);

        return serStatoVerSery;
    }

    // bi-directional many-to-one association to AroStatoRichAnnulVer
    @OneToMany(mappedBy = "iamUser")
    public List<AroStatoRichAnnulVers> getAroStatoRichAnnulVers() {
        return this.aroStatoRichAnnulVers;
    }

    public void setAroStatoRichAnnulVers(List<AroStatoRichAnnulVers> aroStatoRichAnnulVers) {
        this.aroStatoRichAnnulVers = aroStatoRichAnnulVers;
    }

    public AroStatoRichAnnulVers addAroStatoRichAnnulVers(AroStatoRichAnnulVers aroStatoRichAnnulVers) {
        getAroStatoRichAnnulVers().add(aroStatoRichAnnulVers);
        aroStatoRichAnnulVers.setIamUser(this);

        return aroStatoRichAnnulVers;
    }

    public AroStatoRichAnnulVers removeAroStatoRichAnnulVers(AroStatoRichAnnulVers aroStatoRichAnnulVers) {
        getAroStatoRichAnnulVers().remove(aroStatoRichAnnulVers);
        aroStatoRichAnnulVers.setIamUser(null);

        return aroStatoRichAnnulVers;
    }

    // bi-directional many-to-one association to MonTipoUnitaDocUserVer
    @OneToMany(mappedBy = "iamUser")
    public List<MonTipoUnitaDocUserVers> getMonTipoUnitaDocUserVers() {
        return this.monTipoUnitaDocUserVers;
    }

    public void setMonTipoUnitaDocUserVers(List<MonTipoUnitaDocUserVers> monTipoUnitaDocUserVers) {
        this.monTipoUnitaDocUserVers = monTipoUnitaDocUserVers;
    }

    // bi-directional many-to-one association to HsmSessioneFirma
    @OneToMany(mappedBy = "iamUser")
    public List<HsmSessioneFirma> getHsmSessioneFirmas() {
        return this.hsmSessioneFirmas;
    }

    public void setHsmSessioneFirmas(List<HsmSessioneFirma> hsmSessioneFirmas) {
        this.hsmSessioneFirmas = hsmSessioneFirmas;
    }

    // bi-directional many-to-one association to ElvStatoElencoVersFasc
    @OneToMany(mappedBy = "iamUser")
    public List<ElvStatoElencoVersFasc> getElvStatoElencoVersFascs() {
        return this.elvStatoElencoVersFascs;
    }

    public void setElvStatoElencoVersFascs(List<ElvStatoElencoVersFasc> elvStatoElencoVersFascs) {
        this.elvStatoElencoVersFascs = elvStatoElencoVersFascs;
    }
}
