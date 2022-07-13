package it.eng.parer.grantedEntity;

import it.eng.parer.entity.AplSistemaVersante;
import it.eng.parer.grantedEntity.SIOrgEnteSiam;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the USR_USER database table.
 *
 */
@Entity
// @Table(name = "SACER_IAM.USR_USER")
@Table(name = "USR_USER", schema = "SACER_IAM")
@NamedQuery(name = "UsrUser.findAll", query = "SELECT u FROM UsrUser u")
public class UsrUser implements Serializable {

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
    private SIOrgEnteSiam siOrgEnteSiam;
    private AplSistemaVersante aplSistemaVersante;
    private BigDecimal idStatoUserCor;
    private List<UsrStatoUser> usrStatoUsers;

    public UsrUser() {
    }

    @Id
    @SequenceGenerator(name = "USR_USER_IDUSERIAM_GENERATOR", sequenceName = "SUSR_USER", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USR_USER_IDUSERIAM_GENERATOR")
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

    // bi-directional many-to-one association to SIOrgEnteSiam
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ENTE_SIAM")
    public SIOrgEnteSiam getSiOrgEnteSiam() {
        return this.siOrgEnteSiam;
    }

    public void setSiOrgEnteSiam(SIOrgEnteSiam siOrgEnteSiam) {
        this.siOrgEnteSiam = siOrgEnteSiam;
    }

    // bi-directional many-to-one association to AplSistemaVersante
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SISTEMA_VERSANTE")
    public AplSistemaVersante getAplSistemaVersante() {
        return this.aplSistemaVersante;
    }

    public void setAplSistemaVersante(AplSistemaVersante aplSistemaVersante) {
        this.aplSistemaVersante = aplSistemaVersante;
    }

    @Column(name = "ID_STATO_USER_COR")
    public BigDecimal getIdStatoUserCor() {
        return this.idStatoUserCor;
    }

    public void setIdStatoUserCor(BigDecimal idStatoUserCor) {
        this.idStatoUserCor = idStatoUserCor;
    }

    // bi-directional many-to-one association to UsrStatoUser
    @OneToMany(mappedBy = "usrUser", cascade = { CascadeType.PERSIST })
    public List<UsrStatoUser> getUsrStatoUsers() {
        return this.usrStatoUsers;
    }

    public void setUsrStatoUsers(List<UsrStatoUser> usrStatoUsers) {
        this.usrStatoUsers = usrStatoUsers;
    }
}
