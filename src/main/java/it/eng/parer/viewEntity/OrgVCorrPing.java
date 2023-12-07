package it.eng.parer.viewEntity;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author gpiccioli
 * 
 *         The persistent class for the ORG_V_CORR_PING database table.
 */
@Entity
@Cacheable(true)
@Table(name = "ORG_V_CORR_PING")
public class OrgVCorrPing implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idDichVersSacer;

    private Long idVers;

    private String nmVers;

    private String tiDichVers;

    private Long idOrganizIam;

    private Long idOrganizApplic;

    private String nmEntita;

    private String nmAmbienteVers;

    public OrgVCorrPing() {

    }

    @Column(name = "ID_DICH_VERS_SACER")
    @Id
    public Long getIdDichVersSacer() {
        return this.idDichVersSacer;
    }

    public void setIdDichVersSacer(Long idDichVersSacer) {
        this.idDichVersSacer = idDichVersSacer;
    }

    @Column(name = "ID_VERS")
    public Long getIdVers() {
        return this.idVers;
    }

    public void setIdVers(Long idVers) {
        this.idVers = idVers;
    }

    @Column(name = "NM_VERS")
    public String getNmVers() {
        return this.nmVers;
    }

    public void setNmVers(String nmVers) {
        this.nmVers = nmVers;
    }

    @Column(name = "TI_DICH_VERS")
    public String getTiDichVers() {
        return this.tiDichVers;
    }

    public void setTiDichVers(String tiDichVers) {
        this.tiDichVers = tiDichVers;
    }

    @Column(name = "ID_ORGANIZ_IAM")
    public Long getIdOrganizIam() {
        return this.idOrganizIam;
    }

    public void setIdOrganizIam(Long idOrganizIam) {
        this.idOrganizIam = idOrganizIam;
    }

    @Column(name = "ID_ORGANIZ_APPLIC")
    public Long getIdOrganizApplic() {
        return this.idOrganizApplic;
    }

    public void setIdOrganizApplic(Long idOrganizApplic) {
        this.idOrganizApplic = idOrganizApplic;
    }

    @Column(name = "NM_ENTITA")
    public String getNmEntita() {
        return this.nmEntita;
    }

    public void setNmEntita(String nmEntita) {
        this.nmEntita = nmEntita;
    }

    @Column(name = "NM_AMBIENTE_VERS")
    public String getNmAmbienteVers() {
        return this.nmAmbienteVers;
    }

    public void setNmAmbienteVers(String nmAmbienteVers) {
        this.nmAmbienteVers = nmAmbienteVers;
    }

}
