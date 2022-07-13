package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the VRS_PATH_DT_VERS database table.
 *
 */
@Entity
@Table(name = "VRS_PATH_DT_VERS")
public class VrsPathDtVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idPathDtVers;
    private String dlPath;
    private Date dtLastArkPath;
    private Date dtLastArkPathSecondario;
    private String flCancFileMigraz;
    private String flPathArk;
    private String flPathArkSecondario;
    private String flPathFileNoArk;
    private String flPathFileNoArkSecondario;
    private BigDecimal niFilePath;
    private BigDecimal niFilePathArk;
    private BigDecimal niFilePathArkSecondario;
    private List<VrsArkPathDtVers> vrsArkPathDtVers;
    private List<VrsFileNoarkPathDtVers> vrsFileNoarkPathDtVers;
    private VrsDtVers vrsDtVers;

    public VrsPathDtVers() {
    }

    @Id
    @SequenceGenerator(name = "VRS_PATH_DT_VERS_IDPATHDTVERS_GENERATOR", sequenceName = "SVRS_PATH_DT_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_PATH_DT_VERS_IDPATHDTVERS_GENERATOR")
    @Column(name = "ID_PATH_DT_VERS")
    public long getIdPathDtVers() {
        return this.idPathDtVers;
    }

    public void setIdPathDtVers(long idPathDtVers) {
        this.idPathDtVers = idPathDtVers;
    }

    @Column(name = "DL_PATH")
    public String getDlPath() {
        return this.dlPath;
    }

    public void setDlPath(String dlPath) {
        this.dlPath = dlPath;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LAST_ARK_PATH")
    public Date getDtLastArkPath() {
        return this.dtLastArkPath;
    }

    public void setDtLastArkPath(Date dtLastArkPath) {
        this.dtLastArkPath = dtLastArkPath;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LAST_ARK_PATH_SECONDARIO")
    public Date getDtLastArkPathSecondario() {
        return this.dtLastArkPathSecondario;
    }

    public void setDtLastArkPathSecondario(Date dtLastArkPathSecondario) {
        this.dtLastArkPathSecondario = dtLastArkPathSecondario;
    }

    @Column(name = "FL_CANC_FILE_MIGRAZ")
    public String getFlCancFileMigraz() {
        return this.flCancFileMigraz;
    }

    public void setFlCancFileMigraz(String flCancFileMigraz) {
        this.flCancFileMigraz = flCancFileMigraz;
    }

    @Column(name = "FL_PATH_ARK")
    public String getFlPathArk() {
        return this.flPathArk;
    }

    public void setFlPathArk(String flPathArk) {
        this.flPathArk = flPathArk;
    }

    @Column(name = "FL_PATH_ARK_SECONDARIO")
    public String getFlPathArkSecondario() {
        return this.flPathArkSecondario;
    }

    public void setFlPathArkSecondario(String flPathArkSecondario) {
        this.flPathArkSecondario = flPathArkSecondario;
    }

    @Column(name = "FL_PATH_FILE_NO_ARK")
    public String getFlPathFileNoArk() {
        return this.flPathFileNoArk;
    }

    public void setFlPathFileNoArk(String flPathFileNoArk) {
        this.flPathFileNoArk = flPathFileNoArk;
    }

    @Column(name = "FL_PATH_FILE_NO_ARK_SECONDARIO")
    public String getFlPathFileNoArkSecondario() {
        return this.flPathFileNoArkSecondario;
    }

    public void setFlPathFileNoArkSecondario(String flPathFileNoArkSecondario) {
        this.flPathFileNoArkSecondario = flPathFileNoArkSecondario;
    }

    @Column(name = "NI_FILE_PATH")
    public BigDecimal getNiFilePath() {
        return this.niFilePath;
    }

    public void setNiFilePath(BigDecimal niFilePath) {
        this.niFilePath = niFilePath;
    }

    @Column(name = "NI_FILE_PATH_ARK")
    public BigDecimal getNiFilePathArk() {
        return this.niFilePathArk;
    }

    public void setNiFilePathArk(BigDecimal niFilePathArk) {
        this.niFilePathArk = niFilePathArk;
    }

    @Column(name = "NI_FILE_PATH_ARK_SECONDARIO")
    public BigDecimal getNiFilePathArkSecondario() {
        return this.niFilePathArkSecondario;
    }

    public void setNiFilePathArkSecondario(BigDecimal niFilePathArkSecondario) {
        this.niFilePathArkSecondario = niFilePathArkSecondario;
    }

    // bi-directional many-to-one association to VrsArkPathDtVer
    @OneToMany(mappedBy = "vrsPathDtVers")
    public List<VrsArkPathDtVers> getVrsArkPathDtVers() {
        return this.vrsArkPathDtVers;
    }

    public void setVrsArkPathDtVers(List<VrsArkPathDtVers> vrsArkPathDtVers) {
        this.vrsArkPathDtVers = vrsArkPathDtVers;
    }

    // bi-directional many-to-one association to VrsFileNoarkPathDtVer
    @OneToMany(mappedBy = "vrsPathDtVers")
    public List<VrsFileNoarkPathDtVers> getVrsFileNoarkPathDtVers() {
        return this.vrsFileNoarkPathDtVers;
    }

    public void setVrsFileNoarkPathDtVers(List<VrsFileNoarkPathDtVers> vrsFileNoarkPathDtVers) {
        this.vrsFileNoarkPathDtVers = vrsFileNoarkPathDtVers;
    }

    // bi-directional many-to-one association to VrsDtVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DT_VERS")
    public VrsDtVers getVrsDtVers() {
        return this.vrsDtVers;
    }

    public void setVrsDtVers(VrsDtVers vrsDtVers) {
        this.vrsDtVers = vrsDtVers;
    }

}
