package it.eng.parer.entity.constraint;

/**
 * VRS_ERR_UPD_UNITA_DOC_KO's constraint
 *
 * @author sinatti_s
 */
public final class VrsErrUpdUnitaDocKo {

    private VrsErrUpdUnitaDocKo() {
    }

    /**
     * Tipo errore
     * 
     * ti_err IN ('FATALE', 'WARNING')
     */
    public enum TiErrVrsErrUpdUnitaDocKo {
        FATALE, WARNING
    }

}