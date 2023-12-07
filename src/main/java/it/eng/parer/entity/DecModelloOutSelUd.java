package it.eng.parer.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the DEC_MODELLO_OUT_SEL_UD database table.
 */
@Entity
@Table(name = "DEC_MODELLO_OUT_SEL_UD")
@NamedQuery(name = "DecModelloOutSelUd.findAll", query = "SELECT d FROM DecModelloOutSelUd d")
public class DecModelloOutSelUd implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idModelloOutSelUd;

    private String dlFormatoOut;

    private String tiOut;

    private List<DecModelloCampoOutSelUd> decModelloCampoOutSelUds = new ArrayList<>();

    private DecModelloTipoSerie decModelloTipoSerie;

    public DecModelloOutSelUd() {/* Hibernate */
    }

    @Id
    // "DEC_MODELLO_OUT_SEL_UD_IDMODELLOOUTSELUD_GENERATOR",
    // sequenceName =
    // "SDEC_MODELLO_OUT_SEL_UD",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_MODELLO_OUT_SEL_UD_IDMODELLOOUTSELUD_GENERATOR")
    @Column(name = "ID_MODELLO_OUT_SEL_UD")
    @GenericGenerator(name = "SDEC_MODELLO_OUT_SEL_UD_ID_MODELLO_OUT_SEL_UD_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_MODELLO_OUT_SEL_UD"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_MODELLO_OUT_SEL_UD_ID_MODELLO_OUT_SEL_UD_GENERATOR")
    public Long getIdModelloOutSelUd() {
        return this.idModelloOutSelUd;
    }

    public void setIdModelloOutSelUd(Long idModelloOutSelUd) {
        this.idModelloOutSelUd = idModelloOutSelUd;
    }

    @Column(name = "DL_FORMATO_OUT")
    public String getDlFormatoOut() {
        return this.dlFormatoOut;
    }

    public void setDlFormatoOut(String dlFormatoOut) {
        this.dlFormatoOut = dlFormatoOut;
    }

    @Column(name = "TI_OUT")
    public String getTiOut() {
        return this.tiOut;
    }

    public void setTiOut(String tiOut) {
        this.tiOut = tiOut;
    }

    // bi-directional many-to-one association to DecModelloCampoOutSelUd
    @OneToMany(mappedBy = "decModelloOutSelUd", cascade = CascadeType.PERSIST)
    public List<DecModelloCampoOutSelUd> getDecModelloCampoOutSelUds() {
        return this.decModelloCampoOutSelUds;
    }

    public void setDecModelloCampoOutSelUds(List<DecModelloCampoOutSelUd> decModelloCampoOutSelUds) {
        this.decModelloCampoOutSelUds = decModelloCampoOutSelUds;
    }

    public DecModelloCampoOutSelUd addDecModelloCampoOutSelUd(DecModelloCampoOutSelUd decModelloCampoOutSelUd) {
        getDecModelloCampoOutSelUds().add(decModelloCampoOutSelUd);
        decModelloCampoOutSelUd.setDecModelloOutSelUd(this);
        return decModelloCampoOutSelUd;
    }

    public DecModelloCampoOutSelUd removeDecModelloCampoOutSelUd(DecModelloCampoOutSelUd decModelloCampoOutSelUd) {
        getDecModelloCampoOutSelUds().remove(decModelloCampoOutSelUd);
        decModelloCampoOutSelUd.setDecModelloOutSelUd(null);
        return decModelloCampoOutSelUd;
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
