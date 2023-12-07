package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class DecVFormatoFileDocId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.idStrut);
        hash = 41 * hash + Objects.hashCode(this.nmFormatoFileDoc);
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
        final DecVFormatoFileDocId other = (DecVFormatoFileDocId) obj;
        if (!Objects.equals(this.idStrut, other.idStrut)) {
            return false;
        }
        if (!Objects.equals(this.nmFormatoFileDoc, other.nmFormatoFileDoc)) {
            return false;
        }
        return true;
    }

    private BigDecimal idStrut;

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    private String nmFormatoFileDoc;

    @Column(name = "NM_FORMATO_FILE_DOC")
    public String getNmFormatoFileDoc() {
        return nmFormatoFileDoc;
    }

    public void setNmFormatoFileDoc(String nmFormatoFileDoc) {
        this.nmFormatoFileDoc = nmFormatoFileDoc;
    }
}
