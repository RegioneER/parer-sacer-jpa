package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the FAS_VOCE_CLASSIF database table.
 * 
 */
@Entity
@Table(name = "FAS_VOCE_CLASSIF")
@NamedQuery(name = "FasVoceClassif.findAll", query = "SELECT f FROM FasVoceClassif f")
public class FasVoceClassif implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idVoceClassif;
    private String cdVoceClassif;
    private String dsVoceClassif;
    private FasFascicolo fascicolo;

    public FasVoceClassif() {
    }

    @Id
    @SequenceGenerator(name = "FAS_VOCE_CLASSIF_IDVOCECLASSIF_GENERATOR", sequenceName = "SFAS_VOCE_CLASSIF", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_VOCE_CLASSIF_IDVOCECLASSIF_GENERATOR")
    @Column(name = "ID_VOCE_CLASSIF")
    public long getIdVoceClassif() {
        return this.idVoceClassif;
    }

    public void setIdVoceClassif(long idVoceClassif) {
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