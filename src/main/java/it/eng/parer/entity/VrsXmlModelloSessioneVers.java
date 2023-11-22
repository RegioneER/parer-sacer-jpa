package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the VRS_XML_MODELLO_SESSIONE_VERS database table.
 *
 */
@Entity
@Table(name = "VRS_XML_MODELLO_SESSIONE_VERS")
public class VrsXmlModelloSessioneVers implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long idXmlModelloSessioneVers;
    private String blXml;
    private BigDecimal idStrut;
    private String flCanonicalized;
    private VrsDatiSessioneVers vrsDatiSessioneVers;
    private DecUsoModelloXsdUniDoc decUsoModelloXsdUniDoc;
    private DecUsoModelloXsdDoc decUsoModelloXsdDoc;
    private DecUsoModelloXsdCompDoc decUsoModelloXsdCompDoc;

    public VrsXmlModelloSessioneVers() {
        // hibernate
    }

    @Id
    // @SequenceGenerator(name = "VRS_XML_MODELLO_SESSIONE_VERS_IDXMLMODELLOSESSIONEVERS_GENERATOR", sequenceName =
    // "SVRS_XML_MODELLO_SESSIONE_VERS", allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "VRS_XML_MODELLO_SESSIONE_VERS_IDXMLMODELLOSESSIONEVERS_GENERATOR")
    @GenericGenerator(name = "VRS_XML_MODELLO_SESSIONE_VERS_IDXMLMODELLOSESSIONEVERS_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SVRS_XML_MODELLO_SESSIONE_VERS"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VRS_XML_MODELLO_SESSIONE_VERS_IDXMLMODELLOSESSIONEVERS_GENERATOR")
    @Column(name = "ID_XML_MODELLO_SESSIONE_VERS")
    public Long getIdXmlModelloSessioneVers() {
        return this.idXmlModelloSessioneVers;
    }

    public void setIdXmlModelloSessioneVers(Long idXmlModelloSessioneVers) {
        this.idXmlModelloSessioneVers = idXmlModelloSessioneVers;
    }

    @Lob()
    @Column(name = "BL_XML")
    public String getBlXml() {
        return this.blXml;
    }

    public void setBlXml(String blXml) {
        this.blXml = blXml;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to VrsDatiSessioneVers
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATI_SESSIONE_VERS")
    public VrsDatiSessioneVers getVrsDatiSessioneVers() {
        return this.vrsDatiSessioneVers;
    }

    public void setVrsDatiSessioneVers(VrsDatiSessioneVers vrsDatiSessioneVers) {
        this.vrsDatiSessioneVers = vrsDatiSessioneVers;
    }

    // bi-directional many-to-one association to DecUsoModelloXsdUniDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USO_MODELLO_XSD_UNI_DOC")
    public DecUsoModelloXsdUniDoc getDecUsoModelloXsdUniDoc() {
        return this.decUsoModelloXsdUniDoc;
    }

    public void setDecUsoModelloXsdUniDoc(DecUsoModelloXsdUniDoc decUsoModelloXsdUniDoc) {
        this.decUsoModelloXsdUniDoc = decUsoModelloXsdUniDoc;
    }

    @Column(name = "FL_CANONICALIZED", columnDefinition = "CHARx")
    public String getFlCanonicalized() {
        return this.flCanonicalized;
    }

    public void setFlCanonicalized(String flCanonicalized) {
        this.flCanonicalized = flCanonicalized;
    }

    // bi-directional many-to-one association to DecUsoModelloXsdDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USO_MODELLO_XSD_DOC")
    public DecUsoModelloXsdDoc getDecUsoModelloXsdDoc() {
        return this.decUsoModelloXsdDoc;
    }

    public void setDecUsoModelloXsdDoc(DecUsoModelloXsdDoc decUsoModelloXsdDoc) {
        this.decUsoModelloXsdDoc = decUsoModelloXsdDoc;
    }

    // bi-directional many-to-one association to DecUsoModelloXsdCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USO_MODELLO_XSD_COMP_DOC")
    public DecUsoModelloXsdCompDoc getDecUsoModelloXsdCompDoc() {
        return this.decUsoModelloXsdCompDoc;
    }

    public void setDecUsoModelloXsdCompDoc(DecUsoModelloXsdCompDoc decUsoModelloXsdCompDoc) {
        this.decUsoModelloXsdCompDoc = decUsoModelloXsdCompDoc;
    }

}
