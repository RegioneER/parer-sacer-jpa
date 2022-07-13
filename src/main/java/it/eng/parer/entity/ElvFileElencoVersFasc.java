package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ELV_FILE_ELENCO_VERS_FASC database table.
 *
 */
@Entity
@Table(name = "ELV_FILE_ELENCO_VERS_FASC")
@NamedQueries({ @NamedQuery(name = "ElvFileElencoVersFasc.findAll", query = "SELECT e FROM ElvFileElencoVersFasc e"),
        @NamedQuery(name = "ElvFileElencoVersFasc.findByIdElencoTipoFile", query = "SELECT e FROM ElvFileElencoVersFasc e WHERE e.elvElencoVersFasc.idElencoVersFasc = :idElencoVersFasc AND e.tiFileElencoVers = :tiFileElencoVers") })
public class ElvFileElencoVersFasc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idFileElencoVersFasc;
    private byte[] blFileElencoVers;
    private String cdEncodingHashFile;
    private String cdVerXsdFile;
    private String dsAlgoHashFile;
    private String dsHashFile;
    private String dsUrnFile;
    private String dsUrnNormalizFile;
    private Date dtCreazioneFile;
    private BigDecimal idStrut;
    private String tiFileElencoVers;
    private ElvElencoVersFasc elvElencoVersFasc;

    public ElvFileElencoVersFasc() {
    }

    public ElvFileElencoVersFasc(byte[] blFileElencoVers, String cdVerXsdFile, String tiFileElencoVers) {
        this.blFileElencoVers = blFileElencoVers;
        this.cdVerXsdFile = cdVerXsdFile;
        this.tiFileElencoVers = tiFileElencoVers;
    }

    @Id
    @SequenceGenerator(name = "ELV_FILE_ELENCO_VERS_FASC_IDFILEELENCOVERSFASC_GENERATOR", sequenceName = "SELV_FILE_ELENCO_VERS_FASC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ELV_FILE_ELENCO_VERS_FASC_IDFILEELENCOVERSFASC_GENERATOR")
    @Column(name = "ID_FILE_ELENCO_VERS_FASC")
    public long getIdFileElencoVersFasc() {
        return this.idFileElencoVersFasc;
    }

    public void setIdFileElencoVersFasc(long idFileElencoVersFasc) {
        this.idFileElencoVersFasc = idFileElencoVersFasc;
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

    @Column(name = "DS_URN_FILE")
    public String getDsUrnFile() {
        return this.dsUrnFile;
    }

    public void setDsUrnFile(String dsUrnFile) {
        this.dsUrnFile = dsUrnFile;
    }

    @Column(name = "DS_URN_NORMALIZ_FILE")
    public String getDsUrnNormalizFile() {
        return this.dsUrnNormalizFile;
    }

    public void setDsUrnNormalizFile(String dsUrnNormalizFile) {
        this.dsUrnNormalizFile = dsUrnNormalizFile;
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

    // bi-directional many-to-one association to ElvElencoVersFasc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS_FASC")
    public ElvElencoVersFasc getElvElencoVersFasc() {
        return this.elvElencoVersFasc;
    }

    public void setElvElencoVersFasc(ElvElencoVersFasc elvElencoVersFasc) {
        this.elvElencoVersFasc = elvElencoVersFasc;
    }

}
