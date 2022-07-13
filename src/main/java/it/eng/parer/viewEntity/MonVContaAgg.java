package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the MON_V_CONTA_AGG database table.
 * 
 */
@Entity
@Table(name = "MON_V_CONTA_AGG")
@NamedQuery(name = "MonVContaAgg.findAll", query = "SELECT m FROM MonVContaAgg m")
public class MonVContaAgg implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal aaKeyUnitaDoc;
    private Date dtRifConta;
    private BigDecimal idRegistroUnitaDoc;
    private BigDecimal idStrut;
    private BigDecimal idSubStrut;
    private BigDecimal idTipoDocPrincipale;
    private BigDecimal idTipoUnitaDoc;
    private BigDecimal numByte;
    private BigDecimal numComp;
    private BigDecimal numDoc;

    public MonVContaAgg() {
    }

    @Id
    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return this.aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    @Id
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return this.dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    @Id
    @Column(name = "ID_REGISTRO_UNITA_DOC")
    public BigDecimal getIdRegistroUnitaDoc() {
        return this.idRegistroUnitaDoc;
    }

    public void setIdRegistroUnitaDoc(BigDecimal idRegistroUnitaDoc) {
        this.idRegistroUnitaDoc = idRegistroUnitaDoc;
    }

    @Id
    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    @Id
    @Column(name = "ID_SUB_STRUT")
    public BigDecimal getIdSubStrut() {
        return this.idSubStrut;
    }

    public void setIdSubStrut(BigDecimal idSubStrut) {
        this.idSubStrut = idSubStrut;
    }

    @Id
    @Column(name = "ID_TIPO_DOC_PRINCIPALE")
    public BigDecimal getIdTipoDocPrincipale() {
        return this.idTipoDocPrincipale;
    }

    public void setIdTipoDocPrincipale(BigDecimal idTipoDocPrincipale) {
        this.idTipoDocPrincipale = idTipoDocPrincipale;
    }

    @Id
    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return this.idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }

    @Column(name = "NUM_BYTE")
    public BigDecimal getNumByte() {
        return this.numByte;
    }

    public void setNumByte(BigDecimal numByte) {
        this.numByte = numByte;
    }

    @Column(name = "NUM_COMP")
    public BigDecimal getNumComp() {
        return this.numComp;
    }

    public void setNumComp(BigDecimal numComp) {
        this.numComp = numComp;
    }

    @Column(name = "NUM_DOC")
    public BigDecimal getNumDoc() {
        return this.numDoc;
    }

    public void setNumDoc(BigDecimal numDoc) {
        this.numDoc = numDoc;
    }

}