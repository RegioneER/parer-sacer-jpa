package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

import it.eng.parer.entity.constraint.AroCompUrnCalc.TiUrn;

/**
 * The persistent class for the ARO_COMP_URN_CALC database table.
 * 
 */
@Entity
@Table(name = "ARO_COMP_URN_CALC")
@NamedQuery(name = "AroCompUrnCalc.findAll", query = "SELECT a FROM AroCompUrnCalc a")
public class AroCompUrnCalc implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idCompUrnCalc;
    private String dsUrn;
    private TiUrn tiUrn;
    private AroCompDoc aroCompDoc;

    public AroCompUrnCalc() {
    }

    @Id
    @SequenceGenerator(name = "ARO_COMP_URN_CALC_IDCOMPURNCALC_GENERATOR", sequenceName = "SARO_COMP_URN_CALC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_COMP_URN_CALC_IDCOMPURNCALC_GENERATOR")
    @Column(name = "ID_COMP_URN_CALC")
    public long getIdCompUrnCalc() {
        return this.idCompUrnCalc;
    }

    public void setIdCompUrnCalc(long idCompUrnCalc) {
        this.idCompUrnCalc = idCompUrnCalc;
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
    public TiUrn getTiUrn() {
        return this.tiUrn;
    }

    public void setTiUrn(TiUrn tiUrn) {
        this.tiUrn = tiUrn;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

}
