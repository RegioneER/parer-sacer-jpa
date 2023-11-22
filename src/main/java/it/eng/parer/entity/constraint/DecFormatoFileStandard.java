package it.eng.parer.entity.constraint;

/**
 * DecFormatoFileStandard constraint
 *
 * @author Gilioli_P
 */
public final class DecFormatoFileStandard {

    private DecFormatoFileStandard() {
    }

    /**
     * ti_esito_contr_formato IN ('GESTITO', 'IDONEO', 'DEPRECATO')
     */
    public enum TiEsitoControFormato {
        GESTITO, IDONEO, DEPRECATO
    }

}
