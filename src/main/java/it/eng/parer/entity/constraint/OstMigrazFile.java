package it.eng.parer.entity.constraint;

/**
 *
 * @author Gilioli_P
 */
public final class OstMigrazFile {

    private OstMigrazFile() {
    }

    public enum TiStatoCor {
        DA_MIGRARE, ERRORE_NORMALIZ, MIGRATO, MIGRAZ_IN_CORSO, MIGRAZ_IN_ERRORE
    }

}
