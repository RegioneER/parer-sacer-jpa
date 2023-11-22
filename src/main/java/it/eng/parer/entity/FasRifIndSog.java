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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the FAS_IND_RIF_SOG database table.
 *
 */
@Entity
@Table(name = "FAS_IND_RIF_SOG")
@NamedQuery(name = "FasRifIndSog.find", query = "SELECT f FROM FasRifIndSog f WHERE f.fasSogFascicolo.idSogFascicolo = :idSogFascicolo")
public class FasRifIndSog implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idIndRifSog;
    private String dsIndDifRif;

    private FasSogFascicolo fasSogFascicolo;

    public FasRifIndSog() {
    }

    @Id
    @SequenceGenerator(name = "FAS_IND_RIF_SOG_IDINDRIFSOG_GENERATOR", sequenceName = "SFAS_IND_RIF_SOG", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_IND_RIF_SOG_IDINDRIFSOG_GENERATOR")
    @Column(name = "ID_IND_RIF_SOG")
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

    public void setDsIndDifRif(String dsIndDifRif) {
        this.dsIndDifRif = dsIndDifRif;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SOG_FASCICOLO")
    public FasSogFascicolo getFasSogFascicolo() {
        return this.fasSogFascicolo;
    }

    public void setFasSogFascicolo(FasSogFascicolo fasSogFascicolo) {
        this.fasSogFascicolo = fasSogFascicolo;
    }

}