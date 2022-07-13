package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_VALORE_ATTRIB_DATI_SPEC database table.
 *
 */
@Entity
@Table(name = "ARO_VALORE_ATTRIB_DATI_SPEC")
public class AroValoreAttribDatiSpec implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idValoreAttribDatiSpec;
    private String dlValore;
    private BigDecimal idStrut;
    private AroUsoXsdDatiSpec aroUsoXsdDatiSpec;
    private DecAttribDatiSpec decAttribDatiSpec;

    public AroValoreAttribDatiSpec() {
    }

    @Id
    @SequenceGenerator(name = "ARO_VALORE_ATTRIB_DATI_SPEC_IDVALOREATTRIBDATISPEC_GENERATOR", sequenceName = "SARO_VALORE_ATTRIB_DATI_SPEC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_VALORE_ATTRIB_DATI_SPEC_IDVALOREATTRIBDATISPEC_GENERATOR")
    @Column(name = "ID_VALORE_ATTRIB_DATI_SPEC")
    public long getIdValoreAttribDatiSpec() {
        return this.idValoreAttribDatiSpec;
    }

    public void setIdValoreAttribDatiSpec(long idValoreAttribDatiSpec) {
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