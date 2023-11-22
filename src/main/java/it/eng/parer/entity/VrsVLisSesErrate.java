package it.eng.parer.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the VRS_SESSIONE_VERS database table.
 */
@Entity
@Table(name = "VRS_V_LIS_SES_ERRATE")
public class VrsVLisSesErrate implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idSessioneVers;
    private LocalDateTime dtChiusura;
    private String flSessioneErrVerif;
    private String dsErr;
    private String cdErr;

    @Id
    @Column(name = "ID_SESSIONE_VERS")
    public Long getIdSessioneVers() {
        return this.idSessioneVers;
    }

    public void setIdSessioneVers(Long idSessioneVers) {
        this.idSessioneVers = idSessioneVers;
    }

    @Column(name = "DT_CHIUSURA")
    public LocalDateTime getDtChiusura() {
        return this.dtChiusura;
    }

    public void setDtChiusura(LocalDateTime dtChiusura) {
        this.dtChiusura = dtChiusura;
    }

    @Column(name = "DS_ERR")
    public String getDsErr() {
        return dsErr;
    }

    public void setDsErr(String dsErr) {
        this.dsErr = dsErr;
    }

    @Column(name = "CD_ERR")
    public String getCdErr() {
        return cdErr;
    }

    public void setCdErr(String cdErr) {
        this.cdErr = cdErr;
    }

    @Column(name = "FL_SESSIONE_ERR_VERIF", columnDefinition = "char")
    public String getFlSessioneErrVerif() {
        return flSessioneErrVerif;
    }

    public void setFlSessioneErrVerif(String flSessioneErrVerif) {
        this.flSessioneErrVerif = flSessioneErrVerif;
    }
}
