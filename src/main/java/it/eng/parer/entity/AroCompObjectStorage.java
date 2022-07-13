package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the ARO_COMP_OBJECT_STORAGE database table.
 *
 */
@Entity
@Table(name = "ARO_COMP_OBJECT_STORAGE")
@NamedQuery(name = "AroCompObjectStorage.findAll", query = "SELECT a FROM AroCompObjectStorage a")
public class AroCompObjectStorage implements Serializable {

    private static final long serialVersionUID = 1L;
    private long idCompObjectStorage;
    private String cdKeyFile;
    private String nmBucket;
    private String nmTenant;
    private AroCompDoc aroCompDoc;

    public AroCompObjectStorage() {
    }

    @Id
    @SequenceGenerator(name = "ARO_COMP_OBJECT_STORAGE_IDCOMPOBJECTSTORAGE_GENERATOR", sequenceName = "SARO_COMP_OBJECT_STORAGE", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_COMP_OBJECT_STORAGE_IDCOMPOBJECTSTORAGE_GENERATOR")
    @Column(name = "ID_COMP_OBJECT_STORAGE")
    public long getIdCompObjectStorage() {
        return this.idCompObjectStorage;
    }

    public void setIdCompObjectStorage(long idCompObjectStorage) {
        this.idCompObjectStorage = idCompObjectStorage;
    }

    @Column(name = "CD_KEY_FILE")
    public String getCdKeyFile() {
        return this.cdKeyFile;
    }

    public void setCdKeyFile(String cdKeyFile) {
        this.cdKeyFile = cdKeyFile;
    }

    @Column(name = "NM_BUCKET")
    public String getNmBucket() {
        return this.nmBucket;
    }

    public void setNmBucket(String nmBucket) {
        this.nmBucket = nmBucket;
    }

    @Column(name = "NM_TENANT")
    public String getNmTenant() {
        return this.nmTenant;
    }

    public void setNmTenant(String nmTenant) {
        this.nmTenant = nmTenant;
    }

    // bi-directional many-to-one association to AroCompDoc
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COMP_DOC")
    public AroCompDoc getAroCompDoc() {
        return this.aroCompDoc;
    }

    public void setAroCompDoc(AroCompDoc aroCompDoc) {
        this.aroCompDoc = aroCompDoc;
    }

}
