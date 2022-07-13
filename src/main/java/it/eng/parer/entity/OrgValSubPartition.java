package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ORG_VAL_SUB_PARTITION database table.
 *
 */
@Entity
@Table(name = "ORG_VAL_SUB_PARTITION")
public class OrgValSubPartition implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idValSubPartition;
    private String cdValSubPartition;
    private OrgPartition orgPartition;
    private OrgSubPartition orgSubPartition;

    public OrgValSubPartition() {
    }

    @Id
    @SequenceGenerator(name = "ORG_VAL_SUB_PARTITION_IDVALSUBPARTITION_GENERATOR", sequenceName = "SORG_VAL_SUB_PARTITION", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_VAL_SUB_PARTITION_IDVALSUBPARTITION_GENERATOR")
    @Column(name = "ID_VAL_SUB_PARTITION")
    public long getIdValSubPartition() {
        return this.idValSubPartition;
    }

    public void setIdValSubPartition(long idValSubPartition) {
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