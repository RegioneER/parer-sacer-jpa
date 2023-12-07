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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ARO_VALORE_ATTRIB_DATI_SPEC database table.
 */
@Entity
@Table(name = "ARO_VALORE_ATTRIB_DATI_SPEC")
public class AroValoreAttribDatiSpec implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idValoreAttribDatiSpec;

    private String dlValore;

    private BigDecimal idStrut;

    private AroUsoXsdDatiSpec aroUsoXsdDatiSpec;

    private DecAttribDatiSpec decAttribDatiSpec;

    public AroValoreAttribDatiSpec() {/* Hibernate */
    }

    @Id
    // "ARO_VALORE_ATTRIB_DATI_SPEC_IDVALOREATTRIBDATISPEC_GENERATOR",
    // sequenceName =
    // "SARO_VALORE_ATTRIB_DATI_SPEC",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ARO_VALORE_ATTRIB_DATI_SPEC_IDVALOREATTRIBDATISPEC_GENERATOR")
    @Column(name = "ID_VALORE_ATTRIB_DATI_SPEC")
    @GenericGenerator(name = "SARO_VALORE_ATTRIB_DATI_SPEC_ID_VALORE_ATTRIB_DATI_SPEC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SARO_VALORE_ATTRIB_DATI_SPEC"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SARO_VALORE_ATTRIB_DATI_SPEC_ID_VALORE_ATTRIB_DATI_SPEC_GENERATOR")
    public Long getIdValoreAttribDatiSpec() {
        return this.idValoreAttribDatiSpec;
    }

    public void setIdValoreAttribDatiSpec(Long idValoreAttribDatiSpec) {
        this.idValoreAttribDatiSpec = idValoreAttribDatiSpec;
    }

    @Column(name = "DL_VALORE")
    public String getDlValore() {
        return this.dlValore;
    }

    public void setDlValore(String dlValore) {
        this.dlValore = dlValore;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to AroUsoXsdDatiSpec
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_USO_XSD_DATI_SPEC")
    public AroUsoXsdDatiSpec getAroUsoXsdDatiSpec() {
        return this.aroUsoXsdDatiSpec;
    }

    public void setAroUsoXsdDatiSpec(AroUsoXsdDatiSpec aroUsoXsdDatiSpec) {
        this.aroUsoXsdDatiSpec = aroUsoXsdDatiSpec;
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

}
