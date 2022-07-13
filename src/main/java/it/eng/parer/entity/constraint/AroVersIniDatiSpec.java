package it.eng.parer.entity.constraint;

/**
 * ARO_VERS_INI_DATI_SPEC's constraint
 *
 * @author sinatti_s
 */
public final class AroVersIniDatiSpec {

    private AroVersIniDatiSpec() {
    }

    /**
     * Uso vers. XSD
     * 
     * ti_uso_xsd IN ('MIGRAZ', 'VERS')
     */
    public enum TiUsoXsdAroVersIniDatiSpec {
        MIGRAZ, VERS
    }

    /**
     * Tipo entita SACER
     * 
     * ti_entita_sacer IN ('COMP', 'DOC', 'UNI_DOC')
     */
    public enum TiEntitaSacerAroVersIniDatiSpec {
        COMP, DOC, UNI_DOC
    }
}