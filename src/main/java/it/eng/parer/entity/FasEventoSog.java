package it.eng.parer.entity;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the FAS_EVENTO_SOG database table.
 * 
 */
@Entity
@Table(name = "FAS_EVENTO_SOG")
@NamedQuery(name = "FasEventoSog.findAll", query = "SELECT f FROM FasEventoSog f")
public class FasEventoSog implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idEventoSog;
    private String dsDenomEvento;
    private Date tsApertura;
    private Date tsChiusura;

    private FasSogFascicolo fasSogFascicolo;

    public FasEventoSog() {
    }

    @Id
    @SequenceGenerator(name = "FAS_EVENTO_FASCICOLO_IDEVENTOSOG_GENERATOR", sequenceName = "SFAS_EVENTO_SOG", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FAS_EVENTO_FASCICOLO_IDEVENTOSOG_GENERATOR")
    @Column(name = "ID_EVENTO_SOG")
    public long getIdEventoSog() {
        return this.idEventoSog;
    }

    public void setIdEventoSog(long idEventoFascicolo) {
        this.idEventoSog = idEventoFascicolo;
    }

    @Column(name = "DS_DENOM_EVENTO")
    public String getDsDenomEvento() {
        return this.dsDenomEvento;
    }

    public void setDsDenomEvento(String dsDenomEvento) {
        this.dsDenomEvento = dsDenomEvento;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_APERTURA")
    public Date getTsApertura() {
        return this.tsApertura;
    }

    public void setTsApertura(Date tsApertura) {
        this.tsApertura = tsApertura;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TS_CHIUSURA")
    public Date getTsChiusura() {
        return this.tsChiusura;
    }

    public void setTsChiusura(Date tsChiusura) {
        this.tsChiusura = tsChiusura;
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