package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_PARTE_NUMERO_REGISTRO database table.
 *
 */
@Entity
@Table(name = "DEC_PARTE_NUMERO_REGISTRO")
@NamedQuery(name = "DecParteNumeroRegistro.findAll", query = "SELECT d FROM DecParteNumeroRegistro d")
public class DecParteNumeroRegistro implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idParteNumeroRegistro;
    private String dlValoriParte;
    private String dsParteNumeroRegistro;
    private BigDecimal niMaxCharParte;
    private BigDecimal niMinCharParte;
    private BigDecimal niParteNumeroRegistro;
    private String nmParteNumeroRegistro;
    private String tiCharParte;
    private String tiCharSep;
    private String tiPadSxParte;
    private String tiParte;
    private DecAaRegistroUnitaDoc decAaRegistroUnitaDoc;

    public DecParteNumeroRegistro() {
    }

    @Id
    @SequenceGenerator(name = "DEC_PARTE_NUMERO_REGISTRO_IDPARTENUMEROREGISTRO_GENERATOR", sequenceName = "SDEC_PARTE_NUMERO_REGISTRO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_PARTE_NUMERO_REGISTRO_IDPARTENUMEROREGISTRO_GENERATOR")
    @Column(name = "ID_PARTE_NUMERO_REGISTRO")
    public long getIdParteNumeroRegistro() {
        return this.idParteNumeroRegistro;
    }

    public void setIdParteNumeroRegistro(long idParteNumeroRegistro) {
        this.idParteNumeroRegistro = idParteNumeroRegistro;
    }

    @Column(name = "DL_VALORI_PARTE")
    public String getDlValoriParte() {
        return this.dlValoriParte;
    }

    public void setDlValoriParte(String dlValoriParte) {
        this.dlValoriParte = dlValoriParte;
    }

    @Column(name = "DS_PARTE_NUMERO_REGISTRO")
    public String getDsParteNumeroRegistro() {
        return this.dsParteNumeroRegistro;
    }

    public void setDsParteNumeroRegistro(String dsParteNumeroRegistro) {
        this.dsParteNumeroRegistro = dsParteNumeroRegistro;
    }

    @Column(name = "NI_MAX_CHAR_PARTE")
    public BigDecimal getNiMaxCharParte() {
        return this.niMaxCharParte;
    }

    public void setNiMaxCharParte(BigDecimal niMaxCharParte) {
        this.niMaxCharParte = niMaxCharParte;
    }

    @Column(name = "NI_MIN_CHAR_PARTE")
    public BigDecimal getNiMinCharParte() {
        return this.niMinCharParte;
    }

    public void setNiMinCharParte(BigDecimal niMinCharParte) {
        this.niMinCharParte = niMinCharParte;
    }

    @Column(name = "NI_PARTE_NUMERO_REGISTRO")
    public BigDecimal getNiParteNumeroRegistro() {
        return this.niParteNumeroRegistro;
    }

    public void setNiParteNumeroRegistro(BigDecimal niParteNumeroRegistro) {
        this.niParteNumeroRegistro = niParteNumeroRegistro;
    }

    @Column(name = "NM_PARTE_NUMERO_REGISTRO")
    public String getNmParteNumeroRegistro() {
        return this.nmParteNumeroRegistro;
    }

    public void setNmParteNumeroRegistro(String nmParteNumeroRegistro) {
        this.nmParteNumeroRegistro = nmParteNumeroRegistro;
    }

    @Column(name = "TI_CHAR_PARTE")
    public String getTiCharParte() {
        return this.tiCharParte;
    }

    public void setTiCharParte(String tiCharParte) {
        this.tiCharParte = tiCharParte;
    }

    @Column(name = "TI_CHAR_SEP")
    public String getTiCharSep() {
        return this.tiCharSep;
    }

    public void setTiCharSep(String tiCharSep) {
        this.tiCharSep = tiCharSep;
    }

    @Column(name = "TI_PAD_SX_PARTE")
    public String getTiPadSxParte() {
        return this.tiPadSxParte;
    }

    public void setTiPadSxParte(String tiPadSxParte) {
        this.tiPadSxParte = tiPadSxParte;
    }

    @Column(name = "TI_PARTE")
    public String getTiParte() {
        return tiParte;
    }

    public void setTiParte(String tiParte) {
        this.tiParte = tiParte;
    }

    // bi-directional many-to-one association to DecAaRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_AA_REGISTRO_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decParteNumeroRegistros")
    public DecAaRegistroUnitaDoc getDecAaRegistroUnitaDoc() {
        return this.decAaRegistroUnitaDoc;
    }

    public void setDecAaRegistroUnitaDoc(DecAaRegistroUnitaDoc decAaRegistroUnitaDoc) {
        this.decAaRegistroUnitaDoc = decAaRegistroUnitaDoc;
    }

}
