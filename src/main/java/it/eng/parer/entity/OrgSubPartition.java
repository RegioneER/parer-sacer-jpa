package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the ORG_SUB_PARTITION database table.
 *
 */
@Entity
@Table(name = "ORG_SUB_PARTITION")
public class OrgSubPartition implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idSubPartition;
    private String cdSubPartition;
    private OrgPartition orgPartition;
    private List<OrgValSubPartition> orgValSubPartitions;

    public OrgSubPartition() {
    }

    @Id
    @SequenceGenerator(name = "ORG_SUB_PARTITION_IDSUBPARTITION_GENERATOR", sequenceName = "SORG_SUB_PARTITION", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_SUB_PARTITION_IDSUBPARTITION_GENERATOR")
    @Column(name = "ID_SUB_PARTITION")
    public long getIdSubPartition() {
        return this.idSubPartition;
    }

    public void setIdSubPartition(long idSubPartition) {
        this.idSubPartition = idSubPartition;
    }

    @Column(name = "CD_SUB_PARTITION")
    public String getCdSubPartition() {
        return this.cdSubPartition;
    }

    public void setCdSubPartition(String cdSubPartition) {
        this.cdSubPartition = cdSubPartition;
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

    // bi-directional many-to-one association to OrgValSubPartition
    @OneToMany(mappedBy = "orgSubPartition")
    public List<OrgValSubPartition> getOrgValSubPartitions() {
        return this.orgValSubPartitions;
    }

    public void setOrgValSubPartitions(List<OrgValSubPartition> orgValSubPartitions) {
        this.orgValSubPartitions = orgValSubPartitions;
    }

}