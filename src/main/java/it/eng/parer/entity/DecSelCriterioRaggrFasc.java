package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_SEL_CRITERIO_RAGGR_FASC database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_SEL_CRITERIO_RAGGR_FASC")
@NamedQuery(name = "DecSelCriterioRaggrFasc.findAll", query = "SELECT d FROM DecSelCriterioRaggrFasc d")
public class DecSelCriterioRaggrFasc implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idSelCriterioRaggrFasc;
    private DecCriterioRaggrFasc decCriterioRaggrFasc;
    private String tiSel;
    private AplSistemaMigraz aplSistemaMigraz;
    private DecTipoFascicolo decTipoFascicolo;
    private DecVoceTitol decVoceTitol;

    public DecSelCriterioRaggrFasc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_SEL_CRITERIO_RAGGR_FASC_IDSELCRITERIORAGGRFASC_GENERATOR", sequenceName = "SDEC_SEL_CRITERIO_RAGGR_FASC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_SEL_CRITERIO_RAGGR_FASC_IDSELCRITERIORAGGRFASC_GENERATOR")
    @Column(name = "ID_SEL_CRITERIO_RAGGR_FASC")
    @XmlID
    public long getIdSelCriterioRaggrFasc() {
        return this.idSelCriterioRaggrFasc;
    }

    public void setIdSelCriterioRaggrFasc(long idSelCriterioRaggrFasc) {
        this.idSelCriterioRaggrFasc = idSelCriterioRaggrFasc;
    }

    // bi-directional many-to-one association to DecCriterioRaggrFasc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CRITERIO_RAGGR_FASC")
    public DecCriterioRaggrFasc getDecCriterioRaggrFasc() {
        return this.decCriterioRaggrFasc;
    }

    public void setDecCriterioRaggrFasc(DecCriterioRaggrFasc decCriterioRaggrFasc) {
        this.decCriterioRaggrFasc = decCriterioRaggrFasc;
    }

    @Column(name = "TI_SEL")
    public String getTiSel() {
        return this.tiSel;
    }

    public void setTiSel(String tiSel) {
        this.tiSel = tiSel;
    }

    // bi-directional many-to-one association to AplSistemaMigraz
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SISTEMA_MIGRAZ")
    @XmlTransient
    public AplSistemaMigraz getAplSistemaMigraz() {
        return this.aplSistemaMigraz;
    }

    public void setAplSistemaMigraz(AplSistemaMigraz aplSistemaMigraz) {
        this.aplSistemaMigraz = aplSistemaMigraz;
    }

    // bi-directional many-to-one association to DecTipoFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_FASCICOLO")
    @XmlInverseReference(mappedBy = "decSelCriterioRaggrFascicoli")
    public DecTipoFascicolo getDecTipoFascicolo() {
        return this.decTipoFascicolo;
    }

    public void setDecTipoFascicolo(DecTipoFascicolo decTipoFascicolo) {
        this.decTipoFascicolo = decTipoFascicolo;
    }

    // bi-directional many-to-one association to DecVoceTitol
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VOCE_TITOL")
    @XmlTransient
    public DecVoceTitol getDecVoceTitol() {
        return this.decVoceTitol;
    }

    public void setDecVoceTitol(DecVoceTitol decVoceTitol) {
        this.decVoceTitol = decVoceTitol;
    }

}