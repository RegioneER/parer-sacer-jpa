package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the DEC_MODELLO_FILTRO_SEL_UDATTB database table.
 * 
 */
@Entity
@Table(name = "DEC_MODELLO_FILTRO_SEL_UDATTB")
@NamedQuery(name = "DecModelloFiltroSelUdattb.findAll", query = "SELECT d FROM DecModelloFiltroSelUdattb d")
public class DecModelloFiltroSelUdattb implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idModelloFiltroSelUdattb;
    private String dlValore;
    private String nmFiltro;
    private String tiFiltro;
    private String tiOper;
    private DecModelloTipoSerie decModelloTipoSerie;

    public DecModelloFiltroSelUdattb() {
    }

    @Id
    @SequenceGenerator(name = "DEC_MODELLO_FILTRO_SEL_UDATTB_IDMODELLOFILTROSELUDATTB_GENERATOR", sequenceName = "SDEC_MODELLO_FILTRO_SEL_UDATTB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_MODELLO_FILTRO_SEL_UDATTB_IDMODELLOFILTROSELUDATTB_GENERATOR")
    @Column(name = "ID_MODELLO_FILTRO_SEL_UDATTB")
    public long getIdModelloFiltroSelUdattb() {
        return this.idModelloFiltroSelUdattb;
    }

    public void setIdModelloFiltroSelUdattb(long idModelloFiltroSelUdattb) {
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