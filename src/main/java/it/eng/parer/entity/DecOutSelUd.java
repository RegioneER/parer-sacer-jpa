package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the DEC_OUT_SEL_UD database table.
 * 
 */
@Entity
@Table(name = "DEC_OUT_SEL_UD")
@NamedQuery(name = "DecOutSelUd.findAll", query = "SELECT d FROM DecOutSelUd d")
public class DecOutSelUd implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idOutSelUd;
    private String dlFormatoOut;
    private String tiOut;
    private List<DecCampoOutSelUd> decCampoOutSelUds;
    private DecTipoSerieUd decTipoSerieUd;

    public DecOutSelUd() {
    }

    @Id
    @SequenceGenerator(name = "DEC_OUT_SEL_UD_IDOUTSELUD_GENERATOR", sequenceName = "SDEC_OUT_SEL_UD", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_OUT_SEL_UD_IDOUTSELUD_GENERATOR")
    @Column(name = "ID_OUT_SEL_UD")
    public long getIdOutSelUd() {
        return this.idOutSelUd;
    }

    public void setIdOutSelUd(long idOutSelUd) {
        this.idOutSelUd = idOutSelUd;
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

    // bi-directional many-to-one association to DecCampoOutSelUd
    @OneToMany(mappedBy = "decOutSelUd", cascade = CascadeType.PERSIST)
    public List<DecCampoOutSelUd> getDecCampoOutSelUds() {
        return this.decCampoOutSelUds;
    }

    public void setDecCampoOutSelUds(List<DecCampoOutSelUd> decCampoOutSelUds) {
        this.decCampoOutSelUds = decCampoOutSelUds;
    }

    public DecCampoOutSelUd addDecCampoOutSelUd(DecCampoOutSelUd decCampoOutSelUd) {
        getDecCampoOutSelUds().add(decCampoOutSelUd);
        decCampoOutSelUd.setDecOutSelUd(this);

        return decCampoOutSelUd;
    }

    public DecCampoOutSelUd removeDecCampoOutSelUd(DecCampoOutSelUd decCampoOutSelUd) {
        getDecCampoOutSelUds().remove(decCampoOutSelUd);
        decCampoOutSelUd.setDecOutSelUd(null);

        return decCampoOutSelUd;
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

}