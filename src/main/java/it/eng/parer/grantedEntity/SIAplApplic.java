/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.parer.grantedEntity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author fioravanti_f
 */
@Entity
@Table(name = "SACER_IAM.APL_APPLIC")
public class SIAplApplic implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idApplic;
    private String cdPswReplicaUser;
    private String dsApplic;
    private String dsUrlReplicaUser;
    private String nmApplic;
    private String nmUserReplicaUser;
    private List<SLLogLoginUser> sLLogLoginUsers;
    private List<SIAplTipoOrganiz> aplTipoOrganizs;
    private List<SIUsrOrganizIam> usrOrganizIams;

    public SIAplApplic() {
    }

    @Id
    @SequenceGenerator(name = "APL_APPLIC_IDAPPLIC_GENERATOR", sequenceName = "SACER_IAM.SAPL_APPLIC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APL_APPLIC_IDAPPLIC_GENERATOR")
    @Column(name = "ID_APPLIC")
    public long getIdApplic() {
        return this.idApplic;
    }

    public void setIdApplic(long idApplic) {
        this.idApplic = idApplic;
    }

    @Column(name = "CD_PSW_REPLICA_USER")
    public String getCdPswReplicaUser() {
        return this.cdPswReplicaUser;
    }

    public void setCdPswReplicaUser(String cdPswReplicaUser) {
        this.cdPswReplicaUser = cdPswReplicaUser;
    }

    @Column(name = "DS_APPLIC")
    public String getDsApplic() {
        return this.dsApplic;
    }

    public void setDsApplic(String dsApplic) {
        this.dsApplic = dsApplic;
    }

    @Column(name = "DS_URL_REPLICA_USER")
    public String getDsUrlReplicaUser() {
        return this.dsUrlReplicaUser;
    }

    public void setDsUrlReplicaUser(String dsUrlReplicaUser) {
        this.dsUrlReplicaUser = dsUrlReplicaUser;
    }

    @Column(name = "NM_APPLIC")
    public String getNmApplic() {
        return this.nmApplic;
    }

    public void setNmApplic(String nmApplic) {
        this.nmApplic = nmApplic;
    }

    @Column(name = "NM_USER_REPLICA_USER")
    public String getNmUserReplicaUser() {
        return this.nmUserReplicaUser;
    }

    public void setNmUserReplicaUser(String nmUserReplicaUser) {
        this.nmUserReplicaUser = nmUserReplicaUser;
    }

    @OneToMany(mappedBy = "sIAplApplic")
    public List<SLLogLoginUser> getsLLogLoginUsers() {
        return sLLogLoginUsers;
    }

    public void setsLLogLoginUsers(List<SLLogLoginUser> sLLogLoginUsers) {
        this.sLLogLoginUsers = sLLogLoginUsers;
    }

    @OneToMany(mappedBy = "sIAplApplic")
    public List<SIAplTipoOrganiz> getAplTipoOrganizs() {
        return aplTipoOrganizs;
    }

    public void setAplTipoOrganizs(List<SIAplTipoOrganiz> aplTipoOrganizs) {
        this.aplTipoOrganizs = aplTipoOrganizs;
    }

    @OneToMany(mappedBy = "sIAplApplic")
    public List<SIUsrOrganizIam> getUsrOrganizIams() {
        return usrOrganizIams;
    }

    public void setUsrOrganizIams(List<SIUsrOrganizIam> usrOrganizIams) {
        this.usrOrganizIams = usrOrganizIams;
    }

}
