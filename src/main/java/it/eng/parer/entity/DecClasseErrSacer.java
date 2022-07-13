/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author fioravanti_f
 */
@Entity
@Table(name = "DEC_CLASSE_ERR_SACER")
@NamedQueries({ @NamedQuery(name = "DecClasseErrSacer.findAll", query = "SELECT d FROM DecClasseErrSacer d"),
        // @NamedQuery(name = "DecClasseErrSacer.findByTiUsoErr", query = "SELECT d FROM DecClasseErrSacer d WHERE
        // d.tiUsoErr = :tiUsoErr ORDER BY d.cdClasseErrSacer"),
        @NamedQuery(name = "DecClasseErrSacer.findByTipiUsoErr", query = "SELECT d FROM DecClasseErrSacer d WHERE d.tiUsoErr IN :tipiUsoErr ORDER BY d.cdClasseErrSacer"),
        @NamedQuery(name = "DecClasseErrSacer.findByCodice", query = "SELECT d FROM DecClasseErrSacer d WHERE d.cdClasseErrSacer = :cdClasseErrSacer") })
public class DecClasseErrSacer implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idClasseErrSacer;
    private String tiUsoErr;
    private String cdClasseErrSacer;
    private String dsClasseErrSacer;
    private List<DecErrSacer> decErrSacers;

    public DecClasseErrSacer() {
    }

    @Id
    @SequenceGenerator(name = "DEC_CLASSE_ERR_SACER_IDCLASSEERRSACER_GENERATOR", sequenceName = "SDEC_CLASSE_ERR_SACER", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_CLASSE_ERR_SACER_IDCLASSEERRSACER_GENERATOR")
    @Column(name = "ID_CLASSE_ERR_SACER")
    public long getIdClasseErrSacer() {
        return idClasseErrSacer;
    }

    public void setIdClasseErrSacer(long idClasseErrSacer) {
        this.idClasseErrSacer = idClasseErrSacer;
    }

    @Column(name = "TI_USO_ERR")
    public String getTiUsoErr() {
        return tiUsoErr;
    }

    public void setTiUsoErr(String tiUsoErr) {
        this.tiUsoErr = tiUsoErr;
    }

    @Column(name = "CD_CLASSE_ERR")
    public String getCdClasseErrSacer() {
        return cdClasseErrSacer;
    }

    public void setCdClasseErrSacer(String cdClasseErrSacer) {
        this.cdClasseErrSacer = cdClasseErrSacer;
    }

    @Column(name = "DS_CLASSE_ERR")
    public String getDsClasseErrSacer() {
        return dsClasseErrSacer;
    }

    public void setDsClasseErrSacer(String dsClasseErrSacer) {
        this.dsClasseErrSacer = dsClasseErrSacer;
    }

    @OneToMany(mappedBy = "decClasseErrSacer")
    public List<DecErrSacer> getDecErrSacers() {
        return decErrSacers;
    }

    public void setDecErrSacers(List<DecErrSacer> decErrSacers) {
        this.decErrSacers = decErrSacers;
    }

}
