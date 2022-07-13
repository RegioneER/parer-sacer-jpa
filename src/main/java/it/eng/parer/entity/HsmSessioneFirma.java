package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

import it.eng.parer.entity.constraint.HsmSessioneFirma.TiEsitoSessioneFirma;
import it.eng.parer.entity.constraint.HsmSessioneFirma.TiSessioneFirma;

/**
 * The persistent class for the HSM_SESSIONE_FIRMA database table.
 *
 */
@Entity
@Table(name = "HSM_SESSIONE_FIRMA")
@NamedQuery(name = "HsmSessioneFirma.findAll", query = "SELECT h FROM HsmSessioneFirma h")
public class HsmSessioneFirma implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idSessioneFirma;
    private String cdErr;
    private String dsErr;
    private TiEsitoSessioneFirma tiEsitoSessioneFirma;
    private TiSessioneFirma tiSessioneFirma;
    private Date tsFine;
    private Date tsInizio;
    private List<HsmElencoSessioneFirma> hsmElencoSessioneFirmas;
    private IamUser iamUser;
    private List<HsmVerSerieSessioneFirma> hsmVerSerieSessioneFirmas;
    private List<HsmElencoFascSesFirma> hsmElencoFascSesFirmas;

    public HsmSessioneFirma() {
    }

    @Id
    @SequenceGenerator(name = "HSM_SESSIONE_FIRMA_IDSESSIONEFIRMA_GENERATOR", sequenceName = "SHSM_SESSIONE_FIRMA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HSM_SESSIONE_FIRMA_IDSESSIONEFIRMA_GENERATOR")
    @Column(name = "ID_SESSIONE_FIRMA")
    public long getIdSessioneFirma() {
        return this.idSessioneFirma;
    }

    public void setIdSessioneFirma(long idSessioneFirma) {
        this.idSessioneFirma = idSessioneFirma;
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

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_ESITO_SESSIONE_FIRMA")
    public TiEsitoSessioneFirma getTiEsitoSessioneFirma() {
        return this.tiEsitoSessioneFirma;
    }

    public void setTiEsitoSessioneFirma(TiEsitoSessioneFirma tiEsitoSessioneFirma) {
        this.tiEsitoSessioneFirma = tiEsitoSessioneFirma;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_SESSIONE_FIRMA")
    public TiSessioneFirma getTiSessioneFirma() {
        return this.tiSessioneFirma;
    }

    public void setTiSessioneFirma(TiSessioneFirma tiSessioneFirma) {
        this.tiSessioneFirma = tiSessioneFirma;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_FINE")
    public Date getTsFine() {
        return this.tsFine;
    }

    public void setTsFine(Date tsFine) {
        this.tsFine = tsFine;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_INIZIO")
    public Date getTsInizio() {
        return this.tsInizio;
    }

    public void setTsInizio(Date tsInizio) {
        this.tsInizio = tsInizio;
    }

    // bi-directional many-to-one association to HsmElencoSessioneFirma
    @OneToMany(mappedBy = "hsmSessioneFirma", cascade = { CascadeType.PERSIST })
    public List<HsmElencoSessioneFirma> getHsmElencoSessioneFirmas() {
        return this.hsmElencoSessioneFirmas;
    }

    public void setHsmElencoSessioneFirmas(List<HsmElencoSessioneFirma> hsmElencoSessioneFirmas) {
        this.hsmElencoSessioneFirmas = hsmElencoSessioneFirmas;
    }

    public HsmElencoSessioneFirma addHsmElencoSessioneFirma(HsmElencoSessioneFirma hsmElencoSessioneFirma) {
        getHsmElencoSessioneFirmas().add(hsmElencoSessioneFirma);
        hsmElencoSessioneFirma.setHsmSessioneFirma(this);

        return hsmElencoSessioneFirma;
    }

    public HsmElencoSessioneFirma removeHsmElencoSessioneFirma(HsmElencoSessioneFirma hsmElencoSessioneFirma) {
        getHsmElencoSessioneFirmas().remove(hsmElencoSessioneFirma);
        hsmElencoSessioneFirma.setHsmSessioneFirma(null);

        return hsmElencoSessioneFirma;
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

    // bi-directional many-to-one association to HsmVerSerieSessioneFirma
    @OneToMany(mappedBy = "hsmSessioneFirma", cascade = { CascadeType.PERSIST })
    public List<HsmVerSerieSessioneFirma> getHsmVerSerieSessioneFirmas() {
        return this.hsmVerSerieSessioneFirmas;
    }

    public void setHsmVerSerieSessioneFirmas(List<HsmVerSerieSessioneFirma> hsmVerSerieSessioneFirmas) {
        this.hsmVerSerieSessioneFirmas = hsmVerSerieSessioneFirmas;
    }

    public HsmVerSerieSessioneFirma addHsmVerSerieSessioneFirma(HsmVerSerieSessioneFirma hsmVerSerieSessioneFirma) {
        getHsmVerSerieSessioneFirmas().add(hsmVerSerieSessioneFirma);
        hsmVerSerieSessioneFirma.setHsmSessioneFirma(this);

        return hsmVerSerieSessioneFirma;
    }

    public HsmVerSerieSessioneFirma removeHsmVerSerieSessioneFirma(HsmVerSerieSessioneFirma hsmVerSerieSessioneFirma) {
        getHsmVerSerieSessioneFirmas().remove(hsmVerSerieSessioneFirma);
        hsmVerSerieSessioneFirma.setHsmSessioneFirma(null);

        return hsmVerSerieSessioneFirma;
    }

    // bi-directional many-to-one association to HsmElencoFascSesFirma
    @OneToMany(mappedBy = "hsmSessioneFirma", cascade = { CascadeType.PERSIST })
    public List<HsmElencoFascSesFirma> getHsmElencoFascSesFirmas() {
        return this.hsmElencoFascSesFirmas;
    }

    public void setHsmElencoFascSesFirmas(List<HsmElencoFascSesFirma> hsmElencoFascSesFirmas) {
        this.hsmElencoFascSesFirmas = hsmElencoFascSesFirmas;
    }

    public HsmElencoFascSesFirma addHsmElencoFascSesFirma(HsmElencoFascSesFirma hsmElencoFascSesFirma) {
        getHsmElencoFascSesFirmas().add(hsmElencoFascSesFirma);
        hsmElencoFascSesFirma.setHsmSessioneFirma(this);

        return hsmElencoFascSesFirma;
    }

    public HsmElencoFascSesFirma removeHsmElencoFascSesFirma(HsmElencoFascSesFirma hsmElencoFascSesFirma) {
        getHsmElencoFascSesFirmas().remove(hsmElencoFascSesFirma);
        hsmElencoFascSesFirma.setHsmSessioneFirma(null);

        return hsmElencoFascSesFirma;
    }

    @Transient
    public boolean isActive() {
        return (tsInizio != null && tsFine == null);
    }

    @Transient
    public boolean isClose() {
        return (tsInizio != null && tsFine != null);
    }

    @Transient
    public boolean isCorrectlyTerminated() {
        return (isClose() && tiEsitoSessioneFirma.equals(TiEsitoSessioneFirma.OK));
    }

    @Transient
    public boolean isTerminatedWithWarning() {
        return (isClose() && tiEsitoSessioneFirma.equals(TiEsitoSessioneFirma.WARNING));
    }

    @Transient
    public boolean isWronglyTerminated() {
        return (isClose() && tiEsitoSessioneFirma.equals(TiEsitoSessioneFirma.ERRORE));
    }

    /**
     * Returns the number of files which this session has.
     *
     * @return numero file
     */
    @Transient
    public int getNumFile() {
        int result = 0;

        switch (getTiSessioneFirma()) {
        case ELENCHI:
        case ELENCO_INDICI_AIP:
            if (getHsmElencoSessioneFirmas() != null) {
                result = getHsmElencoSessioneFirmas().size();
            }
            break;

        case SERIE:
            if (getHsmVerSerieSessioneFirmas() != null) {
                result = getHsmVerSerieSessioneFirmas().size();
            }
            break;

        case ELENCHI_FASC:
        case ELENCHI_INDICI_AIP_FASC:
            if (getHsmElencoFascSesFirmas() != null) {
                result = getHsmElencoFascSesFirmas().size();
            }
            break;
        }

        return result;
    }

    /**
     * Ottieni l'id del file
     *
     * @param index
     *            indice per la sessione di firma
     * 
     * @return id file PK
     */
    @Transient
    public Long getIdFile(int index) {
        Long result = null;
        if (getTiSessioneFirma().equals(TiSessioneFirma.ELENCHI)
                || getTiSessioneFirma().equals(TiSessioneFirma.ELENCO_INDICI_AIP)) {
            List<HsmElencoSessioneFirma> list = getHsmElencoSessioneFirmas();
            if (list != null && (index >= 0 && index < list.size())) {
                result = list.get(index).getElvElencoVer().getIdElencoVers();
            }
        } else if (getTiSessioneFirma().equals(TiSessioneFirma.SERIE)) {
            List<HsmVerSerieSessioneFirma> list = getHsmVerSerieSessioneFirmas();
            if (list != null && (index >= 0 && index < list.size())) {
                result = list.get(index).getSerVerSerie().getIdVerSerie();
            }
        } else if (getTiSessioneFirma().equals(TiSessioneFirma.ELENCHI_FASC)
                || getTiSessioneFirma().equals(TiSessioneFirma.ELENCHI_INDICI_AIP_FASC)) {
            List<HsmElencoFascSesFirma> list = getHsmElencoFascSesFirmas();
            if (list != null && (index >= 0 && index < list.size())) {
                result = list.get(index).getElvElencoVersFasc().getIdElencoVersFasc();
            }
        }
        return result;
    }
}
