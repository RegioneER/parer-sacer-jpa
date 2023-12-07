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
 * The persistent class for the DEC_MODELLO_CAMPO_OUT_SEL_UD database table.
 */
@Entity
@Table(name = "DEC_MODELLO_CAMPO_OUT_SEL_UD")
@NamedQuery(name = "DecModelloCampoOutSelUd.findAll", query = "SELECT d FROM DecModelloCampoOutSelUd d")
public class DecModelloCampoOutSelUd implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idModelloCampoOutSelUd;

    private String nmCampo;

    private String tiCampo;

    private String tiTrasformCampo;

    private DecModelloOutSelUd decModelloOutSelUd;

    public DecModelloCampoOutSelUd() {/* Hibernate */
    }

    @Id
    // "DEC_MODELLO_CAMPO_OUT_SEL_UD_IDMODELLOCAMPOOUTSELUD_GENERATOR",
    // sequenceName =
    // "SDEC_MODELLO_CAMPO_OUT_SEL_UD",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "DEC_MODELLO_CAMPO_OUT_SEL_UD_IDMODELLOCAMPOOUTSELUD_GENERATOR")
    @Column(name = "ID_MODELLO_CAMPO_OUT_SEL_UD")
    @GenericGenerator(name = "SDEC_MODELLO_CAMPO_OUT_SEL_UD_ID_MODELLO_CAMPO_OUT_SEL_UD_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SDEC_MODELLO_CAMPO_OUT_SEL_UD"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SDEC_MODELLO_CAMPO_OUT_SEL_UD_ID_MODELLO_CAMPO_OUT_SEL_UD_GENERATOR")
    public Long getIdModelloCampoOutSelUd() {
        return this.idModelloCampoOutSelUd;
    }

    public void setIdModelloCampoOutSelUd(Long idModelloCampoOutSelUd) {
        this.idModelloCampoOutSelUd = idModelloCampoOutSelUd;
    }

    @Column(name = "NM_CAMPO")
    public String getNmCampo() {
        return this.nmCampo;
    }

    public void setNmCampo(String nmCampo) {
        this.nmCampo = nmCampo;
    }

    @Column(name = "TI_CAMPO")
    public String getTiCampo() {
        return this.tiCampo;
    }

    public void setTiCampo(String tiCampo) {
        this.tiCampo = tiCampo;
    }

    @Column(name = "TI_TRASFORM_CAMPO")
    public String getTiTrasformCampo() {
        return this.tiTrasformCampo;
    }

    public void setTiTrasformCampo(String tiTrasformCampo) {
        this.tiTrasformCampo = tiTrasformCampo;
    }

    // bi-directional many-to-one association to DecModelloOutSelUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MODELLO_OUT_SEL_UD")
    public DecModelloOutSelUd getDecModelloOutSelUd() {
        return this.decModelloOutSelUd;
    }

    public void setDecModelloOutSelUd(DecModelloOutSelUd decModelloOutSelUd) {
        this.decModelloOutSelUd = decModelloOutSelUd;
    }

}
