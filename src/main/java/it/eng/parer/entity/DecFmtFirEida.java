package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the DEC_FMT_FIR_EIDAS database table.
 * 
 */
@Entity
@Table(name = "DEC_FMT_FIR_EIDAS")
@NamedQuery(name = "DecFmtFirEida.findAll", query = "SELECT d FROM DecFmtFirEida d")
public class DecFmtFirEida implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFmtFirEidas;
    private BigDecimal pgOrdCampo;
    private String tiFormato;
    private List<DecAmsFmtFirEidasCrypto> decAmsFmtFirEidasCryptos;

    public DecFmtFirEida() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FMT_FIR_EIDAS_IDFMTFIREIDAS_GENERATOR", sequenceName = "SDEC_FMT_FIR_EIDAS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FMT_FIR_EIDAS_IDFMTFIREIDAS_GENERATOR")
    @Column(name = "ID_FMT_FIR_EIDAS")
    public long getIdFmtFirEidas() {
        return this.idFmtFirEidas;
    }

    public void setIdFmtFirEidas(long idFmtFirEidas) {
        this.idFmtFirEidas = idFmtFirEidas;
    }

    @Column(name = "PG_ORD_CAMPO")
    public BigDecimal getPgOrdCampo() {
        return this.pgOrdCampo;
    }

    public void setPgOrdCampo(BigDecimal pgOrdCampo) {
        this.pgOrdCampo = pgOrdCampo;
    }

    @Column(name = "TI_FORMATO")
    public String getTiFormato() {
        return this.tiFormato;
    }

    public void setTiFormato(String tiFormato) {
        this.tiFormato = tiFormato;
    }

    // bi-directional many-to-one association to DecAmsFmtFirEidasCrypto
    @OneToMany(mappedBy = "decFmtFirEida")
    public List<DecAmsFmtFirEidasCrypto> getDecAmsFmtFirEidasCryptos() {
        return this.decAmsFmtFirEidasCryptos;
    }

    public void setDecAmsFmtFirEidasCryptos(List<DecAmsFmtFirEidasCrypto> decAmsFmtFirEidasCryptos) {
        this.decAmsFmtFirEidasCryptos = decAmsFmtFirEidasCryptos;
    }

    public DecAmsFmtFirEidasCrypto addDecAmsFmtFirEidasCrypto(DecAmsFmtFirEidasCrypto decAmsFmtFirEidasCrypto) {
        getDecAmsFmtFirEidasCryptos().add(decAmsFmtFirEidasCrypto);
        decAmsFmtFirEidasCrypto.setDecFmtFirEida(this);

        return decAmsFmtFirEidasCrypto;
    }

    public DecAmsFmtFirEidasCrypto removeDecAmsFmtFirEidasCrypto(DecAmsFmtFirEidasCrypto decAmsFmtFirEidasCrypto) {
        getDecAmsFmtFirEidasCryptos().remove(decAmsFmtFirEidasCrypto);
        decAmsFmtFirEidasCrypto.setDecFmtFirEida(null);

        return decAmsFmtFirEidasCrypto;
    }

}