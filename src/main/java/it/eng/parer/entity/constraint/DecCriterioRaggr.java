package it.eng.parer.entity.constraint;

/**
 * DecCriterioRaggr constraint
 *
 * @author DiLorenzo_F
 */
public final class DecCriterioRaggr {

    private DecCriterioRaggr() {
    }

    /**
     * ti_mod_valid_elenco IN ('AUTOMATICA', 'MANUALE')
     */
    public enum TiModValidElencoCriterio {
        AUTOMATICA, MANUALE
    }

    /**
     * ti_valid_elenco IN ('FIRMA', 'NO_FIRMA', 'NO_INDICE')
     */
    public enum TiValidElencoCriterio {
        FIRMA, NO_FIRMA, NO_INDICE
    }
}
