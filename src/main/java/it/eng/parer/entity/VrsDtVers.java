package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the VRS_DT_VERS database table.
 *
 */
@Entity
@Table(name = "VRS_DT_VERS")
public class VrsDtVers implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idDtVers;
    private String dlPathDtVers;
    private Date dtCreazioneDtVers;
    private Date dtLastArkDtVers;
    private Date dtLastArkDtVersSecondario;
    private Date dtStatoDtVers;
    private Date dtVers;
    private String flArk;
    private String flArkSecondario;
    private String flFileNoArk;
    private String flFileNoArkSecondario;
    private String flMigraz;
    private String flPresenzaSecondario;
    private String tiStatoDtVers;
    private List<VrsPathDtVers> vrsPathDtVers;

    public VrsDtVers() {
    }

    @Id
    @SequenceGenerator(name = "VRS_DT_VERS_IDDTVERS_GENERATOR", sequenceName = "SVRS_DT_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_DT_VERS_IDDTVERS_GENERATOR")
    @Column(name = "ID_DT_VERS")
    public long getIdDtVers() {
        return this.idDtVers;
    }

    public void setIdDtVers(long idDtVers) {
        this.idDtVers = idDtVers;
    }

    @Column(name = "DL_PATH_DT_VERS")
    public String getDlPathDtVers() {
        return this.dlPathDtVers;
    }

    public void setDlPathDtVers(String dlPathDtVers) {
        this.dlPathDtVers = dlPathDtVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE_DT_VERS")
    public Date getDtCreazioneDtVers() {
        return this.dtCreazioneDtVers;
    }

    public void setDtCreazioneDtVers(Date dtCreazioneDtVers) {
        this.dtCreazioneDtVers = dtCreazioneDtVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LAST_ARK_DT_VERS")
    public Date getDtLastArkDtVers() {
        return this.dtLastArkDtVers;
    }

    public void setDtLastArkDtVers(Date dtLastArkDtVers) {
        this.dtLastArkDtVers = dtLastArkDtVers;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_LAST_ARK_DT_VERS_SECONDARIO")
    public Date getDtLastArkDtVersSecondario() {
        return this.dtLastArkDtVersSecondario;
    }

    public void setDtLastArkDtVersSecondario(Date dtLastArkDtVersSecondario) {
        this.dtLastArkDtVersSecondario = dtLastArkDtVersSecondario;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_STATO_DT_VERS")
    public Date getDtStatoDtVers() {
        return this.dtStatoDtVers;
    }

    public void setDtStatoDtVers(Date dtStatoDtVers) {
        this.dtStatoDtVers = dtStatoDtVers;
    }

    /*
     * NB. Data mantenuta intenzionalmente con TemporalType.DATE per mantenerla compatibile con il TPI NON TOCCARE
     */
    @Temporal(TemporalType.DATE)
    @Column(name = "DT_VERS")
    public Date getDtVers() {
        return this.dtVers;
    }

    public void setDtVers(Date dtVers) {
        this.dtVers = dtVers;
    }

    @Column(name = "FL_ARK")
    public String getFlArk() {
        return this.flArk;
    }

    public void setFlArk(String flArk) {
        this.flArk = flArk;
    }

    @Column(name = "FL_ARK_SECONDARIO")
    public String getFlArkSecondario() {
        return this.flArkSecondario;
    }

    public void setFlArkSecondario(String flArkSecondario) {
        this.flArkSecondario = flArkSecondario;
    }

    @Column(name = "FL_FILE_NO_ARK")
    public String getFlFileNoArk() {
        return this.flFileNoArk;
    }

    public void setFlFileNoArk(String flFileNoArk) {
        this.flFileNoArk = flFileNoArk;
    }

    @Column(name = "FL_FILE_NO_ARK_SECONDARIO")
    public String getFlFileNoArkSecondario() {
        return this.flFileNoArkSecondario;
    }

    public void setFlFileNoArkSecondario(String flFileNoArkSecondario) {
        this.flFileNoArkSecondario = flFileNoArkSecondario;
    }

    @Column(name = "FL_MIGRAZ")
    public String getFlMigraz() {
        return this.flMigraz;
    }

    public void setFlMigraz(String flMigraz) {
        this.flMigraz = flMigraz;
    }

    @Column(name = "FL_PRESENZA_SECONDARIO")
    public String getFlPresenzaSecondario() {
        return this.flPresenzaSecondario;
    }

    public void setFlPresenzaSecondario(String flPresenzaSecondario) {
        this.flPresenzaSecondario = flPresenzaSecondario;
    }

    @Column(name = "TI_STATO_DT_VERS")
    public String getTiStatoDtVers() {
        return this.tiStatoDtVers;
    }

    public void setTiStatoDtVers(String tiStatoDtVers) {
        this.tiStatoDtVers = tiStatoDtVers;
    }

    // bi-directional many-to-one association to VrsPathDtVer
    @OneToMany(mappedBy = "vrsDtVers")
    public List<VrsPathDtVers> getVrsPathDtVers() {
        return this.vrsPathDtVers;
    }

    public void setVrsPathDtVers(List<VrsPathDtVers> vrsPathDtVers) {
        this.vrsPathDtVers = vrsPathDtVers;
    }
}
