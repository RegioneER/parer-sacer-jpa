package it.eng.parer.entity.constraint;

/**
 * VRS_ERR_UPD_UNITA_DOC_KO's constraint
 *
 * @author sinatti_s
 */
public final class VrsErrSesUpdUnitaDocErr {

    private VrsErrSesUpdUnitaDocErr() {
    }

    /**
     * Tipo errore
     * 
     * ti_err IN ('FATALE', 'WARNING')
     */
    public enum TiErrVrsErrSesUpdUnitaDocErr {
        FATALE, WARNING
    }

}