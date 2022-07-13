package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_MODELLO_CAMPO_INP_UD database table.
 * 
 */
@Entity
@Table(name = "DEC_MODELLO_CAMPO_INP_UD")
@NamedQuery(name = "DecModelloCampoInpUd.findAll", query = "SELECT d FROM DecModelloCampoInpUd d")
public class DecModelloCampoInpUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idModelloCampoInpUd;
    private String nmCampo;
    private BigDecimal pgOrdCampo;
    private String tiCampo;
    private String tiTrasformCampo;
    private DecModelloTipoSerie decModelloTipoSerie;

    public DecModelloCampoInpUd() {
    }

    @Id
    @SequenceGenerator(name = "DEC_MODELLO_CAMPO_INP_UD_IDMODELLOCAMPOINPUD_GENERATOR", sequenceName = "SDEC_MODELLO_CAMPO_INP_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_MODELLO_CAMPO_INP_UD_IDMODELLOCAMPOINPUD_GENERATOR")
    @Column(name = "ID_MODELLO_CAMPO_INP_UD")
    public long getIdModelloCampoInpUd() {
        return this.idModelloCampoInpUd;
    }

    public void setIdModelloCampoInpUd(long idModelloCampoInpUd) {
        this.idModelloCampoInpUd = idModelloCampoInpUd;
    }

    @Column(name = "NM_CAMPO")
    public String getNmCampo() {
        return this.nmCampo;
    }

    public void setNmCampo(String nmCampo) {
        this.nmCampo = nmCampo;
    }

    @Column(name = "PG_ORD_CAMPO")
    public BigDecimal getPgOrdCampo() {
        return this.pgOrdCampo;
    }

    public void setPgOrdCampo(BigDecimal pgOrdCampo) {
        this.pgOrdCampo = pgOrdCampo;
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