package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The persistent class for the SER_ERR_FILE_INPUT database table.
 * 
 */
@Entity
@Table(name = "SER_ERR_FILE_INPUT")
@NamedQuery(name = "SerErrFileInput.findAll", query = "SELECT s FROM SerErrFileInput s")
public class SerErrFileInput implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idErrFileInput;
    private String dsRecErr;
    private BigDecimal niRecErr;
    private String tiErrRec;
    private SerFileInputVerSerie serFileInputVerSerie;
    private List<SerUdErrFileInput> serUdErrFileInputs;

    public SerErrFileInput() {
    }

    @Id
    @SequenceGenerator(name = "SER_ERR_FILE_INPUT_IDERRFILEINPUT_GENERATOR", sequenceName = "SSER_ERR_FILE_INPUT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_ERR_FILE_INPUT_IDERRFILEINPUT_GENERATOR")
    @Column(name = "ID_ERR_FILE_INPUT")
    public long getIdErrFileInput() {
        return this.idErrFileInput;
    }

    public void setIdErrFileInput(long idErrFileInput) {
        this.idErrFileInput = idErrFileInput;
    }

    @Column(name = "DS_REC_ERR")
    public String getDsRecErr() {
        return this.dsRecErr;
    }

    public void setDsRecErr(String dsRecErr) {
        this.dsRecErr = dsRecErr;
    }

    @Column(name = "NI_REC_ERR")
    public BigDecimal getNiRecErr() {
        return this.niRecErr;
    }

    public void setNiRecErr(BigDecimal niRecErr) {
        this.niRecErr = niRecErr;
    }

    @Column(name = "TI_ERR_REC")
    public String getTiErrRec() {
        return this.tiErrRec;
    }

    public void setTiErrRec(String tiErrRec) {
        this.tiErrRec = tiErrRec;
    }

    // bi-directional many-to-one association to SerFileInputVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILE_INPUT_VER_SERIE")
    public SerFileInputVerSerie getSerFileInputVerSerie() {
        return this.serFileInputVerSerie;
    }

    public void setSerFileInputVerSerie(SerFileInputVerSerie serFileInputVerSerie) {
        this.serFileInputVerSerie = serFileInputVerSerie;
    }

    // bi-directional many-to-one association to SerUdErrFileInput
    @OneToMany(mappedBy = "serErrFileInput", cascade = CascadeType.PERSIST)
    public List<SerUdErrFileInput> getSerUdErrFileInputs() {
        return this.serUdErrFileInputs;
    }

    public void setSerUdErrFileInputs(List<SerUdErrFileInput> serUdErrFileInputs) {
        this.serUdErrFileInputs = serUdErrFileInputs;
    }

    public SerUdErrFileInput addSerUdErrFileInput(SerUdErrFileInput serUdErrFileInput) {
        getSerUdErrFileInputs().add(serUdErrFileInput);
        serUdErrFileInput.setSerErrFileInput(this);

        return serUdErrFileInput;
    }

    public SerUdErrFileInput removeSerUdErrFileInput(SerUdErrFileInput serUdErrFileInput) {
        getSerUdErrFileInputs().remove(serUdErrFileInput);
        serUdErrFileInput.setSerErrFileInput(null);

        return serUdErrFileInput;
    }

}