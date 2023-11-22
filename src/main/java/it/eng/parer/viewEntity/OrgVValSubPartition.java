/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
    private Long idValSubPartition;

    public OrgVValSubPartition() {/* Hibernate */
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
    public Long getIdValSubPartition() {
        return this.idValSubPartition;
    }

    public void setIdValSubPartition(Long idValSubPartition) {
        this.idValSubPartition = idValSubPartition;
    }

}
