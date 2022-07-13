package it.eng.parer.entity.constraint;

/**
 *
 * @author Iacolucci_M
 */
public final class OstNoMigrazFile {

    private OstNoMigrazFile() {
    }

    public enum TiCausaleNoMigraz {
        CONTENUTO_NON_SELEZIONATO, FILE_NON_BLOB, SUPPORTO_NON_FILE
    }

    public enum TiSupportoComp {
        FILE
    }

    public enum TiSaveFile {
        BLOB
    }

}
