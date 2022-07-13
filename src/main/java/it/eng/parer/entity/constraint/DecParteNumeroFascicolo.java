package it.eng.parer.entity.constraint;

/**
 * DecParteNumeroFascicolo's constraint
 *
 * @author gilioli_p
 */
public final class DecParteNumeroFascicolo {

    private DecParteNumeroFascicolo() {
    }

    public enum TiCharParte {
        ALFABETICO, ALFANUMERICO, GENERICO, NUMERICO, NUMERICO_GENERICO, NUMERI_ROMANI, PARTE_GENERICO
    }

    public enum TiPadParte {
        FORMAT_CLASSIF, NO_RIEMPI, RIEMPI_0_A_SX, RIEMPI_SPAZIO_DX
    }

    public enum TiParte {
        ANNO, CLASSIF, PROGR_FASC, PROGR_SUB_FASC
    }

}
