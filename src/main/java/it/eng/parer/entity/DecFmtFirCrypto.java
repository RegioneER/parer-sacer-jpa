package it.eng.parer.entity;

import java.io.Serializable;
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
 * The persistent class for the DEC_FMT_FIR_CRYPTO database table.
 * 
 */
@Entity
@Table(name = "DEC_FMT_FIR_CRYPTO")
@NamedQuery(name = "DecFmtFirCrypto.findAll", query = "SELECT d FROM DecFmtFirCrypto d")
public class DecFmtFirCrypto implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFmtFirCrypto;
    private String tiFormato;
    private List<DecAmsFmtFirEidasCrypto> decAmsFmtFirEidasCryptos;

    public DecFmtFirCrypto() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FMT_FIR_CRYPTO_IDFMTFIRCRYPTO_GENERATOR", sequenceName = "SDEC_FMT_FIR_CRYPTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FMT_FIR_CRYPTO_IDFMTFIRCRYPTO_GENERATOR")
    @Column(name = "ID_FMT_FIR_CRYPTO")
    public long getIdFmtFirCrypto() {
        return this.idFmtFirCrypto;
    }

    public void setIdFmtFirCrypto(long idFmtFirCrypto) {
        this.idFmtFirCrypto = idFmtFirCrypto;
    }

    @Column(name = "TI_FORMATO")
    public String getTiFormato() {
        return this.tiFormato;
    }

    public void setTiFormato(String tiFormato) {
        this.tiFormato = tiFormato;
    }

    // bi-directional many-to-one association to DecAmsFmtFirEidasCrypto
    @OneToMany(mappedBy = "decFmtFirCrypto")
    public List<DecAmsFmtFirEidasCrypto> getDecAmsFmtFirEidasCryptos() {
        return this.decAmsFmtFirEidasCryptos;
    }

    public void setDecAmsFmtFirEidasCryptos(List<DecAmsFmtFirEidasCrypto> decAmsFmtFirEidasCryptos) {
        this.decAmsFmtFirEidasCryptos = decAmsFmtFirEidasCryptos;
    }

    public DecAmsFmtFirEidasCrypto addDecAmsFmtFirEidasCrypto(DecAmsFmtFirEidasCrypto decAmsFmtFirEidasCrypto) {
        getDecAmsFmtFirEidasCryptos().add(decAmsFmtFirEidasCrypto);
        decAmsFmtFirEidasCrypto.setDecFmtFirCrypto(this);

        return decAmsFmtFirEidasCrypto;
    }

    public DecAmsFmtFirEidasCrypto removeDecAmsFmtFirEidasCrypto(DecAmsFmtFirEidasCrypto decAmsFmtFirEidasCrypto) {
        getDecAmsFmtFirEidasCryptos().remove(decAmsFmtFirEidasCrypto);
        decAmsFmtFirEidasCrypto.setDecFmtFirCrypto(null);

        return decAmsFmtFirEidasCrypto;
    }

}