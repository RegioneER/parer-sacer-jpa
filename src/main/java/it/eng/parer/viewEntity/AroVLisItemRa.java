package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the ARO_V_LIS_ITEM_RA database table.
 *
 */
@Entity
@Table(name = "ARO_V_LIS_ITEM_RA")
@NamedQuery(name = "AroVLisItemRa.findAll", query = "SELECT a FROM AroVLisItemRa a")
public class AroVLisItemRa implements Serializable {

    private static final long serialVersionUID = 1L;
    private BigDecimal idRichiestaRa;
    private BigDecimal idStrut;
    private BigDecimal anno;
    private BigDecimal totUd;
    private BigDecimal numAip;
    private BigDecimal dimensione;
    private BigDecimal numDocs;
    private BigDecimal numErrori;
    private BigDecimal numEstratti;
    private BigDecimal avanzamento;

    public AroVLisItemRa() {/* Hibernate */
    }

    public AroVLisItemRa(BigDecimal idRichiestaRa, BigDecimal idStrut, BigDecimal anno, BigDecimal totUd,
            BigDecimal numAip, BigDecimal dimensione, BigDecimal numDocs, BigDecimal numErrori, BigDecimal numEstratti,
            BigDecimal avanzamento) {
        this.idRichiestaRa = idRichiestaRa;
        this.idStrut = idStrut;
        this.anno = anno;
        this.totUd = totUd;
        this.numAip = numAip;
        this.dimensione = dimensione;
        this.numDocs = numDocs;
        this.numErrori = numErrori;
        this.numEstratti = numEstratti;
        this.avanzamento = avanzamento;
    }

    @Column(name = "ANNO")
    public BigDecimal getAnno() {
        return this.anno;
    }

    public void setAnno(BigDecimal anno) {
        this.anno = anno;
    }

    @Column(name = "TOT_UD")
    public BigDecimal getTotUd() {
        return this.totUd;
    }

    public void setTotUd(BigDecimal totUd) {
        this.totUd = totUd;
    }

    @Column(name = "NUM_AIP")
    public BigDecimal getNumAip() {
        return this.numAip;
    }

    public void setNumAip(BigDecimal numAip) {
        this.numAip = numAip;
    }

    @Id
    @Column(name = "ID_RICHIESTA_RA")
    public BigDecimal getIdRichiestaRa() {
        return this.idRichiestaRa;
    }

    public void setIdRichiestaRa(BigDecimal idRichiestaRa) {
        this.idRichiestaRa = idRichiestaRa;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Column(name = "NUM_DOCS")
    public BigDecimal getNumDocs() {
        return this.numDocs;
    }

    public void setNumDocs(BigDecimal numDocs) {
        this.numDocs = numDocs;
    }

    @Column(name = "NUM_ERRORI")
    public BigDecimal getNumErrori() {
        return this.numErrori;
    }

    public void setNumErrori(BigDecimal numErrori) {
        this.numErrori = numErrori;
    }

    @Column(name = "NUM_ESTRATTI")
    public BigDecimal getNumEstratti() {
        return this.numEstratti;
    }

    public void setNumEstratti(BigDecimal numEstratti) {
        this.numEstratti = numEstratti;
    }

    @Column(name = "AVANZAMENTO")
    public BigDecimal getAvanzamento() {
        return this.avanzamento;
    }

    public void setAvanzamento(BigDecimal avanzamento) {
        this.avanzamento = avanzamento;
    }

    @Column(name = "DIMENSIONE")
    public BigDecimal getDimensione() {
        return this.dimensione;
    }

    public void setDimensione(BigDecimal dimensione) {
        this.dimensione = dimensione;
    }

}
