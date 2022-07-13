package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import it.eng.parer.entity.constraint.AroAipRestituzioneArchivio.TiStatoAroAipRa;
import it.eng.parer.entity.constraint.AroAipRestituzioneArchivio.AroAipRaTipologiaOggetto;

/**
 * The persistent class for the ARO_AIP_RESTITUZIONE_ARCHIVIO database table.
 *
 */
@Entity
@Table(name = "ARO_AIP_RESTITUZIONE_ARCHIVIO")
@NamedQuery(name = "AroAipRestituzioneArchivio.findAll", query = "SELECT a FROM AroAipRestituzioneArchivio a")
public class AroAipRestituzioneArchivio implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idAipRestArchivio;
    private AroIndiceAipUd aroIndiceAipUd;
    private AroRichiestaRa aroRichiestaRa;
    private TiStatoAroAipRa tiStato;
    private AroAipRaTipologiaOggetto tiTipologiaOggetto;
    private Date dtEstrazione;
    private BigDecimal dim;
    private String cdErrore;

    public AroAipRestituzioneArchivio() {
    }

    @Id
    @SequenceGenerator(name = "ARO_AIP_RESTITUZIONE_ARCHIVIO_IDAIPRESTARCHIVIO_GENERATOR", sequenceName = "SARO_AIP_RESTITUZIONE_ARCHIVIO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_AIP_RESTITUZIONE_ARCHIVIO_IDAIPRESTARCHIVIO_GENERATOR")
    @Column(name = "ID_AIP_REST_ARCHIVIO")
    public long getIdAipRestArchivio() {
        return this.idAipRestArchivio;
    }

    public void setIdAipRestArchivio(long idAipRestArchivio) {
        this.idAipRestArchivio = idAipRestArchivio;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_ESTRAZIONE")
    public Date getDtEstrazione() {
        return this.dtEstrazione;
    }

    public void setDtEstrazione(Date dtEstrazione) {
        this.dtEstrazione = dtEstrazione;
    }

    @Column(name = "DIM")
    public BigDecimal getDim() {
        return this.dim;
    }

    public void setDim(BigDecimal dim) {
        this.dim = dim;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_STATO")
    public TiStatoAroAipRa getTiStato() {
        return this.tiStato;
    }

    public void setTiStato(TiStatoAroAipRa tiStato) {
        this.tiStato = tiStato;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_TIPOLOGIA_OGGETTO")
    public AroAipRaTipologiaOggetto getTiTipologiaOggetto() {
        return this.tiTipologiaOggetto;
    }

    public void setTiTipologiaOggetto(AroAipRaTipologiaOggetto tiTipologiaOggetto) {
        this.tiTipologiaOggetto = tiTipologiaOggetto;
    }

    @Column(name = "CD_ERRORE")
    public String getCdErrore() {
        return this.cdErrore;
    }

    public void setCdErrore(String cdErrore) {
        this.cdErrore = cdErrore;
    }

    // bi-directional many-to-one association to AroRichiestaRa
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_RICHIESTA_RA")
    public AroRichiestaRa getAroRichiestaRa() {
        return this.aroRichiestaRa;
    }

    public void setAroRichiestaRa(AroRichiestaRa aroRichiestaRa) {
        this.aroRichiestaRa = aroRichiestaRa;
    }

    // bi-directional many-to-one association to AroIndiceAipUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_INDICE_AIP")
    public AroIndiceAipUd getAroIndiceAipUd() {
        return this.aroIndiceAipUd;
    }

    public void setAroIndiceAipUd(AroIndiceAipUd aroIndiceAipUd) {
        this.aroIndiceAipUd = aroIndiceAipUd;
    }

}
