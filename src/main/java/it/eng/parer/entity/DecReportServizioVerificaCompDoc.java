package it.eng.parer.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import it.eng.parer.entity.constraint.DecReportServizioVerificaCompDoc.TiFormatoServizioVerificaCompDoc;
import it.eng.parer.entity.constraint.DecReportServizioVerificaCompDoc.TiReportServizioVerificaCompDoc;

/**
 * The persistent class for the DEC_REPORT_SERVIZIO_VERIFICA_COMP_DOC database table.
 *
 */
@Entity
@Table(name = "DEC_REPORT_SERVIZIO_VERIFICA_COMP_DOC")
@NamedQuery(name = "DecReportServizioVerificaCompDoc.findAll", query = "SELECT f FROM DecReportServizioVerificaCompDoc f")
public class DecReportServizioVerificaCompDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long idReportServizioVerificaCompDoc;
    private DecServizioVerificaCompDoc decServizioVerificaCompDoc;
    private String blXslt;
    private TiReportServizioVerificaCompDoc tiReport;
    private TiFormatoServizioVerificaCompDoc tiFormato;

    public DecReportServizioVerificaCompDoc() {/* Hibernate */
    }

    @Id
    @SequenceGenerator(name = "DEC_REPORT_SERVIZIO_VERIFICA_COMP_DOC_ID_REPORT_SERVIZIO_VERIFICA_COMP_DOC_GENERATOR", sequenceName = "SDEC_REPORT_SERVIZIO_VERIFICA_COMP_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_REPORT_SERVIZIO_VERIFICA_COMP_DOC_ID_REPORT_SERVIZIO_VERIFICA_COMP_DOC_GENERATOR")
    @Column(name = "ID_REPORT_SERVIZIO_VERIFICA_COMP_DOC")
    public Long getIdReportServizioVerificaCompDoc() {
        return this.idReportServizioVerificaCompDoc;
    }

    public void setIdReportServizioVerificaCompDoc(Long idReportServizioVerificaCompDoc) {
        this.idReportServizioVerificaCompDoc = idReportServizioVerificaCompDoc;
    }

    @Lob
    @Column(name = "BL_XSLT")
    public String getBlXsltReport() {
        return this.blXslt;
    }

    public void setBlXsltReport(String blXslt) {
        this.blXslt = blXslt;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_REPORT")
    public TiReportServizioVerificaCompDoc getTiReport() {
        return this.tiReport;
    }

    public void setTiReport(TiReportServizioVerificaCompDoc tiReport) {
        this.tiReport = tiReport;
    }

    @ManyToOne
    @JoinColumn(name = "ID_SERVIZIO_VERIFICA_COMP_DOC")
    public DecServizioVerificaCompDoc getDecServizioVerificaCompDoc() {
        return this.decServizioVerificaCompDoc;
    }

    public void setDecServizioVerificaCompDoc(DecServizioVerificaCompDoc decServizioVerificaCompDoc) {
        this.decServizioVerificaCompDoc = decServizioVerificaCompDoc;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "TI_FORMATO")
    public TiFormatoServizioVerificaCompDoc getTiFormato() {
        return tiFormato;
    }

    public void setTiFormato(TiFormatoServizioVerificaCompDoc tiFormato) {
        this.tiFormato = tiFormato;
    }
}
