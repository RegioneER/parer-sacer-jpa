package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the DEC_MODELLO_FILTRO_TI_DOC database table.
 * 
 */
@Entity
@Table(name = "DEC_MODELLO_FILTRO_TI_DOC")
@NamedQuery(name = "DecModelloFiltroTiDoc.findAll", query = "SELECT d FROM DecModelloFiltroTiDoc d")
public class DecModelloFiltroTiDoc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idModelloFiltroTiDoc;
    private String nmTipoDoc;
    private DecModelloTipoSerie decModelloTipoSerie;

    public DecModelloFiltroTiDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_MODELLO_FILTRO_TI_DOC_IDMODELLOFILTROTIDOC_GENERATOR", sequenceName = "SDEC_MODELLO_FILTRO_TI_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_MODELLO_FILTRO_TI_DOC_IDMODELLOFILTROTIDOC_GENERATOR")
    @Column(name = "ID_MODELLO_FILTRO_TI_DOC")
    public long getIdModelloFiltroTiDoc() {
        return this.idModelloFiltroTiDoc;
    }

    public void setIdModelloFiltroTiDoc(long idModelloFiltroTiDoc) {
        this.idModelloFiltroTiDoc = idModelloFiltroTiDoc;
    }

    @Column(name = "NM_TIPO_DOC")
    public String getNmTipoDoc() {
        return this.nmTipoDoc;
    }

    public void setNmTipoDoc(String nmTipoDoc) {
        this.nmTipoDoc = nmTipoDoc;
    }

    // bi-directional many-to-one association to DecModelloTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODELLO_TIPO_SERIE")
    public DecModelloTipoSerie getDecModelloTipoSerie() {
        return this.decModelloTipoSerie;
    }

    public void setDecModelloTipoSerie(DecModelloTipoSerie decModelloTipoSerie) {
        this.decModelloTipoSerie = decModelloTipoSerie;
    }

}