package it.eng.parer.entity.constraint;

/**
 * ARO_XML_UPD_UNITA_DOC's constraint
 *
 * @author sinatti_s
 */
public final class AroXmlUpdUnitaDoc {

    private AroXmlUpdUnitaDoc() {
    }

    /**
     * Tipo XML UD
     * 
     * ti_xml_upd_unita_doc IN ('RICHIESTA', 'RISPOSTA')
     */
    public enum TiXmlUpdUnitaDoc {
        RICHIESTA, RISPOSTA
    }

}