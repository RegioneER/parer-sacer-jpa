package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the DEC_AMS_FMT_FIR_EIDAS_CRYPTO database table.
 */
@Entity
@Table(name = "DEC_AMS_FMT_FIR_EIDAS_CRYPTO")
@NamedQuery(name = "DecAmsFmtFirEidasCrypto.findAll", query = "SELECT d FROM DecAmsFmtFirEidasCrypto d")
public class DecAmsFmtFirEidasCrypto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idAmsFmtFirEidasCrypto;

    private DecFmtFirCrypto decFmtFirCrypto;

    private DecFmtFirEida decFmtFirEida;

    public DecAmsFmtFirEidasCrypto() {/* Hibernate */
    }

    @Id
    // "DEC_AMS_FMT_FIR_EIDAS_CRYPTO_IDAMSFMTFIREIDASCRYPTO_GENERATOR",
    // sequenceName =
    // "SDEC_AMS_FMT_FIR_EIDAS_CRYPTO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_AMS_FMT_FIR_EIDAS_CRYPTO_IDAMSFMTFIREIDASCRYPTO_GENERATOR")
    @Column(name = "ID_AMS_FMT_FIR_EIDAS_CRYPTO")
    @GenericGenerator(name = "SDEC_AMS_FMT_FIR_EIDAS_CRYPTO_ID_AMS_FMT_FIR_EIDAS_CRYPTO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_AMS_FMT_FIR_EIDAS_CRYPTO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_AMS_FMT_FIR_EIDAS_CRYPTO_ID_AMS_FMT_FIR_EIDAS_CRYPTO_GENERATOR")
    public Long getIdAmsFmtFirEidasCrypto() {
        return this.idAmsFmtFirEidasCrypto;
    }

    public void setIdAmsFmtFirEidasCrypto(Long idAmsFmtFirEidasCrypto) {
        this.idAmsFmtFirEidasCrypto = idAmsFmtFirEidasCrypto;
    }

    // bi-directional many-to-one association to DecFmtFirCrypto
    @ManyToOne
    @JoinColumn(name = "ID_FMT_FIR_CRYPTO")
    public DecFmtFirCrypto getDecFmtFirCrypto() {
        return this.decFmtFirCrypto;
    }

    public void setDecFmtFirCrypto(DecFmtFirCrypto decFmtFirCrypto) {
        this.decFmtFirCrypto = decFmtFirCrypto;
    }

    // bi-directional many-to-one association to DecFmtFirEida
    @ManyToOne
    @JoinColumn(name = "ID_FMT_FIR_EIDAS")
    public DecFmtFirEida getDecFmtFirEida() {
        return this.decFmtFirEida;
    }

    public void setDecFmtFirEida(DecFmtFirEida decFmtFirEida) {
        this.decFmtFirEida = decFmtFirEida;
    }
}
