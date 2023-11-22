package it.eng.parer.entity.constraint;

/**
 * ARO_UPD_DATI_SPEC_UNITA_DOC's constraint
 *
 * @author sinatti_s
 */
public final class AroUpdDatiSpecUnitaDoc {

    private AroUpdDatiSpecUnitaDoc() {
    }

    /**
     * Uso vers. XSD
     * 
     * ti_uso_xsd IN ('MIGRAZ', 'VERS')
     */
    public enum TiUsoXsdAroUpdDatiSpecUnitaDoc {
        MIGRAZ, VERS
    }

    /**
     * Tipo entita SACER
     * 
     * ti_entita_sacer IN ('UPD_COMP', 'UPD_DOC', 'UPD_UNI_DOC')
     */
    public enum TiEntitaAroUpdDatiSpecUnitaDoc {
        UPD_COMP, UPD_DOC, UPD_UNI_DOC
    }
}