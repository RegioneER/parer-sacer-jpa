package it.eng.parer.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the ARO_ARCHIV_SEC database table.
 * 
 */
@Entity
@Table(name = "ARO_ARCHIV_SEC")
public class AroArchivSec implements Serializable {
    private static final long serialVersionUID = 1L;
    private long idArchivSec;
    private String cdFascic;
    private String cdSottofascic;
    private String dsClassif;
    private String dsOggettoFascic;
    private String dsOggettoSottofascic;
    private BigDecimal idStrut;
    private AroUnitaDoc aroUnitaDoc;

    public AroArchivSec() {
    }

    @Id
    @SequenceGenerator(name = "ARO_ARCHIV_SEC_IDARCHIVSEC_GENERATOR", sequenceName = "SARO_ARCHIV_SEC", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ARO_ARCHIV_SEC_IDARCHIVSEC_GENERATOR")
    @Column(name = "ID_ARCHIV_SEC")
    public long getIdArchivSec() {
        return this.idArchivSec;
    }

    public void setIdArchivSec(long idArchivSec) {
        this.idArchivSec = idArchivSec;
    }

    @Column(name = "CD_FASCIC")
    public String getCdFascic() {
        return this.cdFascic;
    }

    public void setCdFascic(String cdFascic) {
        this.cdFascic = cdFascic;
    }

    @Column(name = "CD_SOTTOFASCIC")
    public String getCdSottofascic() {
        return this.cdSottofascic;
    }

    public void setCdSottofascic(String cdSottofascic) {
        this.cdSottofascic = cdSottofascic;
    }

    @Column(name = "DS_CLASSIF")
    public String getDsClassif() {
        return this.dsClassif;
    }

    public void setDsClassif(String dsClassif) {
        this.dsClassif = dsClassif;
    }

    @Column(name = "DS_OGGETTO_FASCIC")
    public String getDsOggettoFascic() {
        return this.dsOggettoFascic;
    }

    public void setDsOggettoFascic(String dsOggettoFascic) {
        this.dsOggettoFascic = dsOggettoFascic;
    }

    @Column(name = "DS_OGGETTO_SOTTOFASCIC")
    public String getDsOggettoSottofascic() {
        return this.dsOggettoSottofascic;
    }

    public void setDsOggettoSottofascic(String dsOggettoSottofascic) {
        this.dsOggettoSottofascic = dsOggettoSottofascic;
    }

    @Column(name = "ID_STRUT")
    public BigDecimal getIdStrut() {
        return this.idStrut;
    }

    public void setIdStrut(BigDecimal idStrut) {
        this.idStrut = idStrut;
    }

    // bi-directional many-to-one association to AroUnitaDoc
    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH }, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_UNITA_DOC")
    public AroUnitaDoc getAroUnitaDoc() {
        return this.aroUnitaDoc;
    }

    public void setAroUnitaDoc(AroUnitaDoc aroUnitaDoc) {
        this.aroUnitaDoc = aroUnitaDoc;
    }

}