package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
 * The persistent class for the DEC_MODELLO_FILTRO_TI_DOC database table.
 */
@Entity
@Table(name = "DEC_MODELLO_FILTRO_TI_DOC")
@NamedQuery(name = "DecModelloFiltroTiDoc.findAll", query = "SELECT d FROM DecModelloFiltroTiDoc d")
public class DecModelloFiltroTiDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idModelloFiltroTiDoc;

    private String nmTipoDoc;

    private DecModelloTipoSerie decModelloTipoSerie;

    public DecModelloFiltroTiDoc() {/* Hibernate */
    }

    @Id
    // "DEC_MODELLO_FILTRO_TI_DOC_IDMODELLOFILTROTIDOC_GENERATOR",
    // sequenceName =
    // "SDEC_MODELLO_FILTRO_TI_DOC",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_MODELLO_FILTRO_TI_DOC_IDMODELLOFILTROTIDOC_GENERATOR")
    @Column(name = "ID_MODELLO_FILTRO_TI_DOC")
    @GenericGenerator(name = "SDEC_MODELLO_FILTRO_TI_DOC_ID_MODELLO_FILTRO_TI_DOC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_MODELLO_FILTRO_TI_DOC"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_MODELLO_FILTRO_TI_DOC_ID_MODELLO_FILTRO_TI_DOC_GENERATOR")
    public Long getIdModelloFiltroTiDoc() {
        return this.idModelloFiltroTiDoc;
    }

    public void setIdModelloFiltroTiDoc(Long idModelloFiltroTiDoc) {
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
