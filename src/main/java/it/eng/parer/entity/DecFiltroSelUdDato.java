package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the DEC_FILTRO_SEL_UD_DATO database table.
 * 
 */
@Entity
@Table(name = "DEC_FILTRO_SEL_UD_DATO")
@NamedQuery(name = "DecFiltroSelUdDato.findAll", query = "SELECT d FROM DecFiltroSelUdDato d")
public class DecFiltroSelUdDato implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idFiltroSelUdDato;
    private String dsListaVersioniXsd;
    private String nmTipoDoc;
    private String nmTipoUnitaDoc;
    private String tiEntitaSacer;
    private DecAttribDatiSpec decAttribDatiSpec;
    private DecFiltroSelUdAttb decFiltroSelUdAttb;

    public DecFiltroSelUdDato() {
    }

    @Id
    @SequenceGenerator(name = "DEC_FILTRO_SEL_UD_DATO_IDFILTROSELUDDATO_GENERATOR", sequenceName = "SDEC_FILTRO_SEL_UD_DATO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_FILTRO_SEL_UD_DATO_IDFILTROSELUDDATO_GENERATOR")
    @Column(name = "ID_FILTRO_SEL_UD_DATO")
    public long getIdFiltroSelUdDato() {
        return this.idFiltroSelUdDato;
    }

    public void setIdFiltroSelUdDato(long idFiltroSelUdDato) {
        this.idFiltroSelUdDato = idFiltroSelUdDato;
    }

    @Column(name = "DS_LISTA_VERSIONI_XSD")
    public String getDsListaVersioniXsd() {
        return this.dsListaVersioniXsd;
    }

    public void setDsListaVersioniXsd(String dsListaVersioniXsd) {
        this.dsListaVersioniXsd = dsListaVersioniXsd;
    }

    @Column(name = "NM_TIPO_DOC")
    public String getNmTipoDoc() {
        return this.nmTipoDoc;
    }

    public void setNmTipoDoc(String nmTipoDoc) {
        this.nmTipoDoc = nmTipoDoc;
    }

    @Column(name = "NM_TIPO_UNITA_DOC")
    public String getNmTipoUnitaDoc() {
        return this.nmTipoUnitaDoc;
    }

    public void setNmTipoUnitaDoc(String nmTipoUnitaDoc) {
        this.nmTipoUnitaDoc = nmTipoUnitaDoc;
    }

    @Column(name = "TI_ENTITA_SACER")
    public String getTiEntitaSacer() {
        return this.tiEntitaSacer;
    }

    public void setTiEntitaSacer(String tiEntitaSacer) {
        this.tiEntitaSacer = tiEntitaSacer;
    }

    // bi-directional many-to-one association to DecAttribDatiSpec
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ATTRIB_DATI_SPEC")
    public DecAttribDatiSpec getDecAttribDatiSpec() {
        return this.decAttribDatiSpec;
    }

    public void setDecAttribDatiSpec(DecAttribDatiSpec decAttribDatiSpec) {
        this.decAttribDatiSpec = decAttribDatiSpec;
    }

    // bi-directional many-to-one association to DecFiltroSelUdAttb
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FILTRO_SEL_UD_ATTB")
    public DecFiltroSelUdAttb getDecFiltroSelUdAttb() {
        return this.decFiltroSelUdAttb;
    }

    public void setDecFiltroSelUdAttb(DecFiltroSelUdAttb decFiltroSelUdAttb) {
        this.decFiltroSelUdAttb = decFiltroSelUdAttb;
    }

}