package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class MonVContaUdDocCompId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.aaKeyUnitaDoc);
        hash = 83 * hash + Objects.hashCode(this.dtRifConta);
        hash = 83 * hash + Objects.hashCode(this.idRegistroUnitaDoc);
        hash = 83 * hash + Objects.hashCode(this.idStrut);
        hash = 83 * hash + Objects.hashCode(this.idSubStrut);
        hash = 83 * hash + Objects.hashCode(this.idTipoDocPrincipale);
        hash = 83 * hash + Objects.hashCode(this.idTipoUnitaDoc);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MonVContaUdDocCompId other = (MonVContaUdDocCompId) obj;
        if (!Objects.equals(this.aaKeyUnitaDoc, other.aaKeyUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.dtRifConta, other.dtRifConta)) {
            return false;
        }
        if (!Objects.equals(this.idRegistroUnitaDoc, other.idRegistroUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.idStrut, other.idStrut)) {
            return false;
        }
        if (!Objects.equals(this.idSubStrut, other.idSubStrut)) {
            return false;
        }
        if (!Objects.equals(this.idTipoDocPrincipale, other.idTipoDocPrincipale)) {
            return false;
        }
        if (!Objects.equals(this.idTipoUnitaDoc, other.idTipoUnitaDoc)) {
            return false;
        }
        return true;
    }

    private BigDecimal aaKeyUnitaDoc;

    @Column(name = "AA_KEY_UNITA_DOC")
    public BigDecimal getAaKeyUnitaDoc() {
        return aaKeyUnitaDoc;
    }

    public void setAaKeyUnitaDoc(BigDecimal aaKeyUnitaDoc) {
        this.aaKeyUnitaDoc = aaKeyUnitaDoc;
    }

    private Date dtRifConta;

    @Column(name = "DT_RIF_CONTA")
    public Date getDtRifConta() {
        return dtRifConta;
    }

    public void setDtRifConta(Date dtRifConta) {
        this.dtRifConta = dtRifConta;
    }

    private BigDecimal idRegistroUnitaDoc;

    @Column(name = "ID_REGISTRO_UNITA_DOC")
    public BigDecimal getIdRegistroUnitaDoc() {
        return idRegistroUnitaDoc;
    }

    public void setIdRegistroUnitaDoc(BigDecimal idRegistroUnitaDoc) {
        this.idRegistroUnitaDoc = idRegistroUnitaDoc;
    }

    private BigDecimal idStrut;

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    private BigDecimal idSubStrut;

    @Column(name = "ID_SUB_STRUT")
    public BigDecimal getIdSubStrut() {
        return idSubStrut;
    }

    public void setIdSubStrut(BigDecimal idSubStrut) {
        this.idSubStrut = idSubStrut;
    }

    private BigDecimal idTipoDocPrincipale;

    @Column(name = "ID_TIPO_DOC_PRINCIPALE")
    public BigDecimal getIdTipoDocPrincipale() {
        return idTipoDocPrincipale;
    }

    public void setIdTipoDocPrincipale(BigDecimal idTipoDocPrincipale) {
        this.idTipoDocPrincipale = idTipoDocPrincipale;
    }

    private BigDecimal idTipoUnitaDoc;

    @Column(name = "ID_TIPO_UNITA_DOC")
    public BigDecimal getIdTipoUnitaDoc() {
        return idTipoUnitaDoc;
    }

    public void setIdTipoUnitaDoc(BigDecimal idTipoUnitaDoc) {
        this.idTipoUnitaDoc = idTipoUnitaDoc;
    }
}
