package it.eng.parer.entity.constraint;

/**
 * VRS_XML_SES_UPD_UNITA_DOC_KO's constraint
 *
 * @author sinatti_s
 */
public final class VrsXmlSesUpdUnitaDocKo {

    private VrsXmlSesUpdUnitaDocKo() {
    }

    /**
     * Tipo XML
     * 
     * ti_xml IN ('RICHIESTA', 'RISPOSTA')
     */
    public enum TiXmlVrsXmlSesUpdUnitaDocKo {
        RICHIESTA, RISPOSTA
    }

}