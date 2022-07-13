package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_CRITERIO_FILTRO_MULTIPLO database table.
 *
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_CRITERIO_FILTRO_MULTIPLO")
public class DecCriterioFiltroMultiplo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idCriterioFiltroMult;
    private String tiEsitoVerifFirme;
    private String nmSistemaMigraz;
    private String tiFiltroMultiplo;
    private DecCriterioRaggr decCriterioRaggr;
    private DecRegistroUnitaDoc decRegistroUnitaDoc;
    private DecRegistroUnitaDoc decRegistroRangeUnitaDoc;
    private DecTipoDoc decTipoDoc;
    private DecTipoUnitaDoc decTipoUnitaDoc;

    public DecCriterioFiltroMultiplo() {
    }

    @Id
    @SequenceGenerator(name = "DEC_CRITERIO_FILTRO_MULTIPLO_IDCRITERIOFILTROMULT_GENERATOR", sequenceName = "SDEC_CRITERIO_FILTRO_MULTIPLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_CRITERIO_FILTRO_MULTIPLO_IDCRITERIOFILTROMULT_GENERATOR")
    @Column(name = "ID_CRITERIO_FILTRO_MULT")
    @XmlID
    public long getIdCriterioFiltroMult() {
        return this.idCriterioFiltroMult;
    }

    public void setIdCriterioFiltroMult(long idCriterioFiltroMult) {
        this.idCriterioFiltroMult = idCriterioFiltroMult;
    }

    @Column(name = "NM_SISTEMA_MIGRAZ")
    public String getNmSistemaMigraz() {
        return this.nmSistemaMigraz;
    }

    public void setNmSistemaMigraz(String nmSistemaMigraz) {
        this.nmSistemaMigraz = nmSistemaMigraz;
    }

    @Column(name = "TI_ESITO_VERIF_FIRME")
    public String getTiEsitoVerifFirme() {
        return this.tiEsitoVerifFirme;
    }

    public void setTiEsitoVerifFirme(String tiEsitoVerifFirme) {
        this.tiEsitoVerifFirme = tiEsitoVerifFirme;
    }

    @Column(name = "TI_FILTRO_MULTIPLO")
    public String getTiFiltroMultiplo() {
        return this.tiFiltroMultiplo;
    }

    public void setTiFiltroMultiplo(String tiFiltroMultiplo) {
        this.tiFiltroMultiplo = tiFiltroMultiplo;
    }

    // bi-directional many-to-one association to DecCriterioRaggr
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CRITERIO_RAGGR")
    @XmlInverseReference(mappedBy = "decCriterioFiltroMultiplos")
    public DecCriterioRaggr getDecCriterioRaggr() {
        return this.decCriterioRaggr;
    }

    public void setDecCriterioRaggr(DecCriterioRaggr decCriterioRaggr) {
        this.decCriterioRaggr = decCriterioRaggr;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decCriterioFiltroMultiplos")
    public DecRegistroUnitaDoc getDecRegistroUnitaDoc() {
        return this.decRegistroUnitaDoc;
    }

    public void setDecRegistroUnitaDoc(DecRegistroUnitaDoc decRegistroUnitaDoc) {
        this.decRegistroUnitaDoc = decRegistroUnitaDoc;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_RANGE_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decRangeCriterioFiltroMultiplos")
    public DecRegistroUnitaDoc getDecRegistroRangeUnitaDoc() {
        return this.decRegistroRangeUnitaDoc;
    }

    public void setDecRegistroRangeUnitaDoc(DecRegistroUnitaDoc decRegistroRangeUnitaDoc) {
        this.decRegistroRangeUnitaDoc = decRegistroRangeUnitaDoc;
    }

    // bi-directional many-to-one association to DecTipoDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_DOC")
    @XmlInverseReference(mappedBy = "decCriterioFiltroMultiplos")
    public DecTipoDoc getDecTipoDoc() {
        return this.decTipoDoc;
    }

    public void setDecTipoDoc(DecTipoDoc decTipoDoc) {
        this.decTipoDoc = decTipoDoc;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    @XmlInverseReference(mappedBy = "decCriterioFiltroMultiplos")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

}
