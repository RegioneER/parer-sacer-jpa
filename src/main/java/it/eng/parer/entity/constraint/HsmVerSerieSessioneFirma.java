package it.eng.parer.entity.constraint;

/**
 * HsmVerSerieSessioneFirma constraint
 *
 * @author DiLorenzo_F
 */
public final class HsmVerSerieSessioneFirma {

    private HsmVerSerieSessioneFirma() {
    }

    /**
     * ti_esito_firma_ver_serie IN ('DA_FARE', 'IN_ERRORE', 'OK')
     */
    public enum TiEsitoFirmaVerSerie {
        DA_FARE, IN_ERRORE, OK
    }
}
