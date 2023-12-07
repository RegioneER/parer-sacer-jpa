package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_V_CHK_AIP_REST_ARCH_UD database table.
 *
 */
@Entity
@Table(name = "ARO_V_CHK_AIP_REST_ARCH_UD")
@NamedQuery(name = "AroVChkAipRestArchUd.findAll", query = "SELECT e FROM AroVChkAipRestArchUd e")
public class AroVChkAipRestArchUd implements Serializable {

    private static final long serialVersionUID = 1L;
    private String flEstratto;
    private String flErrore;
    private String flDaElaborare;
    private String flAllDaElab;
    private BigDecimal idRichiestaRa;

    public AroVChkAipRestArchUd() {/* Hibernate */
    }

    @Column(name = "FL_ESTRATTO", columnDefinition = "number")
    public String getFlEstratto() {
        return this.flEstratto;
    }

    public void setFlEstratto(String flEstratto) {
        this.flEstratto = flEstratto;
    }

    @Column(name = "FL_ERRORE", columnDefinition = "number")
    public String getFlErrore() {
        return this.flErrore;
    }

    public void setFlErrore(String flErrore) {
        this.flErrore = flErrore;
    }

    @Column(name = "FL_DA_ELABORARE", columnDefinition = "number")
    public String getFlDaElaborare() {
        return flDaElaborare;
    }

    public void setFlDaElaborare(String flDaElaborare) {
        this.flDaElaborare = flDaElaborare;
    }

    @Column(name = "FL_ALL_DA_ELAB", columnDefinition = "number")
    public String getFlAllDaElab() {
        return flAllDaElab;
    }

    public void setFlAllDaElab(String flAllDaElab) {
        this.flAllDaElab = flAllDaElab;
    }

    @Id
    @Column(name = "ID_RICHIESTA_RA")
    public BigDecimal getIdRichiestaRa() {
        return this.idRichiestaRa;
    }

    public void setIdRichiestaRa(BigDecimal idRichiestaRa) {
        this.idRichiestaRa = idRichiestaRa;
    }

}
