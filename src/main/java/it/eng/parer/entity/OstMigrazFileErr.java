package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the OST_MIGRAZ_FILE_ERR database table.
 *
 */
@Entity
@Table(name = "OST_MIGRAZ_FILE_ERR")
@NamedQuery(name = "OstMigrazFileErr.findAll", query = "SELECT o FROM OstMigrazFileErr o")
public class OstMigrazFileErr implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idMigrazFileErr;
    private String cdErr;
    private String dsErr;
    private String dsHashFileCalcMigraz;
    private Date tsErr;
    private String tiErr;
    private OstMigrazFile ostMigrazFile;

    public OstMigrazFileErr() {
    }

    @Id
    @SequenceGenerator(name = "OST_MIGRAZ_FILE_ERR_IDMIGRAZFILEERR_GENERATOR", sequenceName = "SOST_MIGRAZ_FILE_ERR", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OST_MIGRAZ_FILE_ERR_IDMIGRAZFILEERR_GENERATOR")
    @Column(name = "ID_MIGRAZ_FILE_ERR")
    public long getIdMigrazFileErr() {
        return this.idMigrazFileErr;
    }

    public void setIdMigrazFileErr(long idMigrazFileErr) {
        this.idMigrazFileErr = idMigrazFileErr;
    }

    @Column(name = "CD_ERR")
    public String getCdErr() {
        return this.cdErr;
    }

    public void setCdErr(String cdErr) {
        this.cdErr = cdErr;
    }

    @Column(name = "DS_ERR")
    public String getDsErr() {
        return this.dsErr;
    }

    public void setDsErr(String dsErr) {
        this.dsErr = dsErr;
    }

    @Column(name = "DS_HASH_FILE_CALC_MIGRAZ")
    public String getDsHashFileCalcMigraz() {
        return this.dsHashFileCalcMigraz;
    }

    public void setDsHashFileCalcMigraz(String dsHashFileCalcMigraz) {
        this.dsHashFileCalcMigraz = dsHashFileCalcMigraz;
    }

    @Column(name = "TI_ERR")
    public String getTiErr() {
        return this.tiErr;
    }

    public void setTiErr(String tiErr) {
        this.tiErr = tiErr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_ERR")
    public Date getTsErr() {
        return this.tsErr;
    }

    public void setTsErr(Date tsErr) {
        this.tsErr = tsErr;
    }

    // bi-directional many-to-one association to OstMigrazFile
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MIGRAZ_FILE")
    public OstMigrazFile getOstMigrazFile() {
        return this.ostMigrazFile;
    }

    public void setOstMigrazFile(OstMigrazFile ostMigrazFile) {
        this.ostMigrazFile = ostMigrazFile;
    }

}
