package it.eng.parer.entity.builder;

import it.eng.parer.entity.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public final class VrsXmlDatiSessioneVersBuilder {
    private String blXml;
    private String cdEncodingHashXmlVers;
    private String cdVersioneXml;
    private String dsAlgoHashXmlVers;
    private String dsHashXmlVers;
    private String dsUrnXmlVers;
    private BigDecimal idStrut;
    private String tiXmlDati;
    private String flCanonicalized;
    private Optional<VrsDatiSessioneVers> vrsDatiSessioneVers;
    private Optional<VrsDatiSessioneVersKo> vrsDatiSessioneVersKo;
    private List<VrsUrnXmlSessioneVers> vrsUrnXmlSessioneVers;
    private List<VrsUrnXmlSessioneVersKo> vrsUrnXmlSessioneVersKo;

    private VrsXmlDatiSessioneVersBuilder() {
    }

    public static VrsXmlDatiSessioneVersBuilder builder() {
        return new VrsXmlDatiSessioneVersBuilder();
    }

    public VrsXmlDatiSessioneVersBuilder blXml(String blXml) {
        this.blXml = blXml;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder cdEncodingHashXmlVers(String cdEncodingHashXmlVers) {
        this.cdEncodingHashXmlVers = cdEncodingHashXmlVers;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder cdVersioneXml(String cdVersioneXml) {
        this.cdVersioneXml = cdVersioneXml;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder dsAlgoHashXmlVers(String dsAlgoHashXmlVers) {
        this.dsAlgoHashXmlVers = dsAlgoHashXmlVers;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder dsHashXmlVers(String dsHashXmlVers) {
        this.dsHashXmlVers = dsHashXmlVers;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder dsUrnXmlVers(String dsUrnXmlVers) {
        this.dsUrnXmlVers = dsUrnXmlVers;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder idStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder tiXmlDati(String tiXmlDati) {
        this.tiXmlDati = tiXmlDati;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder flCanonicalized(String flCanonicalized) {
        this.flCanonicalized = flCanonicalized;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder vrsDatiSessioneVers(Optional<VrsDatiSessioneVers> vrsDatiSessioneVers) {
        this.vrsDatiSessioneVers = vrsDatiSessioneVers;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder vrsDatiSessioneVersKo(Optional<VrsDatiSessioneVersKo> vrsDatiSessioneVersKo) {
        this.vrsDatiSessioneVersKo = vrsDatiSessioneVersKo;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder vrsUrnXmlSessioneVers(List<VrsUrnXmlSessioneVers> vrsUrnXmlSessioneVers) {
        this.vrsUrnXmlSessioneVers = vrsUrnXmlSessioneVers;
        return this;
    }

    public VrsXmlDatiSessioneVersBuilder vrsUrnXmlSessioneVersKo(
            List<VrsUrnXmlSessioneVersKo> vrsUrnXmlSessioneVersKo) {
        this.vrsUrnXmlSessioneVersKo = vrsUrnXmlSessioneVersKo;
        return this;
    }

    public String getDsUrnXmlVers() {
        return dsUrnXmlVers;
    }

    public VrsXmlDatiSessioneVers buildVrsXmlDatiSessioneVers() {
        VrsXmlDatiSessioneVers vrsXmlDatiSessioneVers = new VrsXmlDatiSessioneVers();
        vrsXmlDatiSessioneVers.setBlXml(blXml);
        vrsXmlDatiSessioneVers.setCdEncodingHashXmlVers(cdEncodingHashXmlVers);
        vrsXmlDatiSessioneVers.setCdVersioneXml(cdVersioneXml);
        vrsXmlDatiSessioneVers.setDsAlgoHashXmlVers(dsAlgoHashXmlVers);
        vrsXmlDatiSessioneVers.setDsHashXmlVers(dsHashXmlVers);
        vrsXmlDatiSessioneVers.setDsUrnXmlVers(dsUrnXmlVers);
        vrsXmlDatiSessioneVers.setIdStrut(idStrut);
        vrsXmlDatiSessioneVers.setTiXmlDati(tiXmlDati);
        vrsXmlDatiSessioneVers.setFlCanonicalized(flCanonicalized);
        vrsXmlDatiSessioneVers.setVrsDatiSessioneVers(vrsDatiSessioneVers.get());
        vrsXmlDatiSessioneVers.setVrsUrnXmlSessioneVers(vrsUrnXmlSessioneVers);
        return vrsXmlDatiSessioneVers;
    }

    public VrsXmlDatiSessioneVersKo buildVrsXmlDatiSessioneVersKo() {
        VrsXmlDatiSessioneVersKo vrsXmlDatiSessioneVers = new VrsXmlDatiSessioneVersKo();
        vrsXmlDatiSessioneVers.setBlXml(blXml);
        vrsXmlDatiSessioneVers.setCdEncodingHashXmlVers(cdEncodingHashXmlVers);
        vrsXmlDatiSessioneVers.setCdVersioneXml(cdVersioneXml);
        vrsXmlDatiSessioneVers.setDsAlgoHashXmlVers(dsAlgoHashXmlVers);
        vrsXmlDatiSessioneVers.setDsHashXmlVers(dsHashXmlVers);
        vrsXmlDatiSessioneVers.setDsUrnXmlVers(dsUrnXmlVers);
        vrsXmlDatiSessioneVers.setIdStrut(idStrut);
        vrsXmlDatiSessioneVers.setTiXmlDati(tiXmlDati);
        vrsXmlDatiSessioneVers.setFlCanonicalized(flCanonicalized);
        vrsXmlDatiSessioneVers.setVrsDatiSessioneVersKo(vrsDatiSessioneVersKo.get());
        vrsXmlDatiSessioneVers.setVrsUrnXmlSessioneVersKo(vrsUrnXmlSessioneVersKo);
        return vrsXmlDatiSessioneVers;
    }
}
