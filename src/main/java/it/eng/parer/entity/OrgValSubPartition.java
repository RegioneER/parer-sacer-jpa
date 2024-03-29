package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ORG_VAL_SUB_PARTITION database table.
 */
@Entity
@Table(name = "ORG_VAL_SUB_PARTITION")
public class OrgValSubPartition implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idValSubPartition;

    private String cdValSubPartition;

    private OrgPartition orgPartition;

    private OrgSubPartition orgSubPartition;

    public OrgValSubPartition() {/* Hibernate */
    }

    @Id
    // "ORG_VAL_SUB_PARTITION_IDVALSUBPARTITION_GENERATOR",
    // sequenceName = "SORG_VAL_SUB_PARTITION",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ORG_VAL_SUB_PARTITION_IDVALSUBPARTITION_GENERATOR")
    @Column(name = "ID_VAL_SUB_PARTITION")
    @GenericGenerator(name = "SORG_VAL_SUB_PARTITION_ID_VAL_SUB_PARTITION_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SORG_VAL_SUB_PARTITION"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SORG_VAL_SUB_PARTITION_ID_VAL_SUB_PARTITION_GENERATOR")
    public Long getIdValSubPartition() {
        return this.idValSubPartition;
    }

    public void setIdValSubPartition(Long idValSubPartition) {
        this.idValSubPartition = idValSubPartition;
    }

    @Column(name = "CD_VAL_SUB_PARTITION")
    public String getCdValSubPartition() {
        return this.cdValSubPartition;
    }

    public void setCdValSubPartition(String cdValSubPartition) {
        this.cdValSubPartition = cdValSubPartition;
    }

    // bi-directional many-to-one association to OrgPartition
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PARTITION")
    public OrgPartition getOrgPartition() {
        return this.orgPartition;
    }

    public void setOrgPartition(OrgPartition orgPartition) {
        this.orgPartition = orgPartition;
    }

    // bi-directional many-to-one association to OrgSubPartition
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SUB_PARTITION")
    public OrgSubPartition getOrgSubPartition() {
        return this.orgSubPartition;
    }

    public void setOrgSubPartition(OrgSubPartition orgSubPartition) {
        this.orgSubPartition = orgSubPartition;
    }

}
