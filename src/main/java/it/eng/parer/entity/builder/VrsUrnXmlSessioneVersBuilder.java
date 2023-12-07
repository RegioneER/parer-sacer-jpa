package it.eng.parer.entity.builder;

import it.eng.parer.entity.VrsUrnXmlSessioneVers;
import it.eng.parer.entity.VrsUrnXmlSessioneVersKo;
import it.eng.parer.entity.VrsXmlDatiSessioneVers;
import it.eng.parer.entity.VrsXmlDatiSessioneVersKo;
import it.eng.parer.entity.constraint.VrsUrnXmlSessioneVers.TiUrnXmlSessioneVers;

import java.math.BigDecimal;
import java.util.Optional;

public final class VrsUrnXmlSessioneVersBuilder {
    private String dsUrn;
    private TiUrnXmlSessioneVers tiUrn;
    private Optional<VrsXmlDatiSessioneVers> vrsXmlDatiSessioneVers;
    private Optional<VrsXmlDatiSessioneVersKo> vrsXmlDatiSessioneVersKo;
    private BigDecimal idStrut;

    private VrsUrnXmlSessioneVersBuilder() {
    }

    public static VrsUrnXmlSessioneVersBuilder builder() {
        return new VrsUrnXmlSessioneVersBuilder();
    }

    public VrsUrnXmlSessioneVersBuilder dsUrn(String dsUrn) {
        this.dsUrn = dsUrn;
        return this;
    }

    public VrsUrnXmlSessioneVersBuilder tiUrn(TiUrnXmlSessioneVers tiUrn) {
        this.tiUrn = tiUrn;
        return this;
    }

    public VrsUrnXmlSessioneVersBuilder vrsXmlDatiSessioneVers(
            Optional<VrsXmlDatiSessioneVers> vrsXmlDatiSessioneVers) {
        this.vrsXmlDatiSessioneVers = vrsXmlDatiSessioneVers;
        return this;
    }

    public VrsUrnXmlSessioneVersBuilder vrsXmlDatiSessioneVersKo(
            Optional<VrsXmlDatiSessioneVersKo> vrsXmlDatiSessioneVersKo) {
        this.vrsXmlDatiSessioneVersKo = vrsXmlDatiSessioneVersKo;
        return this;
    }

    public VrsUrnXmlSessioneVersBuilder idStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
        return this;
    }

    public VrsUrnXmlSessioneVers buildVrsUrnXmlSessioneVers() {
        VrsUrnXmlSessioneVers vrsUrnXmlSessioneVers = new VrsUrnXmlSessioneVers();
        vrsUrnXmlSessioneVers.setDsUrn(dsUrn);
        vrsUrnXmlSessioneVers.setTiUrn(tiUrn);
        vrsUrnXmlSessioneVers.setVrsXmlDatiSessioneVers(vrsXmlDatiSessioneVers.get());
        return vrsUrnXmlSessioneVers;
    }

    public VrsUrnXmlSessioneVersKo buildVrsUrnXmlSessioneVersKo() {
        VrsUrnXmlSessioneVersKo vrsUrnXmlSessioneVers = new VrsUrnXmlSessioneVersKo();
        vrsUrnXmlSessioneVers.setDsUrn(dsUrn);
        vrsUrnXmlSessioneVers.setTiUrn(tiUrn);
        vrsUrnXmlSessioneVers.setIdStrut(idStrut);
        vrsUrnXmlSessioneVers.setVrsXmlDatiSessioneVersKo(vrsXmlDatiSessioneVersKo.get());
        return vrsUrnXmlSessioneVers;
    }
}
