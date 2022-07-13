package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the DEC_CONTROLLO_WS database table.
 * 
 */
@Entity
@Table(name = "DEC_CONTROLLO_WS")
@NamedQueries({ @NamedQuery(name = "DecControlloWs.findAll", query = "SELECT d FROM DecControlloWs d"),
        @NamedQuery(name = "DecControlloWs.findByCdFamigliaControllo", query = "SELECT d FROM DecControlloWs d WHERE d.cdFamigliaControllo = :cdFamigliaControllo"),
        @NamedQuery(name = "DecControlloWs.findByCdControlloWs", query = "SELECT d FROM DecControlloWs d WHERE d.cdControlloWs = :cdControlloWs"),
        @NamedQuery(name = "DecControlloWs.findByCdCategoriaControllo", query = "SELECT d FROM DecControlloWs d WHERE d.cdCategoriaControllo = :cdCategoriaControllo") })
public class DecControlloWs implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idControlloWs;
    private String cdCategoriaControllo;
    private String cdControlloWs;
    private String cdFamigliaControllo;
    private String dsControlloWs;
    private BigDecimal niOrdControllo;

    public DecControlloWs() {
    }

    @Id
    @SequenceGenerator(name = "DEC_CONTROLLO_WS_IDCONTROLLOWS_GENERATOR", sequenceName = "SDEC_CONTROLLO_WS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_CONTROLLO_WS_IDCONTROLLOWS_GENERATOR")
    @Column(name = "ID_CONTROLLO_WS")
    public long getIdControlloWs() {
        return this.idControlloWs;
    }

    public void setIdControlloWs(long idControlloWs) {
        this.idControlloWs = idControlloWs;
    }

    @Column(name = "CD_CATEGORIA_CONTROLLO")
    public String getCdCategoriaControllo() {
        return this.cdCategoriaControllo;
    }

    public void setCdCategoriaControllo(String cdCategoriaControllo) {
        this.cdCategoriaControllo = cdCategoriaControllo;
    }

    @Column(name = "CD_CONTROLLO_WS")
    public String getCdControlloWs() {
        return this.cdControlloWs;
    }

    public void setCdControlloWs(String cdControlloWs) {
        this.cdControlloWs = cdControlloWs;
    }

    @Column(name = "CD_FAMIGLIA_CONTROLLO")
    public String getCdFamigliaControllo() {
        return this.cdFamigliaControllo;
    }

    public void setCdFamigliaControllo(String cdFamigliaControllo) {
        this.cdFamigliaControllo = cdFamigliaControllo;
    }

    @Column(name = "DS_CONTROLLO_WS")
    public String getDsControlloWs() {
        return this.dsControlloWs;
    }

    public void setDsControlloWs(String dsControlloWs) {
        this.dsControlloWs = dsControlloWs;
    }

    @Column(name = "NI_ORD_CONTROLLO")
    public BigDecimal getNiOrdControllo() {
        return this.niOrdControllo;
    }

    public void setNiOrdControllo(BigDecimal niOrdControllo) {
        this.niOrdControllo = niOrdControllo;
    }

}