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
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.id.enhanced.SequenceStyleGenerator;

/**
 * The persistent class for the ORG_PARTITION_SUB_STRUT database table.
 */
@Entity
@Table(name = "ORG_PARTITION_SUB_STRUT")
@NamedQuery(name = "OrgPartitionSubStrut.findAll", query = "SELECT o FROM OrgPartitionSubStrut o")
public class OrgPartitionSubStrut implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idPartitionSubStrut;

    private String tiPartition;

    private OrgPartition orgPartition;

    private OrgSubStrut orgSubStrut;

    public OrgPartitionSubStrut() {/* Hibernate */
    }

    @Id
    // "ORG_PARTITION_SUB_STRUT_IDPARTITIONSUBSTRUT_GENERATOR",
    // sequenceName =
    // "SORG_PARTITION_SUB_STRUT",
    // allocationSize = 1)
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
    // "ORG_PARTITION_SUB_STRUT_IDPARTITIONSUBSTRUT_GENERATOR")
    @Column(name = "ID_PARTITION_SUB_STRUT")
    @GenericGenerator(name = "SORG_PARTITION_SUB_STRUT_ID_PARTITION_SUB_STRUT_GENERATOR", strategy = "it.eng.sequences.hibernate.NonMonotonicSequenceGenerator", parameters = {
            @Parameter(name = SequenceStyleGenerator.SEQUENCE_PARAM, value = "SORG_PARTITION_SUB_STRUT"),
            @Parameter(name = SequenceStyleGenerator.INCREMENT_PARAM, value = "1") })
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SORG_PARTITION_SUB_STRUT_ID_PARTITION_SUB_STRUT_GENERATOR")
    public Long getIdPartitionSubStrut() {
        return this.idPartitionSubStrut;
    }

    public void setIdPartitionSubStrut(Long idPartitionSubStrut) {
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
