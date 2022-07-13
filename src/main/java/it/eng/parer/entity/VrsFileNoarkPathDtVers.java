package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the VRS_FILE_NOARK_PATH_DT_VERS database table.
 *
 */
@Entity
@Table(name = "VRS_FILE_NOARK_PATH_DT_VERS")
public class VrsFileNoarkPathDtVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFileNoArkPathDtVers;
    private String dsFileNoark;
    private String tiArkFileNoark;
    private VrsPathDtVers vrsPathDtVers;

    public VrsFileNoarkPathDtVers() {
    }

    @Id
    @SequenceGenerator(name = "VRS_FILE_NOARK_PATH_DT_VERS_IDFILENOARKPATHDTVERS_GENERATOR", sequenceName = "SVRS_FILE_NOARK_PATH_DT_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_FILE_NOARK_PATH_DT_VERS_IDFILENOARKPATHDTVERS_GENERATOR")
    @Column(name = "ID_FILE_NO_ARK_PATH_DT_VERS")
    public long getIdFileNoArkPathDtVers() {
        return this.idFileNoArkPathDtVers;
    }

    public void setIdFileNoArkPathDtVers(long idFileNoArkPathDtVers) {
        this.idFileNoArkPathDtVers = idFileNoArkPathDtVers;
    }

    @Column(name = "DS_FILE_NOARK")
    public String getDsFileNoark() {
        return this.dsFileNoark;
    }

    public void setDsFileNoark(String dsFileNoark) {
        this.dsFileNoark = dsFileNoark;
    }

    @Column(name = "TI_ARK_FILE_NOARK")
    public String getTiArkFileNoark() {
        return this.tiArkFileNoark;
    }

    public void setTiArkFileNoark(String tiArkFileNoark) {
        this.tiArkFileNoark = tiArkFileNoark;
    }

    // bi-directional many-to-one association to VrsPathDtVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PATH_DT_VERS")
    public VrsPathDtVers getVrsPathDtVers() {
        return this.vrsPathDtVers;
    }

    public void setVrsPathDtVers(VrsPathDtVers vrsPathDtVers) {
        this.vrsPathDtVers = vrsPathDtVers;
    }

}