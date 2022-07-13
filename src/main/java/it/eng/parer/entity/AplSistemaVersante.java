package it.eng.parer.entity;

import it.eng.parer.grantedEntity.UsrUser;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;

/**
 * The persistent class for the APL_SISTEMA_VERSANTE database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.APL_SISTEMA_VERSANTE")
@NamedQuery(name = "AplSistemaVersante.findAll", query = "SELECT a FROM AplSistemaVersante a")
public class AplSistemaVersante implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idSistemaVersante;
    private String cdVersione;
    private String dsSistemaVersante;
    private String nmSistemaVersante;
    private List<UsrUser> usrUsers;
    private List<DecTipoStrutUdSisVer> decTipoStrutUdSisVers;

    public AplSistemaVersante() {
    }

    @Id
    @SequenceGenerator(name = "APL_SISTEMA_VERSANTE_IDSISTEMAVERSANTE_GENERATOR", sequenceName = "SACER_IAM.SAPL_SISTEMA_VERSANTE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APL_SISTEMA_VERSANTE_IDSISTEMAVERSANTE_GENERATOR")
    @Column(name = "ID_SISTEMA_VERSANTE")
    public long getIdSistemaVersante() {
        return this.idSistemaVersante;
    }

    public void setIdSistemaVersante(long idSistemaVersante) {
        this.idSistemaVersante = idSistemaVersante;
    }

    @XmlTransient
    @Column(name = "CD_VERSIONE")
    public String getCdVersione() {
        return this.cdVersione;
    }

    public void setCdVersione(String cdVersione) {
        this.cdVersione = cdVersione;
    }

    @XmlTransient
    @Column(name = "DS_SISTEMA_VERSANTE")
    public String getDsSistemaVersante() {
        return this.dsSistemaVersante;
    }

    public void setDsSistemaVersante(String dsSistemaVersante) {
        this.dsSistemaVersante = dsSistemaVersante;
    }

    @Column(name = "NM_SISTEMA_VERSANTE")
    public String getNmSistemaVersante() {
        return this.nmSistemaVersante;
    }

    public void setNmSistemaVersante(String nmSistemaVersante) {
        this.nmSistemaVersante = nmSistemaVersante;
    }

    // bi-directional many-to-one association to UsrUser
    @OneToMany(mappedBy = "aplSistemaVersante")
    @XmlTransient
    public List<UsrUser> getUsrUsers() {
        return this.usrUsers;
    }

    public void setUsrUsers(List<UsrUser> usrUsers) {
        this.usrUsers = usrUsers;
    }

    public UsrUser addUsrUser(UsrUser usrUser) {
        getUsrUsers().add(usrUser);
        usrUser.setAplSistemaVersante(this);

        return usrUser;
    }

    public UsrUser removeUsrUser(UsrUser usrUser) {
        getUsrUsers().remove(usrUser);
        usrUser.setAplSistemaVersante(null);

        return usrUser;
    }

    // bi-directional many-to-one association to DecTipoStrutSisVer
    @OneToMany(mappedBy = "aplSistemaVersante", cascade = CascadeType.PERSIST)
    @XmlTransient
    public List<DecTipoStrutUdSisVer> getDecTipoStrutUdSisVers() {
        return this.decTipoStrutUdSisVers;
    }

    public void setDecTipoStrutUdSisVers(List<DecTipoStrutUdSisVer> decTipoStrutUdSisVers) {
        this.decTipoStrutUdSisVers = decTipoStrutUdSisVers;
    }

}
