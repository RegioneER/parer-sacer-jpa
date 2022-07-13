package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the OST_NO_MIGRAZ_FILE database table.
 *
 */
@Entity
@Table(name = "OST_NO_MIGRAZ_FILE")
@NamedQuery(name = "OstNoMigrazFile.findAll", query = "SELECT o FROM OstNoMigrazFile o")
public class OstNoMigrazFile implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idNoMigrazFile;
    private OstMigrazSubPart ostMigrazSubPart;
    private String nmTabellaIdOggetto;
    private BigDecimal idOggetto;
    private BigDecimal idStrut;
    private BigDecimal mmFile;
    private String tiSupportoComp;
    private String tiSaveFile;
    private String tiCausaleNoMigraz;

    public OstNoMigrazFile() {
    }

    @Id
    @SequenceGenerator(name = "OST_NO_MIGRAZ_FILE_IDMIGRAZFILE_GENERATOR", sequenceName = "SOST_NO_MIGRAZ_FILE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OST_NO_MIGRAZ_FILE_IDMIGRAZFILE_GENERATOR")
    @Column(name = "ID_NO_MIGRAZ_FILE")
    public long getIdNoMigrazFile() {
        return this.idNoMigrazFile;
    }

    public void setIdNoMigrazFile(long idNoMigrazFile) {
        this.idNoMigrazFile = idNoMigrazFile;
    }

    @Column(name = "ID_OGGETTO")
    public BigDecimal getIdOggetto() {
        return this.idOggetto;
    }

    public void setIdOggetto(BigDecimal idOggetto) {
        this.idOggetto = idOggetto;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "MM_FILE")
    public BigDecimal getMmFile() {
        return this.mmFile;
    }

    public void setMmFile(BigDecimal mmFile) {
        this.mmFile = mmFile;
    }

    @Column(name = "NM_TABELLA_ID_OGGETTO")
    public String getNmTabellaIdOggetto() {
        return this.nmTabellaIdOggetto;
    }

    public void setNmTabellaIdOggetto(String nmTabellaIdOggetto) {
        this.nmTabellaIdOggetto = nmTabellaIdOggetto;
    }

    @Column(name = "TI_SUPPORTO_COMP")
    public String getTiSupportoComp() {
        return this.tiSupportoComp;
    }

    public void setTiSupportoComp(String tiSupportoComp) {
        this.tiSupportoComp = tiSupportoComp;
    }

    @Column(name = "TI_SAVE_FILE")
    public String getTiSaveFile() {
        return this.tiSaveFile;
    }

    public void setTiSaveFile(String tiSaveFile) {
        this.tiSaveFile = tiSaveFile;
    }

    @Column(name = "TI_CAUSALE_NO_MIGRAZ")
    public String getTiCausaleNoMigraz() {
        return this.tiCausaleNoMigraz;
    }

    public void setTiCausaleNoMigraz(String tiCausaleNoMigraz) {
        this.tiCausaleNoMigraz = tiCausaleNoMigraz;
    }

    // bi-directional many-to-one association to OstMigrazSubPart
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MIGRAZ_SUB_PART")
    public OstMigrazSubPart getOstMigrazSubPart() {
        return this.ostMigrazSubPart;
    }

    public void setOstMigrazSubPart(OstMigrazSubPart ostMigrazSubPart) {
        this.ostMigrazSubPart = ostMigrazSubPart;
    }

}
