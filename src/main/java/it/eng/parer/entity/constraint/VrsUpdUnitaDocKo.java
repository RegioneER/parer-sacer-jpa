package it.eng.parer.entity.constraint;

/**
 * VRS_UPD_UNITA_DOC_KO's constraint
 *
 * @author sinatti_s
 */
public final class VrsUpdUnitaDocKo {

    private VrsUpdUnitaDocKo() {
    }

    /**
     * Stato Ko
     * 
     * ti_stato_udp_ud_ko IN ('NON_RISOLUBILE', 'NON_VERIFICATO', 'VERIFICATO')
     */
    public enum TiStatoUdpUdKo {
        NON_RISOLUBILE, NON_VERIFICATO, VERIFICATO
    }

}