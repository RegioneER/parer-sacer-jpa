package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import it.eng.parer.entity.constraint.HsmVerSerieSessioneFirma.TiEsitoFirmaVerSerie;

/**
 * The persistent class for the HSM_VER_SERIE_SESSIONE_FIRMA database table.
 *
 */
@Entity
@Table(name = "HSM_VER_SERIE_SESSIONE_FIRMA")
@NamedQuery(name = "HsmVerSerieSessioneFirma.findAll", query = "SELECT h FROM HsmVerSerieSessioneFirma h")
public class HsmVerSerieSessioneFirma implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idVerSerieSessioneFirma;
    private String cdErr;
    private String dsErr;
    private TiEsitoFirmaVerSerie tiEsito;
    private Date tsEsito;
    private HsmSessioneFirma hsmSessioneFirma;
    private SerVerSerie serVerSerie;

    public HsmVerSerieSessioneFirma() {
    }

    @Id
    @SequenceGenerator(name = "HSM_VER_SERIE_SESSIONE_FIRMA_IDVERSERIESESSIONEFIRMA_GENERATOR", sequenceName = "SHSM_VER_SERIE_SESSIONE_FIRMA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HSM_VER_SERIE_SESSIONE_FIRMA_IDVERSERIESESSIONEFIRMA_GENERATOR")
    @Column(name = "ID_VER_SERIE_SESSIONE_FIRMA")
    public long getIdVerSerieSessioneFirma() {
        return this.idVerSerieSessioneFirma;
    }

    public void setIdVerSerieSessioneFirma(long idVerSerieSessioneFirma) {
        this.idVerSerieSessioneFirma = idVerSerieSessioneFirma;
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
    public TiEsitoFirmaVerSerie getTiEsito() {
        return this.tiEsito;
    }

    public void setTiEsito(TiEsitoFirmaVerSerie tiEsito) {
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

    // bi-directional many-to-one association to HsmSessioneFirma
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SESSIONE_FIRMA")
    public HsmSessioneFirma getHsmSessioneFirma() {
        return this.hsmSessioneFirma;
    }

    public void setHsmSessioneFirma(HsmSessioneFirma hsmSessioneFirma) {
        this.hsmSessioneFirma = hsmSessioneFirma;
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

    @Transient
    public boolean is2sign() {
        return this.tiEsito.equals(TiEsitoFirmaVerSerie.DA_FARE);
    }

    @Transient
    public boolean isSigned() {
        return this.tiEsito.equals(TiEsitoFirmaVerSerie.OK);
    }
}