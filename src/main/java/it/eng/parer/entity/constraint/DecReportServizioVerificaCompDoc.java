package it.eng.parer.entity.constraint;

public final class DecReportServizioVerificaCompDoc {

    private DecReportServizioVerificaCompDoc() {
    }

    public enum TiReportServizioVerificaCompDoc {
        CRYPTO, SIMPLE, DETAILED, DIAG_DATA, ORIG
    }

    public enum TiFormatoServizioVerificaCompDoc {
        XML, HTML, PDF
    }

}
