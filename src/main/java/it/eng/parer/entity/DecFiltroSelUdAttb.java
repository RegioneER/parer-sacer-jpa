package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the DEC_FILTRO_SEL_UD_ATTB database table.
 * 
 */
@Entity
@Table(name = "DEC_FILTRO_SEL_UD_ATTB")
@NamedQuery(name = "DecFiltroSelUdAttb.findAll", query = "SELECT d FROM DecFiltroSelUdAttb d")
public class DecFiltroSelUdAttb implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFiltroSelUdAttb;
    private String dlValore;
    private String nmAttribDatiSpec;
    private String tiOper;
    private DecTipoSerieUd decTipoSerieUd;
    private List<DecFiltroSelUdDato> decFiltroSelUdDatos;

    public DecFiltroSelUdAttb() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FILTRO_SEL_UD_ATTB_IDFILTROSELUDATTB_GENERATOR", sequenceName = "SDEC_FILTRO_SEL_UD_ATTB", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FILTRO_SEL_UD_ATTB_IDFILTROSELUDATTB_GENERATOR")
    @Column(name = "ID_FILTRO_SEL_UD_ATTB")
    public long getIdFiltroSelUdAttb() {
        return this.idFiltroSelUdAttb;
    }

    public void setIdFiltroSelUdAttb(long idFiltroSelUdAttb) {
        this.idFiltroSelUdAttb = idFiltroSelUdAttb;
    }

    @Column(name = "DL_VALORE")
    public String getDlValore() {
        return this.dlValore;
    }

    public void setDlValore(String dlValore) {
        this.dlValore = dlValore;
    }

    @Column(name = "NM_ATTRIB_DATI_SPEC")
    public String getNmAttribDatiSpec() {
        return this.nmAttribDatiSpec;
    }

    public void setNmAttribDatiSpec(String nmAttribDatiSpec) {
        this.nmAttribDatiSpec = nmAttribDatiSpec;
    }

    @Column(name = "TI_OPER")
    public String getTiOper() {
        return this.tiOper;
    }

    public void setTiOper(String tiOper) {
        this.tiOper = tiOper;
    }

    // bi-directional many-to-one association to DecTipoSerieUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERIE_UD")
    public DecTipoSerieUd getDecTipoSerieUd() {
        return this.decTipoSerieUd;
    }

    public void setDecTipoSerieUd(DecTipoSerieUd decTipoSerieUd) {
        this.decTipoSerieUd = decTipoSerieUd;
    }

    // bi-directional many-to-one association to DecFiltroSelUdDato
    @OneToMany(mappedBy = "decFiltroSelUdAttb", cascade = { CascadeType.PERSIST, CascadeType.MERGE,
            CascadeType.REFRESH })
    public List<DecFiltroSelUdDato> getDecFiltroSelUdDatos() {
        return this.decFiltroSelUdDatos;
    }

    public void setDecFiltroSelUdDatos(List<DecFiltroSelUdDato> decFiltroSelUdDatos) {
        this.decFiltroSelUdDatos = decFiltroSelUdDatos;
    }

    public DecFiltroSelUdDato addDecFiltroSelUdDato(DecFiltroSelUdDato decFiltroSelUdDato) {
        getDecFiltroSelUdDatos().add(decFiltroSelUdDato);
        decFiltroSelUdDato.setDecFiltroSelUdAttb(this);

        return decFiltroSelUdDato;
    }

    public DecFiltroSelUdDato removeDecFiltroSelUdDato(DecFiltroSelUdDato decFiltroSelUdDato) {
        getDecFiltroSelUdDatos().remove(decFiltroSelUdDato);
        decFiltroSelUdDato.setDecFiltroSelUdAttb(null);

        return decFiltroSelUdDato;
    }

}