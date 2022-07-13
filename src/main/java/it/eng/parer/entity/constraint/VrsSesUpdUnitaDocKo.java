package it.eng.parer.entity.constraint;

/**
 * VRS_SES_UPD_UNITA_DOC_KO constraint
 *
 * @author sinatti_s
 */
public final class VrsSesUpdUnitaDocKo {

    private VrsSesUpdUnitaDocKo() {
    }

    /**
     * Stato sessione ti_stato_ses_upd_ko IN ('NON_RISOLUBILE', 'NON_VERIFICATO', 'RISOLTO', 'VERIFICATO')
     */
    public enum TiStatoSesUpdKo {
        NON_RISOLUBILE, NON_VERIFICATO, RISOLTO, VERIFICATO
    }
}