package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the DEC_CAMPO_OUT_SEL_UD database table.
 * 
 */
@Entity
@Table(name = "DEC_CAMPO_OUT_SEL_UD")
@NamedQuery(name = "DecCampoOutSelUd.findAll", query = "SELECT d FROM DecCampoOutSelUd d")
public class DecCampoOutSelUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idCampoOutSelUd;
    private String nmCampo;
    private String tiCampo;
    private String tiTrasformCampo;
    private DecAttribDatiSpec decAttribDatiSpec;
    private DecOutSelUd decOutSelUd;

    public DecCampoOutSelUd() {
    }

    @Id
    @SequenceGenerator(name = "DEC_CAMPO_OUT_SEL_UD_IDCAMPOOUTSELUD_GENERATOR", sequenceName = "SDEC_CAMPO_OUT_SEL_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_CAMPO_OUT_SEL_UD_IDCAMPOOUTSELUD_GENERATOR")
    @Column(name = "ID_CAMPO_OUT_SEL_UD")
    public long getIdCampoOutSelUd() {
        return this.idCampoOutSelUd;
    }

    public void setIdCampoOutSelUd(long idCampoOutSelUd) {
        this.idCampoOutSelUd = idCampoOutSelUd;
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

    // bi-directional many-to-one association to DecAttribDatiSpec
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ATTRIB_DATI_SPEC")
    public DecAttribDatiSpec getDecAttribDatiSpec() {
        return this.decAttribDatiSpec;
    }

    public void setDecAttribDatiSpec(DecAttribDatiSpec decAttribDatiSpec) {
        this.decAttribDatiSpec = decAttribDatiSpec;
    }

    // bi-directional many-to-one association to DecOutSelUd
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_OUT_SEL_UD")
    public DecOutSelUd getDecOutSelUd() {
        return this.decOutSelUd;
    }

    public void setDecOutSelUd(DecOutSelUd decOutSelUd) {
        this.decOutSelUd = decOutSelUd;
    }

}