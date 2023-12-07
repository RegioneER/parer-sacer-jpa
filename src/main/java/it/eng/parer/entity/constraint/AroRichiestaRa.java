package it.eng.parer.entity.constraint;

/**
 * ARO_RICHIESTA_RA's constraint
 *
 * @author DiLorenzo_F
 */
public final class AroRichiestaRa {

    private AroRichiestaRa() {
    }

    /**
     * Stato richiesta
     * 
     * TI_STATO IN
     * ('CALCOLO_AIP_IN_CORSO','IN_ATTESA_ESTRAZIONE','ESTRAZIONE_IN_CORSO','ESTRATTO','VERIFICATO','ERRORE','ANNULLATO')
     *
     */
    public enum AroRichiestaTiStato {
        CALCOLO_AIP_IN_CORSO, IN_ATTESA_ESTRAZIONE, ESTRAZIONE_IN_CORSO, ESTRATTO, VERIFICATO, ERRORE, ANNULLATO,
        RESTITUITO
    }
}