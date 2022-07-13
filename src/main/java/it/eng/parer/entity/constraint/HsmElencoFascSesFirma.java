package it.eng.parer.entity.constraint;

/**
 * HsmElencoFascSesFirma constraint
 *
 * @author DiLorenzo_F
 */
public final class HsmElencoFascSesFirma {

    private HsmElencoFascSesFirma() {
    }

    /**
     * ti_esito_firma_elenco_fasc IN ('DA_FARE', 'IN_ERRORE', 'OK')
     */
    public enum TiEsitoFirmaElencoFasc {
        DA_FARE, IN_ERRORE, OK
    }
}
