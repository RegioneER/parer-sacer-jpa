package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the FAS_SIP_VER_AIP_FASCICOLO database table.
 *
 */
@Entity
@Table(name = "FAS_SIP_VER_AIP_FASCICOLO")
public class FasSipVerAipFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idSipVerAipFascicolo;
    private FasVerAipFascicolo fasVerAipFascicolo;
    private String nmSip;
    private String tiSip;
    private FasXmlVersFascicolo fasXmlVersFascicoloRich;
    private FasXmlVersFascicolo fasXmlVersFascicoloRisp;

    public FasSipVerAipFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_SIP_VER_AIP_FASCICOLO_IDSIPVERAIPFASCICOLO_GENERATOR", sequenceName = "SFAS_SIP_VER_AIP_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_SIP_VER_AIP_FASCICOLO_IDSIPVERAIPFASCICOLO_GENERATOR")
    @Column(name = "ID_SIP_VER_AIP_FASCICOLO")
    public long getIdSipVerAipFascicolo() {
        return this.idSipVerAipFascicolo;
    }

    public void setIdSipVerAipFascicolo(long idSipVerAipFascicolo) {
        this.idSipVerAipFascicolo = idSipVerAipFascicolo;
    }

    // bi-directional many-to-one association to FasVerAipFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VER_AIP_FASCICOLO")
    public FasVerAipFascicolo getFasVerAipFascicolo() {
        return this.fasVerAipFascicolo;
    }

    public void setFasVerAipFascicolo(FasVerAipFascicolo fasVerAipFascicolo) {
        this.fasVerAipFascicolo = fasVerAipFascicolo;
    }

    @Column(name = "NM_SIP")
    public String getNmSip() {
        return this.nmSip;
    }

    public void setNmSip(String nmSip) {
        this.nmSip = nmSip;
    }

    @Column(name = "TI_SIP")
    public String getTiSip() {
        return this.tiSip;
    }

    public void setTiSip(String tiSip) {
        this.tiSip = tiSip;
    }

    // bi-directional many-to-one association to FasXmlVersFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_XML_VERS_FASCICOLO_RICH")
    public FasXmlVersFascicolo getFasXmlVersFascicoloRich() {
        return this.fasXmlVersFascicoloRich;
    }

    public void setFasXmlVersFascicoloRich(FasXmlVersFascicolo fasXmlVersFascicoloRich) {
        this.fasXmlVersFascicoloRich = fasXmlVersFascicoloRich;
    }

    // bi-directional many-to-one association to FasXmlVersFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_XML_VERS_FASCICOLO_RISP")
    public FasXmlVersFascicolo getFasXmlVersFascicoloRisp() {
        return this.fasXmlVersFascicoloRisp;
    }

    public void setFasXmlVersFascicoloRisp(FasXmlVersFascicolo fasXmlVersFascicoloRisp) {
        this.fasXmlVersFascicoloRisp = fasXmlVersFascicoloRisp;
    }
}
