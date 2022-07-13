package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the REC_SESSIONE_RECUP database table.
 *
 */
@Entity
@Table(name = "REC_SESSIONE_RECUP")
public class RecSessioneRecup implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idSessioneRecup;
    private String cdErr;
    private String dlErr;
    private Date dtApertura;
    private Date dtChiusura;
    private String tiOutputRecup;
    private String tiSessioneRecup;
    private String tiStatoSessioneRecup;
    private List<RecDtVersRecup> recDtVersRecups;
    private AroCompDoc aroCompDoc;
    private AroDoc aroDoc;
    private RecUnitaDocRecup recUnitaDocRecup;
    private IamUser iamUser;

    public RecSessioneRecup() {
    }

    @Id
    @SequenceGenerator(name = "REC_SESSIONE_RECUP_IDSESSIONERECUP_GENERATOR", sequenceName = "SREC_SESSIONE_RECUP", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "REC_SESSIONE_RECUP_IDSESSIONERECUP_GENERATOR")
    @Column(name = "ID_SESSIONE_RECUP")
    public long getIdSessioneRecup() {
        return this.idSessioneRecup;
    }

    public void setIdSessioneRecup(long idSessioneRecup) {
        this.idSessioneRecup = idSessioneRecup;
    }

    @Column(name = "CD_ERR")
    public String getCdErr() {
        return this.cdErr;
    }

    public void setCdErr(String cdErr) {
        this.cdErr = cdErr;
    }

    @Column(name = "DL_ERR")
    public String getDlErr() {
        return this.dlErr;
    }

    public void setDlErr(String dlErr) {
        this.dlErr = dlErr;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_APERTURA")
    public Date getDtApertura() {
        return this.dtApertura;
    }

    public void setDtApertura(Date dtApertura) {
        this.dtApertura = dtApertura;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_CHIUSURA")
    public Date getDtChiusura() {
        return this.dtChiusura;
    }

    public void setDtChiusura(Date dtChiusura) {
        this.dtChiusura = dtChiusura;
    }

    @Column(name = "TI_OUTPUT_RECUP")
    public String getTiOutputRecup() {
        return tiOutputRecup;
    }

    public void setTiOutputRecup(String tiOutputRecup) {
        this.tiOutputRecup = tiOutputRecup;
    }

    @Column(name = "TI_SESSIONE_RECUP")
    public String getTiSessioneRecup() {
        return this.tiSessioneRecup;
    }

    public void setTiSessioneRecup(String tiSessioneRecup) {
        this.tiSessioneRecup = tiSessioneRecup;
    }

    @Column(name = "TI_STATO_SESSIONE_RECUP")
    public String getTiStatoSessioneRecup() {
        return this.tiStatoSessioneRecup;
    }

    public void setTiStatoSessioneRecup(String tiStatoSessioneRecup) {
        this.tiStatoSessioneRecup = tiStatoSessioneRecup;
    }

    // bi-directional many-to-one association to RecDtVersRecup
    @OneToMany(mappedBy = "recSessioneRecup")
    public List<RecDtVersRecup> getRecDtVersRecups() {
        return this.recDtVersRecups;
    }

    public void setRecDtVersRecups(List<RecDtVersRecup> recDtVersRecups) {
        this.recDtVersRecups = recDtVersRecups;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

    // bi-directional many-to-one association to AroDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DOC")
    public AroDoc getAroDoc() {
        return this.aroDoc;
    }

    public void setAroDoc(AroDoc aroDoc) {
        this.aroDoc = aroDoc;
    }

    // bi-directional many-to-one association to RecUnitaDocRecup
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC_RECUP")
    public RecUnitaDocRecup getRecUnitaDocRecup() {
        return this.recUnitaDocRecup;
    }

    public void setRecUnitaDocRecup(RecUnitaDocRecup recUnitaDocRecup) {
        this.recUnitaDocRecup = recUnitaDocRecup;
    }

    // bi-directional many-to-one association to IamUser
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USER")
    public IamUser getIamUser() {
        return this.iamUser;
    }

    public void setIamUser(IamUser iamUser) {
        this.iamUser = iamUser;
    }
}