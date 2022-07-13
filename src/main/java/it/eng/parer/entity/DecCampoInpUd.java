package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_CAMPO_INP_UD database table.
 * 
 */
@Entity
@Table(name = "DEC_CAMPO_INP_UD")
@NamedQuery(name = "DecCampoInpUd.findAll", query = "SELECT d FROM DecCampoInpUd d")
public class DecCampoInpUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idCampoInpUd;
    private String nmCampo;
    private BigDecimal pgOrdCampo;
    private String tiCampo;
    private String tiTrasformCampo;
    private DecAttribDatiSpec decAttribDatiSpec;
    private DecTipoSerie decTipoSerie;

    public DecCampoInpUd() {
    }

    @Id
    @SequenceGenerator(name = "DEC_CAMPO_INP_UD_IDCAMPOINPUD_GENERATOR", sequenceName = "SDEC_CAMPO_INP_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_CAMPO_INP_UD_IDCAMPOINPUD_GENERATOR")
    @Column(name = "ID_CAMPO_INP_UD")
    public long getIdCampoInpUd() {
        return this.idCampoInpUd;
    }

    public void setIdCampoInpUd(long idCampoInpUd) {
        this.idCampoInpUd = idCampoInpUd;
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

    // bi-directional many-to-one association to DecAttribDatiSpec
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ATTRIB_DATI_SPEC")
    public DecAttribDatiSpec getDecAttribDatiSpec() {
        return this.decAttribDatiSpec;
    }

    public void setDecAttribDatiSpec(DecAttribDatiSpec decAttribDatiSpec) {
        this.decAttribDatiSpec = decAttribDatiSpec;
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

}