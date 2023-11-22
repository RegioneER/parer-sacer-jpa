package it.eng.parer.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "VRS_XML_DATI_SES_OBJECT_STORAGE_KO")
public class VrsXmlDatiSesObjectStorageKo implements Serializable {
    private static final long serialVersionUID = 1L;

    public VrsXmlDatiSesObjectStorageKo() {
        super();
    }

    private Long idXmlDatiSesObjectStorageKo;
    private DecBackend decBackend;
    private VrsDatiSessioneVersKo datiSessioneVersKo;
    private String nmTenant;
    private String nmBucket;
    private String nmKeyFile;
    private BigDecimal idStrut;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_XML_DATI_SES_OBJECT_STORAGE_KO")
    public Long getIdXmlDatiSesObjectStorageKo() {
        return idXmlDatiSesObjectStorageKo;
    }

    public void setIdXmlDatiSesObjectStorageKo(Long idXmlDatiSesObjectStorageKo) {
        this.idXmlDatiSesObjectStorageKo = idXmlDatiSesObjectStorageKo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DEC_BACKEND")
    public DecBackend getDecBackend() {
        return decBackend;
    }

    public void setDecBackend(DecBackend decBackend) {
        this.decBackend = decBackend;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DATI_SESSIONE_VERS_KO")
    public VrsDatiSessioneVersKo getDatiSessioneVersKo() {
        return datiSessioneVersKo;
    }

    public void setDatiSessioneVersKo(VrsDatiSessioneVersKo datiSessioneVersKo) {
        this.datiSessioneVersKo = datiSessioneVersKo;
    }

    @Column(name = "NM_TENANT")
    public String getNmTenant() {
        return nmTenant;
    }

    public void setNmTenant(String nmTenant) {
        this.nmTenant = nmTenant;
    }

    @Column(name = "NM_BUCKET")
    public String getNmBucket() {
        return nmBucket;
    }

    public void setNmBucket(String nmBucket) {
        this.nmBucket = nmBucket;
    }

    @Column(name = "CD_KEY_FILE")
    public String getNmKeyFile() {
        return nmKeyFile;
    }

    public void setNmKeyFile(String nmKeyFile) {
        this.nmKeyFile = nmKeyFile;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }
}
