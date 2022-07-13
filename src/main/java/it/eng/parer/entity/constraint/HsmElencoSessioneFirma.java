package it.eng.parer.entity.constraint;

/**
 * HsmElencoSessioneFirma constraint
 *
 * @author DiLorenzo_F
 */
public final class HsmElencoSessioneFirma {

    private HsmElencoSessioneFirma() {
    }

    /**
     * ti_esito_firma_elenco IN ('DA_FARE', 'IN_ERRORE', 'OK')
     */
    public enum TiEsitoFirmaElenco {
        DA_FARE, IN_ERRORE, OK
    }
}
