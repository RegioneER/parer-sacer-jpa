package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import it.eng.parer.entity.constraint.FiUrnReport.TiUrnReport;

/**
 * The persistent class for the ELV_URN_ELENCO_VERS database table.
 * 
 */
@Entity
@Table(name = "FIR_URN_REPORT")
@NamedQuery(name = "FirUrnReport.findAll", query = "SELECT s FROM FirUrnReport s")
public class FirUrnReport implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idUrnReport;
    private String dsUrn;
    private TiUrnReport tiUrn;
    private FirReport firReport;

    public FirUrnReport() {
    }

    @Id
    @SequenceGenerator(name = "FIR_URN_REPORT_IDURNREPORT_GENERATOR", sequenceName = "SFIR_URN_REPORT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FIR_URN_REPORT_IDURNREPORT_GENERATOR")
    @Column(name = "ID_URN_REPORT")
    public Long getIdUrnReport() {
        return this.idUrnReport;
    }

    public void setIdUrnReport(Long idUrnReport) {
        this.idUrnReport = idUrnReport;
    }

    @Column(name = "DS_URN")
    public String getDsUrn() {
        return this.dsUrn;
    }

    public void setDsUrn(String dsUrn) {
        this.dsUrn = dsUrn;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_URN")
    public TiUrnReport getTiUrn() {
        return this.tiUrn;
    }

    public void setTiUrn(TiUrnReport tiUrn) {
        this.tiUrn = tiUrn;
    }

    // bi-directional many-to-one association to ElvElencoVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REPORT")
    public FirReport getFirReport() {
        return this.firReport;
    }

    public void setFirReport(FirReport firReport) {
        this.firReport = firReport;
    }

}