package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import it.eng.parer.entity.constraint.HsmElencoFascSesFirma.TiEsitoFirmaElencoFasc;

/**
 * The persistent class for the HSM_ELENCO_FASC_SES_FIRMA database table.
 *
 */
@Entity
@Table(name = "HSM_ELENCO_FASC_SES_FIRMA")
@NamedQuery(name = "HsmElencoFascSesFirma.findAll", query = "SELECT h FROM HsmElencoFascSesFirma h")
public class HsmElencoFascSesFirma implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idElencoFascSesFirma;
    private String cdErr;
    private String dsErr;
    private TiEsitoFirmaElencoFasc tiEsito;
    private ElvElencoVersFasc elvElencoVersFasc;
    private Date tsEsito;
    private HsmSessioneFirma hsmSessioneFirma;

    public HsmElencoFascSesFirma() {
    }

    @Id
    @SequenceGenerator(name = "HSM_ELENCO_FASC_SES_FIRMA_IDELENCOFASCSESFIRMA_GENERATOR", sequenceName = "SHSM_ELENCO_FASC_SES_FIRMA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HSM_ELENCO_FASC_SES_FIRMA_IDELENCOFASCSESFIRMA_GENERATOR")
    @Column(name = "ID_ELENCO_FASC_SES_FIRMA")
    public long getIdElencoFascSesFirma() {
        return this.idElencoFascSesFirma;
    }

    public void setIdElencoFascSesFirma(long idElencoFascSesFirma) {
        this.idElencoFascSesFirma = idElencoFascSesFirma;
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
    public TiEsitoFirmaElencoFasc getTiEsito() {
        return this.tiEsito;
    }

    public void setTiEsito(TiEsitoFirmaElencoFasc tiEsito) {
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

    // bi-directional many-to-one association to ElvElencoVersFasc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ELENCO_VERS_FASC")
    public ElvElencoVersFasc getElvElencoVersFasc() {
        return this.elvElencoVersFasc;
    }

    public void setElvElencoVersFasc(ElvElencoVersFasc elvElencoVersFasc) {
        this.elvElencoVersFasc = elvElencoVersFasc;
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
        return this.tiEsito.equals(TiEsitoFirmaElencoFasc.DA_FARE);
    }

    @Transient
    public boolean isSigned() {
        return this.tiEsito.equals(TiEsitoFirmaElencoFasc.OK);
    }
}