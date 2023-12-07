package it.eng.parer.grantedEntity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the APL_PARAM_APPLIC_REPORT database table.
 */
@Entity
@Table(schema = "SACER_IAM", name = "APL_PARAM_APPLIC_REPORT")
@NamedQuery(name = "AplParamApplicReport.findByApplicReport", query = "SELECT o FROM AplParamApplicReport o WHERE o.nmApplic=:nmApplic AND o.nmReport=:nmReport")
public class AplParamApplicReport implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idParamApplicReport;

    private String nmApplic;

    private String nmReport;

    private String blFile1;

    private String blFile2;

    private String blFile3;

    public AplParamApplicReport() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_PARAM_APPLIC_REPORT")
    public Long getIdParamApplicReport() {
        return this.idParamApplicReport;
    }

    public void setIdParamApplicReport(Long idParamApplicReport) {
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

    @Column(name = "BL_FILE_1", columnDefinition = "clob")
    public String getBlFile1() {
        return blFile1;
    }

    public void setBlFile1(String blFile1) {
        this.blFile1 = blFile1;
    }

    @Column(name = "BL_FILE_2", columnDefinition = "clob")
    public String getBlFile2() {
        return blFile2;
    }

    public void setBlFile2(String blFile2) {
        this.blFile2 = blFile2;
    }

    @Column(name = "BL_FILE_3", columnDefinition = "clob")
    public String getBlFile3() {
        return blFile3;
    }

    public void setBlFile3(String blFile3) {
        this.blFile3 = blFile3;
    }
}
