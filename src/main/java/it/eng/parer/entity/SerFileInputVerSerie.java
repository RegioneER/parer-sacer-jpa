package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the SER_FILE_INPUT_VER_SERIE database table.
 * 
 */
@Entity
@Table(name = "SER_FILE_INPUT_VER_SERIE")
@NamedQuery(name = "SerFileInputVerSerie.findAll", query = "SELECT s FROM SerFileInputVerSerie s")
public class SerFileInputVerSerie implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFileInputVerSerie;
    private String blFileInputVerSerie;
    private String cdDocFileInputVerSerie;
    private String dsDocFileInputVerSerie;
    private String flFornitoEnte;
    private String tiScopoFileInputVerSerie;
    private List<SerErrFileInput> serErrFileInputs;
    private IamUser iamUser;
    private SerVerSerie serVerSerie;

    public SerFileInputVerSerie() {
    }

    @Id
    @SequenceGenerator(name = "SER_FILE_INPUT_VER_SERIE_IDFILEINPUTVERSERIE_GENERATOR", sequenceName = "SSER_FILE_INPUT_VER_SERIE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SER_FILE_INPUT_VER_SERIE_IDFILEINPUTVERSERIE_GENERATOR")
    @Column(name = "ID_FILE_INPUT_VER_SERIE")
    public long getIdFileInputVerSerie() {
        return this.idFileInputVerSerie;
    }

    public void setIdFileInputVerSerie(long idFileInputVerSerie) {
        this.idFileInputVerSerie = idFileInputVerSerie;
    }

    @Lob
    @Column(name = "BL_FILE_INPUT_VER_SERIE")
    public String getBlFileInputVerSerie() {
        return this.blFileInputVerSerie;
    }

    public void setBlFileInputVerSerie(String blFileInputVerSerie) {
        this.blFileInputVerSerie = blFileInputVerSerie;
    }

    @Column(name = "CD_DOC_FILE_INPUT_VER_SERIE")
    public String getCdDocFileInputVerSerie() {
        return this.cdDocFileInputVerSerie;
    }

    public void setCdDocFileInputVerSerie(String cdDocFileInputVerSerie) {
        this.cdDocFileInputVerSerie = cdDocFileInputVerSerie;
    }

    @Column(name = "DS_DOC_FILE_INPUT_VER_SERIE")
    public String getDsDocFileInputVerSerie() {
        return this.dsDocFileInputVerSerie;
    }

    public void setDsDocFileInputVerSerie(String dsDocFileInputVerSerie) {
        this.dsDocFileInputVerSerie = dsDocFileInputVerSerie;
    }

    @Column(name = "FL_FORNITO_ENTE")
    public String getFlFornitoEnte() {
        return this.flFornitoEnte;
    }

    public void setFlFornitoEnte(String flFornitoEnte) {
        this.flFornitoEnte = flFornitoEnte;
    }

    @Column(name = "TI_SCOPO_FILE_INPUT_VER_SERIE")
    public String getTiScopoFileInputVerSerie() {
        return this.tiScopoFileInputVerSerie;
    }

    public void setTiScopoFileInputVerSerie(String tiScopoFileInputVerSerie) {
        this.tiScopoFileInputVerSerie = tiScopoFileInputVerSerie;
    }

    // bi-directional many-to-one association to SerErrFileInput
    @OneToMany(mappedBy = "serFileInputVerSerie", cascade = CascadeType.PERSIST)
    public List<SerErrFileInput> getSerErrFileInputs() {
        return this.serErrFileInputs;
    }

    public void setSerErrFileInputs(List<SerErrFileInput> serErrFileInputs) {
        this.serErrFileInputs = serErrFileInputs;
    }

    public SerErrFileInput addSerErrFileInput(SerErrFileInput serErrFileInput) {
        getSerErrFileInputs().add(serErrFileInput);
        serErrFileInput.setSerFileInputVerSerie(this);

        return serErrFileInput;
    }

    public SerErrFileInput removeSerErrFileInput(SerErrFileInput serErrFileInput) {
        getSerErrFileInputs().remove(serErrFileInput);
        serErrFileInput.setSerFileInputVerSerie(null);

        return serErrFileInput;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER_IAM")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }

    // bi-directional many-to-one association to SerVerSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VER_SERIE")
    public SerVerSerie getSerVerSerie() {
        return this.serVerSerie;
    }

    public void setSerVerSerie(SerVerSerie serVerSerie) {
        this.serVerSerie = serVerSerie;
    }

}