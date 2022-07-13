package it.eng.parer.entity.constraint;

/**
 * VRS_SES_UPD_UNITA_DOC_KO constraint
 *
 * @author sinatti_s
 */
public final class VrsSesUpdUnitaDocErr {

    private VrsSesUpdUnitaDocErr() {
    }

    /**
     * Stato sessione ti_stato_ses IN ('NON_RISOLUBILE', 'NON_VERIFICATA', 'VERIFICATA')
     */
    public enum TiStatoSesVrsSesUpdUnitaDocErr {
        NON_RISOLUBILE, NON_VERIFICATA, VERIFICATA
    }
}