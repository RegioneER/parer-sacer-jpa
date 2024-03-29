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
 * The persistent class for the FAS_AMMIN_PARTEC database table.
 */
@Entity
@Table(name = "FAS_AMMIN_PARTEC")
@NamedQuery(name = "FasAmminPartec.find", query = "SELECT f FROM FasAmminPartec f WHERE f.fasFascicolo.idFascicolo = :idFascicolo")
public class FasAmminPartec implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idAmminPartec;

    private String cdAmminPartec;

    private String dsAmminPartec;

    private String tiCodiceAmminPartec;

    private FasFascicolo fasFascicolo;

    public FasAmminPartec() {/* Hibernate */
    }

    @Id
    // "FAS_AMMIN_PARTEC_IDAMMINPARTEC_GENERATOR",
    // sequenceName = "SFAS_AMMIN_PARTEC",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_AMMIN_PARTEC_IDAMMINPARTEC_GENERATOR")
    @Column(name = "ID_AMMIN_PARTEC")
    @GenericGenerator(name = "SFAS_AMMIN_PARTEC_ID_AMMIN_PARTEC_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SFAS_AMMIN_PARTEC"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SFAS_AMMIN_PARTEC_ID_AMMIN_PARTEC_GENERATOR")
    public Long getIdAmminPartec() {
        return this.idAmminPartec;
    }

    public void setIdAmminPartec(Long idAmminPartec) {
        this.idAmminPartec = idAmminPartec;
    }

    @Column(name = "CD_AMMIN_PARTEC")
    public String getCdAmminPartec() {
        return this.cdAmminPartec;
    }

    public void setCdAmminPartec(String cdAmminPartec) {
        this.cdAmminPartec = cdAmminPartec;
    }

    @Column(name = "DS_AMMIN_PARTEC")
    public String getDsAmminPartec() {
        return this.dsAmminPartec;
    }

    public void setDsAmminPartec(String dsAmminPartec) {
        this.dsAmminPartec = dsAmminPartec;
    }

    @Column(name = "TI_CODICE_AMMIN_PARTEC")
    public String getTiCodiceAmminPartec() {
        return this.tiCodiceAmminPartec;
    }

    public void setTiCodiceAmminPartec(String tiCodiceAmminPartec) {
        this.tiCodiceAmminPartec = tiCodiceAmminPartec;
    }

    // bi-directional many-to-one association to FasFascicolo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FASCICOLO")
    public FasFascicolo getFasFascicolo() {
        return this.fasFascicolo;
    }

    public void setFasFascicolo(FasFascicolo fasFascicolo) {
        this.fasFascicolo = fasFascicolo;
    }
}
