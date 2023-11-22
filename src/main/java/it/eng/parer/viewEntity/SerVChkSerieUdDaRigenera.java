package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the SER_V_CHK_SERIE_UD_DA_RIGENERA database table.
 * 
 */
@Entity
@Table(name = "SER_V_CHK_SERIE_UD_DA_RIGENERA")
@NamedQuery(name = "SerVChkSerieUdDaRigenera.findAll", query = "SELECT s FROM SerVChkSerieUdDaRigenera s")
public class SerVChkSerieUdDaRigenera implements Serializable {
    private static final long serialVersionUID = 1L;
    private String flConsistDaRidef;
    private String flVerSerieDaRigenera;
    private BigDecimal idVerSerie;

    public SerVChkSerieUdDaRigenera() {/* Hibernate */
    }

    @Column(name = "FL_CONSIST_DA_RIDEF", columnDefinition = "char(1)")
    public String getFlConsistDaRidef() {
        return this.flConsistDaRidef;
    }

    public void setFlConsistDaRidef(String flConsistDaRidef) {
        this.flConsistDaRidef = flConsistDaRidef;
    }

    @Column(name = "FL_VER_SERIE_DA_RIGENERA", columnDefinition = "char(1)")
    public String getFlVerSerieDaRigenera() {
        return this.flVerSerieDaRigenera;
    }

    public void setFlVerSerieDaRigenera(String flVerSerieDaRigenera) {
        this.flVerSerieDaRigenera = flVerSerieDaRigenera;
    }

    @Id
    @Column(name = "ID_VER_SERIE")
    public BigDecimal getIdVerSerie() {
        return this.idVerSerie;
    }

    public void setIdVerSerie(BigDecimal idVerSerie) {
        this.idVerSerie = idVerSerie;
    }

}
