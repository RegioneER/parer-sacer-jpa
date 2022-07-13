package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the VRS_ARK_PATH_DT_VERS database table.
 *
 */
@Entity
@Table(name = "VRS_ARK_PATH_DT_VERS")
public class VrsArkPathDtVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idArkPathDtVers;
    private String dsArk;
    private Date dtArkPathDtVers;
    private String tiArkPath;
    private VrsPathDtVers vrsPathDtVers;

    public VrsArkPathDtVers() {
    }

    @Id
    @SequenceGenerator(name = "VRS_ARK_PATH_DT_VERS_IDARKPATHDTVERS_GENERATOR", sequenceName = "SVRS_ARK_PATH_DT_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_ARK_PATH_DT_VERS_IDARKPATHDTVERS_GENERATOR")
    @Column(name = "ID_ARK_PATH_DT_VERS")
    public long getIdArkPathDtVers() {
        return this.idArkPathDtVers;
    }

    public void setIdArkPathDtVers(long idArkPathDtVers) {
        this.idArkPathDtVers = idArkPathDtVers;
    }

    @Column(name = "DS_ARK")
    public String getDsArk() {
        return this.dsArk;
    }

    public void setDsArk(String dsArk) {
        this.dsArk = dsArk;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ARK_PATH_DT_VERS")
    public Date getDtArkPathDtVers() {
        return this.dtArkPathDtVers;
    }

    public void setDtArkPathDtVers(Date dtArkPathDtVers) {
        this.dtArkPathDtVers = dtArkPathDtVers;
    }

    @Column(name = "TI_ARK_PATH")
    public String getTiArkPath() {
        return this.tiArkPath;
    }

    public void setTiArkPath(String tiArkPath) {
        this.tiArkPath = tiArkPath;
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