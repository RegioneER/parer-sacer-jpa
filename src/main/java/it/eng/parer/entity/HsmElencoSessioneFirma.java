package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import it.eng.parer.entity.constraint.HsmElencoSessioneFirma.TiEsitoFirmaElenco;

/**
 * The persistent class for the HSM_ELENCO_SESSIONE_FIRMA database table.
 *
 */
@Entity
@Table(name = "HSM_ELENCO_SESSIONE_FIRMA")
@NamedQuery(name = "HsmElencoSessioneFirma.findAll", query = "SELECT h FROM HsmElencoSessioneFirma h")
public class HsmElencoSessioneFirma implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idElencoSessioneFirma;
    private String cdErr;
    private String dsErr;
    private TiEsitoFirmaElenco tiEsito;
    private ElvElencoVer elvElencoVer;
    private Date tsEsito;
    private HsmSessioneFirma hsmSessioneFirma;

    public HsmElencoSessioneFirma() {
    }

    @Id
    @SequenceGenerator(name = "HSM_ELENCO_SESSIONE_FIRMA_IDELENCOSESSIONEFIRMA_GENERATOR", sequenceName = "SHSM_ELENCO_SESSIONE_FIRMA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HSM_ELENCO_SESSIONE_FIRMA_IDELENCOSESSIONEFIRMA_GENERATOR")
    @Column(name = "ID_ELENCO_SESSIONE_FIRMA")
    public long getIdElencoSessioneFirma() {
        return this.idElencoSessioneFirma;
    }

    public void setIdElencoSessioneFirma(long idElencoSessioneFirma) {
        this.idElencoSessioneFirma = idElencoSessioneFirma;
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
    @Column(name = "TI_ESITO")
    public TiEsitoFirmaElenco getTiEsito() {
        return this.tiEsito;
    }

    public void setTiEsito(TiEsitoFirmaElenco tiEsito) {
        this.tiEsito = tiEsito;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_ESITO")
    public Date getTsEsito() {
        return this.tsEsito;
    }

    public void setTsEsito(Date tsEsito) {
        this.tsEsito = tsEsito;
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

    // bi-directional many-to-one association to HsmSessioneFirma
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SESSIONE_FIRMA")
    public HsmSessioneFirma getHsmSessioneFirma() {
        return this.hsmSessioneFirma;
    }

    public void setHsmSessioneFirma(HsmSessioneFirma hsmSessioneFirma) {
        this.hsmSessioneFirma = hsmSessioneFirma;
    }

    @Transient
    public boolean is2sign() {
        return this.tiEsito.equals(TiEsitoFirmaElenco.DA_FARE);
    }

    @Transient
    public boolean isSigned() {
        return this.tiEsito.equals(TiEsitoFirmaElenco.OK);
    }
}