package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the SER_UD_ERR_FILE_INPUT database table.
 * 
 */
@Entity
@Table(name = "SER_UD_ERR_FILE_INPUT")
@NamedQuery(name = "SerUdErrFileInput.findAll", query = "SELECT s FROM SerUdErrFileInput s")
public class SerUdErrFileInput implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUdErrFileInput;
    private String cdUdSerie;
    private String dsKeyOrdUdSerie;
    private Date dtUdSerie;
    private String infoUdSerie;
    private BigDecimal pgUdSerie;
    private AroUnitaDoc aroUnitaDoc;
    private SerErrFileInput serErrFileInput;

    public SerUdErrFileInput() {
    }

    @Id
    @SequenceGenerator(name = "SER_UD_ERR_FILE_INPUT_IDUDERRFILEINPUT_GENERATOR", sequenceName = "SSER_UD_ERR_FILE_INPUT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_UD_ERR_FILE_INPUT_IDUDERRFILEINPUT_GENERATOR")
    @Column(name = "ID_UD_ERR_FILE_INPUT")
    public long getIdUdErrFileInput() {
        return this.idUdErrFileInput;
    }

    public void setIdUdErrFileInput(long idUdErrFileInput) {
        this.idUdErrFileInput = idUdErrFileInput;
    }

    @Column(name = "CD_UD_SERIE")
    public String getCdUdSerie() {
        return this.cdUdSerie;
    }

    public void setCdUdSerie(String cdUdSerie) {
        this.cdUdSerie = cdUdSerie;
    }

    @Column(name = "DS_KEY_ORD_UD_SERIE")
    public String getDsKeyOrdUdSerie() {
        return this.dsKeyOrdUdSerie;
    }

    public void setDsKeyOrdUdSerie(String dsKeyOrdUdSerie) {
        this.dsKeyOrdUdSerie = dsKeyOrdUdSerie;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_UD_SERIE")
    public Date getDtUdSerie() {
        return this.dtUdSerie;
    }

    public void setDtUdSerie(Date dtUdSerie) {
        this.dtUdSerie = dtUdSerie;
    }

    @Column(name = "INFO_UD_SERIE")
    public String getInfoUdSerie() {
        return this.infoUdSerie;
    }

    public void setInfoUdSerie(String infoUdSerie) {
        this.infoUdSerie = infoUdSerie;
    }

    @Column(name = "PG_UD_SERIE")
    public BigDecimal getPgUdSerie() {
        return this.pgUdSerie;
    }

    public void setPgUdSerie(BigDecimal pgUdSerie) {
        this.pgUdSerie = pgUdSerie;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }

    // bi-directional many-to-one association to SerErrFileInput
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ERR_FILE_INPUT")
    public SerErrFileInput getSerErrFileInput() {
        return this.serErrFileInput;
    }

    public void setSerErrFileInput(SerErrFileInput serErrFileInput) {
        this.serErrFileInput = serErrFileInput;
    }

}