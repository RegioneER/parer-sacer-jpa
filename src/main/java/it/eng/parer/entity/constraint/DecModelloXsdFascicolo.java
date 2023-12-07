package it.eng.parer.entity.constraint;

/**
 * DecModelloXsdFascicolo's constraint
 * 
 */
public final class DecModelloXsdFascicolo {

    private DecModelloXsdFascicolo() {
    }

    /**
     * Tipo modello Xsd fascicolo
     */
    public enum TiModelloXsd {
        FASCICOLO, PROFILO_GENERALE_FASCICOLO, PROFILO_ARCHIVISTICO_FASCICOLO, PROFILO_SPECIFICO_FASCICOLO,
        AIP_SELF_DESCRIPTION_MORE_INFO, AIP_UNISYNCRO, PROFILO_NORMATIVO_FASCICOLO
    }

    /**
     * Tipo uso modello Xsd fascicolo
     */
    public enum TiUsoModelloXsd {
        MIGRAZ, VERS
    }

}
