package it.eng.parer.entity.builder;

import it.eng.parer.entity.VrsDatiSessioneVersKo;
import it.eng.parer.entity.VrsFileSessioneKo;

import java.math.BigDecimal;

public final class VrsFileSessioneBuilder {
    private BigDecimal idStrut;
    private String nmFileSessione;
    private BigDecimal pgFileSessione;
    private String tiStatoFileSessione;
    private VrsDatiSessioneVersKo vrsDatiSessioneVersKo;

    private VrsFileSessioneBuilder() {
    }

    public static VrsFileSessioneBuilder builder() {
        return new VrsFileSessioneBuilder();
    }

    public VrsFileSessioneBuilder idStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
        return this;
    }

    public VrsFileSessioneBuilder nmFileSessione(String nmFileSessione) {
        this.nmFileSessione = nmFileSessione;
        return this;
    }

    public VrsFileSessioneBuilder pgFileSessione(BigDecimal pgFileSessione) {
        this.pgFileSessione = pgFileSessione;
        return this;
    }

    public VrsFileSessioneBuilder tiStatoFileSessione(String tiStatoFileSessione) {
        this.tiStatoFileSessione = tiStatoFileSessione;
        return this;
    }

    public VrsFileSessioneBuilder vrsDatiSessioneVersKo(VrsDatiSessioneVersKo vrsDatiSessioneVersKo) {
        this.vrsDatiSessioneVersKo = vrsDatiSessioneVersKo;
        return this;
    }

    public VrsFileSessioneKo buildVrsFileSessioneKo() {
        VrsFileSessioneKo vrsFileSessione = new VrsFileSessioneKo();
        vrsFileSessione.setIdStrut(idStrut);
        vrsFileSessione.setNmFileSessione(nmFileSessione);
        vrsFileSessione.setPgFileSessione(pgFileSessione);
        vrsFileSessione.setTiStatoFileSessione(tiStatoFileSessione);
        vrsFileSessione.setVrsDatiSessioneVersKo(vrsDatiSessioneVersKo);
        return vrsFileSessione;
    }
}
