package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import it.eng.parer.entity.constraint.FasCodIdeSog.TiCodSog;

/**
 * The persistent class for the FAS_COD_IDE_SOG database table.
 *
 */
@Entity
@Table(name = "FAS_COD_IDE_SOG")
@NamedQuery(name = "FasCodIdeSog.findAll", query = "SELECT e FROM FasCodIdeSog e")
@NamedQuery(name = "FasCodIdeSog.find", query = "SELECT f FROM FasCodIdeSog f WHERE f.fasSogFascicolo.idSogFascicolo = :idSogFascicolo")
public class FasCodIdeSog implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long idCodIdeSog;
    private TiCodSog tiCodSog;
    private String cdSog;
    private String nmCodSog;

    private FasSogFascicolo fasSogFascicolo;

    public FasCodIdeSog() {/* Hibernate */
    }

    @Id
    @SequenceGenerator(name = "FAS_COD_IDE_SOG_IDINDRIFSOG_GENERATOR", sequenceName = "SFAS_COD_IDE_SOG", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_COD_IDE_SOG_IDINDRIFSOG_GENERATOR")
    @Column(name = "ID_COD_IDE_SOG")
    public Long getIdCodIdeSog() {
        return this.idCodIdeSog;
    }

    public void setIdCodIdeSog(Long idCodIdeSog) {
        this.idCodIdeSog = idCodIdeSog;
    }

    @Column(name = "CD_SOG")
    public String getCdSog() {
        return this.cdSog;
    }

    public void setCdSog(String cdSog) {
        this.cdSog = cdSog;
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

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_COD_SOG")
    public TiCodSog getTiCodSog() {
        return this.tiCodSog;
    }

    public void setTiCodSog(TiCodSog tiCodSog) {
        this.tiCodSog = tiCodSog;
    }

    @Column(name = "NM_COD_SOG")
    public String getNmCodSog() {
        return this.nmCodSog;
    }

    public void setNmCodSog(String nmCodSog) {
        this.nmCodSog = nmCodSog;
    }

}
