package it.eng.parer.entity.constraint;

/**
 * VRS_XML_SES_UPD_UNITA_DOC_ERR's constraint
 *
 * @author sinatti_s
 */
public final class VrsXmlSesUpdUnitaDocErr {

    private VrsXmlSesUpdUnitaDocErr() {
    }

    /**
     * Tipo XML
     * 
     * ti_xml IN ('RICHIESTA', 'RISPOSTA')
     */
    public enum TiXmlVrsXmlSesUpdUnitaDocErr {
        RICHIESTA, RISPOSTA
    }

}