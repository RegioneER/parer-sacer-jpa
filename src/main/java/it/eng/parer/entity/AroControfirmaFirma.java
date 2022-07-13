package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ARO_CONTROFIRMA_FIRMA database table.
 * 
 */
@Entity
@Table(name = "ARO_CONTROFIRMA_FIRMA")
public class AroControfirmaFirma implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idControfirmaFirma;
    private AroFirmaComp aroFirmaFiglio;
    private AroFirmaComp aroFirmaPadre;

    public AroControfirmaFirma() {
    }

    @Id
    @SequenceGenerator(name = "ARO_CONTROFIRMA_FIRMA_IDCONTROFIRMAFIRMA_GENERATOR", sequenceName = "SARO_CONTROFIRMA_FIRMA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_CONTROFIRMA_FIRMA_IDCONTROFIRMAFIRMA_GENERATOR")
    @Column(name = "ID_CONTROFIRMA_FIRMA")
    public long getIdControfirmaFirma() {
        return this.idControfirmaFirma;
    }

    public void setIdControfirmaFirma(long idControfirmaFirma) {
        this.idControfirmaFirma = idControfirmaFirma;
    }

    // bi-directional many-to-one association to AroFirmaComp
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH,
            CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FIRMA_FIGLIO")
    public AroFirmaComp getAroFirmaFiglio() {
        return this.aroFirmaFiglio;
    }

    public void setAroFirmaFiglio(AroFirmaComp aroFirmaFiglio) {
        this.aroFirmaFiglio = aroFirmaFiglio;
    }

    // bi-directional many-to-one association to AroFirmaComp
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FIRMA_PADRE")
    public AroFirmaComp getAroFirmaPadre() {
        return this.aroFirmaPadre;
    }

    public void setAroFirmaPadre(AroFirmaComp aroFirmaPadre) {
        this.aroFirmaPadre = aroFirmaPadre;
    }

}