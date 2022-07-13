package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the FIR_REPORT database table.
 *
 */
@Entity
@Table(name = "FIR_REPORT")
@NamedQuery(name = "FirReport.findAll", query = "SELECT f FROM FirReport f")
public class FirReport implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFirReport;
    private AroCompDoc aroCompDoc;
    private List<FirUrnReport> firUrnReports;
    private byte[] blContenutoReport;
    private String cdKeyFile;
    private String nmBucket;

    public FirReport() {
    }

    @Id
    @SequenceGenerator(name = "FIR_REPORT_IDFIRREPORT_GENERATOR", sequenceName = "SFIR_REPORT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FIR_REPORT_IDFIRREPORT_GENERATOR")
    @Column(name = "ID_FIR_REPORT")
    public Long getIdFirReport() {
        return this.idFirReport;
    }

    public void setIdFirReport(Long idFirReport) {
        this.idFirReport = idFirReport;
    }

    @Lob()
    @Column(name = "BL_CONTENUTO_REPORT")
    public byte[] getBlContenutoReport() {
        return blContenutoReport;
    }

    public void setBlContenutoReport(byte[] blContenutoReport) {
        this.blContenutoReport = blContenutoReport;
    }

    @Column(name = "CD_KEY_FILE")
    public String getCdKeyFile() {
        return this.cdKeyFile;
    }

    public void setCdKeyFile(String cdKeyFile) {
        this.cdKeyFile = cdKeyFile;
    }

    @Column(name = "NM_BUCKET")
    public String getNmBucket() {
        return this.nmBucket;
    }

    public void setNmBucket(String nmBucket) {
        this.nmBucket = nmBucket;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne
    @JoinColumn(name = "ID_COMP_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

    // bi-directional many-to-one association to DecReportServizioVerificaCompDoc
    @OneToMany(mappedBy = "firReport", cascade = { CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE,
            CascadeType.REFRESH }, fetch = FetchType.LAZY)
    public List<FirUrnReport> getFirUrnReports() {
        return firUrnReports;
    }

    public void setFirUrnReports(List<FirUrnReport> firUrnReports) {
        this.firUrnReports = firUrnReports;
    }

}
