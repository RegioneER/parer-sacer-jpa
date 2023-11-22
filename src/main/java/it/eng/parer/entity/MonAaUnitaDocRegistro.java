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
 * The persistent class for the MON_AA_UNITA_DOC_REGISTRO database table.
 */
@Entity
@Table(name = "MON_AA_UNITA_DOC_REGISTRO")
public class MonAaUnitaDocRegistro implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idAaUnitaDocRegistro;

    private BigDecimal aaUnitaDocRegistro;

    private DecRegistroUnitaDoc decRegistroUnitaDoc;

    public MonAaUnitaDocRegistro() {/* Hibernate */
    }

    @Id
    // "MON_AA_UNITA_DOC_REGISTRO_IDAAUNITADOCREGISTRO_GENERATOR",
    // sequenceName =
    // "SMON_AA_UNITA_DOC_REGISTRO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "MON_AA_UNITA_DOC_REGISTRO_IDAAUNITADOCREGISTRO_GENERATOR")
    @Column(name = "ID_AA_UNITA_DOC_REGISTRO")
    @GenericGenerator(name = "SMON_AA_UNITA_DOC_REGISTRO_ID_AA_UNITA_DOC_REGISTRO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SMON_AA_UNITA_DOC_REGISTRO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SMON_AA_UNITA_DOC_REGISTRO_ID_AA_UNITA_DOC_REGISTRO_GENERATOR")
    public Long getIdAaUnitaDocRegistro() {
        return this.idAaUnitaDocRegistro;
    }

    public void setIdAaUnitaDocRegistro(Long idAaUnitaDocRegistro) {
        this.idAaUnitaDocRegistro = idAaUnitaDocRegistro;
    }

    @Column(name = "AA_UNITA_DOC_REGISTRO")
    public BigDecimal getAaUnitaDocRegistro() {
        return this.aaUnitaDocRegistro;
    }

    public void setAaUnitaDocRegistro(BigDecimal aaUnitaDocRegistro) {
        this.aaUnitaDocRegistro = aaUnitaDocRegistro;
    }

    // bi-directional many-to-one association to DecRegistroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_REGISTRO_UNITA_DOC")
    public DecRegistroUnitaDoc getDecRegistroUnitaDoc() {
        return this.decRegistroUnitaDoc;
    }

    public void setDecRegistroUnitaDoc(DecRegistroUnitaDoc decRegistroUnitaDoc) {
        this.decRegistroUnitaDoc = decRegistroUnitaDoc;
    }
}
