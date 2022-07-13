package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the FAS_SOG_FASCICOLO database table.
 *
 */
@Entity
@Table(name = "FAS_SOG_FASCICOLO")
@NamedQuery(name = "FasSogFascicolo.find", query = "SELECT f FROM FasSogFascicolo f WHERE f.fasFascicolo.idFascicolo = :idFascicolo")
public class FasSogFascicolo implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idSogFascicolo;
    private String cdSog;
    private String dsDenomSog;
    private String nmCognSog;
    private String nmNomeSog;
    private String tiCdSog;
    private String tiRapp;
    private FasFascicolo fasFascicolo;

    public FasSogFascicolo() {
    }

    @Id
    @SequenceGenerator(name = "FAS_SOG_FASCICOLO_IDSOGFASCICOLO_GENERATOR", sequenceName = "SFAS_SOG_FASCICOLO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_SOG_FASCICOLO_IDSOGFASCICOLO_GENERATOR")
    @Column(name = "ID_SOG_FASCICOLO")
    public long getIdSogFascicolo() {
        return this.idSogFascicolo;
    }

    public void setIdSogFascicolo(long idSogFascicolo) {
        this.idSogFascicolo = idSogFascicolo;
    }

    @Column(name = "CD_SOG")
    public String getCdSog() {
        return this.cdSog;
    }

    public void setCdSog(String cdSog) {
        this.cdSog = cdSog;
    }

    @Column(name = "DS_DENOM_SOG")
    public String getDsDenomSog() {
        return this.dsDenomSog;
    }

    public void setDsDenomSog(String dsDenomSog) {
        this.dsDenomSog = dsDenomSog;
    }

    @Column(name = "NM_COGN_SOG")
    public String getNmCognSog() {
        return this.nmCognSog;
    }

    public void setNmCognSog(String nmCognSog) {
        this.nmCognSog = nmCognSog;
    }

    @Column(name = "NM_NOME_SOG")
    public String getNmNomeSog() {
        return this.nmNomeSog;
    }

    public void setNmNomeSog(String nmNomeSog) {
        this.nmNomeSog = nmNomeSog;
    }

    @Column(name = "TI_CD_SOG")
    public String getTiCdSog() {
        return this.tiCdSog;
    }

    public void setTiCdSog(String tiCdSog) {
        this.tiCdSog = tiCdSog;
    }

    @Column(name = "TI_RAPP")
    public String getTiRapp() {
        return this.tiRapp;
    }

    public void setTiRapp(String tiRapp) {
        this.tiRapp = tiRapp;
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