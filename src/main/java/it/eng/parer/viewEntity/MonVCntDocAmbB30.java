package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the MON_V_CNT_DOC_AMB_B30 database table.
 * 
 */
@Entity
@Table(name = "MON_V_CNT_DOC_AMB_B30")
@NamedQuery(name = "MonVCntDocAmbB30.findAll", query = "SELECT m FROM MonVCntDocAmbB30 m")
public class MonVCntDocAmbB30 implements Serializable {
    private static final long serialVersionUID = 1L;
    private BigDecimal idAmbiente;
    private BigDecimal idUserIam;
    private BigDecimal niDoc;
    private String tiStatoDoc;

    public MonVCntDocAmbB30() {
    }

    @Id
    @Column(name = "ID_AMBIENTE")
    public BigDecimal getIdAmbiente() {
        return this.idAmbiente;
    }

    public void setIdAmbiente(BigDecimal idAmbiente) {
        this.idAmbiente = idAmbiente;
    }

    @Id
    @Column(name = "ID_USER_IAM")
    public BigDecimal getIdUserIam() {
        return this.idUserIam;
    }

    public void setIdUserIam(BigDecimal idUserIam) {
        this.idUserIam = idUserIam;
    }

    @Column(name = "NI_DOC")
    public BigDecimal getNiDoc() {
        return this.niDoc;
    }

    public void setNiDoc(BigDecimal niDoc) {
        this.niDoc = niDoc;
    }

    @Id
    @Column(name = "TI_STATO_DOC")
    public String getTiStatoDoc() {
        return this.tiStatoDoc;
    }

    public void setTiStatoDoc(String tiStatoDoc) {
        this.tiStatoDoc = tiStatoDoc;
    }

}