package it.eng.parer.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import it.eng.parer.entity.constraint.DecServizioVerificaCompDoc.CdServizioVerificaCompDoc;

/**
 * The persistent class for the DEC_SERVIZIO_VERIFICA_COMP_DOC database table.
 *
 */
@Entity
@Table(name = "DEC_SERVIZIO_VERIFICA_COMP_DOC")
@NamedQuery(name = "DecServizioVerificaCompDoc.findAll", query = "SELECT f FROM DecServizioVerificaCompDoc f")
public class DecServizioVerificaCompDoc implements Serializable {

    private static final long serialVersionUID = 1L;

    private long idServizioVerificaCompDoc;
    private CdServizioVerificaCompDoc cdServizio;
    private String nmVersione;
    private String dsServizioVerificaCompDoc;
    private List<DecReportServizioVerificaCompDoc> decReportServizioCompDocs;

    public DecServizioVerificaCompDoc() {
    }

    @Id
    @SequenceGenerator(name = "DEC_SERVIZIO_VERIFICA_COMP_DOC_ID_SERVIZIO_VERIFICA_COMP_DOC_GENERATOR", sequenceName = "SDEC_SERVIZIO_VERIFICA_COMP_DOC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DEC_SERVIZIO_VERIFICA_COMP_DOC_ID_SERVIZIO_VERIFICA_COMP_DOC_GENERATOR")
    @Column(name = "ID_SERVIZIO_VERIFICA_COMP_DOC")
    public long getIdServizioVerificaCompDoc() {
        return this.idServizioVerificaCompDoc;
    }

    public void setIdServizioVerificaCompDoc(long idServizioVerificaCompDoc) {
        this.idServizioVerificaCompDoc = idServizioVerificaCompDoc;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "CD_SERVIZIO")
    public CdServizioVerificaCompDoc getCdServizio() {
        return cdServizio;
    }

    public void setCdServizio(CdServizioVerificaCompDoc cdServizio) {
        this.cdServizio = cdServizio;
    }

    @Column(name = "NM_VERSIONE")
    public String getNmVersione() {
        return nmVersione;
    }

    public void setNmVersione(String nmVersione) {
        this.nmVersione = nmVersione;
    }

    @Column(name = "DS_SERVIZIO_VERIFICA_COMP_DOC")
    public String getDsServizioVerificaCompDoc() {
        return dsServizioVerificaCompDoc;
    }

    public void setDsServizioVerificaCompDoc(String dsServizioVerificaCompDoc) {
        this.dsServizioVerificaCompDoc = dsServizioVerificaCompDoc;
    }

    // bi-directional many-to-one association to DecReportServizioVerificaCompDoc
    @OneToMany(mappedBy = "decServizioVerificaCompDoc")
    public List<DecReportServizioVerificaCompDoc> getDecReportServizioVerificaCompDocs() {
        return decReportServizioCompDocs;
    }

    public void setDecReportServizioVerificaCompDocs(List<DecReportServizioVerificaCompDoc> decReportServizioCompDocs) {
        this.decReportServizioCompDocs = decReportServizioCompDocs;
    }
}
