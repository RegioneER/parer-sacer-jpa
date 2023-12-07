package it.eng.parer.viewEntity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable()
public class VrsVDocNonVerId implements Serializable {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.aaKeyUnitaDoc);
        hash = 29 * hash + Objects.hashCode(this.cdKeyDocVers);
        hash = 29 * hash + Objects.hashCode(this.cdKeyUnitaDoc);
        hash = 29 * hash + Objects.hashCode(this.cdRegistroKeyUnitaDoc);
        hash = 29 * hash + Objects.hashCode(this.flNonRisolub);
        hash = 29 * hash + Objects.hashCode(this.flVerif);
        hash = 29 * hash + Objects.hashCode(this.idStrut);
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
        final VrsVDocNonVerId other = (VrsVDocNonVerId) obj;
        if (!Objects.equals(this.cdKeyDocVers, other.cdKeyDocVers)) {
            return false;
        }
        if (!Objects.equals(this.cdKeyUnitaDoc, other.cdKeyUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.cdRegistroKeyUnitaDoc, other.cdRegistroKeyUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.flNonRisolub, other.flNonRisolub)) {
            return false;
        }
        if (!Objects.equals(this.flVerif, other.flVerif)) {
            return false;
        }
        if (!Objects.equals(this.aaKeyUnitaDoc, other.aaKeyUnitaDoc)) {
            return false;
        }
        if (!Objects.equals(this.idStrut, other.idStrut)) {
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

    private String cdKeyDocVers;

    @Column(name = "CD_KEY_DOC_VERS")
    public String getCdKeyDocVers() {
        return cdKeyDocVers;
    }

    public void setCdKeyDocVers(String cdKeyDocVers) {
        this.cdKeyDocVers = cdKeyDocVers;
    }

    private String cdKeyUnitaDoc;

    @Column(name = "CD_KEY_UNITA_DOC")
    public String getCdKeyUnitaDoc() {
        return cdKeyUnitaDoc;
    }

    public void setCdKeyUnitaDoc(String cdKeyUnitaDoc) {
        this.cdKeyUnitaDoc = cdKeyUnitaDoc;
    }

    private String cdRegistroKeyUnitaDoc;

    @Column(name = "CD_REGISTRO_KEY_UNITA_DOC")
    public String getCdRegistroKeyUnitaDoc() {
        return cdRegistroKeyUnitaDoc;
    }

    public void setCdRegistroKeyUnitaDoc(String cdRegistroKeyUnitaDoc) {
        this.cdRegistroKeyUnitaDoc = cdRegistroKeyUnitaDoc;
    }

    private String flNonRisolub;

    @Column(name = "FL_NON_RISOLUB", columnDefinition = "char(1)")
    public String getFlNonRisolub() {
        return flNonRisolub;
    }

    public void setFlNonRisolub(String flNonRisolub) {
        this.flNonRisolub = flNonRisolub;
    }

    private String flVerif;

    @Column(name = "FL_VERIF", columnDefinition = "char(1)")
    public String getFlVerif() {
        return flVerif;
    }

    public void setFlVerif(String flVerif) {
        this.flVerif = flVerif;
    }

    private BigDecimal idStrut;

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }
}
