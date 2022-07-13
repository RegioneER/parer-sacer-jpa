package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the ELV_FILE_ELENCO_VERS database table.
 *
 */
@Entity
@Table(name = "ELV_FILE_ELENCO_VERS")
@NamedQuery(name = "ElvFileElencoVer.findAll", query = "SELECT e FROM ElvFileElencoVer e")
public class ElvFileElencoVer implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idFileElencoVers;
    private byte[] blFileElencoVers;
    private String cdEncodingHashFile;
    private String cdVerXsdFile;
    private String dsAlgoHashFile;
    private String dsHashFile;
    private Date dtCreazioneFile;
    private BigDecimal idStrut;
    private String tiFileElencoVers;
    private ElvElencoVer elvElencoVer;
    private List<ElvUrnFileElencoVers> elvUrnFileElencoVerss;

    public ElvFileElencoVer() {
    }

    public ElvFileElencoVer(byte[] blFileElencoVers, String cdVerXsdFile, String tiFileElencoVers) {
        this.blFileElencoVers = blFileElencoVers;
        this.cdVerXsdFile = cdVerXsdFile;
        this.tiFileElencoVers = tiFileElencoVers;
    }

    @Id
    @SequenceGenerator(name = "ELV_FILE_ELENCO_VERS_IDFILEELENCOVERS_GENERATOR", sequenceName = "SELV_FILE_ELENCO_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_FILE_ELENCO_VERS_IDFILEELENCOVERS_GENERATOR")
    @Column(name = "ID_FILE_ELENCO_VERS")
    public long getIdFileElencoVers() {
        return this.idFileElencoVers;
    }

    public void setIdFileElencoVers(long idFileElencoVers) {
        this.idFileElencoVers = idFileElencoVers;
    }

    @Lob
    @Column(name = "BL_FILE_ELENCO_VERS")
    public byte[] getBlFileElencoVers() {
        return this.blFileElencoVers;
    }

    public void setBlFileElencoVers(byte[] blFileElencoVers) {
        this.blFileElencoVers = blFileElencoVers;
    }

    @Column(name = "CD_ENCODING_HASH_FILE")
    public String getCdEncodingHashFile() {
        return this.cdEncodingHashFile;
    }

    public void setCdEncodingHashFile(String cdEncodingHashFile) {
        this.cdEncodingHashFile = cdEncodingHashFile;
    }

    @Column(name = "CD_VER_XSD_FILE")
    public String getCdVerXsdFile() {
        return this.cdVerXsdFile;
    }

    public void setCdVerXsdFile(String cdVerXsdFile) {
        this.cdVerXsdFile = cdVerXsdFile;
    }

    @Column(name = "DS_ALGO_HASH_FILE")
    public String getDsAlgoHashFile() {
        return this.dsAlgoHashFile;
    }

    public void setDsAlgoHashFile(String dsAlgoHashFile) {
        this.dsAlgoHashFile = dsAlgoHashFile;
    }

    @Column(name = "DS_HASH_FILE")
    public String getDsHashFile() {
        return this.dsHashFile;
    }

    public void setDsHashFile(String dsHashFile) {
        this.dsHashFile = dsHashFile;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CREAZIONE_FILE")
    public Date getDtCreazioneFile() {
        return this.dtCreazioneFile;
    }

    public void setDtCreazioneFile(Date dtCreazioneFile) {
        this.dtCreazioneFile = dtCreazioneFile;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "TI_FILE_ELENCO_VERS")
    public String getTiFileElencoVers() {
        return this.tiFileElencoVers;
    }

    public void setTiFileElencoVers(String tiFileElencoVers) {
        this.tiFileElencoVers = tiFileElencoVers;
    }

    // bi-directional many-to-one association to ElvElencoVer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS")
    public ElvElencoVer getElvElencoVer() {
        return this.elvElencoVer;
    }

    public void setElvElencoVer(ElvElencoVer elvElencoVer) {
        this.elvElencoVer = elvElencoVer;
    }

    // bi-directional many-to-one association to ElvUrnFileElencoVers
    @OneToMany(mappedBy = "elvFileElencoVers", cascade = CascadeType.PERSIST)
    public List<ElvUrnFileElencoVers> getElvUrnFileElencoVerss() {
        return this.elvUrnFileElencoVerss;
    }

    public void setElvUrnFileElencoVerss(List<ElvUrnFileElencoVers> elvUrnFileElencoVerss) {
        this.elvUrnFileElencoVerss = elvUrnFileElencoVerss;
    }

    public ElvUrnFileElencoVers addElvUrnFileElencoVers(ElvUrnFileElencoVers elvUrnFileElencoVers) {
        getElvUrnFileElencoVerss().add(elvUrnFileElencoVers);
        elvUrnFileElencoVers.setElvFileElencoVers(this);

        return elvUrnFileElencoVers;
    }

    public ElvUrnFileElencoVers removeElvUrnFileElencoVers(ElvUrnFileElencoVers elvUrnFileElencoVers) {
        getElvUrnFileElencoVerss().remove(elvUrnFileElencoVers);
        elvUrnFileElencoVers.setElvFileElencoVers(null);

        return elvUrnFileElencoVers;
    }

}
