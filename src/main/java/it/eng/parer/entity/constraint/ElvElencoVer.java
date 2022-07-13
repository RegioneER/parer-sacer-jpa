package it.eng.parer.entity.constraint;

/**
 * ElvElencoVer constraint
 *
 * @author DiLorenzo_F
 */
public final class ElvElencoVer {

    private ElvElencoVer() {
    }

    /**
     * ti_mod_valid_elenco IN ('AUTOMATICA', 'MANUALE')
     */
    public enum TiModValidElenco {
        AUTOMATICA, MANUALE
    }

    /**
     * ti_valid_elenco IN ('FIRMA', 'NO_FIRMA', 'NO_INDICE')
     */
    public enum TiValidElenco {
        FIRMA, NO_FIRMA, NO_INDICE
    }
}
