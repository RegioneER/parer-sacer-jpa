package it.eng.parer.grantedEntity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the APL_PARAM_APPLIC_REPORT database table.
 *
 */
@Entity
@Table(name = "SACER_IAM.APL_PARAM_APPLIC_REPORT")
@NamedQuery(name = "AplParamApplicReport.findByApplicReport", query = "SELECT o FROM AplParamApplicReport o WHERE o.nmApplic=:nmApplic AND o.nmReport=:nmReport")
public class AplParamApplicReport implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idParamApplicReport;
    private String nmApplic;
    private String nmReport;
    private String blFile1;
    private String blFile2;
    private String blFile3;

    public AplParamApplicReport() {
    }

    @Id
    @SequenceGenerator(name = "APL_PARAM_APPLIC_REPORT_IDPARAMAPPLICREPORT_GENERATOR", sequenceName = "SAPL_PARAM_APPLIC_REPORT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "APL_PARAM_APPLIC_REPORT_IDPARAMAPPLICREPORT_GENERATOR")
    @Column(name = "ID_PARAM_APPLIC_REPORT")
    public long getIdParamApplicReport() {
        return this.idParamApplicReport;
    }

    public void setIdParamApplicReport(long idParamApplicReport) {
        this.idParamApplicReport = idParamApplicReport;
    }

    @Column(name = "NM_APPLIC")
    public String getNmApplic() {
        return nmApplic;
    }

    public void setNmApplic(String nmApplic) {
        this.nmApplic = nmApplic;
    }

    @Column(name = "NM_REPORT")
    public String getNmReport() {
        return nmReport;
    }

    public void setNmReport(String nmReport) {
        this.nmReport = nmReport;
    }

    @Column(name = "BL_FILE_1")
    public String getBlFile1() {
        return blFile1;
    }

    public void setBlFile1(String blFile1) {
        this.blFile1 = blFile1;
    }

    @Column(name = "BL_FILE_2")
    public String getBlFile2() {
        return blFile2;
    }

    public void setBlFile2(String blFile2) {
        this.blFile2 = blFile2;
    }

    @Column(name = "BL_FILE_3")
    public String getBlFile3() {
        return blFile3;
    }

    public void setBlFile3(String blFile3) {
        this.blFile3 = blFile3;
    }

}
