/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.eng.parer.entity.constraint;

/**
 *
 * @author gilioli_p
 */
public final class MonContaSesUpdUd {

    private MonContaSesUpdUd() {
    }

    /**
     * Stato Update
     * 
     * ti_stato_udp_ud_ IN ('IN_ATTESA_SCHED', 'NON_SELEZ_SCHED', 'TOTALE')
     */
    public enum TiStatoUdpUdMonContaSesUpdUd {
        IN_ATTESA_SCHED, NON_SELEZ_SCHED, TOTALE
    }

}
