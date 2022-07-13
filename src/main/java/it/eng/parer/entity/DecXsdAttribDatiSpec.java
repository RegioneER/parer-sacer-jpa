package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlID;
import org.eclipse.persistence.oxm.annotations.XmlInverseReference;

/**
 * The persistent class for the DEC_XSD_ATTRIB_DATI_SPEC database table.
 * 
 */
@Entity
@Cacheable(true)
@Table(name = "DEC_XSD_ATTRIB_DATI_SPEC")
public class DecXsdAttribDatiSpec implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idXsdAttribDatiSpec;
    private BigDecimal niOrdAttrib;
    private DecAttribDatiSpec decAttribDatiSpec;
    private DecXsdDatiSpec decXsdDatiSpec;

    public DecXsdAttribDatiSpec() {
    }

    @Id
    @SequenceGenerator(name = "DEC_XSD_ATTRIB_DATI_SPEC_IDXSDATTRIBDATISPEC_GENERATOR", sequenceName = "SDEC_XSD_ATTRIB_DATI_SPEC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_XSD_ATTRIB_DATI_SPEC_IDXSDATTRIBDATISPEC_GENERATOR")
    @Column(name = "ID_XSD_ATTRIB_DATI_SPEC")
    @XmlID
    public long getIdXsdAttribDatiSpec() {
        return this.idXsdAttribDatiSpec;
    }

    public void setIdXsdAttribDatiSpec(long idXsdAttribDatiSpec) {
        this.idXsdAttribDatiSpec = idXsdAttribDatiSpec;
    }

    @Column(name = "NI_ORD_ATTRIB")
    public BigDecimal getNiOrdAttrib() {
        return this.niOrdAttrib;
    }

    public void setNiOrdAttrib(BigDecimal niOrdAttrib) {
        this.niOrdAttrib = niOrdAttrib;
    }

    // bi-directional many-to-one association to DecAttribDatiSpec
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ATTRIB_DATI_SPEC")
    @XmlInverseReference(mappedBy = "decXsdAttribDatiSpecs")
    public DecAttribDatiSpec getDecAttribDatiSpec() {
        return this.decAttribDatiSpec;
    }

    public void setDecAttribDatiSpec(DecAttribDatiSpec decAttribDatiSpec) {
        this.decAttribDatiSpec = decAttribDatiSpec;
    }

    // bi-directional many-to-one association to DecXsdDatiSpec
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_XSD_DATI_SPEC")
    @XmlInverseReference(mappedBy = "decXsdAttribDatiSpecs")
    public DecXsdDatiSpec getDecXsdDatiSpec() {
        return this.decXsdDatiSpec;
    }

    public void setDecXsdDatiSpec(DecXsdDatiSpec decXsdDatiSpec) {
        this.decXsdDatiSpec = decXsdDatiSpec;
    }

}