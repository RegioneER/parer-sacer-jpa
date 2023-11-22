package it.eng.parer.entity.builder;

import it.eng.parer.entity.*;

import java.math.BigDecimal;

public final class VrsXmlDatiSesObjectStorageBuilder {
    private DecBackend decBackend;
    private VrsDatiSessioneVersKo datiSessioneVersKo;
    private String nmTenant;
    private String nmBucket;
    private String nmKeyFile;
    private BigDecimal idStrut;

    private VrsXmlDatiSesObjectStorageBuilder() {
    }

    public static VrsXmlDatiSesObjectStorageBuilder builder() {
        return new VrsXmlDatiSesObjectStorageBuilder();
    }

    public VrsXmlDatiSesObjectStorageBuilder decBackend(DecBackend decBackend) {
        this.decBackend = decBackend;
        return this;
    }

    public VrsXmlDatiSesObjectStorageBuilder datiSessioneVersKo(VrsDatiSessioneVersKo datiSessioneVersKo) {
        this.datiSessioneVersKo = datiSessioneVersKo;
        return this;
    }

    public VrsXmlDatiSesObjectStorageBuilder nmTenant(String nmTenant) {
        this.nmTenant = nmTenant;
        return this;
    }

    public VrsXmlDatiSesObjectStorageBuilder nmBucket(String nmBucket) {
        this.nmBucket = nmBucket;
        return this;
    }

    public VrsXmlDatiSesObjectStorageBuilder nmKeyFile(String nmKeyFile) {
        this.nmKeyFile = nmKeyFile;
        return this;
    }

    public VrsXmlDatiSesObjectStorageBuilder idStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
        return this;
    }

    public VrsXmlDatiSesObjectStorageKo buildVrsXmlDatiSesObjectStorageKo() {
        VrsXmlDatiSesObjectStorageKo vrsXmlDatiSesObjectStorage = new VrsXmlDatiSesObjectStorageKo();
        vrsXmlDatiSesObjectStorage.setDecBackend(decBackend);
        vrsXmlDatiSesObjectStorage.setDatiSessioneVersKo(datiSessioneVersKo);
        vrsXmlDatiSesObjectStorage.setNmTenant(nmTenant);
        vrsXmlDatiSesObjectStorage.setNmBucket(nmBucket);
        vrsXmlDatiSesObjectStorage.setNmKeyFile(nmKeyFile);
        vrsXmlDatiSesObjectStorage.setIdStrut(idStrut);
        return vrsXmlDatiSesObjectStorage;
    }
}
