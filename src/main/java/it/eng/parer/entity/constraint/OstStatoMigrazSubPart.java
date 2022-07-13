package it.eng.parer.entity.constraint;

/**
 *
 * @author Gilioli_P
 */
public final class OstStatoMigrazSubPart {

    private OstStatoMigrazSubPart() {
    }

    public enum TiStato {
        DA_ELIMINARE, DA_MIGRARE, DA_NON_MIGRARE, ELIMINATA, FILE_DA_SCARICARE, MIGRATA, MIGRAZ_IN_CORSO,
        MIGRAZ_IN_ERRORE, MIGRAZ_COMPLETA, MIGRAZ_NON_COMPLETA, TBS_NON_ELIMINABILE, ERRORE_NORMALIZ,
        MIGRAZ_DA_CONTROLLARE // MEV#18420
    }

}
