package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import it.eng.parer.entity.constraint.VrsUrnXmlSessioneVers.TiUrnXmlSessioneVers;

/**
 * The persistent class for the VRS_URN_XML_SESSIONE_VERS database table.
 * 
 */
@Entity
@Table(name = "VRS_URN_XML_SESSIONE_VERS")
@NamedQuery(name = "VrsUrnXmlSessioneVers.findAll", query = "SELECT v FROM VrsUrnXmlSessioneVers v")
public class VrsUrnXmlSessioneVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idUrnXmlSessionVers;
    private String dsUrn;
    private TiUrnXmlSessioneVers tiUrn;
    private VrsXmlDatiSessioneVers vrsXmlDatiSessioneVers;

    public VrsUrnXmlSessioneVers() {
    }

    @Id
    @SequenceGenerator(name = "VRS_URN_XML_SESSIONE_VERS_IDURNXMLSESSIONEVERS_GENERATOR", sequenceName = "SVRS_URN_XML_SESSIONE_VERS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_URN_XML_SESSIONE_VERS_IDURNXMLSESSIONEVERS_GENERATOR")
    @Column(name = "ID_URN_XML_SESSIONE_VERS")
    public long getIdUrnXmlSessionVers() {
        return this.idUrnXmlSessionVers;
    }

    public void setIdUrnXmlSessionVers(long idUrnXmlSessionVers) {
        this.idUrnXmlSessionVers = idUrnXmlSessionVers;
    }

    @Column(name = "DS_URN")
    public String getDsUrn() {
        return this.dsUrn;
    }

    public void setDsUrn(String dsUrn) {
        this.dsUrn = dsUrn;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_URN")
    public TiUrnXmlSessioneVers getTiUrn() {
        return this.tiUrn;
    }

    public void setTiUrn(TiUrnXmlSessioneVers tiUrnXmlSessioneVers) {
        this.tiUrn = tiUrnXmlSessioneVers;
    }

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_XML_DATI_SESSIONE_VERS")
    public VrsXmlDatiSessioneVers getVrsXmlDatiSessioneVers() {
        return this.vrsXmlDatiSessioneVers;
    }

    public void setVrsXmlDatiSessioneVers(VrsXmlDatiSessioneVers vrsXmlDatiSessioneVers) {
        this.vrsXmlDatiSessioneVers = vrsXmlDatiSessioneVers;
    }

}