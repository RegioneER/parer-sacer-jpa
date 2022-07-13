package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

/**
 * The persistent class for the FAS_XSD_META_VER_AIP_FASC database table.
 * 
 */
@Entity
@Table(name = "FAS_XSD_META_VER_AIP_FASC")
public class FasXsdMetaVerAipFasc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idXsdMetaVerAipFasc;
    private String nmXsd;
    private FasMetaVerAipFascicolo fasMetaVerAipFascicolo;
    private DecModelloXsdFascicolo decModelloXsdFascicolo;

    public FasXsdMetaVerAipFasc() {
    }

    @Id
    @SequenceGenerator(name = "FAS_XSD_META_VER_AIP_FASC_IDXSDMETAVERAIPFASC_GENERATOR", allocationSize = 1, sequenceName = "SFAS_XSD_META_VER_AIP_FASC")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_XSD_META_VER_AIP_FASC_IDXSDMETAVERAIPFASC_GENERATOR")
    @Column(name = "ID_XSD_META_VER_AIP_FASC")
    public long getIdXsdMetaVerAipFasc() {
        return this.idXsdMetaVerAipFasc;
    }

    public void setIdXsdMetaVerAipFasc(long idXsdMetaVerAipFasc) {
        this.idXsdMetaVerAipFasc = idXsdMetaVerAipFasc;
    }

    @Column(name = "NM_XSD")
    public String getNmXsd() {
        return this.nmXsd;
    }

    public void setNmXsd(String nmXsd) {
        this.nmXsd = nmXsd;
    }

    // bi-directional many-to-one association to FasMetaVerAipFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_META_VER_AIP_FASCICOLO")
    public FasMetaVerAipFascicolo getFasMetaVerAipFascicolo() {
        return this.fasMetaVerAipFascicolo;
    }

    public void setFasMetaVerAipFascicolo(FasMetaVerAipFascicolo fasMetaVerAipFascicolo) {
        this.fasMetaVerAipFascicolo = fasMetaVerAipFascicolo;
    }

    // bi-directional many-to-one association to DecModelloXsdFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODELLO_XSD_FASCICOLO")
    public DecModelloXsdFascicolo getDecModelloXsdFascicolo() {
        return this.decModelloXsdFascicolo;
    }

    public void setDecModelloXsdFascicolo(DecModelloXsdFascicolo decModelloXsdFascicolo) {
        this.decModelloXsdFascicolo = decModelloXsdFascicolo;
    }
}