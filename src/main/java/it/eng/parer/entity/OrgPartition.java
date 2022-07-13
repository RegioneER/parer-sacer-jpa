package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;

/**
 * The persistent class for the ORG_PARTITION database table.
 *
 */
@Entity
@Table(name = "ORG_PARTITION")
public class OrgPartition implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idPartition;
    private String cdPartition;
    private String tiPartition;
    private List<OrgPartitionStrut> orgPartitionStruts;
    private List<OrgSubPartition> orgSubPartitions;
    private List<OrgValSubPartition> orgValSubPartitions;
    private List<OrgPartitionSubStrut> orgPartitionSubStruts;

    public OrgPartition() {
    }

    @Id
    @SequenceGenerator(name = "ORG_PARTITION_IDPARTITION_GENERATOR", sequenceName = "SORG_PARTITION", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_PARTITION_IDPARTITION_GENERATOR")
    @Column(name = "ID_PARTITION")
    public long getIdPartition() {
        return this.idPartition;
    }

    public void setIdPartition(long idPartition) {
        this.idPartition = idPartition;
    }

    @Column(name = "CD_PARTITION")
    public String getCdPartition() {
        return this.cdPartition;
    }

    public void setCdPartition(String cdPartition) {
        this.cdPartition = cdPartition;
    }

    @Column(name = "TI_PARTITION")
    public String getTiPartition() {
        return this.tiPartition;
    }

    public void setTiPartition(String tiPartition) {
        this.tiPartition = tiPartition;
    }

    // bi-directional many-to-one association to OrgPartitionStrut
    @OneToMany(mappedBy = "orgPartition")
    public List<OrgPartitionStrut> getOrgPartitionStruts() {
        return this.orgPartitionStruts;
    }

    public void setOrgPartitionStruts(List<OrgPartitionStrut> orgPartitionStruts) {
        this.orgPartitionStruts = orgPartitionStruts;
    }

    // bi-directional many-to-one association to OrgSubPartition
    @OneToMany(mappedBy = "orgPartition")
    public List<OrgSubPartition> getOrgSubPartitions() {
        return this.orgSubPartitions;
    }

    public void setOrgSubPartitions(List<OrgSubPartition> orgSubPartitions) {
        this.orgSubPartitions = orgSubPartitions;
    }

    // bi-directional many-to-one association to OrgValSubPartition
    @OneToMany(mappedBy = "orgPartition")
    public List<OrgValSubPartition> getOrgValSubPartitions() {
        return this.orgValSubPartitions;
    }

    public void setOrgValSubPartitions(List<OrgValSubPartition> orgValSubPartitions) {
        this.orgValSubPartitions = orgValSubPartitions;
    }

    // bi-directional many-to-one association to OrgPartitionSubStrut
    @OneToMany(mappedBy = "orgPartition")
    public List<OrgPartitionSubStrut> getOrgPartitionSubStruts() {
        return this.orgPartitionSubStruts;
    }

    public void setOrgPartitionSubStruts(List<OrgPartitionSubStrut> orgPartitionSubStruts) {
        this.orgPartitionSubStruts = orgPartitionSubStruts;
    }
}