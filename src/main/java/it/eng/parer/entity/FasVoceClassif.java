package it.eng.parer.entity;

import java.io.Serializable;

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

/**
 * The persistent class for the FAS_VOCE_CLASSIF database table.
 */
@Entity
@Table(name = "FAS_VOCE_CLASSIF")
@NamedQuery(name = "FasVoceClassif.findAll", query = "SELECT f FROM FasVoceClassif f")
public class FasVoceClassif implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idVoceClassif;

    private String cdVoceClassif;

    private String dsVoceClassif;

    private FasFascicolo fascicolo;

    public FasVoceClassif() {/* Hibernate */
    }

    @Id
    // "FAS_VOCE_CLASSIF_IDVOCECLASSIF_GENERATOR",
    // sequenceName = "SFAS_VOCE_CLASSIF",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_VOCE_CLASSIF_IDVOCECLASSIF_GENERATOR")
    @Column(name = "ID_VOCE_CLASSIF")
    @GenericGenerator(name = "SFAS_VOCE_CLASSIF_ID_VOCE_CLASSIF_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_VOCE_CLASSIF"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_VOCE_CLASSIF_ID_VOCE_CLASSIF_GENERATOR")
    public Long getIdVoceClassif() {
        return this.idVoceClassif;
    }

    public void setIdVoceClassif(Long idVoceClassif) {
        this.idVoceClassif = idVoceClassif;
    }

    @Column(name = "CD_VOCE_CLASSIF")
    public String getCdVoceClassif() {
        return this.cdVoceClassif;
    }

    public void setCdVoceClassif(String cdVoceClassif) {
        this.cdVoceClassif = cdVoceClassif;
    }

    @Column(name = "DS_VOCE_CLASSIF")
    public String getDsVoceClassif() {
        return this.dsVoceClassif;
    }

    public void setDsVoceClassif(String dsVoceClassif) {
        this.dsVoceClassif = dsVoceClassif;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFascicolo() {
        return this.fascicolo;
    }

    public void setFascicolo(FasFascicolo fascicolo) {
        this.fascicolo = fascicolo;
    }

}
