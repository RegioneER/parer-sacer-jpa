package it.eng.parer.entity.constraint;

/**
 * HsmSessioneFirma constraint
 *
 * @author DiLorenzo_F
 */
public final class HsmSessioneFirma {

    private HsmSessioneFirma() {
    }

    /**
     * ti_sessione_firma IN ('ELENCHI', 'ELENCHI_FASC', 'ELENCHI_INDICI_AIP_FASC', 'ELENCO_INDICI_AIP', 'SERIE')
     */
    public enum TiSessioneFirma {
        ELENCHI, SERIE, ELENCO_INDICI_AIP, ELENCHI_FASC, ELENCHI_INDICI_AIP_FASC
    }

    /**
     * ti_esito_sessione_firma IN ('ERRORE', 'OK', 'WARNING')
     */
    public enum TiEsitoSessioneFirma {
        OK, WARNING, ERRORE
    }
}
