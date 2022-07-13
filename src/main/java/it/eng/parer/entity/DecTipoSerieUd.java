package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the DEC_TIPO_SERIE_UD database table.
 * 
 */
@Entity
@Table(name = "DEC_TIPO_SERIE_UD")
@NamedQuery(name = "DecTipoSerieUd.findAll", query = "SELECT d FROM DecTipoSerieUd d")
public class DecTipoSerieUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idTipoSerieUd;
    private String flSelUnitaDocAnnul;
    private List<DecFiltroSelUd> decFiltroSelUds;
    private List<DecFiltroSelUdAttb> decFiltroSelUdAttbs;
    private List<DecOutSelUd> decOutSelUds;
    private DecRegistroUnitaDoc decRegistroUnitaDoc;
    private DecTipoSerie decTipoSerie;
    private DecTipoUnitaDoc decTipoUnitaDoc;

    public DecTipoSerieUd() {
    }

    @Id
    @SequenceGenerator(name = "DEC_TIPO_SERIE_UD_IDTIPOSERIEUD_GENERATOR", sequenceName = "SDEC_TIPO_SERIE_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_TIPO_SERIE_UD_IDTIPOSERIEUD_GENERATOR")
    @Column(name = "ID_TIPO_SERIE_UD")
    public long getIdTipoSerieUd() {
        return this.idTipoSerieUd;
    }

    public void setIdTipoSerieUd(long idTipoSerieUd) {
        this.idTipoSerieUd = idTipoSerieUd;
    }

    @Column(name = "FL_SEL_UNITA_DOC_ANNUL")
    public String getFlSelUnitaDocAnnul() {
        return this.flSelUnitaDocAnnul;
    }

    public void setFlSelUnitaDocAnnul(String flSelUnitaDocAnnul) {
        this.flSelUnitaDocAnnul = flSelUnitaDocAnnul;
    }

    // bi-directional many-to-one association to DecFiltroSelUd
    @OneToMany(mappedBy = "decTipoSerieUd", cascade = CascadeType.PERSIST)
    public List<DecFiltroSelUd> getDecFiltroSelUds() {
        return this.decFiltroSelUds;
    }

    public void setDecFiltroSelUds(List<DecFiltroSelUd> decFiltroSelUds) {
        this.decFiltroSelUds = decFiltroSelUds;
    }

    public DecFiltroSelUd addDecFiltroSelUd(DecFiltroSelUd decFiltroSelUd) {
        getDecFiltroSelUds().add(decFiltroSelUd);
        decFiltroSelUd.setDecTipoSerieUd(this);

        return decFiltroSelUd;
    }

    public DecFiltroSelUd removeDecFiltroSelUd(DecFiltroSelUd decFiltroSelUd) {
        getDecFiltroSelUds().remove(decFiltroSelUd);
        decFiltroSelUd.setDecTipoSerieUd(null);

        return decFiltroSelUd;
    }

    // bi-directional many-to-one association to DecFiltroSelUdAttb
    // FIXME: Dovrebbe essere necessario solo il CASCADE PERSIST
    @OneToMany(mappedBy = "decTipoSerieUd", cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH })
    public List<DecFiltroSelUdAttb> getDecFiltroSelUdAttbs() {
        return this.decFiltroSelUdAttbs;
    }

    public void setDecFiltroSelUdAttbs(List<DecFiltroSelUdAttb> decFiltroSelUdAttbs) {
        this.decFiltroSelUdAttbs = decFiltroSelUdAttbs;
    }

    public DecFiltroSelUdAttb addDecFiltroSelUdAttb(DecFiltroSelUdAttb decFiltroSelUdAttb) {
        getDecFiltroSelUdAttbs().add(decFiltroSelUdAttb);
        decFiltroSelUdAttb.setDecTipoSerieUd(this);

        return decFiltroSelUdAttb;
    }

    public DecFiltroSelUdAttb removeDecFiltroSelUdAttb(DecFiltroSelUdAttb decFiltroSelUdAttb) {
        getDecFiltroSelUdAttbs().remove(decFiltroSelUdAttb);
        decFiltroSelUdAttb.setDecTipoSerieUd(null);

        return decFiltroSelUdAttb;
    }

    // bi-directional many-to-one association to DecOutSelUd
    @OneToMany(mappedBy = "decTipoSerieUd", cascade = CascadeType.PERSIST)
    public List<DecOutSelUd> getDecOutSelUds() {
        return this.decOutSelUds;
    }

    public void setDecOutSelUds(List<DecOutSelUd> decOutSelUds) {
        this.decOutSelUds = decOutSelUds;
    }

    public DecOutSelUd addDecOutSelUd(DecOutSelUd decOutSelUd) {
        getDecOutSelUds().add(decOutSelUd);
        decOutSelUd.setDecTipoSerieUd(this);

        return decOutSelUd;
    }

    public DecOutSelUd removeDecOutSelUd(DecOutSelUd decOutSelUd) {
        getDecOutSelUds().remove(decOutSelUd);
        decOutSelUd.setDecTipoSerieUd(null);

        return decOutSelUd;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_UNITA_DOC")
    public DecRegistroUnitaDoc getDecRegistroUnitaDoc() {
        return this.decRegistroUnitaDoc;
    }

    public void setDecRegistroUnitaDoc(DecRegistroUnitaDoc decRegistroUnitaDoc) {
        this.decRegistroUnitaDoc = decRegistroUnitaDoc;
    }

    // bi-directional many-to-one association to DecTipoSerie
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_SERIE")
    public DecTipoSerie getDecTipoSerie() {
        return this.decTipoSerie;
    }

    public void setDecTipoSerie(DecTipoSerie decTipoSerie) {
        this.decTipoSerie = decTipoSerie;
    }

    // bi-directional many-to-one association to DecTipoUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIPO_UNITA_DOC")
    public DecTipoUnitaDoc getDecTipoUnitaDoc() {
        return this.decTipoUnitaDoc;
    }

    public void setDecTipoUnitaDoc(DecTipoUnitaDoc decTipoUnitaDoc) {
        this.decTipoUnitaDoc = decTipoUnitaDoc;
    }

}