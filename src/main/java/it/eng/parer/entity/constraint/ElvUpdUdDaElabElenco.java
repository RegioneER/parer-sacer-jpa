package it.eng.parer.entity.constraint;

/**
 * ELV_UD_VERS_DA_ELAB_ELENCO's constraint
 *
 * @author sinatti_s
 */
public final class ElvUpdUdDaElabElenco {

    private ElvUpdUdDaElabElenco() {
    }

    /**
     * Stato elenco
     * 
     * ti_stato_upd_elenco_vers IN ('IN_ATTESA_SCHED', 'NON_SELEZ_SCHED')
     */
    public enum ElvUpdUdDaElabTiStatoUpdElencoVers {
        IN_ATTESA_SCHED, NON_SELEZ_SCHED
    }

}