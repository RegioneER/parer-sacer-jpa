package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_FORMATO_VALUTAZIONE database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_FORMATO_VALUTAZIONE")
public class DecFormatoValutazione implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idFormatoValutazione;
    private DecFormatoProprieta decFormatoProprieta;
    private DecFormatoFileStandard decFormatoFileStandard;
    private BigDecimal niPunteggio;

    public DecFormatoValutazione() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FORMATO_VALUTAZIONE_GENERATOR", sequenceName = "SDEC_FORMATO_VALUTAZIONE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FORMATO_VALUTAZIONE_GENERATOR")
    @Column(name = "ID_FORMATO_VALUTAZIONE")
    public Long getIdFormatoValutazione() {
        return idFormatoValutazione;
    }

    public void setIdFormatoValutazione(Long idFormatoValutazione) {
        this.idFormatoValutazione = idFormatoValutazione;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_PROPRIETA")
    public DecFormatoProprieta getDecFormatoProprieta() {
        return decFormatoProprieta;
    }

    public void setDecFormatoProprieta(DecFormatoProprieta decFormatoProprieta) {
        this.decFormatoProprieta = decFormatoProprieta;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FORMATO_FILE_STANDARD")
    public DecFormatoFileStandard getDecFormatoFileStandard() {
        return decFormatoFileStandard;
    }

    public void setDecFormatoFileStandard(DecFormatoFileStandard decFormatoFileStandard) {
        this.decFormatoFileStandard = decFormatoFileStandard;
    }

    @Column(name = "NI_PUNTEGGIO")
    public BigDecimal getNiPunteggio() {
        return niPunteggio;
    }

    public void setNiPunteggio(BigDecimal niPunteggio) {
        this.niPunteggio = niPunteggio;
    }

}
