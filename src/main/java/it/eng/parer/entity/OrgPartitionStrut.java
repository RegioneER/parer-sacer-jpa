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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the ORG_PARTITION_STRUT database table.
 *
 */
@Entity
@Table(name = "ORG_PARTITION_STRUT")
public class OrgPartitionStrut implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idPartitionStrut;
    private String tiPartition;
    private OrgPartition orgPartition;
    private OrgStrut orgStrut;

    public OrgPartitionStrut() {
    }

    @Id
    @SequenceGenerator(name = "ORG_PARTITION_STRUT_IDPARTITIONSTRUT_GENERATOR", sequenceName = "SORG_PARTITION_STRUT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_PARTITION_STRUT_IDPARTITIONSTRUT_GENERATOR")
    @Column(name = "ID_PARTITION_STRUT")
    public long getIdPartitionStrut() {
        return this.idPartitionStrut;
    }

    public void setIdPartitionStrut(long idPartitionStrut) {
        this.idPartitionStrut = idPartitionStrut;
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

    // bi-directional many-to-one association to OrgStrut
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRUT")
    public OrgStrut getOrgStrut() {
        return this.orgStrut;
    }

    public void setOrgStrut(OrgStrut orgStrut) {
        this.orgStrut = orgStrut;
    }

}