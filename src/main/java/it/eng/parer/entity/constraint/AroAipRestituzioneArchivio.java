package it.eng.parer.entity.constraint;

/**
 * ARO_AIP_RESTITUZIONE_ARCHIVIO's constraint
 *
 * @author DiLorenzo_F
 */
public final class AroAipRestituzioneArchivio {

    private AroAipRestituzioneArchivio() {
    }

    /**
     * Stato elaborazione
     * 
     * TI_STATO IN ('DA_ELABORARE', 'ESTRATTO','ERRORE')
     *
     */
    public enum TiStatoAroAipRa {
        DA_ELABORARE, ESTRATTO, ERRORE
    }

    /**
     * Stato elaborazione
     * 
     * TI_TIPOLOGIA_OGGETTO IN ('FASCICOLO', 'OGGETTO', 'SERIE', 'UD')
     *
     */
    public enum AroAipRaTipologiaOggetto {
        FASCICOLO, OGGETTO, SERIE, UD
    }
}