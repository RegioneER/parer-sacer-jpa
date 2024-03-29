package it.eng.parer.entity.constraint;

/**
 * ARO_UNITA_DOCs constraint
 *
 * @author sinatti_s
 */
public final class AroUnitaDoc {

    private AroUnitaDoc() {
    }

    /**
     * Stato UD elenco vers
     *
     */
    public enum TiStatoUdElencoVers {
        IN_ATTESA_MEMORIZZAZIONE, IN_ATTESA_SCHED, IN_CODA_JMS_INDICE_AIP_DA_ELAB, IN_CODA_JMS_VERIFICA_FIRME_DT_VERS,
        IN_ELENCO_APERTO, IN_ELENCO_CHIUSO, IN_ELENCO_COMPLETATO, IN_ELENCO_CON_ELENCO_INDICI_AIP_CREATO,
        IN_ELENCO_CON_ELENCO_INDICI_AIP_ERR_MARCA, IN_ELENCO_CON_ELENCO_INDICI_AIP_FIRMATO,
        IN_ELENCO_CON_FIRME_VERIFICATE_DT_VERS, IN_ELENCO_CON_INDICI_AIP_GENERATI, IN_ELENCO_DA_CHIUDERE,
        IN_ELENCO_IN_CODA_INDICE_AIP, IN_ELENCO_VALIDATO, NON_SELEZ_SCHED
    }
}
