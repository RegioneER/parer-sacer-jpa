/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.parer.viewEntity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the ORG_V_VAL_SUB_PARTITION database table.
 *
 */
@Entity
@Table(name = "ORG_V_VAL_SUB_PARTITION")
public class OrgVValSubPartition implements Serializable {
    private static final long serialVersionUID = 1L;
    private Date cdValSubPartition;
    private BigDecimal idPartition;
    private BigDecimal idSubPartition;
    private long idValSubPartition;

    public OrgVValSubPartition() {
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CD_VAL_SUB_PARTITION")
    public Date getCdValSubPartition() {
        return this.cdValSubPartition;
    }

    public void setCdValSubPartition(Date cdValSubPartition) {
        this.cdValSubPartition = cdValSubPartition;
    }

    @Column(name = "ID_PARTITION")
    public BigDecimal getIdPartition() {
        return this.idPartition;
    }

    public void setIdPartition(BigDecimal idPartition) {
        this.idPartition = idPartition;
    }

    @Column(name = "ID_SUB_PARTITION")
    public BigDecimal getIdSubPartition() {
        return this.idSubPartition;
    }

    public void setIdSubPartition(BigDecimal idSubPartition) {
        this.idSubPartition = idSubPartition;
    }

    @Id
    @Column(name = "ID_VAL_SUB_PARTITION")
    public long getIdValSubPartition() {
        return this.idValSubPartition;
    }

    public void setIdValSubPartition(long idValSubPartition) {
        this.idValSubPartition = idValSubPartition;
    }

}