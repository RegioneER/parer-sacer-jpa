package it.eng.parer.entity.constraint;

/**
 * ElvStatoElencoVers constraint
 *
 * @author DiLorenzo_F
 */
public final class ElvStatoElencoVer {

    private ElvStatoElencoVer() {
    }

    public enum TiStatoElenco {
        APERTO, CHIUSO, COMPLETATO, DA_CHIUDERE, ELENCO_INDICI_AIP_CREATO, ELENCO_INDICI_AIP_ERR_MARCA,
        ELENCO_INDICI_AIP_FIRMATO, ELENCO_INDICI_AIP_FIRMA_IN_CORSO, FIRMA_IN_CORSO, FIRME_VERIFICATE_DT_VERS,
        INDICI_AIP_GENERATI, IN_CODA_INDICE_AIP, IN_CODA_JMS_INDICE_AIP_DA_ELAB, IN_CODA_JMS_VERIFICA_FIRME_DT_VERS,
        VALIDATO

    }
}
