package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ARO_V_RIC_RICH_RA database table.
 *
 */
@Entity
@Table(name = "ARO_V_RIC_RICH_RA")
@NamedQuery(name = "AroVRicRichRa.findAll", query = "SELECT a FROM AroVRicRichRa a")
public class AroVRicRichRa implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idRichiestaRa;
    private BigDecimal idEnte;
    private BigDecimal idAmbiente;
    private BigDecimal idStrut;
    private BigDecimal idEnteConvenz;
    private String nmEnteConvenz;
    private String nmEnteStrut;
    private String cdErrore;
    private String tiStato;
    private Date maxDtEstrazione;
    private BigDecimal totali;
    private BigDecimal estratti;
    private BigDecimal errori;
    private BigDecimal sumDim;
    private BigDecimal estrattiTotali;
    private BigDecimal priorita;

    public AroVRicRichRa() {
    }

    public AroVRicRichRa(BigDecimal idRichiestaRa, String nmEnteConvenz, String nmEnteStrut, BigDecimal idEnte,
            BigDecimal idStrut, BigDecimal idEnteConvenz, BigDecimal totali, BigDecimal estratti, BigDecimal errori,
            BigDecimal estrattiTotali, BigDecimal sumDim, Date maxDtEstrazione, String tiStato, BigDecimal priorita) {
        this.idRichiestaRa = idRichiestaRa;
        this.nmEnteConvenz = nmEnteConvenz;
        this.nmEnteStrut = nmEnteStrut;
        this.idEnte = idEnte;
        this.idStrut = idStrut;
        this.idEnteConvenz = idEnteConvenz;
        this.totali = totali;
        this.estratti = estratti;
        this.errori = errori;
        this.estrattiTotali = estrattiTotali;
        this.sumDim = sumDim;
        this.maxDtEstrazione = maxDtEstrazione;
        this.tiStato = tiStato;
        this.priorita = priorita;
    }

    @Column(name = "TOTALI")
    public BigDecimal getTotali() {
        return this.totali;
    }

    public void setTotali(BigDecimal totali) {
        this.totali = totali;
    }

    @Column(name = "ESTRATTI")
    public BigDecimal getEstratti() {
        return this.estratti;
    }

    public void setEstratti(BigDecimal estratti) {
        this.estratti = estratti;
    }

    @Column(name = "ERRORI")
    public BigDecimal getErrori() {
        return this.errori;
    }

    public void setErrori(BigDecimal errori) {
        this.errori = errori;
    }

    @Column(name = "NM_ENTE_CONVENZ")
    public String getNmEnteConvenz() {
        return this.nmEnteConvenz;
    }

    public void setNmEnteConvenz(String nmEnteConvenz) {
        this.nmEnteConvenz = nmEnteConvenz;
    }

    @Column(name = "NM_ENTE_STRUT")
    public String getNmEnteStrut() {
        return this.nmEnteStrut;
    }

    public void setNmEnteStrut(String nmEnteStrut) {
        this.nmEnteStrut = nmEnteStrut;
    }

    @Column(name = "CD_ERRORE")
    public String getCdErrore() {
        return this.cdErrore;
    }

    public void setCdErrore(String cdErrore) {
        this.cdErrore = cdErrore;
    }

    @Column(name = "TI_STATO")
    public String getTiStato() {
        return this.tiStato;
    }

    public void setTiStato(String tiStato) {
        this.tiStato = tiStato;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "MAX_DT_ESTRAZIONE")
    public Date getMaxDtEstrazione() {
        return this.maxDtEstrazione;
    }

    public void setMaxDtEstrazione(Date maxDtEstrazione) {
        this.maxDtEstrazione = maxDtEstrazione;
    }

    @Id
    @Column(name = "ID_RICHIESTA_RA")
    public BigDecimal getIdRichiestaRa() {
        return this.idRichiestaRa;
    }

    public void setIdRichiestaRa(BigDecimal idRichiestaRa) {
        this.idRichiestaRa = idRichiestaRa;
    }

    @Column(name = "ID_ENTE")
    public BigDecimal getIdEnte() {
        return this.idEnte;
    }

    public void setIdEnte(BigDecimal idEnte) {
        this.idEnte = idEnte;
    }

    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "ID_ENTE_CONVENZ")
    public BigDecimal getIdEnteConvenz() {
        return this.idEnteConvenz;
    }

    public void setIdEnteConvenz(BigDecimal idEnteConvenz) {
        this.idEnteConvenz = idEnteConvenz;
    }

    @Column(name = "ESTRATTI_TOTALI")
    public BigDecimal getEstrattiTotali() {
        return this.estrattiTotali;
    }

    public void setEstrattiTotali(BigDecimal estrattiTotali) {
        this.estrattiTotali = estrattiTotali;
    }

    @Column(name = "PRIORITA")
    public BigDecimal getPriorita() {
        return this.priorita;
    }

    public void setPriorita(BigDecimal priorita) {
        this.priorita = priorita;
    }

    @Column(name = "SUM_DIM")
    public BigDecimal getSumDim() {
        return this.sumDim;
    }

    public void setSumDim(BigDecimal sumDim) {
        this.sumDim = sumDim;
    }
}
