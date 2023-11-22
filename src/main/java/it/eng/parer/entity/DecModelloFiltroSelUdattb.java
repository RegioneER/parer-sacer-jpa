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
 * The persistent class for the DEC_MODELLO_FILTRO_SEL_UDATTB database table.
 */
@Entity
@Table(name = "DEC_MODELLO_FILTRO_SEL_UDATTB")
@NamedQuery(name = "DecModelloFiltroSelUdattb.findAll", query = "SELECT d FROM DecModelloFiltroSelUdattb d")
public class DecModelloFiltroSelUdattb implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idModelloFiltroSelUdattb;

    private String dlValore;

    private String nmFiltro;

    private String tiFiltro;

    private String tiOper;

    private DecModelloTipoSerie decModelloTipoSerie;

    public DecModelloFiltroSelUdattb() {/* Hibernate */
    }

    @Id
    // "DEC_MODELLO_FILTRO_SEL_UDATTB_IDMODELLOFILTROSELUDATTB_GENERATOR",
    // sequenceName =
    // "SDEC_MODELLO_FILTRO_SEL_UDATTB",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_MODELLO_FILTRO_SEL_UDATTB_IDMODELLOFILTROSELUDATTB_GENERATOR")
    @Column(name = "ID_MODELLO_FILTRO_SEL_UDATTB")
    @GenericGenerator(name = "SDEC_MODELLO_FILTRO_SEL_UDATTB_ID_MODELLO_FILTRO_SEL_UDATTB_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_MODELLO_FILTRO_SEL_UDATTB"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_MODELLO_FILTRO_SEL_UDATTB_ID_MODELLO_FILTRO_SEL_UDATTB_GENERATOR")
    public Long getIdModelloFiltroSelUdattb() {
        return this.idModelloFiltroSelUdattb;
    }

    public void setIdModelloFiltroSelUdattb(Long idModelloFiltroSelUdattb) {
        this.idModelloFiltroSelUdattb = idModelloFiltroSelUdattb;
    }

    @Column(name = "DL_VALORE")
    public String getDlValore() {
        return this.dlValore;
    }

    public void setDlValore(String dlValore) {
        this.dlValore = dlValore;
    }

    @Column(name = "NM_FILTRO")
    public String getNmFiltro() {
        return this.nmFiltro;
    }

    public void setNmFiltro(String nmFiltro) {
        this.nmFiltro = nmFiltro;
    }

    @Column(name = "TI_FILTRO")
    public String getTiFiltro() {
        return this.tiFiltro;
    }

    public void setTiFiltro(String tiFiltro) {
        this.tiFiltro = tiFiltro;
    }

    @Column(name = "TI_OPER")
    public String getTiOper() {
        return this.tiOper;
    }

    public void setTiOper(String tiOper) {
        this.tiOper = tiOper;
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
