package it.eng.parer.entity.builder;

import it.eng.parer.entity.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public final class VrsDatiSessioneVersBuilder {
    private String cdKeyAlleg;
    private BigDecimal idStrut;
    private BigDecimal niFile;
    private BigDecimal pgDatiSessioneVers;
    private String tiDatiSessioneVers;
    private Optional<VrsSessioneVers> vrsSessioneVers;
    private Optional<VrsSessioneVersKo> vrsSessioneVersKo;
    private List<VrsErrSessioneVers> vrsErrSessioneVers;
    private List<VrsErrSessioneVersKo> vrsErrSessioneVersKo;
    private List<VrsFileSessioneKo> vrsFileSessioneKo;
    private List<VrsXmlDatiSessioneVersKo> vrsXmlDatiSessioneVersKo;
    private List<VrsXmlDatiSessioneVers> vrsXmlDatiSessioneVers;
    private List<VrsXmlDatiSesObjectStorageKo> xmlDatiSesObjectStorageKos;

    private VrsDatiSessioneVersBuilder() {
    }

    public static VrsDatiSessioneVersBuilder builder() {
        return new VrsDatiSessioneVersBuilder();
    }

    public VrsDatiSessioneVersBuilder cdKeyAlleg(String cdKeyAlleg) {
        this.cdKeyAlleg = cdKeyAlleg;
        return this;
    }

    public VrsDatiSessioneVersBuilder idStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
        return this;
    }

    public VrsDatiSessioneVersBuilder niFile(BigDecimal niFile) {
        this.niFile = niFile;
        return this;
    }

    public VrsDatiSessioneVersBuilder pgDatiSessioneVers(BigDecimal pgDatiSessioneVers) {
        this.pgDatiSessioneVers = pgDatiSessioneVers;
        return this;
    }

    public VrsDatiSessioneVersBuilder tiDatiSessioneVers(String tiDatiSessioneVers) {
        this.tiDatiSessioneVers = tiDatiSessioneVers;
        return this;
    }

    public VrsDatiSessioneVersBuilder vrsSessioneVers(Optional<VrsSessioneVers> vrsSessioneVers) {
        this.vrsSessioneVers = vrsSessioneVers;
        return this;
    }

    public VrsDatiSessioneVersBuilder vrsSessioneVersKo(Optional<VrsSessioneVersKo> vrsSessioneVersKo) {
        this.vrsSessioneVersKo = vrsSessioneVersKo;
        return this;
    }

    public VrsDatiSessioneVersBuilder vrsErrSessioneVers(List<VrsErrSessioneVers> vrsErrSessioneVers) {
        this.vrsErrSessioneVers = vrsErrSessioneVers;
        return this;
    }

    public VrsDatiSessioneVersBuilder vrsErrSessioneVersKo(List<VrsErrSessioneVersKo> vrsErrSessioneVersKo) {
        this.vrsErrSessioneVersKo = vrsErrSessioneVersKo;
        return this;
    }

    public VrsDatiSessioneVersBuilder vrsFileSessioneKo(List<VrsFileSessioneKo> vrsFileSessioneKo) {
        this.vrsFileSessioneKo = vrsFileSessioneKo;
        return this;
    }

    public VrsDatiSessioneVersBuilder vrsXmlDatiSessioneVers(List<VrsXmlDatiSessioneVers> vrsXmlDatiSessioneVers) {
        this.vrsXmlDatiSessioneVers = vrsXmlDatiSessioneVers;
        return this;
    }

    public VrsDatiSessioneVersBuilder vrsXmlDatiSessioneVersKo(
            List<VrsXmlDatiSessioneVersKo> vrsXmlDatiSessioneVersKo) {
        this.vrsXmlDatiSessioneVersKo = vrsXmlDatiSessioneVersKo;
        return this;
    }

    public VrsDatiSessioneVersBuilder xmlDatiSesObjectStorageKos(
            List<VrsXmlDatiSesObjectStorageKo> xmlDatiSesObjectStorageKos) {
        this.xmlDatiSesObjectStorageKos = xmlDatiSesObjectStorageKos;
        return this;
    }

    public VrsDatiSessioneVers buildVrsDatiSessioneVers() {
        VrsDatiSessioneVers vrsDatiSessioneVers = new VrsDatiSessioneVers();
        vrsDatiSessioneVers.setCdKeyAlleg(cdKeyAlleg);
        vrsDatiSessioneVers.setIdStrut(idStrut);
        vrsDatiSessioneVers.setNiFile(niFile);
        vrsDatiSessioneVers.setPgDatiSessioneVers(pgDatiSessioneVers);
        vrsDatiSessioneVers.setTiDatiSessioneVers(tiDatiSessioneVers);
        vrsDatiSessioneVers.setVrsSessioneVers(vrsSessioneVers.get());
        vrsDatiSessioneVers.setVrsErrSessioneVers(vrsErrSessioneVers);
        vrsDatiSessioneVers.setVrsXmlDatiSessioneVers(vrsXmlDatiSessioneVers);
        return vrsDatiSessioneVers;
    }

    public VrsDatiSessioneVersKo buildVrsDatiSessioneVersKo() {
        VrsDatiSessioneVersKo vrsDatiSessioneVers = new VrsDatiSessioneVersKo();
        vrsDatiSessioneVers.setCdKeyAlleg(cdKeyAlleg);
        vrsDatiSessioneVers.setIdStrut(idStrut);
        vrsDatiSessioneVers.setNiFile(niFile);
        vrsDatiSessioneVers.setPgDatiSessioneVers(pgDatiSessioneVers);
        vrsDatiSessioneVers.setTiDatiSessioneVers(tiDatiSessioneVers);
        vrsDatiSessioneVers.setVrsSessioneVersKo(vrsSessioneVersKo.get());
        vrsDatiSessioneVers.setVrsErrSessioneVersKos(vrsErrSessioneVersKo);
        vrsDatiSessioneVers.setVrsFileSessioneKos(vrsFileSessioneKo);
        vrsDatiSessioneVers.setVrsXmlDatiSessioneVersKos(vrsXmlDatiSessioneVersKo);
        vrsDatiSessioneVers.setXmlDatiSesObjectStorageKos(xmlDatiSesObjectStorageKos);
        return vrsDatiSessioneVers;
    }
}
