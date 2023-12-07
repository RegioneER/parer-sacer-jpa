package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the VRS_FILE_NOARK_PATH_DT_VERS database table.
 */
@Entity
@Table(name = "VRS_FILE_NOARK_PATH_DT_VERS")
public class VrsFileNoarkPathDtVers implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idFileNoArkPathDtVers;

    private String dsFileNoark;

    private String tiArkFileNoark;

    private VrsPathDtVers vrsPathDtVers;

    public VrsFileNoarkPathDtVers() {/* Hibernate */
    }

    @Id
    // "VRS_FILE_NOARK_PATH_DT_VERS_IDFILENOARKPATHDTVERS_GENERATOR",
    // sequenceName =
    // "SVRS_FILE_NOARK_PATH_DT_VERS",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VRS_FILE_NOARK_PATH_DT_VERS_IDFILENOARKPATHDTVERS_GENERATOR")
    @Column(name = "ID_FILE_NO_ARK_PATH_DT_VERS")
    @GenericGenerator(name = "SVRS_FILE_NOARK_PATH_DT_VERS_ID_FILE_NO_ARK_PATH_DT_VERS_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVRS_FILE_NOARK_PATH_DT_VERS"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SVRS_FILE_NOARK_PATH_DT_VERS_ID_FILE_NO_ARK_PATH_DT_VERS_GENERATOR")
    public Long getIdFileNoArkPathDtVers() {
        return this.idFileNoArkPathDtVers;
    }

    public void setIdFileNoArkPathDtVers(Long idFileNoArkPathDtVers) {
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
