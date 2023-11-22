package it.eng.parer.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.AssociationOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

import it.eng.parer.entity.inheritance.oop.ElvUdDocUpdDaElabElenco;

/**
 * The persistent class for the ELV_UD_VERS_DA_ELAB_ELENCO database table.
 */
@Entity
@Table(name = "ELV_UD_VERS_DA_ELAB_ELENCO")
@NamedQuery(name = "ElvUdVersDaElabElenco.findAll", query = "SELECT e FROM ElvUdVersDaElabElenco e")
@AssociationOverride(name = "udDocUpdObj", joinColumns = @JoinColumn(name = "ID_UNITA_DOC", insertable = false, updatable = false))
public class ElvUdVersDaElabElenco extends ElvUdDocUpdDaElabElenco<AroUnitaDoc> implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idUdVersDaElabElenco;

    private BigDecimal idStrut;

    private String tiStatoUdDaElab;

    private AroUnitaDoc aroUnitaDoc;

    public ElvUdVersDaElabElenco() {/* Hibernate */
    }

    @Id
    // "ELV_UD_VERS_DA_ELAB_ELENCO_IDUDVERSDAELABELENCO_GENERATOR",
    // sequenceName =
    // "SELV_UD_VERS_DA_ELAB_ELENCO",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ELV_UD_VERS_DA_ELAB_ELENCO_IDUDVERSDAELABELENCO_GENERATOR")
    @Column(name = "ID_UD_VERS_DA_ELAB_ELENCO")
    @GenericGenerator(name = "SELV_UD_VERS_DA_ELAB_ELENCO_ID_UD_VERS_DA_ELAB_ELENCO_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SELV_UD_VERS_DA_ELAB_ELENCO"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SELV_UD_VERS_DA_ELAB_ELENCO_ID_UD_VERS_DA_ELAB_ELENCO_GENERATOR")
    public Long getIdUdVersDaElabElenco() {
        return this.idUdVersDaElabElenco;
    }

    public void setIdUdVersDaElabElenco(Long idUdVersDaElabElenco) {
        this.idUdVersDaElabElenco = idUdVersDaElabElenco;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "TI_STATO_UD_DA_ELAB")
    public String getTiStatoUdDaElab() {
        return this.tiStatoUdDaElab;
    }

    public void setTiStatoUdDaElab(String tiStatoUdDaElab) {
        this.tiStatoUdDaElab = tiStatoUdDaElab;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }
}
