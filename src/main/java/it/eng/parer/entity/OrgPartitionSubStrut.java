package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ORG_PARTITION_SUB_STRUT database table.
 *
 */
@Entity
@Table(name = "ORG_PARTITION_SUB_STRUT")
@NamedQuery(name = "OrgPartitionSubStrut.findAll", query = "SELECT o FROM OrgPartitionSubStrut o")
public class OrgPartitionSubStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idPartitionSubStrut;
    private String tiPartition;
    private OrgPartition orgPartition;
    private OrgSubStrut orgSubStrut;

    public OrgPartitionSubStrut() {
    }

    @Id
    @SequenceGenerator(name = "ORG_PARTITION_SUB_STRUT_IDPARTITIONSUBSTRUT_GENERATOR", sequenceName = "SORG_PARTITION_SUB_STRUT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_PARTITION_SUB_STRUT_IDPARTITIONSUBSTRUT_GENERATOR")
    @Column(name = "ID_PARTITION_SUB_STRUT")
    public long getIdPartitionSubStrut() {
        return this.idPartitionSubStrut;
    }

    public void setIdPartitionSubStrut(long idPartitionSubStrut) {
        this.idPartitionSubStrut = idPartitionSubStrut;
    }

    @Column(name = "TI_PARTITION")
    public String getTiPartition() {
        return this.tiPartition;
    }

    public void setTiPartition(String tiPartition) {
        this.tiPartition = tiPartition;
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

    // bi-directional many-to-one association to OrgSubStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SUB_STRUT")
    public OrgSubStrut getOrgSubStrut() {
        return this.orgSubStrut;
    }

    public void setOrgSubStrut(OrgSubStrut orgSubStrut) {
        this.orgSubStrut = orgSubStrut;
    }

}