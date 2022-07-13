package it.eng.parer.entity.constraint;

/**
 * MON_CONTA_SES_UPD_UD_KO's constraint
 *
 * @author sinatti_s
 */
public final class MonContaSesUpdUdKo {

    private MonContaSesUpdUdKo() {
    }

    /**
     * Stato Update KO
     * 
     * ti_stato_udp_ud_ko IN ('NON_RISOLUBILE', 'NON_VERIFICATO', 'RISOLTO', 'VERIFICATO')
     */
    public enum TiStatoUdpUdKoMonContaSesUpdUdKo {
        NON_RISOLUBILE, NON_VERIFICATO, RISOLTO, VERIFICATO
    }

}