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
 * The persistent class for the FAS_IND_RIF_SOG database table.
 */
@Entity
@Table(name = "FAS_IND_RIF_SOG")
@NamedQuery(name = "FasIndRifSog.findAll", query = "SELECT e FROM FasIndRifSog e")
public class FasIndRifSog implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idIndRifSog;

    private String dsIndDifRif;

    private FasSogFascicolo fasSogFascicolo;

    public FasIndRifSog() {/* Hibernate */
    }

    @Id
    @Column(name = "ID_IND_RIF_SOG")
    @GenericGenerator(name = "SFAS_IND_RIF_SOG_ID_IND_RIF_SOG_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_IND_RIF_SOG"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_IND_RIF_SOG_ID_IND_RIF_SOG_GENERATOR")
    public Long getIdIndRifSog() {
        return this.idIndRifSog;
    }

    public void setIdIndRifSog(Long idIndRifSog) {
        this.idIndRifSog = idIndRifSog;
    }

    @Column(name = "DS_IND_DIF_RIF")
    public String getDsIndDifRif() {
        return this.dsIndDifRif;
    }

    public void setDsIndDifRif(String dsIndRifSog) {
        this.dsIndDifRif = dsIndRifSog;
    }

    // bi-directional many-to-one association to FasSogFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SOG_FASCICOLO")
    public FasSogFascicolo getFasSogFascicolo() {
        return this.fasSogFascicolo;
    }

    public void setFasSogFascicolo(FasSogFascicolo fasSogFascicolo) {
        this.fasSogFascicolo = fasSogFascicolo;
    }
}
